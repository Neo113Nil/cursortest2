package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryUUID;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.android.core.ContextUtils;
import io.sentry.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class SentryFrameMetricsCollector implements Application.ActivityLifecycleCallbacks {
    private final BuildInfoProvider buildInfoProvider;
    private Choreographer choreographer;
    private Field choreographerLastFrameTimeField;
    private WeakReference<Window> currentWindow;
    private Window.OnFrameMetricsAvailableListener frameMetricsAvailableListener;
    private Handler handler;
    private boolean isAvailable;
    private long lastFrameEndNanos;
    private long lastFrameStartNanos;
    private final Map<String, FrameMetricsCollectorListener> listenerMap;
    private final ILogger logger;
    private final Set<Window> trackedWindows;
    private final WindowFrameMetricsManager windowFrameMetricsManager;
    private static final long oneSecondInNanos = TimeUnit.SECONDS.toNanos(1);
    private static final long frozenFrameThresholdNanos = TimeUnit.MILLISECONDS.toNanos(700);

    public interface FrameMetricsCollectorListener {
        void onFrameMetricCollected(long j, long j3, long j7, long j8, boolean z4, boolean z7, float f7);
    }

    public interface WindowFrameMetricsManager {
        default void addOnFrameMetricsAvailableListener(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void removeOnFrameMetricsAvailableListener(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public SentryFrameMetricsCollector(Context context, SentryOptions sentryOptions, BuildInfoProvider buildInfoProvider) {
        this(context, sentryOptions, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.1
        });
    }

    private long getFrameCpuDuration(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
    }

    private long getFrameStartTimestamp(FrameMetrics frameMetrics) {
        return this.buildInfoProvider.getSdkInfoVersion() >= 26 ? frameMetrics.getMetric(10) : getLastKnownFrameStartTimeNanos();
    }

    public static boolean isFrozen(long j) {
        return j > frozenFrameThresholdNanos;
    }

    public static boolean isSlow(long j, long j3) {
        return j > j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(ILogger iLogger, Thread thread, Throwable th) {
        iLogger.log(SentryLevel.ERROR, "Error during frames measurements.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ILogger iLogger) {
        try {
            this.choreographer = Choreographer.getInstance();
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(BuildInfoProvider buildInfoProvider, Window window, FrameMetrics frameMetrics, int i7) {
        float refreshRate;
        Display display;
        long nanoTime = System.nanoTime();
        if (buildInfoProvider.getSdkInfoVersion() >= 30) {
            display = window.getContext().getDisplay();
            refreshRate = display.getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        float f7 = oneSecondInNanos;
        long frameCpuDuration = getFrameCpuDuration(frameMetrics);
        long max = Math.max(0L, frameCpuDuration - ((long) (f7 / refreshRate)));
        long frameStartTimestamp = getFrameStartTimestamp(frameMetrics);
        if (frameStartTimestamp < 0) {
            frameStartTimestamp = nanoTime - frameCpuDuration;
        }
        long max2 = Math.max(frameStartTimestamp, this.lastFrameEndNanos);
        if (max2 == this.lastFrameStartNanos) {
            return;
        }
        this.lastFrameStartNanos = max2;
        this.lastFrameEndNanos = max2 + frameCpuDuration;
        boolean isSlow = isSlow(frameCpuDuration, (long) (f7 / (refreshRate - 1.0f)));
        boolean z4 = isSlow && isFrozen(frameCpuDuration);
        Iterator<FrameMetricsCollectorListener> it = this.listenerMap.values().iterator();
        while (it.hasNext()) {
            it.next().onFrameMetricCollected(max2, this.lastFrameEndNanos, frameCpuDuration, max, isSlow, z4, refreshRate);
            frameCpuDuration = frameCpuDuration;
        }
    }

    private void setCurrentWindow(Window window) {
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != window) {
            this.currentWindow = new WeakReference<>(window);
            trackCurrentWindow();
        }
    }

    private void stopTrackingWindow(Window window) {
        if (this.trackedWindows.contains(window)) {
            if (this.buildInfoProvider.getSdkInfoVersion() >= 24) {
                try {
                    this.windowFrameMetricsManager.removeOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener);
                } catch (Exception e7) {
                    this.logger.log(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", e7);
                }
            }
            this.trackedWindows.remove(window);
        }
    }

    private void trackCurrentWindow() {
        WeakReference<Window> weakReference = this.currentWindow;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.isAvailable || this.trackedWindows.contains(window) || this.listenerMap.isEmpty() || this.buildInfoProvider.getSdkInfoVersion() < 24 || this.handler == null) {
            return;
        }
        this.trackedWindows.add(window);
        this.windowFrameMetricsManager.addOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener, this.handler);
    }

    public long getLastKnownFrameStartTimeNanos() {
        Field field;
        Choreographer choreographer = this.choreographer;
        if (choreographer == null || (field = this.choreographerLastFrameTimeField) == null) {
            return -1L;
        }
        try {
            Long l7 = (Long) field.get(choreographer);
            if (l7 != null) {
                return l7.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        setCurrentWindow(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        stopTrackingWindow(activity.getWindow());
        WeakReference<Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.currentWindow = null;
    }

    public String startCollection(FrameMetricsCollectorListener frameMetricsCollectorListener) {
        if (!this.isAvailable) {
            return null;
        }
        String generateSentryId = SentryUUID.generateSentryId();
        this.listenerMap.put(generateSentryId, frameMetricsCollectorListener);
        trackCurrentWindow();
        return generateSentryId;
    }

    public void stopCollection(String str) {
        if (this.isAvailable) {
            if (str != null) {
                this.listenerMap.remove(str);
            }
            WeakReference<Window> weakReference = this.currentWindow;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.listenerMap.isEmpty()) {
                return;
            }
            stopTrackingWindow(window);
        }
    }

    public SentryFrameMetricsCollector(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this(context, iLogger, buildInfoProvider, new WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.2
        });
    }

    public SentryFrameMetricsCollector(Context context, SentryOptions sentryOptions, BuildInfoProvider buildInfoProvider, WindowFrameMetricsManager windowFrameMetricsManager) {
        this(context, sentryOptions.getLogger(), buildInfoProvider, windowFrameMetricsManager);
    }

    public SentryFrameMetricsCollector(Context context, ILogger iLogger, final BuildInfoProvider buildInfoProvider, WindowFrameMetricsManager windowFrameMetricsManager) {
        this.trackedWindows = new CopyOnWriteArraySet();
        this.listenerMap = new ConcurrentHashMap();
        this.isAvailable = false;
        this.lastFrameStartNanos = 0L;
        this.lastFrameEndNanos = 0L;
        Context context2 = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.windowFrameMetricsManager = (WindowFrameMetricsManager) Objects.requireNonNull(windowFrameMetricsManager, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && buildInfoProvider.getSdkInfoVersion() >= 24) {
            this.isAvailable = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new L4.a(iLogger, 1));
            handlerThread.start();
            this.handler = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new K5.a(20, this, iLogger));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.choreographerLastFrameTimeField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                iLogger.log(SentryLevel.ERROR, "Unable to get the frame timestamp from the choreographer: ", e7);
            }
            this.frameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.d
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
                    SentryFrameMetricsCollector.this.lambda$new$2(buildInfoProvider, window, frameMetrics, i7);
                }
            };
        }
    }
}

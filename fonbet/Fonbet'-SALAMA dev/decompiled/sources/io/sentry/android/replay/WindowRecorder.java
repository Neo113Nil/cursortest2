package io.sentry.android.replay;

import Y4.D;
import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import f6.InterfaceC1109b;
import g6.AbstractC1159h;
import g6.AbstractC1165n;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class WindowRecorder implements Recorder, OnRootViewsChangedListener {
    private static final String TAG = "WindowRecorder";
    private final InterfaceC1109b capturer$delegate;
    private ScheduledFuture<?> capturingTask;
    private final AtomicBoolean isRecording;
    private Point lastKnownWindowSize;
    private final MainLooperHandler mainLooperHandler;
    private final SentryOptions options;
    private ScreenshotRecorder recorder;
    private final ScheduledExecutorService replayExecutor;
    private final ArrayList<WeakReference<View>> rootViews;
    private final AutoClosableReentrantLock rootViewsLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;
    private final WindowCallback windowCallback;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class RecorderExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            h.e(runnable, "r");
            StringBuilder sb = new StringBuilder("SentryWindowRecorder-");
            int i7 = this.cnt;
            this.cnt = i7 + 1;
            sb.append(i7);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public WindowRecorder(SentryOptions sentryOptions, ScreenshotRecorderCallback screenshotRecorderCallback, WindowCallback windowCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService) {
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(windowCallback, "windowCallback");
        h.e(mainLooperHandler, "mainLooperHandler");
        h.e(scheduledExecutorService, "replayExecutor");
        this.options = sentryOptions;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.windowCallback = windowCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = scheduledExecutorService;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.lastKnownWindowSize = new Point();
        this.rootViewsLock = new AutoClosableReentrantLock();
        this.capturer$delegate = D.C(WindowRecorder$capturer$2.INSTANCE);
    }

    private final ScheduledExecutorService getCapturer() {
        return (ScheduledExecutorService) this.capturer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$1(WindowRecorder windowRecorder) {
        h.e(windowRecorder, "this$0");
        ScreenshotRecorder screenshotRecorder = windowRecorder.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.capture();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        reset();
        stop();
        ScheduledExecutorService capturer = getCapturer();
        h.d(capturer, "capturer");
        ExecutorsKt.gracefullyShutdown(capturer, this.options);
    }

    public final void determineWindowSize(final View view) {
        h.e(view, "root");
        if (!ViewsKt.hasSize(view)) {
            ViewsKt.addOnPreDrawListenerSafe(view, new ViewTreeObserver.OnPreDrawListener() { // from class: io.sentry.android.replay.WindowRecorder$determineWindowSize$1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ArrayList arrayList;
                    Point point;
                    Point point2;
                    Point point3;
                    WindowCallback windowCallback;
                    arrayList = WindowRecorder.this.rootViews;
                    WeakReference weakReference = (WeakReference) AbstractC1159h.U0(arrayList);
                    if (!h.a(view, weakReference != null ? (View) weakReference.get() : null)) {
                        ViewsKt.removeOnPreDrawListenerSafe(view, this);
                        return true;
                    }
                    if (ViewsKt.hasSize(view)) {
                        ViewsKt.removeOnPreDrawListenerSafe(view, this);
                        int width = view.getWidth();
                        point = WindowRecorder.this.lastKnownWindowSize;
                        if (width != point.x) {
                            int height = view.getHeight();
                            point2 = WindowRecorder.this.lastKnownWindowSize;
                            if (height != point2.y) {
                                point3 = WindowRecorder.this.lastKnownWindowSize;
                                point3.set(view.getWidth(), view.getHeight());
                                windowCallback = WindowRecorder.this.windowCallback;
                                windowCallback.onWindowSizeChanged(view.getWidth(), view.getHeight());
                            }
                        }
                    }
                    return true;
                }
            });
            return;
        }
        if (view.getWidth() != this.lastKnownWindowSize.x) {
            int height = view.getHeight();
            Point point = this.lastKnownWindowSize;
            if (height != point.y) {
                point.set(view.getWidth(), view.getHeight());
                this.windowCallback.onWindowSizeChanged(view.getWidth(), view.getHeight());
            }
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig) {
        ScreenshotRecorder screenshotRecorder;
        h.e(screenshotRecorderConfig, "config");
        if (this.isRecording.get()) {
            this.recorder = new ScreenshotRecorder(screenshotRecorderConfig, this.options, this.mainLooperHandler, this.replayExecutor, this.screenshotRecorderCallback);
            WeakReference weakReference = (WeakReference) AbstractC1159h.U0(this.rootViews);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (screenshotRecorder = this.recorder) != null) {
                screenshotRecorder.bind(view);
            }
            ScheduledExecutorService capturer = getCapturer();
            h.d(capturer, "capturer");
            this.capturingTask = ExecutorsKt.scheduleAtFixedRateSafely(capturer, this.options, "WindowRecorder.capture", 100L, 1000 / screenshotRecorderConfig.getFrameRate(), TimeUnit.MILLISECONDS, new io.sentry.android.core.internal.modules.a(this, 3));
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(View view, boolean z4) {
        h.e(view, "root");
        ISentryLifecycleToken acquire = this.rootViewsLock.acquire();
        try {
            if (z4) {
                this.rootViews.add(new WeakReference<>(view));
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.bind(view);
                }
                determineWindowSize(view);
            } else {
                ScreenshotRecorder screenshotRecorder2 = this.recorder;
                if (screenshotRecorder2 != null) {
                    screenshotRecorder2.unbind(view);
                }
                AbstractC1165n.P0(this.rootViews, new WindowRecorder$onRootViewsChanged$1$1(view));
                WeakReference weakReference = (WeakReference) AbstractC1159h.U0(this.rootViews);
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && !view.equals(view2)) {
                    ScreenshotRecorder screenshotRecorder3 = this.recorder;
                    if (screenshotRecorder3 != null) {
                        screenshotRecorder3.bind(view2);
                    }
                    determineWindowSize(view2);
                }
            }
            q6.a.a(acquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                q6.a.a(acquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.pause();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void reset() {
        this.lastKnownWindowSize.set(0, 0);
        ISentryLifecycleToken acquire = this.rootViewsLock.acquire();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.unbind((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            q6.a.a(acquire, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.resume();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void start() {
        this.isRecording.getAndSet(true);
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.close();
        }
        this.recorder = null;
        ScheduledFuture<?> scheduledFuture = this.capturingTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.capturingTask = null;
        this.isRecording.set(false);
    }

    public /* synthetic */ WindowRecorder(SentryOptions sentryOptions, ScreenshotRecorderCallback screenshotRecorderCallback, WindowCallback windowCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService, int i7, e eVar) {
        this(sentryOptions, (i7 & 2) != 0 ? null : screenshotRecorderCallback, windowCallback, mainLooperHandler, scheduledExecutorService);
    }
}

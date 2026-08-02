package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.ISentryLifecycleToken;
import io.sentry.MeasurementUnit;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidThreadChecker;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class ActivityFramesTracker {
    private final Map<SentryId, Map<String, MeasurementValue>> activityMeasurements;
    private final Map<Activity, FrameCounts> frameCountAtStartSnapshots;
    private FrameMetricsAggregator frameMetricsAggregator;
    private final MainLooperHandler handler;
    protected AutoClosableReentrantLock lock;
    private final SentryAndroidOptions options;

    public static final class FrameCounts {
        private final int frozenFrames;
        private final int slowFrames;
        private final int totalFrames;

        private FrameCounts(int i7, int i8, int i9) {
            this.totalFrames = i7;
            this.slowFrames = i8;
            this.frozenFrames = i9;
        }
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions, MainLooperHandler mainLooperHandler) {
        this.frameMetricsAggregator = null;
        this.activityMeasurements = new ConcurrentHashMap();
        this.frameCountAtStartSnapshots = new WeakHashMap();
        this.lock = new AutoClosableReentrantLock();
        if (loadClass.isClassAvailable("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
        }
        this.options = sentryAndroidOptions;
        this.handler = mainLooperHandler;
    }

    private FrameCounts calculateCurrentFrameCounts() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i7;
        int i8;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable() || (frameMetricsAggregator = this.frameMetricsAggregator) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) frameMetricsAggregator.f9048a.f17137b;
        int i9 = 0;
        if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i7 = 0;
            i8 = 0;
        } else {
            int i10 = 0;
            i7 = 0;
            i8 = 0;
            while (i9 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i9);
                int valueAt = sparseIntArray.valueAt(i9);
                i10 += valueAt;
                if (keyAt > 700) {
                    i8 += valueAt;
                } else if (keyAt > 16) {
                    i7 += valueAt;
                }
                i9++;
            }
            i9 = i10;
        }
        return new FrameCounts(i9, i7, i8);
    }

    private FrameCounts diffFrameCountsAtEnd(Activity activity) {
        FrameCounts calculateCurrentFrameCounts;
        FrameCounts remove = this.frameCountAtStartSnapshots.remove(activity);
        if (remove == null || (calculateCurrentFrameCounts = calculateCurrentFrameCounts()) == null) {
            return null;
        }
        return new FrameCounts(calculateCurrentFrameCounts.totalFrames - remove.totalFrames, calculateCurrentFrameCounts.slowFrames - remove.slowFrames, calculateCurrentFrameCounts.frozenFrames - remove.frozenFrames);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$addActivity$0(Activity activity) {
        v2.n nVar = this.frameMetricsAggregator.f9048a;
        nVar.getClass();
        if (v2.n.f17134f == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            v2.n.f17134f = handlerThread;
            handlerThread.start();
            v2.n.f17135x = new Handler(v2.n.f17134f.getLooper());
        }
        for (int i7 = 0; i7 <= 8; i7++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) nVar.f17137b;
            if (sparseIntArrayArr[i7] == null && (nVar.f17136a & (1 << i7)) != 0) {
                sparseIntArrayArr[i7] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((F.n) nVar.f17139d, v2.n.f17135x);
        ((ArrayList) nVar.f17138c).add(new WeakReference(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runSafelyOnUiThread$3(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setMetrics$1(Activity activity) {
        v2.n nVar = this.frameMetricsAggregator.f9048a;
        ArrayList arrayList = (ArrayList) nVar.f17138c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((F.n) nVar.f17139d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$stop$2() {
        v2.n nVar = this.frameMetricsAggregator.f9048a;
        ArrayList arrayList = (ArrayList) nVar.f17138c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener((F.n) nVar.f17139d);
                arrayList.remove(size);
            }
        }
    }

    private void runSafelyOnUiThread(Runnable runnable, String str) {
        try {
            if (AndroidThreadChecker.getInstance().isMainThread()) {
                runnable.run();
            } else {
                this.handler.post(new q(this, runnable, str, 1));
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }

    private void snapshotFrameCountsAtStart(Activity activity) {
        FrameCounts calculateCurrentFrameCounts = calculateCurrentFrameCounts();
        if (calculateCurrentFrameCounts != null) {
            this.frameCountAtStartSnapshots.put(activity, calculateCurrentFrameCounts);
        }
    }

    public void addActivity(Activity activity) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (acquire != null) {
                    acquire.close();
                }
            } else {
                runSafelyOnUiThread(new c(this, activity, 0), "FrameMetricsAggregator.add");
                snapshotFrameCountsAtStart(activity);
                if (acquire != null) {
                    acquire.close();
                }
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean isFrameMetricsAggregatorAvailable() {
        return (this.frameMetricsAggregator == null || !this.options.isEnableFramesTracking() || this.options.isEnablePerformanceV2()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMetrics(Activity activity, SentryId sentryId) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (acquire != null) {
                    acquire.close();
                    return;
                }
                return;
            }
            runSafelyOnUiThread(new c(this, activity, 1), null);
            FrameCounts diffFrameCountsAtEnd = diffFrameCountsAtEnd(activity);
            if (diffFrameCountsAtEnd != null && (diffFrameCountsAtEnd.totalFrames != 0 || diffFrameCountsAtEnd.slowFrames != 0 || diffFrameCountsAtEnd.frozenFrames != 0)) {
                MeasurementValue measurementValue = new MeasurementValue(Integer.valueOf(diffFrameCountsAtEnd.totalFrames), MeasurementUnit.NONE);
                MeasurementValue measurementValue2 = new MeasurementValue(Integer.valueOf(diffFrameCountsAtEnd.slowFrames), MeasurementUnit.NONE);
                MeasurementValue measurementValue3 = new MeasurementValue(Integer.valueOf(diffFrameCountsAtEnd.frozenFrames), MeasurementUnit.NONE);
                HashMap hashMap = new HashMap();
                hashMap.put(MeasurementValue.KEY_FRAMES_TOTAL, measurementValue);
                hashMap.put(MeasurementValue.KEY_FRAMES_SLOW, measurementValue2);
                hashMap.put(MeasurementValue.KEY_FRAMES_FROZEN, measurementValue3);
                this.activityMeasurements.put(sentryId, hashMap);
                if (acquire != null) {
                    acquire.close();
                }
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void stop() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (isFrameMetricsAggregatorAvailable()) {
                runSafelyOnUiThread(new d(this, 0), "FrameMetricsAggregator.stop");
                v2.n nVar = this.frameMetricsAggregator.f9048a;
                Object obj = nVar.f17137b;
                nVar.f17137b = new SparseIntArray[9];
            }
            this.activityMeasurements.clear();
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Map<String, MeasurementValue> takeMetrics(SentryId sentryId) {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (!isFrameMetricsAggregatorAvailable()) {
                if (acquire == null) {
                    return null;
                }
                acquire.close();
                return null;
            }
            Map<String, MeasurementValue> map = this.activityMeasurements.get(sentryId);
            this.activityMeasurements.remove(sentryId);
            if (acquire != null) {
                acquire.close();
            }
            return map;
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions) {
        this(loadClass, sentryAndroidOptions, new MainLooperHandler());
    }

    public ActivityFramesTracker(io.sentry.util.LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions, MainLooperHandler mainLooperHandler, FrameMetricsAggregator frameMetricsAggregator) {
        this(loadClass, sentryAndroidOptions, mainLooperHandler);
        this.frameMetricsAggregator = frameMetricsAggregator;
    }
}

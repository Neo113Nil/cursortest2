package io.reactivex.android.schedulers;

/* loaded from: classes17.dex */
public final class AndroidSchedulers {
    private static final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor = io.reactivex.android.plugins.RxAndroidPlugins.initMainThreadScheduler(new java.util.concurrent.Callable<io.reactivex.Scheduler>() { // from class: io.reactivex.android.schedulers.AndroidSchedulers.1
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ io.reactivex.Scheduler call() throws java.lang.Exception {
            return io.reactivex.android.schedulers.AndroidSchedulers.MainHolder.getHighResolutionOutputSizeshNQ4ISI;
        }
    });

    static final class MainHolder {
        static final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.android.schedulers.HandlerScheduler(new android.os.Handler(android.os.Looper.getMainLooper()));

        private MainHolder() {
        }
    }

    public static io.reactivex.Scheduler mainThread() {
        return io.reactivex.android.plugins.RxAndroidPlugins.onMainThreadScheduler(getHighSpeedVideoFpsRangesFor);
    }

    public static io.reactivex.Scheduler from(android.os.Looper looper) {
        if (looper == null) {
            throw new java.lang.NullPointerException("looper == null");
        }
        return new io.reactivex.android.schedulers.HandlerScheduler(new android.os.Handler(looper));
    }

    private AndroidSchedulers() {
        throw new java.lang.AssertionError("No instances.");
    }
}

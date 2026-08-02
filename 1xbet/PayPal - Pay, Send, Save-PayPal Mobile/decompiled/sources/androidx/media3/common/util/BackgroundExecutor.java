package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class BackgroundExecutor {
    private static java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

    public static java.util.concurrent.Executor get() {
        java.util.concurrent.Executor executor;
        synchronized (androidx.media3.common.util.BackgroundExecutor.class) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = androidx.media3.common.util.Util.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
            }
            executor = getHighSpeedVideoFpsRangesFor;
        }
        return executor;
    }

    public static void set(java.util.concurrent.Executor executor) {
        synchronized (androidx.media3.common.util.BackgroundExecutor.class) {
            getHighSpeedVideoFpsRangesFor = executor;
        }
    }

    private BackgroundExecutor() {
    }
}

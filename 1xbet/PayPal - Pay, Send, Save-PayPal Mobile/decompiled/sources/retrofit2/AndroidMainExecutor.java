package retrofit2;

/* loaded from: classes5.dex */
final class AndroidMainExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler getHighSpeedVideoFpsRanges = new android.os.Handler(android.os.Looper.getMainLooper());

    AndroidMainExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRanges.post(runnable);
    }
}

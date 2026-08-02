package androidx.core.os;

/* loaded from: classes3.dex */
public final class ExecutorCompat {
    public static java.util.concurrent.Executor create(android.os.Handler handler) {
        return new androidx.core.os.ExecutorCompat.HandlerExecutor(handler);
    }

    private ExecutorCompat() {
    }

    static class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler getHighSpeedVideoFpsRangesFor;

        HandlerExecutor(android.os.Handler handler) {
            this.getHighSpeedVideoFpsRangesFor = (android.os.Handler) androidx.core.util.Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            if (this.getHighSpeedVideoFpsRangesFor.post((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(runnable))) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" is shutting down");
            throw new java.util.concurrent.RejectedExecutionException(sb.toString());
        }
    }
}

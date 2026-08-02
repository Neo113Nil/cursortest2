package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/pipe/core/HandlerExecutor;", "Ljava/util/concurrent/Executor;", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "Camera2StreamConfigurationMap", "Landroid/os/Handler;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandlerExecutor implements java.util.concurrent.Executor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.os.Handler getHighSpeedVideoFpsRanges;

    public HandlerExecutor(android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighSpeedVideoFpsRanges = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "");
        if (this.getHighSpeedVideoFpsRanges.post(command)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(" is shutting down");
        throw new java.util.concurrent.RejectedExecutionException(sb.toString());
    }
}

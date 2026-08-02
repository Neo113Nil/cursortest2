package kotlinx.coroutines.future;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/future/CancelFutureOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Ljava/util/concurrent/Future;", "p0", "<init>", "(Ljava/util/concurrent/Future;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoSizes", "Ljava/util/concurrent/Future;", "getHighResolutionOutputSizeshNQ4ISI", "", "getOnCancelling", "()Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class CancelFutureOnCompletion extends kotlinx.coroutines.JobNode {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.Future<?> getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return false;
    }

    public CancelFutureOnCompletion(java.util.concurrent.Future<?> future) {
        this.getHighResolutionOutputSizeshNQ4ISI = future;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable p0) {
        if (p0 == null || this.getHighResolutionOutputSizeshNQ4ISI.isDone()) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.cancel(false);
    }
}

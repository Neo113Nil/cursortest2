package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "p0", "<init>", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "getOnCancelling", "()Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ChildContinuation extends kotlinx.coroutines.JobNode {
    public final kotlinx.coroutines.CancellableContinuationImpl<?> getHighSpeedVideoFpsRangesFor;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return true;
    }

    public ChildContinuation(kotlinx.coroutines.CancellableContinuationImpl<?> cancellableContinuationImpl) {
        this.getHighSpeedVideoFpsRangesFor = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable p0) {
        kotlinx.coroutines.CancellableContinuationImpl<?> cancellableContinuationImpl = this.getHighSpeedVideoFpsRangesFor;
        cancellableContinuationImpl.parentCancelled$kotlinx_coroutines_core(cancellableContinuationImpl.getContinuationCancellationCause(getJob()));
    }
}

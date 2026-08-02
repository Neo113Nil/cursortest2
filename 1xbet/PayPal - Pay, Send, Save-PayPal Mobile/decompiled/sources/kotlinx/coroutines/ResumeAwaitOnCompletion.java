package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", "T", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "p0", "<init>", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "", "", "invoke", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getHighResolutionOutputSizeshNQ4ISI", "", "getOnCancelling", "()Z", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ResumeAwaitOnCompletion<T> extends kotlinx.coroutines.JobNode {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CancellableContinuationImpl<T> getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeAwaitOnCompletion(kotlinx.coroutines.CancellableContinuationImpl<? super T> cancellableContinuationImpl) {
        this.getHighResolutionOutputSizeshNQ4ISI = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable p0) {
        java.lang.Object state$kotlinx_coroutines_core = getJob().getState$kotlinx_coroutines_core();
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete)) {
            throw new java.lang.AssertionError();
        }
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
            kotlinx.coroutines.CancellableContinuationImpl<T> cancellableContinuationImpl = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause)));
        } else {
            kotlinx.coroutines.CancellableContinuationImpl<T> cancellableContinuationImpl2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlinx.coroutines.JobSupportKt.unboxState(state$kotlinx_coroutines_core)));
        }
    }
}

package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/ResumeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlin/coroutines/Continuation;", "", "p0", "<init>", "(Lkotlin/coroutines/Continuation;)V", "", "invoke", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/Continuation;", "Camera2StreamConfigurationMap", "", "getOnCancelling", "()Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ResumeOnCompletion extends kotlinx.coroutines.JobNode {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<kotlin.Unit> Camera2StreamConfigurationMap;

    @Override // kotlinx.coroutines.JobNode
    public final boolean getOnCancelling() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.Camera2StreamConfigurationMap = continuation;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void invoke(java.lang.Throwable p0) {
        kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.Camera2StreamConfigurationMap;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
    }
}

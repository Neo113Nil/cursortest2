package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE}, m = "emit", n = {}, s = {})
/* loaded from: classes17.dex */
final class CancellableFlowImpl$collect$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.CancellableFlowImpl$collect$2<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CancellableFlowImpl$collect$2$emit$1(kotlinx.coroutines.flow.CancellableFlowImpl$collect$2<? super T> cancellableFlowImpl$collect$2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = cancellableFlowImpl$collect$2;
    }
}

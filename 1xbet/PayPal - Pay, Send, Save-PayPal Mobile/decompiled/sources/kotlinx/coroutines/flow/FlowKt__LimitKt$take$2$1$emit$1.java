package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {59, 61}, m = "emit", n = {}, s = {})
/* loaded from: classes17.dex */
final class FlowKt__LimitKt$take$2$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__LimitKt$take$2$1$emit$1(kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1<? super T> flowKt__LimitKt$take$2$1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = flowKt__LimitKt$take$2$1;
    }
}

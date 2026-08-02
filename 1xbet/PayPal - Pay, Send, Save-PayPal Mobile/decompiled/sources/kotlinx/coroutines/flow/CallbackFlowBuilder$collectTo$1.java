package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {com.visa.cbp.getCertUsage.setAucAID}, m = "collectTo", n = {com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY}, s = {"L$0"})
/* loaded from: classes5.dex */
final class CallbackFlowBuilder$collectTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.CallbackFlowBuilder<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.collectTo(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CallbackFlowBuilder$collectTo$1(kotlinx.coroutines.flow.CallbackFlowBuilder<T> callbackFlowBuilder, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = callbackFlowBuilder;
    }
}

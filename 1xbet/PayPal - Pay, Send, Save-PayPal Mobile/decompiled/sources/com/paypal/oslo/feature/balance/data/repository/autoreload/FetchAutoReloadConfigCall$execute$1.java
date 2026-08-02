package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall", f = "FetchAutoReloadConfigCall.kt", i = {0, 0, 0, 0, 0}, l = {41}, m = "execute", n = {"$this$execute_u24lambda_u241", "query", "apolloCall", "force", "$i$a$-run-FetchAutoReloadConfigCall$execute$3"}, nl = {84}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class FetchAutoReloadConfigCall$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.execute(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchAutoReloadConfigCall$execute$1(com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall fetchAutoReloadConfigCall, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.FetchAutoReloadConfigCall$execute$1> continuation) {
        super(continuation);
        this.getOutputFormats = fetchAutoReloadConfigCall;
    }
}

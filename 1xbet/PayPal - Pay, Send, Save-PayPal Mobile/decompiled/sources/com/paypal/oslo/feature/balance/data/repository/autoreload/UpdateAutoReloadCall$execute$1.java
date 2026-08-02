package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall", f = "UpdateAutoReloadCall.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {64}, m = "execute", n = {"request", "raise$iv$iv$iv", "$this$execute_u24lambda_u240", "mutation", "apolloCall", "config", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-UpdateAutoReloadCall$execute$2"}, nl = {113}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class UpdateAutoReloadCall$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizes.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateAutoReloadCall$execute$1(com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall updateAutoReloadCall, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.UpdateAutoReloadCall$execute$1> continuation) {
        super(continuation);
        this.getOutputSizes = updateAutoReloadCall;
    }
}

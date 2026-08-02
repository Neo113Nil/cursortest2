package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender", f = "CardTokenSuspender.kt", i = {0, 0, 0}, l = {76}, m = "executeSuspendCardMutation", n = {"deviceWalletServiceCardId", "input", "mutation"}, nl = {131}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class CardTokenSuspender$executeSuspendCardMutation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardTokenSuspender$executeSuspendCardMutation$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender cardTokenSuspender, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardTokenSuspender$executeSuspendCardMutation$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = cardTokenSuspender;
    }
}

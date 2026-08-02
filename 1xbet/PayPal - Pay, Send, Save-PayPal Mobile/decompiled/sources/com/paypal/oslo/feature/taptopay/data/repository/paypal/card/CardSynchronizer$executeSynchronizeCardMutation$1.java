package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer", f = "CardSynchronizer.kt", i = {0, 0, 0, 0, 0}, l = {84}, m = "executeSynchronizeCardMutation", n = {"deviceWalletServiceCardId", "digitizedCard", "cardMetadata", "input", "mutation"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes15.dex */
final class CardSynchronizer$executeSynchronizeCardMutation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardSynchronizer$executeSynchronizeCardMutation$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer cardSynchronizer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.CardSynchronizer$executeSynchronizeCardMutation$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = cardSynchronizer;
    }
}

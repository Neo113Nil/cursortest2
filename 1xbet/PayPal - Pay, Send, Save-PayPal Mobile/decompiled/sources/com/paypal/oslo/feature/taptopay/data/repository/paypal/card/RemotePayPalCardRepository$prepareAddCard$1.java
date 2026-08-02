package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository", f = "RemotePayPalCardRepository.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {179, 192}, m = "prepareAddCard", n = {"payPalCardId", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "riskMetadataId", "partnerName", "flowEntryPoint", "payPalCardId", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "riskMetadataId", "partnerName", "flowEntryPoint", "deviceInfo", "input", "mutation", "mutationCall"}, nl = {181, 446}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"}, v = 2)
/* loaded from: classes5.dex */
final class RemotePayPalCardRepository$prepareAddCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.prepareAddCard(null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemotePayPalCardRepository$prepareAddCard$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository remotePayPalCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$prepareAddCard$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = remotePayPalCardRepository;
    }
}

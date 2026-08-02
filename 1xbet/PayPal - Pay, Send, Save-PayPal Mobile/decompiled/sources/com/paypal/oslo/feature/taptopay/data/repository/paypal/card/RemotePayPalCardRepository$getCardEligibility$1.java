package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository", f = "RemotePayPalCardRepository.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {100, 120}, m = "getCardEligibility", n = {"deviceWalletServiceCardIds", "riskMetadataId", "financialProducts", "deviceWalletServiceCardIds", "riskMetadataId", "financialProducts", "deviceInfo", "provisioningDevice", "input", "query"}, nl = {101, 455}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* loaded from: classes5.dex */
final class RemotePayPalCardRepository$getCardEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.getCardEligibility(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemotePayPalCardRepository$getCardEligibility$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository remotePayPalCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository$getCardEligibility$1> continuation) {
        super(continuation);
        this.getInputFormats = remotePayPalCardRepository;
    }
}

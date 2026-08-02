package com.paypal.oslo.feature.taptopay.data.repository.paypal.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository", f = "LocalPayPalCardDatabaseRepository.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m = "getCardArt", n = {"id", "id", "paypalCardId"}, nl = {171, 175}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class LocalPayPalCardDatabaseRepository$getCardArt$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getCardArt(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalPayPalCardDatabaseRepository$getCardArt$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository localPayPalCardDatabaseRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository$getCardArt$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = localPayPalCardDatabaseRepository;
    }
}

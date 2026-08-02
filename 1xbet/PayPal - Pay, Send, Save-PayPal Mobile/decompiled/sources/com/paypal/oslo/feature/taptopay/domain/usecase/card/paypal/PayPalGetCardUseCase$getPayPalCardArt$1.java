package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase", f = "PayPalGetCardUseCase.kt", i = {0}, l = {77}, m = "getPayPalCardArt", n = {"digitizedCardId"}, nl = {78}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalGetCardUseCase$getPayPalCardArt$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalGetCardUseCase$getPayPalCardArt$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase payPalGetCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardUseCase$getPayPalCardArt$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = payPalGetCardUseCase;
    }
}

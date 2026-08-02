package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase", f = "PayPalGetDefaultCardUseCase.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {68, 72, 73}, m = "toPayPalDigitizedCard", n = {"$this$toPayPalDigitizedCard", "$this$toPayPalDigitizedCard", "cardIdGroup", "$this$toPayPalDigitizedCard_u24lambda_u240", "$i$a$-runCatching-PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$cardInfo$1", "$this$toPayPalDigitizedCard", "cardIdGroup", "$this$toPayPalDigitizedCard_u24lambda_u240", "$i$a$-runCatching-PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$cardInfo$1"}, nl = {69, 73, 71}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase payPalGetDefaultCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$toPayPalDigitizedCard$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = payPalGetDefaultCardUseCase;
    }
}

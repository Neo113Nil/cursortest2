package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase", f = "PayPalGetDefaultCardUseCase.kt", i = {1, 1, 1, 1}, l = {60, 63}, m = "invoke", n = {"this_$iv", "digitizedCard", "$i$f$fold", "$i$a$-fold-PayPalGetDefaultCardUseCase$invoke$3"}, nl = {92, 93}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalGetDefaultCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalGetDefaultCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase payPalGetDefaultCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetDefaultCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = payPalGetDefaultCardUseCase;
    }
}

package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsDefaultCardUseCase", f = "PayPalIsDefaultCardUseCase.kt", i = {0, 0, 1, 1, 1}, l = {66, 72}, m = "invoke", n = {"id", "cardIdValue", "id", "cardIdValue", "cardIdGroup"}, nl = {67, 106}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalIsDefaultCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsDefaultCardUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalIsDefaultCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsDefaultCardUseCase payPalIsDefaultCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsDefaultCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = payPalIsDefaultCardUseCase;
    }
}

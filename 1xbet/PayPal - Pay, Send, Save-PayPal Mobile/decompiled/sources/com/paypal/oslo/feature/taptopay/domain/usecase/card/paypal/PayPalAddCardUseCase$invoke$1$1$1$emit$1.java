package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1", f = "PayPalAddCardUseCase.kt", i = {0, 1, 2}, l = {99, 104, 117}, m = "emit", n = {"it", "it", "it"}, nl = {104, 120, 120}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalAddCardUseCase$invoke$1$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1<T> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PayPalAddCardUseCase$invoke$1$1$1$emit$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1<? super T> payPalAddCardUseCase$invoke$1$1$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$invoke$1$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = payPalAddCardUseCase$invoke$1$1$1;
    }
}

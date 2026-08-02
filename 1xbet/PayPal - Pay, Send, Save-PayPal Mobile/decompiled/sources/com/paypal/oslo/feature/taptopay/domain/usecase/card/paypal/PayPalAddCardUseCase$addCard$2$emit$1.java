package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2", f = "PayPalAddCardUseCase.kt", i = {0, 1, 2}, l = {174, 175, 185}, m = "emit", n = {"prepareAddCardState", "prepareAddCardState", "prepareAddCardState"}, nl = {175, 187, 187}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalAddCardUseCase$addCard$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PayPalAddCardUseCase$addCard$2$emit$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2<? super T> payPalAddCardUseCase$addCard$2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalAddCardUseCase$addCard$2$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = payPalAddCardUseCase$addCard$2;
    }
}

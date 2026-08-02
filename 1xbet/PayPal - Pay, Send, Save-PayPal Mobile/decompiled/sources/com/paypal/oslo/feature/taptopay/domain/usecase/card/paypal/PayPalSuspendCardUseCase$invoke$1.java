package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSuspendCardUseCase", f = "PayPalSuspendCardUseCase.kt", i = {0, 0, 1, 1, 1}, l = {68, 74}, m = "invoke", n = {"id", "cardIdValue", "id", "cardIdValue", "cardIdGroup"}, nl = {69, 106}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalSuspendCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSuspendCardUseCase getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalSuspendCardUseCase$invoke$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSuspendCardUseCase payPalSuspendCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalSuspendCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = payPalSuspendCardUseCase;
    }
}

package com.paypal.oslo.feature.bnplservicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase", f = "GetMakeAPaymentEligibleFiUseCase.kt", i = {0}, l = {43}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetMakeAPaymentEligibleFiUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetMakeAPaymentEligibleFiUseCase$invoke$1(com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase getMakeAPaymentEligibleFiUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentEligibleFiUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getMakeAPaymentEligibleFiUseCase;
    }
}

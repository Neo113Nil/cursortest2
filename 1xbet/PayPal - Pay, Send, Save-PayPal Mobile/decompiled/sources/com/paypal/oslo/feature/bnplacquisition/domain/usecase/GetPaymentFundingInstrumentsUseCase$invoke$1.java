package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase", f = "GetPaymentFundingInstrumentsUseCase.kt", i = {0}, l = {25}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetPaymentFundingInstrumentsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((java.lang.String) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPaymentFundingInstrumentsUseCase$invoke$1(com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase getPaymentFundingInstrumentsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getPaymentFundingInstrumentsUseCase;
    }
}

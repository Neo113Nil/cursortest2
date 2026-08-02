package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase", f = "CloseCreditLoanUseCase.kt", i = {0}, l = {26}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class CloseCreditLoanUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CloseCreditLoanRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloseCreditLoanUseCase$invoke$1(com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase closeCreditLoanUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = closeCreditLoanUseCase;
    }
}

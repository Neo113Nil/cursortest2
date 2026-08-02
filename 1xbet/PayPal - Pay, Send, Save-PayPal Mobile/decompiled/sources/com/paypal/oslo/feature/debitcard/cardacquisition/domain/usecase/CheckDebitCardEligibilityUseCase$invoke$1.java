package com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase", f = "CheckDebitCardEligibilityUseCase.kt", i = {0}, l = {26}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CheckDebitCardEligibilityUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke2((com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.eligibility.DebitCardEligibilityResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckDebitCardEligibilityUseCase$invoke$1(com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase checkDebitCardEligibilityUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.domain.usecase.CheckDebitCardEligibilityUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = checkDebitCardEligibilityUseCase;
    }
}

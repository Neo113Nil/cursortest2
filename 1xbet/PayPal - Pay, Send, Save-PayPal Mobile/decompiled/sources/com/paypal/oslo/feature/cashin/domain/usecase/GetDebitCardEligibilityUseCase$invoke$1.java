package com.paypal.oslo.feature.cashin.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase", f = "GetDebitCardEligibilityUseCase.kt", i = {}, l = {29}, m = "invoke", n = {}, nl = {30}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class GetDebitCardEligibilityUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetDebitCardEligibilityUseCase$invoke$1(com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase getDebitCardEligibilityUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.usecase.GetDebitCardEligibilityUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getDebitCardEligibilityUseCase;
    }
}

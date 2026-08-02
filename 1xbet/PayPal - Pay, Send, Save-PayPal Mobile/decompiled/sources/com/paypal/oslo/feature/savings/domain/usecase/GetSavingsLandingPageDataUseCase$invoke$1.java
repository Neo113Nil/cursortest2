package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase", f = "GetSavingsLandingPageDataUseCase.kt", i = {0}, l = {40}, m = "invoke", n = {"countryCode"}, nl = {41}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class GetSavingsLandingPageDataUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetSavingsLandingPageDataUseCase$invoke$1(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase getSavingsLandingPageDataUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = getSavingsLandingPageDataUseCase;
    }
}

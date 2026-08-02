package com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase", f = "GetRewardsLandingUseCase.kt", i = {0}, l = {37}, m = "invoke", n = {"request"}, nl = {38}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetRewardsLandingUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase.Response>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetRewardsLandingUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase getRewardsLandingUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = getRewardsLandingUseCase;
    }
}

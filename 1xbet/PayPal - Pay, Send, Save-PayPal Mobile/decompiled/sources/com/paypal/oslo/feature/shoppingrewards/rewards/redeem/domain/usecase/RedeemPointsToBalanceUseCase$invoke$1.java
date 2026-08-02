package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase", f = "RedeemPointsToBalanceUseCase.kt", i = {0}, l = {40}, m = "invoke", n = {"request"}, nl = {42}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class RedeemPointsToBalanceUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase.Response>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedeemPointsToBalanceUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase redeemPointsToBalanceUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = redeemPointsToBalanceUseCase;
    }
}

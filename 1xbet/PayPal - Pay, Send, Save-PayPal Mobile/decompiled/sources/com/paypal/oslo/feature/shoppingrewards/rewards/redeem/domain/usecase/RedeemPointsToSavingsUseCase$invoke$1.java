package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase", f = "RedeemPointsToSavingsUseCase.kt", i = {0}, l = {40}, m = "invoke", n = {"request"}, nl = {42}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class RedeemPointsToSavingsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke2((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase.Response>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedeemPointsToSavingsUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase redeemPointsToSavingsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = redeemPointsToSavingsUseCase;
    }
}

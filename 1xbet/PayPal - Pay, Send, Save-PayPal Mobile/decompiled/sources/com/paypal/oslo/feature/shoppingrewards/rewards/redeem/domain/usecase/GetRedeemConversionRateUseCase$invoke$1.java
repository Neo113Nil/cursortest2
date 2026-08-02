package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase", f = "GetRedeemConversionRateUseCase.kt", i = {0, 0}, l = {53}, m = "invoke", n = {"request", "redemptionType"}, nl = {54}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class GetRedeemConversionRateUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke2((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase.Response>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetRedeemConversionRateUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase getRedeemConversionRateUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = getRedeemConversionRateUseCase;
    }
}

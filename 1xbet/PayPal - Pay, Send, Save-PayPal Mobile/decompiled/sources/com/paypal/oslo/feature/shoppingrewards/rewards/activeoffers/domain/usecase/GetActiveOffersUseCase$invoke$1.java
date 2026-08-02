package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase", f = "GetActiveOffersUseCase.kt", i = {0}, l = {36}, m = "invoke", n = {"request"}, nl = {38}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetActiveOffersUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke2((com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase.Response>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetActiveOffersUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase getActiveOffersUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = getActiveOffersUseCase;
    }
}

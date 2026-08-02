package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase", f = "GetCategorySelectionUseCase.kt", i = {0}, l = {55}, m = "invoke", n = {"request"}, nl = {57}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetCategorySelectionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase.Response>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCategorySelectionUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase getCategorySelectionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.GetCategorySelectionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getCategorySelectionUseCase;
    }
}

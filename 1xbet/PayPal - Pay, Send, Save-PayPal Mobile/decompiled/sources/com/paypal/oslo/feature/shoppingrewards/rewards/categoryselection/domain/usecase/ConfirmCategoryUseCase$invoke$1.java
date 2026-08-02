package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase", f = "ConfirmCategoryUseCase.kt", i = {0}, l = {43}, m = "invoke", n = {"request"}, nl = {47}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ConfirmCategoryUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke2((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Response>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmCategoryUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase confirmCategoryUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = confirmCategoryUseCase;
    }
}

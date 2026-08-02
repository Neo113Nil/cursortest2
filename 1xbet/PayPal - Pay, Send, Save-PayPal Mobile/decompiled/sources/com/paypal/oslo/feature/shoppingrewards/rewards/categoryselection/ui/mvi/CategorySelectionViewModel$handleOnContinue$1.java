package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnContinue$1", f = "CategorySelectionViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CategorySelectionViewModel$handleOnContinue$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase confirmCategoryUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            confirmCategoryUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = confirmCategoryUseCase.invoke2(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Request(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor), (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Response>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel categorySelectionViewModel = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error) {
            categorySelectionViewModel.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmError(useCaseResult.toString()));
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            categorySelectionViewModel.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionEvent.OnConfirmSuccess(((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.usecase.ConfirmCategoryUseCase.Response) ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) useCaseResult).getData()).getCategoryConfirmationData()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnContinue$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnContinue$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategorySelectionViewModel$handleOnContinue$1(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel categorySelectionViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.ui.mvi.CategorySelectionViewModel$handleOnContinue$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = categorySelectionViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }
}

package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel$handleOnLoad$1", f = "RewardsSummaryViewModel.kt", i = {1, 1, 1, 1}, l = {144, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {"response", "$this$invokeSuspend_u24lambda_u240_u240", "$i$a$-let-RewardsSummaryViewModel$handleOnLoad$1$1", "$i$a$-with-RewardsSummaryViewModel$handleOnLoad$1$1$uiData$1"}, nl = {146, 165}, s = {"L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class RewardsSummaryViewModel$handleOnLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.navigation3.runtime.NavKey getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.navigation3.runtime.NavKey getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel getOutputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers uiDataMappers;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel rewardsSummaryViewModel;
        androidx.navigation3.runtime.NavKey navKey;
        androidx.navigation3.runtime.NavKey navKey2;
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData rewardsSummaryUiData;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getRewardsSummaryUseCase = this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizesFor = 1;
            obj = getRewardsSummaryUseCase.invoke2(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Request.INSTANCE, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navKey2 = (androidx.navigation3.runtime.NavKey) this.getInputSizeshNQ4ISI;
                navKey = (androidx.navigation3.runtime.NavKey) this.getOutputMinFrameDuration;
                rewardsSummaryViewModel = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                rewardsSummaryUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData) obj;
                if (rewardsSummaryUiData.getOverviewCardData() != null) {
                    rewardsSummaryViewModel.processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel.access$createLoadErrorEvent(rewardsSummaryViewModel, navKey, navKey2, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError));
                } else {
                    rewardsSummaryViewModel.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess(rewardsSummaryUiData, navKey2));
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel rewardsSummaryViewModel2 = this.getOutputSizeshNQ4ISI;
        androidx.navigation3.runtime.NavKey navKey3 = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.navigation3.runtime.NavKey navKey4 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error) {
            rewardsSummaryViewModel2.processEvent(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel.access$createLoadErrorEvent(rewardsSummaryViewModel2, navKey3, navKey4, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error) useCaseResult) instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet ? com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.NetworkError : com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError));
            return kotlin.Unit.INSTANCE;
        }
        if (useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) {
            uiDataMappers = rewardsSummaryViewModel2.getHighResolutionOutputSizeshNQ4ISI;
            stringResourceProvider = rewardsSummaryViewModel2.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = rewardsSummaryViewModel2;
            this.getOutputMinFrameDuration = navKey3;
            this.getInputSizeshNQ4ISI = navKey4;
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiDataMappers);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizesFor = 2;
            obj = uiDataMappers.toUiData((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) useCaseResult, navKey3, stringResourceProvider, this);
            if (obj != coroutine_suspended) {
                rewardsSummaryViewModel = rewardsSummaryViewModel2;
                navKey = navKey3;
                navKey2 = navKey4;
                rewardsSummaryUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData) obj;
                if (rewardsSummaryUiData.getOverviewCardData() != null) {
                }
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel$handleOnLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel$handleOnLoad$1(this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardsSummaryViewModel$handleOnLoad$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel rewardsSummaryViewModel, androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel$handleOnLoad$1> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = rewardsSummaryViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = navKey;
        this.getHighSpeedVideoFpsRangesFor = navKey2;
    }
}

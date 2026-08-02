package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$onBanksAdd$1", f = "ReviewScreenViewModel.kt", i = {}, l = {428}, m = "invokeSuspend", n = {}, nl = {438}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ReviewScreenViewModel$onBanksAdd$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel = this.getHighSpeedVideoSizes;
            java.lang.String amount = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) this.getHighResolutionOutputSizeshNQ4ISI).getAmount();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goal = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) this.getHighResolutionOutputSizeshNQ4ISI).getGoal();
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) this.getHighResolutionOutputSizeshNQ4ISI).getFlowType();
            java.lang.String frequencyText = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) this.getHighResolutionOutputSizeshNQ4ISI).getFrequencyText();
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) this.getHighResolutionOutputSizeshNQ4ISI).getFrequency();
            java.lang.String startDate = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) this.getHighResolutionOutputSizeshNQ4ISI).getStartDate();
            java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success) this.getHighResolutionOutputSizeshNQ4ISI).getGoals();
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            Camera2StreamConfigurationMap = reviewScreenViewModel.Camera2StreamConfigurationMap(amount, goal, flowType, frequencyText, frequency, startDate, goals, null, (r25 & 256) != 0 ? null : str, (r25 & 512) != 0 ? false : false, this);
            if (Camera2StreamConfigurationMap == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$onBanksAdd$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$onBanksAdd$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$onBanksAdd$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState reviewScreenState, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$onBanksAdd$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = reviewScreenViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = reviewScreenState;
        this.getHighSpeedVideoFpsRanges = str;
    }
}

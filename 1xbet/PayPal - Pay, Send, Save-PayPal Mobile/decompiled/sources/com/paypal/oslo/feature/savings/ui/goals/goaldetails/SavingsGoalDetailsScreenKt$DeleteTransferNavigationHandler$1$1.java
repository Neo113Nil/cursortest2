package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1", f = "SavingsGoalDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if ((this.getOutputFormats instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) && this.getHighSpeedVideoSizesFor != null && (str = this.getHighSpeedVideoSizes) != null) {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.Camera2StreamConfigurationMap;
            final java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
            appNavigator.m11575navigateForResultInternaluBl809w(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1.getHighSpeedVideoSizes(str, goalSummaryDTO, str3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination(str, goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL, str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME, (java.lang.String) null, (java.lang.String) null, 64, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1(this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1(com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState savingsGoalDetailsState, com.paypal.oslo.feature.savings.ui.goals.goaldetails.TransferReviewSheetRequest transferReviewSheetRequest, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$DeleteTransferNavigationHandler$1$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = savingsGoalDetailsState;
        this.getHighSpeedVideoSizesFor = transferReviewSheetRequest;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = goalSummaryDTO;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }
}

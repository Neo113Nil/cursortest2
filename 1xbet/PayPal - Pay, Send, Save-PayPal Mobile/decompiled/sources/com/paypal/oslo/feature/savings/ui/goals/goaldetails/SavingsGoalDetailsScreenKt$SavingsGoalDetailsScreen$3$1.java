package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$SavingsGoalDetailsScreen$3$1", f = "SavingsGoalDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsGoalDetailsScreenKt$SavingsGoalDetailsScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState access$SavingsGoalDetailsScreen$lambda$3 = com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt.access$SavingsGoalDetailsScreen$lambda$3(this.Camera2StreamConfigurationMap);
        if (access$SavingsGoalDetailsScreen$lambda$3 instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Loading) {
            com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsScreen$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.GoalDetails.SCREEN_LOADING, null, 2, null);
        } else if (access$SavingsGoalDetailsScreen$lambda$3 instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Success) {
            com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsScreen$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.GoalDetails.SCREEN_CONTENT, null, 2, null);
        } else {
            if (!(access$SavingsGoalDetailsScreen$lambda$3 instanceof com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.savings.analytics.SavingsScreenTrackerKt.trackSavingsErrorScreen(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.GoalDetails.SCREEN_ERROR, "GOAL_DETAILS_ERROR", "server");
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$SavingsGoalDetailsScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$SavingsGoalDetailsScreen$3$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavingsGoalDetailsScreenKt$SavingsGoalDetailsScreen$3$1(androidx.compose.runtime.State<? extends com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$SavingsGoalDetailsScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = state;
    }
}

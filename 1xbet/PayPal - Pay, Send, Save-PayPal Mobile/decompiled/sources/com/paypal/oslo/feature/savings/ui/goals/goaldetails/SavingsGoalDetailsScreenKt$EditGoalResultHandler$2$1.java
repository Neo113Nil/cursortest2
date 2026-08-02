package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/savings/navigation/result/EditGoalNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1", f = "SavingsGoalDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.navigation.result.EditGoalNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.ToastState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.navigation.result.EditGoalNavResult editGoalNavResult = (com.paypal.oslo.feature.savings.navigation.result.EditGoalNavResult) this.getInputFormats;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getOutputMinFrameDuration != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1.WhenMappings.$EnumSwitchMapping$0[editGoalNavResult.getType().ordinal()];
        if (i == 1) {
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.ToastState toastState = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String format = java.lang.String.format(this.getHighSpeedVideoFpsRanges, java.util.Arrays.copyOf(new java.lang.Object[]{editGoalNavResult.getGoalName()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            toastState.getHighSpeedVideoFpsRangesFor.setValue(format);
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.TRUE);
            this.getOutputFormats.processIntent(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested(this.getHighSpeedVideoFpsRangesFor));
            this.Camera2StreamConfigurationMap.invoke();
        } else if (i == 2) {
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.ToastState toastState2 = this.getHighResolutionOutputSizeshNQ4ISI;
            toastState2.getHighSpeedVideoFpsRangesFor.setValue(this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.TRUE);
            this.getOutputFormats.processIntent(new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsIntent.RetryRequested(this.getHighSpeedVideoFpsRangesFor));
        } else if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.navigation.result.EditGoalNavResult editGoalNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1) create(editGoalNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.navigation.result.EditGoalResultType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.result.EditGoalResultType.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.result.EditGoalResultType.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.result.EditGoalResultType.CANCELLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1 savingsGoalDetailsScreenKt$EditGoalResultHandler$2$1 = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        savingsGoalDetailsScreenKt$EditGoalResultHandler$2$1.getInputFormats = obj;
        return savingsGoalDetailsScreenKt$EditGoalResultHandler$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1(com.paypal.oslo.feature.savings.ui.goals.goaldetails.ToastState toastState, java.lang.String str, com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsViewModel savingsGoalDetailsViewModel, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.goals.goaldetails.SavingsGoalDetailsScreenKt$EditGoalResultHandler$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = toastState;
        this.getHighSpeedVideoFpsRanges = str;
        this.getOutputFormats = savingsGoalDetailsViewModel;
        this.getHighSpeedVideoFpsRangesFor = goalSummaryDTO;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = str2;
    }
}

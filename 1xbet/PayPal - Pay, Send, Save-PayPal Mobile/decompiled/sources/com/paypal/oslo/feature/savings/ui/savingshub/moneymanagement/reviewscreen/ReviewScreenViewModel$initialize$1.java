package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$initialize$1", f = "ReviewScreenViewModel.kt", i = {1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {142, 161, 147}, m = "invokeSuspend", n = {"goalsResult", "this_$iv", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "$i$f$fold", "$i$a$-fold-ReviewScreenViewModel$initialize$1$2", "goalsResult", "this_$iv", "$i$f$fold", "$i$a$-fold-ReviewScreenViewModel$initialize$1$1"}, nl = {144, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 159}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class ReviewScreenViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ boolean getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel toString;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (r0 == r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r0 == r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r0 != r13) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase;
        java.lang.Object invoke$default;
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object Camera2StreamConfigurationMap2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fetchGoalsUseCase = this.toString.getHighSpeedVideoSizes;
            this.getOutputMinFrameDurationlomOqCM = 1;
            invoke$default = com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase.invoke$default(fetchGoalsUseCase, null, false, this, 3, null);
        } else {
            if (i != 1) {
                if (i == 2) {
                } else if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke$default = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke$default;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel = this.toString;
        java.lang.String str = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.getHighSpeedVideoFpsRanges;
        java.lang.String str3 = this.getInputSizeshNQ4ISI;
        java.lang.String str4 = this.getOutputFormats;
        java.lang.String str5 = this.getHighSpeedVideoSizesFor;
        boolean z = this.getOutputMinFrameDuration;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List list = (java.util.List) ((arrow.core.Either.Right) either).getValue();
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
            this.getInputFormats = 0;
            this.getOutputStallDuration = 0;
            this.getOutputMinFrameDurationlomOqCM = 2;
            Camera2StreamConfigurationMap2 = reviewScreenViewModel.Camera2StreamConfigurationMap(str, goalSummaryDTO, moneyManagementFlowType, str2, frequencyType, str3, list, str4, str5, z, this);
        } else if (either instanceof arrow.core.Either.Left) {
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputFormats = 0;
            this.getOutputStallDuration = 0;
            this.getOutputMinFrameDurationlomOqCM = 3;
            Camera2StreamConfigurationMap = reviewScreenViewModel.Camera2StreamConfigurationMap(str, goalSummaryDTO, moneyManagementFlowType, str2, frequencyType, str3, emptyList, str4, str5, z, this);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$initialize$1(this.toString, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$initialize$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.toString = reviewScreenViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = goalSummaryDTO;
        this.getHighSpeedVideoFpsRangesFor = moneyManagementFlowType;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRanges = frequencyType;
        this.getInputSizeshNQ4ISI = str3;
        this.getOutputFormats = str4;
        this.getHighSpeedVideoSizesFor = str5;
        this.getOutputMinFrameDuration = z;
    }
}

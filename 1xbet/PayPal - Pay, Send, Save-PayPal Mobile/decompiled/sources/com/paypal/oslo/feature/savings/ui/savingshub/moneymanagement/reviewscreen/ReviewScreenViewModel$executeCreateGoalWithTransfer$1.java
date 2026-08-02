package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeCreateGoalWithTransfer$1", f = "ReviewScreenViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {530, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA}, m = "invokeSuspend", n = {"amountValue", "targetAmountValue", "sourceId", "transferSettings", "goalInput", "amountValue", "targetAmountValue", "sourceId", "transferSettings", "goalInput", "this_$iv", "createResult", "createdGoal", "updatedGoal", "$i$f$fold", "$i$a$-fold-ReviewScreenViewModel$executeCreateGoalWithTransfer$1$2"}, nl = {1055, 558}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class ReviewScreenViewModel$executeCreateGoalWithTransfer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01a2, code lost:
    
        if (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.access$executeInitialTransferForNewGoal(r10, r4, r11, r3, r14, r5, r31) == r8) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String replace;
        java.lang.String str;
        java.lang.String id;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput buildTransferSettings$savings_prodRelease;
        com.paypal.oslo.feature.savings.domain.usecase.CreateSavingsGoalUseCase createSavingsGoalUseCase;
        java.lang.Object invoke;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput createSavingsGoalInput;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO copy;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel = this.getOutputStallDurationlomOqCM;
            replace = new kotlin.text.Regex("[^0-9.]").replace(this.getHighSpeedVideoFpsRanges.getAmount(), "");
            com.paypal.oslo.feature.savings.domain.model.transfers.Money targetAmount = this.getHighSpeedVideoFpsRanges.getGoal().getTargetAmount();
            if (targetAmount == null || (str = targetAmount.getValue()) == null) {
                str = "0.00";
            }
            java.lang.String str4 = str;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi = this.getHighSpeedVideoFpsRanges.getSelectedFi();
            if (selectedFi == null || (id = selectedFi.getId()) == null) {
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO selectedGoal = this.getHighSpeedVideoFpsRanges.getSelectedGoal();
                id = selectedGoal != null ? selectedGoal.getId() : null;
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel2 = this.getOutputStallDurationlomOqCM;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency = this.getHighSpeedVideoFpsRanges.getFrequency();
            java.lang.String startDate = this.getHighSpeedVideoFpsRanges.getStartDate();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi2 = this.getHighSpeedVideoFpsRanges.getSelectedFi();
            buildTransferSettings$savings_prodRelease = reviewScreenViewModel2.buildTransferSettings$savings_prodRelease(frequency, startDate, selectedFi2 != null ? selectedFi2.getId() : null, new com.paypal.oslo.feature.savings.domain.model.transfers.Money("USD", replace));
            com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput createSavingsGoalInput2 = new com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput(this.getHighSpeedVideoFpsRanges.getGoal().getTitle(), "SAVING", null, com.paypal.oslo.feature.savings.constants.SavingsConstants.GoalCategories.SAVINGS_GOAL, new com.paypal.oslo.feature.savings.domain.model.transfers.Money("USD", str4), false, buildTransferSettings$savings_prodRelease);
            createSavingsGoalUseCase = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = replace;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
            this.getInputFormats = id;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildTransferSettings$savings_prodRelease);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSavingsGoalInput2);
            this.getOutputSizes = 1;
            invoke = createSavingsGoalUseCase.invoke(createSavingsGoalInput2, this);
            if (invoke != coroutine_suspended) {
                str2 = str4;
                str3 = replace;
                createSavingsGoalInput = createSavingsGoalInput2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        createSavingsGoalInput = (com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput) this.getHighSpeedVideoSizesFor;
        com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput moneyboxTransferSettingsInput = (com.paypal.oslo.api.graphql.schema.type.MoneyboxTransferSettingsInput) this.getOutputMinFrameDuration;
        id = (java.lang.String) this.getInputFormats;
        java.lang.String str5 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str6 = (java.lang.String) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        str2 = str5;
        str3 = str6;
        buildTransferSettings$savings_prodRelease = moneyboxTransferSettingsInput;
        invoke = obj;
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel3 = this.getOutputStallDurationlomOqCM;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success success = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalResult createSavingsGoalResult = (com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalResult) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneybox = createSavingsGoalResult.getMoneybox();
            if (moneybox == null || !createSavingsGoalResult.getSuccess()) {
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.access$handleTransferError(reviewScreenViewModel3, success, new com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError("Failed to create goal", null, 2, null));
            } else {
                copy = r15.copy((r28 & 1) != 0 ? r15.id : moneybox.getId(), (r28 & 2) != 0 ? r15.title : null, (r28 & 4) != 0 ? r15.iconName : null, (r28 & 8) != 0 ? r15.currentAmountFormatted : null, (r28 & 16) != 0 ? r15.targetAmountFormatted : null, (r28 & 32) != 0 ? r15.progress : 0.0d, (r28 & 64) != 0 ? r15.isAutoSaveEnabled : false, (r28 & 128) != 0 ? r15.isGeneralSavingsTile : false, (r28 & 256) != 0 ? r15.transferSettings : null, (r28 & 512) != 0 ? r15.targetAmount : null, (r28 & 1024) != 0 ? r15.isSmartRouteEnabled : false, (r28 & 2048) != 0 ? success.getGoal().currentAmount : null);
                java.lang.String id2 = moneybox.getId();
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildTransferSettings$savings_prodRelease);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSavingsGoalInput);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSavingsGoalResult);
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneybox);
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.Camera2StreamConfigurationMap = 0;
                this.getOutputSizes = 2;
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.access$handleTransferError(reviewScreenViewModel3, success, (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeCreateGoalWithTransfer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeCreateGoalWithTransfer$1(this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$executeCreateGoalWithTransfer$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success success, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeCreateGoalWithTransfer$1> continuation) {
        super(2, continuation);
        this.getOutputStallDurationlomOqCM = reviewScreenViewModel;
        this.getHighSpeedVideoFpsRanges = success;
    }
}

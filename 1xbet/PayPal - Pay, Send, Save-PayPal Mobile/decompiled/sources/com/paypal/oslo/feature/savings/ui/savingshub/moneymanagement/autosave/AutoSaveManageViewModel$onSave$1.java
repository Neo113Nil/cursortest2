package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onSave$1", f = "AutoSaveManageViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {com.visa.cbp.getCertUsage.isReperso, 364, 384, 376}, m = "invokeSuspend", n = {"moneyboxId", "scheduleId", "moneyboxId", "scheduleId", "amountString", "amountValue", "frequency", "startDate", "financialInstrumentId", "moneyboxId", "scheduleId", "amountString", "amountValue", "frequency", "startDate", "financialInstrumentId", "result", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-AutoSaveManageViewModel$onSave$1$2", "moneyboxId", "scheduleId", "amountString", "amountValue", "frequency", "startDate", "financialInstrumentId", "result", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-AutoSaveManageViewModel$onSave$1$1"}, nl = {347, 373, 389, 381}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveManageViewModel$onSave$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel getValidOutputFormatsForInputhNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x01fe, code lost:
    
        if (r11.emit(r12, r20) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0268, code lost:
    
        if (r12.emit(r11, r20) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        if (r3.emit(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack(new com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Error("Failed to update auto save: schedule not found")), r20) != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0201  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String id;
        java.lang.String str;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType;
        com.paypal.oslo.feature.savings.domain.usecase.UpdateMoneyboxTransferScheduleUseCase updateMoneyboxTransferScheduleUseCase;
        java.lang.Object invoke;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2;
        java.lang.String str5;
        java.lang.String str6;
        java.time.LocalDate selectedDate;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        arrow.core.Either either;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.String highSpeedVideoSizes;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String id2 = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoSizes).getGoal().getId();
            com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoSizes).getGoal().getTransferSettings();
            id = transferSettings != null ? transferSettings.getId() : null;
            if (id == null) {
                mutableSharedFlow = this.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getOutputStallDuration = 1;
            } else {
                java.lang.String selectedAmount = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoSizes).getSelectedAmount();
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState = this.getHighSpeedVideoSizes;
                if (selectedAmount.length() == 0) {
                    selectedAmount = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState).getCustomAmount();
                }
                java.lang.String str7 = selectedAmount;
                java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str7);
                if (doubleOrNull == null || (str = java.lang.String.valueOf(doubleOrNull.doubleValue())) == null) {
                    str = "0.00";
                }
                java.lang.String str8 = str;
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoSizes).getFrequencyState();
                if (frequencyState == null || (frequencyType = frequencyState.getSelectedFrequency()) == null) {
                    frequencyType = com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.WEEKLY;
                }
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType3 = frequencyType;
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState2 = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoSizes).getFrequencyState();
                java.lang.String localDate = (frequencyState2 == null || (selectedDate = frequencyState2.getSelectedDate()) == null) ? null : selectedDate.toString();
                java.lang.String id3 = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoSizes).getSelectedFi().getId();
                updateMoneyboxTransferScheduleUseCase = this.getValidOutputFormatsForInputhNQ4ISI.getOutputFormats;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str7);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str8);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(frequencyType3);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id3);
                this.getOutputStallDuration = 2;
                invoke = updateMoneyboxTransferScheduleUseCase.invoke(id2, id, localDate, frequencyType3, id3, new com.paypal.oslo.feature.savings.domain.model.transfers.Money("USD", str8), this);
                if (invoke != coroutine_suspended) {
                    str2 = id2;
                    str3 = str8;
                    str4 = str7;
                    frequencyType2 = frequencyType3;
                    str5 = localDate;
                    str6 = id3;
                    either = (arrow.core.Either) invoke;
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel = this.getValidOutputFormatsForInputhNQ4ISI;
                    java.lang.String str9 = this.getHighSpeedVideoFpsRanges;
                    if (!(either instanceof arrow.core.Either.Right)) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        if (i == 2) {
            str6 = (java.lang.String) this.getOutputSizes;
            str5 = (java.lang.String) this.getInputSizeshNQ4ISI;
            frequencyType2 = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType) this.getHighSpeedVideoSizesFor;
            java.lang.String str10 = (java.lang.String) this.getInputFormats;
            java.lang.String str11 = (java.lang.String) this.getOutputMinFrameDuration;
            java.lang.String str12 = (java.lang.String) this.getOutputFormats;
            str2 = (java.lang.String) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            id = str12;
            str4 = str11;
            str3 = str10;
            invoke = obj;
            either = (arrow.core.Either) invoke;
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel2 = this.getValidOutputFormatsForInputhNQ4ISI;
            java.lang.String str92 = this.getHighSpeedVideoFpsRanges;
            if (!(either instanceof arrow.core.Either.Right)) {
                com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult updateMoneyboxTransferScheduleResult = (com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult) ((arrow.core.Either.Right) either).getValue();
                mutableSharedFlow3 = autoSaveManageViewModel2.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack navigateBack = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack(new com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Success(str92));
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(frequencyType2);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateMoneyboxTransferScheduleResult);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getOutputStallDuration = 3;
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
                mutableSharedFlow2 = autoSaveManageViewModel2.getHighSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.getHighSpeedVideoSizes(savingsError);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack navigateBack2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack(new com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Error(highSpeedVideoSizes));
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(frequencyType2);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str6);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputStallDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsError);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getOutputStallDuration = 4;
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            if (i == 3) {
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onSave$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onSave$1(this.getHighSpeedVideoSizes, this.getValidOutputFormatsForInputhNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoSaveManageViewModel$onSave$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onSave$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = autoSaveManageUiState;
        this.getValidOutputFormatsForInputhNQ4ISI = autoSaveManageViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}

package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onTurnOffAutoSave$1", f = "AutoSaveManageViewModel.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {412, 421, 437, 429}, m = "invokeSuspend", n = {"moneyboxId", "scheduleId", "moneyboxId", "scheduleId", "moneyboxId", "scheduleId", "result", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-AutoSaveManageViewModel$onTurnOffAutoSave$1$2", "moneyboxId", "scheduleId", "result", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-AutoSaveManageViewModel$onTurnOffAutoSave$1$1"}, nl = {417, 426, 442, 434}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveManageViewModel$onTurnOffAutoSave$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel getOutputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0112, code lost:
    
        if (r5.emit(r6, r10) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015e, code lost:
    
        if (r6.emit(r5, r10) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        if (r2.emit(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack(new com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Error("Failed to turn off auto save: schedule not found")), r10) != r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String id;
        com.paypal.oslo.feature.savings.domain.usecase.DeleteMoneyboxTransferScheduleUseCase deleteMoneyboxTransferScheduleUseCase;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        arrow.core.Either either;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.String highSpeedVideoSizes;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String id2 = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoFpsRanges).getGoal().getId();
            com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) this.getHighSpeedVideoFpsRanges).getGoal().getTransferSettings();
            id = transferSettings != null ? transferSettings.getId() : null;
            if (id == null) {
                mutableSharedFlow = this.getOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getInputSizeshNQ4ISI = 1;
            } else {
                deleteMoneyboxTransferScheduleUseCase = this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id2);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getInputSizeshNQ4ISI = 2;
                java.lang.Object invoke = deleteMoneyboxTransferScheduleUseCase.invoke(id2, id, this);
                if (invoke != coroutine_suspended) {
                    str = id2;
                    obj = invoke;
                    either = (arrow.core.Either) obj;
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel = this.getOutputSizeshNQ4ISI;
                    java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
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
            id = (java.lang.String) this.getOutputFormats;
            str = (java.lang.String) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            either = (arrow.core.Either) obj;
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel2 = this.getOutputSizeshNQ4ISI;
            java.lang.String str22 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (!(either instanceof arrow.core.Either.Right)) {
                com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult deleteMoneyboxTransferScheduleResult = (com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult) ((arrow.core.Either.Right) either).getValue();
                mutableSharedFlow3 = autoSaveManageViewModel2.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack navigateBack = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack(new com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Success(str22));
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deleteMoneyboxTransferScheduleResult);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getInputSizeshNQ4ISI = 3;
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue();
                mutableSharedFlow2 = autoSaveManageViewModel2.getHighSpeedVideoSizes;
                highSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.getHighSpeedVideoSizes(savingsError);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack navigateBack2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack(new com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Error(highSpeedVideoSizes));
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsError);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getInputSizeshNQ4ISI = 4;
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
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onTurnOffAutoSave$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onTurnOffAutoSave$1(this.getHighSpeedVideoFpsRanges, this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoSaveManageViewModel$onTurnOffAutoSave$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$onTurnOffAutoSave$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = autoSaveManageUiState;
        this.getOutputSizeshNQ4ISI = autoSaveManageViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}

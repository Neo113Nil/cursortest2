package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$refreshFinancialInstruments$1", f = "AutoSaveManageViewModel.kt", i = {}, l = {479}, m = "invokeSuspend", n = {}, nl = {509}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveManageViewModel$refreshFinancialInstruments$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel = this.getHighSpeedVideoFpsRanges;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            final boolean z = this.Camera2StreamConfigurationMap;
            final java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            highSpeedVideoFpsRangesFor = autoSaveManageViewModel.getHighSpeedVideoFpsRangesFor(str, "USD", new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$refreshFinancialInstruments$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$refreshFinancialInstruments$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, z, str2, (java.util.List) obj2);
                }
            }, this);
            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r2 == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, boolean z, java.lang.String str, java.util.List list) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO;
        boolean z2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready copy;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.String str2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO2;
        java.lang.Object obj;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO3;
        java.lang.Object obj2;
        java.lang.Object obj3;
        mutableStateFlow = autoSaveManageViewModel.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState) mutableStateFlow.getValue();
        if (autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) {
            if (list != null) {
                if (str != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it.next();
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto = ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj3).getSource().getFiDto();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(fiDto != null ? fiDto.getInstrumentId() : null, str)) {
                            break;
                        }
                    }
                    moneyMovementFiDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj3;
                }
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState).getSelectedFi();
                if (selectedFi != null) {
                    java.util.Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj2).getId(), selectedFi.getId())) {
                            break;
                        }
                    }
                    moneyMovementFiDTO3 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj2;
                } else {
                    moneyMovementFiDTO3 = null;
                }
                if (moneyMovementFiDTO3 == null) {
                    moneyMovementFiDTO3 = com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper.selectFiBasedOnType$default(com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper.INSTANCE, list, null, null, 6, null);
                }
                moneyMovementFiDTO = moneyMovementFiDTO3;
            } else {
                moneyMovementFiDTO = null;
            }
            if (z && (str2 = str) != null && str2.length() != 0) {
                if (list != null) {
                    java.util.Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.FiDTO fiDto2 = ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj).getSource().getFiDto();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(fiDto2 != null ? fiDto2.getInstrumentId() : null, str)) {
                            break;
                        }
                    }
                    moneyMovementFiDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj;
                } else {
                    moneyMovementFiDTO2 = null;
                }
                if (moneyMovementFiDTO2 == null) {
                    z2 = true;
                    mutableStateFlow2 = autoSaveManageViewModel.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState;
                    copy = ready.copy((r28 & 1) != 0 ? ready.goal : null, (r28 & 2) != 0 ? ready.selectedAmount : null, (r28 & 4) != 0 ? ready.customAmount : null, (r28 & 8) != 0 ? ready.frequencyState : null, (r28 & 16) != 0 ? ready.selectedFi : moneyMovementFiDTO, (r28 & 32) != 0 ? ready.financialInstruments : list != null ? kotlin.collections.CollectionsKt.emptyList() : list, (r28 & 64) != 0 ? ready.isSubmitting : false, (r28 & 128) != 0 ? ready.isShowingCustomAmountInput : false, (r28 & 256) != 0 ? ready.isKeyboardVisible : false, (r28 & 512) != 0 ? ready.showCustomAmountDisplay : false, (r28 & 1024) != 0 ? ready.isFiLoading : false, (r28 & 2048) != 0 ? ready.isFiFetchError : list != null, (r28 & 4096) != 0 ? ready.lastAddedFiId : list == null ? null : ready.getLastAddedFiId());
                    mutableStateFlow2.setValue(copy);
                    if (z2) {
                        mutableSharedFlow = autoSaveManageViewModel.getHighSpeedVideoSizes;
                        mutableSharedFlow.tryEmit(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType.CREDIT_CARD_NOT_SUPPORTED));
                    }
                }
            }
            z2 = false;
            mutableStateFlow2 = autoSaveManageViewModel.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready2 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState;
            if (list != null) {
            }
            if (list == null) {
            }
            copy = ready2.copy((r28 & 1) != 0 ? ready2.goal : null, (r28 & 2) != 0 ? ready2.selectedAmount : null, (r28 & 4) != 0 ? ready2.customAmount : null, (r28 & 8) != 0 ? ready2.frequencyState : null, (r28 & 16) != 0 ? ready2.selectedFi : moneyMovementFiDTO, (r28 & 32) != 0 ? ready2.financialInstruments : list != null ? kotlin.collections.CollectionsKt.emptyList() : list, (r28 & 64) != 0 ? ready2.isSubmitting : false, (r28 & 128) != 0 ? ready2.isShowingCustomAmountInput : false, (r28 & 256) != 0 ? ready2.isKeyboardVisible : false, (r28 & 512) != 0 ? ready2.showCustomAmountDisplay : false, (r28 & 1024) != 0 ? ready2.isFiLoading : false, (r28 & 2048) != 0 ? ready2.isFiFetchError : list != null, (r28 & 4096) != 0 ? ready2.lastAddedFiId : list == null ? null : ready2.getLastAddedFiId());
            mutableStateFlow2.setValue(copy);
            if (z2) {
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$refreshFinancialInstruments$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$refreshFinancialInstruments$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoSaveManageViewModel$refreshFinancialInstruments$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, java.lang.String str, boolean z, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$refreshFinancialInstruments$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = autoSaveManageViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }
}

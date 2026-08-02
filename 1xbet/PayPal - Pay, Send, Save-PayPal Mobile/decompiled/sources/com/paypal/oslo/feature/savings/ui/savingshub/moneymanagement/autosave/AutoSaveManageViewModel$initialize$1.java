package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$initialize$1", f = "AutoSaveManageViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {185}, m = "invokeSuspend", n = {"transferSettings", "reloadAmountValue", "reloadAmount", "reloadAmountCurrencyCode", "initialAmount", "parsedDate", "initialFrequency", "matchingQuickAmount", "selectedFi", "fis", "showCustomDisplay"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class AutoSaveManageViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.String str;
        java.time.LocalDate localDate;
        java.lang.String startDate;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.String str2;
        boolean z;
        java.lang.Object highSpeedVideoFpsRangesFor;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.String recurrence;
        java.lang.String nextReloadDate;
        com.paypal.oslo.feature.savings.domain.model.MoneyData reloadAmount;
        com.paypal.oslo.feature.savings.domain.model.MoneyData reloadAmount2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputStallDurationlomOqCM;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputSizes.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Loading.INSTANCE);
            final com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings = this.getHighSpeedVideoFpsRangesFor.getTransferSettings();
            java.lang.String value = (transferSettings == null || (reloadAmount2 = transferSettings.getReloadAmount()) == null) ? null : reloadAmount2.getValue();
            java.lang.String str5 = value == null ? "0.00" : value;
            if (transferSettings == null || (reloadAmount = transferSettings.getReloadAmount()) == null || (str = reloadAmount.getCurrencyCode()) == null) {
                str = "USD";
            }
            java.lang.String str6 = value == null ? "" : value;
            if (transferSettings != null && (nextReloadDate = transferSettings.getNextReloadDate()) != null) {
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel = this.getOutputSizes;
                localDate = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.getHighResolutionOutputSizeshNQ4ISI(nextReloadDate);
            }
            if (transferSettings == null || (startDate = transferSettings.getStartDate()) == null) {
                localDate = null;
            } else {
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel2 = this.getOutputSizes;
                localDate = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.getHighResolutionOutputSizeshNQ4ISI(startDate);
            }
            if (localDate == null) {
                localDate = java.time.LocalDate.now();
            }
            if (transferSettings != null && (recurrence = transferSettings.getRecurrence()) != null) {
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType access$parseFrequencyType = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.access$parseFrequencyType(this.getOutputSizes, recurrence);
                java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayOfWeek, "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(localDate);
                frequencySelectionState = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState(access$parseFrequencyType, dayOfWeek, localDate);
            } else {
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.WEEKLY;
                java.time.DayOfWeek dayOfWeek2 = localDate.getDayOfWeek();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayOfWeek2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(localDate);
                frequencySelectionState = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState(frequencyType, dayOfWeek2, localDate);
            }
            java.lang.String access$findMatchingQuickAmount = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.access$findMatchingQuickAmount(this.getOutputSizes, str6);
            int i3 = (str6.length() <= 0 || access$findMatchingQuickAmount != null) ? 0 : 1;
            final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            str2 = "";
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(transferSettings);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getInputFormats = str6;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(localDate);
            this.getInputSizeshNQ4ISI = frequencySelectionState;
            this.getOutputFormats = access$findMatchingQuickAmount;
            this.getOutputStallDuration = objectRef3;
            this.getOutputSizeshNQ4ISI = objectRef;
            this.Camera2StreamConfigurationMap = i3;
            z = true;
            this.getOutputStallDurationlomOqCM = 1;
            highSpeedVideoFpsRangesFor = this.getOutputSizes.getHighSpeedVideoFpsRangesFor(str5, str, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$initialize$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$initialize$1.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.ObjectRef.this, transferSettings, objectRef, (java.util.List) obj2);
                }
            }, this);
            if (highSpeedVideoFpsRangesFor == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str6;
            str4 = access$findMatchingQuickAmount;
            i = i3;
            frequencySelectionState2 = frequencySelectionState;
            objectRef2 = objectRef3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.getOutputSizeshNQ4ISI;
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getOutputStallDuration;
            str4 = (java.lang.String) this.getOutputFormats;
            com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState3 = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) this.getInputSizeshNQ4ISI;
            java.lang.String str7 = (java.lang.String) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef = objectRef4;
            str2 = "";
            z = true;
            frequencySelectionState2 = frequencySelectionState3;
            str3 = str7;
        }
        mutableStateFlow2 = this.getOutputSizes.Camera2StreamConfigurationMap;
        java.lang.String str8 = str4 == null ? str2 : str4;
        java.lang.Object obj2 = objectRef2.element;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) (objectRef.element == null ? null : obj2);
        java.util.List list = (java.util.List) objectRef.element;
        if (list == null) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        mutableStateFlow2.setValue(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready(this.getHighSpeedVideoFpsRangesFor, str8, str3, frequencySelectionState2, moneyMovementFiDTO, list, false, false, false, i != 0 ? z : false, false, objectRef.element == null ? z : false, null, 5312, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 == 0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO] */
    /* JADX WARN: Type inference failed for: r0v1, types: [T] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData, kotlin.jvm.internal.Ref.ObjectRef objectRef2, java.util.List list) {
        ?? selectFiBasedOnType$default;
        java.lang.String financialInstrumentId;
        if (transferSettingsData != null && (financialInstrumentId = transferSettingsData.getFinancialInstrumentId()) != null) {
            selectFiBasedOnType$default = 0;
            java.lang.Object obj = null;
            if (list != 0) {
                java.util.Iterator it = ((java.lang.Iterable) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) next).getId(), financialInstrumentId)) {
                        obj = next;
                        break;
                    }
                }
                selectFiBasedOnType$default = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj;
            }
        }
        selectFiBasedOnType$default = com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper.selectFiBasedOnType$default(com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper.INSTANCE, list, null, null, 6, null);
        objectRef.element = selectFiBasedOnType$default;
        objectRef2.element = list;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$initialize$1(this.getOutputSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoSaveManageViewModel$initialize$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.getOutputSizes = autoSaveManageViewModel;
        this.getHighSpeedVideoFpsRangesFor = goalSummaryDTO;
    }
}

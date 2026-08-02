package com.paypal.oslo.feature.settings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase$invoke$1", f = "GetPaymentPreferencesUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {41, 65, 97}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "strings", "localDataResult", "localData", "localItems", "isPayPalBalanceEnabled", "$this$flow", "strings", "localDataResult", "isPayPalBalanceEnabled"}, nl = {42, 97, 99}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class GetPaymentPreferencesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0209, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r1, r7.combine(r16, r9, r12, r14, r11, new com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.AUTO_SAVE, r4, r13), r6), r18) == r2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0229, code lost:
    
        if (r1.emit(r15, r18) == r2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x004f, code lost:
    
        if (r3 != r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository;
        java.lang.Object isPayPalBalanceEnabled;
        com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository2;
        com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration;
        com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate;
        com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData copy$default;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository3;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository4;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository5;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository6;
        com.paypal.oslo.feature.settings.domain.repository.ISettingsRepository iSettingsRepository7;
        int i;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoSizesFor;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            iSettingsRepository = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
            this.getInputSizeshNQ4ISI = flowCollector;
            this.getHighSpeedVideoSizesFor = 1;
            isPayPalBalanceEnabled = iSettingsRepository.isPayPalBalanceEnabled(this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                } else if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            isPayPalBalanceEnabled = obj;
        }
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(isPayPalBalanceEnabled, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        settingsStringsProvider = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings paymentPreferencesStrings = settingsStringsProvider.getPaymentPreferencesStrings();
        com.paypal.oslo.feature.settings.domain.mapper.paymentpreferences.PaymentPreferencesDataMapper paymentPreferencesDataMapper = com.paypal.oslo.feature.settings.domain.mapper.paymentpreferences.PaymentPreferencesDataMapper.INSTANCE;
        iSettingsRepository2 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.settings.domain.model.PaymentPreferencesSettingsData paymentPreferencesSettingsData = iSettingsRepository2.getPaymentPreferencesSettingsData();
        settingsDynamicConfiguration = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor;
        featureGate = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
        arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData> map = paymentPreferencesDataMapper.map(paymentPreferencesSettingsData, paymentPreferencesStrings, settingsDynamicConfiguration, featureGate);
        if (map instanceof arrow.core.Ior.Right) {
            if (areEqual) {
                copy$default = (com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData) ((arrow.core.Ior.Right) map).getValue();
            } else {
                arrow.core.Ior.Right right = (arrow.core.Ior.Right) map;
                com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData = (com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData) right.getValue();
                java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> items = ((com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData) right.getValue()).getItems();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : items) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData) obj2).getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_BALANCE)) {
                        arrayList.add(obj2);
                    }
                }
                copy$default = com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData.copy$default(settingsSectionUiData, null, null, arrayList, 3, null);
            }
            com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData2 = copy$default;
            java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> items2 = settingsSectionUiData2.getItems();
            com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner paymentPreferencesDataCombiner = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.INSTANCE;
            iSettingsRepository3 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> isAutoReloadEnabledBadge = iSettingsRepository3.getIsAutoReloadEnabledBadge();
            java.util.Iterator<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> it = items2.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_BALANCE)) {
                    break;
                }
                i3++;
            }
            com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_BALANCE, isAutoReloadEnabledBadge, i3);
            iSettingsRepository4 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> creditCardStatusBadge = iSettingsRepository4.getCreditCardStatusBadge();
            java.util.Iterator<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> it2 = items2.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i4 = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(it2.next().getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CREDIT)) {
                    break;
                }
                i4++;
            }
            com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData2 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CREDIT, creditCardStatusBadge, i4);
            iSettingsRepository5 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> cashBackCardStatusBadge = iSettingsRepository5.getCashBackCardStatusBadge();
            java.util.Iterator<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> it3 = items2.iterator();
            int i5 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i5 = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(it3.next().getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CASHBACK_CARD)) {
                    break;
                }
                i5++;
            }
            com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData3 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.PAYPAL_CASHBACK_CARD, cashBackCardStatusBadge, i5);
            iSettingsRepository6 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> isSmartRouteEnabledBadge = iSettingsRepository6.getIsSmartRouteEnabledBadge();
            java.util.Iterator<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> it4 = items2.iterator();
            int i6 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(it4.next().getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.SAVINGS_SMART_ROUTE)) {
                    break;
                }
                i6++;
            }
            com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData4 = new com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.SAVINGS_SMART_ROUTE, isSmartRouteEnabledBadge, i6);
            iSettingsRepository7 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus> autoSaveStatusBadge = iSettingsRepository7.getAutoSaveStatusBadge();
            java.util.Iterator<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> it5 = items2.iterator();
            int i7 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i = -1;
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(it5.next().getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.PaymentPreferences.AUTO_SAVE)) {
                    i = i7;
                    break;
                }
                i7++;
            }
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPreferencesStrings);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(settingsSectionUiData2);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(items2);
            this.getHighSpeedVideoSizes = areEqual;
            this.getHighSpeedVideoSizesFor = 2;
        } else {
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentPreferencesStrings);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
            this.getHighSpeedVideoSizes = areEqual;
            this.getHighSpeedVideoSizesFor = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, ? extends com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase$invoke$1 getPaymentPreferencesUseCase$invoke$1 = new com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase$invoke$1(this.getOutputMinFrameDuration, continuation);
        getPaymentPreferencesUseCase$invoke$1.getInputSizeshNQ4ISI = obj;
        return getPaymentPreferencesUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPaymentPreferencesUseCase$invoke$1(com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase getPaymentPreferencesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.domain.usecase.GetPaymentPreferencesUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = getPaymentPreferencesUseCase;
    }
}

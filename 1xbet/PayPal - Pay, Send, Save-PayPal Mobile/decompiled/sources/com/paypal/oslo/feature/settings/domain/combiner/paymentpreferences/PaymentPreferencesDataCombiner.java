package com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/combiner/paymentpreferences/PaymentPreferencesDataCombiner;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "localData", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;", "ppBalanceDynamicData", "creditAutoPayDynamicData", "cashBackCardAutoPayDynamicData", "smartRouteDynamicData", "autoSaveDynamicData", "Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;", "strings", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "combine", "(Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;Lcom/paypal/oslo/feature/settings/domain/model/SettingsItemDynamicData;Lcom/paypal/oslo/feature/settings/domain/util/PaymentPreferencesStrings;)Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentPreferencesDataCombiner {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner INSTANCE = new com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner();

    private PaymentPreferencesDataCombiner() {
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> combine(final com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData localData, final com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData ppBalanceDynamicData, final com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData creditAutoPayDynamicData, final com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData cashBackCardAutoPayDynamicData, final com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData smartRouteDynamicData, final com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData autoSaveDynamicData, final com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings strings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppBalanceDynamicData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAutoPayDynamicData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashBackCardAutoPayDynamicData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartRouteDynamicData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveDynamicData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        final kotlinx.coroutines.flow.Flow[] flowArr = {kotlinx.coroutines.flow.FlowKt.flowOf(localData.getItems()), ppBalanceDynamicData.getFlow(), creditAutoPayDynamicData.getFlow(), cashBackCardAutoPayDynamicData.getFlow(), smartRouteDynamicData.getFlow(), autoSaveDynamicData.getFlow()};
        return new kotlinx.coroutines.flow.Flow<arrow.core.Ior>() { // from class: com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$5$2", "com/paypal/oslo/feature/settings/domain/util/FlowHelperFunctionsKt$combine$$inlined$combine$1$3"}, k = 3, mv = {2, 3, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1$3", f = "PaymentPreferencesDataCombiner.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, m = "invokeSuspend", n = {"$this$combineInternal", "it"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
            /* renamed from: com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData getHighSpeedVideoSizes;
                /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                final /* synthetic */ com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings getInputFormats;
                private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
                int getOutputFormats;
                final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData getOutputMinFrameDuration;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getOutputFormats;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
                        java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1.AnonymousClass3 anonymousClass3 = this;
                        java.lang.Object obj2 = objArr[0];
                        java.lang.Object obj3 = objArr[1];
                        java.lang.Object obj4 = objArr[2];
                        java.lang.Object obj5 = objArr[3];
                        java.lang.Object obj6 = objArr[4];
                        com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus = (com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus) objArr[5];
                        java.util.List list = (java.util.List) obj2;
                        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData access$updateBadgeAndSubtitleText = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.access$updateBadgeAndSubtitleText(com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.INSTANCE, list, this.getHighSpeedVideoFpsRangesFor, (com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus) obj3, this.getInputFormats);
                        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData access$updateBadgeAndSubtitleText2 = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.access$updateBadgeAndSubtitleText(com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.INSTANCE, list, this.getHighResolutionOutputSizeshNQ4ISI, (com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus) obj4, this.getInputFormats);
                        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData access$updateBadgeAndSubtitleText3 = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.access$updateBadgeAndSubtitleText(com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.INSTANCE, list, this.getHighSpeedVideoFpsRanges, (com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus) obj5, this.getInputFormats);
                        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData access$updateBadgeAndSubtitleText4 = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.access$updateBadgeAndSubtitleText(com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.INSTANCE, list, this.getOutputMinFrameDuration, (com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus) obj6, this.getInputFormats);
                        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData access$updateBadgeAndSubtitleText5 = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.access$updateBadgeAndSubtitleText(com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner.INSTANCE, list, this.getHighSpeedVideoSizes, settingsItemStatus, this.getInputFormats);
                        if (!kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData[]{access$updateBadgeAndSubtitleText, access$updateBadgeAndSubtitleText4, access$updateBadgeAndSubtitleText5, access$updateBadgeAndSubtitleText2, access$updateBadgeAndSubtitleText3}).isEmpty()) {
                            java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData> list2 = list;
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                            for (com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData : list2) {
                                java.lang.String id = settingsItemUiData.getId();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(id, this.getHighSpeedVideoFpsRangesFor.getItemId())) {
                                    if (access$updateBadgeAndSubtitleText != null) {
                                        settingsItemUiData = access$updateBadgeAndSubtitleText;
                                    }
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(id, this.getOutputMinFrameDuration.getItemId())) {
                                    if (access$updateBadgeAndSubtitleText4 != null) {
                                        settingsItemUiData = access$updateBadgeAndSubtitleText4;
                                    }
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(id, this.getHighSpeedVideoSizes.getItemId())) {
                                    if (access$updateBadgeAndSubtitleText5 != null) {
                                        settingsItemUiData = access$updateBadgeAndSubtitleText5;
                                    }
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(id, this.getHighResolutionOutputSizeshNQ4ISI.getItemId())) {
                                    if (access$updateBadgeAndSubtitleText2 != null) {
                                        settingsItemUiData = access$updateBadgeAndSubtitleText2;
                                    }
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(id, this.getHighSpeedVideoFpsRanges.getItemId()) && access$updateBadgeAndSubtitleText3 != null) {
                                    settingsItemUiData = access$updateBadgeAndSubtitleText3;
                                }
                                arrayList.add(settingsItemUiData);
                            }
                            settingsSectionUiData = com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData.copy$default(this.Camera2StreamConfigurationMap, null, null, arrayList, 3, null);
                        } else {
                            settingsSectionUiData = this.Camera2StreamConfigurationMap;
                        }
                        arrow.core.Ior rightIor = arrow.core.IorKt.rightIor(settingsSectionUiData);
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objArr);
                        this.getOutputFormats = 1;
                        if (flowCollector.emit(rightIor, anonymousClass3) == coroutine_suspended) {
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

                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior> flowCollector, java.lang.Object[] objArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1.AnonymousClass3 anonymousClass3 = new com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1.AnonymousClass3(continuation, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
                    anonymousClass3.getInputSizeshNQ4ISI = flowCollector;
                    anonymousClass3.getHighSpeedVideoSizesFor = objArr;
                    return anonymousClass3.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData, com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings paymentPreferencesStrings, com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData2, com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData3, com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData4, com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData5, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData) {
                    super(3, continuation);
                    this.getHighSpeedVideoFpsRangesFor = settingsItemDynamicData;
                    this.getInputFormats = paymentPreferencesStrings;
                    this.getHighResolutionOutputSizeshNQ4ISI = settingsItemDynamicData2;
                    this.getHighSpeedVideoFpsRanges = settingsItemDynamicData3;
                    this.getOutputMinFrameDuration = settingsItemDynamicData4;
                    this.getHighSpeedVideoSizes = settingsItemDynamicData5;
                    this.Camera2StreamConfigurationMap = settingsSectionUiData;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior> flowCollector, kotlin.coroutines.Continuation continuation) {
                kotlinx.coroutines.flow.Flow[] flowArr2 = flowArr;
                final kotlinx.coroutines.flow.Flow[] flowArr3 = flowArr;
                java.lang.Object combineInternal = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr2, new kotlin.jvm.functions.Function0<java.lang.Object[]>() { // from class: com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object[] invoke() {
                        return new java.lang.Object[flowArr3.length];
                    }
                }, new com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner$combine$$inlined$combine$1.AnonymousClass3(null, ppBalanceDynamicData, strings, creditAutoPayDynamicData, cashBackCardAutoPayDynamicData, smartRouteDynamicData, autoSaveDynamicData, localData), continuation);
                return combineInternal == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? combineInternal : kotlin.Unit.INSTANCE;
            }
        };
    }

    public static final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData access$updateBadgeAndSubtitleText(com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDataCombiner paymentPreferencesDataCombiner, java.util.List list, com.paypal.oslo.feature.settings.domain.model.SettingsItemDynamicData settingsItemDynamicData, com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus settingsItemStatus, com.paypal.oslo.feature.settings.domain.util.PaymentPreferencesStrings paymentPreferencesStrings) {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData copy;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData copy2;
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData = (com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData) kotlin.collections.CollectionsKt.getOrNull(list, settingsItemDynamicData.getIndexInList());
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData2 = null;
        if (settingsItemUiData == null) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(settingsItemUiData.getStatus(), settingsItemStatus)) {
            copy = null;
        } else {
            copy = settingsItemUiData.copy((r24 & 1) != 0 ? settingsItemUiData.id : null, (r24 & 2) != 0 ? settingsItemUiData.title : null, (r24 & 4) != 0 ? settingsItemUiData.subtitle : null, (r24 & 8) != 0 ? settingsItemUiData.status : settingsItemStatus, (r24 & 16) != 0 ? settingsItemUiData.statusText : com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDisplayHelper.INSTANCE.getStatusText(paymentPreferencesStrings, settingsItemStatus), (r24 & 32) != 0 ? settingsItemUiData.showChevron : false, (r24 & 64) != 0 ? settingsItemUiData.showDivider : false, (r24 & 128) != 0 ? settingsItemUiData.isSubHeader : false, (r24 & 256) != 0 ? settingsItemUiData.destination : null, (r24 & 512) != 0 ? settingsItemUiData.isLoading : kotlin.jvm.internal.Intrinsics.areEqual(settingsItemStatus, new com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus.Badge(com.paypal.oslo.feature.settings.domain.model.BadgeType.Loading)), (r24 & 1024) != 0 ? settingsItemUiData.errorMessage : null);
        }
        java.lang.String subtitleText = com.paypal.oslo.feature.settings.domain.combiner.paymentpreferences.PaymentPreferencesDisplayHelper.INSTANCE.getSubtitleText(settingsItemDynamicData.getItemId(), paymentPreferencesStrings, settingsItemStatus);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(settingsItemUiData.getSubtitle(), subtitleText)) {
            settingsItemUiData2 = settingsItemUiData.copy((r24 & 1) != 0 ? settingsItemUiData.id : null, (r24 & 2) != 0 ? settingsItemUiData.title : null, (r24 & 4) != 0 ? settingsItemUiData.subtitle : subtitleText, (r24 & 8) != 0 ? settingsItemUiData.status : null, (r24 & 16) != 0 ? settingsItemUiData.statusText : null, (r24 & 32) != 0 ? settingsItemUiData.showChevron : false, (r24 & 64) != 0 ? settingsItemUiData.showDivider : false, (r24 & 128) != 0 ? settingsItemUiData.isSubHeader : false, (r24 & 256) != 0 ? settingsItemUiData.destination : null, (r24 & 512) != 0 ? settingsItemUiData.isLoading : false, (r24 & 1024) != 0 ? settingsItemUiData.errorMessage : null);
        }
        if (copy == null || settingsItemUiData2 == null) {
            return copy == null ? settingsItemUiData2 : copy;
        }
        copy2 = r1.copy((r24 & 1) != 0 ? r1.id : null, (r24 & 2) != 0 ? r1.title : null, (r24 & 4) != 0 ? r1.subtitle : settingsItemUiData2.getSubtitle(), (r24 & 8) != 0 ? r1.status : null, (r24 & 16) != 0 ? r1.statusText : null, (r24 & 32) != 0 ? r1.showChevron : false, (r24 & 64) != 0 ? r1.showDivider : false, (r24 & 128) != 0 ? r1.isSubHeader : false, (r24 & 256) != 0 ? r1.destination : null, (r24 & 512) != 0 ? r1.isLoading : false, (r24 & 1024) != 0 ? copy.errorMessage : null);
        return copy2;
    }
}

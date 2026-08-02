package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u00020\b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!R#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170 0\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ManageYourDataViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "dynamicConfiguration", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetErasureRequestsUseCase;", "getErasureRequestsUseCase", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetErasureRequestsUseCase;)V", "", "updatePendingErasureState$data_privacy_prodRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPendingErasure$data_privacy_prodRelease", "()V", "", "", "", "enabledFeatures", "loadOptionItems$data_privacy_prodRelease", "(Ljava/util/Map;)V", "Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;", "setting", "isRowEnabled$data_privacy_prodRelease", "(Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;Ljava/util/Map;)Z", "Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2OptionItem;", "createOptionItem$data_privacy_prodRelease", "(Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2Settings;)Lcom/paypal/oslo/feature/dataprivacy/ui/model/DataPrivacyL2OptionItem;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/dataprivacy/config/DataPrivacyDynamicConfiguration;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetErasureRequestsUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "optionItems", "Lkotlinx/coroutines/flow/StateFlow;", "getOptionItems", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "hasPendingErasure", "getHasPendingErasure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageYourDataViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem>> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> hasPendingErasure;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem>> optionItems;

    @javax.inject.Inject
    public ManageYourDataViewModel(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration dataPrivacyDynamicConfiguration, com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase getErasureRequestsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPrivacyDynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getErasureRequestsUseCase, "");
        this.Camera2StreamConfigurationMap = dataPrivacyDynamicConfiguration;
        this.getHighResolutionOutputSizeshNQ4ISI = getErasureRequestsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.optionItems = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighSpeedVideoSizes = MutableStateFlow2;
        this.hasPendingErasure = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        java.util.Map<java.lang.String, java.lang.Boolean> l2EnabledFeatures = dataPrivacyDynamicConfiguration.getL2EnabledFeatures();
        loadOptionItems$data_privacy_prodRelease(l2EnabledFeatures);
        if (isRowEnabled$data_privacy_prodRelease(com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DELETE_YOUR_DATA, l2EnabledFeatures)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel.AnonymousClass1(l2EnabledFeatures, null), 3, null);
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem>> getOptionItems() {
        return this.optionItems;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getHasPendingErasure() {
        return this.hasPendingErasure;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$1", f = "ManageYourDataViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, nl = {71}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Map<java.lang.String, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel.this.updatePendingErasureState$data_privacy_prodRelease(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel.this.loadOptionItems$data_privacy_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel.this.new AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(java.util.Map<java.lang.String, java.lang.Boolean> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = map;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePendingErasureState$data_privacy_prodRelease(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$updatePendingErasureState$1 manageYourDataViewModel$updatePendingErasureState$1;
        int i;
        arrow.core.Ior ior;
        java.util.List emptyList;
        java.util.List list;
        java.util.Iterator it;
        if (continuation instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$updatePendingErasureState$1) {
            manageYourDataViewModel$updatePendingErasureState$1 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$updatePendingErasureState$1) continuation;
            if ((manageYourDataViewModel$updatePendingErasureState$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                manageYourDataViewModel$updatePendingErasureState$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = manageYourDataViewModel$updatePendingErasureState$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageYourDataViewModel$updatePendingErasureState$1.getHighSpeedVideoFpsRangesFor;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase getErasureRequestsUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    manageYourDataViewModel$updatePendingErasureState$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getErasureRequestsUseCase.invoke(manageYourDataViewModel$updatePendingErasureState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Right)) {
                    emptyList = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
                } else if (ior instanceof arrow.core.Ior.Both) {
                    emptyList = (java.util.List) ((arrow.core.Ior.Both) ior).getRightValue();
                } else {
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    emptyList = kotlin.collections.CollectionsKt.emptyList();
                }
                kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.getHighSpeedVideoSizes;
                list = emptyList;
                if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequestKt.isPending((com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest) it.next())) {
                            break;
                        }
                    }
                }
                z = false;
                mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                return kotlin.Unit.INSTANCE;
            }
        }
        manageYourDataViewModel$updatePendingErasureState$1 = new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$updatePendingErasureState$1(this, continuation);
        java.lang.Object obj2 = manageYourDataViewModel$updatePendingErasureState$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageYourDataViewModel$updatePendingErasureState$1.getHighSpeedVideoFpsRangesFor;
        boolean z2 = true;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Right)) {
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow2 = this.getHighSpeedVideoSizes;
        list = emptyList;
        if (list instanceof java.util.Collection) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        z2 = false;
        mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
        return kotlin.Unit.INSTANCE;
    }

    public final void checkPendingErasure$data_privacy_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel$checkPendingErasure$1(this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadOptionItems$data_privacy_prodRelease$default(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel manageYourDataViewModel, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = manageYourDataViewModel.Camera2StreamConfigurationMap.getL2EnabledFeatures();
        }
        manageYourDataViewModel.loadOptionItems$data_privacy_prodRelease(map);
    }

    public final void loadOptionItems$data_privacy_prodRelease(java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabledFeatures, "");
        java.util.List<com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings> l2Options = com.paypal.oslo.feature.dataprivacy.config.DataPrivacyL2FeatureRowOrder.INSTANCE.getL2Options();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : l2Options) {
            if (isRowEnabled$data_privacy_prodRelease((com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings) obj, enabledFeatures)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(createOptionItem$data_privacy_prodRelease((com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings) it.next()));
        }
        this.getHighSpeedVideoFpsRanges.setValue(arrayList3);
    }

    public final boolean isRowEnabled$data_privacy_prodRelease(com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings setting, java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabledFeatures, "");
        java.lang.Boolean bool = enabledFeatures.get(setting.getConfigKey());
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem createOptionItem$data_privacy_prodRelease(com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings setting) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setting, "");
        int i = com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel.WhenMappings.$EnumSwitchMapping$0[setting.ordinal()];
        if (i == 1) {
            return new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem(setting.getKey(), com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_download_your_data_option, setting, com.paypal.oslo.feature.dataprivacy.api.navigation.DataAccessDestination.INSTANCE);
        }
        if (i == 2) {
            return new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem(setting.getKey(), com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_delete_your_data_option, setting, this.getHighSpeedVideoSizes.getValue().booleanValue() ? com.paypal.oslo.feature.dataprivacy.api.navigation.ErasurePendingDestination.INSTANCE : com.paypal.oslo.feature.dataprivacy.api.navigation.DataDeletionDestination.INSTANCE);
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2OptionItem(setting.getKey(), com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_face_scan_data_option, setting, com.paypal.oslo.feature.consumerprivacy.api.navigation.FaceScanDestination.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.values().length];
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DOWNLOAD_YOUR_DATA.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.DELETE_YOUR_DATA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.dataprivacy.ui.model.DataPrivacyL2Settings.FACE_SCAN_DATA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

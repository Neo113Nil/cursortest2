package com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060 0\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060 0\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R \u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/usecase/GetLoginAndSecurityFeaturesUseCase;", "getLoginAndSecurityFeaturesUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/loginsecurity/domain/usecase/GetLoginAndSecurityFeaturesUseCase;)V", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeature;", "feature", "", "isChecked", "", "onToggleAuthenticationState", "(Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeature;Z)V", "onSettingClick", "(Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeature;)V", "onFingerprintConfirmationConfirm", "()V", "onExtendSessionConfirm", "dismissBottomSheet", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/loginsecurity/domain/usecase/GetLoginAndSecurityFeaturesUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/LoginAndSecurityUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "features", "getFeatures", "Lcom/paypal/oslo/feature/identity/loginsecurity/ui/viewmodel/BottomSheetState;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "bottomSheetState", "getBottomSheetState", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoginAndSecurityViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState> bottomSheetState;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature>> features;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState> uiState;

    @javax.inject.Inject
    public LoginAndSecurityViewModel(com.paypal.oslo.feature.identity.loginsecurity.domain.usecase.GetLoginAndSecurityFeaturesUseCase getLoginAndSecurityFeaturesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLoginAndSecurityFeaturesUseCase, "");
        this.getHighSpeedVideoFpsRanges = getLoginAndSecurityFeaturesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.Idle.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow2;
        this.features = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.Hidden.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow3;
        this.bottomSheetState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$loadFeatures$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature>> getFeatures() {
        return this.features;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState> getBottomSheetState() {
        return this.bottomSheetState;
    }

    public final void onToggleAuthenticationState(final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature feature, boolean isChecked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        int i = com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.WhenMappings.$EnumSwitchMapping$0[feature.getType().ordinal()];
        if (i == 1) {
            if (isChecked) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$updateFeatureState$1(this, feature.getType(), true, null), 3, null);
                return;
            } else {
                this.getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.$r8$lambda$CQhMVn2AajSJd42Uju8kM__6moE(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.this, feature);
                    }
                };
                this.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation("Remove fingerprint scan?"));
                return;
            }
        }
        if (i == 2) {
            if (isChecked) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$updateFeatureState$1(this, feature.getType(), true, null), 3, null);
                return;
            } else {
                this.getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.m15188$r8$lambda$sz74q0XDMTyAHDP9OaiPB5yvdY(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel.this, feature);
                    }
                };
                this.Camera2StreamConfigurationMap.setValue(new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation("Remove Face ID?"));
                return;
            }
        }
        if (i != 3) {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$updateFeatureState$1(this, feature.getType(), isChecked, null), 3, null);
            return;
        }
        if (!isChecked) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$updateFeatureState$1(this, feature.getType(), false, null), 3, null);
        } else {
            this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.ExtendSession.INSTANCE);
        }
    }

    public final void onSettingClick(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$onSettingClick$1(this, feature, null), 3, null);
    }

    public final void onFingerprintConfirmationConfirm() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRangesFor;
        if (function0 != null) {
            function0.invoke();
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        dismissBottomSheet();
    }

    public final void onExtendSessionConfirm() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$updateFeatureState$1(this, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.EXTEND_LOGIN_SESSION, true, null), 3, null);
        dismissBottomSheet();
    }

    public final void dismissBottomSheet() {
        if (this.Camera2StreamConfigurationMap.getValue() instanceof com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.FingerprintConfirmation) {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
        this.Camera2StreamConfigurationMap.setValue(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.BottomSheetState.Hidden.INSTANCE);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CQhMVn2AajSJd42Uju8kM__6moE(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel loginAndSecurityViewModel, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(loginAndSecurityViewModel), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$updateFeatureState$1(loginAndSecurityViewModel, loginAndSecurityFeature.getType(), false, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sz74q0XDMTyAHDP9OaiP-B5yvdY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15188$r8$lambda$sz74q0XDMTyAHDP9OaiPB5yvdY(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel loginAndSecurityViewModel, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(loginAndSecurityViewModel), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$updateFeatureState$1(loginAndSecurityViewModel, loginAndSecurityFeature.getType(), false, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public final void refresh() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$loadFeatures$1(this, null), 3, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.TOUCH_ID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.FACE_ID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.EXTEND_LOGIN_SESSION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.PASSKEY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

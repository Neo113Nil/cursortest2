package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 R2\u00020\u0001:\u0001RB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0014J3\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u0013\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001e¢\u0006\u0004\b\u0013\u0010 J+\u0010!\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001e¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010%\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u000eJ\r\u0010-\u001a\u00020\f¢\u0006\u0004\b-\u0010\u000eJ\r\u0010.\u001a\u00020\u0011¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0016¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0011¢\u0006\u0004\b2\u0010/J\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010\u000eJ\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000eJ\u0015\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u0002050D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010ER\u001d\u0010G\u001a\b\u0012\u0004\u0012\u0002050F8\u0007¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001c0D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010ER\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0F8G¢\u0006\u0006\u001a\u0004\bL\u0010JR\"\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010MR\u0018\u0010P\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010>\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010Q"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsAccountUseCase;", "getSavingsAccountUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsAccountEligibilityUseCase;", "getSavingsAccountEligibilityUseCase", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsLandingPageDataUseCase;", "getSavingsLandingPageDataUseCase", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "featureManager", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsAccountUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsAccountEligibilityUseCase;Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsLandingPageDataUseCase;Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;)V", "", "onOnboardingLaunched", "()V", "Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;", "clientSource", "", "isEmbeddedFlow", "initialize", "(Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;Z)V", "fetchSavingsAccount", "", "countryCode", "isRerunRequired", "isTerminalCall", "fetchSavingsAccountEligibility", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsClientSource;ZZ)V", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "", "params", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsFlowType;Ljava/util/Map;)V", "switchFlow", "key", "getParam", "(Ljava/lang/String;)Ljava/lang/String;", "isUnconfirmedError", "fetchSavingsLandingPageData", "(Ljava/lang/String;Z)V", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "landingPageData", "moveToSavingsTerms", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;)V", "moveToAddMoneyScreen", "moveToHubState", "isBetaDisclosureEnabled", "()Z", "getBetaOptOutUrl", "()Ljava/lang/String;", "isOnBoardingEnabled", "moveToOnBoardingDisabledState", "moveToDirectOnBoarding", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "state", "setNextState", "(Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;)V", "getInputFormats", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsAccountUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsAccountEligibilityUseCase;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/savings/domain/usecase/GetSavingsLandingPageDataUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getOutputFormats", "getFlowType", "Ljava/util/Map;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsBaseUiState;", "getOutputMinFrameDuration", "Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsBaseViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.manager.SavingsFeatureManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public SavingsBaseViewModel(com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountUseCase getSavingsAccountUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetSavingsAccountEligibilityUseCase getSavingsAccountEligibilityUseCase, com.paypal.oslo.feature.savings.domain.usecase.GetSavingsLandingPageDataUseCase getSavingsLandingPageDataUseCase, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSavingsAccountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSavingsAccountEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSavingsLandingPageDataUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsFeatureManager, "");
        this.getHighSpeedVideoFpsRangesFor = getSavingsAccountUseCase;
        this.Camera2StreamConfigurationMap = getSavingsAccountEligibilityUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getSavingsLandingPageDataUseCase;
        this.getHighSpeedVideoFpsRanges = savingsFeatureManager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getOutputFormats = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType.SAVINGS_HOME_SCREEN);
        this.getHighSpeedVideoSizesFor = kotlin.collections.MapsKt.emptyMap();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType> getFlowType() {
        return this.getOutputFormats;
    }

    public final void onOnboardingLaunched() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.AwaitingOnboardingResult.INSTANCE);
    }

    public final void initialize(com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource clientSource, boolean isEmbeddedFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSource, "");
        if (this.getInputSizeshNQ4ISI) {
            return;
        }
        this.getInputSizeshNQ4ISI = true;
        if (this.getHighSpeedVideoFpsRanges.isSavingsFeatureAvailable()) {
            fetchSavingsAccount(clientSource, isEmbeddedFlow);
        } else {
            this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.Error.INSTANCE);
        }
    }

    public final void fetchSavingsAccount(com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource clientSource, boolean isEmbeddedFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSource, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccount$1(this, clientSource, isEmbeddedFlow, null), 3, null);
    }

    public static /* synthetic */ void fetchSavingsAccountEligibility$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, java.lang.String str, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "US";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        savingsBaseViewModel.fetchSavingsAccountEligibility(str, savingsClientSource, z, z2);
    }

    public final void fetchSavingsAccountEligibility(java.lang.String countryCode, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource clientSource, boolean isRerunRequired, boolean isTerminalCall) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSource, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsAccountEligibility$1(this, countryCode, clientSource, isRerunRequired, isTerminalCall, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initialize$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType savingsFlowType, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        savingsBaseViewModel.initialize(savingsFlowType, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final void initialize(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType flowType, java.util.Map<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        this.getOutputFormats.setValue(flowType);
        this.getHighSpeedVideoSizesFor = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void switchFlow$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType savingsFlowType, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        savingsBaseViewModel.switchFlow(savingsFlowType, map);
    }

    public final void switchFlow(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType flowType, java.util.Map<java.lang.String, java.lang.String> params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "");
        this.getOutputFormats.setValue(flowType);
        if (params.isEmpty() && !this.getHighSpeedVideoSizesFor.isEmpty()) {
            params = this.getHighSpeedVideoSizesFor;
        }
        this.getHighSpeedVideoSizesFor = params;
    }

    public final java.lang.String getParam(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoSizesFor.get(key);
    }

    public static /* synthetic */ void fetchSavingsLandingPageData$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "US";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        savingsBaseViewModel.fetchSavingsLandingPageData(str, z);
    }

    public final void fetchSavingsLandingPageData(java.lang.String countryCode, boolean isUnconfirmedError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel$fetchSavingsLandingPageData$1(this, countryCode, isUnconfirmedError, null), 3, null);
    }

    public final void moveToSavingsTerms(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult landingPageData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(landingPageData, "");
        this.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToSavingsTerms(landingPageData));
    }

    public final void moveToAddMoneyScreen() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToAddMoneyScreen.INSTANCE);
    }

    public final void moveToHubState() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToHubState.INSTANCE);
    }

    public final boolean isBetaDisclosureEnabled() {
        return this.getHighSpeedVideoFpsRanges.isBetaDisclosureEnabled();
    }

    public final java.lang.String getBetaOptOutUrl() {
        return this.getHighSpeedVideoFpsRanges.getBetaOptOutUrl();
    }

    public final boolean isOnBoardingEnabled() {
        return this.getHighSpeedVideoFpsRanges.isHysOnboardingEnabled();
    }

    public final void moveToOnBoardingDisabledState() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.OnboardingFeatureDisabled.INSTANCE);
    }

    public final void moveToDirectOnBoarding() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToDirectOnBoarding.INSTANCE);
    }

    public final void setNextState(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.getOutputMinFrameDuration = state;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$handleEligibilityStatus(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseViewModel savingsBaseViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.savings.domain.usecase.SavingsClientSource savingsClientSource, boolean z) {
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings ineligibleForSavings;
        if (!z && !kotlin.jvm.internal.Intrinsics.areEqual(str, "SUBSCRIBED") && !kotlin.jvm.internal.Intrinsics.areEqual(str, "NOT_SUBSCRIBED")) {
            savingsBaseViewModel.fetchSavingsAccountEligibility(str4, savingsClientSource, false, true);
            return;
        }
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState savingsBaseUiState = savingsBaseViewModel.getOutputMinFrameDuration;
        savingsBaseViewModel.getOutputMinFrameDuration = null;
        if (str != null) {
            switch (str.hashCode()) {
                case -734676902:
                    if (str.equals("SUBSCRIBED")) {
                        if (savingsBaseUiState != null) {
                            savingsBaseViewModel.getHighSpeedVideoSizes.setValue(savingsBaseUiState);
                            return;
                        } else {
                            savingsBaseViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.SubscribedWithoutSavingsAcct.INSTANCE);
                            return;
                        }
                    }
                    break;
                case 123781478:
                    if (str.equals("NOT_SUBSCRIBED")) {
                        if (!savingsBaseViewModel.getHighSpeedVideoFpsRanges.isHysOnboardingEnabled()) {
                            savingsBaseViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.OnboardingFeatureDisabled.INSTANCE);
                            return;
                        } else if (savingsBaseUiState != null) {
                            savingsBaseViewModel.getHighSpeedVideoSizes.setValue(savingsBaseUiState);
                            return;
                        } else {
                            fetchSavingsLandingPageData$default(savingsBaseViewModel, str4, false, 2, null);
                            return;
                        }
                    }
                    break;
                case 175259132:
                    if (str.equals(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.DECISION_INELIGIBLE)) {
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -2123518269:
                                    if (str2.equals("UNCONFIRMED_EMAIL")) {
                                        ineligibleForSavings = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsUnconfirmedEmail.INSTANCE;
                                        break;
                                    }
                                    break;
                                case -1853655802:
                                    if (str2.equals("NEGATIVE_BALANCE_IN_WALLET")) {
                                        ineligibleForSavings = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsNegativeBalanceInWallet.INSTANCE;
                                        break;
                                    }
                                    break;
                                case -1635597599:
                                    if (str2.equals("VERIFICATION_FAILED")) {
                                        ineligibleForSavings = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsVerificationFailed.INSTANCE;
                                        break;
                                    }
                                    break;
                                case -507477911:
                                    if (str2.equals("ACCOUNT_CLOSED_RECENTLY")) {
                                        ineligibleForSavings = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsAcctClosedRecently(str3);
                                        break;
                                    }
                                    break;
                                case 577558197:
                                    if (str2.equals("ACCOUNT_ALREADY_EXISTS")) {
                                        ineligibleForSavings = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.MoveToHubState.INSTANCE;
                                        break;
                                    }
                                    break;
                            }
                            if (!(ineligibleForSavings instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsUnconfirmedEmail)) {
                                savingsBaseViewModel.fetchSavingsLandingPageData(str4, true);
                                return;
                            } else if (ineligibleForSavings instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsNegativeBalanceInWallet) {
                                savingsBaseViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsNegativeBalanceInWallet.INSTANCE);
                                return;
                            } else {
                                savingsBaseViewModel.getHighSpeedVideoSizes.setValue(ineligibleForSavings);
                                return;
                            }
                        }
                        ineligibleForSavings = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings(str3);
                        if (!(ineligibleForSavings instanceof com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavingsUnconfirmedEmail)) {
                        }
                    }
                    break;
                case 527514546:
                    if (str.equals("IN_REVIEW")) {
                        savingsBaseViewModel.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.EligibilityInReview.INSTANCE);
                        return;
                    }
                    break;
            }
        }
        savingsBaseViewModel.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseUiState.IneligibleForSavings(null));
    }
}

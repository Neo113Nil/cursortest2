package com.paypal.oslo.feature.wallet.banks.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060%8\u0007¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b)\u0010(R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b*\u0010(R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b\u000b\u0010(R\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b-\u0010("}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "addFIAnalyticsContext", "", "shouldShowSuccessScreen", "shouldHideAddBankManual", "isBackButtonEnabled", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "", "setConfig", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;ZZZLcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmFlowType;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "addBankConfig", "setAddBankConfig", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;)V", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;", "result", "finishFlowWithResult", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult$Outcome;)V", "getOutputMinFrameDuration", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "getInputSizeshNQ4ISI", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "getAddFIAnalyticsContext", "()Lkotlinx/coroutines/flow/StateFlow;", "getShouldShowSuccessScreen", "getShouldHideAddBankManual", "confirmFlowType", "getConfirmFlowType", "getAddBankConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankSharedViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig> addBankConfig;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext> addFIAnalyticsContext;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType> confirmFlowType;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isBackButtonEnabled;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> shouldHideAddBankManual;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> shouldShowSuccessScreen;

    @javax.inject.Inject
    public BankSharedViewModel(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.Camera2StreamConfigurationMap = appNavigator;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizes = MutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow3;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getInputSizeshNQ4ISI = MutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getInputFormats = MutableStateFlow6;
        this.addFIAnalyticsContext = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.shouldShowSuccessScreen = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        this.shouldHideAddBankManual = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow5);
        this.isBackButtonEnabled = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow6);
        this.confirmFlowType = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        this.addBankConfig = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext> getAddFIAnalyticsContext() {
        return this.addFIAnalyticsContext;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShouldShowSuccessScreen() {
        return this.shouldShowSuccessScreen;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShouldHideAddBankManual() {
        return this.shouldHideAddBankManual;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isBackButtonEnabled() {
        return this.isBackButtonEnabled;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType> getConfirmFlowType() {
        return this.confirmFlowType;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig> getAddBankConfig() {
        return this.addBankConfig;
    }

    public static /* synthetic */ void setConfig$default(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, boolean z, boolean z2, boolean z3, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType confirmFlowType, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? true : z;
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z5 = z2;
        boolean z6 = (i & 8) != 0 ? true : z3;
        if ((i & 16) != 0) {
            confirmFlowType = null;
        }
        bankSharedViewModel.setConfig(addFIAnalyticsContext, z4, z5, z6, confirmFlowType);
    }

    public final void setConfig(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, boolean shouldShowSuccessScreen, boolean shouldHideAddBankManual, boolean isBackButtonEnabled, com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType flowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAnalyticsContext, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), flowType)) {
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext> mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), addFIAnalyticsContext)) {
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor;
        while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), java.lang.Boolean.valueOf(shouldShowSuccessScreen))) {
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow4 = this.getInputSizeshNQ4ISI;
        while (!mutableStateFlow4.compareAndSet(mutableStateFlow4.getValue(), java.lang.Boolean.valueOf(shouldHideAddBankManual))) {
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow5 = this.getInputFormats;
        while (!mutableStateFlow5.compareAndSet(mutableStateFlow5.getValue(), java.lang.Boolean.valueOf(isBackButtonEnabled))) {
        }
    }

    public final void setAddBankConfig(com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConfig, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig> mutableStateFlow = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), addBankConfig)) {
        }
    }

    public final void finishFlowWithResult(final com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.$r8$lambda$VO8t3PJ6Lv7eGJcVtqLQaXtYl8Q(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VO8t3PJ6Lv7eGJcVtqLQaXtYl8Q(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome outcome, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.setResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult(outcome));
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.wallet.ui.Destination.class));
        return kotlin.Unit.INSTANCE;
    }
}

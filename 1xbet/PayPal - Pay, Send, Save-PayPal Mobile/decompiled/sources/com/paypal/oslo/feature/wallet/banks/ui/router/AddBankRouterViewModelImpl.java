package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00188\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/router/AddBankRouterViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/AddBankRouterViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "config", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;)V", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "handleFlowResult", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "resetNavigation", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/model/AddBankMethod;", "getAddBankMethod$wallet_prodRelease", "()Lcom/paypal/oslo/feature/wallet/banks/ui/router/model/AddBankMethod;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/AddBankNavEvent;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "navEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getNavEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public class AddBankRouterViewModelImpl extends com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> getHighSpeedVideoSizes;
    private com.paypal.oslo.feature.wallet.wallet.ui.Destination getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> navEvent;

    @javax.inject.Inject
    public AddBankRouterViewModelImpl() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.navEvent = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModel
    public kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> getNavEvent() {
        return this.navEvent;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModel
    public void initialize(com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig config, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext) {
        com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual addBankManual;
        com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent value;
        com.paypal.oslo.feature.wallet.wallet.ui.Destination destination;
        com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId addBankConsentFlowContentId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter initialized with flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Flow", analyticsContext.getFlow())), null, 4, null);
        int i = com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModelImpl.WhenMappings.$EnumSwitchMapping$1[getAddBankMethod$wallet_prodRelease().ordinal()];
        if (i == 1) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter routing to manual entry", null, null, 6, null);
            addBankManual = com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddBankManual.INSTANCE;
        } else if (i == 2) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter routing to manual entry via web", null, null, 6, null);
            addBankManual = com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank.INSTANCE;
        } else if (i == 3) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter routing to website-based bank linking", null, null, 6, null);
            addBankManual = com.paypal.oslo.feature.wallet.wallet.ui.Destination.LoginToBankFromBank.INSTANCE;
        } else if (i == 4) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter routing to consent screen", null, null, 6, null);
            if (com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModelImpl.WhenMappings.$EnumSwitchMapping$0[analyticsContext.getFlow().ordinal()] == 1) {
                addBankConsentFlowContentId = com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.ONBOARDING_FAB;
            } else {
                addBankConsentFlowContentId = com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_FAB;
            }
            addBankManual = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen(addBankConsentFlowContentId, analyticsContext, config, (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount) null, (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter routing to consent screen for unknown method", null, null, 6, null);
            addBankManual = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen(com.paypal.oslo.feature.wallet.banks.ui.consent.model.AddBankConsentFlowContentId.DEFAULT_FAB, analyticsContext, config, (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount) null, (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationAggregatorParams) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        this.getHighSpeedVideoFpsRanges = addBankManual;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter navigating to entry point", null, null, 6, null);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            destination = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(destination, "");
        } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent.NavigateToEntryPoint(destination)));
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModel
    public void handleFlowResult(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result) {
        com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent value;
        com.paypal.oslo.feature.wallet.wallet.ui.Destination destination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "AddBankRouter flow completed with result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", result)), null, 4, null);
        if ((result.getOutcome() instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) && ((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) result.getOutcome()).getRestartFlow()) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> mutableStateFlow = this.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow.getValue();
                destination = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNull(destination, "");
            } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent.NavigateToEntryPoint(destination)));
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> mutableStateFlow2 = this.getHighSpeedVideoSizes;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent.ExitFlow(result))) {
        }
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.AddBankRouterViewModel
    public void resetNavigation() {
        if (this.getHighSpeedVideoSizes.getValue() != null) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.AddBankNavEvent> mutableStateFlow = this.getHighSpeedVideoSizes;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
            }
        }
    }

    public com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod getAddBankMethod$wallet_prodRelease() {
        return com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.OPEN_BANKING;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.ONBOARDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.values().length];
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.MANUAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.MANUAL_VIA_WEB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.WEBSITE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.OPEN_BANKING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.wallet.banks.ui.router.model.AddBankMethod.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}

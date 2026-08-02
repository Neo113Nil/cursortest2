package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00158\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationRouterViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationRouterViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "config", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;)V", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "handleFlowResult", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "resetNavigation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "navEvent", "Lkotlinx/coroutines/flow/StateFlow;", "getNavEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/wallet/ui/Destination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public class InstantBankConfirmationRouterViewModelImpl extends com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel {
    public static final int $stable = 8;
    private com.paypal.oslo.feature.wallet.wallet.ui.Destination getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> navEvent;

    @javax.inject.Inject
    public InstantBankConfirmationRouterViewModelImpl() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.navEvent = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel
    public kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> getNavEvent() {
        return this.navEvent;
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel
    public void initialize(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig config, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext) {
        com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent value;
        com.paypal.oslo.feature.wallet.wallet.ui.Destination destination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "InstantBankConfirmationRouter initialized with flow", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Flow", analyticsContext.getFlow())), null, 4, null);
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.OBConsentScreen(com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelKt.access$toConsentFlowId(analyticsContext.getFlow(), config.getConfirmFlowType()), analyticsContext, new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(true, true, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null)), new com.paypal.oslo.feature.wallet.banks.domain.model.BankAccount(config.getBankId(), "", config.getAccountType(), config.getLast4Chars(), (com.paypal.oslo.feature.wallet.banks.domain.model.BankImage) null, (java.lang.String) null, (com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountConfirmationDetails) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModelKt.access$toInstantBankConfirmationAggregatorParams(config, analyticsContext.getFlow()));
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        do {
            value = mutableStateFlow.getValue();
            destination = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(destination, "");
        } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint(destination)));
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel
    public void handleFlowResult(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result) {
        com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent value;
        com.paypal.oslo.feature.wallet.wallet.ui.Destination destination;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "InstantBankConfirmationRouter flow completed with result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", result)), null, 4, null);
        if ((result.getOutcome() instanceof com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) && ((com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Error) result.getOutcome()).getRestartFlow()) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
                destination = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(destination, "");
            } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.NavigateToEntryPoint(destination)));
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent.ExitFlow(result))) {
        }
    }

    @Override // com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationRouterViewModel
    public void resetNavigation() {
        if (this.getHighSpeedVideoFpsRangesFor.getValue() != null) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), null)) {
            }
        }
    }
}

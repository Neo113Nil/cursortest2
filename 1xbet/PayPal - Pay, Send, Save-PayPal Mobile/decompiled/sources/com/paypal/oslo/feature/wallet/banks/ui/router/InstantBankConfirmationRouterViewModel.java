package com.paypal.oslo.feature.wallet.banks.ui.router;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0003R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationRouterViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;", "config", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmBankConfig;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;)V", "Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;", "result", "handleFlowResult", "(Lcom/paypal/oslo/feature/wallet/banks/navigation/result/BankFlowNavResult;)V", "resetNavigation", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/banks/ui/router/InstantBankConfirmationNavEvent;", "getNavEvent", "()Lkotlinx/coroutines/flow/StateFlow;", "navEvent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class InstantBankConfirmationRouterViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    public abstract kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.banks.ui.router.InstantBankConfirmationNavEvent> getNavEvent();

    public abstract void handleFlowResult(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult result);

    public abstract void initialize(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmBankConfig config, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext);

    public abstract void resetNavigation();
}

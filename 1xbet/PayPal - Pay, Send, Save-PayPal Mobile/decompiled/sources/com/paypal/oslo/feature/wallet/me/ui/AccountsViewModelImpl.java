package com.paypal.oslo.feature.wallet.me.ui;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\"8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\"8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/ui/AccountsViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/me/ui/AccountsViewModel;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "features", "Lcom/paypal/oslo/feature/wallet/me/domain/usecase/DefaultProductsUseCase;", "defaultProductsUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/feature/wallet/me/domain/usecase/WalletComponentsUseCase;", "walletComponentsUseCase", "<init>", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;Lcom/paypal/oslo/feature/wallet/me/domain/usecase/DefaultProductsUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/feature/wallet/me/domain/usecase/WalletComponentsUseCase;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fi/AddFIFlowNavResult;", "result", "", "addFIUpdated", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fi/AddFIFlowNavResult;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/BankDetailsNavResult;", "bankDetailsUpdated", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/BankDetailsNavResult;)V", "Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;", "type", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult;", "paymentPreferenceUpdated", "(Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreference$Type;Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult;)V", "clearNotification", "()V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/me/ui/AccountsViewModel$UiState$Notification;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "notification", "Lkotlinx/coroutines/flow/StateFlow;", "getNotification", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/me/ui/AccountsViewModel$UiState;", "uiState", "getUiState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccountsViewModelImpl extends com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification> notification;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState> uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public AccountsViewModelImpl(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase defaultProductsUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase walletComponentsUseCase) {
        super(appNavigator, walletFeatureManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultProductsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletComponentsUseCase, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.notification = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.uiState = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.combine(walletComponentsUseCase.invoke("OSLO_ACCOUNTS_L1_SCREEN", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.me.domain.Product.Type[]{com.paypal.oslo.feature.wallet.me.domain.Product.Type.BALANCE, com.paypal.oslo.feature.wallet.me.domain.Product.Type.REWARDS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.BUY_NOW_PAY_LATER, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_CASHBACK_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EBAY_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EXTRAS_MASTERCARD, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_SMART_CONNECT, com.paypal.oslo.feature.wallet.me.domain.Product.Type.CRYPTO, com.paypal.oslo.feature.wallet.me.domain.Product.Type.DEBIT_INSTRUMENTS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.SAVINGS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.MONEY_POOLS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_BANKS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_CARDS, com.paypal.oslo.feature.wallet.me.domain.Product.Type.LINKED_3P_LOYALTY})), defaultProductsUseCase.invoke(), new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl$uiState$1(formatCurrencyUseCase, null)), androidx.view.ViewModelKt.getViewModelScope(this), kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 5000L, 0L, 2, null), com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Loading.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification> getNotification() {
        return this.notification;
    }

    @Override // com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState> getUiState() {
        return this.uiState;
    }

    @Override // com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel
    public final void addFIUpdated(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome outcome = result.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Success) {
            java.lang.Integer toastMessage = ((com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.Outcome.Success) outcome).getToastMessage();
            if (toastMessage != null) {
                this.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(toastMessage.intValue(), new java.lang.Object[0])));
                return;
            }
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Received unsupported add FI flow nav result.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("navResult", result)), null, 4, null);
    }

    @Override // com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel
    public final void bankDetailsUpdated(com.paypal.oslo.feature.wallet.api.navigation.result.banks.BankDetailsNavResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.BankDetailsNavResult.Outcome outcome = result.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.BankDetailsNavResult.Outcome.BankRemoved) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
            int i = com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_removed_toast;
            com.paypal.oslo.feature.wallet.api.navigation.result.banks.BankDetailsNavResult.Outcome.BankRemoved bankRemoved = (com.paypal.oslo.feature.wallet.api.navigation.result.banks.BankDetailsNavResult.Outcome.BankRemoved) outcome;
            java.lang.String name2 = bankRemoved.getName();
            java.lang.String accountType = bankRemoved.getAccountType();
            java.lang.String last4Chars = bankRemoved.getLast4Chars();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(name2);
            sb.append(" ");
            sb.append(accountType);
            sb.append(" ••");
            sb.append(last4Chars);
            mutableStateFlow.setValue(new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i, sb.toString())));
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(outcome, com.paypal.oslo.feature.wallet.api.navigation.result.banks.BankDetailsNavResult.Outcome.None.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel
    public final void paymentPreferenceUpdated(com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type type, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult result) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome outcome = result.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success) {
            int i2 = com.paypal.oslo.feature.wallet.me.ui.AccountsViewModelImpl.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 == 1) {
                i = com.paypal.oslo.feature.wallet.R.string.feature_wallet_me_payment_online_preference_saved;
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                i = com.paypal.oslo.feature.wallet.R.string.feature_wallet_preferred_instore_confirmation_success;
            }
            this.getHighSpeedVideoFpsRanges.setValue(new com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel.UiState.Notification(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i, ((com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success) outcome).getPreferredInstrument().getDisplayName())));
            return;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "Received unsupported payment preference nav result.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("navResult", result)), null, 4, null);
    }

    @Override // com.paypal.oslo.feature.wallet.me.ui.AccountsViewModel
    public final void clearNotification() {
        this.getHighSpeedVideoFpsRanges.setValue(null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type.ONLINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreference.Type.IN_STORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}

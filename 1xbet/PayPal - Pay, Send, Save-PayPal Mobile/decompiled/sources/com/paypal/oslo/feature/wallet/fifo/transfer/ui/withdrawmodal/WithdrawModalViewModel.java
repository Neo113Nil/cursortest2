package com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawModalViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/usecase/GetEligibilityUseCase;", "getEligibilityUseCase", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "walletFeatureManager", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/usecase/GetEligibilityUseCase;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)V", "", "getWithdrawEligibility", "()V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/usecase/GetEligibilityUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/withdrawmodal/WithdrawalModalState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WithdrawModalViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState> state;

    @javax.inject.Inject
    public WithdrawModalViewModel(com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase getEligibilityUseCase, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getEligibilityUseCase;
        this.Camera2StreamConfigurationMap = walletFeatureManager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawalModalState> getState() {
        return this.state;
    }

    public final void getWithdrawEligibility() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel$getWithdrawEligibility$1(this, null), 3, null);
    }

    public static final /* synthetic */ java.util.List access$getWithdrawMoneyOptions(com.paypal.oslo.feature.wallet.fifo.transfer.ui.withdrawmodal.WithdrawModalViewModel withdrawModalViewModel, com.paypal.oslo.feature.wallet.fifo.common.domain.model.BalanceAddWithdrawEligibility balanceAddWithdrawEligibility) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (balanceAddWithdrawEligibility.getBalanceWithdrawalEligibility()) {
            arrayList.add(new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel(com.paypal.pds.core.Icon.Bank.INSTANCE, "Withdraw Money", com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_money_bank, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.TRANSFER_TO_FI));
        }
        if (withdrawModalViewModel.Camera2StreamConfigurationMap.isSavingsEnabled()) {
            arrayList.add(new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionsModel(com.paypal.pds.core.Icon.Safe.INSTANCE, "Savings Account", com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_paypal_savings, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyOptionType.SAVINGS));
        }
        return arrayList;
    }
}

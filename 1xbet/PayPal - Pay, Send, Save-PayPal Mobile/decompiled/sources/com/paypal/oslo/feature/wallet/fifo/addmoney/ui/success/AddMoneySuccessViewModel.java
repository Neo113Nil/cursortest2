package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.success;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/success/AddMoneySuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "walletFeatureManager", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "addMoneyConfig", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "shouldShowAutoReloadFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getShouldShowAutoReloadFlow", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddMoneySuccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> shouldShowAutoReloadFlow;

    @javax.inject.Inject
    public AddMoneySuccessViewModel(com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        this.getHighSpeedVideoFpsRanges = walletFeatureManager;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.shouldShowAutoReloadFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShouldShowAutoReloadFlow() {
        return this.shouldShowAutoReloadFlow;
    }

    public final void initialize(com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(addMoneyConfig.getShowPostAddMoneyFlow() && !this.getHighSpeedVideoFpsRanges.isLowBalanceReloadEnabled()));
    }
}

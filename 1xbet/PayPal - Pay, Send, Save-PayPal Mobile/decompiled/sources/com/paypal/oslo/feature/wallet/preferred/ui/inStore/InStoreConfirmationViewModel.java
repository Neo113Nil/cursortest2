package com.paypal.oslo.feature.wallet.preferred.ui.inStore;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/inStore/InStoreConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "enabled", "", "onUseForOnlinePaymentsChange", "(Z)V", "Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "paymentMethod", "setPaymentMethod$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/inStore/InStoreConfirmationViewModel$ScreenState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "screenState", "Lkotlinx/coroutines/flow/StateFlow;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "ScreenState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class InStoreConfirmationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState> screenState;

    @javax.inject.Inject
    public InStoreConfirmationViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState(new com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel("wells_fargo", com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.BANK, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Wells Fargo"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Checking ••••234"), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null), false));
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.screenState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState> getScreenState() {
        return this.screenState;
    }

    public final void onUseForOnlinePaymentsChange(boolean enabled) {
        com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState.copy$default(value, null, enabled, 1, null)));
    }

    public final void setPaymentMethod$wallet_prodRelease(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethod) {
        com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethod, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState.copy$default(value, paymentMethod, false, 2, null)));
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/ui/inStore/InStoreConfirmationViewModel$ScreenState;", "", "Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "selectedPaymentMethod", "", "useForOnlinePayments", "<init>", "(Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;Z)V", "component1", "()Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;Z)Lcom/paypal/oslo/feature/wallet/preferred/ui/inStore/InStoreConfirmationViewModel$ScreenState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/preferred/ui/common/model/PaymentMethodUiModel;", "getSelectedPaymentMethod", "Z", "getUseForOnlinePayments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel selectedPaymentMethod;
        private final boolean useForOnlinePayments;

        public ScreenState(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethodUiModel, "");
            this.selectedPaymentMethod = paymentMethodUiModel;
            this.useForOnlinePayments = z;
        }

        public /* synthetic */ ScreenState(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentMethodUiModel, (i & 2) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel getSelectedPaymentMethod() {
            return this.selectedPaymentMethod;
        }

        public final boolean getUseForOnlinePayments() {
            return this.useForOnlinePayments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel = this.selectedPaymentMethod;
            boolean z = this.useForOnlinePayments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenState(selectedPaymentMethod=");
            sb.append(paymentMethodUiModel);
            sb.append(", useForOnlinePayments=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.selectedPaymentMethod.hashCode() * 31) + java.lang.Boolean.hashCode(this.useForOnlinePayments);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState screenState = (com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.selectedPaymentMethod, screenState.selectedPaymentMethod) && this.useForOnlinePayments == screenState.useForOnlinePayments;
        }

        public final com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState copy(com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel selectedPaymentMethod, boolean useForOnlinePayments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedPaymentMethod, "");
            return new com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState(selectedPaymentMethod, useForOnlinePayments);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getUseForOnlinePayments() {
            return this.useForOnlinePayments;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel getSelectedPaymentMethod() {
            return this.selectedPaymentMethod;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState copy$default(com.paypal.oslo.feature.wallet.preferred.ui.inStore.InStoreConfirmationViewModel.ScreenState screenState, com.paypal.oslo.feature.wallet.preferred.ui.common.model.PaymentMethodUiModel paymentMethodUiModel, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentMethodUiModel = screenState.selectedPaymentMethod;
            }
            if ((i & 2) != 0) {
                z = screenState.useForOnlinePayments;
            }
            return screenState.copy(paymentMethodUiModel, z);
        }
    }
}

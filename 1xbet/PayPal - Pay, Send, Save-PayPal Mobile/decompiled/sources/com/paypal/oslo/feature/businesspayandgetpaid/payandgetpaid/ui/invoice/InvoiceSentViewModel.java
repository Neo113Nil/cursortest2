package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceSentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/InvoiceSentDestination;", "destination", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/InvoiceSentDestination;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/InvoiceSentDestination;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceSentUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceSentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceSentViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/InvoiceSentDestination;", "destination", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceSentViewModel;", "create", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/navigation/InvoiceSentDestination;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/InvoiceSentViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination destination);
    }

    @dagger.assisted.AssistedInject
    public InvoiceSentViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.navigation.InvoiceSentDestination invoiceSentDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceSentDestination, "");
        this.getHighSpeedVideoFpsRanges = invoiceSentDestination;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney total = invoiceSentDestination.getInvoice().getTotal();
        com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer = invoiceSentDestination.getInvoice().getCustomer();
        java.lang.String name2 = customer != null ? customer.getName() : null;
        name2 = name2 == null ? "" : name2;
        java.lang.String shareUrl = invoiceSentDestination.getInvoice().getShareUrl();
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState(total, name2, shareUrl != null ? shareUrl : ""));
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceSentUiState> getUiState() {
        return this.uiState;
    }
}

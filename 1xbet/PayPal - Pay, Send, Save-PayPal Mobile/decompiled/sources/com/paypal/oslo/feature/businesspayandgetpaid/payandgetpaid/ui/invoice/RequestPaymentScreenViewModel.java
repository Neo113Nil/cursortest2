package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001*B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/SendInvoiceUseCase;", "sendInvoiceUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/UpdateInvoiceUseCase;", "updateInvoiceUseCase", "<init>", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/SendInvoiceUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/UpdateInvoiceUseCase;)V", "", "sendInvoiceOrNavigateToAddCustomer", "()V", "sendInvoice", "Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;", "customer", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/api/domain/model/Customer;)V", "shareLink", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/SendInvoiceUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/usecase/UpdateInvoiceUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentScreenUiState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "effects", "Lkotlinx/coroutines/flow/Flow;", "getEffects", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RequestPaymentScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect> effects;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentScreenViewModel$Factory;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentScreenViewModel;", "create", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/invoice/RequestPaymentScreenViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice);
    }

    @dagger.assisted.AssistedInject
    public RequestPaymentScreenViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.SendInvoiceUseCase sendInvoiceUseCase, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.usecase.UpdateInvoiceUseCase updateInvoiceUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendInvoiceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInvoiceUseCase, "");
        this.getHighSpeedVideoSizes = invoice;
        this.Camera2StreamConfigurationMap = sendInvoiceUseCase;
        this.getHighSpeedVideoFpsRanges = updateInvoiceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState(invoice, false));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
        this.getHighSpeedVideoFpsRangesFor = Channel$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentUiEffect> getEffects() {
        return this.effects;
    }

    public final void sendInvoiceOrNavigateToAddCustomer() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$sendInvoiceOrNavigateToAddCustomer$1(this, null), 3, null);
    }

    public final void sendInvoice() {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState.copy$default(value, null, true, 1, null)));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$sendInvoice$2(this, null), 3, null);
    }

    public final void sendInvoice(com.paypal.oslo.feature.businesspayandgetpaid.api.domain.model.Customer customer) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState requestPaymentScreenUiState;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
            requestPaymentScreenUiState = value;
            copy = r3.copy((r18 & 1) != 0 ? r3.id : null, (r18 & 2) != 0 ? r3.currency : null, (r18 & 4) != 0 ? r3.customer : customer, (r18 & 8) != 0 ? r3.status : null, (r18 & 16) != 0 ? r3.items : null, (r18 & 32) != 0 ? r3.note : null, (r18 & 64) != 0 ? r3.configuration : null, (r18 & 128) != 0 ? requestPaymentScreenUiState.getInvoice().shareUrl : null);
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState.copy$default(requestPaymentScreenUiState, copy, false, 2, null)));
        sendInvoice();
    }

    public final void shareLink() {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenUiState.copy$default(value, null, true, 1, null)));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.RequestPaymentScreenViewModel$shareLink$2(this, null), 3, null);
    }
}

package com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/scamalert/viewmodel/ScamAlertViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePaymentContingencyUseCase;", "resolvePaymentContingencyUseCase", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getPaymentTransferAttemptUseCase", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePaymentContingencyUseCase;Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;)V", "Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;", "customerChoice", "", "resolveScamContingency", "(Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/domain/usecase/ResolvePaymentContingencyUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/usecase/GetPaymentTransferAttemptUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRanges", "isResolved"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScamAlertViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isResolved;

    @javax.inject.Inject
    public ScamAlertViewModel(com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase resolvePaymentContingencyUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvePaymentContingencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentTransferAttemptUseCase, "");
        this.Camera2StreamConfigurationMap = resolvePaymentContingencyUseCase;
        this.getHighSpeedVideoFpsRangesFor = getPaymentTransferAttemptUseCase;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.isLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getHighSpeedVideoSizes = MutableStateFlow2;
        this.isResolved = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return this.isLoading;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isResolved() {
        return this.isResolved;
    }

    public final void resolveScamContingency(com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice customerChoice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerChoice, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.p2p.ui.scamalert.viewmodel.ScamAlertViewModel$resolveScamContingency$1(this, customerChoice, null), 3, null);
    }
}

package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 12\u00020\u0001:\u000221B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R \u0010-\u001a\b\u0012\u0004\u0012\u00020)0,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/PurchaseDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "", "rawPurchaseId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetPurchaseDetailsUseCase;", "getPurchaseDetailsUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/SendReceiptUseCase;", "sendReceiptUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/RefundPurchaseUseCase;", "refundPurchaseUseCase", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetPurchaseDetailsUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/SendReceiptUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/RefundPurchaseUseCase;)V", "", "onRefundClick", "()V", "onRefundCancelled", "onRefundConfirmed", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Recipient;", "recipient", "sendReceipt", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Recipient;)V", "onToastDismissed", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetPurchaseDetailsUseCase;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/usecase/SendReceiptUseCase;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/RefundPurchaseUseCase;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseManagementUiState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/PurchaseDetailsEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "Companion", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PurchaseDetailsViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseDetailsEffect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseDetailsEffect> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> uiState;
    public static final int $stable = 8;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/PurchaseDetailsViewModel$Factory;", "", "", "purchaseId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/PurchaseDetailsViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/PurchaseDetailsViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel create(java.lang.String purchaseId);
    }

    @dagger.assisted.AssistedInject
    public PurchaseDetailsViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase getPurchaseDetailsUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase sendReceiptUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase refundPurchaseUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPurchaseDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendReceiptUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundPurchaseUseCase, "");
        this.getHighSpeedVideoFpsRanges = getPurchaseDetailsUseCase;
        this.Camera2StreamConfigurationMap = sendReceiptUseCase;
        this.getHighSpeedVideoFpsRangesFor = refundPurchaseUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.text.StringsKt.removePrefix(str, (java.lang.CharSequence) "ZCON-");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState(null, true, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, null, 2097149, null));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseDetailsEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$loadPurchaseDetails$1(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r0.emit(r5, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r2 != r4) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$sendReceiptToEmail(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel purchaseDetailsViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceiptToEmail$1 purchaseDetailsViewModel$sendReceiptToEmail$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState value2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy2;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceiptToEmail$1) {
            purchaseDetailsViewModel$sendReceiptToEmail$1 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceiptToEmail$1) continuation;
            if ((purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = purchaseDetailsViewModel$sendReceiptToEmail$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase sendReceiptUseCase = purchaseDetailsViewModel.Camera2StreamConfigurationMap;
                    java.lang.String str3 = purchaseDetailsViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    purchaseDetailsViewModel$sendReceiptToEmail$1.Camera2StreamConfigurationMap = str2;
                    purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoSizes = 1;
                    obj = sendReceiptUseCase.invoke(str3, str2, purchaseDetailsViewModel$sendReceiptToEmail$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoFpsRanges;
                        int i3 = purchaseDetailsViewModel$sendReceiptToEmail$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    str2 = (java.lang.String) purchaseDetailsViewModel$sendReceiptToEmail$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> mutableStateFlow = purchaseDetailsViewModel.getHighSpeedVideoSizes;
                    do {
                        value2 = mutableStateFlow.getValue();
                        copy2 = r8.copy((r39 & 1) != 0 ? r8.paymentId : null, (r39 & 2) != 0 ? r8.isLoading : false, (r39 & 4) != 0 ? r8.receipt : null, (r39 & 8) != 0 ? r8.status : null, (r39 & 16) != 0 ? r8.items : null, (r39 & 32) != 0 ? r8.issuedDate : null, (r39 & 64) != 0 ? r8.amountPaidFormatted : null, (r39 & 128) != 0 ? r8.subtotalFormatted : null, (r39 & 256) != 0 ? r8.feeFormatted : null, (r39 & 512) != 0 ? r8.netAmountFormatted : null, (r39 & 1024) != 0 ? r8.taxFormatted : null, (r39 & 2048) != 0 ? r8.totalFormatted : null, (r39 & 4096) != 0 ? r8.toastMessage : kotlin.coroutines.jvm.internal.Boxing.boxInt(com.paypal.oslo.feature.businesspayandgetpaid.R.string.feature_business_pay_and_get_paid_receipt_sent), (r39 & 8192) != 0 ? r8.isSendingReceipt : false, (r39 & 16384) != 0 ? r8.isRefunding : false, (r39 & 32768) != 0 ? r8.showRefundConfirmation : false, (r39 & 65536) != 0 ? r8.showRefundError : false, (r39 & 131072) != 0 ? r8.showSendReceiptError : false, (r39 & 262144) != 0 ? r8.canRefund : false, (r39 & 524288) != 0 ? r8.isRefundPurchase : false, (r39 & 1048576) != 0 ? value2.originalPurchaseUuid : null);
                    } while (!mutableStateFlow.compareAndSet(value2, copy2));
                    kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseDetailsEffect> mutableSharedFlow = purchaseDetailsViewModel.getOutputMinFrameDuration;
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseDetailsEffect.SendReceiptSuccess sendReceiptSuccess = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseDetailsEffect.SendReceiptSuccess(str2);
                    purchaseDetailsViewModel$sendReceiptToEmail$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    purchaseDetailsViewModel$sendReceiptToEmail$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoFpsRanges = 0;
                    purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoSizes = 2;
                } else if (either instanceof arrow.core.Either.Left) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> mutableStateFlow2 = purchaseDetailsViewModel.getHighSpeedVideoSizes;
                    do {
                        value = mutableStateFlow2.getValue();
                        copy = r2.copy((r39 & 1) != 0 ? r2.paymentId : null, (r39 & 2) != 0 ? r2.isLoading : false, (r39 & 4) != 0 ? r2.receipt : null, (r39 & 8) != 0 ? r2.status : null, (r39 & 16) != 0 ? r2.items : null, (r39 & 32) != 0 ? r2.issuedDate : null, (r39 & 64) != 0 ? r2.amountPaidFormatted : null, (r39 & 128) != 0 ? r2.subtotalFormatted : null, (r39 & 256) != 0 ? r2.feeFormatted : null, (r39 & 512) != 0 ? r2.netAmountFormatted : null, (r39 & 1024) != 0 ? r2.taxFormatted : null, (r39 & 2048) != 0 ? r2.totalFormatted : null, (r39 & 4096) != 0 ? r2.toastMessage : null, (r39 & 8192) != 0 ? r2.isSendingReceipt : false, (r39 & 16384) != 0 ? r2.isRefunding : false, (r39 & 32768) != 0 ? r2.showRefundConfirmation : false, (r39 & 65536) != 0 ? r2.showRefundError : false, (r39 & 131072) != 0 ? r2.showSendReceiptError : true, (r39 & 262144) != 0 ? r2.canRefund : false, (r39 & 524288) != 0 ? r2.isRefundPurchase : false, (r39 & 1048576) != 0 ? value.originalPurchaseUuid : null);
                    } while (!mutableStateFlow2.compareAndSet(value, copy));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        purchaseDetailsViewModel$sendReceiptToEmail$1 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceiptToEmail$1(purchaseDetailsViewModel, continuation);
        java.lang.Object obj2 = purchaseDetailsViewModel$sendReceiptToEmail$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = purchaseDetailsViewModel$sendReceiptToEmail$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseDetailsEffect> getEffect() {
        return this.effect;
    }

    public final void onRefundClick() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy;
        if (this.uiState.getValue().getCanRefund()) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r39 & 1) != 0 ? r3.paymentId : null, (r39 & 2) != 0 ? r3.isLoading : false, (r39 & 4) != 0 ? r3.receipt : null, (r39 & 8) != 0 ? r3.status : null, (r39 & 16) != 0 ? r3.items : null, (r39 & 32) != 0 ? r3.issuedDate : null, (r39 & 64) != 0 ? r3.amountPaidFormatted : null, (r39 & 128) != 0 ? r3.subtotalFormatted : null, (r39 & 256) != 0 ? r3.feeFormatted : null, (r39 & 512) != 0 ? r3.netAmountFormatted : null, (r39 & 1024) != 0 ? r3.taxFormatted : null, (r39 & 2048) != 0 ? r3.totalFormatted : null, (r39 & 4096) != 0 ? r3.toastMessage : null, (r39 & 8192) != 0 ? r3.isSendingReceipt : false, (r39 & 16384) != 0 ? r3.isRefunding : false, (r39 & 32768) != 0 ? r3.showRefundConfirmation : true, (r39 & 65536) != 0 ? r3.showRefundError : false, (r39 & 131072) != 0 ? r3.showSendReceiptError : false, (r39 & 262144) != 0 ? r3.canRefund : false, (r39 & 524288) != 0 ? r3.isRefundPurchase : false, (r39 & 1048576) != 0 ? value.originalPurchaseUuid : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
        }
    }

    public final void onRefundCancelled() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r39 & 1) != 0 ? r3.paymentId : null, (r39 & 2) != 0 ? r3.isLoading : false, (r39 & 4) != 0 ? r3.receipt : null, (r39 & 8) != 0 ? r3.status : null, (r39 & 16) != 0 ? r3.items : null, (r39 & 32) != 0 ? r3.issuedDate : null, (r39 & 64) != 0 ? r3.amountPaidFormatted : null, (r39 & 128) != 0 ? r3.subtotalFormatted : null, (r39 & 256) != 0 ? r3.feeFormatted : null, (r39 & 512) != 0 ? r3.netAmountFormatted : null, (r39 & 1024) != 0 ? r3.taxFormatted : null, (r39 & 2048) != 0 ? r3.totalFormatted : null, (r39 & 4096) != 0 ? r3.toastMessage : null, (r39 & 8192) != 0 ? r3.isSendingReceipt : false, (r39 & 16384) != 0 ? r3.isRefunding : false, (r39 & 32768) != 0 ? r3.showRefundConfirmation : false, (r39 & 65536) != 0 ? r3.showRefundError : false, (r39 & 131072) != 0 ? r3.showSendReceiptError : false, (r39 & 262144) != 0 ? r3.canRefund : false, (r39 & 524288) != 0 ? r3.isRefundPurchase : false, (r39 & 1048576) != 0 ? value.originalPurchaseUuid : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onRefundConfirmed() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$onRefundConfirmed$1(this, null), 3, null);
    }

    public final void sendReceipt(com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipient, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel$sendReceipt$1(this, recipient, null), 3, null);
    }

    public final void onToastDismissed() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.PurchaseManagementUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r39 & 1) != 0 ? r3.paymentId : null, (r39 & 2) != 0 ? r3.isLoading : false, (r39 & 4) != 0 ? r3.receipt : null, (r39 & 8) != 0 ? r3.status : null, (r39 & 16) != 0 ? r3.items : null, (r39 & 32) != 0 ? r3.issuedDate : null, (r39 & 64) != 0 ? r3.amountPaidFormatted : null, (r39 & 128) != 0 ? r3.subtotalFormatted : null, (r39 & 256) != 0 ? r3.feeFormatted : null, (r39 & 512) != 0 ? r3.netAmountFormatted : null, (r39 & 1024) != 0 ? r3.taxFormatted : null, (r39 & 2048) != 0 ? r3.totalFormatted : null, (r39 & 4096) != 0 ? r3.toastMessage : null, (r39 & 8192) != 0 ? r3.isSendingReceipt : false, (r39 & 16384) != 0 ? r3.isRefunding : false, (r39 & 32768) != 0 ? r3.showRefundConfirmation : false, (r39 & 65536) != 0 ? r3.showRefundError : false, (r39 & 131072) != 0 ? r3.showSendReceiptError : false, (r39 & 262144) != 0 ? r3.canRefund : false, (r39 & 524288) != 0 ? r3.isRefundPurchase : false, (r39 & 1048576) != 0 ? value.originalPurchaseUuid : null);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }
}

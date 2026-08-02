package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001AB3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0010J\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u0010J\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001aJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00102R\u001d\u00105\u001a\b\u0012\u0004\u0012\u000201048\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010;R \u0010=\u001a\b\u0012\u0004\u0012\u00020:0<8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "", "invoiceId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetInvoiceDetailsUseCase;", "getInvoiceDetailsUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetInvoiceConditionalRulesUseCase;", "getInvoiceConditionalRulesUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/SendInvoiceReminderUseCase;", "sendInvoiceReminderUseCase", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/CancelInvoiceUseCase;", "cancelInvoiceUseCase", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetInvoiceDetailsUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetInvoiceConditionalRulesUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/SendInvoiceReminderUseCase;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/CancelInvoiceUseCase;)V", "", "onRetryClick", "()V", "onDismissError", "Lkotlinx/coroutines/Job;", "onBackClick", "()Lkotlinx/coroutines/Job;", "onSendReminderClick", "onReminderConfirmationDismiss", "", "checked", "onSendCopyOnReminderChanged", "(Z)V", "onConfirmSendReminder", "onCancelInvoiceClick", "onCancelConfirmationDismiss", "onSendCopyChanged", "onConfirmCancelInvoice", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;", "action", "onInvoiceAction", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;)Lkotlinx/coroutines/Job;", "getOutputFormats", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetInvoiceDetailsUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/GetInvoiceConditionalRulesUseCase;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/SendInvoiceReminderUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/usecase/CancelInvoiceUseCase;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/InvoiceManagementUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvoiceDetailsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> getInputFormats;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceDetailsUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect> getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.SendInvoiceReminderUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsViewModel$Factory;", "", "", "invoiceId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsViewModel;", "create", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/viewmodel/InvoiceDetailsViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel create(java.lang.String invoiceId);
    }

    @dagger.assisted.AssistedInject
    public InvoiceDetailsViewModel(@dagger.assisted.Assisted java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceDetailsUseCase getInvoiceDetailsUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase getInvoiceConditionalRulesUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.SendInvoiceReminderUseCase sendInvoiceReminderUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.CancelInvoiceUseCase cancelInvoiceUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInvoiceDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInvoiceConditionalRulesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendInvoiceReminderUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelInvoiceUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = getInvoiceDetailsUseCase;
        this.getHighSpeedVideoFpsRanges = getInvoiceConditionalRulesUseCase;
        this.Camera2StreamConfigurationMap = sendInvoiceReminderUseCase;
        this.getHighSpeedVideoSizes = cancelInvoiceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState(null, null, true, false, false, null, false, false, false, false, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -5, 127, null));
        this.getInputFormats = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getOutputFormats = MutableSharedFlow$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadInvoice$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadConditionalRules(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel invoiceDetailsViewModel, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState invoiceManagementUiState, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadConditionalRules$1 invoiceDetailsViewModel$loadConditionalRules$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState invoiceManagementUiState2;
        arrow.core.Either either;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value2;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy2;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadConditionalRules$1) {
            invoiceDetailsViewModel$loadConditionalRules$1 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadConditionalRules$1) continuation;
            if ((invoiceDetailsViewModel$loadConditionalRules$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                invoiceDetailsViewModel$loadConditionalRules$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj3 = invoiceDetailsViewModel$loadConditionalRules$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceDetailsViewModel$loadConditionalRules$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj3);
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetInvoiceConditionalRulesUseCase getInvoiceConditionalRulesUseCase = invoiceDetailsViewModel.getHighSpeedVideoFpsRanges;
                    java.lang.String str = invoiceDetailsViewModel.getHighResolutionOutputSizeshNQ4ISI;
                    invoiceDetailsViewModel$loadConditionalRules$1.Camera2StreamConfigurationMap = invoiceManagementUiState;
                    invoiceDetailsViewModel$loadConditionalRules$1.getHighSpeedVideoSizes = 1;
                    obj3 = getInvoiceConditionalRulesUseCase.invoke(str, invoiceDetailsViewModel$loadConditionalRules$1);
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    invoiceManagementUiState2 = invoiceManagementUiState;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    invoiceManagementUiState2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState) invoiceDetailsViewModel$loadConditionalRules$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj3);
                }
                either = (arrow.core.Either) obj3;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConditionalRules invoiceConditionalRules = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConditionalRules) ((arrow.core.Either.Right) either).getValue();
                    java.util.Iterator<T> it = invoiceConditionalRules.getRules().iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule) obj2).getConditionalRuleType() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType.AUTO_CANCEL) {
                            break;
                        }
                    }
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule) obj2;
                    java.util.Iterator<T> it2 = invoiceConditionalRules.getRules().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it2.next();
                        if (((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule) next).getConditionalRuleType() == com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.ConditionalRuleType.EARLY_PAYMENT_DISCOUNT) {
                            obj = next;
                            break;
                        }
                    }
                    com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule rule2 = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Rule) obj;
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = invoiceDetailsViewModel.getInputFormats;
                    do {
                        value2 = mutableStateFlow.getValue();
                        copy2 = r6.copy((r57 & 1) != 0 ? r6.id : null, (r57 & 2) != 0 ? r6.invoiceNumber : null, (r57 & 4) != 0 ? r6.isLoading : false, (r57 & 8) != 0 ? r6.isSendingReminder : false, (r57 & 16) != 0 ? r6.isCancelling : false, (r57 & 32) != 0 ? r6.error : null, (r57 & 64) != 0 ? r6.invoiceCancelled : false, (r57 & 128) != 0 ? r6.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r6.showCancelConfirmation : false, (r57 & 512) != 0 ? r6.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r6.sendReminderAllowed : false, (r57 & 2048) != 0 ? r6.showReminderConfirmation : false, (r57 & 4096) != 0 ? r6.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r6.status : null, (r57 & 16384) != 0 ? r6.customerName : null, (r57 & 32768) != 0 ? r6.amountDueFormatted : null, (r57 & 65536) != 0 ? r6.tipAmountFormatted : null, (r57 & 131072) != 0 ? r6.tipsAllowed : false, (r57 & 262144) != 0 ? r6.amountPaidFormatted : null, (r57 & 524288) != 0 ? r6.refundedFormatted : null, (r57 & 1048576) != 0 ? r6.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r6.invoiceDate : null, (r57 & 4194304) != 0 ? r6.dueDate : null, (r57 & 8388608) != 0 ? r6.subtotalFormatted : null, (r57 & 16777216) != 0 ? r6.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r6.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r6.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r6.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r6.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r6.items : null, (r57 & 1073741824) != 0 ? r6.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r6.customerEmail : null, (r58 & 1) != 0 ? r6.customerPhones : null, (r58 & 2) != 0 ? r6.customerPhoneFormatted : null, (r58 & 4) != 0 ? r6.shareUrl : null, (r58 & 8) != 0 ? r6.actions : null, (r58 & 16) != 0 ? r6.autoCancelRule : rule, (r58 & 32) != 0 ? r6.earlyPaymentDiscountRule : rule2, (r58 & 64) != 0 ? invoiceManagementUiState2.isEarlyPaymentDiscountExpired : (rule2 == null || rule2.isApplied()) ? false : true);
                    } while (!mutableStateFlow.compareAndSet(value2, copy2));
                } else if (either instanceof arrow.core.Either.Left) {
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow2 = invoiceDetailsViewModel.getInputFormats;
                    do {
                        value = mutableStateFlow2.getValue();
                        copy = r2.copy((r57 & 1) != 0 ? r2.id : null, (r57 & 2) != 0 ? r2.invoiceNumber : null, (r57 & 4) != 0 ? r2.isLoading : false, (r57 & 8) != 0 ? r2.isSendingReminder : false, (r57 & 16) != 0 ? r2.isCancelling : false, (r57 & 32) != 0 ? r2.error : com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsError.GeneralError.INSTANCE, (r57 & 64) != 0 ? r2.invoiceCancelled : false, (r57 & 128) != 0 ? r2.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r2.showCancelConfirmation : false, (r57 & 512) != 0 ? r2.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r2.sendReminderAllowed : false, (r57 & 2048) != 0 ? r2.showReminderConfirmation : false, (r57 & 4096) != 0 ? r2.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r2.status : null, (r57 & 16384) != 0 ? r2.customerName : null, (r57 & 32768) != 0 ? r2.amountDueFormatted : null, (r57 & 65536) != 0 ? r2.tipAmountFormatted : null, (r57 & 131072) != 0 ? r2.tipsAllowed : false, (r57 & 262144) != 0 ? r2.amountPaidFormatted : null, (r57 & 524288) != 0 ? r2.refundedFormatted : null, (r57 & 1048576) != 0 ? r2.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r2.invoiceDate : null, (r57 & 4194304) != 0 ? r2.dueDate : null, (r57 & 8388608) != 0 ? r2.subtotalFormatted : null, (r57 & 16777216) != 0 ? r2.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r2.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r2.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r2.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r2.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r2.items : null, (r57 & 1073741824) != 0 ? r2.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r2.customerEmail : null, (r58 & 1) != 0 ? r2.customerPhones : null, (r58 & 2) != 0 ? r2.customerPhoneFormatted : null, (r58 & 4) != 0 ? r2.shareUrl : null, (r58 & 8) != 0 ? r2.actions : null, (r58 & 16) != 0 ? r2.autoCancelRule : null, (r58 & 32) != 0 ? r2.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
                    } while (!mutableStateFlow2.compareAndSet(value, copy));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        invoiceDetailsViewModel$loadConditionalRules$1 = new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadConditionalRules$1(invoiceDetailsViewModel, continuation);
        java.lang.Object obj32 = invoiceDetailsViewModel$loadConditionalRules$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceDetailsViewModel$loadConditionalRules$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj32;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsEffect> getEffects() {
        return this.effects;
    }

    public final void onRetryClick() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : true, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$loadInvoice$1(this, null), 3, null);
    }

    public final void onDismissError() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final kotlinx.coroutines.Job onBackClick() {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onBackClick$1(this, null), 3, null);
        return launch$default;
    }

    public final void onSendReminderClick() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : true, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onReminderConfirmationDismiss() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onSendCopyOnReminderChanged(boolean checked) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : checked, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onConfirmSendReminder() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onConfirmSendReminder$1(this, null), 3, null);
    }

    public final void onCancelInvoiceClick() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : true, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onCancelConfirmationDismiss() {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : false, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onSendCopyChanged(boolean checked) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState copy;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.InvoiceManagementUiState> mutableStateFlow = this.getInputFormats;
        do {
            value = mutableStateFlow.getValue();
            copy = r3.copy((r57 & 1) != 0 ? r3.id : null, (r57 & 2) != 0 ? r3.invoiceNumber : null, (r57 & 4) != 0 ? r3.isLoading : false, (r57 & 8) != 0 ? r3.isSendingReminder : false, (r57 & 16) != 0 ? r3.isCancelling : false, (r57 & 32) != 0 ? r3.error : null, (r57 & 64) != 0 ? r3.invoiceCancelled : false, (r57 & 128) != 0 ? r3.cancelInvoiceAllowed : false, (r57 & 256) != 0 ? r3.showCancelConfirmation : false, (r57 & 512) != 0 ? r3.sendCopyOnCancel : checked, (r57 & 1024) != 0 ? r3.sendReminderAllowed : false, (r57 & 2048) != 0 ? r3.showReminderConfirmation : false, (r57 & 4096) != 0 ? r3.sendCopyOnReminder : false, (r57 & 8192) != 0 ? r3.status : null, (r57 & 16384) != 0 ? r3.customerName : null, (r57 & 32768) != 0 ? r3.amountDueFormatted : null, (r57 & 65536) != 0 ? r3.tipAmountFormatted : null, (r57 & 131072) != 0 ? r3.tipsAllowed : false, (r57 & 262144) != 0 ? r3.amountPaidFormatted : null, (r57 & 524288) != 0 ? r3.refundedFormatted : null, (r57 & 1048576) != 0 ? r3.paidAfterRefundFormatted : null, (r57 & 2097152) != 0 ? r3.invoiceDate : null, (r57 & 4194304) != 0 ? r3.dueDate : null, (r57 & 8388608) != 0 ? r3.subtotalFormatted : null, (r57 & 16777216) != 0 ? r3.itemsDiscountFormatted : null, (r57 & 33554432) != 0 ? r3.invoiceDiscountFormatted : null, (r57 & 67108864) != 0 ? r3.shippingFeeFormatted : null, (r57 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r3.taxAmountFormatted : null, (r57 & 268435456) != 0 ? r3.totalAmountFormatted : null, (r57 & 536870912) != 0 ? r3.items : null, (r57 & 1073741824) != 0 ? r3.note : null, (r57 & Integer.MIN_VALUE) != 0 ? r3.customerEmail : null, (r58 & 1) != 0 ? r3.customerPhones : null, (r58 & 2) != 0 ? r3.customerPhoneFormatted : null, (r58 & 4) != 0 ? r3.shareUrl : null, (r58 & 8) != 0 ? r3.actions : null, (r58 & 16) != 0 ? r3.autoCancelRule : null, (r58 & 32) != 0 ? r3.earlyPaymentDiscountRule : null, (r58 & 64) != 0 ? value.isEarlyPaymentDiscountExpired : false);
        } while (!mutableStateFlow.compareAndSet(value, copy));
    }

    public final void onConfirmCancelInvoice() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onConfirmCancelInvoice$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.Job onInvoiceAction(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction action) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel$onInvoiceAction$1(this, action, null), 3, null);
        return launch$default;
    }
}

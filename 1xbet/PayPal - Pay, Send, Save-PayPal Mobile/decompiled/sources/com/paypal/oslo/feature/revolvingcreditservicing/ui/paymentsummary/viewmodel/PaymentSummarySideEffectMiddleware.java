package com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u001b\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010$\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummarySideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentSummaryUseCase;", "getPaymentSummaryUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "cancelRepaymentUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/mapper/PaymentSummaryUiModelMapper;", "paymentSummaryUiModelMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "dataInvalidationEventBus", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/mapper/PaymentSummaryUiModelMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/viewmodel/PaymentSummaryState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "p1", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "p2", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentSummaryUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/paymentsummary/mapper/PaymentSummaryUiModelMapper;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentSummarySideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper getHighResolutionOutputSizeshNQ4ISI;

    public PaymentSummarySideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase getPaymentSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper paymentSummaryUiModelMapper, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelRepaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSummaryUiModelMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInvalidationEventBus, "");
        this.Camera2StreamConfigurationMap = creditProductIdentifier;
        this.getHighSpeedVideoFpsRangesFor = getPaymentSummaryUseCase;
        this.getHighSpeedVideoFpsRanges = cancelRepaymentUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = paymentSummaryUiModelMapper;
        this.getHighSpeedVideoSizes = dataInvalidationEventBus;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState paymentSummaryState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(paymentSummaryState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState paymentSummaryState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.Pair pair;
        if (paymentSummaryState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Loading) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Loading loading = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Loading) paymentSummaryState;
            java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(function1, loading.getCreditAccountId(), loading.getPaymentSummaryOverview(), continuation);
            return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
        }
        if (!(paymentSummaryState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading)) {
            if (paymentSummaryState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelingPayment) {
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.CancelingPayment) paymentSummaryState;
                pair = kotlin.TuplesKt.to(cancelingPayment.getRepaymentId(), cancelingPayment.getCreditAccountId());
            } else {
                if (!(paymentSummaryState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.RetryCancelingPayment)) {
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.RetryCancelingPayment retryCancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.RetryCancelingPayment) paymentSummaryState;
                pair = kotlin.TuplesKt.to(retryCancelingPayment.getRepaymentId(), retryCancelingPayment.getCreditAccountId());
            }
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(function1, (java.lang.String) pair.component1(), (java.lang.String) pair.component2(), continuation);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(function1, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryState.Reloading) paymentSummaryState).getCreditAccountId(), null, continuation);
        return highSpeedVideoFpsRangesFor2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor2 : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x014e, code lost:
    
        if (r12 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0197, code lost:
    
        if (r12 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (r12 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
    
        if (r12 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, kotlin.Unit> function1, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$fetchPaymentSummary$1 paymentSummarySideEffectMiddleware$fetchPaymentSummary$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest paymentSummaryRequest;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$fetchPaymentSummary$1) {
            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$fetchPaymentSummary$1) continuation;
            if ((paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats -= 2147483648;
                java.lang.Object obj = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (paymentSummaryOverview != null && paymentSummaryOverview.hasCompleteData()) {
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryOverview);
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDuration = function1;
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats = 1;
                        obj = getHighResolutionOutputSizeshNQ4ISI(paymentSummaryOverview, str, paymentSummarySideEffectMiddleware$fetchPaymentSummary$1);
                    } else {
                        paymentSummaryRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest(this.Camera2StreamConfigurationMap, str);
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase getPaymentSummaryUseCase = this.getHighSpeedVideoFpsRangesFor;
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor = function1;
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoSizes = str;
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryOverview);
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryRequest);
                        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats = 2;
                        obj = getPaymentSummaryUseCase.invoke(paymentSummaryRequest, paymentSummarySideEffectMiddleware$fetchPaymentSummary$1);
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    function1 = (kotlin.jvm.functions.Function1) paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1.invoke(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest paymentSummaryRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest) paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDuration;
                    paymentSummaryOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.Camera2StreamConfigurationMap;
                    str = (java.lang.String) paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    paymentSummaryRequest = paymentSummaryRequest2;
                    function1 = function12;
                    arrow.core.Ior ior = (arrow.core.Ior) obj;
                    if (ior instanceof arrow.core.Ior.Left) {
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoadFailed.INSTANCE);
                    } else {
                        if (ior instanceof arrow.core.Ior.Right) {
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) ((arrow.core.Ior.Right) ior).getValue();
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryOverview);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryRequest);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryOverview2);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputSizeshNQ4ISI = function1;
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRanges = 0;
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats = 3;
                            obj = getHighResolutionOutputSizeshNQ4ISI(paymentSummaryOverview2, str, paymentSummarySideEffectMiddleware$fetchPaymentSummary$1);
                        } else if (ior instanceof arrow.core.Ior.Both) {
                            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                            java.lang.Object leftValue = both.getLeftValue();
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) both.getRightValue();
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryOverview);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryRequest);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryOverview3);
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputSizeshNQ4ISI = function1;
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRanges = 0;
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats = 4;
                            obj = getHighResolutionOutputSizeshNQ4ISI(paymentSummaryOverview3, str, paymentSummarySideEffectMiddleware$fetchPaymentSummary$1);
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return coroutine_suspended;
                    }
                } else if (i == 3) {
                    int i2 = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1.invoke(obj);
                } else {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function1.invoke(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        paymentSummarySideEffectMiddleware$fetchPaymentSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$fetchPaymentSummary$1(this, continuation);
        java.lang.Object obj2 = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummarySideEffectMiddleware$fetchPaymentSummary$1.getInputFormats;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview paymentSummaryOverview, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$toDataLoadedEvent$1 paymentSummarySideEffectMiddleware$toDataLoadedEvent$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$toDataLoadedEvent$1) {
            paymentSummarySideEffectMiddleware$toDataLoadedEvent$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$toDataLoadedEvent$1) continuation;
            if ((paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!paymentSummaryOverview.hasCompleteData()) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoadFailed.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.mapper.PaymentSummaryUiModelMapper paymentSummaryUiModelMapper = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.Camera2StreamConfigurationMap;
                    paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighSpeedVideoSizes = paymentSummaryOverview;
                    paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighSpeedVideoFpsRangesFor = str;
                    paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = paymentSummaryUiModelMapper.toUiModel(paymentSummaryOverview, creditProductIdentifier, paymentSummarySideEffectMiddleware$toDataLoadedEvent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighSpeedVideoFpsRangesFor;
                    paymentSummaryOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview) paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryScreenUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel) obj;
                java.lang.String str2 = null;
                if (str != null || kotlin.text.StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str == null) {
                    java.lang.String creditAccountId = paymentSummaryOverview.getCreditAccountId();
                    if (creditAccountId != null && !kotlin.text.StringsKt.isBlank(creditAccountId)) {
                        str2 = creditAccountId;
                    }
                    str = str2;
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded(paymentSummaryScreenUiModel, str);
            }
        }
        paymentSummarySideEffectMiddleware$toDataLoadedEvent$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$toDataLoadedEvent$1(this, continuation);
        java.lang.Object obj2 = paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummarySideEffectMiddleware$toDataLoadedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel paymentSummaryScreenUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.uimodel.PaymentSummaryScreenUiModel) obj2;
        java.lang.String str22 = null;
        if (str != null) {
        }
        str = null;
        if (str == null) {
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnDataLoaded(paymentSummaryScreenUiModel2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e0, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0103, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, kotlin.Unit> function1, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$cancelPayment$1 paymentSummarySideEffectMiddleware$cancelPayment$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$cancelPayment$1) {
            paymentSummarySideEffectMiddleware$cancelPayment$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$cancelPayment$1) continuation;
            if ((paymentSummarySideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                paymentSummarySideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = paymentSummarySideEffectMiddleware$cancelPayment$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentSummarySideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (str2 == null) {
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentFailed.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    cancelRepaymentRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest(str2, str, this.Camera2StreamConfigurationMap);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase = this.getHighSpeedVideoFpsRanges;
                    paymentSummarySideEffectMiddleware$cancelPayment$1.Camera2StreamConfigurationMap = function1;
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentRequest);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI = 1;
                    obj = cancelRepaymentUseCase.invoke(cancelRepaymentRequest, paymentSummarySideEffectMiddleware$cancelPayment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = paymentSummarySideEffectMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI;
                        function1 = (kotlin.jvm.functions.Function1) paymentSummarySideEffectMiddleware$cancelPayment$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnPaymentCanceled.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest) paymentSummarySideEffectMiddleware$cancelPayment$1.getOutputFormats;
                    str2 = (java.lang.String) paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoSizes;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) paymentSummarySideEffectMiddleware$cancelPayment$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cancelRepaymentRequest = cancelRepaymentRequest2;
                    function1 = function12;
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse cancelRepaymentResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent.PaymentDataChanged paymentDataChanged = com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent.PaymentDataChanged.INSTANCE;
                    paymentSummarySideEffectMiddleware$cancelPayment$1.Camera2StreamConfigurationMap = function1;
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentRequest);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentResponse);
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRangesFor = 0;
                    paymentSummarySideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI = 2;
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummaryEvent.OnCancelPaymentFailed.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        paymentSummarySideEffectMiddleware$cancelPayment$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.paymentsummary.viewmodel.PaymentSummarySideEffectMiddleware$cancelPayment$1(this, continuation);
        java.lang.Object obj2 = paymentSummarySideEffectMiddleware$cancelPayment$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentSummarySideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}

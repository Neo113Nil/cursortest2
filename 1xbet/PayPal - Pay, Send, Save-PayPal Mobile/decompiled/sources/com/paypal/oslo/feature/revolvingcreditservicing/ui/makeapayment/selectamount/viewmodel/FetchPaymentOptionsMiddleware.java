package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/FetchPaymentOptionsMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentOptionsUseCase;", "getPaymentOptionsUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/mapper/SelectAmountMapper;", "selectAmountMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentOptionsUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/mapper/SelectAmountMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState$Loading;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState$Loading;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;", "p2", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState$Loading;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent$OnDataFetched;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetPaymentOptionsUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/mapper/SelectAmountMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FetchPaymentOptionsMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public FetchPaymentOptionsMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase getPaymentOptionsUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper selectAmountMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaymentOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectAmountMapper, "");
        this.getHighSpeedVideoFpsRangesFor = getPaymentOptionsUseCase;
        this.getHighSpeedVideoSizes = selectAmountMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState selectAmountState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(selectAmountState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState selectAmountState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(selectAmountState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading) selectAmountState, function1, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e3, code lost:
    
        if (getHighSpeedVideoFpsRanges(r2, r9, r10, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0109, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading loading, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$fetch$1 fetchPaymentOptionsMiddleware$fetch$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$fetch$1) {
            fetchPaymentOptionsMiddleware$fetch$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$fetch$1) continuation;
            if ((fetchPaymentOptionsMiddleware$fetch$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                fetchPaymentOptionsMiddleware$fetch$1.getInputFormats -= 2147483648;
                java.lang.Object obj = fetchPaymentOptionsMiddleware$fetch$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchPaymentOptionsMiddleware$fetch$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (loading.getMaxRepayableAmountIsInvalid()) {
                        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData(this.getHighSpeedVideoSizes.getMaxAllowableErrorUiModel()));
                        return kotlin.Unit.INSTANCE;
                    }
                    paymentOptionsRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest(loading.getCreditProductIdentifier(), loading.getCreditAccountId(), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentConstraintsType.ONE_TIME), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType.SCHEDULED));
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase getPaymentOptionsUseCase = this.getHighSpeedVideoFpsRangesFor;
                    fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoFpsRangesFor = loading;
                    fetchPaymentOptionsMiddleware$fetch$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                    fetchPaymentOptionsMiddleware$fetch$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptionsRequest);
                    fetchPaymentOptionsMiddleware$fetch$1.getInputFormats = 1;
                    obj = getPaymentOptionsUseCase.invoke(paymentOptionsRequest, fetchPaymentOptionsMiddleware$fetch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoFpsRanges;
                        int i3 = fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest) fetchPaymentOptionsMiddleware$fetch$1.Camera2StreamConfigurationMap;
                    function1 = (kotlin.jvm.functions.Function1) fetchPaymentOptionsMiddleware$fetch$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading loading2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading) fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    paymentOptionsRequest = paymentOptionsRequest2;
                    loading = loading2;
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) ((arrow.core.Either.Right) either).getValue();
                    fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loading);
                    fetchPaymentOptionsMiddleware$fetch$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    fetchPaymentOptionsMiddleware$fetch$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptionsRequest);
                    fetchPaymentOptionsMiddleware$fetch$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptions);
                    fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoSizes = 0;
                    fetchPaymentOptionsMiddleware$fetch$1.getHighSpeedVideoFpsRanges = 0;
                    fetchPaymentOptionsMiddleware$fetch$1.getInputFormats = 2;
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData(this.getHighSpeedVideoSizes.getGenericErrorUiModel()));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        fetchPaymentOptionsMiddleware$fetch$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$fetch$1(this, continuation);
        java.lang.Object obj2 = fetchPaymentOptionsMiddleware$fetch$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchPaymentOptionsMiddleware$fetch$1.getInputFormats;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r7) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Loading loading, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$handleSuccess$1 fetchPaymentOptionsMiddleware$handleSuccess$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentBalance;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, kotlin.Unit> function12 = function1;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$handleSuccess$1) {
            fetchPaymentOptionsMiddleware$handleSuccess$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$handleSuccess$1) continuation;
            if ((fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = fetchPaymentOptionsMiddleware$handleSuccess$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing = paymentOptions.getBilling();
                    if (billing == null || (currentBalance = billing.getMaxRepayableAmount()) == null) {
                        currentBalance = paymentOptions.getCurrentBalance();
                    }
                    if (currentBalance == null || currentBalance.toBigDecimal().compareTo(java.math.BigDecimal.ZERO) <= 0) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Failed to fetch payment options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "missing_max_amount")), null, null, 12, null);
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData(this.getHighSpeedVideoSizes.getGenericErrorUiModel()));
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.String creditAccountId = paymentOptions.getCreditAccountId();
                    java.lang.String str = null;
                    if (creditAccountId != null) {
                        if (kotlin.text.StringsKt.isBlank(creditAccountId)) {
                            creditAccountId = null;
                        }
                    }
                    creditAccountId = loading.getCreditAccountId();
                    if (creditAccountId != null) {
                    }
                    if (str == null) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log, "Failed to fetch payment options", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", "missing_credit_account_id")), null, null, 12, null);
                        function12.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnErrorFetchingData(this.getHighSpeedVideoSizes.getGenericErrorUiModel()));
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = loading.getCreditProductIdentifier();
                    fetchPaymentOptionsMiddleware$handleSuccess$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentOptions);
                    fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loading);
                    fetchPaymentOptionsMiddleware$handleSuccess$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                    fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currentBalance);
                    fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    fetchPaymentOptionsMiddleware$handleSuccess$1.getInputSizeshNQ4ISI = function12;
                    fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoSizesFor = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(paymentOptions, creditProductIdentifier, str, fetchPaymentOptionsMiddleware$handleSuccess$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function12 = (kotlin.jvm.functions.Function1) fetchPaymentOptionsMiddleware$handleSuccess$1.getInputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function12.invoke(obj);
                return kotlin.Unit.INSTANCE;
            }
        }
        fetchPaymentOptionsMiddleware$handleSuccess$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$handleSuccess$1(this, continuation);
        java.lang.Object obj2 = fetchPaymentOptionsMiddleware$handleSuccess$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchPaymentOptionsMiddleware$handleSuccess$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        function12.invoke(obj2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions paymentOptions, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$successData$1 fetchPaymentOptionsMiddleware$successData$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$successData$1) {
            fetchPaymentOptionsMiddleware$successData$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$successData$1) continuation;
            if ((fetchPaymentOptionsMiddleware$successData$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                fetchPaymentOptionsMiddleware$successData$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$successData$1 fetchPaymentOptionsMiddleware$successData$12 = fetchPaymentOptionsMiddleware$successData$1;
                java.lang.Object obj = fetchPaymentOptionsMiddleware$successData$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchPaymentOptionsMiddleware$successData$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper selectAmountMapper = this.getHighSpeedVideoSizes;
                    fetchPaymentOptionsMiddleware$successData$12.Camera2StreamConfigurationMap = paymentOptions;
                    fetchPaymentOptionsMiddleware$successData$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    fetchPaymentOptionsMiddleware$successData$12.getHighSpeedVideoFpsRangesFor = str;
                    fetchPaymentOptionsMiddleware$successData$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper.getSelectAmountScreenUiModel$default(selectAmountMapper, paymentOptions, creditProductIdentifier, null, null, null, fetchPaymentOptionsMiddleware$successData$12, 28, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) fetchPaymentOptionsMiddleware$successData$12.getHighSpeedVideoFpsRangesFor;
                    paymentOptions = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions) fetchPaymentOptionsMiddleware$successData$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel) obj, paymentOptions.getFundingInstruments(), paymentOptions.getMaxDaysInFuture(), this.getHighSpeedVideoSizes.getDueDate(paymentOptions), str);
            }
        }
        fetchPaymentOptionsMiddleware$successData$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$successData$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware$successData$1 fetchPaymentOptionsMiddleware$successData$122 = fetchPaymentOptionsMiddleware$successData$1;
        java.lang.Object obj2 = fetchPaymentOptionsMiddleware$successData$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchPaymentOptionsMiddleware$successData$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnDataFetched((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.uimodel.SelectAmountScreenUiModel) obj2, paymentOptions.getFundingInstruments(), paymentOptions.getMaxDaysInFuture(), this.getHighSpeedVideoSizes.getDueDate(paymentOptions), str);
    }
}

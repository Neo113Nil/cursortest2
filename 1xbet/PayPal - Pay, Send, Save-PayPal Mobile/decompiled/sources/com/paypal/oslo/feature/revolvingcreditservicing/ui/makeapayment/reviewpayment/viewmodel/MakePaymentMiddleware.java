package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/MakePaymentMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/payment/MakePaymentUseCase;", "makePaymentUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/mapper/PaymentConfirmationMapper;", "paymentConfirmationMapper", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/payment/MakePaymentUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/mapper/PaymentConfirmationMapper;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Loading;", "p0", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Loading;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/payment/MakePaymentUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/mapper/PaymentConfirmationMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MakePaymentMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MakePaymentMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase makePaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper paymentConfirmationMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makePaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentConfirmationMapper, "");
        this.getHighSpeedVideoFpsRangesFor = makePaymentUseCase;
        this.Camera2StreamConfigurationMap = paymentConfirmationMapper;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState reviewPaymentState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(reviewPaymentState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState reviewPaymentState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(reviewPaymentState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading) reviewPaymentState, function1, continuation);
        return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        if (r5 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading loading, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware$makePaymentRequest$1 makePaymentMiddleware$makePaymentRequest$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest highSpeedVideoFpsRangesFor;
        java.lang.Object invoke;
        arrow.core.Ior ior;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, kotlin.Unit> function12;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, kotlin.Unit> function13;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware$makePaymentRequest$1) {
            makePaymentMiddleware$makePaymentRequest$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware$makePaymentRequest$1) continuation;
            if ((makePaymentMiddleware$makePaymentRequest$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                makePaymentMiddleware$makePaymentRequest$1.getOutputSizes -= 2147483648;
                java.lang.Object obj = makePaymentMiddleware$makePaymentRequest$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = makePaymentMiddleware$makePaymentRequest$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    readyInfo = loading.getReadyInfo();
                    uiModel = readyInfo.getUiModel();
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(readyInfo, uiModel);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase makePaymentUseCase = this.getHighSpeedVideoFpsRangesFor;
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loading);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRanges = function1;
                    makePaymentMiddleware$makePaymentRequest$1.Camera2StreamConfigurationMap = readyInfo;
                    makePaymentMiddleware$makePaymentRequest$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiModel);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRangesFor);
                    makePaymentMiddleware$makePaymentRequest$1.getOutputSizes = 1;
                    invoke = makePaymentUseCase.invoke(highSpeedVideoFpsRangesFor, makePaymentMiddleware$makePaymentRequest$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            int i2 = makePaymentMiddleware$makePaymentRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i3 = makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizes;
                            function13 = (kotlin.jvm.functions.Function1) makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            function13.invoke((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = makePaymentMiddleware$makePaymentRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizes;
                        function12 = (kotlin.jvm.functions.Function1) makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12.invoke((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest) makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizesFor;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel) makePaymentMiddleware$makePaymentRequest$1.getOutputMinFrameDuration;
                    readyInfo = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo) makePaymentMiddleware$makePaymentRequest$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent, kotlin.Unit> function14 = (kotlin.jvm.functions.Function1) makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading loading2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Loading) makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    highSpeedVideoFpsRangesFor = makePaymentRequest;
                    loading = loading2;
                    uiModel = reviewPaymentUiModel;
                    function1 = function14;
                    invoke = obj;
                }
                ior = (arrow.core.Ior) invoke;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    if (((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError) ((arrow.core.Ior.Left) ior).getValue()) instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError.MaxPaymentsThresholdReached) {
                        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentValidationFailed(null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_review_payment_error_only_two_payments, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                    } else {
                        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestError(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_review_payment_error_something_went_wrong, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse) ((arrow.core.Ior.Right) ior).getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = readyInfo.getArgs().getCreditProductIdentifier();
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loading);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRanges = function1;
                    makePaymentMiddleware$makePaymentRequest$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(readyInfo);
                    makePaymentMiddleware$makePaymentRequest$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiModel);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRangesFor);
                    makePaymentMiddleware$makePaymentRequest$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    makePaymentMiddleware$makePaymentRequest$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    makePaymentMiddleware$makePaymentRequest$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePaymentResponse);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizes = 0;
                    makePaymentMiddleware$makePaymentRequest$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    makePaymentMiddleware$makePaymentRequest$1.getOutputSizes = 2;
                    obj = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess(this.Camera2StreamConfigurationMap.toConfirmationArgs(makePaymentResponse, creditProductIdentifier));
                    if (obj != coroutine_suspended) {
                        function13 = function1;
                        function13.invoke((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) obj);
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse) both.getRightValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = readyInfo.getArgs().getCreditProductIdentifier();
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loading);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoFpsRanges = function1;
                    makePaymentMiddleware$makePaymentRequest$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(readyInfo);
                    makePaymentMiddleware$makePaymentRequest$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uiModel);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRangesFor);
                    makePaymentMiddleware$makePaymentRequest$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    makePaymentMiddleware$makePaymentRequest$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    makePaymentMiddleware$makePaymentRequest$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makePaymentResponse2);
                    makePaymentMiddleware$makePaymentRequest$1.getHighSpeedVideoSizes = 0;
                    makePaymentMiddleware$makePaymentRequest$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    makePaymentMiddleware$makePaymentRequest$1.getOutputSizes = 3;
                    obj = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess(this.Camera2StreamConfigurationMap.toConfirmationArgs(makePaymentResponse2, creditProductIdentifier2));
                    if (obj != coroutine_suspended) {
                        function12 = function1;
                        function12.invoke((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess) obj);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
        }
        makePaymentMiddleware$makePaymentRequest$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware$makePaymentRequest$1(this, continuation);
        java.lang.Object obj2 = makePaymentMiddleware$makePaymentRequest$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = makePaymentMiddleware$makePaymentRequest$1.getOutputSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) invoke;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo p0, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel p1) {
        java.util.List listOf;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = p0.getArgs().getCreditProductIdentifier();
        java.lang.String creditAccountId = p0.getArgs().getCreditAccountId();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType paymentType = p1.getPaymentType();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount paymentAmount = p0.getArgs().getPaymentAmount();
        java.time.LocalDate paymentDate = p1.getPaymentType() == com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME ? null : p0.getPaymentDate();
        if (p0.getArgs().getBackupPaymentMethod() != null) {
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument[]{p0.getArgs().getSelectedFundingInstrument(), p0.getArgs().getBackupPaymentMethod()});
        } else {
            listOf = kotlin.collections.CollectionsKt.listOf(p0.getArgs().getSelectedFundingInstrument());
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest(creditProductIdentifier, creditAccountId, paymentType, paymentAmount, paymentDate, listOf);
    }

    public static final /* synthetic */ java.lang.Object access$buildPaymentRequestSuccess(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware makePaymentMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentEvent.PaymentRequestSuccess(makePaymentMiddleware.Camera2StreamConfigurationMap.toConfirmationArgs(makePaymentResponse, creditProductIdentifier));
    }
}

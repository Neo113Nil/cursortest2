package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$confirmQrCodePayment$1", f = "PaymentReviewViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {301}, m = "invokeSuspend", n = {"$this$launch", "currentState", "paymentOptions", "selectedFiId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "totalAmount", "request", "isBalanceOptedOut", "isCurrencyOverrideSelected", "isPPBalanceDisabled"}, nl = {384}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentReviewViewModel$confirmQrCodePayment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel getOutputStallDuration;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase confirmQrCodePaymentUseCase;
        java.lang.Object invoke;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState value = this.getOutputStallDuration.getUiState().getValue();
            if (!(value instanceof com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content)) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = (com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content) value;
            com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions domainPaymentOptions = content.getUiModel().getDomainPaymentOptions();
            com.paypal.oslo.feature.qrc.ui.review.BalanceUiData balanceUiData = content.getUiModel().getPaymentOptionsUiModel().getBalanceUiData();
            int i2 = (balanceUiData == null || !balanceUiData.isEffectiveOptedOut()) ? 0 : 1;
            com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionData = content.getUiModel().getCurrencyConversionData();
            boolean z = (currencyConversionData != null ? currencyConversionData.getSelectedTab() : null) == com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.ISSUER;
            com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionData2 = content.getUiModel().getCurrencyConversionData();
            boolean z2 = currencyConversionData2 != null && currencyConversionData2.isPPBalanceDisabled();
            com.paypal.oslo.feature.qrc.ui.review.FiUiItem selectedFi = content.getUiModel().getPaymentOptionsUiModel().getAccordionUiData().getSelectedFi();
            java.lang.String id = selectedFi != null ? selectedFi.getId() : null;
            boolean z3 = z2;
            boolean z4 = z;
            java.lang.String access$resolveFundingOptionId = com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel.access$resolveFundingOptionId(this.getOutputStallDuration, domainPaymentOptions, id, i2, z, z3, content);
            if (access$resolveFundingOptionId == null) {
                this.getOutputStallDuration.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed(false, 1, null));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney totalAmount = domainPaymentOptions.getTotalAmount();
            if (totalAmount == null) {
                this.getOutputStallDuration.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed(false, 1, null));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId sessionId = new com.paypal.oslo.feature.qrc.domain.model.review.CaptureReferenceId.SessionId(this.getOutputStallDuration.getNavArgs().getSessionId());
            java.lang.String str = this.getOutputStallDuration.getNavArgs().isPayPalWorldQR() ? "PAYPAL_WORLD" : "PAYPAL";
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount = domainPaymentOptions.getPaymentAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney tipAmount = this.getOutputStallDuration.getNavArgs().isPayPalWorldQR() ? null : domainPaymentOptions.getTipAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionRequiredAction requiredAction = this.getOutputStallDuration.getNavArgs().getRequiredAction();
            com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest confirmQrcPaymentRequest = new com.paypal.oslo.feature.qrc.domain.model.confirmpayment.ConfirmQrcPaymentRequest(sessionId, access$resolveFundingOptionId, str, paymentAmount, tipAmount, totalAmount, (requiredAction != null ? requiredAction.getActionType() : null) == com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionActionType.ENROLLMENT_REQUIRED);
            confirmQrCodePaymentUseCase = this.getOutputStallDuration.getHighSpeedVideoSizes;
            this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(domainPaymentOptions);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$resolveFundingOptionId);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(totalAmount);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(confirmQrcPaymentRequest);
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoSizes = z4 ? 1 : 0;
            this.getHighSpeedVideoFpsRanges = z3 ? 1 : 0;
            this.getOutputMinFrameDuration = 1;
            invoke = confirmQrCodePaymentUseCase.invoke(confirmQrcPaymentRequest, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = ((arrow.core.Ior) invoke).toEither();
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel = this.getOutputStallDuration;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel.access$handleConfirmedPaymentResponse(paymentReviewViewModel, (com.paypal.oslo.feature.qrc.domain.model.session.PaymentResponse) ((arrow.core.Either.Right) either).getValue());
        } else if (either instanceof arrow.core.Either.Left) {
            paymentReviewViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.PaymentFailed(((com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError) ((arrow.core.Either.Left) either).getValue()).isRecoverable()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$confirmQrCodePayment$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$confirmQrCodePayment$1 paymentReviewViewModel$confirmQrCodePayment$1 = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$confirmQrCodePayment$1(this.getOutputStallDuration, continuation);
        paymentReviewViewModel$confirmQrCodePayment$1.getOutputSizeshNQ4ISI = obj;
        return paymentReviewViewModel$confirmQrCodePayment$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentReviewViewModel$confirmQrCodePayment$1(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$confirmQrCodePayment$1> continuation) {
        super(2, continuation);
        this.getOutputStallDuration = paymentReviewViewModel;
    }
}

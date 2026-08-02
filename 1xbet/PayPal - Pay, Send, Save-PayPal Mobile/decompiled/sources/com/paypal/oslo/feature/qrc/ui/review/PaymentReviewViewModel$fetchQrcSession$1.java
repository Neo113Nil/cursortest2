package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$fetchQrcSession$1", f = "PaymentReviewViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"isPayPalWorld"}, nl = {181}, s = {"I$0"}, v = 2)
/* loaded from: classes14.dex */
final class PaymentReviewViewModel$fetchQrcSession$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase getQrcSessionUseCase;
        java.lang.Object invoke;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i2 = this.Camera2StreamConfigurationMap.getQrCodeType() == com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL_WORLD ? 1 : 0;
            getQrcSessionUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.String sessionId = this.Camera2StreamConfigurationMap.getSessionId();
            com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow = this.Camera2StreamConfigurationMap.getProductFlow();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount = this.Camera2StreamConfigurationMap.getTransactionDetails().getPaymentAmount();
            com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney = i2 != 0 ? null : this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = i2;
            this.getHighSpeedVideoFpsRanges = 1;
            invoke = getQrcSessionUseCase.invoke(new com.paypal.oslo.feature.qrc.domain.model.review.PaymentPlanningRequest(emptyList, sessionId, paymentAmount, qrcMoney, null, null, i2, productFlow, 48, null), this);
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
        com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.qrc.domain.model.session.QrcSession qrcSession = (com.paypal.oslo.feature.qrc.domain.model.session.QrcSession) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.qrc.domain.model.review.PaymentOptions paymentOptions = qrcSession.getPaymentOptions();
            if (paymentOptions == null) {
                paymentOptions = com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel.access$emptyPaymentOptions(paymentReviewViewModel);
            }
            paymentReviewViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptions(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgsKt.toQrcSessionNavArgs(qrcSession), paymentOptions));
        } else if (either instanceof arrow.core.Either.Left) {
            paymentReviewViewModel.handleIntent(new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent.LoadPaymentOptionsFailed(((com.paypal.oslo.feature.qrc.domain.error.QrcDataResultError) ((arrow.core.Either.Left) either).getValue()).isRecoverable()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$fetchQrcSession$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$fetchQrcSession$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaymentReviewViewModel$fetchQrcSession$1(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel paymentReviewViewModel, com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.review.PaymentReviewViewModel$fetchQrcSession$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = qrcSessionNavArgs;
        this.getHighResolutionOutputSizeshNQ4ISI = paymentReviewViewModel;
        this.getHighSpeedVideoFpsRangesFor = qrcMoney;
    }
}

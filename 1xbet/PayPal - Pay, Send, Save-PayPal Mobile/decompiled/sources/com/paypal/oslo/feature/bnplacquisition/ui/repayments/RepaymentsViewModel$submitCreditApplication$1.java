package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$submitCreditApplication$1", f = "RepaymentsViewModel.kt", i = {0, 0, 0, 0}, l = {159}, m = "invokeSuspend", n = {"$this$launch", "sessionId", "consents", "request"}, nl = {160}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class RepaymentsViewModel$submitCreditApplication$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase submitCreditApplicationUsecase;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel = this.getOutputFormats;
                repaymentsUiMapper = repaymentsViewModel.getHighSpeedVideoSizes;
                repaymentsViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError(repaymentsUiMapper.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
                return kotlin.Unit.INSTANCE;
            }
            java.util.List listOf = !this.Camera2StreamConfigurationMap ? kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.model.disclosure.ConsentType.PAYMENT_AUTHORIZATION) : null;
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest submitCreditApplicationRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest(camera2StreamConfigurationMap, listOf, this.Camera2StreamConfigurationMap ? null : this.getHighSpeedVideoFpsRanges.getSelectedFundingInstrumentId(), false, 8, null);
            submitCreditApplicationUsecase = this.getOutputFormats.Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(listOf);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(submitCreditApplicationRequest);
            this.getHighSpeedVideoSizesFor = 1;
            obj = submitCreditApplicationUsecase.invoke2(submitCreditApplicationRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) obj;
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel2 = this.getOutputFormats;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel.access$handleSubmitSuccess(repaymentsViewModel2, data);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel3 = this.getOutputFormats;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to submit credit application", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            repaymentsUiMapper3 = repaymentsViewModel3.getHighSpeedVideoSizes;
            repaymentsViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.UpdateError(repaymentsUiMapper3.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel4 = this.getOutputFormats;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId);
            repaymentsUiMapper2 = repaymentsViewModel4.getHighSpeedVideoSizes;
            repaymentsViewModel4.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsEvent.ApplicationDeclined(repaymentsUiMapper2.toDeclineContent(from)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$submitCreditApplication$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$submitCreditApplication$1 repaymentsViewModel$submitCreditApplication$1 = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$submitCreditApplication$1(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        repaymentsViewModel$submitCreditApplication$1.getInputSizeshNQ4ISI = obj;
        return repaymentsViewModel$submitCreditApplication$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepaymentsViewModel$submitCreditApplication$1(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel repaymentsViewModel, boolean z, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiModel repaymentsUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel$submitCreditApplication$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = repaymentsViewModel;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = repaymentsUiModel;
    }
}

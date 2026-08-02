package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkEligibility$1", f = "EnterAmountViewModel.kt", i = {0, 0, 0, 0}, l = {324}, m = "invokeSuspend", n = {"$this$launch", "sessionId", "request", "loanAmount"}, nl = {325}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountViewModel$checkEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel getOutputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase checkApplicationEligibilityUseCase;
        java.lang.String str;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getOutputFormats.getInputSizeshNQ4ISI;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel = this.getOutputFormats;
                enterAmountUiMapper = enterAmountViewModel.getInputFormats;
                enterAmountViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountUiMapper.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
                return kotlin.Unit.INSTANCE;
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType[]{com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.PRODUCT_OFFERS_EVALUATION, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.ApplicationEligibilityEvaluationType.ACCOUNT_TAKEOVER_ASSESSMENT});
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(this.getHighSpeedVideoFpsRangesFor.getCurrencyCode(), this.getHighSpeedVideoFpsRangesFor.getAmountInput());
            cpiAvailabilityProvider = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> availableCpis = cpiAvailabilityProvider.availableCpis();
            enterAmountConfig = this.getOutputFormats.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CheckApplicationEligibilityRequest checkApplicationEligibilityRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CheckApplicationEligibilityRequest(camera2StreamConfigurationMap, listOf, money2, availableCpis, new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CheckApplicationEligibilityRequestParams(enterAmountConfig.getActions().getEvaluateProductOffersApiConfig().getRequestParameters().getIncludeOffers()));
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money(this.getHighSpeedVideoFpsRangesFor.getCurrencyCode(), this.getHighSpeedVideoFpsRangesFor.getAmountInput());
            checkApplicationEligibilityUseCase = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoSizes = camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkApplicationEligibilityRequest);
            this.getHighResolutionOutputSizeshNQ4ISI = money3;
            this.Camera2StreamConfigurationMap = 1;
            java.lang.Object invoke2 = checkApplicationEligibilityUseCase.invoke2(checkApplicationEligibilityRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
            if (invoke2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = camera2StreamConfigurationMap;
            obj = invoke2;
            money = money3;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            money = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money) this.getHighResolutionOutputSizeshNQ4ISI;
            str = (java.lang.String) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) obj;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel2 = this.getOutputFormats;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility checkApplicationEligibility = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility ? (com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CheckApplicationEligibility) data : null;
            if (checkApplicationEligibility != null) {
                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.access$handleCheckEligibilitySuccess(enterAmountViewModel2, checkApplicationEligibility, str, money);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel3 = this.getOutputFormats;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to check eligibility", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            enterAmountUiMapper3 = enterAmountViewModel3.getInputFormats;
            enterAmountViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountUiMapper3.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel4 = this.getOutputFormats;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId);
            enterAmountUiMapper2 = enterAmountViewModel4.getInputFormats;
            enterAmountViewModel4.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined(enterAmountUiMapper2.toDeclineContent(from)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkEligibility$1 enterAmountViewModel$checkEligibility$1 = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkEligibility$1(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, continuation);
        enterAmountViewModel$checkEligibility$1.getInputFormats = obj;
        return enterAmountViewModel$checkEligibility$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountViewModel$checkEligibility$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkEligibility$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = enterAmountViewModel;
        this.getHighSpeedVideoFpsRangesFor = enterAmountUiModel;
    }
}

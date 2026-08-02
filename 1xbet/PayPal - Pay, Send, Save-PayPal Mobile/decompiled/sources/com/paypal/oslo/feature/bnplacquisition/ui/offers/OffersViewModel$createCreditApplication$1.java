package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$createCreditApplication$1", f = "OffersViewModel.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "invokeSuspend", n = {"$this$launch", "sessionId", "request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes11.dex */
final class OffersViewModel$createCreditApplication$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase createCreditApplicationUsecase;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel = this.getHighSpeedVideoSizes;
                offersUiMapper = offersViewModel.getHighSpeedVideoSizesFor;
                offersViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError(offersUiMapper.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest access$buildCreateCreditApplicationRequest = com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.access$buildCreateCreditApplicationRequest(this.getHighSpeedVideoSizes, camera2StreamConfigurationMap, this.Camera2StreamConfigurationMap);
            createCreditApplicationUsecase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildCreateCreditApplicationRequest);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = createCreditApplicationUsecase.invoke2(access$buildCreateCreditApplicationRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel2 = this.getHighSpeedVideoSizes;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication createCreditApplication = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication ? (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication) data : null;
            if (createCreditApplication != null) {
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.access$handleCreateCreditApplicationSuccess(offersViewModel2, createCreditApplication);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel3 = this.getHighSpeedVideoSizes;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to create credit application", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            offersUiMapper3 = offersViewModel3.getHighSpeedVideoSizesFor;
            offersViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError(offersUiMapper3.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel4 = this.getHighSpeedVideoSizes;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId);
            offersUiMapper2 = offersViewModel4.getHighSpeedVideoSizesFor;
            offersViewModel4.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApplicationDeclined(offersUiMapper2.toDeclineContent(from)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$createCreditApplication$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$createCreditApplication$1 offersViewModel$createCreditApplication$1 = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$createCreditApplication$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        offersViewModel$createCreditApplication$1.getHighSpeedVideoSizesFor = obj;
        return offersViewModel$createCreditApplication$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OffersViewModel$createCreditApplication$1(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$createCreditApplication$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = offersViewModel;
        this.Camera2StreamConfigurationMap = offersUiModel;
    }
}

package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchReviewTerms$1", f = "OffersViewModel.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "invokeSuspend", n = {"$this$launch", "selectedOfferId", "experienceSessionId", "request"}, nl = {224}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class OffersViewModel$fetchReviewTerms$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getReviewTermsUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper3;
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess success;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String selectedOfferId = this.getHighSpeedVideoFpsRanges.getSelectedOfferId();
            if (selectedOfferId == null) {
                selectedOfferId = "";
            }
            sessionStorage = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel = this.getHighSpeedVideoSizesFor;
                offersUiMapper = offersViewModel.getHighSpeedVideoSizesFor;
                offersViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError(offersUiMapper.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest reviewTermsRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest(camera2StreamConfigurationMap, selectedOfferId, null, null, 12, null);
            getReviewTermsUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
            this.getOutputFormats = coroutineScope;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(selectedOfferId);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewTermsRequest);
            this.getHighSpeedVideoSizes = 1;
            obj = getReviewTermsUseCase.invoke2(reviewTermsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel2 = this.getHighSpeedVideoSizesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success2.getData();
            success2.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms reviewTerms = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms ? (com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms) data : null;
            if (reviewTerms != null && (success = reviewTerms.getSuccess()) != null) {
                offersViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.UpdateReviewTermsSuccess(success));
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "ReviewTermsSuccess is null", null, null, null, 14, null);
                offersUiMapper4 = offersViewModel2.getHighSpeedVideoSizesFor;
                offersViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError(offersUiMapper4.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel3 = this.getHighSpeedVideoSizesFor;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to fetch review terms", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            offersUiMapper3 = offersViewModel3.getHighSpeedVideoSizesFor;
            offersViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.ApiError(offersUiMapper3.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel4 = this.getHighSpeedVideoSizesFor;
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchReviewTerms$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchReviewTerms$1 offersViewModel$fetchReviewTerms$1 = new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchReviewTerms$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, continuation);
        offersViewModel$fetchReviewTerms$1.getOutputFormats = obj;
        return offersViewModel$fetchReviewTerms$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OffersViewModel$fetchReviewTerms$1(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel offersUiModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$fetchReviewTerms$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = offersUiModel;
        this.getHighSpeedVideoSizesFor = offersViewModel;
    }
}

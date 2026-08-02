package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeReviewDetailsUpdate$1", f = "PersonalInfoViewModel.kt", i = {0, 0}, l = {603}, m = "invokeSuspend", n = {"$this$launch", "request"}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$executeReviewDetailsUpdate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase updateApplicationAndFetchReviewDetailsUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetailsSuccess success;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.UpdateApplicationAndFetchReviewDetailsRequest access$buildUpdateAndFetchReviewDetailsRequest = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel.access$buildUpdateAndFetchReviewDetailsRequest(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            updateApplicationAndFetchReviewDetailsUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildUpdateAndFetchReviewDetailsRequest);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = updateApplicationAndFetchReviewDetailsUseCase.invoke2(access$buildUpdateAndFetchReviewDetailsRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.getHighSpeedVideoSizes;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success2.getData();
            java.lang.String correlationId = success2.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetails reviewPlanDetails = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetails ? (com.paypal.oslo.feature.bnplacquisition.domain.model.reviewplan.ReviewPlanDetails) data : null;
            if (reviewPlanDetails == null || (success = reviewPlanDetails.getSuccess()) == null) {
                personalInfoUiMapper3 = personalInfoViewModel.getOutputFormats;
                personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError(personalInfoUiMapper3.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(correlationId)), personalInfoUiModel));
            } else {
                personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateReviewDetailsSuccess(success, correlationId));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel2 = this.Camera2StreamConfigurationMap;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId2 = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId2);
            personalInfoUiMapper2 = personalInfoViewModel2.getOutputFormats;
            personalInfoViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined(personalInfoUiMapper2.toDeclineContent(from)));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel3 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel2 = this.getHighSpeedVideoSizes;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            personalInfoUiMapper = personalInfoViewModel3.getOutputFormats;
            personalInfoViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError(personalInfoUiMapper.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult)), personalInfoUiModel2));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeReviewDetailsUpdate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeReviewDetailsUpdate$1 personalInfoViewModel$executeReviewDetailsUpdate$1 = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeReviewDetailsUpdate$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        personalInfoViewModel$executeReviewDetailsUpdate$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return personalInfoViewModel$executeReviewDetailsUpdate$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$executeReviewDetailsUpdate$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeReviewDetailsUpdate$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = personalInfoViewModel;
        this.getHighSpeedVideoSizes = personalInfoUiModel;
    }
}

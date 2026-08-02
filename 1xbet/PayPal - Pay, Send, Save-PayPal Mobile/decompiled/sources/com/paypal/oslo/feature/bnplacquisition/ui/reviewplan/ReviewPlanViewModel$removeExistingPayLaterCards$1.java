package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$removeExistingPayLaterCards$1", f = "ReviewPlanViewModel.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewPlanViewModel$removeExistingPayLaterCards$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.RemoveExistingPayLaterCardsUseCase removeExistingPayLaterCardsUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningError nFCCardProvisioningError;
        com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            removeExistingPayLaterCardsUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            obj = removeExistingPayLaterCardsUseCase.invoke(this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel = this.getHighSpeedVideoFpsRanges;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            success.getData();
            success.getCorrelationId();
            reviewPlanViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningRemoveCardsSuccess.INSTANCE);
        }
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel2 = this.getHighSpeedVideoFpsRanges;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            if (i2 < 2) {
                nFCCardProvisioningError = com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningRetryableError.INSTANCE;
            } else {
                nFCCardProvisioningError = com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.NFCCardProvisioningError.INSTANCE;
            }
            applicationFailureUiMapper = reviewPlanViewModel2.getOutputFormats;
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel errorContent = applicationFailureUiMapper.toErrorContent(nFCCardProvisioningError);
            sessionStorage = reviewPlanViewModel2.getHighSpeedVideoFpsRanges;
            java.lang.String getHighSpeedVideoFpsRangesFor = sessionStorage.getGetHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = "";
            }
            reviewPlanViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent.NFCProvisioningUpdateError(errorContent, nFCCardProvisioningError, i2, getHighSpeedVideoFpsRangesFor));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$removeExistingPayLaterCards$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$removeExistingPayLaterCards$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewPlanViewModel$removeExistingPayLaterCards$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel reviewPlanViewModel, int i, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel$removeExistingPayLaterCards$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = reviewPlanViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }
}

package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$submitForm$1", f = "AdditionalInfoViewModel.kt", i = {0, 0, 0, 0, 0}, l = {159}, m = "invokeSuspend", n = {"$this$launch", "experienceSessionId", "ssnValue", "incomeValue", "request"}, nl = {160}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes11.dex */
final class AdditionalInfoViewModel$submitForm$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        java.lang.String str;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getReviewTermsUseCase;
        java.lang.String fieldValue;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper additionalInfoUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper additionalInfoUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper additionalInfoUiMapper3;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper additionalInfoUiMapper4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTermsSuccess success;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel = this.getInputSizeshNQ4ISI;
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Experience session ID is null during nationalIdentification/income submission", null, null, null, 14, null);
                additionalInfoUiMapper = additionalInfoViewModel.getHighSpeedVideoSizes;
                additionalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError(additionalInfoUiMapper.buildGenericErrorContent()));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel findFormFieldById = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.findFormFieldById(this.getHighSpeedVideoFpsRanges.getNationalIdentificationFieldRows(), com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.NATIONAL_IDENTIFICATION);
            if (findFormFieldById == null || (str = findFormFieldById.getFieldValue()) == null || kotlin.text.StringsKt.isBlank(str)) {
                str = null;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel findFormFieldById2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.findFormFieldById(this.getHighSpeedVideoFpsRanges.getIncomeFieldRows(), com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.INCOME);
            java.lang.Long longOrNull = (findFormFieldById2 == null || (fieldValue = findFormFieldById2.getFieldValue()) == null) ? null : kotlin.text.StringsKt.toLongOrNull(fieldValue);
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest reviewTermsRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ReviewTermsRequest(camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.getSelectedOfferId(), str, longOrNull);
            getReviewTermsUseCase = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getInputFormats = coroutineScope;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(longOrNull);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(reviewTermsRequest);
            this.getOutputMinFrameDuration = 1;
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
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel2 = this.getInputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success2.getData();
            success2.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms reviewTerms = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms ? (com.paypal.oslo.feature.bnplacquisition.domain.model.reviewterms.ReviewTerms) data : null;
            if (reviewTerms != null && (success = reviewTerms.getSuccess()) != null) {
                additionalInfoViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiSuccess(success));
            } else {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "ReviewTermsSuccess is null", null, null, null, 14, null);
                additionalInfoUiMapper4 = additionalInfoViewModel2.getHighSpeedVideoSizes;
                additionalInfoViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError(additionalInfoUiMapper4.buildErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel3 = this.getInputSizeshNQ4ISI;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to submit NationalIdentification/Income form", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            additionalInfoUiMapper3 = additionalInfoViewModel3.getHighSpeedVideoSizes;
            additionalInfoViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApiError(additionalInfoUiMapper3.buildErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel4 = this.getInputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            decline.getCorrelationId();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplacquisition.LoggerKt.log;
            if (data2 == null) {
                data2 = "UNKNOWN";
            }
            com.paypal.android.logger.Logger.i$default(logger, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2)), null, 4, null);
            additionalInfoUiMapper2 = additionalInfoViewModel4.getHighSpeedVideoSizes;
            additionalInfoViewModel4.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ApplicationDeclined(additionalInfoUiMapper2.buildGenericErrorContent()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$submitForm$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$submitForm$1 additionalInfoViewModel$submitForm$1 = new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$submitForm$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        additionalInfoViewModel$submitForm$1.getInputFormats = obj;
        return additionalInfoViewModel$submitForm$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalInfoViewModel$submitForm$1(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$submitForm$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = additionalInfoViewModel;
        this.getHighSpeedVideoFpsRanges = additionalInfoUiModel;
    }
}

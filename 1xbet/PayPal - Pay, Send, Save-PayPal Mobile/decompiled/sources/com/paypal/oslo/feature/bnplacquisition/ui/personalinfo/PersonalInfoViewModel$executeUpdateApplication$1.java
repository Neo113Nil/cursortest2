package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeUpdateApplication$1", f = "PersonalInfoViewModel.kt", i = {0, 0}, l = {531}, m = "invokeSuspend", n = {"$this$launch", "request"}, nl = {532}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$executeUpdateApplication$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase updateApplicationAndFetchOffersUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper2;
        kotlin.Pair<com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError, java.lang.String> fieldValidationError;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccess success;
        com.paypal.oslo.feature.bnplacquisition.domain.model.offers.AvailableOfferDetailsSuccessCreditApplication creditApplication;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.AvailableOffersRequest access$buildAvailableOffersRequest = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel.access$buildAvailableOffersRequest(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
            updateApplicationAndFetchOffersUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = coroutineScope;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildAvailableOffersRequest);
            this.Camera2StreamConfigurationMap = 1;
            obj = updateApplicationAndFetchOffersUseCase.invoke2(access$buildAvailableOffersRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success2.getData();
            java.lang.String correlationId = success2.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails availableOfferDetails = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails ? (com.paypal.oslo.feature.bnplacquisition.domain.model.AvailableOfferDetails) data : null;
            if (availableOfferDetails == null || (success = availableOfferDetails.getSuccess()) == null || (creditApplication = success.getCreditApplication()) == null) {
                personalInfoUiMapper3 = personalInfoViewModel.getOutputFormats;
                personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError(personalInfoUiMapper3.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(correlationId)), personalInfoUiModel));
            } else {
                personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationSuccess(creditApplication, correlationId));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel2 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError;
        if (z) {
            ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError) useCaseResult).getErrorDetail().getMessage();
            ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel findFormFieldById = personalInfoUiModel2.findFormFieldById(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BILLING_ADDRESS);
            java.lang.String fieldValue = findFormFieldById != null ? findFormFieldById.getFieldValue() : null;
            if (fieldValue == null) {
                fieldValue = "";
            }
            com.paypal.oslo.core.i18n.domain.model.Address address = (com.paypal.oslo.core.i18n.domain.model.Address) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) personalInfoUiModel2.getAddresses());
            if (address != null) {
                personalInfoViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.AddressValidationErrorReceived(personalInfoUiModel2, fieldValue, address));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel3 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel3 = this.getHighSpeedVideoFpsRangesFor;
        if (!z && (fieldValidationError = com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.toFieldValidationError(useCaseResult)) != null) {
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.FieldValidationError component1 = fieldValidationError.component1();
            fieldValidationError.component2();
            personalInfoViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApiFieldValidationFailed(personalInfoUiModel3, kotlin.collections.CollectionsKt.listOf(component1)));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel4 = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel4 = this.getHighSpeedVideoFpsRangesFor;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            personalInfoUiMapper2 = personalInfoViewModel4.getOutputFormats;
            personalInfoViewModel4.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateApplicationError(personalInfoUiMapper2.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult)), personalInfoUiModel4));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel5 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId2 = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId2);
            personalInfoUiMapper = personalInfoViewModel5.getOutputFormats;
            personalInfoViewModel5.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined(personalInfoUiMapper.toDeclineContent(from)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeUpdateApplication$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeUpdateApplication$1 personalInfoViewModel$executeUpdateApplication$1 = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeUpdateApplication$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        personalInfoViewModel$executeUpdateApplication$1.getHighSpeedVideoSizes = obj;
        return personalInfoViewModel$executeUpdateApplication$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$executeUpdateApplication$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$executeUpdateApplication$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = personalInfoViewModel;
        this.getHighSpeedVideoFpsRangesFor = personalInfoUiModel;
    }
}

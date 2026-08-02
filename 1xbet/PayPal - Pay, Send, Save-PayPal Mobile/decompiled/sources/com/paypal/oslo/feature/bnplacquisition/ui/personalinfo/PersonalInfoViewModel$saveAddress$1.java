package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$saveAddress$1", f = "PersonalInfoViewModel.kt", i = {0}, l = {263}, m = "invokeSuspend", n = {"request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$saveAddress$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Address getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase saveAddressUsecase;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null) {
                camera2StreamConfigurationMap = "";
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SaveAddressRequest saveAddressRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SaveAddressRequest(camera2StreamConfigurationMap, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiModelKt.toDomainAddress(this.getHighResolutionOutputSizeshNQ4ISI));
            saveAddressUsecase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(saveAddressRequest);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = saveAddressUsecase.invoke2(saveAddressRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel = this.Camera2StreamConfigurationMap;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            if (data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress saveAddress = (com.paypal.oslo.feature.bnplacquisition.domain.model.address.saveaddress.SaveAddress) data;
                if (saveAddress.getSuccess() != null) {
                    personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressSuccess(personalInfoUiModel, saveAddress));
                }
            }
            personalInfoUiMapper3 = personalInfoViewModel.getOutputFormats;
            personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError(personalInfoUiModel, personalInfoUiMapper3.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel2 = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel2 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.getHighResolutionOutputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError) {
            ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError) useCaseResult).getErrorDetail().getMessage();
            ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId();
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(personalInfoViewModel2), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleAddressValidationError$1(address, personalInfoViewModel2, personalInfoUiModel2, null), 3, null);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel3 = this.getHighSpeedVideoFpsRanges;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(decline.getData(), decline.getCorrelationId());
            personalInfoUiMapper2 = personalInfoViewModel3.getOutputFormats;
            personalInfoViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.ApplicationDeclined(personalInfoUiMapper2.toDeclineContent(from)));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel4 = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel3 = this.Camera2StreamConfigurationMap;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            personalInfoUiMapper = personalInfoViewModel4.getOutputFormats;
            personalInfoViewModel4.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.UpdateAddressError(personalInfoUiModel3, personalInfoUiMapper.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult))));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$saveAddress$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$saveAddress$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$saveAddress$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$saveAddress$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = personalInfoViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = address;
        this.Camera2StreamConfigurationMap = personalInfoUiModel;
    }
}

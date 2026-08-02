package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$loadDomainModel$1", f = "PersonalInfoViewModel.kt", i = {}, l = {444}, m = "invokeSuspend", n = {}, nl = {453}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$loadDomainModel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome annualIncome;
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.NationalIdentification nationalIdentification;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserInfo userInfo = this.getHighSpeedVideoFpsRangesFor.getData().getUserInfo();
            boolean z = false;
            sessionStorage.setNationalIdentificationRequired((userInfo == null || (nationalIdentification = userInfo.getNationalIdentification()) == null || !nationalIdentification.isRequired()) ? false : true);
            sessionStorage2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserInfo userInfo2 = this.getHighSpeedVideoFpsRangesFor.getData().getUserInfo();
            if (userInfo2 != null && (annualIncome = userInfo2.getAnnualIncome()) != null && annualIncome.isRequired()) {
                z = true;
            }
            sessionStorage2.setIncomeRequired(z);
            personalInfoUiMapper = this.getHighSpeedVideoSizes.getOutputFormats;
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplicationSuccess data = this.getHighSpeedVideoFpsRangesFor.getData();
            formFieldValidators = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            bnplAcquisitionFormatter = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
            addressFormatter = this.getHighSpeedVideoSizes.getInputFormats;
            personalInfoConfig = this.getHighSpeedVideoSizes.getOutputSizeshNQ4ISI;
            sessionStorage3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = personalInfoUiMapper.toUiModel(data, formFieldValidators, bnplAcquisitionFormatter, addressFormatter, personalInfoConfig, sessionStorage3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.DomainModelLoaded((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$loadDomainModel$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$loadDomainModel$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$loadDomainModel$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.LoadDomainModel loadDomainModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$loadDomainModel$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = personalInfoViewModel;
        this.getHighSpeedVideoFpsRangesFor = loadDomainModel;
    }
}

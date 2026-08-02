package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleFieldValidation$1", f = "PersonalInfoViewModel.kt", i = {0, 0}, l = {387}, m = "invokeSuspend", n = {"field", "$i$a$-also-PersonalInfoViewModel$handleFieldValidation$1$1"}, nl = {388}, s = {"L$3", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$handleFieldValidation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel copy$bnpl_acquisition_prodRelease;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators;
        java.lang.Object validate;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel findFormFieldById = this.getHighSpeedVideoFpsRangesFor.findFormFieldById(this.getHighResolutionOutputSizeshNQ4ISI);
            if (findFormFieldById != null) {
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                personalInfoViewModel = this.getInputFormats;
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId2 = this.getHighResolutionOutputSizeshNQ4ISI;
                copy$bnpl_acquisition_prodRelease = findFormFieldById.copy$bnpl_acquisition_prodRelease((r24 & 1) != 0 ? findFormFieldById.formFieldId : null, (r24 & 2) != 0 ? findFormFieldById.fieldValue : str, (r24 & 4) != 0 ? findFormFieldById.title : null, (r24 & 8) != 0 ? findFormFieldById.isRequired : false, (r24 & 16) != 0 ? findFormFieldById.validationState : null, (r24 & 32) != 0 ? findFormFieldById.validations : null, (r24 & 64) != 0 ? findFormFieldById.validators : null, (r24 & 128) != 0 ? findFormFieldById.config : null, (r24 & 256) != 0 ? findFormFieldById.metadata : null, (r24 & 512) != 0 ? findFormFieldById.hideContentDescription : null, (r24 & 1024) != 0 ? findFormFieldById.showContentDescription : null);
                formFieldValidators = personalInfoViewModel.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = findFormFieldById;
                this.getHighSpeedVideoSizesFor = personalInfoViewModel;
                this.getOutputMinFrameDuration = formFieldId2;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(findFormFieldById);
                this.Camera2StreamConfigurationMap = 0;
                this.getOutputFormats = 1;
                validate = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validate(copy$bnpl_acquisition_prodRelease, formFieldValidators, this);
                if (validate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                formFieldId = formFieldId2;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        formFieldId = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId) this.getOutputMinFrameDuration;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        personalInfoViewModel = personalInfoViewModel2;
        validate = obj;
        personalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValidated(formFieldId, (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel) validate));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleFieldValidation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleFieldValidation$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$handleFieldValidation$1(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiModel personalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handleFieldValidation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = personalInfoUiModel;
        this.getHighResolutionOutputSizeshNQ4ISI = formFieldId;
        this.getHighSpeedVideoFpsRanges = str;
        this.getInputFormats = personalInfoViewModel;
    }
}

package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$handleFieldValidation$1", f = "AdditionalInfoViewModel.kt", i = {0, 0, 0}, l = {197}, m = "invokeSuspend", n = {"allRows", "field", "$i$a$-also-AdditionalInfoViewModel$handleFieldValidation$1$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {"L$0", "L$4", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class AdditionalInfoViewModel$handleFieldValidation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel copy$bnpl_acquisition_prodRelease;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel;
        java.lang.Object validate;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) this.getHighSpeedVideoFpsRangesFor.getNationalIdentificationFieldRows(), (java.lang.Iterable) this.getHighSpeedVideoFpsRangesFor.getIncomeFieldRows());
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel findFormFieldById = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.findFormFieldById(plus, this.getHighResolutionOutputSizeshNQ4ISI);
            if (findFormFieldById != null) {
                java.lang.String str = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel2 = this.getOutputSizes;
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId2 = this.getHighResolutionOutputSizeshNQ4ISI;
                copy$bnpl_acquisition_prodRelease = findFormFieldById.copy$bnpl_acquisition_prodRelease((r24 & 1) != 0 ? findFormFieldById.formFieldId : null, (r24 & 2) != 0 ? findFormFieldById.fieldValue : str, (r24 & 4) != 0 ? findFormFieldById.title : null, (r24 & 8) != 0 ? findFormFieldById.isRequired : false, (r24 & 16) != 0 ? findFormFieldById.validationState : null, (r24 & 32) != 0 ? findFormFieldById.validations : null, (r24 & 64) != 0 ? findFormFieldById.validators : null, (r24 & 128) != 0 ? findFormFieldById.config : null, (r24 & 256) != 0 ? findFormFieldById.metadata : null, (r24 & 512) != 0 ? findFormFieldById.hideContentDescription : null, (r24 & 1024) != 0 ? findFormFieldById.showContentDescription : null);
                formFieldValidators = additionalInfoViewModel2.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plus);
                this.getOutputMinFrameDuration = findFormFieldById;
                additionalInfoViewModel = additionalInfoViewModel2;
                this.getOutputFormats = additionalInfoViewModel;
                this.getInputFormats = formFieldId2;
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(findFormFieldById);
                this.getHighSpeedVideoSizes = 0;
                this.getInputSizeshNQ4ISI = 1;
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
        formFieldId = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId) this.getInputFormats;
        additionalInfoViewModel = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel) this.getOutputFormats;
        kotlin.ResultKt.throwOnFailure(obj);
        validate = obj;
        additionalInfoViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.FieldValidated(formFieldId, (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel) validate));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$handleFieldValidation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$handleFieldValidation$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalInfoViewModel$handleFieldValidation$1(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel additionalInfoUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$handleFieldValidation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = additionalInfoUiModel;
        this.getHighResolutionOutputSizeshNQ4ISI = formFieldId;
        this.getHighSpeedVideoFpsRanges = str;
        this.getOutputSizes = additionalInfoViewModel;
    }
}

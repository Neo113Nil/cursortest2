package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateSingleField$1", f = "AddressAddViewModel.kt", i = {0, 0}, l = {143}, m = "invokeSuspend", n = {"field", "$i$a$-also-AddressAddViewModel$validateSingleField$1$1"}, nl = {144}, s = {"L$3", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class AddressAddViewModel$validateSingleField$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel findFormFieldById = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.findFormFieldById(((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState.Success) this.getHighSpeedVideoSizes).getUiModel().getAddressFieldRows(), this.Camera2StreamConfigurationMap);
            if (findFormFieldById != null) {
                addressAddViewModel = this.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId2 = this.Camera2StreamConfigurationMap;
                formFieldValidators = addressAddViewModel.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = findFormFieldById;
                this.getHighResolutionOutputSizeshNQ4ISI = addressAddViewModel;
                this.getOutputMinFrameDuration = formFieldId2;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(findFormFieldById);
                this.getHighSpeedVideoFpsRanges = 0;
                this.getInputFormats = 1;
                obj = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldExtensionsKt.validate(findFormFieldById, formFieldValidators, this);
                if (obj == coroutine_suspended) {
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
        addressAddViewModel = (com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        addressAddViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.FieldValidated(formFieldId, (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateSingleField$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateSingleField$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressAddViewModel$validateSingleField$1(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiState addressAddUiState, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateSingleField$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addressAddUiState;
        this.Camera2StreamConfigurationMap = formFieldId;
        this.getInputSizeshNQ4ISI = addressAddViewModel;
    }
}

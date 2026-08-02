package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handlePasteFormatting$1", f = "PersonalInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PersonalInfoViewModel$handlePasteFormatting$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter;
        java.lang.String digitsOnly;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore metadata;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MaskFieldMetadata maskFieldMetadata;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter2;
        com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handlePasteFormatting$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoFpsRangesFor.ordinal()];
        if (i == 1) {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel = this.getHighResolutionOutputSizeshNQ4ISI;
            if (formFieldModel == null || (metadata = formFieldModel.getMetadata()) == null || (maskFieldMetadata = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MaskFieldMetadata) metadata.get(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.MetadataKey.Mask.INSTANCE)) == null || (str = maskFieldMetadata.getActualPattern()) == null) {
                str = "MM/dd/yyyy";
            }
            bnplAcquisitionFormatter = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            digitsOnly = com.paypal.oslo.feature.bnplacquisition.ui.common.util.StringExtensionsKt.digitsOnly(bnplAcquisitionFormatter.parseDateAndReformat(this.getHighSpeedVideoSizes, "yyyy-MM-dd", str));
        } else if (i == 2) {
            java.lang.String digitsOnly2 = com.paypal.oslo.feature.bnplacquisition.ui.common.util.StringExtensionsKt.digitsOnly(this.getHighSpeedVideoSizes);
            bnplAcquisitionFormatter2 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            personalInfoConfig = this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI;
            digitsOnly = bnplAcquisitionFormatter2.formatPhoneAsTyped$bnpl_acquisition_prodRelease(personalInfoConfig.getCtx().getCountry().name(), digitsOnly2);
        } else {
            digitsOnly = this.getHighSpeedVideoSizes;
        }
        this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoEvent.FieldValueChanged(this.getHighSpeedVideoFpsRangesFor, digitsOnly));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handlePasteFormatting$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BIRTH_DATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.PHONE_NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handlePasteFormatting$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoViewModel$handlePasteFormatting$1(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel formFieldModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel personalInfoViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel$handlePasteFormatting$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = formFieldId;
        this.getHighResolutionOutputSizeshNQ4ISI = formFieldModel;
        this.Camera2StreamConfigurationMap = personalInfoViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}

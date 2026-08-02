package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiMapper;", "", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoContentProvider;", "contentProvider", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "applicationFailureUiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;", "configContext", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "buildGenericErrorContent", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;", "errorType", "buildErrorContent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorType;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FullscreenErrorUiModel;", "", "formattedAmount", "", "nationalIdentificationRequired", "selectedOfferId", "incomeRequired", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "buildInitialUiModel", "(Ljava/lang/String;ZLjava/lang/String;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiModel;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoContentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/ApplicationFailureUiMapper;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplacquisition/config/ConfigContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdditionalInfoUiMapper {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.config.ConfigContext Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AdditionalInfoUiMapper(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoContentProvider additionalInfoContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationFailureUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configContext, "");
        this.getHighResolutionOutputSizeshNQ4ISI = additionalInfoContentProvider;
        this.getHighSpeedVideoSizes = applicationFailureUiMapper;
        this.Camera2StreamConfigurationMap = configContext;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel buildGenericErrorContent() {
        return this.getHighSpeedVideoSizes.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null));
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorUiModel buildErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType errorType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
        return this.getHighSpeedVideoSizes.toErrorContent(errorType);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel buildInitialUiModel(java.lang.String formattedAmount, boolean nationalIdentificationRequired, java.lang.String selectedOfferId, boolean incomeRequired) {
        java.util.List emptyList;
        java.util.List emptyList2;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel textInput;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel textInput2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedOfferId, "");
        if (!nationalIdentificationRequired) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.Companion companion = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.INSTANCE;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.NATIONAL_IDENTIFICATION;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.NUMERIC;
            com.paypal.oslo.core.commonui.utils.RefText nationalIdentificationFieldTitle = this.getHighResolutionOutputSizeshNQ4ISI.getNationalIdentificationFieldTitle();
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion companion2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addSensitive(builder, "^^00");
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addPasteFilterOnlyDigits(builder);
            textInput2 = companion.textInput(formFieldId, (r27 & 2) != 0 ? "" : null, (r27 & 4) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.TEXT : inputType, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : 4, (r27 & 32) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : nationalIdentificationFieldTitle, (r27 & 64) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE.getEMPTY() : builder.build(), (r27 & 128) != 0 ? new java.util.ArrayList() : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? true : true, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.validateSsnWR(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.required(textInput2.getValidations(), this.getHighResolutionOutputSizeshNQ4ISI.getNationalIdentificationFieldError()), this.Camera2StreamConfigurationMap.getCountry().name(), com.paypal.oslo.core.i18n.domain.model.DocumentType.TAX_ID, com.paypal.oslo.core.i18n.domain.model.DocumentSubType.SSN4, this.getHighResolutionOutputSizeshNQ4ISI.getNationalIdentificationFieldError());
            emptyList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(kotlin.collections.CollectionsKt.listOf(textInput2)));
        }
        if (!incomeRequired) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.Companion companion3 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.INSTANCE;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.INCOME;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.NUMERIC;
            com.paypal.oslo.core.commonui.utils.RefText incomeFieldTitle = this.getHighResolutionOutputSizeshNQ4ISI.getIncomeFieldTitle();
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion companion4 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE;
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addCurrency$default(builder2, false, 1, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addValidationTiming(builder2, true, true);
            textInput = companion3.textInput(formFieldId2, (r27 & 2) != 0 ? "" : null, (r27 & 4) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.TEXT : inputType2, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : 7, (r27 & 32) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : incomeFieldTitle, (r27 & 64) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE.getEMPTY() : builder2.build(), (r27 & 128) != 0 ? new java.util.ArrayList() : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? true : true, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.income(textInput.getValidations(), 0L, this.getHighResolutionOutputSizeshNQ4ISI.getIncomeFieldEmptyError(), this.getHighResolutionOutputSizeshNQ4ISI.getIncomeFieldInvalidError(), this.getHighResolutionOutputSizeshNQ4ISI.getIncomeFieldZeroWarning());
            emptyList2 = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(kotlin.collections.CollectionsKt.listOf(textInput)));
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel(emptyList, emptyList2, formattedAmount, selectedOfferId, false, this.getHighResolutionOutputSizeshNQ4ISI.getScreenTitle(), this.getHighResolutionOutputSizeshNQ4ISI.getScreenDescription(), this.getHighResolutionOutputSizeshNQ4ISI.getContinueButtonText(), this.getHighResolutionOutputSizeshNQ4ISI.getIncomeGuidanceTitle(), this.getHighResolutionOutputSizeshNQ4ISI.getIncomeGuidanceBody(), this.getHighResolutionOutputSizeshNQ4ISI.getIncomeGuidanceDoneButtonText(), this.getHighResolutionOutputSizeshNQ4ISI.getToolBarContent());
    }
}

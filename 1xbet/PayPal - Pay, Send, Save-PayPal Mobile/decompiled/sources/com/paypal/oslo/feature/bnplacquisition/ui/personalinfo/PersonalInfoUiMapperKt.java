package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\b\u001a\u00020\u000b*\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\b\u0010\f\u001a'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001c\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/DateOfBirth;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;", "bnplAcquisitionFormatter", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;", "localizedDateFormat", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoConfig;", "config", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/DateOfBirthUiModel;", "toUiModel", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/DateOfBirth;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/util/BnplAcquisitionFormatter;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoConfig;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/DateOfBirthUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/NationalIdentification;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/SocialSecurityNumberUiModel;", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/NationalIdentification;)Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/SocialSecurityNumberUiModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoContentProvider;", "contentProvider", "dateOfBirth", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "createDobFormField", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/DateOfBirthUiModel;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "socialSecurityNumber", "", "countryCode", "createSsnFormField", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoContentProvider;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/SocialSecurityNumberUiModel;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/AnnualIncome;", "annualIncome", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;", "formFieldValidators", "createIncomeFormField", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/AnnualIncome;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoContentProvider;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldModel;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoUiMapperKt {
    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel toUiModel(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.DateOfBirth dateOfBirth, com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat localizedDateFormat, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig) {
        java.lang.String str;
        str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplAcquisitionFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localizedDateFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoConfig, "");
        java.lang.String birthDate = dateOfBirth != null ? dateOfBirth.getBirthDate() : null;
        if (!personalInfoConfig.getUis().getFormSection().getShouldShowEmptyDateOfBirth()) {
            java.lang.String birthDate2 = dateOfBirth != null ? dateOfBirth.getBirthDate() : null;
            str = bnplAcquisitionFormatter.parseDateAndReformat(birthDate2 != null ? birthDate2 : "", "yyyy-MM-dd", localizedDateFormat.getDatePattern());
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel(str, dateOfBirth != null ? dateOfBirth.isRequired() : false, birthDate);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SocialSecurityNumberUiModel toUiModel(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.NationalIdentification nationalIdentification) {
        java.lang.String value = nationalIdentification != null ? nationalIdentification.getValue() : null;
        if (value == null) {
            value = "";
        }
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SocialSecurityNumberUiModel(value, nationalIdentification != null ? nationalIdentification.isRequired() : false);
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel createDobFormField(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider personalInfoContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel dateOfBirthUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat localizedDateFormat) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel textInput;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localizedDateFormat, "");
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.Companion companion = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BIRTH_DATE;
        java.lang.String digitsOnly = com.paypal.oslo.feature.bnplacquisition.ui.common.util.StringExtensionsKt.digitsOnly(dateOfBirthUiModel.getValue());
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.NUMERIC;
        com.paypal.oslo.core.commonui.utils.RefText dobFieldTitle = personalInfoContentProvider.getDobFieldTitle();
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion companion2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, null);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addMask(builder, localizedDateFormat.getInputMask(), localizedDateFormat.getDatePattern());
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addBreakLinePasteFilter(builder);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addPasteFilterOnlyDigits(builder);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.m12363addImeActionZ1hltKU$default(builder, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.BIRTH_DATE, 0, 2, null);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        textInput = companion.textInput(formFieldId, (r27 & 2) != 0 ? "" : digitsOnly, (r27 & 4) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.TEXT : inputType, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : dobFieldTitle, (r27 & 64) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE.getEMPTY() : builder.build(), (r27 & 128) != 0 ? new java.util.ArrayList() : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? true : dateOfBirthUiModel.isRequired(), (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.dateOfBirth(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.exactLength(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.required(textInput.getValidations(), personalInfoContentProvider.getDobEmptyError()), 8, personalInfoContentProvider.getDobInvalidError()), localizedDateFormat.getValidationPattern(), personalInfoContentProvider.getDobInvalidError(), personalInfoContentProvider.getDobAgeError(), personalInfoContentProvider.getDobInvalidError());
        return textInput;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel createSsnFormField(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider personalInfoContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SocialSecurityNumberUiModel socialSecurityNumberUiModel, java.lang.String str) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel textInput;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoContentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socialSecurityNumberUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.Companion companion = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.NATIONAL_IDENTIFICATION;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.NUMERIC;
        com.paypal.oslo.core.commonui.utils.RefText ssnFieldTitle = personalInfoContentProvider.getSsnFieldTitle();
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion companion2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, null);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addSensitive(builder, "^^00");
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.m12363addImeActionZ1hltKU$default(builder, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.NATIONAL_IDENTIFICATION, 0, 2, null);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        textInput = companion.textInput(formFieldId, (r27 & 2) != 0 ? "" : "", (r27 & 4) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.TEXT : inputType, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : 4, (r27 & 32) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : ssnFieldTitle, (r27 & 64) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE.getEMPTY() : builder.build(), (r27 & 128) != 0 ? new java.util.ArrayList() : null, (r27 & 256) != 0 ? null : null, (r27 & 512) != 0 ? true : socialSecurityNumberUiModel.isRequired(), (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : personalInfoContentProvider.getHideFieldContentDescription(), (r27 & 4096) == 0 ? personalInfoContentProvider.getShowFieldContentDescription() : null);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.validateSsnWR(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.required(textInput.getValidations(), personalInfoContentProvider.getSsnError()), str, com.paypal.oslo.core.i18n.domain.model.DocumentType.TAX_ID, com.paypal.oslo.core.i18n.domain.model.DocumentSubType.SSN4, personalInfoContentProvider.getSsnError());
        return textInput;
    }

    public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel createIncomeFormField(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome annualIncome, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider personalInfoContentProvider) {
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel textInput;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money amount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalInfoContentProvider, "");
        boolean isRequired = annualIncome != null ? annualIncome.isRequired() : false;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.Companion companion = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.INCOME;
        java.lang.String value = (annualIncome == null || (amount = annualIncome.getAmount()) == null) ? null : amount.getValue();
        if (value == null) {
            value = "";
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType inputType = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.NUMERIC;
        com.paypal.oslo.core.commonui.utils.RefText incomeFieldTitle = personalInfoContentProvider.getIncomeFieldTitle();
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Companion companion2 = com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder builder = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.Builder(null, 1, null);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addCurrency$default(builder, false, 1, null);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.addValidationTiming(builder, true, true);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModelsKt.m12363addImeActionZ1hltKU$default(builder, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.INCOME, 0, 2, null);
        textInput = companion.textInput(formFieldId, (r27 & 2) != 0 ? "" : value, (r27 & 4) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.InputType.TEXT : inputType, (r27 & 8) != 0 ? false : false, (r27 & 16) != 0 ? null : 7, (r27 & 32) != 0 ? com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("") : incomeFieldTitle, (r27 & 64) != 0 ? com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FieldMetadataStore.INSTANCE.getEMPTY() : builder.build(), (r27 & 128) != 0 ? new java.util.ArrayList() : null, (r27 & 256) != 0 ? null : formFieldValidators, (r27 & 512) != 0 ? true : isRequired, (r27 & 1024) != 0 ? null : com.paypal.pds.core.Icon.NoIcon.INSTANCE, (r27 & 2048) != 0 ? null : null, (r27 & 4096) == 0 ? null : null);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldsValidationsKt.income(textInput.getValidations(), 100L, personalInfoContentProvider.getIncomeEmptyError(), personalInfoContentProvider.getIncomeInvalidError(), personalInfoContentProvider.getIncomeZeroWarning());
        return textInput;
    }

    public static final /* synthetic */ java.util.List access$createDobFieldRowsIfEnabled(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.DateOfBirthUiModel dateOfBirthUiModel, com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat localizedDateFormat, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider personalInfoContentProvider) {
        if (dateOfBirthUiModel == null || localizedDateFormat == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(kotlin.collections.CollectionsKt.listOf(createDobFormField(personalInfoContentProvider, dateOfBirthUiModel, localizedDateFormat))));
    }

    public static final /* synthetic */ java.util.List access$createIncomeFieldRowsIfEnabled(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.AnnualIncome annualIncome, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider personalInfoContentProvider, boolean z, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        sessionStorage.setIncomeRequired(false);
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldModel createIncomeFormField = createIncomeFormField(annualIncome, formFieldValidators, personalInfoContentProvider);
        if (!personalInfoConfig.getUis().getFormSection().getShouldShowAnnualIncome()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (z) {
            if (annualIncome != null && annualIncome.isRequired()) {
                com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money amount = annualIncome.getAmount();
                java.lang.String value = amount != null ? amount.getValue() : null;
                if (value == null || value.length() == 0) {
                    sessionStorage.setIncomeRequired(true);
                    return kotlin.collections.CollectionsKt.emptyList();
                }
            }
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(kotlin.collections.CollectionsKt.listOf(createIncomeFormField)));
        }
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(kotlin.collections.CollectionsKt.listOf(createIncomeFormField)));
    }

    public static final /* synthetic */ java.util.List access$createSsnFieldRowsIfEnabled(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SocialSecurityNumberUiModel socialSecurityNumberUiModel, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoContentProvider personalInfoContentProvider, java.lang.String str, boolean z, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        sessionStorage.setNationalIdentificationRequired(false);
        if (socialSecurityNumberUiModel == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (z) {
            if (socialSecurityNumberUiModel.isRequired() && socialSecurityNumberUiModel.getValue().length() == 0) {
                sessionStorage.setNationalIdentificationRequired(true);
                return kotlin.collections.CollectionsKt.emptyList();
            }
            return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(kotlin.collections.CollectionsKt.listOf(createSsnFormField(personalInfoContentProvider, socialSecurityNumberUiModel, str))));
        }
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldRow(kotlin.collections.CollectionsKt.listOf(createSsnFormField(personalInfoContentProvider, socialSecurityNumberUiModel, str))));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.SocialSecurityNumberUiModel access$createSsnUiModelIfEnabled(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.NationalIdentification nationalIdentification, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig) {
        if (personalInfoConfig.getUis().getFormSection().getShouldShowNationalIdentification()) {
            return toUiModel(nationalIdentification);
        }
        return null;
    }
}

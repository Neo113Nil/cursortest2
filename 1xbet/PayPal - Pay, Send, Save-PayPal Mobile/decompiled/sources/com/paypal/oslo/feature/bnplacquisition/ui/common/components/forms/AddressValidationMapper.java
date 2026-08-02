package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/AddressValidationMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/i18n/domain/model/AddressValidationError;", "validationErrors", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;", "fieldId", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$AddressField;", "addressValidation", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getErrorMessagesForField", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/Validation$AddressField;)Ljava/util/List;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldId;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddressValidationMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AddressValidationMapper() {
    }

    public final java.util.List<com.paypal.oslo.core.commonui.utils.RefText> getErrorMessagesForField(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.AddressValidationError> validationErrors, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId fieldId, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.Validation.AddressField addressValidation) {
        com.paypal.oslo.core.commonui.utils.RefText poBoxErrorMessage;
        boolean highSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationErrors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressValidation, "");
        java.util.ArrayList<com.paypal.oslo.core.i18n.domain.model.AddressValidationError> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : validationErrors) {
            com.paypal.oslo.core.i18n.domain.model.AddressValidationError addressValidationError = (com.paypal.oslo.core.i18n.domain.model.AddressValidationError) obj;
            if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) addressValidationError).getFields(), fieldId);
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) addressValidationError).getFields(), fieldId);
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) addressValidationError).getFields(), fieldId);
            } else if (addressValidationError instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) {
                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(((com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox) addressValidationError).getFields(), fieldId);
            }
            if (highSpeedVideoFpsRangesFor) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.paypal.oslo.core.i18n.domain.model.AddressValidationError addressValidationError2 : arrayList) {
            if (addressValidationError2 instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.MissingRequired) {
                poBoxErrorMessage = addressValidation.getRequiredErrorMessage();
            } else if (addressValidationError2 instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.InvalidPattern) {
                poBoxErrorMessage = addressValidation.getInvalidPatternErrorMessage();
            } else if (addressValidationError2 instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsInvalidCharacter) {
                poBoxErrorMessage = addressValidation.getInvalidCharacterErrorMessage();
            } else {
                poBoxErrorMessage = addressValidationError2 instanceof com.paypal.oslo.core.i18n.domain.model.AddressValidationError.AddressContainsPOBox ? addressValidation.getPoBoxErrorMessage() : null;
            }
            if (poBoxErrorMessage != null) {
                arrayList2.add(poBoxErrorMessage);
            }
        }
        return arrayList2;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId formFieldId) {
        java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return false;
        }
        for (com.paypal.oslo.core.i18n.domain.model.Field field : list2) {
            if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine1) {
                if (formFieldId == com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.ADDRESS_LINE_1) {
                    return true;
                }
            } else if (field instanceof com.paypal.oslo.core.i18n.domain.model.AddressLine2) {
                if (formFieldId == com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.ADDRESS_LINE_2) {
                    return true;
                }
            } else if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea1) {
                if (formFieldId == com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.STATE) {
                    return true;
                }
            } else if (field instanceof com.paypal.oslo.core.i18n.domain.model.AdminArea2) {
                if (formFieldId == com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.CITY) {
                    return true;
                }
            } else if ((field instanceof com.paypal.oslo.core.i18n.domain.model.PostalCode) && formFieldId == com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldId.POSTAL_CODE) {
                return true;
            }
        }
        return false;
    }
}

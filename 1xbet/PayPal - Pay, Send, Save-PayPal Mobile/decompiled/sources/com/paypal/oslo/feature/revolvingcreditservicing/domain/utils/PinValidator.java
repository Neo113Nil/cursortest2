package com.paypal.oslo.feature.revolvingcreditservicing.domain.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/utils/PinValidator;", "", "", "pin", "confirmation", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinField;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinValidationError;", "validatePin", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PinValidator {
    java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> validatePin(java.lang.String pin, java.lang.String confirmation);
}

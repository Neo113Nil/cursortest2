package com.paypal.oslo.feature.identity.phoneconfirmation.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/PhoneConfirmationValidation;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidPhoneContact;", "invalidPhoneContactError", "()Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidPhoneContact;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneConfirmationValidation {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.phoneconfirmation.domain.PhoneConfirmationValidation INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.PhoneConfirmationValidation();

    private PhoneConfirmationValidation() {
    }

    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact invalidPhoneContactError() {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact("Invalid phone contact format");
    }
}

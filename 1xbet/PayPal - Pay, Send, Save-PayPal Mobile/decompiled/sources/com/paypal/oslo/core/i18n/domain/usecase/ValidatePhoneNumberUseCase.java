package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/ValidatePhoneNumberUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidatePhoneNumberUseCase {
    @javax.inject.Inject
    public ValidatePhoneNumberUseCase() {
    }

    public final com.paypal.oslo.core.i18n.domain.model.PhoneNumberError invoke(com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        if (kotlin.text.StringsKt.isBlank(phoneNumber.getNationalNumber())) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.TOO_SHORT;
        }
        if (com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.hasAlphaCharacters(phoneNumber.getNationalNumber())) {
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.ALPHA_CHARACTER_ERROR;
        }
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber> phoneUtilNumber = com.paypal.oslo.core.i18n.domain.util.PhoneUtilKt.toPhoneUtilNumber(phoneNumber);
        if (phoneUtilNumber instanceof arrow.core.Either.Right) {
            if (com.google.i18n.phonenumbers.PhoneNumberUtil.getInstance().isValidNumber((com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) ((arrow.core.Either.Right) phoneUtilNumber).getValue())) {
                return null;
            }
            return com.paypal.oslo.core.i18n.domain.model.PhoneNumberError.INVALID_PHONE_NUMBER_FOR_REGION;
        }
        if (phoneUtilNumber instanceof arrow.core.Either.Left) {
            return (com.paypal.oslo.core.i18n.domain.model.PhoneNumberError) ((arrow.core.Either.Left) phoneUtilNumber).getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}

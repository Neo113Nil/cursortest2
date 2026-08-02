package com.paypal.oslo.feature.identity.passwordlogin.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidator;", "", "<init>", "()V", "", "password", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult;", "validate", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasswordValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PasswordValidator() {
    }

    public final com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult validate(java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        if (!com.paypal.oslo.feature.identity.shared.domain.validator.RangeValidation.INSTANCE.getPASSWORD().validate(password)) {
            return com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.RangeMismatch.INSTANCE;
        }
        if (!com.paypal.oslo.feature.identity.shared.domain.validator.PatternValidation.INSTANCE.getPASSWORD().validate(password)) {
            return com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.ContainsDisallowedCharacters.INSTANCE;
        }
        if (!com.paypal.oslo.feature.identity.shared.domain.validator.SafeCharacterValidation.INSTANCE.getPASSWORD().validate(password)) {
            return com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.ContainsDisallowedCharacters.INSTANCE;
        }
        return com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Valid.INSTANCE;
    }
}

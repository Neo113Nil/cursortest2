package com.paypal.oslo.feature.identity.passwordrecovery.domain.validation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidatorImpl;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator;", "<init>", "()V", "", "password", "publicCredential", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "validate", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordValidatorImpl implements com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PasswordValidatorImpl() {
    }

    @Override // com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator
    public final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult validate(java.lang.String password, java.lang.String publicCredential) {
        boolean z;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        java.lang.String str = password;
        if (str.length() == 0) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Empty.INSTANCE;
        }
        if (password.length() < 8) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooShort.INSTANCE;
        }
        if (password.length() > 64) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooLong.INSTANCE;
        }
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            if (java.lang.Character.isUpperCase(str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z2 = false;
                break;
            }
            if (java.lang.Character.isLowerCase(str.charAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= str.length()) {
                z3 = false;
                break;
            }
            if (java.lang.Character.isDigit(str.charAt(i3))) {
                z3 = true;
                break;
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= str.length()) {
                break;
            }
            if (!java.lang.Character.isLetterOrDigit(str.charAt(i4))) {
                z4 = true;
                break;
            }
            i4++;
        }
        if (!z || !z2 || !z3 || !z4) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooWeak.INSTANCE;
        }
        if (publicCredential != null && !kotlin.text.StringsKt.isBlank(publicCredential) && kotlin.text.StringsKt.equals(password, publicCredential, true)) {
            return com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.MatchesCredential.INSTANCE;
        }
        return com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Valid.INSTANCE;
    }
}

package com.paypal.oslo.feature.identity.passwordrecovery.domain.validation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator;", "", "", "password", "publicCredential", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "validate", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PasswordValidator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator.Companion INSTANCE = com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator.Companion.getHighSpeedVideoFpsRangesFor;
    public static final int PASSWORD_MAX_LENGTH = 64;
    public static final int PASSWORD_MIN_LENGTH = 8;

    com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult validate(java.lang.String password, java.lang.String publicCredential);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult validate$default(com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator passwordValidator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validate");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return passwordValidator.validate(str, str2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidator$Companion;", "", "<init>", "()V", "", "PASSWORD_MIN_LENGTH", com.visa.cbp.getEncExpo.warmup, "PASSWORD_MAX_LENGTH"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final int PASSWORD_MAX_LENGTH = 64;
        public static final int PASSWORD_MIN_LENGTH = 8;
        static final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidator.Companion();

        private Companion() {
        }
    }
}

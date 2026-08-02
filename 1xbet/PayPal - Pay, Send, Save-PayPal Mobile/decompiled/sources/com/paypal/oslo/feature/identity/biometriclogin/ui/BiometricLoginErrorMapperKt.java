package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "toBiometricLoginError", "(Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricLoginErrorMapperKt {
    public static final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError toBiometricLoginError(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError biometricPromptError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricPromptError, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(biometricPromptError, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.UserCancelled.INSTANCE)) {
            return com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.UserCancelled.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(biometricPromptError, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.Lockout.INSTANCE)) {
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout(false);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(biometricPromptError, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.LockoutPermanent.INSTANCE)) {
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout(true);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(biometricPromptError, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.NoBiometricEnrolled.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(biometricPromptError, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.HardwareUnavailable.INSTANCE)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(biometricPromptError, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.SignatureNotReturned.INSTANCE)) {
                return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed("Signature not returned from biometric prompt");
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(biometricPromptError, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationRejected.INSTANCE)) {
                return com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationRejected.INSTANCE;
            }
            if (biometricPromptError instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError) {
                return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown(((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError) biometricPromptError).getMessage(), null, 2, null);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.BiometricUnavailable.INSTANCE;
    }
}

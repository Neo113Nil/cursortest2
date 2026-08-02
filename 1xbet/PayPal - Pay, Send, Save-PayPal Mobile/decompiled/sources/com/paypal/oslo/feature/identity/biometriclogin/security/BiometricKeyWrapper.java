package com.paypal.oslo.feature.identity.biometriclogin.security;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "Ljava/security/Signature;", "createLockedSignature", "()Larrow/core/Either;", "signature", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "sign", "(Ljava/security/Signature;Ljava/lang/String;)Larrow/core/Either;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BiometricKeyWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper.Companion INSTANCE = com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper.Companion.getHighSpeedVideoFpsRanges;
    public static final java.lang.String KEY_ALIAS = "deviceAuthBiometricAsymmetricKey";

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.security.Signature> createLockedSignature();

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> sign(java.security.Signature signature, java.lang.String data);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper$Companion;", "", "<init>", "()V", "", "KEY_ALIAS", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String KEY_ALIAS = "deviceAuthBiometricAsymmetricKey";
        static final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper.Companion();

        private Companion() {
        }
    }
}

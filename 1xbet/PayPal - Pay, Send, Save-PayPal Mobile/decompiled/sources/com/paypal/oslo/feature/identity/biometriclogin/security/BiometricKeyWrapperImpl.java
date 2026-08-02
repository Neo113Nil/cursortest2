package com.paypal.oslo.feature.identity.biometriclogin.security;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapperImpl;", "Lcom/paypal/oslo/feature/identity/biometriclogin/security/BiometricKeyWrapper;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;", "authSecureKeyWrapper", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "Ljava/security/Signature;", "createLockedSignature", "()Larrow/core/Either;", "signature", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "sign", "(Ljava/security/Signature;Ljava/lang/String;)Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricKeyWrapperImpl implements com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public BiometricKeyWrapperImpl(com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper authSecureKeyWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSecureKeyWrapper, "");
        this.getHighSpeedVideoFpsRangesFor = authSecureKeyWrapper;
    }

    @Override // com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.security.Signature> createLockedSignature() {
        return this.getHighSpeedVideoFpsRangesFor.generateSignature("deviceAuthBiometricAsymmetricKey");
    }

    @Override // com.paypal.oslo.feature.identity.biometriclogin.security.BiometricKeyWrapper
    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> sign(java.security.Signature signature, java.lang.String data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return this.getHighSpeedVideoFpsRangesFor.signDataAndBase64Encode(signature, data);
    }
}

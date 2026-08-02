package com.paypal.oslo.feature.identity.devicebinding.security;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/security/BiometricKeyWrapper;", "", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;", "authSecureKeyWrapper", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;)V", "Landroid/content/Context;", "context", "", "generateKey", "(Landroid/content/Context;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BiometricKeyWrapper {
    public static final java.lang.String BIOMETRIC_KEY_ALIAS = "deviceAuthBiometricAsymmetricKey";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public BiometricKeyWrapper(com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper authSecureKeyWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSecureKeyWrapper, "");
        this.getHighSpeedVideoFpsRangesFor = authSecureKeyWrapper;
    }

    public final java.lang.String generateKey(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> generateEncodedPublicKey = this.getHighSpeedVideoFpsRangesFor.generateEncodedPublicKey(context, "deviceAuthBiometricAsymmetricKey", true);
        if (generateEncodedPublicKey instanceof arrow.core.Either.Left) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityErrorExtensionsKt.toErrorMessage((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError) ((arrow.core.Either.Left) generateEncodedPublicKey).getValue(), "biometric key").toString());
        }
        if (generateEncodedPublicKey instanceof arrow.core.Either.Right) {
            return (java.lang.String) ((arrow.core.Either.Right) generateEncodedPublicKey).getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}

package com.paypal.oslo.feature.identity.devicebinding.security;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/security/NonBiometricKeyWrapper;", "", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;", "authSecureKeyWrapper", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;)V", "Landroid/content/Context;", "context", "", "generateKey", "(Landroid/content/Context;)Ljava/lang/String;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "Lkotlin/Pair;", "generateNonceAndSignature", "()Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecureKeyWrapper;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NonBiometricKeyWrapper {
    public static final java.lang.String LLS_KEY_ALIAS = "userPreviewAsymmetricKey";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public NonBiometricKeyWrapper(com.paypal.oslo.feature.identity.foundation.security.AuthSecureKeyWrapper authSecureKeyWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authSecureKeyWrapper, "");
        this.Camera2StreamConfigurationMap = authSecureKeyWrapper;
    }

    public final java.lang.String generateKey(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> generateEncodedPublicKey = this.Camera2StreamConfigurationMap.generateEncodedPublicKey(context, LLS_KEY_ALIAS, false);
        if (generateEncodedPublicKey instanceof arrow.core.Either.Left) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.identity.foundation.security.AuthSecurityErrorExtensionsKt.toErrorMessage((com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError) ((arrow.core.Either.Left) generateEncodedPublicKey).getValue(), "non-biometric key").toString());
        }
        if (generateEncodedPublicKey instanceof arrow.core.Either.Right) {
            return (java.lang.String) ((arrow.core.Either.Right) generateEncodedPublicKey).getValue();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, kotlin.Pair<java.lang.String, java.lang.String>> generateNonceAndSignature() {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            java.security.Signature signature = (java.security.Signature) defaultRaise2.bind(this.Camera2StreamConfigurationMap.generateSignature(LLS_KEY_ALIAS));
            java.lang.String generateNonce = com.paypal.oslo.feature.identity.devicebinding.security.utils.NonceUtilsKt.generateNonce();
            kotlin.Pair pair = new kotlin.Pair((java.lang.String) defaultRaise2.bind(this.Camera2StreamConfigurationMap.signDataAndBase64Encode(signature, generateNonce)), generateNonce);
            defaultRaise.complete();
            return new arrow.core.Either.Right(pair);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}

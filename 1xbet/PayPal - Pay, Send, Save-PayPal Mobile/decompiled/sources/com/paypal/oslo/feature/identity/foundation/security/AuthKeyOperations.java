package com.paypal.oslo.feature.identity.foundation.security;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u000fJ#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\f\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0015H&¢\u0006\u0004\b\u001b\u0010\u001cÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/security/AuthKeyOperations;", "", "Landroid/content/Context;", "context", "", "keyName", "", "userAuthRequired", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/foundation/security/AuthSecurityError;", "generateEncodedPublicKey", "(Landroid/content/Context;Ljava/lang/String;Z)Larrow/core/Either;", "keyAlias", "Ljava/security/Signature;", "generateSignature", "(Ljava/lang/String;)Larrow/core/Either;", "signature", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "signDataAndBase64Encode", "(Ljava/security/Signature;Ljava/lang/String;)Larrow/core/Either;", "publicKey", "", "verifySignature", "(Ljava/lang/String;[BLjava/lang/String;)Larrow/core/Either;", "keyExists", "", "deleteKey", "base64AndUrlSafeEncodedStringFromBytes", "([B)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AuthKeyOperations {
    java.lang.String base64AndUrlSafeEncodedStringFromBytes(byte[] data);

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, kotlin.Unit> deleteKey(java.lang.String keyAlias);

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> generateEncodedPublicKey(android.content.Context context, java.lang.String keyName, boolean userAuthRequired);

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.security.Signature> generateSignature(java.lang.String keyAlias);

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.Boolean> keyExists(java.lang.String keyAlias);

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.String> signDataAndBase64Encode(java.security.Signature signature, java.lang.String data);

    arrow.core.Either<com.paypal.oslo.feature.identity.foundation.security.AuthSecurityError, java.lang.Boolean> verifySignature(java.lang.String publicKey, byte[] data, java.lang.String signature);
}

package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "verifier", "generateCodeChallenge", "(Ljava/lang/String;)Ljava/lang/String;", "generateCodeVerifier", "()Ljava/lang/String;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthUriManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String generateCodeVerifier() {
        byte[] bArr = new byte[32];
        new java.security.SecureRandom().nextBytes(bArr);
        return com.izettle.android.auth.ExtensionsKt.toBase64(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String generateCodeChallenge(java.lang.String str) {
        byte[] bytes = str.getBytes(kotlin.text.Charsets.US_ASCII);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(bytes, 0, bytes.length);
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "");
        return com.izettle.android.auth.ExtensionsKt.toBase64(digest);
    }
}

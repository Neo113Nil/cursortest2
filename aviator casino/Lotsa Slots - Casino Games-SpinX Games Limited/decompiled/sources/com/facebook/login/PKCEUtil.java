package com.facebook.login;

/* compiled from: PKCEUtil.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/login/PKCEUtil;", "", "()V", "createCodeExchangeRequest", "Lcom/facebook/GraphRequest;", "authorizationCode", "", "redirectUri", "codeVerifier", "generateCodeChallenge", "codeChallengeMethod", "Lcom/facebook/login/CodeChallengeMethod;", "generateCodeVerifier", "isValidCodeVerifier", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PKCEUtil {
    public static final com.facebook.login.PKCEUtil INSTANCE = new com.facebook.login.PKCEUtil();

    private PKCEUtil() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isValidCodeVerifier(java.lang.String codeVerifier) {
        java.lang.String str = codeVerifier;
        if (str == null || str.length() == 0 || codeVerifier.length() < 43 || codeVerifier.length() > 128) {
            return false;
        }
        return new kotlin.text.Regex("^[-._~A-Za-z0-9]+$").matches(str);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String generateCodeVerifier() {
        int random = kotlin.ranges.RangesKt.random(new kotlin.ranges.IntRange(43, 128), kotlin.random.Random.INSTANCE);
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends char>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends char>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends char>) kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends char>) kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', io.ktor.util.date.GMTDateParser.ZONE), (java.lang.Iterable) new kotlin.ranges.CharRange('A', 'Z')), (java.lang.Iterable) new kotlin.ranges.CharRange('0', '9')), '-'), '.'), '_'), '~');
        java.util.ArrayList arrayList = new java.util.ArrayList(random);
        for (int i = 0; i < random; i++) {
            java.lang.Character ch = (java.lang.Character) kotlin.collections.CollectionsKt.random(plus, kotlin.random.Random.INSTANCE);
            ch.charValue();
            arrayList.add(ch);
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String generateCodeChallenge(java.lang.String codeVerifier, com.facebook.login.CodeChallengeMethod codeChallengeMethod) throws com.facebook.FacebookException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        if (!isValidCodeVerifier(codeVerifier)) {
            throw new com.facebook.FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == com.facebook.login.CodeChallengeMethod.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(kotlin.text.Charsets.US_ASCII);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            java.lang.String encodeToString = android.util.Base64.encodeToString(messageDigest.digest(), 11);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return encodeToString;
        } catch (java.lang.Exception e) {
            throw new com.facebook.FacebookException(e);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest createCodeExchangeRequest(java.lang.String authorizationCode, java.lang.String redirectUri, java.lang.String codeVerifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("code", authorizationCode);
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        bundle.putString("client_id", com.facebook.FacebookSdk.getApplicationId());
        bundle.putString(com.facebook.internal.ServerProtocol.DIALOG_PARAM_REDIRECT_URI, redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        com.facebook.GraphRequest newGraphPathRequest = com.facebook.GraphRequest.INSTANCE.newGraphPathRequest(null, "oauth/access_token", null);
        newGraphPathRequest.setHttpMethod(com.facebook.HttpMethod.GET);
        newGraphPathRequest.setParameters(bundle);
        return newGraphPathRequest;
    }
}

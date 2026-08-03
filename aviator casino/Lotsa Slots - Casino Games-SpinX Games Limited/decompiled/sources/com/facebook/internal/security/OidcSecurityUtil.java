package com.facebook.internal.security;

/* compiled from: OidcSecurityUtil.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/security/OidcSecurityUtil;", "", "()V", "OPENID_KEYS_PATH", "", "getOPENID_KEYS_PATH", "()Ljava/lang/String;", "SIGNATURE_ALGORITHM_SHA256", "TIMEOUT_IN_MILLISECONDS", "", "getPublicKeyFromString", "Ljava/security/PublicKey;", com.ironsource.X3.i.W, "getRawKeyFromEndPoint", "kid", "verify", "", "publicKey", "data", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class OidcSecurityUtil {
    public static final com.facebook.internal.security.OidcSecurityUtil INSTANCE = new com.facebook.internal.security.OidcSecurityUtil();
    private static final java.lang.String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";
    public static final java.lang.String SIGNATURE_ALGORITHM_SHA256 = "SHA256withRSA";
    public static final long TIMEOUT_IN_MILLISECONDS = 5000;

    private OidcSecurityUtil() {
    }

    public final java.lang.String getOPENID_KEYS_PATH() {
        return OPENID_KEYS_PATH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final java.lang.String getRawKeyFromEndPoint(final java.lang.String kid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kid, "kid");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        final java.net.URL url = new java.net.URL("https", kotlin.jvm.internal.Intrinsics.stringPlus("www.", com.facebook.FacebookSdk.getFacebookDomain()), OPENID_KEYS_PATH);
        final java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        final java.util.concurrent.locks.Condition newCondition = reentrantLock.newCondition();
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.internal.security.OidcSecurityUtil$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.internal.security.OidcSecurityUtil.m5223getRawKeyFromEndPoint$lambda1(url, objectRef, kid, reentrantLock, newCondition);
            }
        });
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
        reentrantLock2.lock();
        try {
            newCondition.await(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            reentrantLock2.unlock();
            return (java.lang.String) objectRef.element;
        } catch (java.lang.Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /* renamed from: getRawKeyFromEndPoint$lambda-1, reason: not valid java name */
    public static final void m5223getRawKeyFromEndPoint$lambda1(java.net.URL openIdKeyUrl, kotlin.jvm.internal.Ref.ObjectRef result, java.lang.String kid, java.util.concurrent.locks.ReentrantLock lock, java.util.concurrent.locks.Condition condition) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "$result");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kid, "$kid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lock, "$lock");
        java.net.URLConnection openConnection = openIdKeyUrl.openConnection();
        if (openConnection == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
        try {
            try {
                java.io.InputStream inputStream = httpURLConnection.getInputStream();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                java.io.Reader inputStreamReader = new java.io.InputStreamReader(inputStream, kotlin.text.Charsets.UTF_8);
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                result.element = new org.json.JSONObject(readText).optString(kid);
                httpURLConnection.disconnect();
                reentrantLock = lock;
                reentrantLock.lock();
            } catch (java.lang.Exception e) {
                java.lang.String name = INSTANCE.getClass().getName();
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                android.util.Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock = lock;
                reentrantLock.lock();
                try {
                    condition.signal();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                }
            }
            try {
                condition.signal();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } finally {
            }
        } catch (java.lang.Throwable th) {
            httpURLConnection.disconnect();
            lock.lock();
            try {
                condition.signal();
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                throw th;
            } finally {
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.security.PublicKey getPublicKeyFromString(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        byte[] decode = android.util.Base64.decode(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(key, "\n", "", false, 4, (java.lang.Object) null), "-----BEGIN PUBLIC KEY-----", "", false, 4, (java.lang.Object) null), "-----END PUBLIC KEY-----", "", false, 4, (java.lang.Object) null), 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(decode));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean verify(java.security.PublicKey publicKey, java.lang.String data, java.lang.String signature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            java.security.Signature signature2 = java.security.Signature.getInstance(SIGNATURE_ALGORITHM_SHA256);
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = android.util.Base64.decode(signature, 8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}

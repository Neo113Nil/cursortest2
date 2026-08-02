package com.facebook.internal.security;

import android.util.Base64;
import androidx.webkit.ProxyConfig;
import com.facebook.w;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nOidcSecurityUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OidcSecurityUtil.kt\ncom/facebook/internal/security/OidcSecurityUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    @JvmStatic
    public static final PublicKey a(String key) {
        String replace$default;
        String replace$default2;
        String replace$default3;
        Intrinsics.checkNotNullParameter(key, "key");
        replace$default = StringsKt__StringsJVMKt.replace$default(key, "\n", "", false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "-----BEGIN PUBLIC KEY-----", "", false, 4, (Object) null);
        replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "-----END PUBLIC KEY-----", "", false, 4, (Object) null);
        byte[] decode = Base64.decode(replace$default3, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
        Intrinsics.checkNotNullExpressionValue(generatePublic, "kf.generatePublic(x509publicKey)");
        return generatePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final String b(final String kid) {
        Intrinsics.checkNotNullParameter(kid, "kid");
        final URL url = new URL(ProxyConfig.MATCH_HTTPS, "www." + w.s, "/.well-known/oauth/openid/keys/");
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        w.c().execute(new Runnable() { // from class: com.facebook.internal.security.a
            /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.String] */
            @Override // java.lang.Runnable
            public final void run() {
                Condition condition = newCondition;
                URL openIdKeyUrl = url;
                Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
                Ref.ObjectRef result = objectRef;
                Intrinsics.checkNotNullParameter(result, "$result");
                String kid2 = kid;
                Intrinsics.checkNotNullParameter(kid2, "$kid");
                ReentrantLock lock = reentrantLock;
                Intrinsics.checkNotNullParameter(lock, "$lock");
                URLConnection openConnection = openIdKeyUrl.openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                        String readText = TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                        httpURLConnection.getInputStream().close();
                        result.element = new JSONObject(readText).optString(kid2);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                            Unit unit = Unit.INSTANCE;
                        } finally {
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                            Unit unit2 = Unit.INSTANCE;
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    lock.lock();
                    try {
                        condition.signal();
                        Unit unit3 = Unit.INSTANCE;
                        throw th;
                    } finally {
                    }
                }
            }
        });
        reentrantLock.lock();
        try {
            newCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) objectRef.element;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @JvmStatic
    public static final boolean c(PublicKey publicKey, String data, String signature) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(signature, "signature");
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] decode = Base64.decode(signature, 8);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(decode);
        } catch (Exception unused) {
            return false;
        }
    }
}

package Ve;

import java.security.KeyStore;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class R3 implements Be {

    /* renamed from: a, reason: collision with root package name */
    public final SSLContext f29817a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f29818b;

    /* renamed from: c, reason: collision with root package name */
    public final Q3 f29819c;

    public R3() {
        String defaultType = KeyStore.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType()");
        KeyStore keyStore = KeyStore.getInstance(defaultType);
        keyStore.load(null, null);
        Intrinsics.checkNotNullExpressionValue(keyStore, "keyStore");
        TrustManager[] trustManagerArr = {new C4461n3()};
        TrustManager trustManager = trustManagerArr[0];
        Intrinsics.g(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        this.f29818b = (X509TrustManager) trustManager;
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, trustManagerArr, null);
        Intrinsics.checkNotNullExpressionValue(sslContext, "sslContext");
        this.f29817a = sslContext;
        this.f29819c = new Q3();
    }

    @Override // Ve.Be
    public final X509TrustManager a() {
        return this.f29818b;
    }

    @Override // Ve.Be
    public final SSLContext b() {
        return this.f29817a;
    }

    @Override // Ve.Be
    public final HostnameVerifier c() {
        return this.f29819c;
    }
}

package Ve;

import We.E;
import java.security.KeyStore;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;

/* loaded from: classes6.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final C8588a f30308a;

    /* renamed from: b, reason: collision with root package name */
    public final Vl f30309b;

    public X(C8588a loggingInterceptor, Vl sPaySdkConfigRepository) {
        Intrinsics.checkNotNullParameter(loggingInterceptor, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        this.f30308a = loggingInterceptor;
        this.f30309b = sPaySdkConfigRepository;
    }

    public static final void a(X x11, E.a aVar) {
        x11.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f(10000L, timeUnit);
        aVar.X(10000L, timeUnit);
        aVar.b0(10000L, timeUnit);
        aVar.l(true);
        aVar.m();
        C4388kh c4388kh = new C4388kh(x11.f30309b);
        String defaultType = KeyStore.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType()");
        KeyStore keyStore = KeyStore.getInstance(defaultType);
        keyStore.load(null, null);
        Intrinsics.checkNotNullExpressionValue(keyStore, "keyStore");
        Intrinsics.checkNotNullParameter(keyStore, "<set-?>");
        TrustManager[] trustManagerArr = {new Hg()};
        c4388kh.f31442c = trustManagerArr;
        TrustManager trustManager = trustManagerArr[0];
        Intrinsics.g(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Intrinsics.checkNotNullParameter(x509TrustManager, "<set-?>");
        c4388kh.f31443d = x509TrustManager;
        SSLContext sslContext = SSLContext.getInstance("TLS");
        TrustManager[] trustManagerArr2 = c4388kh.f31442c;
        if (trustManagerArr2 == null) {
            Intrinsics.n("trustManages");
            throw null;
        }
        sslContext.init(null, trustManagerArr2, null);
        Intrinsics.checkNotNullExpressionValue(sslContext, "sslContext");
        Intrinsics.checkNotNullParameter(sslContext, "<set-?>");
        c4388kh.f31441b = sslContext;
        HostnameVerifier d11 = c4388kh.d();
        Intrinsics.checkNotNullParameter(d11, "<set-?>");
        c4388kh.f31444e = (C4359jh) d11;
        SSLSocketFactory socketFactory = c4388kh.b().getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "interactor.customSSLContext.socketFactory");
        aVar.a0(socketFactory, c4388kh.a());
        aVar.Y();
    }
}

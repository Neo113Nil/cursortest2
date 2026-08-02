package Ve;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bd.C5652b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class Tm extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final TrustManagerFactory f30068a;

    /* renamed from: b, reason: collision with root package name */
    public final Te f30069b;

    /* renamed from: c, reason: collision with root package name */
    public final C4248fl f30070c;

    public Tm(Context context) {
        int i11;
        List list = AbstractC4596rn.f31984a;
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Intrinsics.checkNotNullExpressionValue(certificateFactory, "getInstance(\"X.509\")");
        List list2 = AbstractC4596rn.f31984a;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            InputStream openRawResource = context.getResources().openRawResource(((Number) ((Pair) it.next()).e()).intValue());
            Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRawResource(certRes)");
            byte[] c11 = C5652b.c(openRawResource);
            Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
            Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
            arrayList.add(new ByteArrayInputStream(Base64.decode(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.X(kotlin.text.h.E0(new String(c11, ISO_8859_1)), "\\s+", "", false), "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), "-----BEGIN CERTIFICATE-----", "", false), "-----END CERTIFICATE-----", "", false), 2)));
        }
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            InputStream inputStream = (InputStream) next;
            try {
                Certificate generateCertificate = certificateFactory.generateCertificate(inputStream);
                Vd0.b.a(inputStream, null);
                keyStore.setCertificateEntry((String) ((Pair) list2.get(i11)).f(), generateCertificate);
                i11 = i12;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    Vd0.b.a(inputStream, th2);
                    throw th3;
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(keyStore, "getInstance(KeyStore.get…nd, cert)\n        }\n    }");
        TrustManagerFactory tmFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmFactory.init(keyStore);
        Intrinsics.checkNotNullExpressionValue(tmFactory, "tmFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tmFactory, "tmFactory");
        this.f30068a = tmFactory;
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            Yj yj2 = c4792yj.f32584a;
            this.f30069b = yj2.c();
            this.f30070c = (C4248fl) yj2.f30481i.get();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        C4248fl c4248fl = this.f30070c;
        if (c4248fl == null) {
            Intrinsics.n("featuresHandler");
            throw null;
        }
        boolean r02 = Lf.a.r0(c4248fl, EnumC4290h5.PHONE_NUMBER_AUTH_SSL, null);
        if (!r02) {
            if (r02) {
                throw new Sc.o();
            }
            handler.proceed();
            return;
        }
        Te te2 = this.f30069b;
        if (error.getPrimaryError() == 3) {
            SslCertificate certificate = error.getCertificate();
            try {
                Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                Intrinsics.checkNotNullExpressionValue(declaredField, "cert.javaClass.getDeclar…Field(\"mX509Certificate\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(certificate);
                Intrinsics.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate[] x509CertificateArr = {(X509Certificate) obj};
                TrustManager[] trustManagers = this.f30068a.getTrustManagers();
                Intrinsics.checkNotNullExpressionValue(trustManagers, "tmFactory.trustManagers");
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            Bi bi = new Bi(S.WV_CHECK_SERVER_TRUSTED, Ur.WEB_VIEW, Pe.SC, kotlin.collections.U.i(new Pair("Path", String.valueOf(view.getUrl()))), null, null, null, 112);
                            if (te2 != null) {
                                te2.b(bi);
                            }
                            x509TrustManager.checkServerTrusted(x509CertificateArr, "generic");
                            handler.proceed();
                            return;
                        } catch (Exception e11) {
                            Bi bi2 = new Bi(S.WV_SSL_EXCEPTION, Ur.WEB_VIEW, Pe.SC, kotlin.collections.U.j(new Pair("Path", String.valueOf(view.getUrl())), new Pair("Exception", e11.toString())), null, null, null, 112);
                            if (te2 != null) {
                                te2.b(bi2);
                            }
                        }
                    }
                }
            } catch (Exception e12) {
                Lm0.a.f17149a.d("WEB_VIEW: verify cert fail " + e12, new Object[0]);
            }
        }
        handler.cancel();
    }
}

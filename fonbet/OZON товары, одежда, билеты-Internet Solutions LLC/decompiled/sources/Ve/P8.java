package Ve;

import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
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
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class P8 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final TrustManagerFactory f29682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f29683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Wj f29684c;

    public P8(RedirectActivity context, Wj wj2) {
        int i11;
        this.f29683b = context;
        this.f29684c = wj2;
        List list = Rb.f29842a;
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        Intrinsics.checkNotNullExpressionValue(certificateFactory, "getInstance(\"X.509\")");
        List list2 = Rb.f29842a;
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
            } finally {
            }
        }
        Intrinsics.checkNotNullExpressionValue(keyStore, "getInstance(KeyStore.get…nd, cert)\n        }\n    }");
        TrustManagerFactory tmFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmFactory.init(keyStore);
        Intrinsics.checkNotNullExpressionValue(tmFactory, "tmFactory");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tmFactory, "tmFactory");
        this.f29682a = tmFactory;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler handler, SslError error) {
        String str;
        String str2 = "Path";
        WebView view = webView;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        if (error.getPrimaryError() == 3) {
            SslCertificate certificate = error.getCertificate();
            try {
                Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                Intrinsics.checkNotNullExpressionValue(declaredField, "cert.javaClass.getDeclar…Field(\"mX509Certificate\")");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(certificate);
                Intrinsics.g(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate[] x509CertificateArr = {(X509Certificate) obj};
                try {
                    TrustManager[] trustManagers = this.f29682a.getTrustManagers();
                    Intrinsics.checkNotNullExpressionValue(trustManagers, "tmFactory.trustManagers");
                    int length = trustManagers.length;
                    int i11 = 0;
                    while (i11 < length) {
                        TrustManager trustManager = trustManagers[i11];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            try {
                                S action = S.WV_CHECK_SERVER_TRUSTED;
                                Ur view2 = Ur.WEB_VIEW;
                                Pe actionType = Pe.SC;
                                kotlin.collections.U.i(new Pair(str2, String.valueOf(view.getUrl())));
                                Intrinsics.checkNotNullParameter(action, "action");
                                Intrinsics.checkNotNullParameter(view2, "view");
                                Intrinsics.checkNotNullParameter(actionType, "actionType");
                                x509TrustManager.checkServerTrusted(x509CertificateArr, "generic");
                                handler.proceed();
                                return;
                            } catch (Exception e11) {
                                S action2 = S.WV_SSL_EXCEPTION;
                                Ur view3 = Ur.WEB_VIEW;
                                Pe actionType2 = Pe.SC;
                                str = str2;
                                kotlin.collections.U.j(new Pair(str2, String.valueOf(webView.getUrl())), new Pair("Exception", e11.toString()));
                                Intrinsics.checkNotNullParameter(action2, "action");
                                Intrinsics.checkNotNullParameter(view3, "view");
                                Intrinsics.checkNotNullParameter(actionType2, "actionType");
                            }
                        } else {
                            str = str2;
                        }
                        i11++;
                        view = webView;
                        str2 = str;
                    }
                } catch (Exception e12) {
                    e = e12;
                    Lm0.a.f17149a.d("WEB_VIEW: verify cert fail " + e, new Object[0]);
                    handler.cancel();
                }
            } catch (Exception e13) {
                e = e13;
            }
        }
        handler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            RedirectActivity redirectActivity = this.f29683b;
            Wj wj2 = this.f29684c;
            Intrinsics.checkNotNullParameter(new I7(url, wj2, redirectActivity), "block");
            C4466n8 block = new C4466n8(url, wj2, redirectActivity);
            Intrinsics.checkNotNullParameter(block, "block");
            block.invoke();
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}

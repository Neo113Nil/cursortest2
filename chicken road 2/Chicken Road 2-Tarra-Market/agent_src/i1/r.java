package i1;

import a.AbstractC0009a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class r implements Cloneable {

    /* renamed from: v, reason: collision with root package name */
    public static final List f1386v = j1.d.k(s.HTTP_2, s.HTTP_1_1);

    /* renamed from: w, reason: collision with root package name */
    public static final List f1387w = j1.d.k(i.f1342e, i.f1343f);

    /* renamed from: a, reason: collision with root package name */
    public final C0.t f1388a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1389b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1390c;

    /* renamed from: d, reason: collision with root package name */
    public final C0071b f1391d;

    /* renamed from: e, reason: collision with root package name */
    public final ProxySelector f1392e;

    /* renamed from: f, reason: collision with root package name */
    public final C0071b f1393f;

    /* renamed from: g, reason: collision with root package name */
    public final SocketFactory f1394g;

    /* renamed from: h, reason: collision with root package name */
    public final SSLSocketFactory f1395h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0009a f1396i;

    /* renamed from: j, reason: collision with root package name */
    public final r1.c f1397j;

    /* renamed from: k, reason: collision with root package name */
    public final d f1398k;

    /* renamed from: l, reason: collision with root package name */
    public final C0071b f1399l;

    /* renamed from: m, reason: collision with root package name */
    public final C0071b f1400m;

    /* renamed from: n, reason: collision with root package name */
    public final g f1401n;

    /* renamed from: o, reason: collision with root package name */
    public final C0071b f1402o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1403p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1404q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1405r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1406s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1407t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1408u;

    static {
        C0071b.f1293e = new C0071b();
    }

    public r() {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0.t tVar = new C0.t(5);
        C0071b c0071b = new C0071b();
        ProxySelector proxySelector = ProxySelector.getDefault();
        proxySelector = proxySelector == null ? new q1.a() : proxySelector;
        C0071b c0071b2 = C0071b.f1290b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        r1.c cVar = r1.c.f6488a;
        d dVar = d.f1307c;
        C0071b c0071b3 = C0071b.f1289a;
        g gVar = new g();
        C0071b c0071b4 = C0071b.f1291c;
        this.f1388a = tVar;
        this.f1389b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f1390c = Collections.unmodifiableList(new ArrayList(arrayList2));
        this.f1391d = c0071b;
        this.f1392e = proxySelector;
        this.f1393f = c0071b2;
        this.f1394g = socketFactory;
        Iterator it = f1387w.iterator();
        loop0: while (true) {
            z2 = false;
            while (it.hasNext()) {
                z2 = (z2 || ((i) it.next()).f1344a) ? true : z2;
            }
        }
        if (z2) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            p1.g gVar2 = p1.g.f6437a;
                            SSLContext h2 = gVar2.h();
                            h2.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f1395h = h2.getSocketFactory();
                            this.f1396i = gVar2.c(x509TrustManager);
                        } catch (GeneralSecurityException e2) {
                            throw j1.d.a("No System TLS", e2);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e3) {
                throw j1.d.a("No System TLS", e3);
            }
        }
        this.f1395h = null;
        this.f1396i = null;
        SSLSocketFactory sSLSocketFactory = this.f1395h;
        if (sSLSocketFactory != null) {
            p1.g.f6437a.e(sSLSocketFactory);
        }
        this.f1397j = cVar;
        AbstractC0009a abstractC0009a = this.f1396i;
        this.f1398k = j1.d.i(dVar.f1309b, abstractC0009a) ? dVar : new d(dVar.f1308a, abstractC0009a);
        this.f1399l = c0071b3;
        this.f1400m = c0071b3;
        this.f1401n = gVar;
        this.f1402o = c0071b4;
        this.f1403p = true;
        this.f1404q = true;
        this.f1405r = true;
        this.f1406s = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f1407t = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        this.f1408u = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        if (this.f1389b.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f1389b);
        }
        if (this.f1390c.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f1390c);
        }
    }
}

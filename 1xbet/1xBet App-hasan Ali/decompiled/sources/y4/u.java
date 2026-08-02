package y4;

import A0.o1;
import com.google.android.gms.internal.ads.C1071hd;
import e2.C1930k;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import n.C2138i;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class u implements Cloneable, InterfaceC2676d {
    public static final List J = z4.b.k(v.f21430o, v.f21428m);
    public static final List K = z4.b.k(i.f21337e, i.f);

    /* renamed from: A, reason: collision with root package name */
    public final List f21402A;

    /* renamed from: B, reason: collision with root package name */
    public final List f21403B;

    /* renamed from: C, reason: collision with root package name */
    public final K4.c f21404C;

    /* renamed from: D, reason: collision with root package name */
    public final f f21405D;

    /* renamed from: E, reason: collision with root package name */
    public final AbstractC2425d f21406E;

    /* renamed from: F, reason: collision with root package name */
    public final int f21407F;

    /* renamed from: G, reason: collision with root package name */
    public final int f21408G;

    /* renamed from: H, reason: collision with root package name */
    public final int f21409H;

    /* renamed from: I, reason: collision with root package name */
    public final C1930k f21410I;

    /* renamed from: k, reason: collision with root package name */
    public final C1071hd f21411k;

    /* renamed from: l, reason: collision with root package name */
    public final C2138i f21412l;

    /* renamed from: m, reason: collision with root package name */
    public final List f21413m;

    /* renamed from: n, reason: collision with root package name */
    public final List f21414n;

    /* renamed from: o, reason: collision with root package name */
    public final o1 f21415o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21416p;

    /* renamed from: q, reason: collision with root package name */
    public final C2674b f21417q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21418r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f21419s;

    /* renamed from: t, reason: collision with root package name */
    public final C2674b f21420t;

    /* renamed from: u, reason: collision with root package name */
    public final C2674b f21421u;

    /* renamed from: v, reason: collision with root package name */
    public final ProxySelector f21422v;

    /* renamed from: w, reason: collision with root package name */
    public final C2674b f21423w;

    /* renamed from: x, reason: collision with root package name */
    public final SocketFactory f21424x;

    /* renamed from: y, reason: collision with root package name */
    public final SSLSocketFactory f21425y;

    /* renamed from: z, reason: collision with root package name */
    public final X509TrustManager f21426z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(t tVar) {
        List list;
        this.f21411k = tVar.f21384a;
        this.f21412l = tVar.f21385b;
        this.f21413m = z4.b.v(tVar.f21386c);
        this.f21414n = z4.b.v(tVar.f21387d);
        this.f21415o = tVar.f21388e;
        this.f21416p = tVar.f;
        this.f21417q = tVar.f21389g;
        this.f21418r = tVar.f21390h;
        this.f21419s = tVar.i;
        this.f21420t = tVar.f21391j;
        this.f21421u = tVar.f21392k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f21422v = proxySelector == null ? I4.a.f2688a : proxySelector;
        this.f21423w = tVar.f21393l;
        this.f21424x = tVar.f21394m;
        List list2 = tVar.f21395n;
        this.f21402A = list2;
        this.f21403B = tVar.f21396o;
        this.f21404C = tVar.f21397p;
        this.f21407F = tVar.f21399r;
        this.f21408G = tVar.f21400s;
        this.f21409H = tVar.f21401t;
        this.f21410I = new C1930k(5);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f21338a) {
                    G4.n nVar = G4.n.f2016a;
                    X509TrustManager m5 = G4.n.f2016a.m();
                    this.f21426z = m5;
                    this.f21425y = G4.n.f2016a.l(m5);
                    AbstractC2425d b3 = G4.n.f2016a.b(m5);
                    this.f21406E = b3;
                    f fVar = tVar.f21398q;
                    this.f21405D = kotlin.jvm.internal.l.a(fVar.f21318b, b3) ? fVar : new f(fVar.f21317a, b3);
                    list = this.f21413m;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list);
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.f21414n;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list3);
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List list4 = this.f21402A;
                    boolean z3 = list4 != null;
                    X509TrustManager x509TrustManager = this.f21426z;
                    AbstractC2425d abstractC2425d = this.f21406E;
                    SSLSocketFactory sSLSocketFactory = this.f21425y;
                    if (!z3 || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((i) it2.next()).f21338a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (abstractC2425d == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (abstractC2425d != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!kotlin.jvm.internal.l.a(this.f21405D, f.f21316c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f21425y = null;
        this.f21406E = null;
        this.f21426z = null;
        this.f21405D = f.f21316c;
        list = this.f21413m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>", list);
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}

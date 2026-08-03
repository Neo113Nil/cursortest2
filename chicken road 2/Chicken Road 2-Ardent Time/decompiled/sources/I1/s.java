package I1;

/* loaded from: classes.dex */
public final class s implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final F.C0014n f796a;

    /* renamed from: b, reason: collision with root package name */
    public final C.j f797b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f798c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f799d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.b f800e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f801f;

    /* renamed from: g, reason: collision with root package name */
    public final I1.C0027b f802g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f803h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f804i;

    /* renamed from: j, reason: collision with root package name */
    public final I1.C0027b f805j;

    /* renamed from: k, reason: collision with root package name */
    public final I1.C0027b f806k;

    /* renamed from: l, reason: collision with root package name */
    public final java.net.ProxySelector f807l;

    /* renamed from: m, reason: collision with root package name */
    public final I1.C0027b f808m;

    /* renamed from: n, reason: collision with root package name */
    public final javax.net.SocketFactory f809n;

    /* renamed from: o, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f810o;

    /* renamed from: p, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f811p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f812q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f813r;

    /* renamed from: s, reason: collision with root package name */
    public final U1.c f814s;
    public final I1.e t;

    /* renamed from: u, reason: collision with root package name */
    public final Q1.l f815u;

    /* renamed from: v, reason: collision with root package name */
    public final int f816v;

    /* renamed from: w, reason: collision with root package name */
    public final int f817w;

    /* renamed from: x, reason: collision with root package name */
    public final int f818x;

    /* renamed from: y, reason: collision with root package name */
    public final C.j f819y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.List f795z = J1.b.l(I1.t.HTTP_2, I1.t.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final java.util.List f794A = J1.b.l(I1.i.f727e, I1.i.f728f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(I1.r rVar) {
        java.util.List list;
        this.f796a = rVar.f772a;
        this.f797b = rVar.f773b;
        this.f798c = J1.b.w(rVar.f774c);
        this.f799d = J1.b.w(rVar.f775d);
        this.f800e = rVar.f776e;
        this.f801f = rVar.f777f;
        this.f802g = rVar.f778g;
        this.f803h = rVar.f779h;
        this.f804i = rVar.f780i;
        this.f805j = rVar.f781j;
        this.f806k = rVar.f782k;
        java.net.ProxySelector proxySelector = java.net.ProxySelector.getDefault();
        this.f807l = proxySelector == null ? S1.a.f1706a : proxySelector;
        this.f808m = rVar.f783l;
        this.f809n = rVar.f784m;
        java.util.List list2 = rVar.f787p;
        this.f812q = list2;
        this.f813r = rVar.f788q;
        this.f814s = rVar.f789r;
        this.f816v = rVar.f791u;
        this.f817w = rVar.f792v;
        this.f818x = rVar.f793w;
        this.f819y = new C.j(13);
        if (list2 == null || !list2.isEmpty()) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((I1.i) it.next()).f729a) {
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory = rVar.f785n;
                    if (sSLSocketFactory != null) {
                        this.f810o = sSLSocketFactory;
                        Q1.l lVar = rVar.t;
                        kotlin.jvm.internal.i.b(lVar);
                        this.f815u = lVar;
                        javax.net.ssl.X509TrustManager x509TrustManager = rVar.f786o;
                        kotlin.jvm.internal.i.b(x509TrustManager);
                        this.f811p = x509TrustManager;
                        I1.e eVar = rVar.f790s;
                        eVar.getClass();
                        this.t = kotlin.jvm.internal.i.a(eVar.f703b, lVar) ? eVar : new I1.e(eVar.f702a, lVar);
                    } else {
                        Q1.n nVar = Q1.n.f1644a;
                        javax.net.ssl.X509TrustManager m2 = Q1.n.f1644a.m();
                        this.f811p = m2;
                        this.f810o = Q1.n.f1644a.l(m2);
                        Q1.l b2 = Q1.n.f1644a.b(m2);
                        this.f815u = b2;
                        I1.e eVar2 = rVar.f790s;
                        eVar2.getClass();
                        this.t = kotlin.jvm.internal.i.a(eVar2.f703b, b2) ? eVar2 : new I1.e(eVar2.f702a, b2);
                    }
                    list = this.f798c;
                    if (!list.contains(null)) {
                        throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(list, "Null interceptor: ").toString());
                    }
                    java.util.List list3 = this.f799d;
                    if (list3.contains(null)) {
                        throw new java.lang.IllegalStateException(kotlin.jvm.internal.i.h(list3, "Null network interceptor: ").toString());
                    }
                    javax.net.ssl.X509TrustManager x509TrustManager2 = this.f811p;
                    Q1.l lVar2 = this.f815u;
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = this.f810o;
                    java.util.List list4 = this.f812q;
                    if (list4 == null || !list4.isEmpty()) {
                        java.util.Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((I1.i) it2.next()).f729a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new java.lang.IllegalStateException("sslSocketFactory == null");
                                }
                                if (lVar2 == null) {
                                    throw new java.lang.IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager2 == null) {
                                    throw new java.lang.IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (lVar2 != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager2 != null) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    if (!kotlin.jvm.internal.i.a(this.t, I1.e.f701c)) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f810o = null;
        this.f815u = null;
        this.f811p = null;
        this.t = I1.e.f701c;
        list = this.f798c;
        if (!list.contains(null)) {
        }
    }

    public final java.lang.Object clone() {
        return super.clone();
    }
}

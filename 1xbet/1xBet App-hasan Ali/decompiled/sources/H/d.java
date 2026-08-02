package H;

import E.W;
import K0.C0197b;
import K0.F;
import K0.O;
import K0.v;
import W0.m;
import a.AbstractC0444a;
import kotlin.jvm.internal.l;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f2029a;

    /* renamed from: b, reason: collision with root package name */
    public O f2030b;

    /* renamed from: c, reason: collision with root package name */
    public O0.d f2031c;

    /* renamed from: d, reason: collision with root package name */
    public int f2032d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2033e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f2034g;
    public W0.c i;

    /* renamed from: j, reason: collision with root package name */
    public C0197b f2036j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2037k;

    /* renamed from: m, reason: collision with root package name */
    public b f2039m;

    /* renamed from: n, reason: collision with root package name */
    public v f2040n;

    /* renamed from: o, reason: collision with root package name */
    public m f2041o;

    /* renamed from: h, reason: collision with root package name */
    public long f2035h = a.f2018a;

    /* renamed from: l, reason: collision with root package name */
    public long f2038l = AbstractC0444a.b(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f2042p = W0.b.h(0, 0, 0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f2043q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f2044r = -1;

    public d(String str, O o5, O0.d dVar, int i, boolean z3, int i5, int i6) {
        this.f2029a = str;
        this.f2030b = o5;
        this.f2031c = dVar;
        this.f2032d = i;
        this.f2033e = z3;
        this.f = i5;
        this.f2034g = i6;
    }

    public final int a(int i, m mVar) {
        int i5 = this.f2043q;
        int i6 = this.f2044r;
        if (i == i5 && i5 != -1) {
            return i6;
        }
        int k5 = W.k(b(W0.b.a(0, i, 0, Integer.MAX_VALUE), mVar).b());
        this.f2043q = i;
        this.f2044r = k5;
        return k5;
    }

    public final C0197b b(long j5, m mVar) {
        v e3 = e(mVar);
        boolean z3 = this.f2033e;
        int i = this.f2032d;
        float e5 = e3.e();
        int h3 = ((z3 || i == 2) && W0.a.d(j5)) ? W0.a.h(j5) : Integer.MAX_VALUE;
        if (W0.a.j(j5) != h3) {
            h3 = AbstractC0444a.t(W.k(e5), W0.a.j(j5), h3);
        }
        long u5 = AbstractC2349a.u(0, h3, 0, W0.a.g(j5));
        boolean z5 = this.f2033e;
        int i5 = this.f2032d;
        int i6 = this.f;
        return new C0197b((S0.d) e3, ((z5 || i5 != 2) && i6 >= 1) ? i6 : 1, i5 == 2 ? 2 : 1, u5);
    }

    public final void c() {
        this.f2036j = null;
        this.f2040n = null;
        this.f2041o = null;
        this.f2043q = -1;
        this.f2044r = -1;
        this.f2042p = W0.b.h(0, 0, 0, 0);
        this.f2038l = AbstractC0444a.b(0, 0);
        this.f2037k = false;
    }

    public final void d(W0.c cVar) {
        long j5;
        W0.c cVar2 = this.i;
        if (cVar != null) {
            int i = a.f2019b;
            j5 = a.a(cVar.c(), cVar.n());
        } else {
            j5 = a.f2018a;
        }
        if (cVar2 == null) {
            this.i = cVar;
            this.f2035h = j5;
        } else if (cVar == null || this.f2035h != j5) {
            this.i = cVar;
            this.f2035h = j5;
            c();
        }
    }

    public final v e(m mVar) {
        v vVar = this.f2040n;
        if (vVar == null || mVar != this.f2041o || vVar.c()) {
            this.f2041o = mVar;
            String str = this.f2029a;
            O h3 = F.h(this.f2030b, mVar);
            W0.c cVar = this.i;
            l.c(cVar);
            O0.d dVar = this.f2031c;
            X3.v vVar2 = X3.v.f6090k;
            vVar = new S0.d(str, h3, vVar2, vVar2, dVar, cVar);
        }
        this.f2040n = vVar;
        return vVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f2036j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j5 = this.f2035h;
        int i = a.f2019b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j5 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j5 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}

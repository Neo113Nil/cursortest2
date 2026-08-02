package u2;

import P.AbstractC0329z;
import P.C0297i0;
import P.C0305m0;
import P.G0;
import S3.C0416t;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import h0.C1991e;
import i0.C2001f;
import i0.C2006k;
import n0.AbstractC2157b;
import n0.C2156a;
import p4.AbstractC2282w;
import p4.D;
import p4.i0;
import s4.M;
import t2.C2421i;
import x0.C2623i;
import x0.InterfaceC2624j;
import z0.C2733I;

/* renamed from: u2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2497l extends AbstractC2157b implements G0 {

    /* renamed from: C, reason: collision with root package name */
    public static final C0416t f20006C = new C0416t(14);

    /* renamed from: A, reason: collision with root package name */
    public final C0305m0 f20007A;

    /* renamed from: B, reason: collision with root package name */
    public final C0305m0 f20008B;

    /* renamed from: o, reason: collision with root package name */
    public u4.c f20009o;

    /* renamed from: p, reason: collision with root package name */
    public final M f20010p = s4.C.b(new C1991e(0));

    /* renamed from: q, reason: collision with root package name */
    public final C0305m0 f20011q = AbstractC0329z.t(null);

    /* renamed from: r, reason: collision with root package name */
    public final C0297i0 f20012r = new C0297i0(1.0f);

    /* renamed from: s, reason: collision with root package name */
    public final C0305m0 f20013s = AbstractC0329z.t(null);

    /* renamed from: t, reason: collision with root package name */
    public AbstractC2490e f20014t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC2157b f20015u;

    /* renamed from: v, reason: collision with root package name */
    public i4.c f20016v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC2624j f20017w;

    /* renamed from: x, reason: collision with root package name */
    public int f20018x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20019y;

    /* renamed from: z, reason: collision with root package name */
    public final C0305m0 f20020z;

    public C2497l(E2.i iVar, C2421i c2421i) {
        C2486a c2486a = C2486a.f19987a;
        this.f20014t = c2486a;
        this.f20016v = f20006C;
        this.f20017w = C2623i.f21001b;
        this.f20018x = 1;
        this.f20020z = AbstractC0329z.t(c2486a);
        this.f20007A = AbstractC0329z.t(iVar);
        this.f20008B = AbstractC0329z.t(c2421i);
    }

    @Override // P.G0
    public final void a() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f20009o == null) {
                i0 b3 = AbstractC2282w.b();
                w4.e eVar = D.f18743a;
                u4.c a5 = AbstractC2282w.a(G4.l.H(b3, u4.m.f20109a.f18897p));
                this.f20009o = a5;
                Object obj = this.f20015u;
                G0 g02 = obj instanceof G0 ? (G0) obj : null;
                if (g02 != null) {
                    g02.a();
                }
                if (this.f20019y) {
                    E2.h a6 = E2.i.a((E2.i) this.f20007A.getValue());
                    a6.f1423b = ((C2421i) this.f20008B.getValue()).f19565b;
                    a6.f1436q = null;
                    a6.a().f1460z.getClass();
                    E2.c cVar = H2.d.f2283a;
                    k(new C2488c(null));
                } else {
                    AbstractC2282w.p(a5, null, new C2493h(this, null), 3);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // n0.AbstractC2157b
    public final void b(float f) {
        this.f20012r.i(f);
    }

    @Override // P.G0
    public final void c() {
        u4.c cVar = this.f20009o;
        if (cVar != null) {
            AbstractC2282w.d(cVar, null);
        }
        this.f20009o = null;
        Object obj = this.f20015u;
        G0 g02 = obj instanceof G0 ? (G0) obj : null;
        if (g02 != null) {
            g02.c();
        }
    }

    @Override // n0.AbstractC2157b
    public final void d(C2006k c2006k) {
        this.f20013s.setValue(c2006k);
    }

    @Override // P.G0
    public final void e() {
        u4.c cVar = this.f20009o;
        if (cVar != null) {
            AbstractC2282w.d(cVar, null);
        }
        this.f20009o = null;
        Object obj = this.f20015u;
        G0 g02 = obj instanceof G0 ? (G0) obj : null;
        if (g02 != null) {
            g02.e();
        }
    }

    @Override // n0.AbstractC2157b
    public final long h() {
        AbstractC2157b abstractC2157b = (AbstractC2157b) this.f20011q.getValue();
        if (abstractC2157b != null) {
            return abstractC2157b.h();
        }
        return 9205357640488583168L;
    }

    @Override // n0.AbstractC2157b
    public final void i(C2733I c2733i) {
        C1991e c1991e = new C1991e(c2733i.d());
        M m5 = this.f20010p;
        m5.getClass();
        m5.j(null, c1991e);
        AbstractC2157b abstractC2157b = (AbstractC2157b) this.f20011q.getValue();
        if (abstractC2157b != null) {
            abstractC2157b.g(c2733i, c2733i.d(), this.f20012r.h(), (C2006k) this.f20013s.getValue());
        }
    }

    public final AbstractC2157b j(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new I2.b(drawable.mutate());
        }
        C2001f c2001f = new C2001f(((BitmapDrawable) drawable).getBitmap());
        int i = this.f20018x;
        C2156a c2156a = new C2156a(c2001f, (r9.getWidth() << 32) | (r9.getHeight() & 4294967295L));
        c2156a.f18348q = i;
        return c2156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(AbstractC2490e abstractC2490e) {
        E2.j jVar;
        AbstractC2157b abstractC2157b;
        AbstractC2490e abstractC2490e2 = this.f20014t;
        AbstractC2490e abstractC2490e3 = (AbstractC2490e) this.f20016v.c(abstractC2490e);
        this.f20014t = abstractC2490e3;
        this.f20020z.setValue(abstractC2490e3);
        if (!(abstractC2490e3 instanceof C2489d)) {
            if (abstractC2490e3 instanceof C2487b) {
                jVar = ((C2487b) abstractC2490e3).f19989b;
            }
            abstractC2157b = null;
            if (abstractC2157b == null) {
                abstractC2157b = abstractC2490e3.a();
            }
            this.f20015u = abstractC2157b;
            this.f20011q.setValue(abstractC2157b);
            if (this.f20009o == null || abstractC2490e2.a() == abstractC2490e3.a()) {
                return;
            }
            Object a5 = abstractC2490e2.a();
            G0 g02 = a5 instanceof G0 ? (G0) a5 : null;
            if (g02 != null) {
                g02.e();
            }
            Object a6 = abstractC2490e3.a();
            G0 g03 = a6 instanceof G0 ? (G0) a6 : null;
            if (g03 != null) {
                g03.a();
                return;
            }
            return;
        }
        jVar = ((C2489d) abstractC2490e3).f19992b;
        G2.f a7 = jVar.b().f1442g.a(n.f20021a, jVar);
        if (a7 instanceof G2.b) {
            abstractC2157b = new t(abstractC2490e2 instanceof C2488c ? abstractC2490e2.a() : null, abstractC2490e3.a(), this.f20017w, ((G2.b) a7).f1980c, ((jVar instanceof E2.o) && ((E2.o) jVar).f1482g) ? false : true);
            if (abstractC2157b == null) {
            }
            this.f20015u = abstractC2157b;
            this.f20011q.setValue(abstractC2157b);
            if (this.f20009o == null) {
                return;
            } else {
                return;
            }
        }
        abstractC2157b = null;
        if (abstractC2157b == null) {
        }
        this.f20015u = abstractC2157b;
        this.f20011q.setValue(abstractC2157b);
        if (this.f20009o == null) {
        }
    }
}

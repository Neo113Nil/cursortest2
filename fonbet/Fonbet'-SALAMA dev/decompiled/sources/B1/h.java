package B1;

import A1.A0;
import A1.AbstractC0021h;
import A1.B;
import A1.C0022h0;
import A1.C0026j0;
import A1.C0039q;
import A1.C0042s;
import A1.C0046u;
import A1.H;
import A1.N;
import A1.P0;
import A1.Q0;
import A1.R0;
import A1.T0;
import A1.w0;
import A1.y0;
import A1.z0;
import C1.C0101g;
import E3.AbstractC0167z;
import E3.Q;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import c2.C;
import c2.C0814u;
import c2.C0819z;
import c2.D;
import c2.J;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.internal.ads.zzbbd;
import j2.C1306c;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import r5.C1578c;
import v2.AbstractC1664a;
import v2.r;
import v2.t;

/* loaded from: classes.dex */
public final class h implements z0, J, E1.e {

    /* renamed from: a, reason: collision with root package name */
    public final v2.p f986a;

    /* renamed from: b, reason: collision with root package name */
    public final P0 f987b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0 f988c;

    /* renamed from: d, reason: collision with root package name */
    public final Q3.o f989d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f990e;

    /* renamed from: f, reason: collision with root package name */
    public C1578c f991f;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0021h f992x;

    /* renamed from: y, reason: collision with root package name */
    public r f993y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f994z;

    public h(v2.p pVar) {
        pVar.getClass();
        this.f986a = pVar;
        int i7 = t.f17153a;
        Looper myLooper = Looper.myLooper();
        this.f991f = new C1578c(myLooper == null ? Looper.getMainLooper() : myLooper, pVar, new d(8));
        P0 p02 = new P0();
        this.f987b = p02;
        this.f988c = new Q0();
        this.f989d = new Q3.o(p02);
        this.f990e = new SparseArray();
    }

    @Override // c2.J
    public final void A(int i7, D d7, C0814u c0814u, C0819z c0819z) {
        N(L(i7, d7), 1001, new C0046u(25));
    }

    @Override // A1.z0
    public final void B(boolean z4) {
        N(M(), 23, new f(2));
    }

    @Override // A1.z0
    public final void C(List list) {
        a a2 = a();
        N(a2, 27, new H(a2, list));
    }

    @Override // A1.z0
    public final void D(int i7, boolean z4) {
        N(a(), -1, new C0046u(26));
    }

    @Override // A1.z0
    public final void E(w0 w0Var) {
        N(a(), 12, new C0046u(24));
    }

    @Override // A1.z0
    public final void F(T0 t02) {
        N(a(), 2, new d(13));
    }

    @Override // A1.z0
    public final void G(int i7, int i8) {
        N(M(), 24, new d(0));
    }

    @Override // c2.J
    public final void H(int i7, D d7, C0819z c0819z) {
        a L7 = L(i7, d7);
        N(L7, 1004, new c(1, L7, c0819z));
    }

    @Override // A1.z0
    public final void I(boolean z4) {
        N(a(), 7, new f(3));
    }

    public final a J(R0 r02, int i7, D d7) {
        D d8 = r02.p() ? null : d7;
        this.f986a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = r02.equals(((N) this.f992x).A()) && i7 == ((N) this.f992x).x();
        long j = 0;
        if (d8 == null || !d8.a()) {
            if (z4) {
                j = ((N) this.f992x).u();
            } else if (!r02.p()) {
                j = t.N(r02.m(i7, this.f988c, 0L).f206D);
            }
        } else if (z4 && ((N) this.f992x).v() == d8.f10162b && ((N) this.f992x).w() == d8.f10163c) {
            j = ((N) this.f992x).y();
        }
        D d9 = (D) this.f989d.f5825d;
        R0 A7 = ((N) this.f992x).A();
        int x4 = ((N) this.f992x).x();
        long y4 = ((N) this.f992x).y();
        N n2 = (N) this.f992x;
        n2.W();
        return new a(elapsedRealtime, r02, i7, d8, j, A7, x4, d9, y4, t.N(n2.f154b0.f601r));
    }

    public final a K(D d7) {
        this.f992x.getClass();
        R0 r02 = d7 == null ? null : (R0) ((Q) this.f989d.f5824c).get(d7);
        if (d7 != null && r02 != null) {
            return J(r02, r02.g(d7.f10161a, this.f987b).f188c, d7);
        }
        int x4 = ((N) this.f992x).x();
        R0 A7 = ((N) this.f992x).A();
        if (x4 >= A7.o()) {
            A7 = R0.f220a;
        }
        return J(A7, x4, null);
    }

    public final a L(int i7, D d7) {
        this.f992x.getClass();
        R0 r02 = R0.f220a;
        if (d7 != null) {
            return ((R0) ((Q) this.f989d.f5824c).get(d7)) != null ? K(d7) : J(r02, i7, d7);
        }
        R0 A7 = ((N) this.f992x).A();
        if (i7 < A7.o()) {
            r02 = A7;
        }
        return J(r02, i7, null);
    }

    public final a M() {
        return K((D) this.f989d.f5827f);
    }

    public final void N(a aVar, int i7, v2.e eVar) {
        this.f990e.put(i7, aVar);
        this.f991f.k(i7, eVar);
    }

    public final void O(AbstractC0021h abstractC0021h, Looper looper) {
        AbstractC1664a.h(this.f992x == null || ((AbstractC0167z) this.f989d.f5823b).isEmpty());
        abstractC0021h.getClass();
        this.f992x = abstractC0021h;
        this.f993y = this.f986a.a(looper, null);
        C1578c c1578c = this.f991f;
        this.f991f = new C1578c((CopyOnWriteArraySet) c1578c.f16056e, looper, (v2.p) c1578c.f16053b, new c(0, this, abstractC0021h));
    }

    public final a a() {
        return K((D) this.f989d.f5825d);
    }

    @Override // A1.z0
    public final void b(int i7) {
        N(a(), 8, new d(11));
    }

    @Override // A1.z0
    public final void c(int i7) {
        N(a(), 6, new d(17));
    }

    @Override // A1.z0
    public final void d(C0026j0 c0026j0) {
        N(a(), 14, new C0046u(23));
    }

    @Override // A1.z0
    public final void e(C0101g c0101g) {
        N(M(), 20, new f(4));
    }

    @Override // A1.z0
    public final void f(boolean z4) {
        N(a(), 3, new d(25));
    }

    @Override // A1.z0
    public final void g() {
        N(a(), -1, new C0046u(29));
    }

    @Override // A1.z0
    public final void h(A1.r rVar) {
        C c3;
        N((!(rVar instanceof A1.r) || (c3 = rVar.f542y) == null) ? a() : K(new D(c3)), 10, new d(16));
    }

    @Override // A1.z0
    public final void i(int i7, A0 a02, A0 a03) {
        if (i7 == 1) {
            this.f994z = false;
        }
        AbstractC0021h abstractC0021h = this.f992x;
        abstractC0021h.getClass();
        Q3.o oVar = this.f989d;
        oVar.f5825d = Q3.o.f(abstractC0021h, (AbstractC0167z) oVar.f5823b, (D) oVar.f5826e, (P0) oVar.f5822a);
        a a2 = a();
        N(a2, 11, new B(a2, i7, a02, a03));
    }

    @Override // c2.J
    public final void j(int i7, D d7, C0814u c0814u, C0819z c0819z, IOException iOException, boolean z4) {
        a L7 = L(i7, d7);
        N(L7, 1003, new C0042s(L7, c0814u, c0819z, iOException, z4));
    }

    @Override // A1.z0
    public final void k(int i7, boolean z4) {
        N(a(), 5, new C0046u(28));
    }

    @Override // A1.z0
    public final void l(float f7) {
        N(M(), 22, new d(23));
    }

    @Override // c2.J
    public final void m(int i7, D d7, C0814u c0814u, C0819z c0819z) {
        N(L(i7, d7), zzbbd.zzq.zzf, new d(15));
    }

    @Override // A1.z0
    public final void n(int i7) {
        N(a(), 4, new d(6));
    }

    @Override // A1.z0
    public final void o(C0022h0 c0022h0, int i7) {
        N(a(), 1, new d(1));
    }

    @Override // A1.z0
    public final void p(boolean z4) {
        N(a(), 9, new C0046u(21));
    }

    @Override // A1.z0
    public final void q(Metadata metadata) {
        N(a(), 28, new d(27));
    }

    @Override // c2.J
    public final void r(int i7, D d7, C0819z c0819z) {
        N(L(i7, d7), 1005, new d(20));
    }

    @Override // A1.z0
    public final void s(A1.r rVar) {
        C c3;
        a a2 = (!(rVar instanceof A1.r) || (c3 = rVar.f542y) == null) ? a() : K(new D(c3));
        N(a2, 10, new C0042s(a2, rVar, 10));
    }

    @Override // A1.z0
    public final void t(C1306c c1306c) {
        N(a(), 27, new d(2));
    }

    @Override // A1.z0
    public final void u(int i7, boolean z4) {
        N(a(), 30, new d(26));
    }

    @Override // A1.z0
    public final void v(w2.o oVar) {
        a M7 = M();
        N(M7, 25, new A1.J(M7, oVar));
    }

    @Override // A1.z0
    public final void w(int i7) {
        AbstractC0021h abstractC0021h = this.f992x;
        abstractC0021h.getClass();
        Q3.o oVar = this.f989d;
        oVar.f5825d = Q3.o.f(abstractC0021h, (AbstractC0167z) oVar.f5823b, (D) oVar.f5826e, (P0) oVar.f5822a);
        oVar.p(((N) abstractC0021h).A());
        N(a(), 0, new d(22));
    }

    @Override // A1.z0
    public final void x(C0039q c0039q) {
        N(a(), 29, new d(24));
    }

    @Override // c2.J
    public final void y(int i7, D d7, C0814u c0814u, C0819z c0819z) {
        N(L(i7, d7), 1002, new f(1));
    }

    @Override // A1.z0
    public final void z(y0 y0Var) {
        N(a(), 13, new d(3));
    }
}

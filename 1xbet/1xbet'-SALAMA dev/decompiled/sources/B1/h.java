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
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p018c2.C;
import p018c2.C0774u;
import p018c2.C0779z;
import p018c2.D;
import p018c2.J;
import p151v2.r;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class h implements z0, J, E1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p151v2.p f986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q0 f988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q3.o f989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p128r5.c f991f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC0021h f992x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r f993y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f994z;

    public h(p151v2.p pVar) {
        pVar.getClass();
        this.f986a = pVar;
        int i7 = t.f17159a;
        Looper looperMyLooper = Looper.myLooper();
        this.f991f = new p128r5.c(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, pVar, new d(8));
        P0 p5 = new P0();
        this.f987b = p5;
        this.f988c = new Q0();
        this.f989d = new Q3.o(p5);
        this.f990e = new SparseArray();
    }

    @Override // p018c2.J
    public final void A(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        N(L(i7, d7), 1001, new C0046u(25));
    }

    @Override // A1.z0
    public final void B(boolean z4) {
        N(M(), 23, new f(2));
    }

    @Override // A1.z0
    public final void C(List list) {
        a aVarA = a();
        N(aVarA, 27, new H(aVarA, list));
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
    public final void F(T0 t7) {
        N(a(), 2, new d(13));
    }

    @Override // A1.z0
    public final void G(int i7, int i8) {
        N(M(), 24, new d(0));
    }

    @Override // p018c2.J
    public final void H(int i7, D d7, C0779z c0779z) {
        a aVarL = L(i7, d7);
        N(aVarL, 1004, new c(1, aVarL, c0779z));
    }

    @Override // A1.z0
    public final void I(boolean z4) {
        N(a(), 7, new f(3));
    }

    public final a J(R0 r7, int i7, D d7) {
        D d8 = r7.p() ? null : d7;
        this.f986a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = r7.equals(((N) this.f992x).A()) && i7 == ((N) this.f992x).x();
        long jN = 0;
        if (d8 == null || !d8.a()) {
            if (z4) {
                jN = ((N) this.f992x).u();
            } else if (!r7.p()) {
                jN = t.N(r7.m(i7, this.f988c, 0L).f206D);
            }
        } else if (z4 && ((N) this.f992x).v() == d8.f10162b && ((N) this.f992x).w() == d8.f10163c) {
            jN = ((N) this.f992x).y();
        }
        D d9 = (D) this.f989d.f5825d;
        R0 r0A = ((N) this.f992x).A();
        int iX = ((N) this.f992x).x();
        long jY = ((N) this.f992x).y();
        N n2 = (N) this.f992x;
        n2.W();
        return new a(jElapsedRealtime, r7, i7, d8, jN, r0A, iX, d9, jY, t.N(n2.f154b0.f601r));
    }

    public final a K(D d7) {
        this.f992x.getClass();
        R0 r7 = d7 == null ? null : (R0) ((Q) this.f989d.f5824c).get(d7);
        if (d7 != null && r7 != null) {
            return J(r7, r7.g(d7.f10161a, this.f987b).f188c, d7);
        }
        int iX = ((N) this.f992x).x();
        R0 r0A = ((N) this.f992x).A();
        if (iX >= r0A.o()) {
            r0A = R0.f220a;
        }
        return J(r0A, iX, null);
    }

    public final a L(int i7, D d7) {
        this.f992x.getClass();
        R0 r7 = R0.f220a;
        if (d7 != null) {
            return ((R0) ((Q) this.f989d.f5824c).get(d7)) != null ? K(d7) : J(r7, i7, d7);
        }
        R0 r0A = ((N) this.f992x).A();
        if (i7 < r0A.o()) {
            r7 = r0A;
        }
        return J(r7, i7, null);
    }

    public final a M() {
        return K((D) this.f989d.f5827f);
    }

    public final void N(a aVar, int i7, p151v2.e eVar) {
        this.f990e.put(i7, aVar);
        this.f991f.k(i7, eVar);
    }

    public final void O(AbstractC0021h abstractC0021h, Looper looper) {
        p151v2.a.h(this.f992x == null || ((AbstractC0167z) this.f989d.f5823b).isEmpty());
        abstractC0021h.getClass();
        this.f992x = abstractC0021h;
        this.f993y = this.f986a.a(looper, null);
        p128r5.c cVar = this.f991f;
        this.f991f = new p128r5.c((CopyOnWriteArraySet) cVar.f16062e, looper, (p151v2.p) cVar.f16059b, new c(0, this, abstractC0021h));
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
    public final void i(int i7, A0 a2, A0 a4) {
        if (i7 == 1) {
            this.f994z = false;
        }
        AbstractC0021h abstractC0021h = this.f992x;
        abstractC0021h.getClass();
        Q3.o oVar = this.f989d;
        oVar.f5825d = Q3.o.f(abstractC0021h, (AbstractC0167z) oVar.f5823b, (D) oVar.f5826e, (P0) oVar.f5822a);
        a aVarA = a();
        N(aVarA, 11, new B(aVarA, i7, a2, a4));
    }

    @Override // p018c2.J
    public final void j(int i7, D d7, C0774u c0774u, C0779z c0779z, IOException iOException, boolean z4) {
        a aVarL = L(i7, d7);
        N(aVarL, 1003, new C0042s(aVarL, c0774u, c0779z, iOException, z4));
    }

    @Override // A1.z0
    public final void k(int i7, boolean z4) {
        N(a(), 5, new C0046u(28));
    }

    @Override // A1.z0
    public final void l(float f7) {
        N(M(), 22, new d(23));
    }

    @Override // p018c2.J
    public final void m(int i7, D d7, C0774u c0774u, C0779z c0779z) {
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

    @Override // p018c2.J
    public final void r(int i7, D d7, C0779z c0779z) {
        N(L(i7, d7), 1005, new d(20));
    }

    @Override // A1.z0
    public final void s(A1.r rVar) {
        C c3;
        a aVarA = (!(rVar instanceof A1.r) || (c3 = rVar.f542y) == null) ? a() : K(new D(c3));
        N(aVarA, 10, new C0042s(aVarA, rVar, 10));
    }

    @Override // A1.z0
    public final void t(p068j2.c cVar) {
        N(a(), 27, new d(2));
    }

    @Override // A1.z0
    public final void u(int i7, boolean z4) {
        N(a(), 30, new d(26));
    }

    @Override // A1.z0
    public final void v(p156w2.o oVar) {
        a aVarM = M();
        N(aVarM, 25, new A1.J(aVarM, oVar));
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

    @Override // p018c2.J
    public final void y(int i7, D d7, C0774u c0774u, C0779z c0779z) {
        N(L(i7, d7), 1002, new f(1));
    }

    @Override // A1.z0
    public final void z(y0 y0Var) {
        N(a(), 13, new d(3));
    }
}

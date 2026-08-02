package v;

import A0.C0040k0;
import android.view.KeyEvent;
import g0.InterfaceC1960e;
import i4.InterfaceC2015a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m4.InterfaceC2105h;
import p4.AbstractC2282w;
import r0.AbstractC2346c;
import r0.C2344a;
import r0.InterfaceC2347d;
import t0.AbstractC2403A;
import t3.AbstractC2425d;
import y.C2651g;
import y.C2652h;
import y.C2654j;
import y.C2655k;
import z0.A0;
import z0.AbstractC2756m;
import z0.InterfaceC2755l;
import z0.y0;

/* renamed from: v.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2503A extends AbstractC2756m implements z0.s0, InterfaceC2347d, InterfaceC1960e, z0.v0, A0 {

    /* renamed from: R, reason: collision with root package name */
    public static final h0 f20120R = new h0();

    /* renamed from: A, reason: collision with root package name */
    public C2654j f20121A;

    /* renamed from: B, reason: collision with root package name */
    public Y f20122B;

    /* renamed from: C, reason: collision with root package name */
    public String f20123C;

    /* renamed from: D, reason: collision with root package name */
    public H0.g f20124D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f20125E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC2015a f20126F;

    /* renamed from: H, reason: collision with root package name */
    public final N f20128H;

    /* renamed from: I, reason: collision with root package name */
    public t0.H f20129I;
    public InterfaceC2755l J;
    public y.l K;

    /* renamed from: L, reason: collision with root package name */
    public C2651g f20130L;

    /* renamed from: O, reason: collision with root package name */
    public C2654j f20133O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f20134P;

    /* renamed from: Q, reason: collision with root package name */
    public final h0 f20135Q;

    /* renamed from: G, reason: collision with root package name */
    public final J f20127G = new J();

    /* renamed from: M, reason: collision with root package name */
    public final LinkedHashMap f20131M = new LinkedHashMap();

    /* renamed from: N, reason: collision with root package name */
    public long f20132N = 0;

    public C2503A(C2654j c2654j, Y y5, boolean z3, String str, H0.g gVar, InterfaceC2015a interfaceC2015a) {
        this.f20121A = c2654j;
        this.f20122B = y5;
        this.f20123C = str;
        this.f20124D = gVar;
        this.f20125E = z3;
        this.f20126F = interfaceC2015a;
        this.f20128H = new N(c2654j);
        C2654j c2654j2 = this.f20121A;
        this.f20133O = c2654j2;
        this.f20134P = c2654j2 == null && this.f20122B != null;
        this.f20135Q = f20120R;
    }

    public final void B0() {
        C2654j c2654j = this.f20121A;
        LinkedHashMap linkedHashMap = this.f20131M;
        if (c2654j != null) {
            y.l lVar = this.K;
            if (lVar != null) {
                c2654j.b(new C2655k(lVar));
            }
            C2651g c2651g = this.f20130L;
            if (c2651g != null) {
                c2654j.b(new C2652h(c2651g));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                c2654j.b(new C2655k((y.l) it.next()));
            }
        }
        this.K = null;
        this.f20130L = null;
        linkedHashMap.clear();
    }

    public final void C0() {
        Y y5;
        if (this.J == null && (y5 = this.f20122B) != null) {
            if (this.f20121A == null) {
                this.f20121A = new C2654j();
            }
            this.f20128H.B0(this.f20121A);
            C2654j c2654j = this.f20121A;
            kotlin.jvm.internal.l.c(c2654j);
            InterfaceC2755l b3 = y5.b(c2654j);
            y0(b3);
            this.J = b3;
        }
    }

    @Override // r0.InterfaceC2347d
    public final boolean O(KeyEvent keyEvent) {
        int q5;
        C0();
        boolean z3 = this.f20125E;
        LinkedHashMap linkedHashMap = this.f20131M;
        if (z3) {
            int i = AbstractC2504B.f20137b;
            if (AbstractC2346c.t(keyEvent) == 2 && ((q5 = (int) (AbstractC2346c.q(keyEvent) >> 32)) == 23 || q5 == 66 || q5 == 160)) {
                if (!linkedHashMap.containsKey(new C2344a(AbstractC2425d.b(keyEvent.getKeyCode())))) {
                    y.l lVar = new y.l(this.f20132N);
                    linkedHashMap.put(new C2344a(AbstractC2425d.b(keyEvent.getKeyCode())), lVar);
                    if (this.f20121A != null) {
                        AbstractC2282w.p(k0(), null, new C2510e(this, lVar, null), 3);
                    }
                    return true;
                }
                return false;
            }
        }
        if (this.f20125E) {
            int i5 = AbstractC2504B.f20137b;
            if (AbstractC2346c.t(keyEvent) == 1) {
                int q6 = (int) (AbstractC2346c.q(keyEvent) >> 32);
                if (q6 != 23 && q6 != 66 && q6 != 160) {
                    return false;
                }
                y.l lVar2 = (y.l) linkedHashMap.remove(new C2344a(AbstractC2425d.b(keyEvent.getKeyCode())));
                if (lVar2 != null && this.f20121A != null) {
                    AbstractC2282w.p(k0(), null, new C2511f(this, lVar2, null), 3);
                }
                this.f20126F.invoke();
                return true;
            }
        }
        return false;
    }

    @Override // z0.s0
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // z0.s0
    public final void U() {
        W();
    }

    @Override // z0.s0
    public final void W() {
        C2651g c2651g;
        C2654j c2654j = this.f20121A;
        if (c2654j != null && (c2651g = this.f20130L) != null) {
            c2654j.b(new C2652h(c2651g));
        }
        this.f20130L = null;
        t0.H h3 = this.f20129I;
        if (h3 != null) {
            h3.W();
        }
    }

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final boolean Z() {
        return true;
    }

    @Override // z0.s0
    public final /* synthetic */ void g0() {
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
        H0.g gVar = this.f20124D;
        if (gVar != null) {
            H0.u.b(jVar, gVar.f2074a);
        }
        String str = this.f20123C;
        C0040k0 c0040k0 = new C0040k0(28, this);
        InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
        jVar.f(H0.i.f2080b, new H0.a(str, c0040k0));
        if (this.f20125E) {
            this.f20128H.j0(jVar);
        } else {
            jVar.f(H0.s.i, W3.o.f6046a);
        }
    }

    @Override // r0.InterfaceC2347d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // g0.InterfaceC1960e
    public final void m(g0.r rVar) {
        if (rVar.a()) {
            C0();
        }
        if (this.f20125E) {
            this.f20128H.m(rVar);
        }
    }

    @Override // z0.A0
    public final Object o() {
        return this.f20135Q;
    }

    @Override // b0.o
    public final void o0() {
        if (!this.f20134P) {
            C0();
        }
        if (this.f20125E) {
            y0(this.f20127G);
            y0(this.f20128H);
        }
    }

    @Override // b0.o
    public final void p0() {
        W();
    }

    @Override // b0.o
    public final void q0() {
        B0();
        if (this.f20133O == null) {
            this.f20121A = null;
        }
        InterfaceC2755l interfaceC2755l = this.J;
        if (interfaceC2755l != null) {
            z0(interfaceC2755l);
        }
        this.J = null;
    }

    @Override // z0.s0
    public final long r() {
        return y0.f21873a;
    }

    @Override // z0.s0
    public final void v(t0.j jVar, t0.k kVar, long j5) {
        long j6 = ((j5 >> 33) << 32) | (((j5 << 32) >> 33) & 4294967295L);
        this.f20132N = G4.d.d((int) (j6 >> 32), (int) (j6 & 4294967295L));
        C0();
        if (this.f20125E && kVar == t0.k.f19490l) {
            int i = jVar.f19488d;
            if (i == 4) {
                AbstractC2282w.p(k0(), null, new C2512g(this, null), 3);
            } else if (i == 5) {
                AbstractC2282w.p(k0(), null, new C2513h(this, null), 3);
            }
        }
        if (this.f20129I == null) {
            C2514i c2514i = new C2514i(this, null);
            t0.j jVar2 = AbstractC2403A.f19430a;
            t0.H h3 = new t0.H(null, null, t0.B.f19431k);
            h3.f19449A = c2514i;
            y0(h3);
            this.f20129I = h3;
        }
        t0.H h4 = this.f20129I;
        if (h4 != null) {
            h4.v(jVar, kVar, j5);
        }
    }
}

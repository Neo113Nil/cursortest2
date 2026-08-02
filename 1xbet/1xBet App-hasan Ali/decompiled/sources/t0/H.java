package t0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.ArrayList;
import p4.AbstractC2282w;
import p4.C2268h;
import p4.C2285z;
import r0.AbstractC2346c;
import z0.AbstractC2749f;
import z0.s0;
import z0.y0;

/* loaded from: classes.dex */
public final class H extends b0.o implements v, W0.c, s0 {

    /* renamed from: A, reason: collision with root package name */
    public AbstractC0548i f19449A;

    /* renamed from: B, reason: collision with root package name */
    public PointerInputEventHandler f19450B;

    /* renamed from: C, reason: collision with root package name */
    public C2285z f19451C;

    /* renamed from: D, reason: collision with root package name */
    public j f19452D = AbstractC2403A.f19430a;

    /* renamed from: E, reason: collision with root package name */
    public final R.e f19453E;

    /* renamed from: F, reason: collision with root package name */
    public final R.e f19454F;

    /* renamed from: G, reason: collision with root package name */
    public final R.e f19455G;

    /* renamed from: H, reason: collision with root package name */
    public j f19456H;

    /* renamed from: I, reason: collision with root package name */
    public long f19457I;

    /* renamed from: y, reason: collision with root package name */
    public Object f19458y;

    /* renamed from: z, reason: collision with root package name */
    public Object f19459z;

    public H(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f19458y = obj;
        this.f19459z = obj2;
        this.f19450B = pointerInputEventHandler;
        R.e eVar = new R.e(new E[16]);
        this.f19453E = eVar;
        this.f19454F = eVar;
        this.f19455G = new R.e(new E[16]);
        this.f19457I = 0L;
    }

    public final void A0() {
        C2285z c2285z = this.f19451C;
        if (c2285z != null) {
            c2285z.z(new b0.q("Pointer input was reset", 1));
            this.f19451C = null;
        }
    }

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // z0.s0
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // z0.s0
    public final void U() {
        A0();
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // z0.s0
    public final void W() {
        j jVar = this.f19456H;
        if (jVar == null) {
            return;
        }
        ?? r1 = jVar.f19485a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((s) r1.get(i)).f19503d) {
                ArrayList arrayList = new ArrayList(r1.size());
                int size2 = r1.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    s sVar = (s) r1.get(i5);
                    long j5 = sVar.f19500a;
                    boolean z3 = sVar.f19503d;
                    int i6 = sVar.i;
                    long j6 = sVar.f19501b;
                    long j7 = sVar.f19502c;
                    arrayList.add(new s(j5, j6, j7, false, sVar.f19504e, j6, j7, z3, z3, i6, 0L));
                }
                j jVar2 = new j(arrayList, null);
                this.f19452D = jVar2;
                z0(jVar2, k.f19489k);
                z0(jVar2, k.f19490l);
                z0(jVar2, k.f19491m);
                this.f19456H = null;
                return;
            }
        }
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    @Override // W0.c
    public final float c() {
        return AbstractC2749f.v(this).f21607H.c();
    }

    @Override // z0.s0
    public final /* synthetic */ void g0() {
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final float n() {
        return AbstractC2749f.v(this).f21607H.n();
    }

    @Override // b0.o
    public final void p0() {
        A0();
    }

    @Override // b0.o
    public final void q0() {
        A0();
    }

    @Override // z0.s0
    public final long r() {
        return y0.f21873a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // z0.s0
    public final void v(j jVar, k kVar, long j5) {
        this.f19457I = j5;
        if (kVar == k.f19489k) {
            this.f19452D = jVar;
        }
        if (this.f19451C == null) {
            this.f19451C = AbstractC2282w.p(k0(), null, new G(this, null), 1);
        }
        z0(jVar, kVar);
        ?? r42 = jVar.f19485a;
        int size = r42.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                jVar = null;
                break;
            } else if (!q.c((s) r42.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f19456H = jVar;
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }

    public final Object y0(i4.e eVar, a4.c cVar) {
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
        c2268h.r();
        E e3 = new E(this, c2268h);
        synchronized (this.f19454F) {
            this.f19453E.c(e3);
            new a4.j(AbstractC2346c.v(AbstractC2346c.j(e3, e3, eVar)), EnumC0510a.f7289k).resumeWith(W3.o.f6046a);
        }
        c2268h.t(new F(0, e3));
        return c2268h.q();
    }

    public final void z0(j jVar, k kVar) {
        C2268h c2268h;
        C2268h c2268h2;
        synchronized (this.f19454F) {
            R.e eVar = this.f19455G;
            eVar.d(eVar.f5108m, this.f19453E);
        }
        try {
            int ordinal = kVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    R.e eVar2 = this.f19455G;
                    int i = eVar2.f5108m - 1;
                    Object[] objArr = eVar2.f5106k;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            E e3 = (E) objArr[i];
                            if (kVar == e3.f19442n && (c2268h2 = e3.f19441m) != null) {
                                e3.f19441m = null;
                                c2268h2.resumeWith(jVar);
                            }
                            i--;
                        }
                    }
                    this.f19455G.h();
                }
                if (ordinal != 2) {
                    throw new D2.e();
                }
            }
            R.e eVar3 = this.f19455G;
            Object[] objArr2 = eVar3.f5106k;
            int i5 = eVar3.f5108m;
            for (int i6 = 0; i6 < i5; i6++) {
                E e5 = (E) objArr2[i6];
                if (kVar == e5.f19442n && (c2268h = e5.f19441m) != null) {
                    e5.f19441m = null;
                    c2268h.resumeWith(jVar);
                }
            }
            this.f19455G.h();
        } catch (Throwable th) {
            this.f19455G.h();
            throw th;
        }
    }
}

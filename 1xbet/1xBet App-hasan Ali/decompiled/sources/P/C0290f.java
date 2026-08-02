package P;

import p4.C2268h;
import r.C2316B;
import r0.AbstractC2346c;

/* renamed from: P.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290f implements InterfaceC0281a0 {

    /* renamed from: k, reason: collision with root package name */
    public final O3.l f4462k;

    /* renamed from: m, reason: collision with root package name */
    public Throwable f4464m;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4463l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final X.a f4465n = new X.a(0);

    /* renamed from: o, reason: collision with root package name */
    public C2316B f4466o = new C2316B();

    /* renamed from: p, reason: collision with root package name */
    public C2316B f4467p = new C2316B();

    public C0290f(O3.l lVar) {
        this.f4462k = lVar;
    }

    public static final void a(C0290f c0290f, Throwable th) {
        int i;
        synchronized (c0290f.f4463l) {
            try {
                if (c0290f.f4464m != null) {
                    return;
                }
                c0290f.f4464m = th;
                C2316B c2316b = c0290f.f4466o;
                Object[] objArr = c2316b.f18904a;
                int i5 = c2316b.f18905b;
                for (int i6 = 0; i6 < i5; i6++) {
                    C2268h c2268h = ((C0286d) objArr[i6]).f4458b;
                    if (c2268h != null) {
                        c2268h.resumeWith(G4.l.p(th));
                    }
                }
                c0290f.f4466o.c();
                X.a aVar = c0290f.f4465n;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a4.h
    public final Object A(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    public final void c(long j5) {
        int i;
        C2268h c2268h;
        Object p5;
        synchronized (this.f4463l) {
            try {
                C2316B c2316b = this.f4466o;
                this.f4466o = this.f4467p;
                this.f4467p = c2316b;
                X.a aVar = this.f4465n;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i5 = c2316b.f18905b;
                for (int i6 = 0; i6 < i5; i6++) {
                    C0286d c0286d = (C0286d) c2316b.e(i6);
                    i4.c cVar = c0286d.f4457a;
                    if (cVar != null && (c2268h = c0286d.f4458b) != null) {
                        try {
                            p5 = cVar.c(Long.valueOf(j5));
                        } catch (Throwable th) {
                            p5 = G4.l.p(th);
                        }
                        c2268h.resumeWith(p5);
                    }
                }
                c2316b.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a4.f
    public final a4.g getKey() {
        return Z.f4430l;
    }

    @Override // a4.h
    public final a4.f l(a4.g gVar) {
        return G4.l.y(this, gVar);
    }

    @Override // a4.h
    public final a4.h m(a4.h hVar) {
        return G4.l.H(this, hVar);
    }

    @Override // P.InterfaceC0281a0
    public final Object n(i4.c cVar, a4.c cVar2) {
        int i;
        int i5;
        boolean z3 = true;
        C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar2));
        c2268h.r();
        C0286d c0286d = new C0286d();
        c0286d.f4457a = cVar;
        c0286d.f4458b = c2268h;
        kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f17622k = -1;
        synchronized (this.f4463l) {
            Throwable th = this.f4464m;
            if (th != null) {
                c2268h.resumeWith(G4.l.p(th));
            } else {
                X.a aVar = this.f4465n;
                do {
                    i = aVar.get();
                    i5 = i + 1;
                } while (!aVar.compareAndSet(i, i5));
                if ((134217727 & i5) != 1) {
                    z3 = false;
                }
                uVar.f17622k = (i5 >>> 27) & 15;
                this.f4466o.a(c0286d);
                c2268h.t(new C0288e(c0286d, this, uVar));
                if (z3) {
                    try {
                        this.f4462k.invoke();
                    } catch (Throwable th2) {
                        a(this, th2);
                    }
                }
            }
        }
        return c2268h.q();
    }

    @Override // a4.h
    public final a4.h r(a4.g gVar) {
        return G4.l.F(this, gVar);
    }
}

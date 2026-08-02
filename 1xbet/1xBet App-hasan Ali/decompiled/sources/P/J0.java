package P;

import a0.C0446b;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class J0 implements InterfaceC2280u, G0 {

    /* renamed from: n, reason: collision with root package name */
    public static final C0292g f4325n = new C0292g();

    /* renamed from: k, reason: collision with root package name */
    public final a4.h f4326k;

    /* renamed from: l, reason: collision with root package name */
    public final J0 f4327l = this;

    /* renamed from: m, reason: collision with root package name */
    public volatile a4.h f4328m;

    public J0(a4.h hVar) {
        this.f4326k = hVar;
    }

    public final void b() {
        synchronized (this.f4327l) {
            try {
                a4.h hVar = this.f4328m;
                if (hVar == null) {
                    this.f4328m = f4325n;
                } else {
                    M m5 = new M(0);
                    p4.U u5 = (p4.U) hVar.l(p4.r.f18819l);
                    if (u5 != null) {
                        u5.d(m5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // P.G0
    public final void c() {
        b();
    }

    @Override // P.G0
    public final void e() {
        b();
    }

    @Override // p4.InterfaceC2280u
    public final a4.h i() {
        a4.h hVar;
        a4.h hVar2 = this.f4328m;
        if (hVar2 == null || hVar2 == f4325n) {
            C0446b c0446b = (C0446b) this.f4326k.l(C0446b.f6363l);
            a4.h i02 = c0446b != null ? new I0(c0446b, this) : a4.i.f6649k;
            synchronized (this.f4327l) {
                try {
                    a4.h hVar3 = this.f4328m;
                    if (hVar3 == null) {
                        a4.h hVar4 = this.f4326k;
                        hVar = hVar4.m(new p4.W((p4.U) hVar4.l(p4.r.f18819l))).m(a4.i.f6649k).m(i02);
                    } else if (hVar3 == f4325n) {
                        a4.h hVar5 = this.f4326k;
                        p4.W w5 = new p4.W((p4.U) hVar5.l(p4.r.f18819l));
                        w5.y(new M(0));
                        hVar = hVar5.m(w5).m(a4.i.f6649k).m(i02);
                    } else {
                        hVar = hVar3;
                    }
                    this.f4328m = hVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            hVar2 = hVar;
        }
        kotlin.jvm.internal.l.c(hVar2);
        return hVar2;
    }

    @Override // P.G0
    public final void a() {
    }
}

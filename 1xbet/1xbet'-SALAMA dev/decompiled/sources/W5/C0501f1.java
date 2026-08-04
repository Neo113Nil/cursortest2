package W5;

import U5.AbstractC0442i;
import U5.C0437d;
import U5.C0450q;
import p155w1.C1010l1;

/* JADX INFO: renamed from: W5.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0501f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0549w f7206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H2.r f7207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.b0 f7208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0437d f7209d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1010l1 f7211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0442i[] f7212g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC0540t f7214i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public P f7215k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f7213h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0450q f7210e = C0450q.b();

    public C0501f1(InterfaceC0549w interfaceC0549w, H2.r rVar, U5.b0 b0Var, C0437d c0437d, C1010l1 c1010l1, AbstractC0442i[] abstractC0442iArr) {
        this.f7206a = interfaceC0549w;
        this.f7207b = rVar;
        this.f7208c = b0Var;
        this.f7209d = c0437d;
        this.f7211f = c1010l1;
        this.f7212g = abstractC0442iArr;
    }

    public final void a(U5.l0 l0Var) {
        p113p3.f.d("Cannot fail with OK status", !l0Var.e());
        p113p3.f.q("apply() or fail() already called", !this.j);
        b(new W(AbstractC0494d0.h(l0Var), EnumC0543u.f7372a, this.f7212g));
    }

    public final void b(InterfaceC0540t interfaceC0540t) {
        boolean z4;
        p113p3.f.q("already finalized", !this.j);
        this.j = true;
        synchronized (this.f7213h) {
            try {
                if (this.f7214i == null) {
                    this.f7214i = interfaceC0540t;
                    z4 = true;
                } else {
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            C0511j c0511j = (C0511j) this.f7211f.f17777a;
            if (c0511j.f7250b.decrementAndGet() == 0) {
                C0511j.h(c0511j);
                return;
            }
            return;
        }
        p113p3.f.q("delayedStream is null", this.f7215k != null);
        N nR = this.f7215k.r(interfaceC0540t);
        if (nR != null) {
            nR.run();
        }
        C0511j c0511j2 = (C0511j) this.f7211f.f17777a;
        if (c0511j2.f7250b.decrementAndGet() == 0) {
            C0511j.h(c0511j2);
        }
    }
}

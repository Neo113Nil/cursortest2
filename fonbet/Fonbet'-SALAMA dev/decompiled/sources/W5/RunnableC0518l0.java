package W5;

import U5.EnumC0446m;
import java.util.ArrayList;
import java.util.Iterator;
import w1.P2;

/* renamed from: W5.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0518l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5.l0 f7271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0538s0 f7272c;

    public /* synthetic */ RunnableC0518l0(C0538s0 c0538s0, U5.l0 l0Var, int i7) {
        this.f7270a = i7;
        this.f7272c = c0538s0;
        this.f7271b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7270a) {
            case 0:
                EnumC0446m enumC0446m = this.f7272c.f7361w.f6558a;
                EnumC0446m enumC0446m2 = EnumC0446m.f6554e;
                if (enumC0446m != enumC0446m2) {
                    C0538s0 c0538s0 = this.f7272c;
                    c0538s0.f7362x = this.f7271b;
                    C0527o0 c0527o0 = c0538s0.f7360v;
                    C0538s0 c0538s02 = this.f7272c;
                    C0527o0 c0527o02 = c0538s02.f7359u;
                    c0538s02.f7360v = null;
                    C0538s0 c0538s03 = this.f7272c;
                    c0538s03.f7359u = null;
                    C0538s0.g(c0538s03, enumC0446m2);
                    this.f7272c.f7350l.d();
                    if (this.f7272c.f7357s.isEmpty()) {
                        C0538s0 c0538s04 = this.f7272c;
                        c0538s04.getClass();
                        c0538s04.f7349k.execute(new RunnableC0515k0(c0538s04, 2));
                    }
                    C0538s0 c0538s05 = this.f7272c;
                    c0538s05.f7349k.f();
                    P2 p22 = c0538s05.f7354p;
                    if (p22 != null) {
                        p22.d();
                        c0538s05.f7354p = null;
                        c0538s05.f7352n = null;
                    }
                    P2 p23 = this.f7272c.f7355q;
                    if (p23 != null) {
                        p23.d();
                        this.f7272c.f7356r.e(this.f7271b);
                        C0538s0 c0538s06 = this.f7272c;
                        c0538s06.f7355q = null;
                        c0538s06.f7356r = null;
                    }
                    if (c0527o0 != null) {
                        c0527o0.e(this.f7271b);
                    }
                    if (c0527o02 != null) {
                        c0527o02.e(this.f7271b);
                        break;
                    }
                }
                break;
            default:
                Iterator it = new ArrayList(this.f7272c.f7357s).iterator();
                while (it.hasNext()) {
                    ((Y0) it.next()).c(this.f7271b);
                }
                break;
        }
    }
}

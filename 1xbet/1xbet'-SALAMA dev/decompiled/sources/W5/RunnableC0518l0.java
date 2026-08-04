package W5;

import U5.EnumC0446m;
import java.util.ArrayList;
import java.util.Iterator;
import p155w1.P2;

/* JADX INFO: renamed from: W5.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0518l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U5.l0 f7271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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
                    C0538s0 c0538s1 = this.f7272c;
                    C0527o0 c0527o1 = c0538s1.f7359u;
                    c0538s1.f7360v = null;
                    C0538s0 c0538s2 = this.f7272c;
                    c0538s2.f7359u = null;
                    C0538s0.g(c0538s2, enumC0446m2);
                    this.f7272c.f7350l.d();
                    if (this.f7272c.f7357s.isEmpty()) {
                        C0538s0 c0538s3 = this.f7272c;
                        c0538s3.getClass();
                        c0538s3.f7349k.execute(new RunnableC0515k0(c0538s3, 2));
                    }
                    C0538s0 c0538s4 = this.f7272c;
                    c0538s4.f7349k.f();
                    P2 p5 = c0538s4.f7354p;
                    if (p5 != null) {
                        p5.d();
                        c0538s4.f7354p = null;
                        c0538s4.f7352n = null;
                    }
                    P2 p7 = this.f7272c.f7355q;
                    if (p7 != null) {
                        p7.d();
                        this.f7272c.f7356r.e(this.f7271b);
                        C0538s0 c0538s5 = this.f7272c;
                        c0538s5.f7355q = null;
                        c0538s5.f7356r = null;
                    }
                    if (c0527o0 != null) {
                        c0527o0.e(this.f7271b);
                    }
                    if (c0527o1 != null) {
                        c0527o1.e(this.f7271b);
                    }
                    break;
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

package W5;

import A1.C0011c;
import U5.EnumC0446m;

/* renamed from: W5.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0533q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0011c f7314b;

    public /* synthetic */ RunnableC0533q0(C0011c c0011c, int i7) {
        this.f7313a = i7;
        this.f7314b = c0011c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7313a) {
            case 0:
                C0011c c0011c = this.f7314b;
                C0538s0 c0538s0 = (C0538s0) c0011c.f334d;
                c0538s0.f7352n = null;
                if (c0538s0.f7362x == null) {
                    C0527o0 c0527o0 = c0538s0.f7359u;
                    C0527o0 c0527o02 = (C0527o0) c0011c.f333c;
                    if (c0527o0 == c0527o02) {
                        c0538s0.f7360v = c0527o02;
                        C0538s0 c0538s02 = (C0538s0) this.f7314b.f334d;
                        c0538s02.f7359u = null;
                        C0538s0.g(c0538s02, EnumC0446m.f6551b);
                        break;
                    }
                } else {
                    p3.f.q("Unexpected non-null activeTransport", c0538s0.f7360v == null);
                    C0011c c0011c2 = this.f7314b;
                    ((C0527o0) c0011c2.f333c).e(((C0538s0) c0011c2.f334d).f7362x);
                    break;
                }
                break;
            default:
                C0011c c0011c3 = this.f7314b;
                ((C0538s0) c0011c3.f334d).f7357s.remove((C0527o0) c0011c3.f333c);
                if (((C0538s0) this.f7314b.f334d).f7361w.f6558a == EnumC0446m.f6554e && ((C0538s0) this.f7314b.f334d).f7357s.isEmpty()) {
                    C0538s0 c0538s03 = (C0538s0) this.f7314b.f334d;
                    c0538s03.getClass();
                    c0538s03.f7349k.execute(new RunnableC0515k0(c0538s03, 2));
                    break;
                }
                break;
        }
    }
}

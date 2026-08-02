package W5;

import w1.C1759x1;

/* loaded from: classes2.dex */
public final class L1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f6859b;

    public /* synthetic */ L1(h2 h2Var, int i7) {
        this.f6858a = i7;
        this.f6859b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6858a) {
            case 0:
                F0 f02 = (F0) this.f6859b.f7233c;
                f02.f6801z = true;
                InterfaceC0546v interfaceC0546v = f02.f6796u;
                C1759x1 c1759x1 = f02.f6794s;
                interfaceC0546v.F((U5.l0) c1759x1.f17925b, (EnumC0543u) c1759x1.f17926c, (U5.b0) c1759x1.f17927d);
                break;
            default:
                F0 f03 = (F0) this.f6859b.f7233c;
                if (!f03.f6801z) {
                    f03.f6796u.u();
                    break;
                }
                break;
        }
    }
}

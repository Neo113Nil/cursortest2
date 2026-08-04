package W5;

import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class L1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f6859b;

    public /* synthetic */ L1(h2 h2Var, int i7) {
        this.f6858a = i7;
        this.f6859b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6858a) {
            case 0:
                F0 f7 = (F0) this.f6859b.f7233c;
                f7.f6801z = true;
                InterfaceC0546v interfaceC0546v = f7.f6796u;
                C1050x1 c1050x1 = f7.f6794s;
                interfaceC0546v.F((U5.l0) c1050x1.f17931b, (EnumC0543u) c1050x1.f17932c, (U5.b0) c1050x1.f17933d);
                break;
            default:
                F0 f8 = (F0) this.f6859b.f7233c;
                if (!f8.f6801z) {
                    f8.f6796u.u();
                }
                break;
        }
    }
}

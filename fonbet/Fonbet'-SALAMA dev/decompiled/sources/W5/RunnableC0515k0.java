package W5;

import U5.EnumC0446m;

/* renamed from: W5.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0515k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0538s0 f7263b;

    public /* synthetic */ RunnableC0515k0(C0538s0 c0538s0, int i7) {
        this.f7262a = i7;
        this.f7263b = c0538s0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7262a) {
            case 0:
                C0538s0 c0538s0 = this.f7263b;
                c0538s0.f7354p = null;
                c0538s0.f7348i.l(2, "CONNECTING after backoff");
                C0538s0.g(c0538s0, EnumC0446m.f6550a);
                C0538s0.h(c0538s0);
                break;
            case 1:
                if (this.f7263b.f7361w.f6558a == EnumC0446m.f6553d) {
                    this.f7263b.f7348i.l(2, "CONNECTING as requested");
                    C0538s0.g(this.f7263b, EnumC0446m.f6550a);
                    C0538s0.h(this.f7263b);
                    break;
                }
                break;
            default:
                C0538s0 c0538s02 = this.f7263b;
                c0538s02.f7348i.l(2, "Terminated");
                P0 p02 = (P0) c0538s02.f7343d.f7233c;
                p02.j.f6933D.remove(c0538s02);
                Q0 q02 = p02.j;
                Q0.A(q02);
                break;
        }
    }
}

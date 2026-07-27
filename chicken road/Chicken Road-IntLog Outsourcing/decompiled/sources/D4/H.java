package D4;

import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class H extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f464f;

    public /* synthetic */ H(int i2, Object obj) {
        this.f463e = i2;
        this.f464f = obj;
    }

    @Override // t4.InterfaceC1441l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f463e) {
            case 0:
                k((Throwable) obj);
                break;
            case 1:
                k((Throwable) obj);
                break;
            case 2:
                k((Throwable) obj);
                break;
            default:
                k((Throwable) obj);
                break;
        }
        return f4.v.f5689a;
    }

    @Override // D4.b0
    public final void k(Throwable th) {
        switch (this.f463e) {
            case 0:
                ((G) this.f464f).b();
                break;
            case 1:
                ((InterfaceC1441l) this.f464f).invoke(th);
                break;
            case 2:
                Object D5 = j().D();
                boolean z = D5 instanceof C0016p;
                c0 c0Var = (c0) this.f464f;
                if (!z) {
                    c0Var.resumeWith(AbstractC0024y.u(D5));
                    break;
                } else {
                    c0Var.resumeWith(e5.g.l(((C0016p) D5).f526a));
                    break;
                }
            default:
                ((C0007g) this.f464f).resumeWith(f4.v.f5689a);
                break;
        }
    }
}

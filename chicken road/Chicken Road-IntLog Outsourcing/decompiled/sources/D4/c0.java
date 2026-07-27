package D4;

import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public final class c0 extends C0007g {

    /* renamed from: i, reason: collision with root package name */
    public final C0013m f492i;

    public c0(InterfaceC1218d interfaceC1218d, C0013m c0013m) {
        super(1, interfaceC1218d);
        this.f492i = c0013m;
    }

    @Override // D4.C0007g
    public final Throwable q(g0 g0Var) {
        Throwable c2;
        Object D5 = this.f492i.D();
        return (!(D5 instanceof e0) || (c2 = ((e0) D5).c()) == null) ? D5 instanceof C0016p ? ((C0016p) D5).f526a : g0Var.x() : c2;
    }

    @Override // D4.C0007g
    public final String y() {
        return "AwaitContinuation";
    }
}

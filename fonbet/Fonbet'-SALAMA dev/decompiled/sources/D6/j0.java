package D6;

import i6.InterfaceC1287d;

/* loaded from: classes2.dex */
public final class j0 extends C0130m {

    /* renamed from: z, reason: collision with root package name */
    public final s0 f1845z;

    public j0(s0 s0Var, InterfaceC1287d interfaceC1287d) {
        super(1, interfaceC1287d);
        this.f1845z = s0Var;
    }

    @Override // D6.C0130m
    public final Throwable q(s0 s0Var) {
        Throwable b7;
        Object x4 = this.f1845z.x();
        return (!(x4 instanceof l0) || (b7 = ((l0) x4).b()) == null) ? x4 instanceof C0138v ? ((C0138v) x4).f1882a : s0Var.getCancellationException() : b7;
    }

    @Override // D6.C0130m
    public final String y() {
        return "AwaitContinuation";
    }
}

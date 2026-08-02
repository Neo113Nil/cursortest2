package x0;

import z0.InterfaceC2764v;

/* loaded from: classes.dex */
public final class W extends b0.o implements InterfaceC2764v {

    /* renamed from: y, reason: collision with root package name */
    public i4.c f20969y;

    /* renamed from: z, reason: collision with root package name */
    public long f20970z;

    @Override // b0.o
    public final boolean l0() {
        return true;
    }

    @Override // z0.InterfaceC2764v
    public final void s(long j5) {
        if (W0.l.a(this.f20970z, j5)) {
            return;
        }
        this.f20969y.c(new W0.l(j5));
        this.f20970z = j5;
    }

    @Override // z0.InterfaceC2764v
    public final /* synthetic */ void u(InterfaceC2637x interfaceC2637x) {
    }
}

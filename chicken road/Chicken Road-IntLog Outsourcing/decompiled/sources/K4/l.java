package K4;

import D4.AbstractC0020u;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class l extends AbstractC0020u {

    /* renamed from: c, reason: collision with root package name */
    public static final l f1453c = new l();

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        d dVar = d.f1438d;
        dVar.f1440c.b(runnable, k.f1452h, false);
    }

    @Override // D4.AbstractC0020u
    public final void D(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        d dVar = d.f1438d;
        dVar.f1440c.b(runnable, k.f1452h, true);
    }

    public final AbstractC0020u F(int i2) {
        I4.a.b(i2);
        if (i2 >= k.f1448d) {
            return this;
        }
        I4.a.b(i2);
        return new I4.i(this, i2);
    }
}

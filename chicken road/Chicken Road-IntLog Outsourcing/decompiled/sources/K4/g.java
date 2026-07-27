package K4;

import D4.P;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public abstract class g extends P {

    /* renamed from: c, reason: collision with root package name */
    public final b f1440c;

    public g(int i2, int i3, long j2, String str) {
        this.f1440c = new b(i2, i3, j2, str);
    }

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        b.c(this.f1440c, runnable, false, 6);
    }

    @Override // D4.AbstractC0020u
    public final void D(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        b.c(this.f1440c, runnable, true, 2);
    }
}

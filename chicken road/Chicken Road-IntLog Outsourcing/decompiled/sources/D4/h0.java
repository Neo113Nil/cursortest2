package D4;

import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import m4.AbstractC1293a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class h0 extends m0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1218d f516d;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(InterfaceC1223i interfaceC1223i, InterfaceC1445p interfaceC1445p) {
        super(interfaceC1223i, false);
        this.f516d = ((AbstractC1293a) interfaceC1445p).create(this, this);
    }

    @Override // D4.g0
    public final void R() {
        try {
            I4.a.i(B0.f.F(this.f516d), f4.v.f5689a, null);
        } catch (Throwable th) {
            resumeWith(e5.g.l(th));
            throw th;
        }
    }
}

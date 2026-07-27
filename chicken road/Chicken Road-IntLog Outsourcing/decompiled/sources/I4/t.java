package I4;

import D4.AbstractC0001a;
import D4.AbstractC0024y;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public class t extends AbstractC0001a implements m4.d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1218d f1321d;

    public t(InterfaceC1218d interfaceC1218d, InterfaceC1223i interfaceC1223i) {
        super(interfaceC1223i, true);
        this.f1321d = interfaceC1218d;
    }

    @Override // D4.g0
    public final boolean J() {
        return true;
    }

    @Override // m4.d
    public final m4.d getCallerFrame() {
        InterfaceC1218d interfaceC1218d = this.f1321d;
        if (interfaceC1218d instanceof m4.d) {
            return (m4.d) interfaceC1218d;
        }
        return null;
    }

    @Override // D4.g0
    public void l(Object obj) {
        a.i(B0.f.F(this.f1321d), AbstractC0024y.o(obj), null);
    }

    @Override // D4.g0
    public void m(Object obj) {
        this.f1321d.resumeWith(AbstractC0024y.o(obj));
    }
}

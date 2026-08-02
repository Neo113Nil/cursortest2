package I6;

import D6.AbstractC0109a;
import D6.E;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import k6.InterfaceC1357d;

/* loaded from: classes2.dex */
public class t extends AbstractC0109a implements InterfaceC1357d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1287d f3757d;

    public t(InterfaceC1287d interfaceC1287d, InterfaceC1292i interfaceC1292i) {
        super(interfaceC1292i, true);
        this.f3757d = interfaceC1287d;
    }

    @Override // D6.s0
    public final boolean B() {
        return true;
    }

    @Override // k6.InterfaceC1357d
    public final InterfaceC1357d getCallerFrame() {
        InterfaceC1287d interfaceC1287d = this.f3757d;
        if (interfaceC1287d instanceof InterfaceC1357d) {
            return (InterfaceC1357d) interfaceC1287d;
        }
        return null;
    }

    @Override // D6.s0
    public void h(Object obj) {
        a.h(P6.b.v(this.f3757d), E.r(obj), null);
    }

    @Override // D6.s0
    public void i(Object obj) {
        this.f3757d.resumeWith(E.r(obj));
    }
}

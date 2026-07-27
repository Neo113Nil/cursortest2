package D4;

import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import k4.InterfaceC1223i;
import n2.AbstractC1341c;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC1221g, InterfaceC1222h {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f547a = new w0();

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i A(InterfaceC1223i interfaceC1223i) {
        return AbstractC1341c.A(this, interfaceC1223i);
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i c(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.x(this, interfaceC1222h);
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1221g o(InterfaceC1222h interfaceC1222h) {
        return AbstractC1341c.n(this, interfaceC1222h);
    }

    @Override // k4.InterfaceC1223i
    public final Object q(Object obj, InterfaceC1445p interfaceC1445p) {
        return interfaceC1445p.invoke(obj, this);
    }

    @Override // k4.InterfaceC1221g
    public final InterfaceC1222h getKey() {
        return this;
    }
}

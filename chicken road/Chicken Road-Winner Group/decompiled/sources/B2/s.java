package B2;

import g2.InterfaceC0319c;
import i2.InterfaceC0344c;
import w2.AbstractC1222a;
import w2.AbstractC1242v;

/* loaded from: classes.dex */
public class s extends AbstractC1222a implements InterfaceC0344c {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0319c f179d;

    public s(InterfaceC0319c interfaceC0319c, g2.h hVar) {
        super(hVar, true);
        this.f179d = interfaceC0319c;
    }

    @Override // w2.Z
    public final boolean H() {
        return true;
    }

    @Override // i2.InterfaceC0344c
    public final InterfaceC0344c c() {
        InterfaceC0319c interfaceC0319c = this.f179d;
        if (interfaceC0319c instanceof InterfaceC0344c) {
            return (InterfaceC0344c) interfaceC0319c;
        }
        return null;
    }

    @Override // w2.Z
    public void o(Object obj) {
        a.g(F2.b.y(this.f179d), AbstractC1242v.h(obj));
    }

    @Override // w2.Z
    public void p(Object obj) {
        this.f179d.e(AbstractC1242v.h(obj));
    }
}

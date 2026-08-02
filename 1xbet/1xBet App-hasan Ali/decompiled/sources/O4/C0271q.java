package O4;

import b4.EnumC0510a;
import p4.C2268h;
import r0.AbstractC2346c;
import y4.InterfaceC2676d;

/* renamed from: O4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271q extends AbstractC0272s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4222d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0261g f4223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0271q(Q q5, InterfaceC2676d interfaceC2676d, InterfaceC0267m interfaceC0267m, InterfaceC0261g interfaceC0261g, int i) {
        super(q5, interfaceC2676d, interfaceC0267m);
        this.f4222d = i;
        this.f4223e = interfaceC0261g;
    }

    @Override // O4.AbstractC0272s
    public final Object a(A a5, Object[] objArr) {
        switch (this.f4222d) {
            case 0:
                return this.f4223e.o(a5);
            default:
                InterfaceC0259e interfaceC0259e = (InterfaceC0259e) this.f4223e.o(a5);
                a4.c cVar = (a4.c) objArr[objArr.length - 1];
                try {
                    C2268h c2268h = new C2268h(1, AbstractC2346c.v(cVar));
                    c2268h.r();
                    c2268h.t(new C0274u(interfaceC0259e, 2));
                    interfaceC0259e.d(new C0275v(c2268h, 1));
                    return c2268h.q();
                } catch (Exception e3) {
                    Z.r(e3, cVar);
                    return EnumC0510a.f7289k;
                }
        }
    }
}

package A2;

import d2.C0279i;
import g2.C0320d;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.AbstractC1242v;
import w2.C1237p;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: d, reason: collision with root package name */
    public final z2.d f104d;

    public h(z2.d dVar, g2.h hVar, int i3, int i4) {
        super(hVar, i3, i4);
        this.f104d = dVar;
    }

    @Override // A2.f
    public final Object a(y2.o oVar, InterfaceC0319c interfaceC0319c) {
        Object l3 = this.f104d.l(new r(oVar), interfaceC0319c);
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        C0279i c0279i = C0279i.f4852a;
        if (l3 != enumC0326a) {
            l3 = c0279i;
        }
        return l3 == enumC0326a ? l3 : c0279i;
    }

    @Override // A2.f
    public final f b(g2.h hVar, int i3, int i4) {
        return new h(this.f104d, hVar, i3, i4);
    }

    @Override // A2.f, z2.d
    public final Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        C0279i c0279i = C0279i.f4852a;
        int i3 = this.f100b;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        if (i3 == -3) {
            g2.h context = interfaceC0319c.getContext();
            Boolean bool = Boolean.FALSE;
            C1237p c1237p = C1237p.f10518g;
            g2.h hVar = this.f99a;
            g2.h h3 = !((Boolean) hVar.i(bool, c1237p)).booleanValue() ? context.h(hVar) : AbstractC1242v.b(context, hVar, false);
            if (kotlin.jvm.internal.j.a(h3, context)) {
                Object l3 = this.f104d.l(eVar, interfaceC0319c);
                if (l3 != enumC0326a) {
                    l3 = c0279i;
                }
                if (l3 == enumC0326a) {
                    return l3;
                }
            } else {
                C0320d c0320d = C0320d.f4980a;
                if (kotlin.jvm.internal.j.a(h3.k(c0320d), context.k(c0320d))) {
                    g2.h context2 = interfaceC0319c.getContext();
                    if (!(eVar instanceof r)) {
                        eVar = new u(eVar, context2);
                    }
                    Object b3 = l.b(h3, eVar, B2.a.k(h3), new g(this, null), interfaceC0319c);
                    if (b3 != enumC0326a) {
                        b3 = c0279i;
                    }
                    if (b3 == enumC0326a) {
                        return b3;
                    }
                }
            }
        }
        Object l4 = super.l(eVar, interfaceC0319c);
        return l4 == enumC0326a ? l4 : c0279i;
    }

    @Override // A2.f
    public final String toString() {
        return this.f104d + " -> " + super.toString();
    }
}

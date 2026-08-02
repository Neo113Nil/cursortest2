package H6;

import D6.C0140x;
import D6.E;
import f6.C1116i;
import i6.C1288e;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;

/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: d, reason: collision with root package name */
    public final G6.g f3440d;

    public h(G6.g gVar, InterfaceC1292i interfaceC1292i, int i7, int i8) {
        super(interfaceC1292i, i7, i8);
        this.f3440d = gVar;
    }

    @Override // H6.f
    public final Object a(F6.p pVar, InterfaceC1287d interfaceC1287d) {
        Object r7 = this.f3440d.r(new r(pVar), interfaceC1287d);
        j6.a aVar = j6.a.f14642a;
        C1116i c1116i = C1116i.f13008a;
        if (r7 != aVar) {
            r7 = c1116i;
        }
        return r7 == aVar ? r7 : c1116i;
    }

    @Override // H6.f
    public final f b(InterfaceC1292i interfaceC1292i, int i7, int i8) {
        return new h(this.f3440d, interfaceC1292i, i7, i8);
    }

    @Override // H6.f, G6.g
    public final Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        Object r7;
        C1116i c1116i = C1116i.f13008a;
        if (this.f3435b == -3) {
            InterfaceC1292i context = interfaceC1287d.getContext();
            Boolean bool = Boolean.FALSE;
            C0140x c0140x = C0140x.f1887c;
            InterfaceC1292i interfaceC1292i = this.f3434a;
            InterfaceC1292i plus = !((Boolean) interfaceC1292i.fold(bool, c0140x)).booleanValue() ? context.plus(interfaceC1292i) : E.g(context, interfaceC1292i, false);
            if (t6.h.a(plus, context)) {
                r7 = this.f3440d.r(hVar, interfaceC1287d);
                j6.a aVar = j6.a.f14642a;
                if (r7 != aVar) {
                    r7 = c1116i;
                }
                if (r7 != aVar) {
                    return c1116i;
                }
            } else {
                C1288e c1288e = C1288e.f14067a;
                if (t6.h.a(plus.get(c1288e), context.get(c1288e))) {
                    InterfaceC1292i context2 = interfaceC1287d.getContext();
                    if (!(hVar instanceof r)) {
                        hVar = new G6.e(hVar, context2);
                    }
                    r7 = l.b(plus, hVar, I6.a.l(plus), new g(this, null), interfaceC1287d);
                    j6.a aVar2 = j6.a.f14642a;
                    if (r7 != aVar2) {
                        r7 = c1116i;
                    }
                    if (r7 != aVar2) {
                        return c1116i;
                    }
                }
            }
            return r7;
        }
        r7 = super.r(hVar, interfaceC1287d);
        if (r7 != j6.a.f14642a) {
            return c1116i;
        }
        return r7;
    }

    @Override // H6.f
    public final String toString() {
        return this.f3440d + " -> " + super.toString();
    }
}

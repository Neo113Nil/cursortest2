package t4;

import S3.L;
import b4.EnumC0510a;
import p4.AbstractC2282w;
import s4.InterfaceC2368e;
import s4.InterfaceC2369f;

/* loaded from: classes.dex */
public abstract class i extends g {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2368e f19610n;

    public i(InterfaceC2368e interfaceC2368e, a4.h hVar, int i, r4.a aVar) {
        super(hVar, i, aVar);
        this.f19610n = interfaceC2368e;
    }

    @Override // s4.InterfaceC2368e
    public final Object a(InterfaceC2369f interfaceC2369f, a4.c cVar) {
        W3.o oVar = W3.o.f6046a;
        int i = this.f19605l;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        if (i == -3) {
            a4.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            L l5 = new L(9);
            a4.h hVar = this.f19604k;
            a4.h m5 = !((Boolean) hVar.A(l5, bool)).booleanValue() ? context.m(hVar) : AbstractC2282w.h(context, hVar, false);
            if (kotlin.jvm.internal.l.a(m5, context)) {
                Object h3 = h(interfaceC2369f, cVar);
                if (h3 == enumC0510a) {
                    return h3;
                }
            } else {
                a4.d dVar = a4.d.f6648k;
                if (kotlin.jvm.internal.l.a(m5.l(dVar), context.l(dVar))) {
                    a4.h context2 = cVar.getContext();
                    if (!(interfaceC2369f instanceof w) && !(interfaceC2369f instanceof s)) {
                        interfaceC2369f = new H1.q(interfaceC2369f, context2);
                    }
                    Object a5 = c.a(m5, interfaceC2369f, u4.a.k(m5), new h(this, null), cVar);
                    if (a5 == enumC0510a) {
                        return a5;
                    }
                }
            }
        }
        Object e3 = AbstractC2282w.e(new e(interfaceC2369f, this, null), cVar);
        if (e3 != enumC0510a) {
            e3 = oVar;
        }
        return e3 == enumC0510a ? e3 : oVar;
    }

    @Override // t4.g
    public final Object d(r4.o oVar, f fVar) {
        Object h3 = h(new w(oVar), fVar);
        return h3 == EnumC0510a.f7289k ? h3 : W3.o.f6046a;
    }

    public abstract Object h(InterfaceC2369f interfaceC2369f, a4.c cVar);

    @Override // t4.g
    public final String toString() {
        return this.f19610n + " -> " + super.toString();
    }
}

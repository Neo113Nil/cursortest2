package H6;

import D6.C0140x;
import D6.E;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G6.g f3440d;

    public h(G6.g gVar, p065i6.i iVar, int i7, int i8) {
        super(iVar, i7, i8);
        this.f3440d = gVar;
    }

    @Override // H6.f
    public final Object a(F6.p pVar, p065i6.d dVar) {
        Object objR = this.f3440d.r(new r(pVar), dVar);
        j6.a aVar = j6.a.f14648a;
        p044f6.i iVar = p044f6.i.f13014a;
        if (objR != aVar) {
            objR = iVar;
        }
        return objR == aVar ? objR : iVar;
    }

    @Override // H6.f
    public final f b(p065i6.i iVar, int i7, int i8) {
        return new h(this.f3440d, iVar, i7, i8);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // H6.f, G6.g
    public final Object r(G6.h hVar, p065i6.d dVar) throws Throwable {
        Object objR;
        p044f6.i iVar = p044f6.i.f13014a;
        if (this.f3435b == -3) {
            p065i6.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0140x c0140x = C0140x.f1887c;
            p065i6.i iVar2 = this.f3434a;
            p065i6.i iVarPlus = !((Boolean) iVar2.fold(bool, c0140x)).booleanValue() ? context.plus(iVar2) : E.g(context, iVar2, false);
            if (t6.h.a(iVarPlus, context)) {
                objR = this.f3440d.r(hVar, dVar);
                j6.a aVar = j6.a.f14648a;
                if (objR != aVar) {
                    objR = iVar;
                }
                if (objR != aVar) {
                    return iVar;
                }
            } else {
                p065i6.e eVar = p065i6.e.f14073a;
                if (t6.h.a(iVarPlus.get(eVar), context.get(eVar))) {
                    p065i6.i context2 = dVar.getContext();
                    if (!(hVar instanceof r)) {
                        hVar = new G6.e(hVar, context2);
                    }
                    objR = l.b(iVarPlus, hVar, I6.a.l(iVarPlus), new g(this, null), dVar);
                    j6.a aVar2 = j6.a.f14648a;
                    if (objR != aVar2) {
                        objR = iVar;
                    }
                    if (objR != aVar2) {
                        return iVar;
                    }
                } else {
                    objR = super.r(hVar, dVar);
                    if (objR != j6.a.f14648a) {
                        return iVar;
                    }
                }
            }
        } else {
            objR = super.r(hVar, dVar);
            if (objR != j6.a.f14648a) {
                return iVar;
            }
        }
        return objR;
    }

    @Override // H6.f
    public final String toString() {
        return this.f3440d + " -> " + super.toString();
    }
}

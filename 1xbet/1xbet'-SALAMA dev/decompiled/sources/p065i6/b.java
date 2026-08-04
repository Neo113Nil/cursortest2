package p065i6;

import kotlin.jvm.functions.Function2;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14070a;

    public /* synthetic */ b(int i7) {
        this.f14070a = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f14070a) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                h.e(str, "acc");
                h.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                h.e(iVar, "acc");
                h.e(gVar2, "element");
                i iVarMinusKey = iVar.minusKey(gVar2.getKey());
                j jVar = j.f14074a;
                if (iVarMinusKey == jVar) {
                    return gVar2;
                }
                e eVar = e.f14073a;
                f fVar = (f) iVarMinusKey.get(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, iVarMinusKey);
                } else {
                    i iVarMinusKey2 = iVarMinusKey.minusKey(eVar);
                    if (iVarMinusKey2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, iVarMinusKey2));
                }
                return cVar;
        }
    }
}

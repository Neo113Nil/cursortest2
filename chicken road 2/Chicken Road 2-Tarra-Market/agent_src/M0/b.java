package M0;

import U0.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222a;

    public /* synthetic */ b(int i2) {
        this.f222a = i2;
    }

    @Override // U0.p
    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f222a) {
            case 0:
                String acc = (String) obj;
                g gVar = (g) obj2;
                kotlin.jvm.internal.j.e(acc, "acc");
                if (acc.length() == 0) {
                    return gVar.toString();
                }
                return acc + ", " + gVar;
            default:
                i acc2 = (i) obj;
                g gVar2 = (g) obj2;
                kotlin.jvm.internal.j.e(acc2, "acc");
                i g2 = acc2.g(gVar2.getKey());
                j jVar = j.f226a;
                if (g2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f225a;
                f fVar = (f) g2.i(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, g2);
                } else {
                    i g3 = g2.g(eVar);
                    if (g3 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, g3));
                }
                return cVar;
        }
    }
}

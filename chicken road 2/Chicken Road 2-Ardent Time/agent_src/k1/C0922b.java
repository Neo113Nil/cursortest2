package k1;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0922b implements s1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7947a;

    public /* synthetic */ C0922b(int i2) {
        this.f7947a = i2;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        k1.c cVar;
        switch (this.f7947a) {
            case 0:
                java.lang.String acc = (java.lang.String) obj;
                k1.g element = (k1.g) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                k1.i acc2 = (k1.i) obj;
                k1.g element2 = (k1.g) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                k1.i j2 = acc2.j(element2.getKey());
                k1.j jVar = k1.j.f7951a;
                if (j2 == jVar) {
                    return element2;
                }
                k1.e eVar = k1.e.f7950a;
                k1.f fVar = (k1.f) j2.m(eVar);
                if (fVar == null) {
                    cVar = new k1.c(j2, element2);
                } else {
                    k1.i j3 = j2.j(eVar);
                    if (j3 == jVar) {
                        return new k1.c(element2, fVar);
                    }
                    cVar = new k1.c(new k1.c(j3, element2), fVar);
                }
                return cVar;
        }
    }
}

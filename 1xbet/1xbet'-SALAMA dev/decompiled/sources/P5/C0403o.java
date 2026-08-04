package P5;

/* JADX INFO: renamed from: P5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0403o implements G6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.g f5672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p030e0.e f5673c;

    public /* synthetic */ C0403o(G6.g gVar, p030e0.e eVar, int i7) {
        this.f5671a = i7;
        this.f5672b = gVar;
        this.f5673c = eVar;
    }

    @Override // G6.g
    public final Object r(G6.h hVar, p065i6.d dVar) {
        switch (this.f5671a) {
            case 0:
                Object objR = this.f5672b.r(new C0402n(hVar, this.f5673c, 0), dVar);
                return objR == j6.a.f14648a ? objR : p044f6.i.f13014a;
            default:
                Object objR2 = this.f5672b.r(new C0402n(hVar, this.f5673c, 2), dVar);
                return objR2 == j6.a.f14648a ? objR2 : p044f6.i.f13014a;
        }
    }
}

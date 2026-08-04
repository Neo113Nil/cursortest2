package P5;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements G6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.g f5691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p030e0.e f5692c;

    public /* synthetic */ t(G6.g gVar, p030e0.e eVar, int i7) {
        this.f5690a = i7;
        this.f5691b = gVar;
        this.f5692c = eVar;
    }

    @Override // G6.g
    public final Object r(G6.h hVar, p065i6.d dVar) {
        switch (this.f5690a) {
            case 0:
                Object objR = this.f5691b.r(new C0402n(hVar, this.f5692c, 1), dVar);
                return objR == j6.a.f14648a ? objR : p044f6.i.f13014a;
            default:
                Object objR2 = this.f5691b.r(new C0402n(hVar, this.f5692c, 3), dVar);
                return objR2 == j6.a.f14648a ? objR2 : p044f6.i.f13014a;
        }
    }
}

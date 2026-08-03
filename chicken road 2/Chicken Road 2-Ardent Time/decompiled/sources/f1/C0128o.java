package f1;

/* renamed from: f1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128o implements C1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1.d f2859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I.d f2860c;

    public /* synthetic */ C0128o(C1.d dVar, I.d dVar2, int i2) {
        this.f2858a = i2;
        this.f2859b = dVar;
        this.f2860c = dVar2;
    }

    @Override // C1.d
    public final java.lang.Object o(C1.e eVar, k1.d dVar) {
        switch (this.f2858a) {
            case 0:
                java.lang.Object o2 = this.f2859b.o(new f1.C0127n(eVar, this.f2860c, 0), dVar);
                if (o2 != l1.EnumC0927a.f8017a) {
                    break;
                }
                break;
            case 1:
                java.lang.Object o3 = this.f2859b.o(new f1.C0127n(eVar, this.f2860c, 1), dVar);
                if (o3 != l1.EnumC0927a.f8017a) {
                    break;
                }
                break;
            case 2:
                java.lang.Object o4 = this.f2859b.o(new f1.C0127n(eVar, this.f2860c, 2), dVar);
                if (o4 != l1.EnumC0927a.f8017a) {
                    break;
                }
                break;
            default:
                java.lang.Object o5 = this.f2859b.o(new f1.C0127n(eVar, this.f2860c, 3), dVar);
                if (o5 != l1.EnumC0927a.f8017a) {
                    break;
                }
                break;
        }
        return h1.C0177i.f3302a;
    }
}

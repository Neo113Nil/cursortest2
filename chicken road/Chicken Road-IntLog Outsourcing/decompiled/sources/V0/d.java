package V0;

/* loaded from: classes.dex */
public final class d implements R1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3192a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final R1.c f3193b = new R1.c("logSource", B0.o.n(B0.o.m(U1.e.class, new U1.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final R1.c f3194c = new R1.c("logEventDropped", B0.o.n(B0.o.m(U1.e.class, new U1.a(2))));

    @Override // R1.a
    public final void a(Object obj, Object obj2) {
        Y0.e eVar = (Y0.e) obj;
        R1.e eVar2 = (R1.e) obj2;
        eVar2.a(f3193b, eVar.f3679a);
        eVar2.a(f3194c, eVar.f3680b);
    }
}

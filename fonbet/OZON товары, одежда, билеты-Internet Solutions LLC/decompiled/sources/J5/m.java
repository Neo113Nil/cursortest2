package J5;

/* loaded from: classes8.dex */
public final class m implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14049a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.b f14050b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.b f14051c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.l f14052d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14053e;

    public m(String str, I5.b bVar, I5.b bVar2, I5.l lVar, boolean z11) {
        this.f14049a = str;
        this.f14050b = bVar;
        this.f14051c = bVar2;
        this.f14052d = lVar;
        this.f14053e = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.p(gVar, bVar, this);
    }

    public final I5.b b() {
        return this.f14050b;
    }

    public final String c() {
        return this.f14049a;
    }

    public final I5.b d() {
        return this.f14051c;
    }

    public final I5.l e() {
        return this.f14052d;
    }

    public final boolean f() {
        return this.f14053e;
    }
}

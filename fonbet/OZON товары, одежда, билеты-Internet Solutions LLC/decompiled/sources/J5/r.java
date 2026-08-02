package J5;

/* loaded from: classes.dex */
public final class r implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f14067a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14068b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.h f14069c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14070d;

    public r(String str, int i11, I5.h hVar, boolean z11) {
        this.f14067a = str;
        this.f14068b = i11;
        this.f14069c = hVar;
        this.f14070d = z11;
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return new D5.r(gVar, bVar, this);
    }

    public final I5.h b() {
        return this.f14069c;
    }

    public final boolean c() {
        return this.f14070d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f14067a);
        sb2.append(", index=");
        return Ek.a.d(sb2, this.f14068b, '}');
    }
}

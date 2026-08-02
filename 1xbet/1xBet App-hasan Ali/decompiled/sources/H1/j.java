package H1;

/* loaded from: classes.dex */
public final class j extends G1.z {
    public final i f;

    /* renamed from: g, reason: collision with root package name */
    public final X.d f2217g;

    public j(i iVar, String str, X.d dVar) {
        super(iVar, str);
        this.f = iVar;
        this.f2217g = dVar;
    }

    @Override // G1.z
    public final G1.y a() {
        return (h) super.a();
    }

    @Override // G1.z
    public final G1.y b() {
        return new h(this.f, this.f2217g);
    }
}

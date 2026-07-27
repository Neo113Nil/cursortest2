package U1;

/* loaded from: classes.dex */
public final class h implements R1.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3166a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3167b = false;

    /* renamed from: c, reason: collision with root package name */
    public R1.c f3168c;

    /* renamed from: d, reason: collision with root package name */
    public final f f3169d;

    public h(f fVar) {
        this.f3169d = fVar;
    }

    @Override // R1.g
    public final R1.g b(String str) {
        if (this.f3166a) {
            throw new R1.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3166a = true;
        this.f3169d.c(this.f3168c, str, this.f3167b);
        return this;
    }

    @Override // R1.g
    public final R1.g c(boolean z) {
        if (this.f3166a) {
            throw new R1.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3166a = true;
        this.f3169d.b(this.f3168c, z ? 1 : 0, this.f3167b);
        return this;
    }
}

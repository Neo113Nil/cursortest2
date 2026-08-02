package P5;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private float f21873a;

    /* renamed from: b, reason: collision with root package name */
    private float f21874b;

    public d(float f7, float f11) {
        this.f21873a = f7;
        this.f21874b = f11;
    }

    public final boolean a() {
        return this.f21873a == 1.0f && this.f21874b == 1.0f;
    }

    public final float b() {
        return this.f21873a;
    }

    public final float c() {
        return this.f21874b;
    }

    public final void d(float f7, float f11) {
        this.f21873a = f7;
        this.f21874b = f11;
    }

    public final String toString() {
        return this.f21873a + "x" + this.f21874b;
    }

    public d() {
        this(1.0f, 1.0f);
    }
}

package Yf;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final float f34926a;

    /* renamed from: b, reason: collision with root package name */
    private final float f34927b;

    /* renamed from: c, reason: collision with root package name */
    private float f34928c;

    /* renamed from: d, reason: collision with root package name */
    private float f34929d;

    /* renamed from: e, reason: collision with root package name */
    private float f34930e;

    /* renamed from: f, reason: collision with root package name */
    private float f34931f;

    /* renamed from: g, reason: collision with root package name */
    private float f34932g;

    /* renamed from: h, reason: collision with root package name */
    private float f34933h;

    public c(float f7, float f11) {
        this.f34926a = f7;
        this.f34927b = f11;
    }

    public final void a(float f7, float f11) {
        float f12 = this.f34928c;
        float f13 = this.f34929d;
        this.f34928c = f7;
        this.f34929d = f11;
        this.f34930e = f12 - f7;
        this.f34931f = f13 - f11;
        this.f34932g = this.f34926a - f7;
        this.f34933h = this.f34927b - f11;
    }

    public final float b() {
        return this.f34928c;
    }

    public final float c() {
        return this.f34929d;
    }

    public final float d() {
        return this.f34930e;
    }

    public final float e() {
        return this.f34932g;
    }

    public final float f() {
        return this.f34931f;
    }

    public final float g() {
        return this.f34933h;
    }
}

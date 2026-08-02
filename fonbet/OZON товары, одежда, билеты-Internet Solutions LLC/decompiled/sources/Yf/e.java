package Yf;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final float f34939a;

    /* renamed from: b, reason: collision with root package name */
    private final float f34940b;

    /* renamed from: c, reason: collision with root package name */
    private final float f34941c;

    /* renamed from: d, reason: collision with root package name */
    private final float f34942d;

    /* renamed from: e, reason: collision with root package name */
    private final float f34943e;

    public e(float f7, float f11, float f12, float f13) {
        this.f34939a = f7;
        this.f34940b = f11;
        this.f34941c = f12;
        this.f34942d = f13;
        Math.sqrt((f11 * f11) + (f7 * f7));
        this.f34943e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
    }

    public final float a() {
        return this.f34941c;
    }

    public final float b() {
        return this.f34943e;
    }

    public final float c() {
        return this.f34942d;
    }

    public final float d() {
        return this.f34939a;
    }

    public final float e() {
        return this.f34940b;
    }
}

package t;

/* renamed from: t.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2387I {

    /* renamed from: a, reason: collision with root package name */
    public final float f19348a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19349b;

    public C2387I(float f, W0.c cVar) {
        this.f19348a = f;
        float c5 = cVar.c();
        float f5 = AbstractC2388J.f19350a;
        this.f19349b = c5 * 386.0878f * 160.0f * 0.84f;
    }

    public final C2386H a(float f) {
        double b3 = b(f);
        double d5 = AbstractC2388J.f19350a;
        double d6 = d5 - 1.0d;
        return new C2386H(f, (float) (Math.exp((d5 / d6) * b3) * this.f19348a * this.f19349b), (long) (Math.exp(b3 / d6) * 1000.0d));
    }

    public final double b(float f) {
        float[] fArr = AbstractC2390b.f19358a;
        return Math.log((Math.abs(f) * 0.35f) / (this.f19348a * this.f19349b));
    }
}

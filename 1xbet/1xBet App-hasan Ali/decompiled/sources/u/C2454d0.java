package u;

/* renamed from: u.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2454d0 {

    /* renamed from: a, reason: collision with root package name */
    public float f19791a;

    /* renamed from: b, reason: collision with root package name */
    public double f19792b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19793c;

    /* renamed from: d, reason: collision with root package name */
    public double f19794d;

    /* renamed from: e, reason: collision with root package name */
    public double f19795e;
    public double f;

    /* renamed from: g, reason: collision with root package name */
    public float f19796g;

    public final long a(float f, float f5, long j5) {
        double cos;
        double d5;
        if (!this.f19793c) {
            if (this.f19791a == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f6 = this.f19796g;
            double d6 = f6;
            double d7 = d6 * d6;
            if (f6 > 1.0f) {
                double d8 = this.f19792b;
                double d9 = d7 - 1;
                this.f19794d = (Math.sqrt(d9) * d8) + ((-f6) * d8);
                double d10 = -this.f19796g;
                double d11 = this.f19792b;
                this.f19795e = (d10 * d11) - (Math.sqrt(d9) * d11);
            } else if (f6 >= 0.0f && f6 < 1.0f) {
                this.f = Math.sqrt(1 - d7) * this.f19792b;
            }
            this.f19793c = true;
        }
        float f7 = f - this.f19791a;
        double d12 = j5 / 1000.0d;
        float f8 = this.f19796g;
        if (f8 > 1.0f) {
            double d13 = f7;
            double d14 = this.f19795e;
            double d15 = ((d14 * d13) - f5) / (d14 - this.f19794d);
            double d16 = d13 - d15;
            d5 = (Math.exp(this.f19794d * d12) * d15) + (Math.exp(d14 * d12) * d16);
            double d17 = this.f19795e;
            double exp = Math.exp(d17 * d12) * d16 * d17;
            double d18 = this.f19794d;
            cos = (Math.exp(d18 * d12) * d15 * d18) + exp;
        } else if (f8 == 1.0f) {
            double d19 = this.f19792b;
            double d20 = f7;
            double d21 = (d19 * d20) + f5;
            double d22 = (d21 * d12) + d20;
            d5 = Math.exp((-d19) * d12) * d22;
            double exp2 = Math.exp((-this.f19792b) * d12) * d22;
            double d23 = -this.f19792b;
            cos = (exp2 * d23) + (Math.exp(d23 * d12) * d21);
        } else {
            double d24 = 1 / this.f;
            double d25 = this.f19792b;
            double d26 = f7;
            double d27 = ((f8 * d25 * d26) + f5) * d24;
            double exp3 = Math.exp((-f8) * d25 * d12) * ((Math.sin(this.f * d12) * d27) + (Math.cos(this.f * d12) * d26));
            double d28 = this.f19792b;
            double d29 = (-d28) * exp3 * this.f19796g;
            double exp4 = Math.exp((-r7) * d28 * d12);
            double d30 = this.f;
            double sin = Math.sin(d30 * d12) * (-d30) * d26;
            double d31 = this.f;
            cos = (((Math.cos(d31 * d12) * d27 * d31) + sin) * exp4) + d29;
            d5 = exp3;
        }
        return (Float.floatToRawIntBits((float) (d5 + this.f19791a)) << 32) | (Float.floatToRawIntBits((float) cos) & 4294967295L);
    }
}

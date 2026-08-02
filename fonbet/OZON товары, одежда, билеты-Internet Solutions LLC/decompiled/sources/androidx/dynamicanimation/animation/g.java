package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.b;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    double f42674a;

    /* renamed from: b, reason: collision with root package name */
    double f42675b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f42676c;

    /* renamed from: d, reason: collision with root package name */
    private double f42677d;

    /* renamed from: e, reason: collision with root package name */
    private double f42678e;

    /* renamed from: f, reason: collision with root package name */
    private double f42679f;

    /* renamed from: g, reason: collision with root package name */
    private double f42680g;

    /* renamed from: h, reason: collision with root package name */
    private double f42681h;

    /* renamed from: i, reason: collision with root package name */
    private double f42682i;

    /* renamed from: j, reason: collision with root package name */
    private final b.p f42683j;

    public g() {
        this.f42674a = Math.sqrt(1500.0d);
        this.f42675b = 0.5d;
        this.f42676c = false;
        this.f42682i = Double.MAX_VALUE;
        this.f42683j = new b.p();
    }

    public final float a() {
        return (float) this.f42682i;
    }

    public final boolean b(float f7, float f11) {
        return ((double) Math.abs(f11)) < this.f42678e && ((double) Math.abs(f7 - ((float) this.f42682i))) < this.f42677d;
    }

    public final void c(float f7) {
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f42675b = f7;
        this.f42676c = false;
    }

    public final void d(float f7) {
        this.f42682i = f7;
    }

    public final void e(float f7) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f42674a = Math.sqrt(f7);
        this.f42676c = false;
    }

    final void f(double d11) {
        double abs = Math.abs(d11);
        this.f42677d = abs;
        this.f42678e = abs * 62.5d;
    }

    final b.p g(double d11, double d12, long j11) {
        double sin;
        double cos;
        if (!this.f42676c) {
            if (this.f42682i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d13 = this.f42675b;
            if (d13 > 1.0d) {
                double d14 = this.f42674a;
                this.f42679f = (Math.sqrt((d13 * d13) - 1.0d) * d14) + ((-d13) * d14);
                double d15 = this.f42675b;
                double d16 = this.f42674a;
                this.f42680g = ((-d15) * d16) - (Math.sqrt((d15 * d15) - 1.0d) * d16);
            } else if (d13 >= 0.0d && d13 < 1.0d) {
                this.f42681h = Math.sqrt(1.0d - (d13 * d13)) * this.f42674a;
            }
            this.f42676c = true;
        }
        double d17 = j11 / 1000.0d;
        double d18 = d11 - this.f42682i;
        double d19 = this.f42675b;
        if (d19 > 1.0d) {
            double d21 = this.f42680g;
            double d22 = ((d21 * d18) - d12) / (d21 - this.f42679f);
            double d23 = d18 - d22;
            sin = (Math.pow(2.718281828459045d, this.f42679f * d17) * d22) + (Math.pow(2.718281828459045d, d21 * d17) * d23);
            double d24 = this.f42680g;
            double pow = Math.pow(2.718281828459045d, d24 * d17) * d23 * d24;
            double d25 = this.f42679f;
            cos = (Math.pow(2.718281828459045d, d25 * d17) * d22 * d25) + pow;
        } else if (d19 == 1.0d) {
            double d26 = this.f42674a;
            double d27 = (d26 * d18) + d12;
            double d28 = (d27 * d17) + d18;
            double pow2 = Math.pow(2.718281828459045d, (-d26) * d17) * d28;
            double pow3 = Math.pow(2.718281828459045d, (-this.f42674a) * d17) * d28;
            double d29 = -this.f42674a;
            cos = (Math.pow(2.718281828459045d, d29 * d17) * d27) + (pow3 * d29);
            sin = pow2;
        } else {
            double d31 = 1.0d / this.f42681h;
            double d32 = this.f42674a;
            double d33 = ((d19 * d32 * d18) + d12) * d31;
            sin = ((Math.sin(this.f42681h * d17) * d33) + (Math.cos(this.f42681h * d17) * d18)) * Math.pow(2.718281828459045d, (-d19) * d32 * d17);
            double d34 = this.f42674a;
            double d35 = this.f42675b;
            double d36 = (-d34) * sin * d35;
            double pow4 = Math.pow(2.718281828459045d, (-d35) * d34 * d17);
            double d37 = this.f42681h;
            double sin2 = Math.sin(d37 * d17) * (-d37) * d18;
            double d38 = this.f42681h;
            cos = (((Math.cos(d38 * d17) * d33 * d38) + sin2) * pow4) + d36;
        }
        float f7 = (float) (sin + this.f42682i);
        b.p pVar = this.f42683j;
        pVar.f42664a = f7;
        pVar.f42665b = (float) cos;
        return pVar;
    }

    public g(float f7) {
        this.f42674a = Math.sqrt(1500.0d);
        this.f42675b = 0.5d;
        this.f42676c = false;
        this.f42683j = new b.p();
        this.f42682i = f7;
    }
}

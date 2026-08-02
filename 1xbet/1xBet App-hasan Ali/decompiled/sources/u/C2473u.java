package u;

import n.AbstractC2107A;

/* renamed from: u.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2473u implements InterfaceC2477y {

    /* renamed from: a, reason: collision with root package name */
    public final float f19947a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19948b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19949c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19950d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19951e;

    public C2473u(float f, float f5, float f6) {
        int A3;
        this.f19947a = f;
        this.f19948b = f5;
        this.f19949c = f6;
        if (Float.isNaN(f) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(1.0f)) {
            AbstractC2445P.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f5 + ", " + f6 + ", 1.0.");
        }
        float[] fArr = new float[5];
        float f7 = (f5 - 0.0f) * 3.0f;
        float f8 = (1.0f - f5) * 3.0f;
        double d5 = f7;
        double d6 = f8;
        double d7 = 0.0f;
        double d8 = d6 * 2.0d;
        double d9 = (d5 - d8) + d7;
        if (d9 == 0.0d) {
            A3 = d6 == d7 ? 0 : i0.F.A((float) ((d8 - d7) / (d8 - (d7 * 2.0d))), fArr, 0);
        } else {
            double d10 = -Math.sqrt((d6 * d6) - (d7 * d5));
            double d11 = (-d5) + d6;
            int A5 = i0.F.A((float) ((-(d10 + d11)) / d9), fArr, 0);
            A3 = i0.F.A((float) ((d10 - d11) / d9), fArr, A5) + A5;
            if (A3 > 1) {
                float f9 = fArr[0];
                float f10 = fArr[1];
                if (f9 > f10) {
                    fArr[0] = f10;
                    fArr[1] = f9;
                } else if (f9 == f10) {
                    A3--;
                }
            }
        }
        float f11 = (f8 - f7) * 2.0f;
        int A6 = i0.F.A((-f11) / (((0.0f - f8) * 2.0f) - f11), fArr, A3) + A3;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i = 0; i < A6; i++) {
            float f12 = fArr[i];
            float f13 = (((((((((f5 - 1.0f) * 3.0f) + 1.0f) - 0.0f) * f12) + (((1.0f - (f5 * 2.0f)) + 0.0f) * 3.0f)) * f12) + f7) * f12) + 0.0f;
            min = Math.min(min, f13);
            max = Math.max(max, f13);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f19950d = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f19951e = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f5, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0222, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ad, code lost:
    
        if (java.lang.Math.abs(r16 - r2) > 1.05E-6f) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x024c  */
    @Override // u.InterfaceC2477y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        boolean isNaN;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f5 = this.f19947a;
        float f6 = this.f19949c;
        float f7 = f6 - f;
        double d5 = 0.0f - f;
        float f8 = 0.0f;
        double d6 = ((d5 - ((f5 - f) * 2.0d)) + f7) * 3.0d;
        double d7 = (r6 - r4) * 3.0d;
        double d8 = ((r6 - f7) * 3.0d) + (-r4) + (1.0f - f);
        float f9 = Float.NaN;
        if (Math.abs(d8 - 0.0d) >= 1.0E-7d) {
            double d9 = d6 / d8;
            double d10 = d7 / d8;
            double d11 = d5 / d8;
            double d12 = ((d10 * 3.0d) - (d9 * d9)) / 9.0d;
            double d13 = ((d11 * 27.0d) + ((((2.0d * d9) * d9) * d9) - ((9.0d * d9) * d10))) / 54.0d;
            double d14 = d12 * d12 * d12;
            double d15 = (d13 * d13) + d14;
            double d16 = d9 / 3.0d;
            if (d15 < 0.0d) {
                double sqrt = Math.sqrt(-d14);
                double d17 = (-d13) / sqrt;
                if (d17 < -1.0d) {
                    d17 = -1.0d;
                }
                if (d17 > 1.0d) {
                    d17 = 1.0d;
                }
                double acos = Math.acos(d17);
                double q5 = G4.d.q((float) sqrt) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * q5) - d16);
                float f10 = cos < 0.0f ? 0.0f : cos;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - cos) > 1.05E-6f) {
                    f10 = Float.NaN;
                }
                if (Float.isNaN(f10)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * q5) - d16);
                    f10 = cos2 < 0.0f ? 0.0f : cos2;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (Math.abs(f10 - cos2) > 1.05E-6f) {
                        f10 = Float.NaN;
                    }
                    if (Float.isNaN(f10)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * q5) - d16);
                        if (cos3 >= 0.0f) {
                            f8 = cos3;
                        }
                        if (f8 > 1.0f) {
                            f8 = 1.0f;
                        }
                    }
                }
                f9 = f10;
                isNaN = Float.isNaN(f9);
                float f11 = this.f19948b;
                if (isNaN) {
                }
            } else if (d15 == 0.0d) {
                float f12 = -G4.d.q((float) d13);
                float f13 = (float) d16;
                float f14 = (f12 * 2.0f) - f13;
                float f15 = f14 < 0.0f ? 0.0f : f14;
                if (f15 > 1.0f) {
                    f15 = 1.0f;
                }
                if (Math.abs(f15 - f14) > 1.05E-6f) {
                    f15 = Float.NaN;
                }
                if (Float.isNaN(f15)) {
                    float f16 = (-f12) - f13;
                    if (f16 >= 0.0f) {
                        f8 = f16;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                } else {
                    f9 = f15;
                }
                isNaN = Float.isNaN(f9);
                float f112 = this.f19948b;
                if (isNaN) {
                }
            } else {
                double sqrt2 = Math.sqrt(d15);
                float q6 = (float) ((G4.d.q((float) ((-d13) + sqrt2)) - G4.d.q((float) (d13 + sqrt2))) - d16);
                if (q6 >= 0.0f) {
                    f8 = q6;
                }
                if (f8 > 1.0f) {
                    f8 = 1.0f;
                }
            }
        } else {
            if (Math.abs(d6 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d7 - 0.0d) >= 1.0E-7d) {
                    float f17 = (float) ((-d5) / d7);
                    if (f17 >= 0.0f) {
                        f8 = f17;
                    }
                    if (f8 > 1.0f) {
                        f8 = 1.0f;
                    }
                }
                isNaN = Float.isNaN(f9);
                float f1122 = this.f19948b;
                if (isNaN) {
                    float f18 = ((((((f1122 - 1.0f) + 0.33333334f) * f9) + (1.0f - (2.0f * f1122))) * f9) + f1122) * 3.0f * f9;
                    float f19 = this.f19950d;
                    if (f18 < f19) {
                        f18 = f19;
                    }
                    float f20 = this.f19951e;
                    return f18 > f20 ? f20 : f18;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f5 + ", " + f1122 + ", " + f6 + ", 1.0) has no solution at " + f);
            }
            double sqrt3 = Math.sqrt((d7 * d7) - ((4.0d * d6) * d5));
            double d18 = d6 * 2.0d;
            float f21 = (float) ((sqrt3 - d7) / d18);
            float f22 = f21 < 0.0f ? 0.0f : f21;
            if (f22 > 1.0f) {
                f22 = 1.0f;
            }
            if (Math.abs(f22 - f21) > 1.05E-6f) {
                f22 = Float.NaN;
            }
            if (Float.isNaN(f22)) {
                float f23 = (float) (((-d7) - sqrt3) / d18);
                if (f23 >= 0.0f) {
                    f8 = f23;
                }
                if (f8 > 1.0f) {
                    f8 = 1.0f;
                }
            } else {
                f9 = f22;
            }
            isNaN = Float.isNaN(f9);
            float f11222 = this.f19948b;
            if (isNaN) {
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2473u)) {
            return false;
        }
        C2473u c2473u = (C2473u) obj;
        return this.f19947a == c2473u.f19947a && this.f19948b == c2473u.f19948b && this.f19949c == c2473u.f19949c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + AbstractC2107A.n(this.f19949c, AbstractC2107A.n(this.f19948b, Float.floatToIntBits(this.f19947a) * 31, 31), 31);
    }

    public final String toString() {
        return "CubicBezierEasing(a=" + this.f19947a + ", b=" + this.f19948b + ", c=" + this.f19949c + ", d=1.0)";
    }
}

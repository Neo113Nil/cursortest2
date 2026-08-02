package j0;

import i0.F;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i5, long j5, String str) {
        super(i, j5, str);
        this.f17450d = i5;
    }

    @Override // j0.c
    public final float a(int i) {
        switch (this.f17450d) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // j0.c
    public final float b(int i) {
        switch (this.f17450d) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // j0.c
    public final long d(float f, float f5, float f6) {
        switch (this.f17450d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f5 < -128.0f) {
                    f5 = -128.0f;
                }
                if (f5 > 128.0f) {
                    f5 = 128.0f;
                }
                float f7 = (f + 16.0f) / 116.0f;
                float f8 = (f5 * 0.002f) + f7;
                float f9 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
                float f10 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
                float f11 = f9 * j.f17449e[0];
                return (Float.floatToRawIntBits(f10 * r5[1]) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f5 <= 2.0f ? f5 : 2.0f) & 4294967295L);
        }
    }

    @Override // j0.c
    public final float e(float f, float f5, float f6) {
        switch (this.f17450d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f6 < -128.0f) {
                    f6 = -128.0f;
                }
                if (f6 > 128.0f) {
                    f6 = 128.0f;
                }
                float f7 = ((f + 16.0f) / 116.0f) - (f6 * 0.005f);
                return (f7 > 0.20689656f ? f7 * f7 * f7 : 0.12841855f * (f7 - 0.13793103f)) * j.f17449e[2];
            default:
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                if (f6 > 2.0f) {
                    return 2.0f;
                }
                return f6;
        }
    }

    @Override // j0.c
    public final long f(float f, float f5, float f6, float f7, c cVar) {
        switch (this.f17450d) {
            case 0:
                float[] fArr = j.f17449e;
                float f8 = f / fArr[0];
                float f9 = f5 / fArr[1];
                float f10 = f6 / fArr[2];
                float cbrt = f8 > 0.008856452f ? (float) Math.cbrt(f8) : (f8 * 7.787037f) + 0.13793103f;
                float cbrt2 = f9 > 0.008856452f ? (float) Math.cbrt(f9) : (f9 * 7.787037f) + 0.13793103f;
                float f11 = (116.0f * cbrt2) - 16.0f;
                float f12 = (cbrt - cbrt2) * 500.0f;
                float cbrt3 = (cbrt2 - (f10 > 0.008856452f ? (float) Math.cbrt(f10) : (f10 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f11 > 100.0f) {
                    f11 = 100.0f;
                }
                if (f12 < -128.0f) {
                    f12 = -128.0f;
                }
                if (f12 > 128.0f) {
                    f12 = 128.0f;
                }
                if (cbrt3 < -128.0f) {
                    cbrt3 = -128.0f;
                }
                return F.b(f11, f12, cbrt3 <= 128.0f ? cbrt3 : 128.0f, f7, cVar);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f5 < -2.0f) {
                    f5 = -2.0f;
                }
                if (f5 > 2.0f) {
                    f5 = 2.0f;
                }
                if (f6 < -2.0f) {
                    f6 = -2.0f;
                }
                return F.b(f, f5, f6 <= 2.0f ? f6 : 2.0f, f7, cVar);
        }
    }
}

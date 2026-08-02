package M;

import P.AbstractC0329z;
import P.C0315s;
import P.C0322v0;
import a.AbstractC0444a;
import androidx.compose.foundation.BorderModifierNodeElement;
import i4.InterfaceC2015a;
import v.C2526v;
import y.C2654j;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P.D f3440a = new P.D(C0250v.f3561v);

    public static final void a(b0.p pVar, D.d dVar, long j5, float f, float f5, C2526v c2526v, i4.e eVar, C0315s c0315s, int i, int i5) {
        if ((i5 & 1) != 0) {
            pVar = b0.m.f7161k;
        }
        b0.p pVar2 = pVar;
        long a5 = AbstractC0251w.a(j5, c0315s);
        float f6 = (i5 & 16) != 0 ? 0 : f;
        float f7 = (i5 & 32) != 0 ? 0 : f5;
        C2526v c2526v2 = (i5 & 64) != 0 ? null : c2526v;
        P.D d5 = f3440a;
        float f8 = ((W0.f) c0315s.j(d5)).f6006k + f6;
        AbstractC0329z.b(new C0322v0[]{AbstractC0253y.f3582a.a(new i0.p(a5)), d5.a(new W0.f(f8))}, X.e.d(-70914509, new n0(pVar2, dVar, j5, f8, c2526v2, f7, eVar), c0315s), c0315s, 56);
    }

    public static final void b(InterfaceC2015a interfaceC2015a, b0.p pVar, boolean z3, i0.J j5, long j6, long j7, float f, C2526v c2526v, C2654j c2654j, X.d dVar, C0315s c0315s, int i, int i5) {
        long a5 = (i5 & 32) != 0 ? AbstractC0251w.a(j6, c0315s) : j7;
        P.D d5 = f3440a;
        float f5 = ((W0.f) c0315s.j(d5)).f6006k + 0;
        AbstractC0329z.b(new C0322v0[]{AbstractC0253y.f3582a.a(new i0.p(a5)), d5.a(new W0.f(f5))}, X.e.d(1279702876, new o0(pVar, j5, j6, f5, c2526v, c2654j, z3, interfaceC2015a, f, dVar), c0315s), c0315s, 56);
    }

    public static final b0.p c(b0.p pVar, i0.J j5, long j6, C2526v c2526v, float f) {
        b0.p pVar2 = b0.m.f7161k;
        b0.p c5 = pVar.c(f > 0.0f ? androidx.compose.ui.graphics.a.b(pVar2, f, j5, 124895) : pVar2);
        if (c2526v != null) {
            pVar2 = new BorderModifierNodeElement(c2526v.f20320a, c2526v.f20321b, j5);
        }
        return AbstractC0444a.n(androidx.compose.foundation.a.b(c5.c(pVar2), j6, j5), j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long d(long j5, float f, C0315s c0315s) {
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0249u c0249u = (C0249u) c0315s.j(AbstractC0251w.f3578a);
        boolean booleanValue = ((Boolean) c0315s.j(AbstractC0251w.f3579b)).booleanValue();
        if (!i0.p.c(j5, c0249u.f3540p) || !booleanValue) {
            return j5;
        }
        boolean a5 = W0.f.a(f, 0);
        long j6 = c0249u.f3540p;
        if (a5) {
            return j6;
        }
        long a6 = i0.p.a(i0.p.b(((((float) Math.log(1 + f)) * 4.5f) + 2.0f) / 100.0f, c0249u.f3544t), i0.p.f(j6));
        float d5 = i0.p.d(j6);
        float d6 = i0.p.d(a6);
        float f5 = 1.0f - d6;
        float f6 = (d5 * f5) + d6;
        float h3 = f6 == 0.0f ? 0.0f : (((i0.p.h(j6) * d5) * f5) + (i0.p.h(a6) * d6)) / f6;
        float g5 = f6 == 0.0f ? 0.0f : (((i0.p.g(j6) * d5) * f5) + (i0.p.g(a6) * d6)) / f6;
        float e3 = f6 == 0.0f ? 0.0f : (((i0.p.e(j6) * d5) * f5) + (i0.p.e(a6) * d6)) / f6;
        if (i0.p.f(j6).c()) {
            long j7 = (((int) ((e3 * 255.0f) + 0.5f)) | (((((int) ((f6 * 255.0f) + 0.5f)) << 24) | (((int) ((h3 * 255.0f) + 0.5f)) << 16)) | (((int) ((g5 * 255.0f) + 0.5f)) << 8))) << 32;
            int i15 = i0.p.f17294h;
            return j7;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(h3);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            i5 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i5 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i6 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s2 = (short) i6;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(g5);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i7 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i7 != 255) {
                        i9 = i21 != 0 ? 512 : 0;
                        i8 = 31;
                    } else {
                        i8 = i7 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                        } else if (i8 > 0) {
                            i9 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i10 = (((i8 << 10) | i9) + 1) | (i20 << 15);
                                short s5 = (short) i10;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(e3);
                                int i22 = floatToRawIntBits3 >>> 31;
                                i11 = (floatToRawIntBits3 >>> 23) & 255;
                                int i23 = 8388607 & floatToRawIntBits3;
                                if (i11 == 255) {
                                    i12 = i23 != 0 ? 512 : 0;
                                    i13 = 31;
                                } else {
                                    int i24 = i11 - 112;
                                    if (i24 >= 31) {
                                        i13 = 49;
                                        i12 = 0;
                                    } else if (i24 <= 0) {
                                        if (i24 >= -10) {
                                            int i25 = (i23 | 8388608) >> (1 - i24);
                                            if ((i25 & 4096) != 0) {
                                                i25 += 8192;
                                            }
                                            i12 = i25 >> 13;
                                        } else {
                                            i12 = 0;
                                        }
                                        i13 = 0;
                                    } else {
                                        int i26 = i23 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i14 = (((i24 << 10) | i26) + 1) | (i22 << 15);
                                            long max = ((((short) i14) & 65535) << 16) | ((s2 & 65535) << 48) | ((s5 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f17414c & 63);
                                            int i27 = i0.p.f17294h;
                                            return max;
                                        }
                                        i12 = i26;
                                        i13 = i24;
                                    }
                                }
                                i14 = i12 | (i22 << 15) | (i13 << 10);
                                long max2 = ((((short) i14) & 65535) << 16) | ((s2 & 65535) << 48) | ((s5 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f17414c & 63);
                                int i272 = i0.p.f17294h;
                                return max2;
                            }
                        } else if (i8 >= -10) {
                            int i28 = (i21 | 8388608) >> (1 - i8);
                            if ((i28 & 4096) != 0) {
                                i28 += 8192;
                            }
                            i9 = i28 >> 13;
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                        i9 = 0;
                    }
                    i10 = (i8 << 10) | (i20 << 15) | i9;
                    short s52 = (short) i10;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(e3);
                    int i222 = floatToRawIntBits32 >>> 31;
                    i11 = (floatToRawIntBits32 >>> 23) & 255;
                    int i232 = 8388607 & floatToRawIntBits32;
                    if (i11 == 255) {
                    }
                    i14 = i12 | (i222 << 15) | (i13 << 10);
                    long max22 = ((((short) i14) & 65535) << 16) | ((s2 & 65535) << 48) | ((s52 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f17414c & 63);
                    int i2722 = i0.p.f17294h;
                    return max22;
                }
                i5 = i19;
            } else if (i >= -10) {
                int i29 = (i18 | 8388608) >> (1 - i);
                if ((i29 & 4096) != 0) {
                    i29 += 8192;
                }
                i5 = i29 >> 13;
                i = 0;
            } else {
                i5 = 0;
                i = 0;
            }
        }
        i6 = i5 | (i16 << 15) | (i << 10);
        short s22 = (short) i6;
        int floatToRawIntBits22 = Float.floatToRawIntBits(g5);
        int i202 = floatToRawIntBits22 >>> 31;
        i7 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i7 != 255) {
        }
        i10 = (i8 << 10) | (i202 << 15) | i9;
        short s522 = (short) i10;
        int floatToRawIntBits322 = Float.floatToRawIntBits(e3);
        int i2222 = floatToRawIntBits322 >>> 31;
        i11 = (floatToRawIntBits322 >>> 23) & 255;
        int i2322 = 8388607 & floatToRawIntBits322;
        if (i11 == 255) {
        }
        i14 = i12 | (i2222 << 15) | (i13 << 10);
        long max222 = ((((short) i14) & 65535) << 16) | ((s22 & 65535) << 48) | ((s522 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f17414c & 63);
        int i27222 = i0.p.f17294h;
        return max222;
    }
}

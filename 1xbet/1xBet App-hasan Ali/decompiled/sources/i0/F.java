package i0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import h0.C1989c;
import h0.C1990d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k0.C2027g;
import k0.InterfaceC2025e;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final E f17222a = new E();

    /* renamed from: b, reason: collision with root package name */
    public static Method f17223b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f17224c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f17225d;

    public static final int A(float f, float[] fArr, int i) {
        float f5 = f >= 0.0f ? f : 0.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (Math.abs(f5 - f) > 1.05E-6f) {
            f5 = Float.NaN;
        }
        fArr[i] = f5;
        return !Float.isNaN(f5) ? 1 : 0;
    }

    public static final C1997b a(C2001f c2001f) {
        Canvas canvas = AbstractC1998c.f17269a;
        C1997b c1997b = new C1997b();
        c1997b.f17266a = new Canvas(i(c2001f));
        return c1997b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f, float f5, float f6, float f7, j0.c cVar) {
        int i;
        int i5;
        int i6;
        float b3;
        float a5;
        int i7;
        int i8;
        int i9;
        int i10;
        float b5;
        float a6;
        int i11;
        int i12;
        int i13;
        int i14 = 31;
        if (cVar.c()) {
            float f8 = f7 < 0.0f ? 0.0f : f7;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i15 = ((int) ((f8 * 255.0f) + 0.5f)) << 24;
            float f9 = f < 0.0f ? 0.0f : f;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i16 = i15 | (((int) ((f9 * 255.0f) + 0.5f)) << 16);
            float f10 = f5 < 0.0f ? 0.0f : f5;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            int i17 = i16 | (((int) ((f10 * 255.0f) + 0.5f)) << 8);
            long j5 = (i17 | ((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i18 = p.f17294h;
            return j5;
        }
        int i19 = j0.b.f17411e;
        if (((int) (cVar.f17413b >> 32)) != 3) {
            x.a("Color only works with ColorSpaces with 3 components");
        }
        int i20 = cVar.f17414c;
        if (i20 == -1) {
            x.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b6 = cVar.b(0);
        float a7 = cVar.a(0);
        if (f >= b6) {
            b6 = f;
        }
        if (b6 <= a7) {
            a7 = b6;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a7);
        int i21 = floatToRawIntBits >>> 31;
        int i22 = (floatToRawIntBits >>> 23) & 255;
        int i23 = floatToRawIntBits & 8388607;
        if (i22 == 255) {
            i5 = i23 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i22 - 112;
            if (i >= 31) {
                i = 49;
                i5 = 0;
            } else if (i <= 0) {
                if (i >= -10) {
                    int i24 = (i23 | 8388608) >> (1 - i);
                    if ((i24 & 4096) != 0) {
                        i24 += 8192;
                    }
                    i5 = i24 >> 13;
                } else {
                    i5 = 0;
                }
                i = 0;
            } else {
                int i25 = i23 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i6 = (((i << 10) | i25) + 1) | (i21 << 15);
                    short s2 = (short) i6;
                    b3 = cVar.b(1);
                    a5 = cVar.a(1);
                    if (f5 >= b3) {
                        b3 = f5;
                    }
                    if (b3 <= a5) {
                        a5 = b3;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a5);
                    int i26 = floatToRawIntBits2 >>> 31;
                    i7 = (floatToRawIntBits2 >>> 23) & 255;
                    int i27 = floatToRawIntBits2 & 8388607;
                    if (i7 != 255) {
                        i9 = i27 != 0 ? 512 : 0;
                        i8 = 31;
                    } else {
                        i8 = i7 - 112;
                        if (i8 >= 31) {
                            i8 = 49;
                            i9 = 0;
                        } else if (i8 <= 0) {
                            if (i8 >= -10) {
                                int i28 = (i27 | 8388608) >> (1 - i8);
                                if ((i28 & 4096) != 0) {
                                    i28 += 8192;
                                }
                                i9 = i28 >> 13;
                            } else {
                                i9 = 0;
                            }
                            i8 = 0;
                        } else {
                            int i29 = i27 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i10 = (((i8 << 10) | i29) + 1) | (i26 << 15);
                                short s5 = (short) i10;
                                b5 = cVar.b(2);
                                a6 = cVar.a(2);
                                if (f6 >= b5) {
                                    b5 = f6;
                                }
                                if (b5 <= a6) {
                                    a6 = b5;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a6);
                                int i30 = floatToRawIntBits3 >>> 31;
                                i11 = (floatToRawIntBits3 >>> 23) & 255;
                                int i31 = 8388607 & floatToRawIntBits3;
                                if (i11 == 255) {
                                    if (i31 != 0) {
                                        i12 = 512;
                                        i13 = (i30 << 15) | (i14 << 10) | i12;
                                        short s6 = (short) i13;
                                        long j6 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s2 & 65535) << 48) | ((s5 & 65535) << 32) | ((65535 & s6) << 16) | (i20 & 63);
                                        int i32 = p.f17294h;
                                        return j6;
                                    }
                                    i12 = 0;
                                    i13 = (i30 << 15) | (i14 << 10) | i12;
                                    short s62 = (short) i13;
                                    if (f7 >= 0.0f) {
                                    }
                                    long j62 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s2 & 65535) << 48) | ((s5 & 65535) << 32) | ((65535 & s62) << 16) | (i20 & 63);
                                    int i322 = p.f17294h;
                                    return j62;
                                }
                                int i33 = i11 - 112;
                                if (i33 < 31) {
                                    if (i33 > 0) {
                                        i12 = i31 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i13 = (((i33 << 10) | i12) + 1) | (i30 << 15);
                                            short s622 = (short) i13;
                                            if (f7 >= 0.0f) {
                                            }
                                            long j622 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s2 & 65535) << 48) | ((s5 & 65535) << 32) | ((65535 & s622) << 16) | (i20 & 63);
                                            int i3222 = p.f17294h;
                                            return j622;
                                        }
                                        i14 = i33;
                                    } else if (i33 >= -10) {
                                        int i34 = (i31 | 8388608) >> (1 - i33);
                                        if ((i34 & 4096) != 0) {
                                            i34 += 8192;
                                        }
                                        i12 = i34 >> 13;
                                        i14 = 0;
                                    } else {
                                        i14 = 0;
                                    }
                                    i13 = (i30 << 15) | (i14 << 10) | i12;
                                    short s6222 = (short) i13;
                                    if (f7 >= 0.0f) {
                                    }
                                    long j6222 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s2 & 65535) << 48) | ((s5 & 65535) << 32) | ((65535 & s6222) << 16) | (i20 & 63);
                                    int i32222 = p.f17294h;
                                    return j6222;
                                }
                                i14 = 49;
                                i12 = 0;
                                i13 = (i30 << 15) | (i14 << 10) | i12;
                                short s62222 = (short) i13;
                                if (f7 >= 0.0f) {
                                }
                                long j62222 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s2 & 65535) << 48) | ((s5 & 65535) << 32) | ((65535 & s62222) << 16) | (i20 & 63);
                                int i322222 = p.f17294h;
                                return j62222;
                            }
                            i9 = i29;
                        }
                    }
                    i10 = i9 | (i26 << 15) | (i8 << 10);
                    short s52 = (short) i10;
                    b5 = cVar.b(2);
                    a6 = cVar.a(2);
                    if (f6 >= b5) {
                    }
                    if (b5 <= a6) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a6);
                    int i302 = floatToRawIntBits32 >>> 31;
                    i11 = (floatToRawIntBits32 >>> 23) & 255;
                    int i312 = 8388607 & floatToRawIntBits32;
                    if (i11 == 255) {
                    }
                } else {
                    i5 = i25;
                }
            }
        }
        i6 = i5 | (i21 << 15) | (i << 10);
        short s22 = (short) i6;
        b3 = cVar.b(1);
        a5 = cVar.a(1);
        if (f5 >= b3) {
        }
        if (b3 <= a5) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a5);
        int i262 = floatToRawIntBits22 >>> 31;
        i7 = (floatToRawIntBits22 >>> 23) & 255;
        int i272 = floatToRawIntBits22 & 8388607;
        if (i7 != 255) {
        }
        i10 = i9 | (i262 << 15) | (i8 << 10);
        short s522 = (short) i10;
        b5 = cVar.b(2);
        a6 = cVar.a(2);
        if (f6 >= b5) {
        }
        if (b5 <= a6) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a6);
        int i3022 = floatToRawIntBits322 >>> 31;
        i11 = (floatToRawIntBits322 >>> 23) & 255;
        int i3122 = 8388607 & floatToRawIntBits322;
        if (i11 == 255) {
        }
    }

    public static final long c(int i) {
        long j5 = i << 32;
        int i5 = p.f17294h;
        return j5;
    }

    public static final long d(long j5) {
        long j6 = j5 << 32;
        int i = p.f17294h;
        return j6;
    }

    public static long e(int i, int i5, int i6) {
        return c(((i & 255) << 16) | (-16777216) | ((i5 & 255) << 8) | (i6 & 255));
    }

    public static C2001f f(int i, int i5, int i6) {
        Bitmap createBitmap;
        j0.q qVar = j0.d.f17419e;
        Bitmap.Config v4 = v(i6);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i5, v(i6), true, s.a(qVar));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i5, v4);
            createBitmap.setHasAlpha(true);
        }
        return new C2001f(createBitmap);
    }

    public static final J2.b g() {
        return new J2.b(new Paint(7));
    }

    public static final Bitmap i(C2001f c2001f) {
        if (c2001f instanceof C2001f) {
            return c2001f.f17276a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static void j(InterfaceC2025e interfaceC2025e, D d5, long j5) {
        C2027g c2027g = C2027g.f17547b;
        if (d5 instanceof C1995B) {
            C1989c c1989c = ((C1995B) d5).f17219a;
            interfaceC2025e.H(j5, (4294967295L & Float.floatToRawIntBits(c1989c.f17194b)) | (Float.floatToRawIntBits(c1989c.f17193a) << 32), p(c1989c), 3);
            return;
        }
        if (!(d5 instanceof C)) {
            if (!(d5 instanceof C1994A)) {
                throw new D2.e();
            }
            interfaceC2025e.d0(((C1994A) d5).f17218a, j5, c2027g);
            return;
        }
        C c5 = (C) d5;
        C2003h c2003h = c5.f17221b;
        if (c2003h != null) {
            interfaceC2025e.d0(c2003h, j5, c2027g);
            return;
        }
        C1990d c1990d = c5.f17220a;
        float intBitsToFloat = Float.intBitsToFloat((int) (c1990d.f17203h >> 32));
        long floatToRawIntBits = (Float.floatToRawIntBits(c1990d.f17197a) << 32) | (Float.floatToRawIntBits(c1990d.f17198b) & 4294967295L);
        float b3 = c1990d.b();
        float a5 = c1990d.a();
        interfaceC2025e.w(j5, floatToRawIntBits, (Float.floatToRawIntBits(b3) << 32) | (Float.floatToRawIntBits(a5) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public static void k(Canvas canvas, boolean z3) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z3) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f17225d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f17223b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f17224c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f17223b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f17224c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f17223b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f17224c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f17225d = true;
        }
        if (z3) {
            try {
                Method method4 = f17223b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z3 || (method = f17224c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean l(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final float m(long j5) {
        j0.c f = p.f(j5);
        if (!j0.b.a(f.f17413b, j0.b.f17407a)) {
            x.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) j0.b.b(f.f17413b)));
        }
        double h3 = p.h(j5);
        j0.m mVar = ((j0.q) f).f17473p;
        double b3 = mVar.b(h3);
        float b5 = (float) ((mVar.b(p.e(j5)) * 0.0722d) + (mVar.b(p.g(j5)) * 0.7152d) + (b3 * 0.2126d));
        if (b5 < 0.0f) {
            b5 = 0.0f;
        }
        if (b5 > 1.0f) {
            return 1.0f;
        }
        return b5;
    }

    public static final void n(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[15];
        fArr[0] = f;
        fArr[1] = f8;
        fArr[2] = f13;
        fArr[3] = f5;
        fArr[4] = f9;
        fArr[5] = f14;
        fArr[6] = f7;
        fArr[7] = f11;
        fArr[8] = f15;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[3] = f7;
        fArr[4] = f8;
        fArr[5] = f9;
        fArr[6] = f10;
        fArr[7] = f11;
        fArr[8] = f12;
    }

    public static final void o(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        fArr[0] = f;
        fArr[1] = f7;
        fArr[2] = 0.0f;
        fArr[3] = f10;
        fArr[4] = f5;
        fArr[5] = f8;
        fArr[6] = 0.0f;
        fArr[7] = f11;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f6;
        fArr[13] = f9;
        fArr[14] = 0.0f;
        fArr[15] = f12;
    }

    public static final long p(C1989c c1989c) {
        float f = c1989c.f17195c - c1989c.f17193a;
        float f5 = c1989c.f17196d - c1989c.f17194b;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
    }

    public static final BlendMode q(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect r(W0.k kVar) {
        return new Rect(kVar.f6011a, kVar.f6012b, kVar.f6013c, kVar.f6014d);
    }

    public static final Rect s(C1989c c1989c) {
        return new Rect((int) c1989c.f17193a, (int) c1989c.f17194b, (int) c1989c.f17195c, (int) c1989c.f17196d);
    }

    public static final RectF t(C1989c c1989c) {
        return new RectF(c1989c.f17193a, c1989c.f17194b, c1989c.f17195c, c1989c.f17196d);
    }

    public static final int u(long j5) {
        float[] fArr = j0.d.f17415a;
        return (int) (p.a(j5, j0.d.f17419e) >>> 32);
    }

    public static final Bitmap.Config v(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i5 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final C1989c w(Rect rect) {
        return new C1989c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C1989c x(RectF rectF) {
        return new C1989c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode y(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String z(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public abstract void h(float f, long j5, J2.b bVar);
}

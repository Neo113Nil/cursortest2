package com.facebook.appevents.ml;

import com.facebook.appevents.ml.a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    static {
        new g();
    }

    @JvmStatic
    public static final void a(a x, a b) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(b, "b");
            int[] iArr = x.a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            float[] fArr = x.c;
            float[] fArr2 = b.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = (i5 * i3) + (i4 * i2 * i3) + i6;
                        fArr[i7] = fArr[i7] + fArr2[i6];
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
        }
    }

    @JvmStatic
    public static final a b(a[] tensors) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int i = tensors[0].a[0];
            int i2 = 0;
            for (a aVar : tensors) {
                i2 += aVar.a[1];
            }
            a aVar2 = new a(new int[]{i, i2});
            float[] fArr = aVar2.c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (a aVar3 : tensors) {
                    float[] fArr2 = aVar3.c;
                    int i5 = aVar3.a[1];
                    System.arraycopy(fArr2, i3 * i5, fArr, i4, i5);
                    i4 += i5;
                }
            }
            return aVar2;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }

    @JvmStatic
    public static final a c(a x, a w) {
        a aVar;
        a aVar2 = null;
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(w, "w");
            int[] iArr = x.a;
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int[] iArr2 = w.a;
            int i5 = iArr2[0];
            int i6 = (i3 - i5) + 1;
            int i7 = iArr2[2];
            a aVar3 = new a(new int[]{i2, i6, i7});
            float[] fArr = x.c;
            float[] fArr2 = aVar3.c;
            float[] fArr3 = w.c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i;
                while (i9 < i7) {
                    int i10 = i;
                    while (i10 < i6) {
                        float f = 0.0f;
                        aVar = aVar2;
                        int i11 = i;
                        while (i11 < i5) {
                            while (i < i4) {
                                try {
                                    f = (fArr[((i11 + i10) * i4) + (i3 * i4 * i8) + i] * fArr3[(((i11 * i4) + i) * i7) + i9]) + f;
                                    i++;
                                } catch (Throwable th) {
                                    th = th;
                                    com.facebook.internal.instrument.crashshield.a.a(th, g.class);
                                    return aVar;
                                }
                            }
                            i11++;
                            i = 0;
                        }
                        fArr2[(i10 * i7) + (i6 * i7 * i8) + i9] = f;
                        i10++;
                        aVar2 = aVar;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return aVar3;
        } catch (Throwable th2) {
            th = th2;
            aVar = null;
        }
    }

    @JvmStatic
    public static final a d(a x, a w, a b) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(w, "w");
            Intrinsics.checkNotNullParameter(b, "b");
            int i = x.a[0];
            int i2 = b.a[0];
            a h = h(x, w);
            float[] fArr = b.c;
            float[] fArr2 = h.c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return h;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }

    @JvmStatic
    public static final a e(String[] texts, a w) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w, "w");
            int length = texts.length;
            int i = w.a[1];
            a aVar = new a(new int[]{length, 128, i});
            float[] fArr = aVar.c;
            float[] fArr2 = w.c;
            for (int i2 = 0; i2 < length; i2++) {
                int[] c = h.a.c(texts[i2]);
                for (int i3 = 0; i3 < 128; i3++) {
                    System.arraycopy(fArr2, c[i3] * i, fArr, (i * i3) + (i * 128 * i2), i);
                }
            }
            return aVar;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }

    @JvmStatic
    public static final void f(a x) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int[] iArr = x.a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i = 1;
            for (int i2 = 1; i2 < length; i2++) {
                i *= x.a[i2];
            }
            int[] shape = {x.a[0], i};
            Intrinsics.checkNotNullParameter(shape, "shape");
            x.a = shape;
            int a = a.C0082a.a(a.Companion, shape);
            float[] fArr = new float[a];
            System.arraycopy(x.c, 0, fArr, 0, Math.min(x.b, a));
            x.c = fArr;
            x.b = a;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
        }
    }

    @JvmStatic
    public static final a g(a x, int i) {
        a aVar;
        a aVar2 = null;
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int[] iArr = x.a;
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = (i4 - i) + 1;
            a aVar3 = new a(new int[]{i3, i6, i5});
            float[] fArr = x.c;
            float[] fArr2 = aVar3.c;
            int i7 = 0;
            while (i7 < i3) {
                int i8 = i2;
                while (i8 < i5) {
                    int i9 = i2;
                    while (i9 < i6) {
                        int i10 = i9 * i5;
                        int i11 = (i7 * i6 * i5) + i10 + i8;
                        int i12 = (i7 * i4 * i5) + i10 + i8;
                        fArr2[i11] = Float.MIN_VALUE;
                        int i13 = i2;
                        while (i13 < i) {
                            aVar = aVar2;
                            try {
                                fArr2[i11] = Math.max(fArr2[i11], fArr[(i13 * i5) + i12]);
                                i13++;
                                aVar2 = aVar;
                            } catch (Throwable th) {
                                th = th;
                                com.facebook.internal.instrument.crashshield.a.a(th, g.class);
                                return aVar;
                            }
                        }
                        i9++;
                        i2 = 0;
                    }
                    i8++;
                    i2 = 0;
                }
                i7++;
                i2 = 0;
            }
            return aVar3;
        } catch (Throwable th2) {
            th = th2;
            aVar = aVar2;
        }
    }

    @JvmStatic
    public static final a h(a x, a w) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            Intrinsics.checkNotNullParameter(w, "w");
            int i = x.a[0];
            int[] iArr = w.a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            a aVar = new a(new int[]{i, i3});
            float[] fArr = x.c;
            float[] fArr2 = w.c;
            float[] fArr3 = aVar.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]) + fArr3[i6];
                    }
                }
            }
            return aVar;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }

    @JvmStatic
    public static final void i(a x) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            float[] fArr = x.c;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (fArr[i] < 0.0f) {
                    fArr[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
        }
    }

    @JvmStatic
    public static final void j(a x) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int[] iArr = x.a;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr = x.c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                int i5 = i4 + i2;
                float f = Float.MIN_VALUE;
                for (int i6 = i4; i6 < i5; i6++) {
                    float f2 = fArr[i6];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = 0.0f;
                for (int i7 = i4; i7 < i5; i7++) {
                    float exp = (float) Math.exp(fArr[i7] - f);
                    fArr[i7] = exp;
                    f3 += exp;
                }
                while (i4 < i5) {
                    fArr[i4] = fArr[i4] / f3;
                    i4++;
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
        }
    }

    @JvmStatic
    public static final a k(a x) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int[] iArr = x.a;
            int i = iArr[0];
            int i2 = iArr[1];
            a aVar = new a(new int[]{i2, i});
            float[] fArr = x.c;
            float[] fArr2 = aVar.c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return aVar;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }

    @JvmStatic
    public static final a l(a x) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x, "x");
            int[] iArr = x.a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            a aVar = new a(new int[]{i3, i2, i});
            float[] fArr = x.c;
            float[] fArr2 = aVar.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[(i5 * i) + (i6 * i * i2) + i4] = fArr[(i5 * i3) + (i4 * i2 * i3) + i6];
                    }
                }
            }
            return aVar;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, g.class);
            return null;
        }
    }
}

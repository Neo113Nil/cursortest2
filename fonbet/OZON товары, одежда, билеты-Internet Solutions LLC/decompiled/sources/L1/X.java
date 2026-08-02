package L1;

import L1.B;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X {
    private static final float a(int i11, int i12, float[] fArr) {
        return fArr[((i11 - i12) * 2) + 1];
    }

    public static final int[] b(@NotNull W w11, @NotNull Layout layout, @NotNull B b11, @NotNull RectF rectF, int i11, @NotNull Function2<? super RectF, ? super RectF, Boolean> function2) {
        M1.f dVar;
        int i12;
        if (i11 == 1) {
            dVar = new M1.i(w11.C(), w11.E());
        } else {
            CharSequence C11 = w11.C();
            dVar = Build.VERSION.SDK_INT >= 29 ? new M1.d(C11, w11.D()) : new M1.e(C11);
        }
        M1.f fVar = dVar;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > w11.k(lineForVertical) && (lineForVertical = lineForVertical + 1) >= w11.l()) {
            return null;
        }
        int i13 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < w11.u(0)) {
            return null;
        }
        int c11 = c(w11, layout, b11, i13, rectF, fVar, function2, true);
        while (true) {
            i12 = i13;
            if (c11 != -1 || i12 >= lineForVertical2) {
                break;
            }
            i13 = i12 + 1;
            c11 = c(w11, layout, b11, i13, rectF, fVar, function2, true);
        }
        if (c11 == -1) {
            return null;
        }
        int c12 = c(w11, layout, b11, lineForVertical2, rectF, fVar, function2, false);
        while (c12 == -1 && i12 < lineForVertical2) {
            int i14 = lineForVertical2 - 1;
            c12 = c(w11, layout, b11, i14, rectF, fVar, function2, false);
            lineForVertical2 = i14;
        }
        if (c12 == -1) {
            return null;
        }
        return new int[]{fVar.c(c11 + 1), fVar.d(c12 - 1)};
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int c(W w11, Layout layout, B b11, int i11, RectF rectF, M1.f fVar, Function2<? super RectF, ? super RectF, Boolean> function2, boolean z11) {
        kotlin.ranges.e j11;
        B.a[] aVarArr;
        int b12;
        int i12;
        int d11;
        int i13;
        int b13;
        int lineTop = layout.getLineTop(i11);
        int lineBottom = layout.getLineBottom(i11);
        int lineStart = layout.getLineStart(i11);
        int lineEnd = layout.getLineEnd(i11);
        if (lineStart == lineEnd) {
            return -1;
        }
        float[] fArr = new float[(lineEnd - lineStart) * 2];
        w11.b(fArr, i11);
        B.a[] d12 = b11.d(i11);
        int i14 = 1;
        if (z11) {
            Intrinsics.checkNotNullParameter(d12, "<this>");
            Intrinsics.checkNotNullParameter(d12, "<this>");
            j11 = new IntRange(0, d12.length - 1, 1);
        } else {
            Intrinsics.checkNotNullParameter(d12, "<this>");
            j11 = kotlin.ranges.h.j(d12.length - 1, 0);
        }
        int f71842a = j11.getF71842a();
        int f71843b = j11.getF71843b();
        int f71844c = j11.getF71844c();
        if ((f71844c <= 0 || f71842a > f71843b) && (f71844c >= 0 || f71843b > f71842a)) {
            return -1;
        }
        while (true) {
            B.a aVar = d12[f71842a];
            float f7 = aVar.c() ? fArr[((aVar.a() - i14) - lineStart) * 2] : fArr[(aVar.b() - lineStart) * 2];
            float a11 = aVar.c() ? a(aVar.b(), lineStart, fArr) : a(aVar.a() - i14, lineStart, fArr);
            if (z11) {
                if (a11 < rectF.left || f7 > rectF.right) {
                    aVarArr = d12;
                } else {
                    if ((aVar.c() || rectF.left > f7) && (!aVar.c() || rectF.right < a11)) {
                        b13 = aVar.b();
                        int a12 = aVar.a();
                        while (a12 - b13 > i14) {
                            int i15 = (a12 + b13) / 2;
                            float f11 = fArr[(i15 - lineStart) * 2];
                            int i16 = i14;
                            if ((aVar.c() || f11 <= rectF.left) && (!aVar.c() || f11 >= rectF.right)) {
                                i14 = i16;
                                b13 = i15;
                            } else {
                                i14 = i16;
                                a12 = i15;
                            }
                        }
                        if (aVar.c()) {
                            b13 = a12;
                        }
                    } else {
                        b13 = aVar.b();
                    }
                    int d13 = fVar.d(b13);
                    if (d13 != -1 && (i13 = fVar.c(d13)) < aVar.a()) {
                        int b14 = aVar.b();
                        if (i13 < b14) {
                            i13 = b14;
                        }
                        int a13 = aVar.a();
                        if (d13 > a13) {
                            d13 = a13;
                        }
                        aVarArr = d12;
                        RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int i17 = d13;
                        while (true) {
                            rectF2.left = aVar.c() ? fArr[((i17 - 1) - lineStart) * 2] : fArr[(i13 - lineStart) * 2];
                            rectF2.right = aVar.c() ? a(i13, lineStart, fArr) : a(i17 - 1, lineStart, fArr);
                            if (!function2.invoke(rectF2, rectF).booleanValue()) {
                                i13 = fVar.b(i13);
                                if (i13 == -1 || i13 >= aVar.a()) {
                                    break;
                                }
                                int d14 = fVar.d(i13);
                                i17 = aVar.a();
                                if (d14 <= i17) {
                                    i17 = d14;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        aVarArr = d12;
                    }
                }
                i13 = -1;
                if (i13 >= 0) {
                    return i13;
                }
                if (f71842a == f71843b) {
                    return -1;
                }
                f71842a += f71844c;
                d12 = aVarArr;
                i14 = 1;
            } else {
                aVarArr = d12;
                int i18 = i14;
                if (a11 >= rectF.left && f7 <= rectF.right) {
                    if ((aVar.c() || rectF.right < a11) && (!aVar.c() || rectF.left > f7)) {
                        b12 = aVar.b();
                        int a14 = aVar.a();
                        while (a14 - b12 > i18) {
                            int i19 = (a14 + b12) / 2;
                            float f12 = fArr[(i19 - lineStart) * 2];
                            if ((aVar.c() || f12 <= rectF.right) && (!aVar.c() || f12 >= rectF.left)) {
                                b12 = i19;
                            } else {
                                a14 = i19;
                            }
                            i18 = 1;
                        }
                        if (aVar.c()) {
                            b12 = a14;
                        }
                        i12 = 1;
                    } else {
                        b12 = aVar.a() - 1;
                        i12 = i18;
                    }
                    int c11 = fVar.c(b12 + i12);
                    if (c11 != -1 && (d11 = fVar.d(c11)) > aVar.b()) {
                        int b15 = aVar.b();
                        if (c11 < b15) {
                            c11 = b15;
                        }
                        int a15 = aVar.a();
                        if (d11 > a15) {
                            d11 = a15;
                        }
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int i21 = c11;
                        while (true) {
                            rectF3.left = aVar.c() ? fArr[((d11 - 1) - lineStart) * 2] : fArr[(i21 - lineStart) * 2];
                            rectF3.right = aVar.c() ? a(i21, lineStart, fArr) : a(d11 - 1, lineStart, fArr);
                            if (!function2.invoke(rectF3, rectF).booleanValue()) {
                                d11 = fVar.a(d11);
                                if (d11 == -1 || d11 <= aVar.b()) {
                                    break;
                                }
                                i21 = fVar.c(d11);
                                int b16 = aVar.b();
                                if (i21 < b16) {
                                    i21 = b16;
                                }
                            } else {
                                i13 = d11;
                                break;
                            }
                        }
                        if (i13 >= 0) {
                        }
                    }
                }
                i13 = -1;
                if (i13 >= 0) {
                }
            }
        }
    }
}

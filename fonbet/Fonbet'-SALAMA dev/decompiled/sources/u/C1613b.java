package u;

import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.util.Arrays;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1613b extends q4.d {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f16492a;

    /* renamed from: b, reason: collision with root package name */
    public final C1612a[] f16493b;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r5 == r3) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1613b(int[] iArr, double[] dArr, double[][] dArr2) {
        int i7;
        double[] dArr3;
        double d7;
        C1613b c1613b = this;
        double[] dArr4 = dArr;
        c1613b.f16492a = dArr4;
        int i8 = 1;
        c1613b.f16493b = new C1612a[dArr4.length - 1];
        ?? r22 = 0;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            C1612a[] c1612aArr = c1613b.f16493b;
            if (i9 >= c1612aArr.length) {
                return;
            }
            int i12 = iArr[i9];
            if (i12 != 0) {
                if (i12 != i8) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                        }
                    }
                    i10 = 2;
                    i11 = i10;
                }
                i10 = i8;
                i11 = i10;
            } else {
                i11 = 3;
            }
            double d8 = dArr4[i9];
            int i13 = i9 + 1;
            double d9 = dArr4[i13];
            double[] dArr5 = dArr2[i9];
            double d10 = dArr5[r22];
            double d11 = dArr5[i8];
            double[] dArr6 = dArr2[i13];
            int i14 = i9;
            int i15 = i10;
            double d12 = dArr6[r22];
            double d13 = dArr6[i8];
            C1612a c1612a = new C1612a();
            c1612a.f16491r = r22;
            boolean z4 = i11 == i8 ? i8 : r22;
            c1612a.f16490q = z4;
            c1612a.f16477c = d8;
            c1612a.f16478d = d9;
            double d14 = d9 - d8;
            double d15 = 1.0d / d14;
            c1612a.f16483i = d15;
            if (3 == i11) {
                c1612a.f16491r = true;
            }
            int i16 = i11;
            double d16 = d12 - d10;
            double d17 = d13 - d11;
            if (c1612a.f16491r || Math.abs(d16) < 0.001d || Math.abs(d17) < 0.001d) {
                i7 = 1;
                c1612a.f16491r = true;
                c1612a.f16479e = d10;
                c1612a.f16480f = d12;
                c1612a.f16481g = d11;
                c1612a.f16482h = d13;
                double hypot = Math.hypot(d17, d16);
                c1612a.f16476b = hypot;
                c1612a.f16487n = hypot * d15;
                c1612a.f16485l = d16 / d14;
                c1612a.f16486m = d17 / d14;
            } else {
                c1612a.f16475a = new double[ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE];
                c1612a.j = (z4 != 0 ? -1 : 1) * d16;
                c1612a.f16484k = d17 * (z4 != 0 ? 1 : -1);
                c1612a.f16485l = z4 != 0 ? d12 : d10;
                c1612a.f16486m = z4 != 0 ? d11 : d13;
                double d18 = d11 - d13;
                int i17 = 0;
                double d19 = 0.0d;
                double d20 = 0.0d;
                double d21 = 0.0d;
                while (true) {
                    dArr3 = C1612a.f16474s;
                    if (i17 >= 91) {
                        break;
                    }
                    double radians = Math.toRadians((i17 * 90.0d) / 90);
                    double sin = Math.sin(radians) * d16;
                    double cos = Math.cos(radians) * d18;
                    if (i17 > 0) {
                        d7 = d18;
                        d19 += Math.hypot(sin - d20, cos - d21);
                        dArr3[i17] = d19;
                    } else {
                        d7 = d18;
                    }
                    i17++;
                    d21 = cos;
                    d20 = sin;
                    d18 = d7;
                }
                c1612a.f16476b = d19;
                for (int i18 = 0; i18 < 91; i18++) {
                    dArr3[i18] = dArr3[i18] / d19;
                }
                int i19 = 0;
                while (true) {
                    double[] dArr7 = c1612a.f16475a;
                    if (i19 >= dArr7.length) {
                        break;
                    }
                    double length = i19 / (dArr7.length - 1);
                    int binarySearch = Arrays.binarySearch(dArr3, length);
                    if (binarySearch >= 0) {
                        dArr7[i19] = binarySearch / 90;
                    } else if (binarySearch == -1) {
                        dArr7[i19] = 0.0d;
                    } else {
                        int i20 = -binarySearch;
                        int i21 = i20 - 2;
                        double d22 = dArr3[i21];
                        dArr7[i19] = (((length - d22) / (dArr3[i20 - 1] - d22)) + i21) / 90;
                    }
                    i19++;
                }
                c1612a.f16487n = c1612a.f16476b * c1612a.f16483i;
                i7 = 1;
            }
            c1612aArr[i14] = c1612a;
            c1613b = this;
            dArr4 = dArr;
            i8 = i7;
            i11 = i16;
            i9 = i13;
            i10 = i15;
            r22 = 0;
        }
    }

    @Override // q4.d
    public final double d(double d7) {
        C1612a[] c1612aArr = this.f16493b;
        C1612a c1612a = c1612aArr[0];
        double d8 = c1612a.f16477c;
        if (d7 < d8) {
            double d9 = d7 - d8;
            if (c1612a.f16491r) {
                return (d9 * c1612aArr[0].f16485l) + c1612a.c(d8);
            }
            c1612a.g(d8);
            return (c1612aArr[0].a() * d9) + c1612aArr[0].e();
        }
        if (d7 > c1612aArr[c1612aArr.length - 1].f16478d) {
            double d10 = c1612aArr[c1612aArr.length - 1].f16478d;
            double d11 = d7 - d10;
            int length = c1612aArr.length - 1;
            return (d11 * c1612aArr[length].f16485l) + c1612aArr[length].c(d10);
        }
        for (int i7 = 0; i7 < c1612aArr.length; i7++) {
            C1612a c1612a2 = c1612aArr[i7];
            if (d7 <= c1612a2.f16478d) {
                if (c1612a2.f16491r) {
                    return c1612a2.c(d7);
                }
                c1612a2.g(d7);
                return c1612aArr[i7].e();
            }
        }
        return Double.NaN;
    }

    @Override // q4.d
    public final void e(double d7, double[] dArr) {
        C1612a[] c1612aArr = this.f16493b;
        C1612a c1612a = c1612aArr[0];
        double d8 = c1612a.f16477c;
        if (d7 < d8) {
            double d9 = d7 - d8;
            if (c1612a.f16491r) {
                double c3 = c1612a.c(d8);
                C1612a c1612a2 = c1612aArr[0];
                dArr[0] = (c1612a2.f16485l * d9) + c3;
                dArr[1] = (d9 * c1612aArr[0].f16486m) + c1612a2.d(d8);
                return;
            }
            c1612a.g(d8);
            dArr[0] = (c1612aArr[0].a() * d9) + c1612aArr[0].e();
            dArr[1] = (c1612aArr[0].b() * d9) + c1612aArr[0].f();
            return;
        }
        if (d7 <= c1612aArr[c1612aArr.length - 1].f16478d) {
            for (int i7 = 0; i7 < c1612aArr.length; i7++) {
                C1612a c1612a3 = c1612aArr[i7];
                if (d7 <= c1612a3.f16478d) {
                    if (c1612a3.f16491r) {
                        dArr[0] = c1612a3.c(d7);
                        dArr[1] = c1612aArr[i7].d(d7);
                        return;
                    } else {
                        c1612a3.g(d7);
                        dArr[0] = c1612aArr[i7].e();
                        dArr[1] = c1612aArr[i7].f();
                        return;
                    }
                }
            }
            return;
        }
        double d10 = c1612aArr[c1612aArr.length - 1].f16478d;
        double d11 = d7 - d10;
        int length = c1612aArr.length - 1;
        C1612a c1612a4 = c1612aArr[length];
        if (c1612a4.f16491r) {
            double c4 = c1612a4.c(d10);
            C1612a c1612a5 = c1612aArr[length];
            dArr[0] = (c1612a5.f16485l * d11) + c4;
            dArr[1] = (d11 * c1612aArr[length].f16486m) + c1612a5.d(d10);
            return;
        }
        c1612a4.g(d7);
        dArr[0] = (c1612aArr[length].a() * d11) + c1612aArr[length].e();
        dArr[1] = (c1612aArr[length].b() * d11) + c1612aArr[length].f();
    }

    @Override // q4.d
    public final void f(double d7, float[] fArr) {
        C1612a[] c1612aArr = this.f16493b;
        C1612a c1612a = c1612aArr[0];
        double d8 = c1612a.f16477c;
        if (d7 < d8) {
            double d9 = d7 - d8;
            if (c1612a.f16491r) {
                double c3 = c1612a.c(d8);
                C1612a c1612a2 = c1612aArr[0];
                fArr[0] = (float) ((c1612a2.f16485l * d9) + c3);
                fArr[1] = (float) ((d9 * c1612aArr[0].f16486m) + c1612a2.d(d8));
                return;
            }
            c1612a.g(d8);
            fArr[0] = (float) ((c1612aArr[0].a() * d9) + c1612aArr[0].e());
            fArr[1] = (float) ((c1612aArr[0].b() * d9) + c1612aArr[0].f());
            return;
        }
        if (d7 <= c1612aArr[c1612aArr.length - 1].f16478d) {
            for (int i7 = 0; i7 < c1612aArr.length; i7++) {
                C1612a c1612a3 = c1612aArr[i7];
                if (d7 <= c1612a3.f16478d) {
                    if (c1612a3.f16491r) {
                        fArr[0] = (float) c1612a3.c(d7);
                        fArr[1] = (float) c1612aArr[i7].d(d7);
                        return;
                    } else {
                        c1612a3.g(d7);
                        fArr[0] = (float) c1612aArr[i7].e();
                        fArr[1] = (float) c1612aArr[i7].f();
                        return;
                    }
                }
            }
            return;
        }
        double d10 = c1612aArr[c1612aArr.length - 1].f16478d;
        double d11 = d7 - d10;
        int length = c1612aArr.length - 1;
        C1612a c1612a4 = c1612aArr[length];
        if (!c1612a4.f16491r) {
            c1612a4.g(d7);
            fArr[0] = (float) c1612aArr[length].e();
            fArr[1] = (float) c1612aArr[length].f();
        } else {
            double c4 = c1612a4.c(d10);
            C1612a c1612a5 = c1612aArr[length];
            fArr[0] = (float) ((c1612a5.f16485l * d11) + c4);
            fArr[1] = (float) ((d11 * c1612aArr[length].f16486m) + c1612a5.d(d10));
        }
    }

    @Override // q4.d
    public final double g(double d7) {
        C1612a[] c1612aArr = this.f16493b;
        double d8 = c1612aArr[0].f16477c;
        if (d7 < d8) {
            d7 = d8;
        }
        if (d7 > c1612aArr[c1612aArr.length - 1].f16478d) {
            d7 = c1612aArr[c1612aArr.length - 1].f16478d;
        }
        for (int i7 = 0; i7 < c1612aArr.length; i7++) {
            C1612a c1612a = c1612aArr[i7];
            if (d7 <= c1612a.f16478d) {
                if (c1612a.f16491r) {
                    return c1612a.f16485l;
                }
                c1612a.g(d7);
                return c1612aArr[i7].a();
            }
        }
        return Double.NaN;
    }

    @Override // q4.d
    public final void h(double d7, double[] dArr) {
        C1612a[] c1612aArr = this.f16493b;
        double d8 = c1612aArr[0].f16477c;
        if (d7 < d8) {
            d7 = d8;
        } else if (d7 > c1612aArr[c1612aArr.length - 1].f16478d) {
            d7 = c1612aArr[c1612aArr.length - 1].f16478d;
        }
        for (int i7 = 0; i7 < c1612aArr.length; i7++) {
            C1612a c1612a = c1612aArr[i7];
            if (d7 <= c1612a.f16478d) {
                if (c1612a.f16491r) {
                    dArr[0] = c1612a.f16485l;
                    dArr[1] = c1612a.f16486m;
                    return;
                } else {
                    c1612a.g(d7);
                    dArr[0] = c1612aArr[i7].a();
                    dArr[1] = c1612aArr[i7].b();
                    return;
                }
            }
        }
    }

    @Override // q4.d
    public final double[] i() {
        return this.f16492a;
    }
}

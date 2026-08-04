package p143u;

import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.util.Arrays;
import p120q4.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f16498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f16499b;

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public b(int[] iArr, double[] dArr, double[][] dArr2) {
        int i7;
        double[] dArr3;
        b bVar = this;
        double[] dArr4 = dArr;
        bVar.f16498a = dArr4;
        int i8 = 1;
        bVar.f16499b = new a[dArr4.length - 1];
        ?? r7 = 0;
        int i9 = 0;
        int i10 = 1;
        int i11 = 1;
        while (true) {
            a[] aVarArr = bVar.f16499b;
            if (i9 >= aVarArr.length) {
                return;
            }
            int i12 = iArr[i9];
            if (i12 == 0) {
                i11 = 3;
            } else if (i12 == i8) {
                i10 = i8;
                i11 = i10;
            } else {
                if (i12 != 2) {
                    if (i12 == 3) {
                        if (i10 != i8) {
                            i10 = i8;
                        }
                        i11 = i10;
                    }
                }
                i10 = 2;
                i11 = i10;
            }
            double d7 = dArr4[i9];
            int i13 = i9 + 1;
            double d8 = dArr4[i13];
            double[] dArr5 = dArr2[i9];
            double d9 = dArr5[r7];
            double d10 = dArr5[i8];
            double[] dArr6 = dArr2[i13];
            int i14 = i9;
            int i15 = i10;
            double d11 = dArr6[r7];
            double d12 = dArr6[i8];
            a aVar = new a();
            aVar.f16497r = r7;
            boolean z4 = i11 == i8 ? i8 : r7;
            aVar.f16496q = z4;
            aVar.f16483c = d7;
            aVar.f16484d = d8;
            double d13 = d8 - d7;
            double d14 = 1.0d / d13;
            aVar.f16489i = d14;
            if (3 == i11) {
                aVar.f16497r = true;
            }
            int i16 = i11;
            double d15 = d11 - d9;
            double d16 = d12 - d10;
            if (aVar.f16497r || Math.abs(d15) < 0.001d || Math.abs(d16) < 0.001d) {
                i7 = 1;
                aVar.f16497r = true;
                aVar.f16485e = d9;
                aVar.f16486f = d11;
                aVar.f16487g = d10;
                aVar.f16488h = d12;
                double dHypot = Math.hypot(d16, d15);
                aVar.f16482b = dHypot;
                aVar.f16493n = dHypot * d14;
                aVar.f16491l = d15 / d13;
                aVar.f16492m = d16 / d13;
            } else {
                aVar.f16481a = new double[ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE];
                aVar.j = ((double) (z4 != 0 ? -1 : 1)) * d15;
                aVar.f16490k = d16 * ((double) (z4 != 0 ? 1 : -1));
                aVar.f16491l = z4 != 0 ? d11 : d9;
                aVar.f16492m = z4 != 0 ? d10 : d12;
                double d17 = d10 - d12;
                int i17 = 0;
                double dHypot2 = 0.0d;
                double d18 = 0.0d;
                double d19 = 0.0d;
                while (true) {
                    dArr3 = a.f16480s;
                    if (i17 >= 91) {
                        break;
                    }
                    double radians = Math.toRadians((((double) i17) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d15;
                    double dCos = Math.cos(radians) * d17;
                    if (i17 > 0) {
                        dHypot2 += Math.hypot(dSin - d18, dCos - d19);
                        dArr3[i17] = dHypot2;
                    }
                    i17++;
                    d19 = dCos;
                    d18 = dSin;
                    d17 = d17;
                }
                aVar.f16482b = dHypot2;
                for (int i18 = 0; i18 < 91; i18++) {
                    dArr3[i18] = dArr3[i18] / dHypot2;
                }
                int i19 = 0;
                while (true) {
                    double[] dArr7 = aVar.f16481a;
                    if (i19 >= dArr7.length) {
                        break;
                    }
                    double length = ((double) i19) / ((double) (dArr7.length - 1));
                    int iBinarySearch = Arrays.binarySearch(dArr3, length);
                    if (iBinarySearch >= 0) {
                        dArr7[i19] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr7[i19] = 0.0d;
                    } else {
                        int i20 = -iBinarySearch;
                        int i21 = i20 - 2;
                        double d20 = dArr3[i21];
                        dArr7[i19] = (((length - d20) / (dArr3[i20 - 1] - d20)) + ((double) i21)) / ((double) 90);
                    }
                    i19++;
                }
                aVar.f16493n = aVar.f16482b * aVar.f16489i;
                i7 = 1;
            }
            aVarArr[i14] = aVar;
            bVar = this;
            dArr4 = dArr;
            i8 = i7;
            i11 = i16;
            i9 = i13;
            i10 = i15;
            r7 = 0;
        }
    }

    @Override // p120q4.d
    public final double d(double d7) {
        a[] aVarArr = this.f16499b;
        a aVar = aVarArr[0];
        double d8 = aVar.f16483c;
        if (d7 < d8) {
            double d9 = d7 - d8;
            if (aVar.f16497r) {
                return (d9 * aVarArr[0].f16491l) + aVar.c(d8);
            }
            aVar.g(d8);
            return (aVarArr[0].a() * d9) + aVarArr[0].e();
        }
        if (d7 > aVarArr[aVarArr.length - 1].f16484d) {
            double d10 = aVarArr[aVarArr.length - 1].f16484d;
            double d11 = d7 - d10;
            int length = aVarArr.length - 1;
            return (d11 * aVarArr[length].f16491l) + aVarArr[length].c(d10);
        }
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar2 = aVarArr[i7];
            if (d7 <= aVar2.f16484d) {
                if (aVar2.f16497r) {
                    return aVar2.c(d7);
                }
                aVar2.g(d7);
                return aVarArr[i7].e();
            }
        }
        return Double.NaN;
    }

    @Override // p120q4.d
    public final void e(double d7, double[] dArr) {
        a[] aVarArr = this.f16499b;
        a aVar = aVarArr[0];
        double d8 = aVar.f16483c;
        if (d7 < d8) {
            double d9 = d7 - d8;
            if (aVar.f16497r) {
                double dC = aVar.c(d8);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.f16491l * d9) + dC;
                dArr[1] = (d9 * aVarArr[0].f16492m) + aVar2.d(d8);
                return;
            }
            aVar.g(d8);
            dArr[0] = (aVarArr[0].a() * d9) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d9) + aVarArr[0].f();
            return;
        }
        if (d7 <= aVarArr[aVarArr.length - 1].f16484d) {
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                a aVar3 = aVarArr[i7];
                if (d7 <= aVar3.f16484d) {
                    if (aVar3.f16497r) {
                        dArr[0] = aVar3.c(d7);
                        dArr[1] = aVarArr[i7].d(d7);
                        return;
                    } else {
                        aVar3.g(d7);
                        dArr[0] = aVarArr[i7].e();
                        dArr[1] = aVarArr[i7].f();
                        return;
                    }
                }
            }
            return;
        }
        double d10 = aVarArr[aVarArr.length - 1].f16484d;
        double d11 = d7 - d10;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.f16497r) {
            double dC2 = aVar4.c(d10);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.f16491l * d11) + dC2;
            dArr[1] = (d11 * aVarArr[length].f16492m) + aVar5.d(d10);
            return;
        }
        aVar4.g(d7);
        dArr[0] = (aVarArr[length].a() * d11) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d11) + aVarArr[length].f();
    }

    @Override // p120q4.d
    public final void f(double d7, float[] fArr) {
        a[] aVarArr = this.f16499b;
        a aVar = aVarArr[0];
        double d8 = aVar.f16483c;
        if (d7 < d8) {
            double d9 = d7 - d8;
            if (aVar.f16497r) {
                double dC = aVar.c(d8);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.f16491l * d9) + dC);
                fArr[1] = (float) ((d9 * aVarArr[0].f16492m) + aVar2.d(d8));
                return;
            }
            aVar.g(d8);
            fArr[0] = (float) ((aVarArr[0].a() * d9) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d9) + aVarArr[0].f());
            return;
        }
        if (d7 <= aVarArr[aVarArr.length - 1].f16484d) {
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                a aVar3 = aVarArr[i7];
                if (d7 <= aVar3.f16484d) {
                    if (aVar3.f16497r) {
                        fArr[0] = (float) aVar3.c(d7);
                        fArr[1] = (float) aVarArr[i7].d(d7);
                        return;
                    } else {
                        aVar3.g(d7);
                        fArr[0] = (float) aVarArr[i7].e();
                        fArr[1] = (float) aVarArr[i7].f();
                        return;
                    }
                }
            }
            return;
        }
        double d10 = aVarArr[aVarArr.length - 1].f16484d;
        double d11 = d7 - d10;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.f16497r) {
            aVar4.g(d7);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double dC2 = aVar4.c(d10);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.f16491l * d11) + dC2);
            fArr[1] = (float) ((d11 * aVarArr[length].f16492m) + aVar5.d(d10));
        }
    }

    @Override // p120q4.d
    public final double g(double d7) {
        a[] aVarArr = this.f16499b;
        double d8 = aVarArr[0].f16483c;
        if (d7 < d8) {
            d7 = d8;
        }
        if (d7 > aVarArr[aVarArr.length - 1].f16484d) {
            d7 = aVarArr[aVarArr.length - 1].f16484d;
        }
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar = aVarArr[i7];
            if (d7 <= aVar.f16484d) {
                if (aVar.f16497r) {
                    return aVar.f16491l;
                }
                aVar.g(d7);
                return aVarArr[i7].a();
            }
        }
        return Double.NaN;
    }

    @Override // p120q4.d
    public final void h(double d7, double[] dArr) {
        a[] aVarArr = this.f16499b;
        double d8 = aVarArr[0].f16483c;
        if (d7 < d8) {
            d7 = d8;
        } else if (d7 > aVarArr[aVarArr.length - 1].f16484d) {
            d7 = aVarArr[aVarArr.length - 1].f16484d;
        }
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar = aVarArr[i7];
            if (d7 <= aVar.f16484d) {
                if (aVar.f16497r) {
                    dArr[0] = aVar.f16491l;
                    dArr[1] = aVar.f16492m;
                    return;
                } else {
                    aVar.g(d7);
                    dArr[0] = aVarArr[i7].a();
                    dArr[1] = aVarArr[i7].b();
                    return;
                }
            }
        }
    }

    @Override // p120q4.d
    public final double[] i() {
        return this.f16498a;
    }
}

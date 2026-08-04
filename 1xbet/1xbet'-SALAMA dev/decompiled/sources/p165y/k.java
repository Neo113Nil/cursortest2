package p165y;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import p120q4.d;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f18115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f18116b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f18117c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18119e;

    public final float a(float f7) {
        return (float) this.f18115a.d(f7);
    }

    public void b(float f7, int i7) {
        int[] iArr = this.f18116b;
        if (iArr.length < this.f18118d + 1) {
            this.f18116b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f18117c;
            this.f18117c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f18116b;
        int i8 = this.f18118d;
        iArr2[i8] = i7;
        this.f18117c[i8] = f7;
        this.f18118d = i8 + 1;
    }

    public abstract void c(View view, float f7);

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public void d(int i7) {
        int i8 = this.f18118d;
        if (i8 == 0) {
            return;
        }
        int[] iArr = this.f18116b;
        float[] fArr = this.f18117c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i8 - 1;
        iArr2[1] = 0;
        int i9 = 2;
        while (i9 > 0) {
            int i10 = i9 - 1;
            int i11 = iArr2[i10];
            int i12 = i9 - 2;
            int i13 = iArr2[i12];
            if (i11 < i13) {
                int i14 = iArr[i13];
                int i15 = i11;
                int i16 = i15;
                while (i15 < i13) {
                    int i17 = iArr[i15];
                    if (i17 <= i14) {
                        int i18 = iArr[i16];
                        iArr[i16] = i17;
                        iArr[i15] = i18;
                        float f7 = fArr[i16];
                        fArr[i16] = fArr[i15];
                        fArr[i15] = f7;
                        i16++;
                    }
                    i15++;
                }
                int i19 = iArr[i16];
                iArr[i16] = iArr[i13];
                iArr[i13] = i19;
                float f8 = fArr[i16];
                fArr[i16] = fArr[i13];
                fArr[i13] = f8;
                iArr2[i12] = i16 - 1;
                iArr2[i10] = i11;
                int i20 = i9 + 1;
                iArr2[i9] = i13;
                i9 += 2;
                iArr2[i20] = i16 + 1;
            } else {
                i9 = i12;
            }
        }
        int i21 = 1;
        for (int i22 = 1; i22 < this.f18118d; i22++) {
            int[] iArr3 = this.f18116b;
            if (iArr3[i22 - 1] != iArr3[i22]) {
                i21++;
            }
        }
        double[] dArr = new double[i21];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i21, 1);
        int i23 = 0;
        for (int i24 = 0; i24 < this.f18118d; i24++) {
            if (i24 > 0) {
                int[] iArr4 = this.f18116b;
                if (iArr4[i24] != iArr4[i24 - 1]) {
                    dArr[i23] = ((double) this.f18116b[i24]) * 0.01d;
                    dArr2[i23][0] = this.f18117c[i24];
                    i23++;
                }
            } else {
                dArr[i23] = ((double) this.f18116b[i24]) * 0.01d;
                dArr2[i23][0] = this.f18117c[i24];
                i23++;
            }
        }
        this.f18115a = d.c(i7, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f18119e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i7 = 0; i7 < this.f18118d; i7++) {
            StringBuilder sbD = e.d(string, "[");
            sbD.append(this.f18116b[i7]);
            sbD.append(" , ");
            sbD.append(decimalFormat.format(this.f18117c[i7]));
            sbD.append("] ");
            string = sbD.toString();
        }
        return string;
    }
}

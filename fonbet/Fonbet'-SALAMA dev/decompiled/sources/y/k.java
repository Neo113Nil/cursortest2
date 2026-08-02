package y;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public q4.d f18109a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f18110b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public float[] f18111c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    public int f18112d;

    /* renamed from: e, reason: collision with root package name */
    public String f18113e;

    public final float a(float f7) {
        return (float) this.f18109a.d(f7);
    }

    public void b(float f7, int i7) {
        int[] iArr = this.f18110b;
        if (iArr.length < this.f18112d + 1) {
            this.f18110b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f18111c;
            this.f18111c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f18110b;
        int i8 = this.f18112d;
        iArr2[i8] = i7;
        this.f18111c[i8] = f7;
        this.f18112d = i8 + 1;
    }

    public abstract void c(View view, float f7);

    public void d(int i7) {
        int i8;
        int i9 = this.f18112d;
        if (i9 == 0) {
            return;
        }
        int[] iArr = this.f18110b;
        float[] fArr = this.f18111c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i9 - 1;
        iArr2[1] = 0;
        int i10 = 2;
        while (i10 > 0) {
            int i11 = i10 - 1;
            int i12 = iArr2[i11];
            int i13 = i10 - 2;
            int i14 = iArr2[i13];
            if (i12 < i14) {
                int i15 = iArr[i14];
                int i16 = i12;
                int i17 = i16;
                while (i16 < i14) {
                    int i18 = iArr[i16];
                    if (i18 <= i15) {
                        int i19 = iArr[i17];
                        iArr[i17] = i18;
                        iArr[i16] = i19;
                        float f7 = fArr[i17];
                        fArr[i17] = fArr[i16];
                        fArr[i16] = f7;
                        i17++;
                    }
                    i16++;
                }
                int i20 = iArr[i17];
                iArr[i17] = iArr[i14];
                iArr[i14] = i20;
                float f8 = fArr[i17];
                fArr[i17] = fArr[i14];
                fArr[i14] = f8;
                iArr2[i13] = i17 - 1;
                iArr2[i11] = i12;
                int i21 = i10 + 1;
                iArr2[i10] = i14;
                i10 += 2;
                iArr2[i21] = i17 + 1;
            } else {
                i10 = i13;
            }
        }
        int i22 = 1;
        for (int i23 = 1; i23 < this.f18112d; i23++) {
            int[] iArr3 = this.f18110b;
            if (iArr3[i23 - 1] != iArr3[i23]) {
                i22++;
            }
        }
        double[] dArr = new double[i22];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i22, 1);
        int i24 = 0;
        for (0; i8 < this.f18112d; i8 + 1) {
            if (i8 > 0) {
                int[] iArr4 = this.f18110b;
                i8 = iArr4[i8] == iArr4[i8 - 1] ? i8 + 1 : 0;
            }
            dArr[i24] = this.f18110b[i8] * 0.01d;
            dArr2[i24][0] = this.f18111c[i8];
            i24++;
        }
        this.f18109a = q4.d.c(i7, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f18113e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i7 = 0; i7 < this.f18112d; i7++) {
            StringBuilder d7 = t.e.d(str, "[");
            d7.append(this.f18110b[i7]);
            d7.append(" , ");
            d7.append(decimalFormat.format(this.f18111c[i7]));
            d7.append("] ");
            str = d7.toString();
        }
        return str;
    }
}

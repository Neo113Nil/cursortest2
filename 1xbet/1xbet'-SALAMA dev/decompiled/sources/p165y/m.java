package p165y;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import p120q4.d;
import p143u.e;
import r6.a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f18121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArray f18122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SparseArray f18123i;
    public float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f18124k;

    @Override // p165y.p
    public final boolean b(float f7, long j, View view, e eVar) {
        this.f18126a.f(f7, this.j);
        float[] fArr = this.j;
        float f8 = fArr[fArr.length - 2];
        float f9 = fArr[fArr.length - 1];
        long j3 = j - this.f18130e;
        if (Float.isNaN(this.f18131f)) {
            float fC = eVar.c(view, this.f18121g);
            this.f18131f = fC;
            if (Float.isNaN(fC)) {
                this.f18131f = 0.0f;
            }
        }
        float f10 = (float) ((((j3 * 1.0E-9d) * ((double) f8)) + ((double) this.f18131f)) % 1.0d);
        this.f18131f = f10;
        this.f18130e = j;
        float fSin = (float) Math.sin(f10 * 6.2831855f);
        this.f18129d = false;
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.f18124k;
            if (i7 >= fArr2.length) {
                break;
            }
            boolean z4 = this.f18129d;
            float f11 = this.j[i7];
            this.f18129d = z4 | (((double) f11) != 0.0d);
            fArr2[i7] = (f11 * fSin) + f9;
            i7++;
        }
        a.d((B.a) this.f18122h.valueAt(0), view, this.f18124k);
        if (f8 != 0.0f) {
            this.f18129d = true;
        }
        return this.f18129d;
    }

    @Override // p165y.p
    public final void c(int i7) {
        SparseArray sparseArray = this.f18122h;
        int size = sparseArray.size();
        int iC = ((B.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i8 = iC + 2;
        this.j = new float[i8];
        this.f18124k = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i8);
        for (int i9 = 0; i9 < size; i9++) {
            int iKeyAt = sparseArray.keyAt(i9);
            B.a aVar = (B.a) sparseArray.valueAt(i9);
            float[] fArr = (float[]) this.f18123i.valueAt(i9);
            dArr[i9] = ((double) iKeyAt) * 0.01d;
            aVar.b(this.j);
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.j;
                if (i10 < fArr2.length) {
                    dArr2[i9][i10] = fArr2[i10];
                    i10++;
                }
            }
            double[] dArr3 = dArr2[i9];
            dArr3[iC] = fArr[0];
            dArr3[iC + 1] = fArr[1];
        }
        this.f18126a = d.c(i7, dArr, dArr2);
    }
}

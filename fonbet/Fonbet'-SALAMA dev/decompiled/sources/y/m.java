package y;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import u.C1616e;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: g, reason: collision with root package name */
    public String f18115g;

    /* renamed from: h, reason: collision with root package name */
    public SparseArray f18116h;

    /* renamed from: i, reason: collision with root package name */
    public SparseArray f18117i;
    public float[] j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f18118k;

    @Override // y.p
    public final boolean b(float f7, long j, View view, C1616e c1616e) {
        this.f18120a.f(f7, this.j);
        float[] fArr = this.j;
        float f8 = fArr[fArr.length - 2];
        float f9 = fArr[fArr.length - 1];
        long j3 = j - this.f18124e;
        if (Float.isNaN(this.f18125f)) {
            float c3 = c1616e.c(view, this.f18115g);
            this.f18125f = c3;
            if (Float.isNaN(c3)) {
                this.f18125f = 0.0f;
            }
        }
        this.f18125f = (float) ((((j3 * 1.0E-9d) * f8) + this.f18125f) % 1.0d);
        this.f18124e = j;
        float sin = (float) Math.sin(r15 * 6.2831855f);
        this.f18123d = false;
        int i7 = 0;
        while (true) {
            float[] fArr2 = this.f18118k;
            if (i7 >= fArr2.length) {
                break;
            }
            boolean z4 = this.f18123d;
            float f10 = this.j[i7];
            this.f18123d = z4 | (((double) f10) != 0.0d);
            fArr2[i7] = (f10 * sin) + f9;
            i7++;
        }
        r6.a.d((B.a) this.f18116h.valueAt(0), view, this.f18118k);
        if (f8 != 0.0f) {
            this.f18123d = true;
        }
        return this.f18123d;
    }

    @Override // y.p
    public final void c(int i7) {
        SparseArray sparseArray = this.f18116h;
        int size = sparseArray.size();
        int c3 = ((B.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        int i8 = c3 + 2;
        this.j = new float[i8];
        this.f18118k = new float[c3];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i8);
        for (int i9 = 0; i9 < size; i9++) {
            int keyAt = sparseArray.keyAt(i9);
            B.a aVar = (B.a) sparseArray.valueAt(i9);
            float[] fArr = (float[]) this.f18117i.valueAt(i9);
            dArr[i9] = keyAt * 0.01d;
            aVar.b(this.j);
            int i10 = 0;
            while (true) {
                if (i10 < this.j.length) {
                    dArr2[i9][i10] = r10[i10];
                    i10++;
                }
            }
            double[] dArr3 = dArr2[i9];
            dArr3[c3] = fArr[0];
            dArr3[c3 + 1] = fArr[1];
        }
        this.f18120a = q4.d.c(i7, dArr, dArr2);
    }
}

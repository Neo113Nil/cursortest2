package p165y;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import p120q4.d;
import r6.a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f18112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f18113g;

    @Override // p165y.k
    public final void b(float f7, int i7) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // p165y.k
    public final void c(View view, float f7) {
        this.f18115a.f(f7, this.f18113g);
        a.d((B.a) this.f18112f.valueAt(0), view, this.f18113g);
    }

    @Override // p165y.k
    public final void d(int i7) {
        SparseArray sparseArray = this.f18112f;
        int size = sparseArray.size();
        int iC = ((B.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.f18113g = new float[iC];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
        for (int i8 = 0; i8 < size; i8++) {
            int iKeyAt = sparseArray.keyAt(i8);
            B.a aVar = (B.a) sparseArray.valueAt(i8);
            dArr[i8] = ((double) iKeyAt) * 0.01d;
            aVar.b(this.f18113g);
            int i9 = 0;
            while (true) {
                float[] fArr = this.f18113g;
                if (i9 < fArr.length) {
                    dArr2[i8][i9] = fArr[i9];
                    i9++;
                }
            }
        }
        this.f18115a = d.c(i7, dArr, dArr2);
    }
}

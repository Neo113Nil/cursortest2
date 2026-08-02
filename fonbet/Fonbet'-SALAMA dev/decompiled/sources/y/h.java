package y;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class h extends k {

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f18106f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f18107g;

    @Override // y.k
    public final void b(float f7, int i7) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // y.k
    public final void c(View view, float f7) {
        this.f18109a.f(f7, this.f18107g);
        r6.a.d((B.a) this.f18106f.valueAt(0), view, this.f18107g);
    }

    @Override // y.k
    public final void d(int i7) {
        SparseArray sparseArray = this.f18106f;
        int size = sparseArray.size();
        int c3 = ((B.a) sparseArray.valueAt(0)).c();
        double[] dArr = new double[size];
        this.f18107g = new float[c3];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, c3);
        for (int i8 = 0; i8 < size; i8++) {
            int keyAt = sparseArray.keyAt(i8);
            B.a aVar = (B.a) sparseArray.valueAt(i8);
            dArr[i8] = keyAt * 0.01d;
            aVar.b(this.f18107g);
            int i9 = 0;
            while (true) {
                if (i9 < this.f18107g.length) {
                    dArr2[i8][i9] = r7[i9];
                    i9++;
                }
            }
        }
        this.f18109a = q4.d.c(i7, dArr, dArr2);
    }
}

package g0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f13055a;

    /* renamed from: b, reason: collision with root package name */
    public n f13056b;

    public r(int i7) {
        this.f13055a = new SparseArray(i7);
    }

    public final void a(n nVar, int i7, int i8) {
        int a2 = nVar.a(i7);
        SparseArray sparseArray = this.f13055a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(a2);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i7), rVar);
        }
        if (i8 > i7) {
            rVar.a(nVar, i7 + 1, i8);
        } else {
            rVar.f13056b = nVar;
        }
    }
}

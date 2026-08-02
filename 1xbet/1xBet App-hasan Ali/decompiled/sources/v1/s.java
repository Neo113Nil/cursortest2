package v1;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f20374a;

    /* renamed from: b, reason: collision with root package name */
    public v f20375b;

    public s(int i) {
        this.f20374a = new SparseArray(i);
    }

    public final void a(v vVar, int i, int i5) {
        int a5 = vVar.a(i);
        SparseArray sparseArray = this.f20374a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(a5);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(vVar.a(i), sVar);
        }
        if (i5 > i) {
            sVar.a(vVar, i + 1, i5);
        } else {
            sVar.f20375b = vVar;
        }
    }
}

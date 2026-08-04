package p046g0;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f13061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f13062b;

    public r(int i7) {
        this.f13061a = new SparseArray(i7);
    }

    public final void a(n nVar, int i7, int i8) {
        int iA = nVar.a(i7);
        SparseArray sparseArray = this.f13061a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(iA);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i7), rVar);
        }
        if (i8 > i7) {
            rVar.a(nVar, i7 + 1, i8);
        } else {
            rVar.f13062b = nVar;
        }
    }
}

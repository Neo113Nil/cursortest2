package p151v2;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f17110a;

    public d(SparseBooleanArray sparseBooleanArray) {
        this.f17110a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f17110a;
        a.g(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i7 = t.f17159a;
        SparseBooleanArray sparseBooleanArray = this.f17110a;
        if (i7 >= 24) {
            return sparseBooleanArray.equals(dVar.f17110a);
        }
        if (sparseBooleanArray.size() != dVar.f17110a.size()) {
            return false;
        }
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            if (a(i8) != dVar.a(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = t.f17159a;
        SparseBooleanArray sparseBooleanArray = this.f17110a;
        if (i7 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
            size = (size * 31) + a(i8);
        }
        return size;
    }
}

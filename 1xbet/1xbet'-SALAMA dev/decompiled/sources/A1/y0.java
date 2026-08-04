package A1;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p151v2.d f616a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        p151v2.a.h(!false);
        new p151v2.d(sparseBooleanArray);
    }

    public y0(p151v2.d dVar) {
        this.f616a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return this.f616a.equals(((y0) obj).f616a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f616a.hashCode();
    }
}

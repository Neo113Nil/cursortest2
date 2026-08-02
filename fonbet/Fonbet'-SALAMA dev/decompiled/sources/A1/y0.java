package A1;

import android.util.SparseBooleanArray;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class y0 implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public final v2.d f616a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC1664a.h(!false);
        new v2.d(sparseBooleanArray);
    }

    public y0(v2.d dVar) {
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

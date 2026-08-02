package X0;

import g6.AbstractC1159h;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7455a;

    public l(List list) {
        this.f7455a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.class.equals(obj.getClass())) {
            return false;
        }
        return this.f7455a.equals(((l) obj).f7455a);
    }

    public final int hashCode() {
        return this.f7455a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return AbstractC1159h.T0(this.f7455a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}

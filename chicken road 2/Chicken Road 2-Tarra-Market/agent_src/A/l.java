package A;

import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f31a;

    public l(List list) {
        this.f31a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.class.equals(obj.getClass())) {
            return false;
        }
        return this.f31a.equals(((l) obj).f31a);
    }

    public final int hashCode() {
        return this.f31a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return L0.d.T(this.f31a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}

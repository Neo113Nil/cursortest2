package m0;

import g4.AbstractC0465j;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11117a;

    public k(List list) {
        this.f11117a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f11117a.equals(((k) obj).f11117a);
    }

    public final int hashCode() {
        return this.f11117a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return AbstractC0465j.K0(this.f11117a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}

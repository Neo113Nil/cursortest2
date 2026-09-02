package w;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1305a;

    public k(List list) {
        this.f1305a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1305a.equals(((k) obj).f1305a);
    }

    public final int hashCode() {
        return this.f1305a.hashCode();
    }

    public final String toString() {
        return X.e.H((Collection) this.f1305a, "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}

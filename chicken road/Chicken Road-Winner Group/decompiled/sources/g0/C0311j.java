package g0;

import e2.AbstractC0292g;
import java.util.List;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4970a;

    public C0311j(List list) {
        this.f4970a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0311j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f4970a.equals(((C0311j) obj).f4970a);
    }

    public final int hashCode() {
        return this.f4970a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return AbstractC0292g.Z(this.f4970a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}

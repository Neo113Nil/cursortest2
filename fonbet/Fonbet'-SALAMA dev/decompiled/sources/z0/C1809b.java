package z0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import t6.h;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1809b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f18428a;

    /* JADX WARN: Multi-variable type inference failed */
    public C1809b(List list) {
        h.e(list, "topics");
        this.f18428a = (AbstractCollection) list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1809b)) {
            return false;
        }
        ?? r02 = this.f18428a;
        C1809b c1809b = (C1809b) obj;
        if (r02.size() != c1809b.f18428a.size()) {
            return false;
        }
        return new HashSet((Collection) r02).equals(new HashSet(c1809b.f18428a));
    }

    public final int hashCode() {
        return Objects.hash(this.f18428a);
    }

    public final String toString() {
        return "Topics=" + this.f18428a;
    }
}

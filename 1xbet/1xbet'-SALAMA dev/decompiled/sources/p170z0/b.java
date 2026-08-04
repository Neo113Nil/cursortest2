package p170z0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractCollection f18434a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List list) {
        h.e(list, "topics");
        this.f18434a = (AbstractCollection) list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ?? r7 = this.f18434a;
        b bVar = (b) obj;
        if (r7.size() != bVar.f18434a.size()) {
            return false;
        }
        return new HashSet((Collection) r7).equals(new HashSet(bVar.f18434a));
    }

    public final int hashCode() {
        return Objects.hash(this.f18434a);
    }

    public final String toString() {
        return "Topics=" + this.f18434a;
    }
}

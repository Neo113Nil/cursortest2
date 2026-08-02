package P1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractCollection f4702a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List list) {
        l.f("topics", list);
        this.f4702a = (AbstractCollection) list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.AbstractCollection, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.AbstractCollection, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ?? r02 = this.f4702a;
        b bVar = (b) obj;
        if (r02.size() != bVar.f4702a.size()) {
            return false;
        }
        return new HashSet((Collection) r02).equals(new HashSet(bVar.f4702a));
    }

    public final int hashCode() {
        return Objects.hash(this.f4702a);
    }

    public final String toString() {
        return "Topics=" + this.f4702a;
    }
}

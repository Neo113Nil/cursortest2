package E3;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: E3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0159q extends K implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f2066a;

    public C0159q(Comparator comparator) {
        this.f2066a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f2066a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0159q) {
            return this.f2066a.equals(((C0159q) obj).f2066a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2066a.hashCode();
    }

    public final String toString() {
        return this.f2066a.toString();
    }
}

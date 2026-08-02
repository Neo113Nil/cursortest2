package H4;

import com.google.firebase.Timestamp;

/* loaded from: classes2.dex */
public final class n implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f3332b = new n(new Timestamp(0, 0));

    /* renamed from: a, reason: collision with root package name */
    public final Timestamp f3333a;

    public n(Timestamp timestamp) {
        this.f3333a = timestamp;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(n nVar) {
        return this.f3333a.compareTo(nVar.f3333a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && compareTo((n) obj) == 0;
    }

    public final int hashCode() {
        return this.f3333a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotVersion(seconds=");
        Timestamp timestamp = this.f3333a;
        sb.append(timestamp.f11828a);
        sb.append(", nanos=");
        return e1.k.g(sb, timestamp.f11829b, ")");
    }
}

package B4;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T f1109e;

    public K(J j) {
        this.f1105a = j.f1099a;
        this.f1106b = j.f1100b;
        this.f1107c = j.f1101c;
        this.f1108d = j.f1102d;
        this.f1109e = j.f1103e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k7 = (K) obj;
        if (this.f1106b == k7.f1106b && this.f1107c == k7.f1107c && this.f1108d == k7.f1108d && this.f1105a.equals(k7.f1105a)) {
            return Objects.equals(this.f1109e, k7.f1109e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f1105a.hashCode() * 31) + (this.f1106b ? 1 : 0)) * 31) + (this.f1107c ? 1 : 0)) * 31;
        long j = this.f1108d;
        int i7 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        T t7 = this.f1109e;
        return i7 + (t7 != null ? t7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseFirestoreSettings{host=");
        sb.append(this.f1105a);
        sb.append(", sslEnabled=");
        sb.append(this.f1106b);
        sb.append(", persistenceEnabled=");
        sb.append(this.f1107c);
        sb.append(", cacheSizeBytes=");
        sb.append(this.f1108d);
        sb.append(", cacheSettings=");
        T t7 = this.f1109e;
        sb.append(t7);
        if (sb.toString() == null) {
            return "null";
        }
        return t7.toString() + "}";
    }
}

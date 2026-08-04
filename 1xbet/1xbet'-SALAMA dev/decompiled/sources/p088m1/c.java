package p088m1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f15213b;

    public c(String str, long j) {
        this.f15212a = str;
        this.f15213b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f15212a.equals(cVar.f15212a)) {
            return false;
        }
        Long l7 = cVar.f15213b;
        Long l8 = this.f15213b;
        if (l8 != null) {
            return l8.equals(l7);
        }
        return l7 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f15212a.hashCode() * 31;
        Long l7 = this.f15213b;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }
}

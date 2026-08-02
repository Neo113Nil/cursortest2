package o2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f18623a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f18624b;

    public c(String str, long j5) {
        this.f18623a = str;
        this.f18624b = Long.valueOf(j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f18623a.equals(cVar.f18623a)) {
            return false;
        }
        Long l5 = cVar.f18624b;
        Long l6 = this.f18624b;
        return l6 != null ? l6.equals(l5) : l5 == null;
    }

    public final int hashCode() {
        int hashCode = this.f18623a.hashCode() * 31;
        Long l5 = this.f18624b;
        return hashCode + (l5 != null ? l5.hashCode() : 0);
    }
}

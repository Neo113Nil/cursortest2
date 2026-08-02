package m1;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428c {

    /* renamed from: a, reason: collision with root package name */
    public final String f15206a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f15207b;

    public C1428c(String str, long j) {
        this.f15206a = str;
        this.f15207b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1428c)) {
            return false;
        }
        C1428c c1428c = (C1428c) obj;
        if (!this.f15206a.equals(c1428c.f15206a)) {
            return false;
        }
        Long l7 = c1428c.f15207b;
        Long l8 = this.f15207b;
        return l8 != null ? l8.equals(l7) : l7 == null;
    }

    public final int hashCode() {
        int hashCode = this.f15206a.hashCode() * 31;
        Long l7 = this.f15207b;
        return hashCode + (l7 != null ? l7.hashCode() : 0);
    }
}

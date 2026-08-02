package p000;

/* JADX INFO: renamed from: ia */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0316ia {

    /* JADX INFO: renamed from: a */
    public final long f3500a;

    /* JADX INFO: renamed from: b */
    public final C0648ra f3501b;

    /* JADX INFO: renamed from: c */
    public final C0869x9 f3502c;

    public C0316ia(long j, C0648ra c0648ra, C0869x9 c0869x9) {
        this.f3500a = j;
        this.f3501b = c0648ra;
        this.f3502c = c0869x9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0316ia)) {
            return false;
        }
        C0316ia c0316ia = (C0316ia) obj;
        return this.f3500a == c0316ia.f3500a && this.f3501b.equals(c0316ia.f3501b) && this.f3502c.equals(c0316ia.f3502c);
    }

    public final int hashCode() {
        long j = this.f3500a;
        return this.f3502c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f3501b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f3500a + ", transportContext=" + this.f3501b + ", event=" + this.f3502c + "}";
    }
}

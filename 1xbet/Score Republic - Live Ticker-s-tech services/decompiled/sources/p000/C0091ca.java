package p000;

/* JADX INFO: renamed from: ca */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0091ca {

    /* JADX INFO: renamed from: a */
    public final String f1178a;

    /* JADX INFO: renamed from: b */
    public final long f1179b;

    /* JADX INFO: renamed from: c */
    public final long f1180c;

    public C0091ca(String str, long j, long j2) {
        this.f1178a = str;
        this.f1179b = j;
        this.f1180c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0091ca) {
            C0091ca c0091ca = (C0091ca) obj;
            if (this.f1178a.equals(c0091ca.f1178a) && this.f1179b == c0091ca.f1179b && this.f1180c == c0091ca.f1180c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1178a.hashCode() ^ 1000003) * 1000003;
        long j = this.f1179b;
        long j2 = this.f1180c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f1178a + ", tokenExpirationTimestamp=" + this.f1179b + ", tokenCreationTimestamp=" + this.f1180c + "}";
    }
}

package g2;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13178b;

    public q(long j, long j3) {
        this.f13177a = j;
        this.f13178b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f13177a == qVar.f13177a && this.f13178b == qVar.f13178b;
    }

    public final int hashCode() {
        return (((int) this.f13177a) * 31) + ((int) this.f13178b);
    }
}

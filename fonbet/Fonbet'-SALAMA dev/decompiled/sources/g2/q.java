package g2;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f13171a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13172b;

    public q(long j, long j3) {
        this.f13171a = j;
        this.f13172b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f13171a == qVar.f13171a && this.f13172b == qVar.f13172b;
    }

    public final int hashCode() {
        return (((int) this.f13171a) * 31) + ((int) this.f13172b);
    }
}

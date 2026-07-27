package G0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final P0.j f387a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f388b;

    public b(P0.j jVar, HashMap hashMap) {
        this.f387a = jVar;
        this.f388b = hashMap;
    }

    public final long a(x0.c cVar, long j3, int i3) {
        long c3 = j3 - this.f387a.c();
        c cVar2 = (c) this.f388b.get(cVar);
        long j4 = cVar2.f389a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i3 - 1) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j4 > 1 ? j4 : 2L) * r12))), c3), cVar2.f390b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f387a.equals(bVar.f387a) && this.f388b.equals(bVar.f388b);
    }

    public final int hashCode() {
        return ((this.f387a.hashCode() ^ 1000003) * 1000003) ^ this.f388b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f387a + ", values=" + this.f388b + "}";
    }
}

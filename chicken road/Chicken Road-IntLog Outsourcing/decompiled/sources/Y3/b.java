package Y3;

import a4.C0195a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0195a f3697a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3698b;

    /* renamed from: c, reason: collision with root package name */
    public final W3.a f3699c;

    public b(C0195a c0195a, long j2, W3.a aVar) {
        if (c0195a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f3697a = c0195a;
        this.f3698b = j2;
        if (aVar == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.f3699c = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        Object obj2 = J3.d.f1367a;
        return obj2.equals(obj2) && this.f3697a.equals(bVar.f3697a) && this.f3698b == bVar.f3698b && this.f3699c.equals(bVar.f3699c);
    }

    public final int hashCode() {
        int hashCode = (((J3.d.f1367a.hashCode() ^ 1000003) * 1000003) ^ this.f3697a.hashCode()) * 1000003;
        long j2 = this.f3698b;
        return ((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f3699c.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + J3.d.f1367a + ", resource=" + this.f3697a + ", startEpochNanos=" + this.f3698b + ", exemplarFilter=" + this.f3699c + "}";
    }
}

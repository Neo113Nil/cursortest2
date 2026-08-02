package t2;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1605a {

    /* renamed from: a, reason: collision with root package name */
    public final long f16280a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16281b;

    public C1605a(long j, long j3) {
        this.f16280a = j;
        this.f16281b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1605a)) {
            return false;
        }
        C1605a c1605a = (C1605a) obj;
        return this.f16280a == c1605a.f16280a && this.f16281b == c1605a.f16281b;
    }

    public final int hashCode() {
        return (((int) this.f16280a) * 31) + ((int) this.f16281b);
    }
}

package n4;

/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final long f15369a;

    /* renamed from: b, reason: collision with root package name */
    public final C1473g f15370b;

    /* renamed from: c, reason: collision with root package name */
    public final v4.r f15371c;

    /* renamed from: d, reason: collision with root package name */
    public final C1468b f15372d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15373e;

    public H(long j, C1473g c1473g, v4.r rVar, boolean z4) {
        this.f15369a = j;
        this.f15370b = c1473g;
        this.f15371c = rVar;
        this.f15372d = null;
        this.f15373e = z4;
    }

    public final C1468b a() {
        C1468b c1468b = this.f15372d;
        if (c1468b != null) {
            return c1468b;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final v4.r b() {
        v4.r rVar = this.f15371c;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        return this.f15371c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h6 = (H) obj;
        if (this.f15369a != h6.f15369a || !this.f15370b.equals(h6.f15370b) || this.f15373e != h6.f15373e) {
            return false;
        }
        v4.r rVar = h6.f15371c;
        v4.r rVar2 = this.f15371c;
        if (rVar2 == null ? rVar != null : !rVar2.equals(rVar)) {
            return false;
        }
        C1468b c1468b = h6.f15372d;
        C1468b c1468b2 = this.f15372d;
        return c1468b2 == null ? c1468b == null : c1468b2.equals(c1468b);
    }

    public final int hashCode() {
        int hashCode = (this.f15370b.hashCode() + ((Boolean.valueOf(this.f15373e).hashCode() + (Long.valueOf(this.f15369a).hashCode() * 31)) * 31)) * 31;
        v4.r rVar = this.f15371c;
        int hashCode2 = (hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C1468b c1468b = this.f15372d;
        return hashCode2 + (c1468b != null ? c1468b.hashCode() : 0);
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f15369a + " path=" + this.f15370b + " visible=" + this.f15373e + " overwrite=" + this.f15371c + " merge=" + this.f15372d + "}";
    }

    public H(long j, C1468b c1468b, C1473g c1473g) {
        this.f15369a = j;
        this.f15370b = c1473g;
        this.f15371c = null;
        this.f15372d = c1468b;
        this.f15373e = true;
    }
}

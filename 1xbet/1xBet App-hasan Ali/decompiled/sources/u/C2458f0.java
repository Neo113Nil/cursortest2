package u;

/* renamed from: u.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2458f0 implements InterfaceC2464k {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2430A f19812a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19813b;

    public C2458f0(InterfaceC2430A interfaceC2430A, long j5) {
        this.f19812a = interfaceC2430A;
        this.f19813b = j5;
    }

    @Override // u.InterfaceC2464k
    public final C0 a(A0 a02) {
        return new C2460g0(this.f19812a.a(a02), this.f19813b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2458f0)) {
            return false;
        }
        C2458f0 c2458f0 = (C2458f0) obj;
        return c2458f0.f19813b == this.f19813b && kotlin.jvm.internal.l.a(c2458f0.f19812a, this.f19812a);
    }

    public final int hashCode() {
        int hashCode = this.f19812a.hashCode() * 31;
        long j5 = this.f19813b;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }
}

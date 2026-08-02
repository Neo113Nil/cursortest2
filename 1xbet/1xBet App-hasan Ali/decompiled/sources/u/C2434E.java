package u;

/* renamed from: u.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2434E implements InterfaceC2464k {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2476x f19659a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19660b;

    public C2434E(InterfaceC2476x interfaceC2476x, long j5) {
        this.f19659a = interfaceC2476x;
        this.f19660b = j5;
    }

    @Override // u.InterfaceC2464k
    public final C0 a(A0 a02) {
        D0 a5 = this.f19659a.a(a02);
        long j5 = this.f19660b;
        T2.z zVar = new T2.z();
        zVar.f5756m = a5;
        zVar.f5754k = (a5.n() + a5.l()) * 1000000;
        zVar.f5755l = j5 * 1000000;
        return zVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2434E)) {
            return false;
        }
        C2434E c2434e = (C2434E) obj;
        if (c2434e.f19659a.equals(this.f19659a)) {
            return c2434e.f19660b == this.f19660b;
        }
        return false;
    }

    public final int hashCode() {
        int b3 = (AbstractC2462i.b(1) + (this.f19659a.hashCode() * 31)) * 31;
        long j5 = this.f19660b;
        return b3 + ((int) (j5 ^ (j5 >>> 32)));
    }
}

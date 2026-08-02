package z;

import x0.j0;

/* renamed from: z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2715q implements InterfaceC2714p {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f21564a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21565b;

    public C2715q(j0 j0Var, long j5) {
        this.f21564a = j0Var;
        this.f21565b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2715q)) {
            return false;
        }
        C2715q c2715q = (C2715q) obj;
        return kotlin.jvm.internal.l.a(this.f21564a, c2715q.f21564a) && W0.a.b(this.f21565b, c2715q.f21565b);
    }

    public final int hashCode() {
        int hashCode = this.f21564a.hashCode() * 31;
        long j5 = this.f21565b;
        return ((int) (j5 ^ (j5 >>> 32))) + hashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f21564a + ", constraints=" + ((Object) W0.a.l(this.f21565b)) + ')';
    }
}

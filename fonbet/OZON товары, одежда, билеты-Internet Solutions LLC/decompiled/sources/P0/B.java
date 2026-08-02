package P0;

import Sc.C;
import l1.C7807Z;

/* loaded from: classes8.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final long f20592a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20593b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20594c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20595d;

    public B(long j11, long j12, long j13, long j14) {
        this.f20592a = j11;
        this.f20593b = j12;
        this.f20594c = j13;
        this.f20595d = j14;
    }

    public static B c(B b11, long j11, long j12) {
        if (j11 == 16) {
            j11 = b11.f20593b;
        }
        long j13 = j11;
        if (j12 == 16) {
            j12 = b11.f20595d;
        }
        return new B(b11.f20592a, j13, b11.f20594c, j12);
    }

    public final long a(boolean z11) {
        return z11 ? this.f20592a : this.f20594c;
    }

    public final long b(boolean z11) {
        return z11 ? this.f20593b : this.f20595d;
    }

    public final long d() {
        return this.f20593b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b11 = (B) obj;
        return C7807Z.p(this.f20592a, b11.f20592a) && C7807Z.p(this.f20593b, b11.f20593b) && C7807Z.p(this.f20594c, b11.f20594c) && C7807Z.p(this.f20595d, b11.f20595d);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f20595d) + Pk0.c.a(Pk0.c.a(Long.hashCode(this.f20592a) * 31, 31, this.f20593b), 31, this.f20594c);
    }
}

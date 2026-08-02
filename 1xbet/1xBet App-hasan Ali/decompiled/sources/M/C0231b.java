package M;

import n.AbstractC2107A;

/* renamed from: M.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231b {

    /* renamed from: a, reason: collision with root package name */
    public final long f3291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3292b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3293c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3294d;

    public C0231b(long j5, long j6, long j7, long j8) {
        this.f3291a = j5;
        this.f3292b = j6;
        this.f3293c = j7;
        this.f3294d = j8;
    }

    public final C0231b a(long j5, long j6, long j7, long j8) {
        if (j5 == 16) {
            j5 = this.f3291a;
        }
        return new C0231b(j5, j6 != 16 ? j6 : this.f3292b, j7 != 16 ? j7 : this.f3293c, j8 != 16 ? j8 : this.f3294d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0231b)) {
            return false;
        }
        C0231b c0231b = (C0231b) obj;
        return i0.p.c(this.f3291a, c0231b.f3291a) && i0.p.c(this.f3292b, c0231b.f3292b) && i0.p.c(this.f3293c, c0231b.f3293c) && i0.p.c(this.f3294d, c0231b.f3294d);
    }

    public final int hashCode() {
        return i0.p.i(this.f3294d) + AbstractC2107A.o(AbstractC2107A.o(i0.p.i(this.f3291a) * 31, 31, this.f3292b), 31, this.f3293c);
    }
}

package M;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final long f3135a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3136b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3137c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3138d;

    public C(long j5, long j6, long j7, long j8) {
        this.f3135a = j5;
        this.f3136b = j6;
        this.f3137c = j7;
        this.f3138d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c5 = (C) obj;
        return i0.p.c(this.f3135a, c5.f3135a) && i0.p.c(this.f3136b, c5.f3136b) && i0.p.c(this.f3137c, c5.f3137c) && i0.p.c(this.f3138d, c5.f3138d);
    }

    public final int hashCode() {
        return i0.p.i(this.f3138d) + AbstractC2107A.o(AbstractC2107A.o(i0.p.i(this.f3135a) * 31, 31, this.f3136b), 31, this.f3137c);
    }
}

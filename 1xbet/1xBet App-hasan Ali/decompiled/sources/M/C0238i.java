package M;

import n.AbstractC2107A;

/* renamed from: M.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238i {

    /* renamed from: a, reason: collision with root package name */
    public final long f3348a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3349b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3350c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3351d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3352e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3353g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3354h;

    public C0238i(long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f3348a = j5;
        this.f3349b = j6;
        this.f3350c = j7;
        this.f3351d = j8;
        this.f3352e = j9;
        this.f = j10;
        this.f3353g = j11;
        this.f3354h = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0238i)) {
            return false;
        }
        C0238i c0238i = (C0238i) obj;
        return i0.p.c(this.f3348a, c0238i.f3348a) && i0.p.c(this.f3349b, c0238i.f3349b) && i0.p.c(this.f3350c, c0238i.f3350c) && i0.p.c(this.f3351d, c0238i.f3351d) && i0.p.c(this.f3352e, c0238i.f3352e) && i0.p.c(this.f, c0238i.f) && i0.p.c(this.f3353g, c0238i.f3353g) && i0.p.c(this.f3354h, c0238i.f3354h);
    }

    public final int hashCode() {
        return i0.p.i(this.f3354h) + AbstractC2107A.o(AbstractC2107A.o(AbstractC2107A.o(AbstractC2107A.o(AbstractC2107A.o(AbstractC2107A.o(i0.p.i(this.f3348a) * 31, 31, this.f3349b), 31, this.f3350c), 31, this.f3351d), 31, this.f3352e), 31, this.f), 31, this.f3353g);
    }
}

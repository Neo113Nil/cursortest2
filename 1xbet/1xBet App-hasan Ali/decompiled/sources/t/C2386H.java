package t;

import n.AbstractC2107A;

/* renamed from: t.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2386H {

    /* renamed from: a, reason: collision with root package name */
    public final float f19345a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19346b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19347c;

    public C2386H(float f, float f5, long j5) {
        this.f19345a = f;
        this.f19346b = f5;
        this.f19347c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2386H)) {
            return false;
        }
        C2386H c2386h = (C2386H) obj;
        return Float.compare(this.f19345a, c2386h.f19345a) == 0 && Float.compare(this.f19346b, c2386h.f19346b) == 0 && this.f19347c == c2386h.f19347c;
    }

    public final int hashCode() {
        int n5 = AbstractC2107A.n(this.f19346b, Float.floatToIntBits(this.f19345a) * 31, 31);
        long j5 = this.f19347c;
        return n5 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f19345a + ", distance=" + this.f19346b + ", duration=" + this.f19347c + ')';
    }
}

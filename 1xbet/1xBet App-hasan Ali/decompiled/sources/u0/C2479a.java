package u0;

import n.AbstractC2107A;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2479a {

    /* renamed from: a, reason: collision with root package name */
    public long f19975a;

    /* renamed from: b, reason: collision with root package name */
    public float f19976b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2479a)) {
            return false;
        }
        C2479a c2479a = (C2479a) obj;
        return this.f19975a == c2479a.f19975a && Float.compare(this.f19976b, c2479a.f19976b) == 0;
    }

    public final int hashCode() {
        long j5 = this.f19975a;
        return Float.floatToIntBits(this.f19976b) + (((int) (j5 ^ (j5 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f19975a);
        sb.append(", dataPoint=");
        return AbstractC2107A.s(sb, this.f19976b, ')');
    }
}

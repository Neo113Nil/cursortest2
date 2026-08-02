package B;

import n.AbstractC2107A;

/* renamed from: B.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080i {

    /* renamed from: a, reason: collision with root package name */
    public final int f678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f679b;

    public C0080i(int i, int i5) {
        this.f678a = i;
        this.f679b = i5;
        if (i < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i5 < i) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0080i)) {
            return false;
        }
        C0080i c0080i = (C0080i) obj;
        return this.f678a == c0080i.f678a && this.f679b == c0080i.f679b;
    }

    public final int hashCode() {
        return (this.f678a * 31) + this.f679b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f678a);
        sb.append(", end=");
        return AbstractC2107A.t(sb, this.f679b, ')');
    }
}

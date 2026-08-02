package z;

import n.AbstractC2107A;

/* renamed from: z.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2724z {

    /* renamed from: a, reason: collision with root package name */
    public final int f21581a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21583c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21584d;

    public C2724z(int i, int i5, int i6, int i7) {
        this.f21581a = i;
        this.f21582b = i5;
        this.f21583c = i6;
        this.f21584d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2724z)) {
            return false;
        }
        C2724z c2724z = (C2724z) obj;
        return this.f21581a == c2724z.f21581a && this.f21582b == c2724z.f21582b && this.f21583c == c2724z.f21583c && this.f21584d == c2724z.f21584d;
    }

    public final int hashCode() {
        return (((((this.f21581a * 31) + this.f21582b) * 31) + this.f21583c) * 31) + this.f21584d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f21581a);
        sb.append(", top=");
        sb.append(this.f21582b);
        sb.append(", right=");
        sb.append(this.f21583c);
        sb.append(", bottom=");
        return AbstractC2107A.t(sb, this.f21584d, ')');
    }
}

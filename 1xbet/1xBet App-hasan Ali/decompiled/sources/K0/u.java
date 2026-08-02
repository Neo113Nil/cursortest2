package K0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final S0.d f2868a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2869b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2870c;

    public u(S0.d dVar, int i, int i5) {
        this.f2868a = dVar;
        this.f2869b = i;
        this.f2870c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f2868a.equals(uVar.f2868a) && this.f2869b == uVar.f2869b && this.f2870c == uVar.f2870c;
    }

    public final int hashCode() {
        return (((this.f2868a.hashCode() * 31) + this.f2869b) * 31) + this.f2870c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f2868a);
        sb.append(", startIndex=");
        sb.append(this.f2869b);
        sb.append(", endIndex=");
        return AbstractC2107A.t(sb, this.f2870c, ')');
    }
}

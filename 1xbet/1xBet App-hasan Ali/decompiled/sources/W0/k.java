package W0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f6010e = new k(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f6011a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6012b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6013c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6014d;

    public k(int i, int i5, int i6, int i7) {
        this.f6011a = i;
        this.f6012b = i5;
        this.f6013c = i6;
        this.f6014d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6011a == kVar.f6011a && this.f6012b == kVar.f6012b && this.f6013c == kVar.f6013c && this.f6014d == kVar.f6014d;
    }

    public final int hashCode() {
        return (((((this.f6011a * 31) + this.f6012b) * 31) + this.f6013c) * 31) + this.f6014d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f6011a);
        sb.append(", ");
        sb.append(this.f6012b);
        sb.append(", ");
        sb.append(this.f6013c);
        sb.append(", ");
        return AbstractC2107A.t(sb, this.f6014d, ')');
    }
}

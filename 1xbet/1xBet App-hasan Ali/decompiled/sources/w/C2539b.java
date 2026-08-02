package w;

import n.AbstractC2107A;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2539b {

    /* renamed from: a, reason: collision with root package name */
    public final long f20448a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20449b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20450c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20451d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20452e;

    public C2539b(long j5, long j6, long j7, long j8, long j9) {
        this.f20448a = j5;
        this.f20449b = j6;
        this.f20450c = j7;
        this.f20451d = j8;
        this.f20452e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2539b)) {
            return false;
        }
        C2539b c2539b = (C2539b) obj;
        return i0.p.c(this.f20448a, c2539b.f20448a) && i0.p.c(this.f20449b, c2539b.f20449b) && i0.p.c(this.f20450c, c2539b.f20450c) && i0.p.c(this.f20451d, c2539b.f20451d) && i0.p.c(this.f20452e, c2539b.f20452e);
    }

    public final int hashCode() {
        return i0.p.i(this.f20452e) + AbstractC2107A.o(AbstractC2107A.o(AbstractC2107A.o(i0.p.i(this.f20448a) * 31, 31, this.f20449b), 31, this.f20450c), 31, this.f20451d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        AbstractC2107A.z(this.f20448a, sb, ", textColor=");
        AbstractC2107A.z(this.f20449b, sb, ", iconColor=");
        AbstractC2107A.z(this.f20450c, sb, ", disabledTextColor=");
        AbstractC2107A.z(this.f20451d, sb, ", disabledIconColor=");
        sb.append((Object) i0.p.j(this.f20452e));
        sb.append(')');
        return sb.toString();
    }
}

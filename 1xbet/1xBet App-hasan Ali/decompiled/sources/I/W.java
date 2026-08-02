package I;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final long f2455a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2456b;

    public W(long j5, long j6) {
        this.f2455a = j5;
        this.f2456b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w5 = (W) obj;
        return i0.p.c(this.f2455a, w5.f2455a) && i0.p.c(this.f2456b, w5.f2456b);
    }

    public final int hashCode() {
        return i0.p.i(this.f2456b) + (i0.p.i(this.f2455a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        AbstractC2107A.z(this.f2455a, sb, ", selectionBackgroundColor=");
        sb.append((Object) i0.p.j(this.f2456b));
        sb.append(')');
        return sb.toString();
    }
}

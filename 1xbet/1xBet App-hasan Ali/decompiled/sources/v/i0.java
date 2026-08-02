package v;

import n.AbstractC2107A;
import z.C2681E;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f20252a;

    /* renamed from: b, reason: collision with root package name */
    public final C2681E f20253b;

    public i0() {
        long d5 = i0.F.d(4284900966L);
        C2681E a5 = androidx.compose.foundation.layout.b.a(0.0f, 0.0f, 3);
        this.f20252a = d5;
        this.f20253b = a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration", obj);
        i0 i0Var = (i0) obj;
        return i0.p.c(this.f20252a, i0Var.f20252a) && kotlin.jvm.internal.l.a(this.f20253b, i0Var.f20253b);
    }

    public final int hashCode() {
        return this.f20253b.hashCode() + (i0.p.i(this.f20252a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC2107A.z(this.f20252a, sb, ", drawPadding=");
        sb.append(this.f20253b);
        sb.append(')');
        return sb.toString();
    }
}

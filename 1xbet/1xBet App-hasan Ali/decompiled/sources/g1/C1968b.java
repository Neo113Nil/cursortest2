package g1;

import android.graphics.Insets;
import n.AbstractC2107A;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1968b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1968b f17072e = new C1968b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f17073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17075c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17076d;

    public C1968b(int i, int i5, int i6, int i7) {
        this.f17073a = i;
        this.f17074b = i5;
        this.f17075c = i6;
        this.f17076d = i7;
    }

    public static C1968b a(C1968b c1968b, C1968b c1968b2) {
        return b(Math.max(c1968b.f17073a, c1968b2.f17073a), Math.max(c1968b.f17074b, c1968b2.f17074b), Math.max(c1968b.f17075c, c1968b2.f17075c), Math.max(c1968b.f17076d, c1968b2.f17076d));
    }

    public static C1968b b(int i, int i5, int i6, int i7) {
        return (i == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f17072e : new C1968b(i, i5, i6, i7);
    }

    public static C1968b c(Insets insets) {
        int i;
        int i5;
        int i6;
        int i7;
        i = insets.left;
        i5 = insets.top;
        i6 = insets.right;
        i7 = insets.bottom;
        return b(i, i5, i6, i7);
    }

    public final Insets d() {
        return D0.a.h(this.f17073a, this.f17074b, this.f17075c, this.f17076d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1968b.class != obj.getClass()) {
            return false;
        }
        C1968b c1968b = (C1968b) obj;
        return this.f17076d == c1968b.f17076d && this.f17073a == c1968b.f17073a && this.f17075c == c1968b.f17075c && this.f17074b == c1968b.f17074b;
    }

    public final int hashCode() {
        return (((((this.f17073a * 31) + this.f17074b) * 31) + this.f17075c) * 31) + this.f17076d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f17073a);
        sb.append(", top=");
        sb.append(this.f17074b);
        sb.append(", right=");
        sb.append(this.f17075c);
        sb.append(", bottom=");
        return AbstractC2107A.t(sb, this.f17076d, '}');
    }
}

package n1;

import android.graphics.Point;

/* renamed from: n1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2170k {

    /* renamed from: a, reason: collision with root package name */
    public final int f18438a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18439b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f18440c;

    public C2170k(int i, int i5, Point point) {
        int i6 = point.x;
        int i7 = point.y;
        this.f18438a = i;
        this.f18439b = i5;
        this.f18440c = new Point(i6, i7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2170k) {
            C2170k c2170k = (C2170k) obj;
            if (this.f18438a == c2170k.f18438a && this.f18439b == c2170k.f18439b && this.f18440c.equals(c2170k.f18440c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18440c.hashCode() + (((this.f18438a * 31) + this.f18439b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f18438a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f18439b);
        sb.append(", center=");
        sb.append(this.f18440c);
        sb.append('}');
        return sb.toString();
    }
}

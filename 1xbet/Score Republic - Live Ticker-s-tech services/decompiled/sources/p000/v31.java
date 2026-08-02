package p000;

import android.graphics.Point;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v31 {

    /* JADX INFO: renamed from: a */
    public final int f8050a;

    /* JADX INFO: renamed from: b */
    public final int f8051b;

    /* JADX INFO: renamed from: c */
    public final Point f8052c;

    public v31(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f8050a = i;
        this.f8051b = i2;
        this.f8052c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v31) {
            v31 v31Var = (v31) obj;
            if (this.f8050a == v31Var.f8050a && this.f8051b == v31Var.f8051b && this.f8052c.equals(v31Var.f8052c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8052c.hashCode() + (((this.f8050a * 31) + this.f8051b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f8050a;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f8051b);
        sb.append(", center=");
        sb.append(this.f8052c);
        sb.append('}');
        return sb.toString();
    }
}

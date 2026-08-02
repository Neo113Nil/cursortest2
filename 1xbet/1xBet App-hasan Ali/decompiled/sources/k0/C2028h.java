package k0;

import n.AbstractC2107A;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2028h extends AbstractC2024d {

    /* renamed from: b, reason: collision with root package name */
    public final float f17548b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17549c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17550d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17551e;

    public C2028h(float f, float f5, int i, int i5, int i6) {
        f5 = (i6 & 2) != 0 ? 4.0f : f5;
        i = (i6 & 4) != 0 ? 0 : i;
        i5 = (i6 & 8) != 0 ? 0 : i5;
        this.f17548b = f;
        this.f17549c = f5;
        this.f17550d = i;
        this.f17551e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2028h)) {
            return false;
        }
        C2028h c2028h = (C2028h) obj;
        if (this.f17548b == c2028h.f17548b && this.f17549c == c2028h.f17549c) {
            if (this.f17550d == c2028h.f17550d) {
                if (this.f17551e == c2028h.f17551e) {
                    c2028h.getClass();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((AbstractC2107A.n(this.f17549c, Float.floatToIntBits(this.f17548b) * 31, 31) + this.f17550d) * 31) + this.f17551e) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f17548b);
        sb.append(", miter=");
        sb.append(this.f17549c);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.f17550d;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i5 = this.f17551e;
        if (i5 == 0) {
            str = "Miter";
        } else if (i5 == 1) {
            str = "Round";
        } else if (i5 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}

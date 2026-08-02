package U0;

import W5.AbstractC0486a1;
import android.graphics.Rect;
import e1.k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6375a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6377c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6378d;

    public b(Rect rect) {
        int i7 = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        this.f6375a = i7;
        this.f6376b = i8;
        this.f6377c = i9;
        this.f6378d = i10;
        if (i7 > i9) {
            throw new IllegalArgumentException(AbstractC0486a1.e(i7, i9, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i8 > i10) {
            throw new IllegalArgumentException(AbstractC0486a1.e(i8, i10, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f6378d - this.f6376b;
    }

    public final int b() {
        return this.f6377c - this.f6375a;
    }

    public final Rect c() {
        return new Rect(this.f6375a, this.f6376b, this.f6377c, this.f6378d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        t6.h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f6375a == bVar.f6375a && this.f6376b == bVar.f6376b && this.f6377c == bVar.f6377c && this.f6378d == bVar.f6378d;
    }

    public final int hashCode() {
        return (((((this.f6375a * 31) + this.f6376b) * 31) + this.f6377c) * 31) + this.f6378d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f6375a);
        sb.append(',');
        sb.append(this.f6376b);
        sb.append(',');
        sb.append(this.f6377c);
        sb.append(',');
        return k.g(sb, this.f6378d, "] }");
    }
}

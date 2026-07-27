package w;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f10433e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f10434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10436c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10437d;

    public c(int i3, int i4, int i5, int i6) {
        this.f10434a = i3;
        this.f10435b = i4;
        this.f10436c = i5;
        this.f10437d = i6;
    }

    public static c a(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f10433e : new c(i3, i4, i5, i6);
    }

    public static c b(Insets insets) {
        int i3;
        int i4;
        int i5;
        int i6;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return a(i3, i4, i5, i6);
    }

    public final Insets c() {
        return AbstractC1220b.a(this.f10434a, this.f10435b, this.f10436c, this.f10437d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10437d == cVar.f10437d && this.f10434a == cVar.f10434a && this.f10436c == cVar.f10436c && this.f10435b == cVar.f10435b;
    }

    public final int hashCode() {
        return (((((this.f10434a * 31) + this.f10435b) * 31) + this.f10436c) * 31) + this.f10437d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10434a + ", top=" + this.f10435b + ", right=" + this.f10436c + ", bottom=" + this.f10437d + '}';
    }
}

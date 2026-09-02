package j;

import android.graphics.Insets;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0774a f6044e = new C0774a(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f6045a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6047c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6048d;

    public C0774a(int i2, int i3, int i4, int i5) {
        this.f6045a = i2;
        this.f6046b = i3;
        this.f6047c = i4;
        this.f6048d = i5;
    }

    public static C0774a a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f6044e : new C0774a(i2, i3, i4, i5);
    }

    public static C0774a b(Insets insets) {
        int i2;
        int i3;
        int i4;
        int i5;
        i2 = insets.left;
        i3 = insets.top;
        i4 = insets.right;
        i5 = insets.bottom;
        return a(i2, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0774a.class != obj.getClass()) {
            return false;
        }
        C0774a c0774a = (C0774a) obj;
        return this.f6048d == c0774a.f6048d && this.f6045a == c0774a.f6045a && this.f6047c == c0774a.f6047c && this.f6046b == c0774a.f6046b;
    }

    public final int hashCode() {
        return (((((this.f6045a * 31) + this.f6046b) * 31) + this.f6047c) * 31) + this.f6048d;
    }

    public final String toString() {
        return "Insets{left=" + this.f6045a + ", top=" + this.f6046b + ", right=" + this.f6047c + ", bottom=" + this.f6048d + '}';
    }
}

package i;

import android.graphics.Insets;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0040a f550e = new C0040a(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f551a;

    /* renamed from: b, reason: collision with root package name */
    public final int f552b;

    /* renamed from: c, reason: collision with root package name */
    public final int f553c;

    /* renamed from: d, reason: collision with root package name */
    public final int f554d;

    public C0040a(int i2, int i3, int i4, int i5) {
        this.f551a = i2;
        this.f552b = i3;
        this.f553c = i4;
        this.f554d = i5;
    }

    public static C0040a a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f550e : new C0040a(i2, i3, i4, i5);
    }

    public static C0040a b(Insets insets) {
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
        if (obj == null || C0040a.class != obj.getClass()) {
            return false;
        }
        C0040a c0040a = (C0040a) obj;
        return this.f554d == c0040a.f554d && this.f551a == c0040a.f551a && this.f553c == c0040a.f553c && this.f552b == c0040a.f552b;
    }

    public final int hashCode() {
        return (((((this.f551a * 31) + this.f552b) * 31) + this.f553c) * 31) + this.f554d;
    }

    public final String toString() {
        return "Insets{left=" + this.f551a + ", top=" + this.f552b + ", right=" + this.f553c + ", bottom=" + this.f554d + '}';
    }
}

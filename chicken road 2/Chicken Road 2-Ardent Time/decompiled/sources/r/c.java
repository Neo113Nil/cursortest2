package r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final r.c f8325e = new r.c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f8326a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8328c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8329d;

    public c(int i2, int i3, int i4, int i5) {
        this.f8326a = i2;
        this.f8327b = i3;
        this.f8328c = i4;
        this.f8329d = i5;
    }

    public static r.c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f8325e : new r.c(i2, i3, i4, i5);
    }

    public static r.c b(android.graphics.Insets insets) {
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

    public final android.graphics.Insets c() {
        return r.AbstractC0984b.a(this.f8326a, this.f8327b, this.f8328c, this.f8329d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.c.class != obj.getClass()) {
            return false;
        }
        r.c cVar = (r.c) obj;
        return this.f8329d == cVar.f8329d && this.f8326a == cVar.f8326a && this.f8328c == cVar.f8328c && this.f8327b == cVar.f8327b;
    }

    public final int hashCode() {
        return (((((this.f8326a * 31) + this.f8327b) * 31) + this.f8328c) * 31) + this.f8329d;
    }

    public final java.lang.String toString() {
        return "Insets{left=" + this.f8326a + ", top=" + this.f8327b + ", right=" + this.f8328c + ", bottom=" + this.f8329d + '}';
    }
}

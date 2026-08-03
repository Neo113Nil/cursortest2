package W;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1805a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1806b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1807c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1808d;

    public b(android.graphics.Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f1805a = i2;
        this.f1806b = i3;
        this.f1807c = i4;
        this.f1808d = i5;
        if (i2 > i4) {
            throw new java.lang.IllegalArgumentException(B1.a.h("Left must be less than or equal to right, left: ", i2, i4, ", right: ").toString());
        }
        if (i3 > i5) {
            throw new java.lang.IllegalArgumentException(B1.a.h("top must be less than or equal to bottom, top: ", i3, i5, ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f1808d - this.f1806b;
    }

    public final int b() {
        return this.f1807c - this.f1805a;
    }

    public final android.graphics.Rect c() {
        return new android.graphics.Rect(this.f1805a, this.f1806b, this.f1807c, this.f1808d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!W.b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        W.b bVar = (W.b) obj;
        return this.f1805a == bVar.f1805a && this.f1806b == bVar.f1806b && this.f1807c == bVar.f1807c && this.f1808d == bVar.f1808d;
    }

    public final int hashCode() {
        return (((((this.f1805a * 31) + this.f1806b) * 31) + this.f1807c) * 31) + this.f1808d;
    }

    public final java.lang.String toString() {
        return W.b.class.getSimpleName() + " { [" + this.f1805a + ',' + this.f1806b + ',' + this.f1807c + ',' + this.f1808d + "] }";
    }
}

package x;

import android.graphics.Rect;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6756a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6757b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6758c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6759d;

    public C0857b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f6756a = i2;
        this.f6757b = i3;
        this.f6758c = i4;
        this.f6759d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f6759d - this.f6757b;
    }

    public final int b() {
        return this.f6758c - this.f6756a;
    }

    public final Rect c() {
        return new Rect(this.f6756a, this.f6757b, this.f6758c, this.f6759d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0857b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C0857b c0857b = (C0857b) obj;
        return this.f6756a == c0857b.f6756a && this.f6757b == c0857b.f6757b && this.f6758c == c0857b.f6758c && this.f6759d == c0857b.f6759d;
    }

    public final int hashCode() {
        return (((((this.f6756a * 31) + this.f6757b) * 31) + this.f6758c) * 31) + this.f6759d;
    }

    public final String toString() {
        return C0857b.class.getSimpleName() + " { [" + this.f6756a + ',' + this.f6757b + ',' + this.f6758c + ',' + this.f6759d + "] }";
    }
}

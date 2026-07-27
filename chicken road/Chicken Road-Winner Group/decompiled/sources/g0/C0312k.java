package g0;

import D.V;
import d0.C0262b;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312k {

    /* renamed from: a, reason: collision with root package name */
    public final C0262b f4971a;

    /* renamed from: b, reason: collision with root package name */
    public final V f4972b;

    public C0312k(C0262b c0262b, V _windowInsetsCompat) {
        kotlin.jvm.internal.j.e(_windowInsetsCompat, "_windowInsetsCompat");
        this.f4971a = c0262b;
        this.f4972b = _windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0312k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C0312k c0312k = (C0312k) obj;
        return kotlin.jvm.internal.j.a(this.f4971a, c0312k.f4971a) && kotlin.jvm.internal.j.a(this.f4972b, c0312k.f4972b);
    }

    public final int hashCode() {
        return this.f4972b.hashCode() + (this.f4971a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f4971a + ", windowInsetsCompat=" + this.f4972b + ')';
    }
}

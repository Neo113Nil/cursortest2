package Pb;

import Nb.C3666a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Pb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3820a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3666a f22144a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3666a f22145b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3666a f22146c;

    public C3820a() {
        C3666a yPlusX = new C3666a();
        C3666a yMinusX = new C3666a();
        C3666a xy2d = new C3666a();
        Intrinsics.checkNotNullParameter(yPlusX, "yPlusX");
        Intrinsics.checkNotNullParameter(yMinusX, "yMinusX");
        Intrinsics.checkNotNullParameter(xy2d, "xy2d");
        this.f22144a = yPlusX;
        this.f22145b = yMinusX;
        this.f22146c = xy2d;
    }

    public static void g(C3820a c3820a, byte[] input) {
        c3820a.getClass();
        Intrinsics.checkNotNullParameter(input, "rawData");
        C3666a c3666a = c3820a.f22144a;
        c3666a.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        C3666a.C0371a.d(input, 0, c3666a);
        C3666a c3666a2 = c3820a.f22145b;
        c3666a2.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        C3666a.C0371a.d(input, 32, c3666a2);
        C3666a c3666a3 = c3820a.f22146c;
        c3666a3.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        C3666a.C0371a.d(input, 64, c3666a3);
    }

    public final void a(@NotNull C3820a other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f22144a.b(other.f22144a, i11);
        this.f22145b.b(other.f22145b, i11);
        this.f22146c.b(other.f22146c, i11);
    }

    public final void b(int i11) {
        this.f22144a.d(this.f22145b, i11);
        this.f22146c.c(i11);
    }

    @NotNull
    public final C3666a c() {
        return this.f22146c;
    }

    @NotNull
    public final C3666a d() {
        return this.f22145b;
    }

    @NotNull
    public final C3666a e() {
        return this.f22144a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3820a)) {
            return false;
        }
        C3820a c3820a = (C3820a) obj;
        return Intrinsics.d(this.f22144a, c3820a.f22144a) && Intrinsics.d(this.f22145b, c3820a.f22145b) && Intrinsics.d(this.f22146c, c3820a.f22146c);
    }

    @NotNull
    public final void f() {
        C3666a.i(this.f22144a);
        C3666a.i(this.f22145b);
        C3666a.o(this.f22146c);
    }

    public final int hashCode() {
        return this.f22146c.hashCode() + ((this.f22145b.hashCode() + (this.f22144a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AffineNielsPoint(yPlusX=" + this.f22144a + ", yMinusX=" + this.f22145b + ", xy2d=" + this.f22146c + ')';
    }
}

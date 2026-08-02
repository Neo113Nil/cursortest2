package Pb;

import Nb.C3666a;
import Ob.C3679b;
import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3666a f22147a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3666a f22148b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3666a f22149c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3666a f22150d;

    public b() {
        C3666a x11 = new C3666a();
        C3666a y11 = new C3666a();
        C3666a z11 = new C3666a();
        C3666a t2 = new C3666a();
        Intrinsics.checkNotNullParameter(x11, "x");
        Intrinsics.checkNotNullParameter(y11, "y");
        Intrinsics.checkNotNullParameter(z11, "z");
        Intrinsics.checkNotNullParameter(t2, "t");
        this.f22147a = x11;
        this.f22148b = y11;
        this.f22149c = z11;
        this.f22150d = t2;
    }

    @NotNull
    public final void a(@NotNull Mb.a a11, @NotNull C3820a b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        Intrinsics.checkNotNullParameter(this, "output");
        C3666a c3666a = new C3666a();
        c3666a.a(a11.c(), a11.b());
        c3666a.h(c3666a, b11.e());
        C3666a c3666a2 = new C3666a();
        c3666a2.m(a11.c(), a11.b());
        c3666a2.h(c3666a2, b11.d());
        C3666a c3666a3 = new C3666a();
        c3666a3.h(a11.a(), b11.c());
        C3666a c3666a4 = new C3666a();
        c3666a4.a(a11.d(), a11.d());
        this.f22147a.m(c3666a, c3666a2);
        this.f22148b.a(c3666a, c3666a2);
        this.f22149c.a(c3666a4, c3666a3);
        this.f22150d.m(c3666a4, c3666a3);
    }

    @NotNull
    public final void b(@NotNull c pp) {
        Intrinsics.checkNotNullParameter(pp, "pp");
        Intrinsics.checkNotNullParameter(pp, "pp");
        Intrinsics.checkNotNullParameter(this, "output");
        C3666a j11 = C3666a.C0371a.j(pp.a());
        C3666a j12 = C3666a.C0371a.j(pp.b());
        C3666a t2 = pp.c();
        C3666a output = new C3666a();
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(output, "output");
        C3679b.b(output.f(), t2.f(), 1);
        for (int i11 = 0; i11 < 5; i11++) {
            long[] f7 = output.f();
            long j13 = f7[i11];
            C.Companion companion = C.INSTANCE;
            f7[i11] = j13 * 2;
        }
        C3666a b11 = C3666a.C0371a.b(pp.a(), pp.b());
        b11.l(b11);
        C3666a c3666a = this.f22148b;
        c3666a.a(j12, j11);
        this.f22147a.m(b11, c3666a);
        C3666a c3666a2 = this.f22149c;
        c3666a2.m(j12, j11);
        this.f22150d.m(output, c3666a2);
    }

    @NotNull
    public final C3666a c() {
        return this.f22150d;
    }

    @NotNull
    public final C3666a d() {
        return this.f22147a;
    }

    @NotNull
    public final C3666a e() {
        return this.f22148b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f22147a, bVar.f22147a) && Intrinsics.d(this.f22148b, bVar.f22148b) && Intrinsics.d(this.f22149c, bVar.f22149c) && Intrinsics.d(this.f22150d, bVar.f22150d);
    }

    @NotNull
    public final C3666a f() {
        return this.f22149c;
    }

    public final int hashCode() {
        return this.f22150d.hashCode() + ((this.f22149c.hashCode() + ((this.f22148b.hashCode() + (this.f22147a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CompletedPoint(x=" + this.f22147a + ", y=" + this.f22148b + ", z=" + this.f22149c + ", t=" + this.f22150d + ')';
    }
}

package Mb;

import Nb.C3666a;
import Pb.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17792e = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3666a f17793a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3666a f17794b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3666a f17795c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3666a f17796d;

    /* renamed from: Mb.a$a, reason: collision with other inner class name */
    public static final class C0340a {
        @NotNull
        public static void a(@NotNull a output) {
            Intrinsics.checkNotNullParameter(output, "output");
            C3666a.o(output.b());
            C3666a.i(output.c());
            C3666a.i(output.d());
            C3666a.o(output.a());
        }
    }

    static {
        C0340a.a(new a());
    }

    public a() {
        C3666a x11 = new C3666a();
        C3666a y11 = new C3666a();
        C3666a z11 = new C3666a();
        C3666a t2 = new C3666a();
        Intrinsics.checkNotNullParameter(x11, "x");
        Intrinsics.checkNotNullParameter(y11, "y");
        Intrinsics.checkNotNullParameter(z11, "z");
        Intrinsics.checkNotNullParameter(t2, "t");
        this.f17793a = x11;
        this.f17794b = y11;
        this.f17795c = z11;
        this.f17796d = t2;
    }

    @NotNull
    public final C3666a a() {
        return this.f17796d;
    }

    @NotNull
    public final C3666a b() {
        return this.f17793a;
    }

    @NotNull
    public final C3666a c() {
        return this.f17794b;
    }

    @NotNull
    public final C3666a d() {
        return this.f17795c;
    }

    @NotNull
    public final void e(@NotNull b cp2) {
        Intrinsics.checkNotNullParameter(cp2, "cp");
        Intrinsics.checkNotNullParameter(cp2, "cp");
        Intrinsics.checkNotNullParameter(this, "output");
        this.f17793a.h(cp2.d(), cp2.c());
        this.f17794b.h(cp2.e(), cp2.f());
        this.f17795c.h(cp2.f(), cp2.c());
        this.f17796d.h(cp2.d(), cp2.e());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f17793a, aVar.f17793a) && Intrinsics.d(this.f17794b, aVar.f17794b) && Intrinsics.d(this.f17795c, aVar.f17795c) && Intrinsics.d(this.f17796d, aVar.f17796d);
    }

    public final int hashCode() {
        return this.f17796d.hashCode() + ((this.f17795c.hashCode() + ((this.f17794b.hashCode() + (this.f17793a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "EdwardsPoint(x=" + this.f17793a + ", y=" + this.f17794b + ", z=" + this.f17795c + ", t=" + this.f17796d + ')';
    }
}

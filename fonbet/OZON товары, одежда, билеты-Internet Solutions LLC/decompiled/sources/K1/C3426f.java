package K1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3426f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f15047a;

    public C3426f(@NotNull J j11) {
        this.f15047a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3426f)) {
            return false;
        }
        J j11 = this.f15047a;
        C3426f c3426f = (C3426f) obj;
        if (!Intrinsics.d(j11.j(), c3426f.f15047a.j())) {
            return false;
        }
        T i11 = j11.i();
        J j12 = c3426f.f15047a;
        return i11.B(j12.i()) && Intrinsics.d(j11.g(), j12.g()) && j11.e() == j12.e() && j11.h() == j12.h() && j11.f() == j12.f() && Intrinsics.d(j11.b(), j12.b()) && j11.d() == j12.d() && j11.c() == j12.c() && Z1.b.k(j11.a()) == Z1.b.k(j12.a()) && Z1.b.j(j11.a()) == Z1.b.j(j12.a());
    }

    public final int hashCode() {
        J j11 = this.f15047a;
        return Integer.hashCode(Z1.b.j(j11.a())) + ((Integer.hashCode(Z1.b.k(j11.a())) + ((j11.c().hashCode() + ((j11.d().hashCode() + ((j11.b().hashCode() + ((Integer.hashCode(j11.f()) + ((Boolean.hashCode(j11.h()) + ((j11.e() + ((j11.g().hashCode() + ((j11.i().C() + (j11.j().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}

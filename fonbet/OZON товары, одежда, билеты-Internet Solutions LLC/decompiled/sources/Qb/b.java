package Qb;

import Nb.C3666a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3666a f23212a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3666a f23213b;

    public b(@NotNull C3666a u11, @NotNull C3666a w11) {
        Intrinsics.checkNotNullParameter(u11, "u");
        Intrinsics.checkNotNullParameter(w11, "w");
        this.f23212a = u11;
        this.f23213b = w11;
    }

    public final void a(@NotNull b other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f23212a.d(other.f23212a, i11);
        this.f23213b.d(other.f23213b, i11);
    }

    @NotNull
    public final C3666a b() {
        return this.f23212a;
    }

    @NotNull
    public final C3666a c() {
        return this.f23213b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f23212a, bVar.f23212a) && Intrinsics.d(this.f23213b, bVar.f23213b);
    }

    public final int hashCode() {
        return this.f23213b.hashCode() + (this.f23212a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "MontgomeryProjectivePoint(u=" + this.f23212a + ", w=" + this.f23213b + ')';
    }

    public b() {
        this(new C3666a(), new C3666a());
    }
}

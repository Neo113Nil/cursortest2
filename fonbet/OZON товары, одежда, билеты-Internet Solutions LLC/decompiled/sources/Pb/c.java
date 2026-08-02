package Pb;

import Nb.C3666a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3666a f22151a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3666a f22152b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3666a f22153c;

    public c() {
        C3666a x11 = new C3666a();
        C3666a y11 = new C3666a();
        C3666a z11 = new C3666a();
        Intrinsics.checkNotNullParameter(x11, "x");
        Intrinsics.checkNotNullParameter(y11, "y");
        Intrinsics.checkNotNullParameter(z11, "z");
        this.f22151a = x11;
        this.f22152b = y11;
        this.f22153c = z11;
    }

    @NotNull
    public final C3666a a() {
        return this.f22151a;
    }

    @NotNull
    public final C3666a b() {
        return this.f22152b;
    }

    @NotNull
    public final C3666a c() {
        return this.f22153c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f22151a, cVar.f22151a) && Intrinsics.d(this.f22152b, cVar.f22152b) && Intrinsics.d(this.f22153c, cVar.f22153c);
    }

    public final int hashCode() {
        return this.f22153c.hashCode() + ((this.f22152b.hashCode() + (this.f22151a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ProjectivePoint(x=" + this.f22151a + ", y=" + this.f22152b + ", z=" + this.f22153c + ')';
    }
}

package F4;

import F4.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: F4.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3035o extends F.d {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3034n<Object, Object> f8934d;

    C3035o(C3034n<Object, Object> c3034n) {
        this.f8934d = c3034n;
    }

    @Override // F4.F.d
    public final void d(@NotNull y type, @NotNull x state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        C3027g c3027g = (C3027g) this.f8934d.f();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        c3027g.f(type, state);
    }
}

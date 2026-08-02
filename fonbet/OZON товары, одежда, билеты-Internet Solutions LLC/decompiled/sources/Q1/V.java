package Q1;

import Sc.InterfaceC3999a;
import k1.C7460f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes8.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f22863a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F f22864b;

    public V(@NotNull M m11, @NotNull F f7) {
        this.f22863a = m11;
        this.f22864b = f7;
    }

    public final void a() {
        this.f22863a.g(this);
    }

    public final void b(@NotNull C7460f c7460f) {
        if (Intrinsics.d(this.f22863a.a(), this)) {
            this.f22864b.f(c7460f);
        }
    }

    public final void c(K k11, @NotNull K k12) {
        if (Intrinsics.d(this.f22863a.a(), this)) {
            this.f22864b.a(k11, k12);
        }
    }

    public final void d(@NotNull K k11, @NotNull D d11, @NotNull K1.K k12, @NotNull Function1 function1, @NotNull C7460f c7460f, @NotNull C7460f c7460f2) {
        if (Intrinsics.d(this.f22863a.a(), this)) {
            this.f22864b.c(k11, d11, k12, function1, c7460f, c7460f2);
        }
    }
}

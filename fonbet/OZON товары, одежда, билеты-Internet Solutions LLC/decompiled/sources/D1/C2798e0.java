package D1;

import D1.H;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2798e0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<T> f5436a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f5437b;

    public C2798e0(@NotNull U0.b<T> bVar, @NotNull Function0<Unit> function0) {
        this.f5436a = bVar;
        this.f5437b = function0;
    }

    public final void a(int i11, H h11) {
        this.f5436a.a(i11, h11);
        ((H.h) this.f5437b).invoke();
    }

    @NotNull
    public final List<T> b() {
        return this.f5436a.g();
    }

    public final void c() {
        this.f5436a.h();
        this.f5437b.invoke();
    }

    public final T d(int i11) {
        return this.f5436a.l()[i11];
    }

    public final int e() {
        return this.f5436a.m();
    }

    @NotNull
    public final U0.b<T> f() {
        return this.f5436a;
    }

    public final T g(int i11) {
        T u11 = this.f5436a.u(i11);
        this.f5437b.invoke();
        return u11;
    }
}

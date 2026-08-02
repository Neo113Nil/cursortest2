package Q1;

import Sc.InterfaceC3999a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final F f22838a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<V> f22839b = new AtomicReference<>(null);

    public M(@NotNull F f7) {
        this.f22838a = f7;
    }

    public final V a() {
        return this.f22839b.get();
    }

    @InterfaceC3999a
    public final void b() {
        this.f22838a.e();
    }

    @InterfaceC3999a
    public final void c() {
        if (a() != null) {
            this.f22838a.h();
        }
    }

    @NotNull
    public final V d(@NotNull K k11, @NotNull r rVar, @NotNull Function1<? super List<? extends InterfaceC3841j>, Unit> function1, @NotNull Function1<? super C3848q, Unit> function12) {
        F f7 = this.f22838a;
        f7.g(k11, rVar, function1, function12);
        V v11 = new V(this, f7);
        this.f22839b.set(v11);
        return v11;
    }

    public final void e() {
        F f7 = this.f22838a;
        f7.d();
        this.f22839b.set(new V(this, f7));
    }

    public final void f() {
        this.f22838a.b();
    }

    public final void g(@NotNull V v11) {
        if (Nh.b.d(this.f22839b, v11)) {
            this.f22838a.b();
        }
    }
}

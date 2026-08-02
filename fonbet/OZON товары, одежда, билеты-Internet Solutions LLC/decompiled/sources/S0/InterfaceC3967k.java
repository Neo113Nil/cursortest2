package S0;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: S0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3967k {

    /* renamed from: S0.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0506a f25427a = new C0506a();

        /* renamed from: S0.k$a$a, reason: collision with other inner class name */
        public static final class C0506a {
            @NotNull
            public final String toString() {
                return "Empty";
            }
        }

        @NotNull
        public static C0506a a() {
            return f25427a;
        }
    }

    void A();

    void B(int i11);

    Object C();

    @NotNull
    C3947c1 D();

    void E(@NotNull I0 i02);

    default boolean F(Object obj) {
        return n(obj);
    }

    void G(int i11, Object obj);

    <T> void H(@NotNull Function0<? extends T> function0);

    int I();

    void J();

    void K();

    void a(boolean z11);

    boolean b();

    <V, T> void c(V v11, @NotNull Function2<? super T, ? super V, Unit> function2);

    @NotNull
    A0 d();

    void e();

    void f();

    void g(@NotNull Function0<Unit> function0);

    void h(Object obj);

    void i();

    void j();

    void k();

    @NotNull
    AbstractC3984t l();

    <T> T m(@NotNull AbstractC3992x<T> abstractC3992x);

    boolean n(Object obj);

    void o(int i11);

    default boolean p(boolean z11) {
        return p(z11);
    }

    default boolean q(float f7) {
        return q(f7);
    }

    default boolean r(int i11) {
        return r(i11);
    }

    default boolean s(long j11) {
        return s(j11);
    }

    boolean t();

    @NotNull
    C3969l u(int i11);

    @NotNull
    InterfaceC3951e<?> v();

    @NotNull
    CoroutineContext w();

    void x(Object obj);

    void y();

    J0 z();
}

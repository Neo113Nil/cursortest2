package I0;

import B0.C2456a1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface F {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final A f11306a = new A();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final B f11307b = new B();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final C f11308c = new C();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private static final D f11309d = new D();

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private static final E f11310e = new E();

        /* renamed from: I0.F$a$a, reason: collision with other inner class name */
        static final class C0227a implements InterfaceC3191k {

            /* renamed from: a, reason: collision with root package name */
            public static final C0227a f11311a = new C0227a();

            @Override // I0.InterfaceC3191k
            public final long a(@NotNull C3218y c3218y, int i11) {
                String b11 = c3218y.b();
                return K1.S.a(C2456a1.b(i11, b11), C2456a1.a(i11, b11));
            }
        }

        static final class b implements InterfaceC3191k {

            /* renamed from: a, reason: collision with root package name */
            public static final b f11312a = new b();

            @Override // I0.InterfaceC3191k
            public final long a(@NotNull C3218y c3218y, int i11) {
                return c3218y.i().B(i11);
            }
        }

        public static C3220z a(InterfaceC3198n0 interfaceC3198n0) {
            return I.d(f11306a.a(interfaceC3198n0), interfaceC3198n0);
        }

        @NotNull
        public static B b() {
            return f11307b;
        }

        @NotNull
        public static E c() {
            return f11310e;
        }

        @NotNull
        public static A d() {
            return f11306a;
        }

        @NotNull
        public static D e() {
            return f11309d;
        }

        @NotNull
        public static C f() {
            return f11308c;
        }
    }

    @NotNull
    C3220z a(@NotNull InterfaceC3198n0 interfaceC3198n0);
}

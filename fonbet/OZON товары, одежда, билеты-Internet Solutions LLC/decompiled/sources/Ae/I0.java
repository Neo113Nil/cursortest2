package Ae;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface I0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f818a = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f819a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final I0 f820b = new J0();

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final I0 f821c = new K0();

        @NotNull
        public static I0 a() {
            return new L0(60000L);
        }

        public static I0 b(int i11) {
            return new L0((i11 & 1) != 0 ? 0L : 5000L);
        }

        @NotNull
        public static I0 c() {
            return f820b;
        }

        @NotNull
        public static I0 d() {
            return f821c;
        }
    }

    @NotNull
    InterfaceC2395h<G0> a(@NotNull M0<Integer> m02);
}

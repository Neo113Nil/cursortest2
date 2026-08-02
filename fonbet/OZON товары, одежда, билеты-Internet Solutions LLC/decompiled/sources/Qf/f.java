package Qf;

import C.o0;
import Of.C3707a;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
abstract class f extends e {

    static class a extends f {
        @Override // Qf.e
        protected final int a() {
            return 4;
        }

        public final String toString() {
            return ":blank";
        }
    }

    static class b extends f {

        /* renamed from: a, reason: collision with root package name */
        private final String f23420a;

        public b(String str) {
            StringBuilder b11 = Of.k.b();
            Of.k.a(str, b11, false);
            this.f23420a = C3707a.a(Of.k.l(b11));
        }

        @Override // Qf.e
        protected final int a() {
            return 6;
        }

        public final String toString() {
            return o0.c(new StringBuilder(":contains("), this.f23420a, ")");
        }
    }

    static class c extends f {

        /* renamed from: a, reason: collision with root package name */
        final String f23421a;

        c(Class<? extends Pf.n> cls, String str) {
            this.f23421a = "::".concat(str);
        }

        @Override // Qf.e
        protected final int a() {
            return 1;
        }

        public final String toString() {
            return this.f23421a;
        }
    }

    static class d extends f {

        /* renamed from: a, reason: collision with root package name */
        private final Pattern f23422a;

        protected d(Pattern pattern) {
            this.f23422a = pattern;
        }

        @Override // Qf.e
        protected final int a() {
            return 8;
        }

        public final String toString() {
            return ":matches(" + this.f23422a + ")";
        }
    }

    @Override // Qf.e
    final boolean b() {
        return true;
    }
}

package Qf;

import C.o0;
import I0.C3173b;
import Of.C3707a;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public abstract class e {

    public static final class A extends D {
        @Override // Qf.e.q
        public final String toString() {
            return ":last-of-type";
        }
    }

    public static final class B extends q {
        @Override // Qf.e.q
        protected final String c() {
            return "nth-child";
        }
    }

    public static final class C extends q {
        @Override // Qf.e.q
        protected final String c() {
            return "nth-last-child";
        }
    }

    public static class D extends q {
        @Override // Qf.e.q
        protected final String c() {
            return "nth-last-of-type";
        }
    }

    public static class E extends q {
        @Override // Qf.e.q
        protected final String c() {
            return "nth-of-type";
        }
    }

    public static final class F extends e {
        public final String toString() {
            return ":only-child";
        }
    }

    public static final class G extends e {
        public final String toString() {
            return ":only-of-type";
        }
    }

    public static final class H extends e {
        @Override // Qf.e
        protected final int a() {
            return 1;
        }

        public final String toString() {
            return ":root";
        }
    }

    @Deprecated
    public static final class I extends e {

        /* renamed from: a, reason: collision with root package name */
        private static boolean f23396a = false;

        public I() {
            if (f23396a) {
                return;
            }
            f23396a = true;
            System.err.println("WARNING: :matchText selector is deprecated and will be removed in a future version. Use Element#selectNodes(String, Class) with selector ::textnode and class TextNode instead.");
        }

        @Override // Qf.e
        protected final int a() {
            return -1;
        }

        public final String toString() {
            return ":matchText";
        }
    }

    public static final class J extends e {

        /* renamed from: a, reason: collision with root package name */
        private final Pattern f23397a;

        public J(Pattern pattern) {
            this.f23397a = pattern;
        }

        @Override // Qf.e
        protected final int a() {
            return 8;
        }

        public final String toString() {
            return ":matches(" + this.f23397a + ")";
        }
    }

    public static final class K extends e {

        /* renamed from: a, reason: collision with root package name */
        private final Pattern f23398a;

        public K(Pattern pattern) {
            this.f23398a = pattern;
        }

        @Override // Qf.e
        protected final int a() {
            return 7;
        }

        public final String toString() {
            return ":matchesOwn(" + this.f23398a + ")";
        }
    }

    public static final class L extends e {

        /* renamed from: a, reason: collision with root package name */
        private final Pattern f23399a;

        public L(Pattern pattern) {
            this.f23399a = pattern;
        }

        @Override // Qf.e
        protected final int a() {
            return 7;
        }

        public final String toString() {
            return ":matchesWholeOwnText(" + this.f23399a + ")";
        }
    }

    public static final class M extends e {

        /* renamed from: a, reason: collision with root package name */
        private final Pattern f23400a;

        public M(Pattern pattern) {
            this.f23400a = pattern;
        }

        @Override // Qf.e
        protected final int a() {
            return 8;
        }

        public final String toString() {
            return ":matchesWholeText(" + this.f23400a + ")";
        }
    }

    public static final class N extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23401a;

        public N(String str) {
            this.f23401a = str;
        }

        @Override // Qf.e
        protected final int a() {
            return 1;
        }

        public final boolean c(Pf.h hVar, Pf.h hVar2) {
            return hVar2.t(this.f23401a);
        }

        public final String toString() {
            return this.f23401a;
        }
    }

    public static final class O extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23402a;

        public O(String str) {
            this.f23402a = str;
        }

        public final String toString() {
            return "*|" + this.f23402a;
        }
    }

    public static final class P extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23403a;

        public P(String str) {
            this.f23403a = str;
        }

        public final String toString() {
            return o0.c(new StringBuilder(), this.f23403a, "|*");
        }
    }

    /* renamed from: Qf.e$a, reason: case insensitive filesystem */
    public static final class C3861a extends e {
        @Override // Qf.e
        protected final int a() {
            return 10;
        }

        public final String toString() {
            return "*";
        }
    }

    /* renamed from: Qf.e$b, reason: case insensitive filesystem */
    public static final class C3862b extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23404a;

        public C3862b(String str) {
            this.f23404a = str;
        }

        @Override // Qf.e
        protected final int a() {
            return 2;
        }

        public final String toString() {
            return o0.c(new StringBuilder("["), this.f23404a, "]");
        }
    }

    /* renamed from: Qf.e$c, reason: case insensitive filesystem */
    public static abstract class AbstractC3863c extends e {

        /* renamed from: a, reason: collision with root package name */
        final String f23405a;

        /* renamed from: b, reason: collision with root package name */
        final String f23406b;

        public AbstractC3863c(String str, String str2, boolean z11) {
            Nf.b.b(str);
            Nf.b.b(str2);
            this.f23405a = C3707a.b(str);
            boolean z12 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z12 ? str2.substring(1, str2.length() - 1) : str2;
            this.f23406b = z11 ? C3707a.b(str2) : z12 ? C3707a.a(str2) : C3707a.b(str2);
        }
    }

    /* renamed from: Qf.e$d, reason: case insensitive filesystem */
    public static final class C3864d extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23407a;

        public C3864d(String str) {
            Nf.b.d(str);
            this.f23407a = C3707a.a(str);
        }

        @Override // Qf.e
        protected final int a() {
            return 6;
        }

        public final String toString() {
            return o0.c(new StringBuilder("[^"), this.f23407a, "]");
        }
    }

    /* renamed from: Qf.e$e, reason: collision with other inner class name */
    public static final class C0472e extends AbstractC3863c {
        @Override // Qf.e
        protected final int a() {
            return 3;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f23405a);
            sb2.append("=");
            return o0.c(sb2, this.f23406b, "]");
        }
    }

    /* renamed from: Qf.e$f, reason: case insensitive filesystem */
    public static final class C3865f extends AbstractC3863c {
        @Override // Qf.e
        protected final int a() {
            return 6;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f23405a);
            sb2.append("*=");
            return o0.c(sb2, this.f23406b, "]");
        }
    }

    /* renamed from: Qf.e$g, reason: case insensitive filesystem */
    public static final class C3866g extends AbstractC3863c {
        @Override // Qf.e
        protected final int a() {
            return 4;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f23405a);
            sb2.append("$=");
            return o0.c(sb2, this.f23406b, "]");
        }
    }

    /* renamed from: Qf.e$h, reason: case insensitive filesystem */
    public static final class C3867h extends e {

        /* renamed from: a, reason: collision with root package name */
        final String f23408a;

        /* renamed from: b, reason: collision with root package name */
        final Pattern f23409b;

        public C3867h(String str, Pattern pattern) {
            this.f23408a = C3707a.b(str);
            this.f23409b = pattern;
        }

        @Override // Qf.e
        protected final int a() {
            return 8;
        }

        public final String toString() {
            return C3173b.c(new StringBuilder("["), this.f23408a, "~=", this.f23409b.toString(), "]");
        }
    }

    /* renamed from: Qf.e$i, reason: case insensitive filesystem */
    public static final class C3868i extends AbstractC3863c {
        @Override // Qf.e
        protected final int a() {
            return 3;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f23405a);
            sb2.append("!=");
            return o0.c(sb2, this.f23406b, "]");
        }
    }

    /* renamed from: Qf.e$j, reason: case insensitive filesystem */
    public static final class C3869j extends AbstractC3863c {
        @Override // Qf.e
        protected final int a() {
            return 4;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.f23405a);
            sb2.append("^=");
            return o0.c(sb2, this.f23406b, "]");
        }
    }

    /* renamed from: Qf.e$k, reason: case insensitive filesystem */
    public static final class C3870k extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23410a;

        public C3870k(String str) {
            this.f23410a = str;
        }

        @Override // Qf.e
        protected final int a() {
            return 8;
        }

        public final String toString() {
            return "." + this.f23410a;
        }
    }

    /* renamed from: Qf.e$l, reason: case insensitive filesystem */
    public static final class C3871l extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23411a;

        public C3871l(String str) {
            this.f23411a = C3707a.a(str);
        }

        public final String toString() {
            return o0.c(new StringBuilder(":containsData("), this.f23411a, ")");
        }
    }

    /* renamed from: Qf.e$m, reason: case insensitive filesystem */
    public static final class C3872m extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23412a;

        public C3872m(String str) {
            StringBuilder b11 = Of.k.b();
            Of.k.a(str, b11, false);
            this.f23412a = C3707a.a(Of.k.l(b11));
        }

        public final String toString() {
            return o0.c(new StringBuilder(":containsOwn("), this.f23412a, ")");
        }
    }

    /* renamed from: Qf.e$n, reason: case insensitive filesystem */
    public static final class C3873n extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23413a;

        public C3873n(String str) {
            StringBuilder b11 = Of.k.b();
            Of.k.a(str, b11, false);
            this.f23413a = C3707a.a(Of.k.l(b11));
        }

        @Override // Qf.e
        protected final int a() {
            return 10;
        }

        public final String toString() {
            return o0.c(new StringBuilder(":contains("), this.f23413a, ")");
        }
    }

    /* renamed from: Qf.e$o, reason: case insensitive filesystem */
    public static final class C3874o extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23414a;

        public C3874o(String str) {
            this.f23414a = str;
        }

        public final String toString() {
            return o0.c(new StringBuilder(":containsWholeOwnText("), this.f23414a, ")");
        }
    }

    /* renamed from: Qf.e$p, reason: case insensitive filesystem */
    public static final class C3875p extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23415a;

        public C3875p(String str) {
            this.f23415a = str;
        }

        @Override // Qf.e
        protected final int a() {
            return 10;
        }

        public final String toString() {
            return o0.c(new StringBuilder(":containsWholeText("), this.f23415a, ")");
        }
    }

    public static abstract class q extends e {

        /* renamed from: a, reason: collision with root package name */
        protected final int f23416a;

        /* renamed from: b, reason: collision with root package name */
        protected final int f23417b;

        public q(int i11, int i12) {
            this.f23416a = i11;
            this.f23417b = i12;
        }

        protected abstract String c();

        public String toString() {
            int i11 = this.f23417b;
            int i12 = this.f23416a;
            return String.format(i12 == 0 ? ":%s(%3$d)" : i11 == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)", c(), Integer.valueOf(i12), Integer.valueOf(i11));
        }
    }

    public static final class r extends e {

        /* renamed from: a, reason: collision with root package name */
        private final String f23418a;

        public r(String str) {
            this.f23418a = str;
        }

        @Override // Qf.e
        protected final int a() {
            return 2;
        }

        public final String toString() {
            return "#" + this.f23418a;
        }
    }

    public static final class s extends t {
        public final String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.f23419a));
        }
    }

    public static abstract class t extends e {

        /* renamed from: a, reason: collision with root package name */
        final int f23419a;

        public t(int i11) {
            this.f23419a = i11;
        }
    }

    public static final class u extends t {
        public final String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.f23419a));
        }
    }

    public static final class v extends t {
        public final String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.f23419a));
        }
    }

    public static final class w extends e {
        public final String toString() {
            return ":empty";
        }
    }

    public static final class x extends e {
        public final String toString() {
            return ":first-child";
        }
    }

    public static final class y extends E {
        @Override // Qf.e.q
        public final String toString() {
            return ":first-of-type";
        }
    }

    public static final class z extends e {
        public final String toString() {
            return ":last-child";
        }
    }

    protected e() {
    }

    protected int a() {
        return 5;
    }

    boolean b() {
        return false;
    }
}

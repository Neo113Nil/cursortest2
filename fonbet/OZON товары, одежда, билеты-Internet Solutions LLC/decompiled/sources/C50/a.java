package C50;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: C50.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0108a extends a {

        /* renamed from: C50.a$a$a, reason: collision with other inner class name */
        public static final class C0109a extends AbstractC0108a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f4396a;

            public C0109a(boolean z11) {
                super(0);
                this.f4396a = z11;
            }

            public final boolean a() {
                return this.f4396a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0109a) && this.f4396a == ((C0109a) obj).f4396a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f4396a);
            }

            @NotNull
            public final String toString() {
                return "Play";
            }
        }

        /* renamed from: C50.a$a$b */
        public static final class b extends AbstractC0108a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f4397a = new b(0);

            @NotNull
            public final String toString() {
                return "Prepare";
            }
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f4398a = new b(0);

        @NotNull
        public final String toString() {
            return "Relaxed";
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}

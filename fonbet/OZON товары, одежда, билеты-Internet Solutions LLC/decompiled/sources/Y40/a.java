package Y40;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Y40.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0633a extends a {

        /* renamed from: Y40.a$a$a, reason: collision with other inner class name */
        public static final class C0634a extends AbstractC0633a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f34569a;

            public C0634a(boolean z11) {
                super(0);
                this.f34569a = z11;
            }

            public final boolean a() {
                return this.f34569a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0634a) && this.f34569a == ((C0634a) obj).f34569a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f34569a);
            }

            @NotNull
            public final String toString() {
                return "Play";
            }
        }

        /* renamed from: Y40.a$a$b */
        public static final class b extends AbstractC0633a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f34570a = new b(0);

            @NotNull
            public final String toString() {
                return "Prepare";
            }
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f34571a = new b(0);

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

package N90;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: N90.a$a, reason: collision with other inner class name */
    public interface InterfaceC0367a {

        /* renamed from: N90.a$a$a, reason: collision with other inner class name */
        public static final class C0368a implements InterfaceC0367a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0368a f18823a = new C0368a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0368a);
            }

            public final int hashCode() {
                return 1527195949;
            }

            @NotNull
            public final String toString() {
                return "DeveloperTriggeredUpdateInProgress";
            }
        }

        /* renamed from: N90.a$a$b */
        public static final class b implements InterfaceC0367a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            @NotNull
            public final String toString() {
                return "Error(message=null)";
            }
        }

        /* renamed from: N90.a$a$c */
        public static final class c implements InterfaceC0367a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f18824a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1325000667;
            }

            @NotNull
            public final String toString() {
                return "Unknown";
            }
        }

        /* renamed from: N90.a$a$d */
        public static final class d implements InterfaceC0367a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f18825a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1326228699;
            }

            @NotNull
            public final String toString() {
                return "UpdateAvailable";
            }
        }

        /* renamed from: N90.a$a$e */
        public static final class e implements InterfaceC0367a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f18826a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1940410852;
            }

            @NotNull
            public final String toString() {
                return "UpdateNotAvailable";
            }
        }
    }
}

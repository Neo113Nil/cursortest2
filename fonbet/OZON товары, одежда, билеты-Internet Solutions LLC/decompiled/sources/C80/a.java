package C80;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: C80.a$a, reason: collision with other inner class name */
    public interface InterfaceC0111a {

        /* renamed from: C80.a$a$a, reason: collision with other inner class name */
        public static final class C0112a implements InterfaceC0111a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0112a f4496a = new C0112a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0112a);
            }

            public final int hashCode() {
                return 1009256727;
            }

            @NotNull
            public final String toString() {
                return "DeveloperTriggeredUpdateInProgress";
            }
        }

        /* renamed from: C80.a$a$b */
        public static final class b implements InterfaceC0111a {
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

        /* renamed from: C80.a$a$c */
        public static final class c implements InterfaceC0111a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f4497a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 2035643003;
            }

            @NotNull
            public final String toString() {
                return "Unknown";
            }
        }

        /* renamed from: C80.a$a$d */
        public static final class d implements InterfaceC0111a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f4498a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 912214321;
            }

            @NotNull
            public final String toString() {
                return "UpdateAvailable";
            }
        }

        /* renamed from: C80.a$a$e */
        public static final class e implements InterfaceC0111a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f4499a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1110817330;
            }

            @NotNull
            public final String toString() {
                return "UpdateNotAvailable";
            }
        }
    }
}

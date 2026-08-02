package D30;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface c {

    public static final class a implements c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "FailedReAuth(errorMessage=null, errorHtml=null)";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f5774a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1829376536;
        }

        @NotNull
        public final String toString() {
            return "NoReAuthNeed";
        }
    }

    /* renamed from: D30.c$c, reason: collision with other inner class name */
    public static final class C0131c implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0131c f5775a = new C0131c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0131c);
        }

        public final int hashCode() {
            return -1238461096;
        }

        @NotNull
        public final String toString() {
            return "SuccessReAuth";
        }
    }
}

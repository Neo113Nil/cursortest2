package Fi;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f9489a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 243778299;
        }

        @NotNull
        public final String toString() {
            return "Close";
        }
    }

    public static final class b implements d {
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
            return "UpdateState(state=null)";
        }
    }
}

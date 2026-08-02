package XY;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class c {

    public static final class a extends c {
        public a() {
            super(0);
        }

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
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Enabled(externalLogger=null)";
        }
    }

    public c(int i11) {
    }
}

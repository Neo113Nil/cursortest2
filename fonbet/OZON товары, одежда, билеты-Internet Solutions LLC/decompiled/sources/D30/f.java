package D30;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f5780a = new a(0);
    }

    public static final class b extends f {
        public b() {
            super(0);
        }

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
            return 0;
        }

        @NotNull
        public final String toString() {
            return "OzonIdAuthorized(returnUrl=null, tabId=null)";
        }
    }

    public static final class c extends f {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f5781a = new c(0);
    }

    public /* synthetic */ f(int i11) {
        this();
    }

    private f() {
    }
}

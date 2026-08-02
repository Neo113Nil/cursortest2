package F4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8975a;

    public static final class a extends x {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(false);
            Intrinsics.checkNotNullParameter(null, "error");
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && a() == ((a) obj).a();
        }

        public final int hashCode() {
            Boolean.hashCode(a());
            throw null;
        }

        @NotNull
        public final String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=null)";
        }
    }

    public static final class b extends x {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f8976b = new b();

        private b() {
            super(false);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof b) && a() == ((b) obj).a();
        }

        public final int hashCode() {
            return Boolean.hashCode(a());
        }

        @NotNull
        public final String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    public static final class c extends x {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final c f8977b = new c(true);

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private static final c f8978c = new c(false);

        public final boolean equals(Object obj) {
            return (obj instanceof c) && a() == ((c) obj).a();
        }

        public final int hashCode() {
            return Boolean.hashCode(a());
        }

        @NotNull
        public final String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    public x(boolean z11) {
        this.f8975a = z11;
    }

    public final boolean a() {
        return this.f8975a;
    }
}

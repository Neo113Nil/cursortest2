package Od0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: Od0.a$a, reason: collision with other inner class name */
    public static final class C0408a implements a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return C0408a.class.equals(obj != null ? obj.getClass() : null);
        }

        public final int hashCode() {
            return C0408a.class.hashCode();
        }

        @NotNull
        public final String toString() {
            String simpleName = C0408a.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f20227a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f20228b;

        public b(@NotNull String description, Throwable th2) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.f20227a = description;
            this.f20228b = th2;
        }

        @NotNull
        public final String a() {
            return this.f20227a;
        }

        public final Throwable b() {
            return this.f20228b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.limb.external.providers.OzonDeeplinkHandleResult.HandledWithError");
            b bVar = (b) obj;
            return Intrinsics.d(this.f20227a, bVar.f20227a) && Intrinsics.d(this.f20228b, bVar.f20228b);
        }

        public final int hashCode() {
            int hashCode = this.f20227a.hashCode() * 31;
            Throwable th2 = this.f20228b;
            return hashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return b.class.getSimpleName() + "(description=" + this.f20227a + ", throwable=" + this.f20228b + ")";
        }
    }

    public static final class c implements a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return c.class.equals(obj != null ? obj.getClass() : null);
        }

        public final int hashCode() {
            return c.class.hashCode();
        }

        @NotNull
        public final String toString() {
            String simpleName = c.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }
}

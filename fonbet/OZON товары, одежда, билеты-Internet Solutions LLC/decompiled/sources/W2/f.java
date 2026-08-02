package W2;

import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class f {

    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f33209a;

        public a(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f33209a = name;
        }

        @NotNull
        public final String a() {
            return this.f33209a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Intrinsics.d(this.f33209a, ((a) obj).f33209a);
        }

        public final int hashCode() {
            return this.f33209a.hashCode();
        }

        @NotNull
        public final String toString() {
            return this.f33209a;
        }
    }

    public static final class b<T> {
    }

    @NotNull
    public abstract Map<a<?>, Object> a();

    public abstract <T> boolean b(@NotNull a<T> aVar);

    public abstract <T> T c(@NotNull a<T> aVar);

    @NotNull
    public final W2.b d() {
        return new W2.b(U.u(a()), false);
    }
}

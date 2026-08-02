package Bj;

import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface c {

    public static final class a implements c {
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f3884a;

        public b(@NotNull ArrayList errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f3884a = errors;
        }

        @NotNull
        public final List<Object> a() {
            return this.f3884a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f3884a.equals(((b) obj).f3884a);
        }

        public final int hashCode() {
            return this.f3884a.hashCode();
        }

        @NotNull
        public final String toString() {
            return Om.a(")", new StringBuilder("NonFatal(errors="), this.f3884a);
        }
    }
}

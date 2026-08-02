package Zg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface i {

    /* loaded from: classes3.dex */
    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f35965a = new a();
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f35966a;

        public b(@NotNull String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            this.f35966a = projectId;
        }

        @NotNull
        public final String a() {
            return this.f35966a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f35966a, ((b) obj).f35966a);
        }

        public final int hashCode() {
            return this.f35966a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Enabled(projectId="), this.f35966a, ")");
        }
    }
}

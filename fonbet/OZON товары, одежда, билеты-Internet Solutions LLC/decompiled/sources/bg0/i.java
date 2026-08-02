package bg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f56013a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String message) {
            super(0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f56013a = message;
        }

        @NotNull
        public final String a() {
            return this.f56013a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f56013a, ((a) obj).f56013a);
        }

        public final int hashCode() {
            return this.f56013a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Error(message="), this.f56013a, ")");
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f56014a = new b(0);
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f56015a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String message) {
            super(0);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f56015a = message;
        }

        @NotNull
        public final String a() {
            return this.f56015a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f56015a, ((c) obj).f56015a);
        }

        public final int hashCode() {
            return this.f56015a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Warning(message="), this.f56015a, ")");
        }
    }

    public /* synthetic */ i(int i11) {
        this();
    }

    private i() {
    }
}

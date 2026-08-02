package Zg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: Zg0.a$a, reason: collision with other inner class name */
    public static final class C0680a extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f35905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0680a(@NotNull String id2) {
            super(0);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f35905a = id2;
        }

        @Override // Zg0.a
        @NotNull
        public final String a() {
            return this.f35905a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0680a) && Intrinsics.d(this.f35905a, ((C0680a) obj).f35905a);
        }

        public final int hashCode() {
            return this.f35905a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("CustomId(id="), this.f35905a, ")");
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C0680a f35906a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final OF.a f35907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull C0680a oldIdProvider, @NotNull OF.a logger) {
            super(0);
            Intrinsics.checkNotNullParameter(oldIdProvider, "oldIdProvider");
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.f35906a = oldIdProvider;
            this.f35907b = logger;
        }

        @Override // Zg0.a
        public final String a() {
            return this.f35906a.a();
        }

        @NotNull
        public final Pc.a<ru.ozon.android.ozonLogger.core.h> b() {
            return this.f35907b;
        }

        @NotNull
        public final a c() {
            return this.f35906a;
        }
    }

    public a(int i11) {
    }

    public abstract String a();
}

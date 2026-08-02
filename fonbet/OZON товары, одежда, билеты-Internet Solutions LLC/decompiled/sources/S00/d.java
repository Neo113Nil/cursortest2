package S00;

import T00.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface d {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0507a f25622a = new C0507a();

        /* renamed from: S00.d$a$a, reason: collision with other inner class name */
        public static final class C0507a implements d {
            @Override // S00.d
            public final void a(m layout) {
                Intrinsics.checkNotNullParameter(layout, "layout");
            }

            @Override // S00.d
            public final void b(m layout) {
                Intrinsics.checkNotNullParameter(layout, "layout");
            }

            @Override // S00.d
            public final void c(m layout) {
                Intrinsics.checkNotNullParameter(layout, "layout");
            }

            @Override // S00.d
            public final void d(m layout) {
                Intrinsics.checkNotNullParameter(layout, "layout");
            }
        }

        @NotNull
        public static C0507a a() {
            return f25622a;
        }
    }

    void a(@NotNull m mVar);

    void b(@NotNull m mVar);

    void c(@NotNull m mVar);

    void d(@NotNull m mVar);
}

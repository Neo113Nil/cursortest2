package E00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z00.c;
import z00.d;
import z00.f;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: E00.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0158a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final C0159a f7337a = new C0159a();

        /* renamed from: E00.a$a$a, reason: collision with other inner class name */
        public static final class C0159a implements a {
            @Override // E00.a
            public final c createErrorState(f issue) {
                Intrinsics.checkNotNullParameter(issue, "issue");
                return d.a();
            }
        }

        @NotNull
        public static C0159a a() {
            return f7337a;
        }
    }

    @NotNull
    c createErrorState(@NotNull f fVar);
}

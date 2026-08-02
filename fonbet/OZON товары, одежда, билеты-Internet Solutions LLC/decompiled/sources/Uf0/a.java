package Uf0;

import We.B;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wf0.c;

/* loaded from: classes7.dex */
public final class a implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private B f27718a = C0563a.f27719a;

    /* renamed from: Uf0.a$a, reason: collision with other inner class name */
    private static final class C0563a implements B {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0563a f27719a = new C0563a();

        @Override // We.B
        @NotNull
        public final L intercept(@NotNull B.a chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return chain.proceed(chain.request());
        }
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        wf0.a b11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.f27718a == C0563a.f27719a && (b11 = c.b()) != null) {
            this.f27718a = b11.d();
        }
        return this.f27718a.intercept(chain);
    }
}

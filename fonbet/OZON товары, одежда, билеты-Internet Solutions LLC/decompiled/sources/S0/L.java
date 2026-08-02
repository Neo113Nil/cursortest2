package S0;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class L implements V0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<N, M> f25238a;

    /* renamed from: b, reason: collision with root package name */
    private M f25239b;

    /* JADX WARN: Multi-variable type inference failed */
    public L(@NotNull Function1<? super N, ? extends M> function1) {
        this.f25238a = function1;
    }

    @Override // S0.V0
    public final void b() {
        N n11;
        Function1<N, M> function1 = this.f25238a;
        n11 = Q.f25306a;
        this.f25239b = function1.invoke(n11);
    }

    @Override // S0.V0
    public final void d() {
    }

    @Override // S0.V0
    public final void e() {
        M m11 = this.f25239b;
        if (m11 != null) {
            m11.dispose();
        }
        this.f25239b = null;
    }
}

package T0;

import S0.C3968k0;
import S0.G;
import S0.J0;
import S0.K0;
import S0.Y;
import kotlin.Pair;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e implements K0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ G f26409a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3968k0 f26410b;

    e(G g10, C3968k0 c3968k0) {
        this.f26409a = g10;
        this.f26410b = c3968k0;
    }

    @Override // S0.K0
    public final void a(@NotNull Object obj) {
    }

    @Override // S0.K0
    @NotNull
    public final Y f(@NotNull J0 j02, Object obj) {
        Y y11;
        G g10 = this.f26409a;
        K0 k02 = g10 instanceof K0 ? (K0) g10 : null;
        if (k02 == null || (y11 = k02.f(j02, obj)) == null) {
            y11 = Y.IGNORED;
        }
        if (y11 != Y.IGNORED) {
            return y11;
        }
        C3968k0 c3968k0 = this.f26410b;
        c3968k0.h(C7714v.q0(new Pair(j02, obj), c3968k0.d()));
        return Y.SCHEDULED;
    }

    @Override // S0.K0
    public final void g() {
    }
}

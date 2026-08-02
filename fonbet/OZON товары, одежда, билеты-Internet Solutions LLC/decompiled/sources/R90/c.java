package R90;

import We.B;
import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements B {

    /* renamed from: a, reason: collision with root package name */
    private e f24828a;

    public final void a(e eVar) {
        this.f24828a = eVar;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        L intercept;
        Intrinsics.checkNotNullParameter(chain, "chain");
        e eVar = this.f24828a;
        return (eVar == null || (intercept = eVar.intercept(chain)) == null) ? chain.proceed(chain.request()) : intercept;
    }
}

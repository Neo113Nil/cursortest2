package Ca0;

import Oa0.f;
import Sc.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<f> f4628a;

    public b(@NotNull Ib.a<f> updateHostAppEnvironmentLazy) {
        Intrinsics.checkNotNullParameter(updateHostAppEnvironmentLazy, "updateHostAppEnvironmentLazy");
        this.f4628a = updateHostAppEnvironmentLazy;
    }

    public final Object a(a aVar, @NotNull kotlin.coroutines.d dVar) {
        if (aVar != null) {
            Object a11 = this.f4628a.get().a(aVar.b(), dVar);
            return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
        }
        if (aVar == null) {
            return Unit.f71690a;
        }
        throw new o();
    }
}

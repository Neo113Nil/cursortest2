package Pa0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m implements Oa0.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Na0.a> f22141a;

    public m(@NotNull Ib.a<Na0.a> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f22141a = repositoryLazy;
    }

    @Override // Oa0.f
    public final Object a(@NotNull String str, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object c11 = this.f22141a.get().c(str, (kotlin.coroutines.jvm.internal.j) dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }
}

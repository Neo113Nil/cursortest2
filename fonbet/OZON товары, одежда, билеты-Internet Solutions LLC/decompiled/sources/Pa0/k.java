package Pa0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k implements Oa0.e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Na0.a> f22138a;

    public k(@NotNull Ib.a<Na0.a> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f22138a = repositoryLazy;
    }

    @Override // Oa0.e
    public final Object a(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Na0.a aVar = this.f22138a.get();
        Object c11 = aVar.c(aVar.d(), (kotlin.coroutines.jvm.internal.j) dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }
}

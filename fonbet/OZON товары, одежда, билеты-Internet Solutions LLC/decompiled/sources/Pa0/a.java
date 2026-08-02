package Pa0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Oa0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Na0.a> f22115a;

    public a(@NotNull Ib.a<Na0.a> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f22115a = repositoryLazy;
    }

    @Override // Oa0.a
    public final Object a(@NotNull Ma0.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object c11 = this.f22115a.get().c(aVar.a(), (kotlin.coroutines.jvm.internal.j) dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }
}

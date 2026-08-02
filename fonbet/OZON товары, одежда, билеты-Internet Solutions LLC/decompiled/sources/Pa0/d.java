package Pa0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements Oa0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Na0.a> f22126a;

    public d(@NotNull Ib.a<Na0.a> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f22126a = repositoryLazy;
    }

    @Override // Oa0.b
    @NotNull
    public final c invoke() {
        Na0.a aVar = this.f22126a.get();
        return new c(aVar.a(), aVar);
    }
}

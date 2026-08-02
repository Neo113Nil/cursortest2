package Pa0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements Oa0.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Na0.a> f22129a;

    public f(@NotNull Ib.a<Na0.a> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f22129a = repositoryLazy;
    }

    @Override // Oa0.c
    public final boolean invoke() {
        return this.f22129a.get().b();
    }
}

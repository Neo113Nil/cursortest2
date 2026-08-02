package Ua0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements Ta0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Ra0.a> f27479a;

    public a(@NotNull Ib.a<Ra0.a> repositoryLazy) {
        Intrinsics.checkNotNullParameter(repositoryLazy, "repositoryLazy");
        this.f27479a = repositoryLazy;
    }

    @Override // Ta0.a
    @NotNull
    public final Qa0.a invoke() {
        return this.f27479a.get().getInfo();
    }
}

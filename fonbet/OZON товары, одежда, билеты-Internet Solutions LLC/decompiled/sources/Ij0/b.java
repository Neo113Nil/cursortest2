package Ij0;

import Ld0.f;
import Od0.d;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b extends d<c> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends c> f12589a = c.class;

    @Override // Od0.d
    public final c create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return new a();
    }

    @Override // Od0.d
    @NotNull
    public final List<f> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        return C7714v.b0(Jj0.a.a(), Jj0.a.c(), Jj0.a.d(), Jj0.a.b(), Jj0.a.e());
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends c> getKey() {
        return this.f12589a;
    }
}

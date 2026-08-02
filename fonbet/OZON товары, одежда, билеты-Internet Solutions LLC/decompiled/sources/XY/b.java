package XY;

import Ld0.f;
import aZ.e;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import lZ.C7910a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b extends Od0.d<WY.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<? extends WY.a> f34210a = WY.a.class;

    @Override // Od0.d
    public final WY.a create(Ld0.c store) {
        Intrinsics.checkNotNullParameter(store, "store");
        e.c(store);
        return new a();
    }

    @Override // Od0.d
    @NotNull
    public final List<f> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        Tc.b builder = C7714v.B();
        builder.addAll(C7714v.a0(C7910a.a()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @Override // Od0.d
    @NotNull
    public final Class<? extends WY.a> getKey() {
        return this.f34210a;
    }

    @Override // Od0.d
    public final boolean isLazyInitializationEnabled() {
        return false;
    }
}

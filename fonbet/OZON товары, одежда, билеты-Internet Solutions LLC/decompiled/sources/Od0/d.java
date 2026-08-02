package Od0;

import Ld0.e;
import Ld0.f;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class d<Plugin extends Ld0.e> {
    private final boolean isLazyInitializationEnabled = true;

    @NotNull
    public abstract Plugin create(@NotNull Ld0.c cVar);

    @NotNull
    public List<f> createPluginProviderIntegration(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
        return K.f71697a;
    }

    public Md0.b getAbToolLibsConfigProvider() {
        return null;
    }

    @NotNull
    public abstract Class<? extends Plugin> getKey();

    public boolean isLazyInitializationEnabled() {
        return this.isLazyInitializationEnabled;
    }

    public void onDiStoreCreated(@NotNull Ld0.c diStore) {
        Intrinsics.checkNotNullParameter(diStore, "diStore");
    }
}

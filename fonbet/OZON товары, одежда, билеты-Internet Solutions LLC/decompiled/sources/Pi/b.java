package Pi;

import Ji.C3397a;
import Ji.b;
import cj.C5838a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static Ji.b f22556a;

    @NotNull
    public static Ji.b a() {
        Ji.b bVar = f22556a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Gallery component has not been initialized");
    }

    public static void b(@NotNull a galleryConfig) {
        Intrinsics.checkNotNullParameter(galleryConfig, "galleryConfig");
        C5838a.c(galleryConfig.a());
        b.a a11 = C3397a.a();
        a11.a(galleryConfig);
        f22556a = a11.build();
    }
}

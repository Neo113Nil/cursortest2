package Qd0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.limb.LimbActionInitializer$init$2;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private g f23330a;

    @NotNull
    public final g a() {
        g gVar = this.f23330a;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Сначала необходимо вызвать LimbAppApi.configure()");
    }

    public final void b(@NotNull LimbActionInitializer$init$2 dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        g gVar = new g(dependencies);
        gVar.g();
        this.f23330a = gVar;
    }
}

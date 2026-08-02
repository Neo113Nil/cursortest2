package CZ;

import Sc.InterfaceC4008j;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {
    @NotNull
    public static final e a(@NotNull BZ.a aVar, @NotNull String miniApp, @NotNull InterfaceC4008j<? extends ComponentCallbacksC5392m> miniAppRoot, pZ.f fVar, boolean z11) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(miniApp, "miniApp");
        Intrinsics.checkNotNullParameter(miniAppRoot, "miniAppRoot");
        return new e(miniApp, miniAppRoot, fVar, z11);
    }

    public static /* synthetic */ e b(BZ.a aVar, String str, InterfaceC4008j interfaceC4008j, pZ.f fVar, boolean z11, int i11) {
        if ((i11 & 4) != 0) {
            fVar = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return a(aVar, str, interfaceC4008j, fVar, z11);
    }
}

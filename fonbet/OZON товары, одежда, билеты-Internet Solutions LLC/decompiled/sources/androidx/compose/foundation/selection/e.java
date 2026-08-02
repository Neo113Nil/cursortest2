package androidx.compose.foundation.selection;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import t0.q;

/* loaded from: classes8.dex */
public final class e {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, boolean z11, q qVar, boolean z12, I1.i iVar, @NotNull Function1 function1) {
        return eVar.l0(new ToggleableElement(z11, qVar, z12, iVar, function1));
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull e.a aVar, @NotNull J1.a aVar2, q qVar, boolean z11, I1.i iVar, @NotNull Function0 function0) {
        return new TriStateToggleableElement(aVar2, qVar, z11, iVar, function0);
    }
}

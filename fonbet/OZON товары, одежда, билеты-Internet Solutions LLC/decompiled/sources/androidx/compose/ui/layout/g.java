package androidx.compose.ui.layout;

import Z1.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super q, Unit> function1) {
        return eVar.l0(new OnSizeChangedModifier(function1));
    }
}

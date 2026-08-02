package androidx.compose.ui.layout;

import B1.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super B, Unit> function1) {
        return eVar.l0(new OnGloballyPositionedElement(function1));
    }
}

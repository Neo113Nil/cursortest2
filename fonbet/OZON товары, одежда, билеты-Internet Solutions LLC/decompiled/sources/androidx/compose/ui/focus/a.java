package androidx.compose.ui.focus;

import j1.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super v, Unit> function1) {
        return eVar.l0(new FocusChangedElement(function1));
    }
}

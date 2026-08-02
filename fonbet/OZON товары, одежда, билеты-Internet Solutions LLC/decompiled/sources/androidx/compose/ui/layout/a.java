package androidx.compose.ui.layout;

import B1.E;
import B1.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    public static final Object a(@NotNull U u11) {
        Object m11 = u11.m();
        E e11 = m11 instanceof E ? (E) m11 : null;
        if (e11 != null) {
            return e11.e1();
        }
        return null;
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, @NotNull Object obj) {
        return eVar.l0(new LayoutIdElement(obj));
    }
}

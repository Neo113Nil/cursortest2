package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C5236c1;
import org.jetbrains.annotations.NotNull;
import u0.EnumC9909s;

/* loaded from: classes.dex */
public final class M {
    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull EnumC9909s enumC9909s) {
        return eVar.l0(new IntrinsicHeightElement(enumC9909s, true, C5236c1.a()));
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, @NotNull EnumC9909s enumC9909s) {
        return eVar.l0(new IntrinsicHeightElement(enumC9909s, false, C5236c1.a()));
    }

    @NotNull
    public static final androidx.compose.ui.e c(@NotNull androidx.compose.ui.e eVar, @NotNull EnumC9909s enumC9909s) {
        return eVar.l0(new IntrinsicWidthElement(enumC9909s, C5236c1.a()));
    }
}

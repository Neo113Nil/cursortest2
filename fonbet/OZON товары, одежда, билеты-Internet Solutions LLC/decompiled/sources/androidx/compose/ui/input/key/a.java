package androidx.compose.ui.input.key;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import v1.C10177b;

/* loaded from: classes.dex */
public final class a {
    @NotNull
    public static final e a(@NotNull e eVar, @NotNull Function1<? super C10177b, Boolean> function1) {
        return eVar.l0(new KeyInputElement(function1, null));
    }

    @NotNull
    public static final e b(@NotNull e eVar, @NotNull Function1<? super C10177b, Boolean> function1) {
        return eVar.l0(new KeyInputElement(null, function1));
    }
}

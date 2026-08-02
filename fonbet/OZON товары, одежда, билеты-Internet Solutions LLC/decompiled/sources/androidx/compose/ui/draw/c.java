package androidx.compose.ui.draw;

import i1.C6987g;
import i1.C6992l;
import i1.InterfaceC6986f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {
    @NotNull
    public static final InterfaceC6986f a(@NotNull Function1<? super C6987g, C6992l> function1) {
        return new a(new C6987g(), function1);
    }

    @NotNull
    public static final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        return eVar.l0(new DrawBehindElement(function1));
    }

    @NotNull
    public static final androidx.compose.ui.e c(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super C6987g, C6992l> function1) {
        return eVar.l0(new DrawWithCacheElement(function1));
    }

    @NotNull
    public static final androidx.compose.ui.e d(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super InterfaceC8410c, Unit> function1) {
        return eVar.l0(new DrawWithContentElement(function1));
    }
}

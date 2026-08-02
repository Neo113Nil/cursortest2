package L10;

import i10.InterfaceC6995a;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <S extends InterfaceC6995a> void a(@NotNull i iVar, @NotNull Class<S> clazz, @NotNull Function2<? super S, ? super d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(block, "block");
        iVar.W().put(clazz, new a<>(clazz, block));
    }
}

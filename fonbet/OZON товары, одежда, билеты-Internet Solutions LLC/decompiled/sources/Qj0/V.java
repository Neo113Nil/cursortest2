package Qj0;

import Sc.InterfaceC3999a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface V {
    void a();

    @NotNull
    U beginTrace(@NotNull U u11);

    @NotNull
    U beginTrace(@NotNull String str);

    @InterfaceC3999a
    void c(Function1<? super Integer, Unit> function1);

    void e();

    void endTrace(@NotNull String str);

    Object f(@NotNull kotlin.coroutines.d<? super Unit> dVar);

    boolean hasTrace(@NotNull String str);

    U removeTrace(@NotNull String str);
}

package B4;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class U {
    @NotNull
    public static final S a(@NotNull Function1<? super T, Unit> optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        T t2 = new T();
        optionsBuilder.invoke(t2);
        return t2.b();
    }
}

package J90;

import J90.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g.a it = (g.a) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.c().ordinal());
    }
}

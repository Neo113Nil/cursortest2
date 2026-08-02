package kotlinx.coroutines.flow;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
/* loaded from: classes5.dex */
public final class Q {
    public static final kotlinx.coroutines.internal.x a = new kotlinx.coroutines.internal.x("NONE");
    public static final kotlinx.coroutines.internal.x b = new kotlinx.coroutines.internal.x("PENDING");

    public static final P a(Object obj) {
        if (obj == null) {
            obj = kotlinx.coroutines.flow.internal.t.a;
        }
        return new P(obj);
    }
}

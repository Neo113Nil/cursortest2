package kotlinx.coroutines.internal;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n1#2:136\n*E\n"})
/* loaded from: classes5.dex */
public final class j {
    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(i, "Expected positive parallelism level, but got ").toString());
        }
    }
}

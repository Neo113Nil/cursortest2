package kotlinx.coroutines;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
/* loaded from: classes5.dex */
public final class U0 {
    public static final ThreadLocal<AbstractC1083i0> a = new ThreadLocal<>();

    public static AbstractC1083i0 a() {
        ThreadLocal<AbstractC1083i0> threadLocal = a;
        AbstractC1083i0 abstractC1083i0 = threadLocal.get();
        if (abstractC1083i0 != null) {
            return abstractC1083i0;
        }
        C1080h c1080h = new C1080h(Thread.currentThread());
        threadLocal.set(c1080h);
        return c1080h;
    }
}

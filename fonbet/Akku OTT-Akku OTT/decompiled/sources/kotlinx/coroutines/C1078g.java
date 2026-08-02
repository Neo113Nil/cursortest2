package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
/* renamed from: kotlinx.coroutines.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1078g<T> extends AbstractC1044a<T> {
    public final Thread d;
    public final AbstractC1083i0 e;

    public C1078g(CoroutineContext coroutineContext, Thread thread, AbstractC1083i0 abstractC1083i0) {
        super(coroutineContext, true);
        this.d = thread;
        this.e = abstractC1083i0;
    }

    @Override // kotlinx.coroutines.C0
    public final void l(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (Intrinsics.areEqual(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}

package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.flow.P;

@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 Concurrent.common.kt\nkotlinx/coroutines/internal/Concurrent_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,433:1\n37#2,2:434\n1#3:436\n351#4,11:437\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n280#1:434,2\n303#1:437,11\n*E\n"})
/* loaded from: classes5.dex */
public final class S extends kotlinx.coroutines.flow.internal.d<P<?>> {
    public final AtomicReference<Object> a = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.d
    public final boolean a(kotlinx.coroutines.flow.internal.b bVar) {
        AtomicReference<Object> atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(Q.a);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    public final Continuation[] b(kotlinx.coroutines.flow.internal.b bVar) {
        this.a.set(null);
        return kotlinx.coroutines.flow.internal.c.a;
    }

    public final Object c(P.a aVar) {
        C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(aVar));
        c1100n.r();
        while (true) {
            AtomicReference<Object> atomicReference = this.a;
            kotlinx.coroutines.internal.x xVar = Q.a;
            if (atomicReference.compareAndSet(xVar, c1100n)) {
                break;
            }
            if (atomicReference.get() != xVar) {
                Result.Companion companion = Result.INSTANCE;
                c1100n.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
                break;
            }
        }
        Object q = c1100n.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(aVar);
        }
        return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
    }
}

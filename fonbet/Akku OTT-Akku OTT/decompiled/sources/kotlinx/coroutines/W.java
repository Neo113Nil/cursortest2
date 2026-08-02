package kotlinx.coroutines;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n351#2,11:160\n351#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
/* loaded from: classes5.dex */
public final class W {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ContinuationImpl continuationImpl) {
        V v;
        int i;
        if (continuationImpl instanceof V) {
            v = (V) continuationImpl;
            int i2 = v.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v.b = i2 - Integer.MIN_VALUE;
                Object obj = v.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = v.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    v.b = 1;
                    C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(v));
                    c1100n.r();
                    Object q = c1100n.q();
                    if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(v);
                    }
                    if (q == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        v = new V(continuationImpl);
        Object obj2 = v.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = v.b;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }

    public static final Object b(long j, Continuation<? super Unit> continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        C1100n c1100n = new C1100n(1, IntrinsicsKt.intercepted(continuation));
        c1100n.r();
        if (j < Long.MAX_VALUE) {
            c(c1100n.e).H(j, c1100n);
        }
        Object q = c1100n.q();
        if (q == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return q == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? q : Unit.INSTANCE;
    }

    public static final U c(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        U u = element instanceof U ? (U) element : null;
        return u == null ? Q.a : u;
    }
}

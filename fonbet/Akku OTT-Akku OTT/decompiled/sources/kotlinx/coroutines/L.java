package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.internal.C1086c;

/* loaded from: classes5.dex */
public final class L {
    public static final C1086c a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(InterfaceC1120x0.a.a) == null) {
            coroutineContext = coroutineContext.plus(com.google.common.base.r.a());
        }
        return new C1086c(coroutineContext);
    }

    public static final void b(K k, CancellationException cancellationException) {
        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) k.getCoroutineContext().get(InterfaceC1120x0.a.a);
        if (interfaceC1120x0 != null) {
            interfaceC1120x0.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + k).toString());
        }
    }

    public static final <R> Object c(Function2<? super K, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        kotlinx.coroutines.internal.t tVar = new kotlinx.coroutines.internal.t(continuation, continuation.getContext());
        Object a = kotlinx.coroutines.intrinsics.b.a(tVar, tVar, function2);
        if (a == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return a;
    }

    public static final boolean d(K k) {
        InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) k.getCoroutineContext().get(InterfaceC1120x0.a.a);
        if (interfaceC1120x0 != null) {
            return interfaceC1120x0.isActive();
        }
        return true;
    }
}

package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kotlinx.coroutines.flow.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1058c<T> extends kotlinx.coroutines.flow.internal.g<T> {
    public final SuspendLambda d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1058c(Function2<? super kotlinx.coroutines.channels.t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        super(coroutineContext, i, aVar);
        this.d = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.internal.g
    public Object b(kotlinx.coroutines.channels.t<? super T> tVar, Continuation<? super Unit> continuation) {
        Object invoke = this.d.invoke(tVar, continuation);
        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.internal.g
    public kotlinx.coroutines.flow.internal.g<T> d(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return new C1058c(this.d, coroutineContext, i, aVar);
    }

    @Override // kotlinx.coroutines.flow.internal.g
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}

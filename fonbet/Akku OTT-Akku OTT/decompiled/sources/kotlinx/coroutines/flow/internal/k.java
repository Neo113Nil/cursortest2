package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.InterfaceC1060e;
import kotlinx.coroutines.flow.InterfaceC1061f;

/* loaded from: classes5.dex */
public final class k<T> extends j<T, T> {
    public k(InterfaceC1060e interfaceC1060e, CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar, int i2) {
        super(interfaceC1060e, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? kotlinx.coroutines.channels.a.a : aVar);
    }

    @Override // kotlinx.coroutines.flow.internal.g
    public final g<T> d(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return new k(this.d, coroutineContext, i, aVar);
    }

    @Override // kotlinx.coroutines.flow.internal.j
    public final Object e(InterfaceC1061f<? super T> interfaceC1061f, Continuation<? super Unit> continuation) {
        Object collect = this.d.collect(interfaceC1061f, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}

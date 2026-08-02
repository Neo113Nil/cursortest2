package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.InterfaceC1061f;

/* loaded from: classes5.dex */
public final class y<T> implements InterfaceC1061f<T> {
    public final kotlinx.coroutines.channels.w<T> a;

    public y(kotlinx.coroutines.channels.t tVar) {
        this.a = tVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(T t, Continuation<? super Unit> continuation) {
        Object i = this.a.i(t, continuation);
        return i == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i : Unit.INSTANCE;
    }
}

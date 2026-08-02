package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class H<T> implements K<T>, InterfaceC1060e, kotlinx.coroutines.flow.internal.q<T> {
    public final /* synthetic */ L a;

    public H(L l) {
        this.a = l;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public final InterfaceC1060e<T> a(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return M.b(this, coroutineContext, i, aVar);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    public final Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<?> continuation) {
        return L.i(this.a, interfaceC1061f, continuation);
    }
}

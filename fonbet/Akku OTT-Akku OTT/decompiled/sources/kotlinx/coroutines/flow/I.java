package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class I<T> implements O<T>, InterfaceC1060e, kotlinx.coroutines.flow.internal.q<T> {
    public final /* synthetic */ O<T> a;

    public I(G g) {
        this.a = g;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public final InterfaceC1060e<T> a(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != kotlinx.coroutines.channels.a.b) ? M.b(this, coroutineContext, i, aVar) : this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1060e
    public final Object collect(InterfaceC1061f<? super T> interfaceC1061f, Continuation<?> continuation) {
        return this.a.collect(interfaceC1061f, continuation);
    }

    @Override // kotlinx.coroutines.flow.O
    public final T getValue() {
        return this.a.getValue();
    }
}

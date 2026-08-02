package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;

/* loaded from: classes5.dex */
public final class V implements InterfaceC1061f<Object> {

    @JvmField
    public final Throwable a;

    public V(Throwable th) {
        this.a = th;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        throw this.a;
    }
}

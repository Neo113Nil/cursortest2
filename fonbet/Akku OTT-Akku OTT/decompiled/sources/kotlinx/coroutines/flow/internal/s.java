package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC1061f;

/* loaded from: classes5.dex */
public final class s implements InterfaceC1061f<Object> {
    public static final s a = new s();

    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}

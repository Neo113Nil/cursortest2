package kotlinx.coroutines.flow;

import kotlin.SubclassOptInRequired;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InterfaceC1105p0;

@SubclassOptInRequired(markerClass = InterfaceC1105p0.class)
/* loaded from: classes5.dex */
public interface F<T> extends K<T>, InterfaceC1061f<T> {
    @Override // kotlinx.coroutines.flow.InterfaceC1061f
    Object emit(T t, Continuation<? super Unit> continuation);
}

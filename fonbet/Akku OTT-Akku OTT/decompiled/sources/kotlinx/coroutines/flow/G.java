package kotlinx.coroutines.flow;

import kotlin.SubclassOptInRequired;
import kotlinx.coroutines.InterfaceC1105p0;

@SubclassOptInRequired(markerClass = InterfaceC1105p0.class)
/* loaded from: classes5.dex */
public interface G<T> extends O<T>, F<T> {
    boolean c(T t, T t2);

    @Override // kotlinx.coroutines.flow.O
    T getValue();

    void setValue(T t);
}

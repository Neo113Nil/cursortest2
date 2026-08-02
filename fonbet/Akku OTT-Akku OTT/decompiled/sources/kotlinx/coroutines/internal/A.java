package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.T0;

/* loaded from: classes5.dex */
public final /* synthetic */ class A implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        T0 t0 = (T0) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (t0 != null) {
            return t0;
        }
        if (element instanceof T0) {
            return (T0) element;
        }
        return null;
    }
}

package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.T0;

/* loaded from: classes5.dex */
public final /* synthetic */ class B implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        H h = (H) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (element instanceof T0) {
            T0<Object> t0 = (T0) element;
            Object updateThreadContext = t0.updateThreadContext(h.a);
            Object[] objArr = h.b;
            int i = h.d;
            objArr[i] = updateThreadContext;
            T0<Object>[] t0Arr = h.c;
            h.d = i + 1;
            Intrinsics.checkNotNull(t0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            t0Arr[i] = t0;
        }
        return h;
    }
}

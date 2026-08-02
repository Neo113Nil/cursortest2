package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.InterfaceC1060e;

/* loaded from: classes5.dex */
public interface q<T> extends InterfaceC1060e<T> {

    public static final class a {
        public static /* synthetic */ InterfaceC1060e a(q qVar, CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar, int i2) {
            if ((i2 & 1) != 0) {
                coroutineContext = EmptyCoroutineContext.INSTANCE;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                aVar = kotlinx.coroutines.channels.a.a;
            }
            return qVar.a(coroutineContext, i, aVar);
        }
    }

    InterfaceC1060e<T> a(CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.a aVar);
}

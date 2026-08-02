package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.T0;

/* loaded from: classes5.dex */
public final class H {

    @JvmField
    public final CoroutineContext a;
    public final Object[] b;
    public final T0<Object>[] c;
    public int d;

    public H(int i, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = new Object[i];
        this.c = new T0[i];
    }
}

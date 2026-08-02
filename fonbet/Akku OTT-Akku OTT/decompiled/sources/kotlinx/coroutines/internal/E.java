package kotlinx.coroutines.internal;

import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

@PublishedApi
/* loaded from: classes5.dex */
public final class E implements CoroutineContext.Key<D<?>> {
    public final ThreadLocal<?> a;

    public E(ThreadLocal<?> threadLocal) {
        this.a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && Intrinsics.areEqual(this.a, ((E) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}

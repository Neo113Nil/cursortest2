package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.r;

/* loaded from: classes5.dex */
public interface w<E> {
    Object c(E e);

    boolean g(Throwable th);

    void h(r.b bVar);

    Object i(E e, Continuation<? super Unit> continuation);

    boolean j();
}

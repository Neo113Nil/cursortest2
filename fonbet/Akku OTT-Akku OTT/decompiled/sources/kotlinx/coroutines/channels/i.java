package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public interface i<E> {
    Object b(Continuation<? super Boolean> continuation);

    E next();
}

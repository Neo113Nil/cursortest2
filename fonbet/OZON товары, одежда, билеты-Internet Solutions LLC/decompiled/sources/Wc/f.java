package Wc;

import Sc.s;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes10.dex */
public final class f extends kotlin.coroutines.jvm.internal.c {
    f(kotlin.coroutines.d<Object> dVar, CoroutineContext coroutineContext) {
        super(dVar, coroutineContext);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected final Object invokeSuspend(Object obj) {
        s.b(obj);
        return obj;
    }
}

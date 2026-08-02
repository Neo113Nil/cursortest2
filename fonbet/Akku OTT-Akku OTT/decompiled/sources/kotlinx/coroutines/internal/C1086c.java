package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.K;

/* renamed from: kotlinx.coroutines.internal.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1086c implements K {
    public final CoroutineContext a;

    public C1086c(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // kotlinx.coroutines.K
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.a + ')';
    }
}

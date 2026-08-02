package kotlinx.coroutines.scheduling;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.I;
import kotlinx.coroutines.internal.q;

/* loaded from: classes5.dex */
public final class j extends I {
    public static final j a = new j();

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        c.b.a.l(runnable, true, false);
    }

    @Override // kotlinx.coroutines.I
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        c.b.a.l(runnable, true, true);
    }

    @Override // kotlinx.coroutines.I
    public final I limitedParallelism(int i, String str) {
        kotlinx.coroutines.internal.j.a(i);
        return i >= i.d ? str != null ? new q(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        return "Dispatchers.IO";
    }
}

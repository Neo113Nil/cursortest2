package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractC1099m0;

/* loaded from: classes5.dex */
public class f extends AbstractC1099m0 {
    public a a;

    @Override // kotlinx.coroutines.AbstractC1099m0
    public final Executor W() {
        return this.a;
    }

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        a.q(this.a, runnable, 6);
    }

    @Override // kotlinx.coroutines.I
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        a.q(this.a, runnable, 2);
    }
}

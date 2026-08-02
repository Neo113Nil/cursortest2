package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C1100n;
import kotlinx.coroutines.I;
import kotlinx.coroutines.InterfaceC1053e0;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.U;
import kotlinx.coroutines.W0;

/* loaded from: classes5.dex */
public final class q extends I implements U {
    public final /* synthetic */ U a;
    public final I b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public q(I i, String str) {
        U u = i instanceof U ? (U) i : null;
        this.a = u == null ? Q.a : u;
        this.b = i;
        this.c = str;
    }

    @Override // kotlinx.coroutines.U
    public final void H(long j, C1100n c1100n) {
        this.a.H(j, c1100n);
    }

    @Override // kotlinx.coroutines.U
    public final InterfaceC1053e0 d(long j, W0 w0, CoroutineContext coroutineContext) {
        return this.a.d(j, w0, coroutineContext);
    }

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.b.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.I
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        this.b.dispatchYield(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.I
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return this.b.isDispatchNeeded(coroutineContext);
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        return this.c;
    }
}

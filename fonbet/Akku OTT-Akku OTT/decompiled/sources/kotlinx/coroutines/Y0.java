package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class Y0 extends I {
    public static final Y0 a = new Y0();

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        c1 c1Var = (c1) coroutineContext.get(c1.b);
        if (c1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c1Var.a = true;
    }

    @Override // kotlinx.coroutines.I
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // kotlinx.coroutines.I
    public final I limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}

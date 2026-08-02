package kotlinx.coroutines.scheduling;

import com.bumptech.glide.load.engine.q;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.AbstractC1099m0;
import kotlinx.coroutines.I;
import kotlinx.coroutines.internal.y;

/* loaded from: classes5.dex */
public final class b extends AbstractC1099m0 implements Executor {
    public static final b a = new b();
    public static final I b = I.limitedParallelism$default(j.a, q.c(RangesKt.coerceAtLeast(64, y.a), 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);

    @Override // kotlinx.coroutines.AbstractC1099m0
    public final Executor W() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        b.dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.I
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        b.dispatchYield(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.I
    public final I limitedParallelism(int i, String str) {
        return j.a.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        return "Dispatchers.IO";
    }
}

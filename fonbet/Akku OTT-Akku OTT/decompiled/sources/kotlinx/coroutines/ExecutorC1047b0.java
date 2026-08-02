package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmField;

/* renamed from: kotlinx.coroutines.b0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ExecutorC1047b0 implements Executor {

    @JvmField
    public final I a;

    public ExecutorC1047b0(I i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        I i = this.a;
        if (i.isDispatchNeeded(emptyCoroutineContext)) {
            i.dispatch(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}

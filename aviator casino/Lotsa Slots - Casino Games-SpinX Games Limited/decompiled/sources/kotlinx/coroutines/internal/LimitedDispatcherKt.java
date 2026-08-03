package kotlinx.coroutines.internal;

/* compiled from: LimitedDispatcher.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0007"}, d2 = {"checkParallelism", "", "", "namedOrThis", "Lkotlinx/coroutines/CoroutineDispatcher;", "name", "", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (i >= 1) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
    }

    public static final kotlinx.coroutines.CoroutineDispatcher namedOrThis(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.String str) {
        return str != null ? new kotlinx.coroutines.internal.NamedDispatcher(coroutineDispatcher, str) : coroutineDispatcher;
    }
}

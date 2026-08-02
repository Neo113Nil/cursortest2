package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "checkParallelism", "(I)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "name", "namedOrThis", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Expected positive parallelism level, but got ".concat(java.lang.String.valueOf(i)).toString());
        }
    }

    public static final kotlinx.coroutines.CoroutineDispatcher namedOrThis(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.String str) {
        return str != null ? new kotlinx.coroutines.internal.NamedDispatcher(coroutineDispatcher, str) : coroutineDispatcher;
    }
}

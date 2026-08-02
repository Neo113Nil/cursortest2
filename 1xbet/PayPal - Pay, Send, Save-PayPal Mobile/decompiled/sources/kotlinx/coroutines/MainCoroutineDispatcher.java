package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0004¢\u0006\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "parallelism", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "toStringInternalImpl", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "immediate"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MainCoroutineDispatcher extends kotlinx.coroutines.CoroutineDispatcher {
    public abstract kotlinx.coroutines.MainCoroutineDispatcher getImmediate();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
        java.lang.String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
        sb.append('@');
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name2) {
        kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(parallelism);
        return kotlinx.coroutines.internal.LimitedDispatcherKt.namedOrThis(this, name2);
    }

    protected final java.lang.String toStringInternalImpl() {
        kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher;
        kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
        if (this == main) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcher = main.getImmediate();
        } catch (java.lang.UnsupportedOperationException unused) {
            mainCoroutineDispatcher = null;
        }
        if (this == mainCoroutineDispatcher) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}

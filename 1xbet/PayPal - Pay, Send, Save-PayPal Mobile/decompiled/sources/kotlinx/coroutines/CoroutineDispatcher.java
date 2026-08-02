package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00142\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/CoroutineDispatcher;", "(I)Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "T", "Lkotlin/coroutines/Continuation;", "continuation", "interceptContinuation", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "releaseInterceptedContinuation", "(Lkotlin/coroutines/Continuation;)V", "other", "plus", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lkotlinx/coroutines/CoroutineDispatcher;", "toString", "()Ljava/lang/String;", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlin.coroutines.ContinuationInterceptor {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.CoroutineDispatcher.Companion INSTANCE = new kotlinx.coroutines.CoroutineDispatcher.Companion(null);

    public abstract void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block);

    public boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext context) {
        return true;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final kotlinx.coroutines.CoroutineDispatcher plus(kotlinx.coroutines.CoroutineDispatcher other) {
        return other;
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) kotlin.coroutines.ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlin.coroutines.ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    public CoroutineDispatcher() {
        super(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.CoroutineDispatcher$Key, reason: from kotlin metadata */
    public static final class Companion extends kotlin.coroutines.AbstractCoroutineContextKey<kotlin.coroutines.ContinuationInterceptor, kotlinx.coroutines.CoroutineDispatcher> {
        private Companion() {
            super(kotlin.coroutines.ContinuationInterceptor.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.CoroutineDispatcher$Key$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kotlinx.coroutines.CoroutineDispatcher.Companion.$r8$lambda$HSgR_zVE6qGoA2I3Sp8kQHzwvIY((kotlin.coroutines.CoroutineContext.Element) obj);
                }
            });
        }

        public static /* synthetic */ kotlinx.coroutines.CoroutineDispatcher $r8$lambda$HSgR_zVE6qGoA2I3Sp8kQHzwvIY(kotlin.coroutines.CoroutineContext.Element element) {
            if (element instanceof kotlinx.coroutines.CoroutineDispatcher) {
                return (kotlinx.coroutines.CoroutineDispatcher) element;
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlinx.coroutines.CoroutineDispatcher limitedParallelism$default(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i, str);
    }

    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism, java.lang.String name2) {
        kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(parallelism);
        return new kotlinx.coroutines.internal.LimitedDispatcher(this, parallelism, name2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @kotlin.ReplaceWith(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int parallelism) {
        return limitedParallelism(parallelism, null);
    }

    public void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(this, context, block);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> kotlin.coroutines.Continuation<T> interceptContinuation(kotlin.coroutines.Continuation<? super T> continuation) {
        return new kotlinx.coroutines.internal.DispatchedContinuation(this, continuation);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "");
        ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).release$kotlinx_coroutines_core();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
        sb.append('@');
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
        return sb.toString();
    }
}

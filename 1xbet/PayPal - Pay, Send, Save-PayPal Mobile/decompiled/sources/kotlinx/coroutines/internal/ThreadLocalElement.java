package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", "T", "Lkotlinx/coroutines/ThreadContextElement;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThreadLocalElement<T> implements kotlinx.coroutines.ThreadContextElement<T> {
    private final T Camera2StreamConfigurationMap;
    private final java.lang.ThreadLocal<T> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.coroutines.CoroutineContext.Key<?> key;

    public ThreadLocalElement(T t, java.lang.ThreadLocal<T> threadLocal) {
        this.Camera2StreamConfigurationMap = t;
        this.getHighResolutionOutputSizeshNQ4ISI = threadLocal;
        this.key = new kotlinx.coroutines.internal.ThreadLocalKey(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) kotlinx.coroutines.ThreadContextElement.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return kotlinx.coroutines.ThreadContextElement.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final T updateThreadContext(kotlin.coroutines.CoroutineContext context) {
        T t = this.getHighResolutionOutputSizeshNQ4ISI.get();
        this.getHighResolutionOutputSizeshNQ4ISI.set(this.Camera2StreamConfigurationMap);
        return t;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final void restoreThreadContext(kotlin.coroutines.CoroutineContext context, T oldState) {
        this.getHighResolutionOutputSizeshNQ4ISI.set(oldState);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return kotlin.jvm.internal.Intrinsics.areEqual(getKey(), key) ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getKey(), key)) {
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return this;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreadLocal(value=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", threadLocal = ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }
}

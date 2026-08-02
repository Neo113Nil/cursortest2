package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0012R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "oldValue", "", "saveThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "clearThreadContext", "()Z", "afterCompletionUndispatched", "()V", "state", "afterResume", "(Ljava/lang/Object;)V", "Camera2StreamConfigurationMap", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ThreadLocal;", "getHighSpeedVideoSizes", "threadLocalIsSet", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UndispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> getHighSpeedVideoSizes;
    private volatile boolean threadLocalIsSet;

    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        super(coroutineContext.get(kotlinx.coroutines.UndispatchedMarker.INSTANCE) == null ? coroutineContext.plus(kotlinx.coroutines.UndispatchedMarker.INSTANCE) : coroutineContext, continuation);
        this.getHighSpeedVideoSizes = new java.lang.ThreadLocal<>();
        if (continuation.getGetInputFormats().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) instanceof kotlinx.coroutines.CoroutineDispatcher) {
            return;
        }
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(coroutineContext, null);
        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
        saveThreadContext(coroutineContext, updateThreadContext);
    }

    public final void saveThreadContext(kotlin.coroutines.CoroutineContext context, java.lang.Object oldValue) {
        this.threadLocalIsSet = true;
        this.getHighSpeedVideoSizes.set(kotlin.TuplesKt.to(context, oldValue));
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.getHighSpeedVideoSizes.get() == null;
        this.getHighSpeedVideoSizes.remove();
        return !z;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine
    public final void afterCompletionUndispatched() {
        Camera2StreamConfigurationMap();
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public final void afterResume(java.lang.Object state) {
        Camera2StreamConfigurationMap();
        java.lang.Object recoverResult = kotlinx.coroutines.CompletionStateKt.recoverResult(state, this.uCont);
        kotlin.coroutines.Continuation<T> continuation = this.uCont;
        kotlin.coroutines.CoroutineContext getInputFormats = continuation.getGetInputFormats();
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getInputFormats, null);
        kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, getInputFormats, updateThreadContext) : null;
        try {
            this.uCont.resumeWith(recoverResult);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getInputFormats, updateThreadContext);
            }
        } catch (java.lang.Throwable th) {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getInputFormats, updateThreadContext);
            }
            throw th;
        }
    }

    private final void Camera2StreamConfigurationMap() {
        if (this.threadLocalIsSet) {
            kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object> pair = this.getHighSpeedVideoSizes.get();
            if (pair != null) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(pair.component1(), pair.component2());
            }
            this.getHighSpeedVideoSizes.remove();
        }
    }
}

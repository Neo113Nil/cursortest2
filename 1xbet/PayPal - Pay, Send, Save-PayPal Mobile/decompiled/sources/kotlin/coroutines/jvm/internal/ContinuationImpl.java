package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "completion", "Lkotlin/coroutines/CoroutineContext;", "_context", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "(Lkotlin/coroutines/Continuation;)V", "intercepted", "()Lkotlin/coroutines/Continuation;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {
    private final kotlin.coroutines.CoroutineContext _context;
    private transient kotlin.coroutines.Continuation<java.lang.Object> intercepted;

    public ContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> continuation, kotlin.coroutines.CoroutineContext coroutineContext) {
        super(continuation);
        this._context = coroutineContext;
    }

    public ContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this._context;
        kotlin.jvm.internal.Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> intercepted() {
        kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl = this.intercepted;
        if (continuationImpl == null) {
            kotlin.coroutines.ContinuationInterceptor continuationInterceptor = (kotlin.coroutines.ContinuationInterceptor) getContext().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
            if (continuationInterceptor == null || (continuationImpl = continuationInterceptor.interceptContinuation(this)) == null) {
                continuationImpl = this;
            }
            this.intercepted = continuationImpl;
        }
        return continuationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        kotlin.coroutines.Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            kotlin.coroutines.CoroutineContext.Element element = getContext().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(element);
            ((kotlin.coroutines.ContinuationInterceptor) element).releaseInterceptedContinuation(continuation);
        }
        this.intercepted = kotlin.coroutines.jvm.internal.CompletedContinuation.INSTANCE;
    }
}

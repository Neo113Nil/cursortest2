package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "_context", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "(Lkotlin/coroutines/Continuation;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
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
    protected void releaseIntercepted() {
        kotlin.coroutines.Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            kotlin.coroutines.CoroutineContext.Element element = getContext().get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
            kotlin.jvm.internal.Intrinsics.checkNotNull(element);
            ((kotlin.coroutines.ContinuationInterceptor) element).releaseInterceptedContinuation(continuation);
        }
        this.intercepted = kotlin.coroutines.jvm.internal.CompletedContinuation.INSTANCE;
    }
}

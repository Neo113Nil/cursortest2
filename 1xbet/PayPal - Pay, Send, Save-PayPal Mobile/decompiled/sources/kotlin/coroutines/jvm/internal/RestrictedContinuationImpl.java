package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RestrictedContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {
    public RestrictedContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        super(continuation);
        if (continuation != null && continuation.getGetHighSpeedVideoSizes() != kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
            throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public kotlin.coroutines.CoroutineContext getGetHighSpeedVideoSizes() {
        return kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
    }
}

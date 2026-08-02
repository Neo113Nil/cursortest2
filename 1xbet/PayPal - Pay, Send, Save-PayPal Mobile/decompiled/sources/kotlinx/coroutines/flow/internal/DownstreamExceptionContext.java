package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J>\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\b*\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019"}, d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "Lkotlin/coroutines/CoroutineContext;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownstreamExceptionContext implements kotlin.coroutines.CoroutineContext {
    public final java.lang.Throwable e;
    private final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    public DownstreamExceptionContext(java.lang.Throwable th, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.getHighSpeedVideoFpsRanges = coroutineContext;
        this.e = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
        return this.getHighSpeedVideoFpsRanges.plus(context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return this.getHighSpeedVideoFpsRanges.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) this.getHighSpeedVideoFpsRanges.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        return (R) this.getHighSpeedVideoFpsRanges.fold(initial, operation);
    }
}

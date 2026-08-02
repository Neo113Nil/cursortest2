package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ThreadContextElement<S> extends kotlin.coroutines.CoroutineContext.Element {
    void restoreThreadContext(kotlin.coroutines.CoroutineContext context, S oldState);

    S updateThreadContext(kotlin.coroutines.CoroutineContext context);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <S, R> R fold(kotlinx.coroutines.ThreadContextElement<S> threadContextElement, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(threadContextElement, r, function2);
        }

        public static <S, E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.ThreadContextElement<S> threadContextElement, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(threadContextElement, key);
        }

        public static <S> kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.ThreadContextElement<S> threadContextElement, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(threadContextElement, key);
        }

        public static <S> kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.ThreadContextElement<S> threadContextElement, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(threadContextElement, coroutineContext);
        }
    }
}

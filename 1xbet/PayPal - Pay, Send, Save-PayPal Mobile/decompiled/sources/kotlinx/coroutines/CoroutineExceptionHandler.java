package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.CoroutineExceptionHandler.Companion INSTANCE = kotlinx.coroutines.CoroutineExceptionHandler.Companion.getHighResolutionOutputSizeshNQ4ISI;

    void handleException(kotlin.coroutines.CoroutineContext context, java.lang.Throwable exception);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static <R> R fold(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(coroutineExceptionHandler, r, function2);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(coroutineExceptionHandler, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(coroutineExceptionHandler, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(coroutineExceptionHandler, coroutineContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$Key, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.CoroutineExceptionHandler> {
        static final /* synthetic */ kotlinx.coroutines.CoroutineExceptionHandler.Companion getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.CoroutineExceptionHandler.Companion();

        private Companion() {
        }
    }
}

package kotlin.coroutines;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "T", "Lkotlin/coroutines/Continuation;", "continuation", "interceptContinuation", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "", "releaseInterceptedContinuation", "(Lkotlin/coroutines/Continuation;)V", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "Key"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ContinuationInterceptor extends kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlin.coroutines.ContinuationInterceptor.Companion INSTANCE = kotlin.coroutines.ContinuationInterceptor.Companion.getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key);

    <T> kotlin.coroutines.Continuation<T> interceptContinuation(kotlin.coroutines.Continuation<? super T> continuation);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key);

    void releaseInterceptedContinuation(kotlin.coroutines.Continuation<?> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(kotlin.coroutines.ContinuationInterceptor continuationInterceptor, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(continuationInterceptor, r, function2);
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.ContinuationInterceptor continuationInterceptor, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(continuationInterceptor, coroutineContext);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.ContinuationInterceptor continuationInterceptor, kotlin.coroutines.CoroutineContext.Key<E> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (key instanceof kotlin.coroutines.AbstractCoroutineContextKey) {
                kotlin.coroutines.AbstractCoroutineContextKey abstractCoroutineContextKey = (kotlin.coroutines.AbstractCoroutineContextKey) key;
                if (abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey())) {
                    E e = (E) abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor);
                    if (e instanceof kotlin.coroutines.CoroutineContext.Element) {
                        return e;
                    }
                }
                return null;
            }
            if (kotlin.coroutines.ContinuationInterceptor.INSTANCE != key) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuationInterceptor, "");
            return continuationInterceptor;
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.ContinuationInterceptor continuationInterceptor, kotlin.coroutines.CoroutineContext.Key<?> key) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            if (!(key instanceof kotlin.coroutines.AbstractCoroutineContextKey)) {
                return kotlin.coroutines.ContinuationInterceptor.INSTANCE == key ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : continuationInterceptor;
            }
            kotlin.coroutines.AbstractCoroutineContextKey abstractCoroutineContextKey = (kotlin.coroutines.AbstractCoroutineContextKey) key;
            return (!abstractCoroutineContextKey.isSubKey$kotlin_stdlib(continuationInterceptor.getKey()) || abstractCoroutineContextKey.tryCast$kotlin_stdlib(continuationInterceptor) == null) ? continuationInterceptor : kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }

        public static void releaseInterceptedContinuation(kotlin.coroutines.ContinuationInterceptor continuationInterceptor, kotlin.coroutines.Continuation<?> continuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.ContinuationInterceptor$Key, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlin.coroutines.ContinuationInterceptor> {
        static final /* synthetic */ kotlin.coroutines.ContinuationInterceptor.Companion getHighSpeedVideoFpsRangesFor = new kotlin.coroutines.ContinuationInterceptor.Companion();

        private Companion() {
        }
    }
}

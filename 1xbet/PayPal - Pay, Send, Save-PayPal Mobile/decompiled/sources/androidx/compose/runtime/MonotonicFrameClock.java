package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ/\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0017\u0010\u0006\u001a\u0013\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00028\u00000\u0003H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MonotonicFrameClock extends kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final androidx.compose.runtime.MonotonicFrameClock.Companion INSTANCE = androidx.compose.runtime.MonotonicFrameClock.Companion.getHighSpeedVideoFpsRangesFor;

    <R> java.lang.Object withFrameNanos(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static <R> R fold(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(monotonicFrameClock, r, function2);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(monotonicFrameClock, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(monotonicFrameClock, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(monotonicFrameClock, coroutineContext);
        }

        @java.lang.Deprecated
        public static kotlin.coroutines.CoroutineContext.Key<?> getKey(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock) {
            return androidx.compose.runtime.MonotonicFrameClock.super.getKey();
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.MonotonicFrameClock$Key, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<androidx.compose.runtime.MonotonicFrameClock> {
        static final /* synthetic */ androidx.compose.runtime.MonotonicFrameClock.Companion getHighSpeedVideoFpsRangesFor = new androidx.compose.runtime.MonotonicFrameClock.Companion();

        private Companion() {
        }
    }
}

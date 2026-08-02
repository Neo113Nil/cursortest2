package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "Lkotlin/coroutines/CoroutineContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "onInfiniteOperation", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "Key"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InfiniteAnimationPolicy extends kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.InfiniteAnimationPolicy.Companion INSTANCE = androidx.compose.ui.platform.InfiniteAnimationPolicy.Companion.Camera2StreamConfigurationMap;

    <R> java.lang.Object onInfiniteOperation(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super R> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static <R> R fold(androidx.compose.ui.platform.InfiniteAnimationPolicy infiniteAnimationPolicy, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(infiniteAnimationPolicy, r, function2);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(androidx.compose.ui.platform.InfiniteAnimationPolicy infiniteAnimationPolicy, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(infiniteAnimationPolicy, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(androidx.compose.ui.platform.InfiniteAnimationPolicy infiniteAnimationPolicy, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(infiniteAnimationPolicy, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(androidx.compose.ui.platform.InfiniteAnimationPolicy infiniteAnimationPolicy, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(infiniteAnimationPolicy, coroutineContext);
        }

        @java.lang.Deprecated
        public static kotlin.coroutines.CoroutineContext.Key<?> getKey(androidx.compose.ui.platform.InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return androidx.compose.ui.platform.InfiniteAnimationPolicy.super.getKey();
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.InfiniteAnimationPolicy$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<androidx.compose.ui.platform.InfiniteAnimationPolicy> {
        static final /* synthetic */ androidx.compose.ui.platform.InfiniteAnimationPolicy.Companion Camera2StreamConfigurationMap = new androidx.compose.ui.platform.InfiniteAnimationPolicy.Companion();

        private Companion() {
        }
    }
}

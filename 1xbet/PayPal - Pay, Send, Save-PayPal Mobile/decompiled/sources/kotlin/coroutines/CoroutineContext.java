package kotlin.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "Key", "Element"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CoroutineContext {

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Key<E extends kotlin.coroutines.CoroutineContext.Element> {
    }

    <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation);

    <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key);

    kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key);

    kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "");
            return coroutineContext2 == kotlin.coroutines.EmptyCoroutineContext.INSTANCE ? coroutineContext : (kotlin.coroutines.CoroutineContext) coroutineContext2.fold(coroutineContext, new kotlin.jvm.functions.Function2() { // from class: kotlin.coroutines.CoroutineContext$DefaultImpls$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return kotlin.coroutines.CoroutineContext.DefaultImpls.$r8$lambda$IMQRUXJxEerD0hyYDf50b5mQ5Cc((kotlin.coroutines.CoroutineContext) obj, (kotlin.coroutines.CoroutineContext.Element) obj2);
                }
            });
        }

        public static /* synthetic */ kotlin.coroutines.CoroutineContext $r8$lambda$IMQRUXJxEerD0hyYDf50b5mQ5Cc(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext.Element element) {
            kotlin.coroutines.CombinedContext combinedContext;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
            kotlin.coroutines.CoroutineContext minusKey = coroutineContext.minusKey(element.getKey());
            if (minusKey == kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
                return element;
            }
            kotlin.coroutines.ContinuationInterceptor continuationInterceptor = (kotlin.coroutines.ContinuationInterceptor) minusKey.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
            if (continuationInterceptor == null) {
                combinedContext = new kotlin.coroutines.CombinedContext(minusKey, element);
            } else {
                kotlin.coroutines.CoroutineContext minusKey2 = minusKey.minusKey(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
                combinedContext = minusKey2 == kotlin.coroutines.EmptyCoroutineContext.INSTANCE ? new kotlin.coroutines.CombinedContext(element, continuationInterceptor) : new kotlin.coroutines.CombinedContext(new kotlin.coroutines.CombinedContext(minusKey2, element), continuationInterceptor);
            }
            return combinedContext;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Element extends kotlin.coroutines.CoroutineContext {
        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation);

        @Override // kotlin.coroutines.CoroutineContext
        <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key);

        kotlin.coroutines.CoroutineContext.Key<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key);

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            public static kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext.Element element, kotlin.coroutines.CoroutineContext coroutineContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
                return kotlin.coroutines.CoroutineContext.DefaultImpls.plus(element, coroutineContext);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Element element, kotlin.coroutines.CoroutineContext.Key<E> key) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(element.getKey(), key)) {
                    return null;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(element, "");
                return element;
            }

            public static <R> R fold(kotlin.coroutines.CoroutineContext.Element element, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
                return function2.invoke(r, element);
            }

            public static kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Element element, kotlin.coroutines.CoroutineContext.Key<?> key) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                return kotlin.jvm.internal.Intrinsics.areEqual(element.getKey(), key) ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : element;
            }
        }
    }
}

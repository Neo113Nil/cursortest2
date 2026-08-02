package kotlin.coroutines;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B0\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0019\u0010\b\u001a\u0015\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011R'\u0010\u0012\u001a\u0015\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0007\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "safeCast", "<init>", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "element", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "key", "", "isSubKey$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Key;)Z", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "Lkotlin/coroutines/CoroutineContext$Key;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractCoroutineContextKey<B extends kotlin.coroutines.CoroutineContext.Element, E extends B> implements kotlin.coroutines.CoroutineContext.Key<E> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext.Key<?> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext.Element, E> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$Key<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public AbstractCoroutineContextKey(kotlin.coroutines.CoroutineContext.Key<B> key, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext.Element, ? extends E> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = key instanceof kotlin.coroutines.AbstractCoroutineContextKey ? (kotlin.coroutines.CoroutineContext.Key<B>) ((kotlin.coroutines.AbstractCoroutineContextKey) key).getHighSpeedVideoSizes : key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    public final kotlin.coroutines.CoroutineContext.Element tryCast$kotlin_stdlib(kotlin.coroutines.CoroutineContext.Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return (kotlin.coroutines.CoroutineContext.Element) this.getHighSpeedVideoFpsRangesFor.invoke(element);
    }

    public final boolean isSubKey$kotlin_stdlib(kotlin.coroutines.CoroutineContext.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return key == this || this.getHighSpeedVideoSizes == key;
    }
}

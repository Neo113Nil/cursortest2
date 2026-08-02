package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00020\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001ao\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000422\u0010\f\u001a.\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\nj\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006`\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "V", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Lkotlin/Function1;", "", "selector", "minBy", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map$Entry;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "minWith", "(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/Map$Entry;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes3.dex */
class MapsKt___MapsJvmKt extends kotlin.collections.MapsKt__MapsKt {
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> minBy(java.util.Map<? extends K, ? extends V> map, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> function1) {
        java.util.Map.Entry<K, V> entry;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry<K, V> entry2 = (java.lang.Object) it.next();
            if (it.hasNext()) {
                R invoke = function1.invoke(entry2);
                do {
                    java.util.Map.Entry<K, V> entry3 = (java.lang.Object) it.next();
                    R invoke2 = function1.invoke(entry3);
                    if (invoke.compareTo(invoke2) > 0) {
                        entry2 = entry3;
                        invoke = invoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ java.util.Map.Entry minWith(java.util.Map map, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return (java.util.Map.Entry) kotlin.collections.CollectionsKt.minWithOrNull(map.entrySet(), comparator);
    }
}

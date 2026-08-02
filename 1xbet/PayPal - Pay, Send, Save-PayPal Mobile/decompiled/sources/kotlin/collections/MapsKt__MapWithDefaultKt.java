package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aN\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\t\u0010\n\u001aX\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\f\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\r\u0010\n"}, d2 = {"K", "V", "", "key", "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "defaultValue", "withDefault", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "", "name", "withDefaultMutable"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
/* loaded from: classes5.dex */
public class MapsKt__MapWithDefaultKt {
    public static final <K, V> V getOrImplicitDefaultNullable(java.util.Map<K, ? extends V> map, K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        if (map instanceof kotlin.collections.MapWithDefault) {
            return (V) ((kotlin.collections.MapWithDefault) map).getHighResolutionOutputSizeshNQ4ISI(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Key ");
        sb.append(k);
        sb.append(" is missing in the map.");
        throw new java.util.NoSuchElementException(sb.toString());
    }

    public static final <K, V> java.util.Map<K, V> withDefault(java.util.Map<K, ? extends V> map, kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            if (!(map instanceof kotlin.collections.MapWithDefault)) {
                return new kotlin.collections.MapWithDefaultImpl(map, function1);
            }
            map = ((kotlin.collections.MapWithDefault) map).getHighSpeedVideoFpsRangesFor();
        }
    }

    public static final <K, V> java.util.Map<K, V> withDefaultMutable(java.util.Map<K, V> map, kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            if (!(map instanceof kotlin.collections.MutableMapWithDefault)) {
                return new kotlin.collections.MutableMapWithDefaultImpl(map, function1);
            }
            map = ((kotlin.collections.MutableMapWithDefault) map).getHighSpeedVideoFpsRangesFor();
        }
    }
}

package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u001aU\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"K", "V", "Lkotlin/Function1;", "supplier", "", "close", "", "maxSize", "", "createLRUCache", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)Ljava/util/Map;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CacheKt {
    public static final <K, V> java.util.Map<K, V> createLRUCache(kotlin.jvm.functions.Function1<? super K, ? extends V> function1, kotlin.jvm.functions.Function1<? super V, kotlin.Unit> function12, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        java.util.Map<K, V> synchronizedMap = java.util.Collections.synchronizedMap(new io.ktor.util.LRUCache(function1, function12, i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(synchronizedMap, "");
        return synchronizedMap;
    }
}

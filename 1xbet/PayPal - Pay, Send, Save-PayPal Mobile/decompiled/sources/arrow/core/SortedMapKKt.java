package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\u001a\u008d\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00032<\u0010\u0007\u001a8\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Ljava/util/SortedMap;", util.h.xy.cb.b.f1091, "Lkotlin/Function2;", "", "f", "foldLeft", "(Ljava/util/SortedMap;Ljava/util/SortedMap;Lkotlin/jvm/functions/Function2;)Ljava/util/SortedMap;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SortedMapKKt {
    public static final <A, B, C> java.util.SortedMap<A, C> foldLeft(java.util.SortedMap<A, B> sortedMap, java.util.SortedMap<A, C> sortedMap2, kotlin.jvm.functions.Function2<? super java.util.SortedMap<A, C>, ? super java.util.Map.Entry<? extends A, ? extends B>, ? extends java.util.SortedMap<A, C>> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortedMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sortedMap2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.Iterator<java.util.Map.Entry<A, B>> it = sortedMap.entrySet().iterator();
        while (it.hasNext()) {
            sortedMap2 = function2.invoke(sortedMap2, it.next());
        }
        return sortedMap2;
    }
}

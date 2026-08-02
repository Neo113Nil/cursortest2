package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"T", "", "", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "collectionSizeOrDefault", "(Ljava/lang/Iterable;I)I", "", "flatten", "(Ljava/lang/Iterable;)Ljava/util/List;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Pair;", "unzip", "(Ljava/lang/Iterable;)Lkotlin/Pair;"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt__IterablesKt extends kotlin.collections.CollectionsKt__CollectionsKt {
    public static final <T> java.lang.Integer collectionSizeOrNull(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof java.util.Collection) {
            return java.lang.Integer.valueOf(((java.util.Collection) iterable).size());
        }
        return null;
    }

    public static final <T> int collectionSizeOrDefault(java.lang.Iterable<? extends T> iterable, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i;
    }

    public static final <T> java.util.List<T> flatten(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends java.lang.Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, it.next());
        }
        return arrayList;
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(java.lang.Iterable<? extends kotlin.Pair<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        int collectionSizeOrDefault = kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10);
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionSizeOrDefault);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(collectionSizeOrDefault);
        for (kotlin.Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
    }
}

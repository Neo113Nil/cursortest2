package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\t\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\b\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0006j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "", "", "sort", "(Ljava/util/List;)V", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "sortWith", "(Ljava/util/List;Ljava/util/Comparator;)V"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt__MutableCollectionsJVMKt extends kotlin.collections.CollectionsKt__IteratorsKt {
    public static final <T extends java.lang.Comparable<? super T>> void sort(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    public static final <T> void sortWith(java.util.List<T> list, java.util.Comparator<? super T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }
}

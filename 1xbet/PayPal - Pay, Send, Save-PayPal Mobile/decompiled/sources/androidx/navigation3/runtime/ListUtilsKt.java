package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a@\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a4\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\n\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "Lkotlin/Function1;", "transform", "fastMapOrMap", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "action", "fastForEachReversedOrForEachReversed", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "fastForEachOrForEach", "fastDistinctOrDistinct", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListUtilsKt {
    public static final <T, R> java.util.List<R> fastMapOrMap(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        if (!(list instanceof java.util.RandomAccess)) {
            java.util.List<? extends T> list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(function1.invoke(it.next()));
            }
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(function1.invoke(list.get(i)));
        }
        return arrayList2;
    }

    public static final <T> void fastForEachReversedOrForEachReversed(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (list instanceof java.util.RandomAccess) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            java.util.Iterator<T> it = kotlin.collections.CollectionsKt.reversed(list).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
        }
    }

    public static final <T> void fastForEachOrForEach(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (list instanceof java.util.RandomAccess) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                function1.invoke(list.get(i));
            }
            return;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    public static final <T> java.util.List<T> fastDistinctOrDistinct(java.util.List<? extends T> list) {
        if (!(list instanceof java.util.RandomAccess)) {
            return kotlin.collections.CollectionsKt.distinct(list);
        }
        androidx.collection.MutableScatterSet mutableScatterSet = new androidx.collection.MutableScatterSet(list.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            T t = list.get(i);
            if (mutableScatterSet.add(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}

package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a7\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0000*\u00020\u00132\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\f\u001a+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aG\u0010\"\u001a\u00020\u001f\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001e*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#\u001aU\u0010\"\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0014\u001a\u00028\u00002\u001a\u0010&\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000$j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`%2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010'\u001ai\u0010,\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010(*\b\u0012\u0004\u0012\u00028\u00010\u001e*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010)\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\u0016\b\u0004\u0010+\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010*H\u0086\bø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001aE\u0010\"\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f0*¢\u0006\u0004\b\"\u0010/\u001a'\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u001fH\u0002¢\u0006\u0004\b4\u00105\u001a\u000f\u00106\u001a\u000203H\u0000¢\u0006\u0004\b6\u00107\u001a\u000f\u00108\u001a\u000203H\u0000¢\u0006\u0004\b8\u00107\u001a#\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00012\n\u00109\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b:\u0010;\u001a5\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\u00109\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b:\u0010=\"\u0019\u0010A\u001a\u00020>*\u0006\u0012\u0002\b\u00030\u00048G¢\u0006\u0006\u001a\u0004\b?\u0010@\"!\u0010D\u001a\u00020\u001f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00078G¢\u0006\u0006\u001a\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "", "", "isVarargs", "", "asCollection", "([Ljava/lang/Object;Z)Ljava/util/Collection;", "", "emptyList", "()Ljava/util/List;", "elements", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "", "mutableListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "arrayListOf", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "listOfNotNull", "(Ljava/lang/Object;)Ljava/util/List;", "", "Lkotlin/random/Random;", "random", "shuffled", "(Ljava/lang/Iterable;Lkotlin/random/Random;)Ljava/util/List;", "optimizeReadOnlyList", "(Ljava/util/List;)Ljava/util/List;", "", "", "fromIndex", "toIndex", "binarySearch", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "K", "key", "Lkotlin/Function1;", "selector", "binarySearchBy", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "comparison", "(Ljava/util/List;IILkotlin/jvm/functions/Function1;)I", "p0", "p1", "p2", "", "getHighResolutionOutputSizeshNQ4ISI", "(III)V", "throwIndexOverflow", "()V", "throwCountOverflow", "collection", "collectionToArrayCommonImpl", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "(Ljava/util/List;)I", "lastIndex"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt__CollectionsKt extends kotlin.collections.CollectionsKt__CollectionsJVMKt {
    public static final <T> java.util.Collection<T> asCollection(T[] tArr, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return new kotlin.collections.ArrayAsCollection(tArr, z);
    }

    public static /* synthetic */ java.util.Collection asCollection$default(java.lang.Object[] objArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return kotlin.collections.CollectionsKt.asCollection(objArr, z);
    }

    public static final <T> java.util.List<T> emptyList() {
        return kotlin.collections.EmptyList.INSTANCE;
    }

    public static final <T> java.util.List<T> listOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length > 0 ? kotlin.collections.ArraysKt.asList(tArr) : kotlin.collections.CollectionsKt.emptyList();
    }

    public static final <T> java.util.List<T> mutableListOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(kotlin.collections.CollectionsKt.asCollection(tArr, true));
    }

    public static final <T> java.util.ArrayList<T> arrayListOf(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length == 0 ? new java.util.ArrayList<>() : new java.util.ArrayList<>(kotlin.collections.CollectionsKt.asCollection(tArr, true));
    }

    public static final <T> java.util.List<T> listOfNotNull(T t) {
        return t != null ? kotlin.collections.CollectionsKt.listOf(t) : kotlin.collections.CollectionsKt.emptyList();
    }

    public static final <T> java.util.List<T> listOfNotNull(T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return kotlin.collections.ArraysKt.filterNotNull(tArr);
    }

    public static final kotlin.ranges.IntRange getIndices(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return new kotlin.ranges.IntRange(0, collection.size() - 1);
    }

    public static final <T> int getLastIndex(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return list.size() - 1;
    }

    public static final <T> java.util.List<T> shuffled(java.lang.Iterable<? extends T> iterable, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "");
        java.util.List<T> mutableList = kotlin.collections.CollectionsKt.toMutableList(iterable);
        kotlin.collections.CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.List<T> optimizeReadOnlyList(java.util.List<? extends T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : kotlin.collections.CollectionsKt.listOf(list.get(0));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, java.lang.Comparable comparable, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return kotlin.collections.CollectionsKt.binarySearch((java.util.List<? extends java.lang.Comparable>) list, comparable, i, i2);
    }

    public static final <T extends java.lang.Comparable<? super T>> int binarySearch(java.util.List<? extends T> list, T t, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        getHighResolutionOutputSizeshNQ4ISI(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compareValues = kotlin.comparisons.ComparisonsKt.compareValues(list.get(i4), t);
            if (compareValues < 0) {
                i = i4 + 1;
            } else {
                if (compareValues <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, java.lang.Object obj, java.util.Comparator comparator, int i, int i2, int i3, java.lang.Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return kotlin.collections.CollectionsKt.binarySearch(list, obj, comparator, i, i2);
    }

    public static final <T> int binarySearch(java.util.List<? extends T> list, T t, java.util.Comparator<? super T> comparator, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        getHighResolutionOutputSizeshNQ4ISI(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare(list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else {
                if (compare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearchBy$default(java.util.List list, java.lang.Comparable comparable, int i, int i2, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.collections.CollectionsKt.binarySearch(list, i, i2, new kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1(function1, comparable));
    }

    public static final <T, K extends java.lang.Comparable<? super K>> int binarySearchBy(java.util.List<? extends T> list, K k, int i, int i2, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.collections.CollectionsKt.binarySearch(list, i, i2, new kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1(function1, k));
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, int i, int i2, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return kotlin.collections.CollectionsKt.binarySearch(list, i, i2, function1);
    }

    public static final <T> int binarySearch(java.util.List<? extends T> list, int i, int i2, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        getHighResolutionOutputSizeshNQ4ISI(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = function1.invoke(list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else {
                if (intValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        if (i2 > i3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("fromIndex (");
            sb.append(i2);
            sb.append(") is greater than toIndex (");
            sb.append(i3);
            sb.append(").");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("fromIndex (");
            sb2.append(i2);
            sb2.append(") is less than zero.");
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 <= i) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("toIndex (");
        sb3.append(i3);
        sb3.append(") is greater than size (");
        sb3.append(i);
        sb3.append(").");
        throw new java.lang.IndexOutOfBoundsException(sb3.toString());
    }

    public static final void throwIndexOverflow() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }

    public static final void throwCountOverflow() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }

    public static final java.lang.Object[] collectionToArrayCommonImpl(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        int i = 0;
        if (collection.isEmpty()) {
            return new java.lang.Object[0];
        }
        java.lang.Object[] objArr = new java.lang.Object[collection.size()];
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public static final <T> T[] collectionToArrayCommonImpl(java.util.Collection<?> collection, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        int i = 0;
        if (collection.isEmpty()) {
            return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(0, tArr);
        }
        int length = tArr.length;
        java.lang.Object[] objArr = tArr;
        if (length < collection.size()) {
            objArr = (T[]) kotlin.collections.ArraysKt.arrayOfNulls(tArr, collection.size());
        }
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(collection.size(), objArr);
    }
}

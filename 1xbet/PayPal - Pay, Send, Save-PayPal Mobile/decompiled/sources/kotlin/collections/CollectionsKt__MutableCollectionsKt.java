package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\u001a/\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\b\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0006\u001a/\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\b\u001a1\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u000e\u0010\n\u001a/\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0006\u001a1\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u000f\u0010\n\u001a/\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\b\u001a3\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0011H\u0007¢\u0006\u0004\b\u000e\u0010\u0013\u001a3\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u0013\u001a;\u0010\u0016\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001a\u001a!\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001a\u001a3\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0011H\u0007¢\u0006\u0004\b\u000e\u0010\u001e\u001a3\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0011H\u0007¢\u0006\u0004\b\u000f\u0010\u001e\u001a;\u0010\u001f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"T", "", "", "elements", "", "addAll", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "Lkotlin/sequences/Sequence;", "(Ljava/util/Collection;Lkotlin/sequences/Sequence;)Z", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "convertToListIfNotCollection", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "removeAll", "retainAll", "", "Lkotlin/Function1;", "predicate", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z", "", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)Z"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes3.dex */
public class CollectionsKt__MutableCollectionsKt extends kotlin.collections.CollectionsKt__MutableCollectionsJVMKt {
    @kotlin.IgnorableReturnValue
    public static final <T> boolean addAll(java.util.Collection<? super T> collection, java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof java.util.Collection) {
            return collection.addAll((java.util.Collection) iterable);
        }
        java.util.Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean addAll(java.util.Collection<? super T> collection, kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean addAll(java.util.Collection<? super T> collection, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return collection.addAll(kotlin.collections.ArraysKt.asList(tArr));
    }

    public static final <T> java.util.Collection<T> convertToListIfNotCollection(java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : kotlin.collections.CollectionsKt.toList(iterable);
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean removeAll(java.util.Collection<? super T> collection, java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return collection.removeAll(kotlin.collections.CollectionsKt.convertToListIfNotCollection(iterable));
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean removeAll(java.util.Collection<? super T> collection, kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.List list = kotlin.sequences.SequencesKt.toList(sequence);
        return !list.isEmpty() && collection.removeAll(list);
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean removeAll(java.util.Collection<? super T> collection, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length != 0 && collection.removeAll(kotlin.collections.ArraysKt.asList(tArr));
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean retainAll(java.util.Collection<? super T> collection, java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return collection.retainAll(kotlin.collections.CollectionsKt.convertToListIfNotCollection(iterable));
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean retainAll(java.util.Collection<? super T> collection, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length != 0) {
            return collection.retainAll(kotlin.collections.ArraysKt.asList(tArr));
        }
        boolean isEmpty = collection.isEmpty();
        collection.clear();
        return !isEmpty;
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean retainAll(java.util.Collection<? super T> collection, kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.List list = kotlin.sequences.SequencesKt.toList(sequence);
        if (!list.isEmpty()) {
            return collection.retainAll(list);
        }
        boolean isEmpty = collection.isEmpty();
        collection.clear();
        return !isEmpty;
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean removeAll(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return getHighResolutionOutputSizeshNQ4ISI((java.lang.Iterable) iterable, (kotlin.jvm.functions.Function1) function1, true);
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean retainAll(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return getHighResolutionOutputSizeshNQ4ISI((java.lang.Iterable) iterable, (kotlin.jvm.functions.Function1) function1, false);
    }

    private static final <T> boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Iterable<? extends T> iterable, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, boolean z) {
        java.util.Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @kotlin.IgnorableReturnValue
    public static final <T> T removeFirst(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @kotlin.IgnorableReturnValue
    public static final <T> T removeFirstOrNull(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @kotlin.IgnorableReturnValue
    public static final <T> T removeLast(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(kotlin.collections.CollectionsKt.getLastIndex(list));
    }

    @kotlin.IgnorableReturnValue
    public static final <T> T removeLastOrNull(java.util.List<T> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(kotlin.collections.CollectionsKt.getLastIndex(list));
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean removeAll(java.util.List<T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return getHighSpeedVideoFpsRanges(list, function1, true);
    }

    @kotlin.IgnorableReturnValue
    public static final <T> boolean retainAll(java.util.List<T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return getHighSpeedVideoFpsRanges(list, function1, false);
    }

    private static final <T> boolean getHighSpeedVideoFpsRanges(java.util.List<T> list, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, boolean z) {
        int i;
        if (!(list instanceof java.util.RandomAccess)) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(list, "");
            return getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.TypeIntrinsics.asMutableIterable(list), function1, z);
        }
        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (function1.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(list);
        if (i > lastIndex2) {
            return true;
        }
        while (true) {
            list.remove(lastIndex2);
            if (lastIndex2 == i) {
                return true;
            }
            lastIndex2--;
        }
    }
}

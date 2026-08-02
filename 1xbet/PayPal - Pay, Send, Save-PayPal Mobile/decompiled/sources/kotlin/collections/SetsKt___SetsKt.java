package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0007\u001a4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\u0002¢\u0006\u0004\b\u0003\u0010\t\u001a4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u000b\u001a.\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0004\u001a6\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\f\u0010\u0007\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\t\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"T", "", "element", "minus", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "elements", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "Lkotlin/sequences/Sequence;", "(Ljava/util/Set;Lkotlin/sequences/Sequence;)Ljava/util/Set;", "plus"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
/* loaded from: classes3.dex */
public class SetsKt___SetsKt extends kotlin.collections.SetsKt__SetsKt {
    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> set, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.Intrinsics.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> set, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
        kotlin.collections.CollectionsKt.removeAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> set, java.lang.Iterable<? extends T> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Collection<?> convertToListIfNotCollection = kotlin.collections.CollectionsKt.convertToListIfNotCollection(iterable);
        if (convertToListIfNotCollection.isEmpty()) {
            return kotlin.collections.CollectionsKt.toSet(set);
        }
        if (!(convertToListIfNotCollection instanceof java.util.Set)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
            linkedHashSet.removeAll(convertToListIfNotCollection);
            return linkedHashSet;
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        for (T t : set) {
            if (!((java.util.Set) convertToListIfNotCollection).contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> set, kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
        kotlin.collections.CollectionsKt.removeAll(linkedHashSet, sequence);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> set, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> set, T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, tArr);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> set, java.lang.Iterable<? extends T> iterable) {
        int size;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        java.lang.Integer collectionSizeOrNull = kotlin.collections.CollectionsKt.collectionSizeOrNull(iterable);
        if (collectionSizeOrNull != null) {
            size = set.size() + collectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(size));
        linkedHashSet.addAll(set);
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> set, kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kotlin.collections.MapsKt.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        kotlin.collections.CollectionsKt.addAll(linkedHashSet, sequence);
        return linkedHashSet;
    }
}

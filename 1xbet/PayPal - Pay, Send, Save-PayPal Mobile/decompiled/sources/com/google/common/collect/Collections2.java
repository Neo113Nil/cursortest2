package com.google.common.collect;

/* loaded from: classes4.dex */
public final class Collections2 {
    private Collections2() {
    }

    public static <E> java.util.Collection<E> filter(java.util.Collection<E> collection, com.google.common.base.Predicate<? super E> predicate) {
        if (collection instanceof com.google.common.collect.Collections2.FilteredCollection) {
            return ((com.google.common.collect.Collections2.FilteredCollection) collection).createCombined(predicate);
        }
        return new com.google.common.collect.Collections2.FilteredCollection((java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate));
    }

    static boolean safeContains(java.util.Collection<?> collection, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        try {
            return collection.contains(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    static boolean safeRemove(java.util.Collection<?> collection, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(collection);
        try {
            return collection.remove(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    /* loaded from: classes9.dex */
    static class FilteredCollection<E> extends java.util.AbstractCollection<E> {
        final com.google.common.base.Predicate<? super E> predicate;
        final java.util.Collection<E> unfiltered;

        FilteredCollection(java.util.Collection<E> collection, com.google.common.base.Predicate<? super E> predicate) {
            this.unfiltered = collection;
            this.predicate = predicate;
        }

        com.google.common.collect.Collections2.FilteredCollection<E> createCombined(com.google.common.base.Predicate<? super E> predicate) {
            return new com.google.common.collect.Collections2.FilteredCollection<>(this.unfiltered, com.google.common.base.Predicates.and(this.predicate, predicate));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            com.google.common.base.Preconditions.checkArgument(this.predicate.apply(e));
            return this.unfiltered.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> collection) {
            java.util.Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.Preconditions.checkArgument(this.predicate.apply(it.next()));
            }
            return this.unfiltered.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.collect.Iterables.removeIf(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object obj) {
            if (com.google.common.collect.Collections2.safeContains(this.unfiltered, obj)) {
                return this.predicate.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            return com.google.common.collect.Collections2.containsAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !com.google.common.collect.Iterables.any(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<E> iterator() {
            return com.google.common.collect.Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object obj) {
            return contains(obj) && this.unfiltered.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            java.util.Iterator<E> it = this.unfiltered.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            java.util.Iterator<E> it = this.unfiltered.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            java.util.Iterator<E> it = this.unfiltered.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.predicate.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
            return com.google.common.collect.Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) com.google.common.collect.Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    public static <F, T> java.util.Collection<T> transform(java.util.Collection<F> collection, com.google.common.base.Function<? super F, T> function) {
        return new com.google.common.collect.Collections2.TransformedCollection(collection, function);
    }

    /* loaded from: classes9.dex */
    static final class TransformedCollection<F, T> extends java.util.AbstractCollection<T> {
        final java.util.Collection<F> fromCollection;
        final com.google.common.base.Function<? super F, ? extends T> function;

        TransformedCollection(java.util.Collection<F> collection, com.google.common.base.Function<? super F, ? extends T> function) {
            this.fromCollection = (java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.fromCollection.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.fromCollection.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<T> iterator() {
            return com.google.common.collect.Iterators.transform(this.fromCollection.iterator(), this.function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.fromCollection.size();
        }
    }

    static boolean containsAllImpl(java.util.Collection<?> collection, java.util.Collection<?> collection2) {
        java.util.Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    static java.lang.String toStringImpl(java.util.Collection<?> collection) {
        java.lang.StringBuilder newStringBuilderForCollection = newStringBuilderForCollection(collection.size());
        newStringBuilderForCollection.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        for (java.lang.Object obj : collection) {
            if (!z) {
                newStringBuilderForCollection.append(", ");
            }
            if (obj == collection) {
                newStringBuilderForCollection.append("(this Collection)");
            } else {
                newStringBuilderForCollection.append(obj);
            }
            z = false;
        }
        newStringBuilderForCollection.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return newStringBuilderForCollection.toString();
    }

    static java.lang.StringBuilder newStringBuilderForCollection(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, io.ktor.http.ContentDisposition.Parameters.Size);
        return new java.lang.StringBuilder((int) java.lang.Math.min(i * 8, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR));
    }

    public static <E extends java.lang.Comparable<? super E>> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> iterable) {
        return orderedPermutations(iterable, com.google.common.collect.Ordering.natural());
    }

    public static <E> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> iterable, java.util.Comparator<? super E> comparator) {
        return new com.google.common.collect.Collections2.OrderedPermutationCollection(iterable, comparator);
    }

    /* loaded from: classes9.dex */
    static final class OrderedPermutationCollection<E> extends java.util.AbstractCollection<java.util.List<E>> {
        final java.util.Comparator<? super E> comparator;
        final com.google.common.collect.ImmutableList<E> inputList;
        final int size;

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        OrderedPermutationCollection(java.lang.Iterable<E> iterable, java.util.Comparator<? super E> comparator) {
            com.google.common.collect.ImmutableList<E> sortedCopyOf = com.google.common.collect.ImmutableList.sortedCopyOf(comparator, iterable);
            this.inputList = sortedCopyOf;
            this.comparator = comparator;
            this.size = calculateSize(sortedCopyOf, comparator);
        }

        private static <E> int calculateSize(java.util.List<E> list, java.util.Comparator<? super E> comparator) {
            int i = 1;
            int i2 = 1;
            int i3 = 1;
            while (i < list.size()) {
                if (comparator.compare(list.get(i - 1), list.get(i)) < 0) {
                    i2 = com.google.common.math.IntMath.saturatedMultiply(i2, com.google.common.math.IntMath.binomial(i, i3));
                    if (i2 == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i3 = 0;
                }
                i++;
                i3++;
            }
            return com.google.common.math.IntMath.saturatedMultiply(i2, com.google.common.math.IntMath.binomial(i, i3));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<java.util.List<E>> iterator() {
            return new com.google.common.collect.Collections2.OrderedPermutationIterator(this.inputList, this.comparator);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            return com.google.common.collect.Collections2.isPermutation(this.inputList, (java.util.List) obj);
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("orderedPermutationCollection(");
            sb.append(this.inputList);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class OrderedPermutationIterator<E> extends com.google.common.collect.AbstractIterator<java.util.List<E>> {
        final java.util.Comparator<? super E> comparator;
        java.util.List<E> nextPermutation;

        OrderedPermutationIterator(java.util.List<E> list, java.util.Comparator<? super E> comparator) {
            this.nextPermutation = new java.util.ArrayList(list);
            this.comparator = comparator;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        public final java.util.List<E> computeNext() {
            java.util.List<E> list = this.nextPermutation;
            if (list == null) {
                return endOfData();
            }
            com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
            calculateNextPermutation();
            return copyOf;
        }

        final void calculateNextPermutation() {
            int findNextJ = findNextJ();
            if (findNextJ == -1) {
                this.nextPermutation = null;
                return;
            }
            java.util.Objects.requireNonNull(this.nextPermutation);
            java.util.Collections.swap(this.nextPermutation, findNextJ, findNextL(findNextJ));
            java.util.Collections.reverse(this.nextPermutation.subList(findNextJ + 1, this.nextPermutation.size()));
        }

        final int findNextJ() {
            java.util.Objects.requireNonNull(this.nextPermutation);
            for (int size = this.nextPermutation.size() - 2; size >= 0; size--) {
                if (this.comparator.compare(this.nextPermutation.get(size), this.nextPermutation.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        final int findNextL(int i) {
            java.util.Objects.requireNonNull(this.nextPermutation);
            E e = this.nextPermutation.get(i);
            for (int size = this.nextPermutation.size() - 1; size > i; size--) {
                if (this.comparator.compare(e, this.nextPermutation.get(size)) < 0) {
                    return size;
                }
            }
            throw new java.lang.AssertionError("this statement should be unreachable");
        }
    }

    public static <E> java.util.Collection<java.util.List<E>> permutations(java.util.Collection<E> collection) {
        return new com.google.common.collect.Collections2.PermutationCollection(com.google.common.collect.ImmutableList.copyOf((java.util.Collection) collection));
    }

    /* loaded from: classes9.dex */
    static final class PermutationCollection<E> extends java.util.AbstractCollection<java.util.List<E>> {
        final com.google.common.collect.ImmutableList<E> inputList;

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        PermutationCollection(com.google.common.collect.ImmutableList<E> immutableList) {
            this.inputList = immutableList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return com.google.common.math.IntMath.factorial(this.inputList.size());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<java.util.List<E>> iterator() {
            return new com.google.common.collect.Collections2.PermutationIterator(this.inputList);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(java.lang.Object obj) {
            if (!(obj instanceof java.util.List)) {
                return false;
            }
            return com.google.common.collect.Collections2.isPermutation(this.inputList, (java.util.List) obj);
        }

        @Override // java.util.AbstractCollection
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("permutations(");
            sb.append(this.inputList);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes9.dex */
    static final class PermutationIterator<E> extends com.google.common.collect.AbstractIterator<java.util.List<E>> {
        final int[] c;
        int j;
        final java.util.List<E> list;

        /* renamed from: o, reason: collision with root package name */
        final int[] f3862o;

        PermutationIterator(java.util.List<E> list) {
            this.list = new java.util.ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.c = iArr;
            int[] iArr2 = new int[size];
            this.f3862o = iArr2;
            java.util.Arrays.fill(iArr, 0);
            java.util.Arrays.fill(iArr2, 1);
            this.j = Integer.MAX_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractIterator
        public final java.util.List<E> computeNext() {
            if (this.j <= 0) {
                return endOfData();
            }
            com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.list);
            calculateNextPermutation();
            return copyOf;
        }

        final void calculateNextPermutation() {
            int size = this.list.size() - 1;
            this.j = size;
            if (size == -1) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr = this.c;
                int i2 = this.j;
                int i3 = iArr[i2];
                int i4 = this.f3862o[i2] + i3;
                if (i4 < 0) {
                    switchDirection();
                } else if (i4 != i2 + 1) {
                    java.util.Collections.swap(this.list, (i2 - i3) + i, (i2 - i4) + i);
                    this.c[this.j] = i4;
                    return;
                } else {
                    if (i2 == 0) {
                        return;
                    }
                    i++;
                    switchDirection();
                }
            }
        }

        final void switchDirection() {
            int[] iArr = this.f3862o;
            int i = this.j;
            iArr[i] = -iArr[i];
            this.j = i - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPermutation(java.util.List<?> list, java.util.List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        com.google.common.collect.ObjectCountHashMap counts = counts(list);
        com.google.common.collect.ObjectCountHashMap counts2 = counts(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (counts.getValue(i) != counts2.get(counts.getKey(i))) {
                return false;
            }
        }
        return true;
    }

    private static <E> com.google.common.collect.ObjectCountHashMap<E> counts(java.util.Collection<E> collection) {
        com.google.common.collect.ObjectCountHashMap<E> objectCountHashMap = new com.google.common.collect.ObjectCountHashMap<>();
        for (E e : collection) {
            objectCountHashMap.put(e, objectCountHashMap.get(e) + 1);
        }
        return objectCountHashMap;
    }
}

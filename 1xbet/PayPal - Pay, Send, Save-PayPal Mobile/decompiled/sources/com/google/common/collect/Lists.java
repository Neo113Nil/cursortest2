package com.google.common.collect;

/* loaded from: classes4.dex */
public final class Lists {
    private Lists() {
    }

    public static <E> java.util.ArrayList<E> newArrayList() {
        return new java.util.ArrayList<>();
    }

    @java.lang.SafeVarargs
    public static <E> java.util.ArrayList<E> newArrayList(E... eArr) {
        com.google.common.base.Preconditions.checkNotNull(eArr);
        java.util.ArrayList<E> arrayList = new java.util.ArrayList<>(computeArrayListCapacity(eArr.length));
        java.util.Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    public static <E> java.util.ArrayList<E> newArrayList(java.lang.Iterable<? extends E> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        if (iterable instanceof java.util.Collection) {
            return new java.util.ArrayList<>((java.util.Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    public static <E> java.util.ArrayList<E> newArrayList(java.util.Iterator<? extends E> it) {
        java.util.ArrayList<E> arrayList = new java.util.ArrayList<>();
        com.google.common.collect.Iterators.addAll(arrayList, it);
        return arrayList;
    }

    static int computeArrayListCapacity(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "arraySize");
        return com.google.common.primitives.Ints.saturatedCast(i + 5 + (i / 10));
    }

    public static <E> java.util.ArrayList<E> newArrayListWithCapacity(int i) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "initialArraySize");
        return new java.util.ArrayList<>(i);
    }

    public static <E> java.util.ArrayList<E> newArrayListWithExpectedSize(int i) {
        return new java.util.ArrayList<>(computeArrayListCapacity(i));
    }

    public static <E> java.util.LinkedList<E> newLinkedList() {
        return new java.util.LinkedList<>();
    }

    public static <E> java.util.LinkedList<E> newLinkedList(java.lang.Iterable<? extends E> iterable) {
        java.util.LinkedList<E> linkedList = new java.util.LinkedList<>();
        com.google.common.collect.Iterables.addAll(linkedList, iterable);
        return linkedList;
    }

    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(java.lang.Iterable<? extends E> iterable) {
        java.util.Collection newArrayList;
        if (iterable instanceof java.util.Collection) {
            newArrayList = (java.util.Collection) iterable;
        } else {
            newArrayList = newArrayList(iterable);
        }
        return new java.util.concurrent.CopyOnWriteArrayList<>(newArrayList);
    }

    public static <E> java.util.List<E> asList(E e, E[] eArr) {
        return new com.google.common.collect.Lists.OnePlusArrayList(e, eArr);
    }

    public static <E> java.util.List<E> asList(E e, E e2, E[] eArr) {
        return new com.google.common.collect.Lists.TwoPlusArrayList(e, e2, eArr);
    }

    /* loaded from: classes9.dex */
    static final class OnePlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (E[]) ((java.lang.Object[]) com.google.common.base.Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return com.google.common.math.IntMath.saturatedAdd(this.rest.length, 1);
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }
    }

    /* loaded from: classes9.dex */
    static final class TwoPlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;
        final E second;

        TwoPlusArrayList(E e, E e2, E[] eArr) {
            this.first = e;
            this.second = e2;
            this.rest = (E[]) ((java.lang.Object[]) com.google.common.base.Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return com.google.common.math.IntMath.saturatedAdd(this.rest.length, 2);
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            if (i == 0) {
                return this.first;
            }
            if (i == 1) {
                return this.second;
            }
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return this.rest[i - 2];
        }
    }

    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.List<? extends B>> list) {
        return com.google.common.collect.CartesianList.create(list);
    }

    @java.lang.SafeVarargs
    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends B>... listArr) {
        return cartesianProduct(java.util.Arrays.asList(listArr));
    }

    public static <F, T> java.util.List<T> transform(java.util.List<F> list, com.google.common.base.Function<? super F, ? extends T> function) {
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Lists.TransformingRandomAccessList(list, function);
        }
        return new com.google.common.collect.Lists.TransformingSequentialList(list, function);
    }

    /* loaded from: classes9.dex */
    static final class TransformingSequentialList<F, T> extends java.util.AbstractSequentialList<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.List<F> fromList;
        final com.google.common.base.Function<? super F, ? extends T> function;

        TransformingSequentialList(java.util.List<F> list, com.google.common.base.Function<? super F, ? extends T> function) {
            this.fromList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(list);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList
        protected final void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final java.util.ListIterator<T> listIterator(int i) {
            return new com.google.common.collect.TransformedListIterator<F, T>(this.fromList.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                T transform(F f) {
                    return com.google.common.collect.Lists.TransformingSequentialList.this.function.apply(f);
                }
            };
        }
    }

    /* loaded from: classes9.dex */
    static final class TransformingRandomAccessList<F, T> extends java.util.AbstractList<T> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.List<F> fromList;
        final com.google.common.base.Function<? super F, ? extends T> function;

        TransformingRandomAccessList(java.util.List<F> list, com.google.common.base.Function<? super F, ? extends T> function) {
            this.fromList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(list);
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList
        protected final void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final java.util.Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.util.ListIterator<T> listIterator(int i) {
            return new com.google.common.collect.TransformedListIterator<F, T>(this.fromList.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                T transform(F f) {
                    return com.google.common.collect.Lists.TransformingRandomAccessList.this.function.apply(f);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public final T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.fromList.size();
        }
    }

    public static <T> java.util.List<java.util.List<T>> partition(java.util.List<T> list, int i) {
        com.google.common.base.Preconditions.checkNotNull(list);
        com.google.common.base.Preconditions.checkArgument(i > 0);
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Lists.RandomAccessPartition(list, i);
        }
        return new com.google.common.collect.Lists.Partition(list, i);
    }

    /* loaded from: classes9.dex */
    static class Partition<T> extends java.util.AbstractList<java.util.List<T>> {
        final java.util.List<T> list;
        final int size;

        Partition(java.util.List<T> list, int i) {
            this.list = list;
            this.size = i;
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            int i2 = this.size;
            int i3 = i * i2;
            return this.list.subList(i3, java.lang.Math.min(i2 + i3, this.list.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return com.google.common.math.IntMath.divide(this.list.size(), this.size, java.math.RoundingMode.CEILING);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.list.isEmpty();
        }
    }

    /* loaded from: classes9.dex */
    static final class RandomAccessPartition<T> extends com.google.common.collect.Lists.Partition<T> implements java.util.RandomAccess {
        RandomAccessPartition(java.util.List<T> list, int i) {
            super(list, i);
        }
    }

    public static com.google.common.collect.ImmutableList<java.lang.Character> charactersOf(java.lang.String str) {
        return new com.google.common.collect.Lists.StringAsImmutableList((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str));
    }

    public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence charSequence) {
        return new com.google.common.collect.Lists.CharSequenceAsList((java.lang.CharSequence) com.google.common.base.Preconditions.checkNotNull(charSequence));
    }

    /* loaded from: classes9.dex */
    static final class StringAsImmutableList extends com.google.common.collect.ImmutableList<java.lang.Character> {
        private final java.lang.String string;

        @Override // com.google.common.collect.ImmutableCollection
        final boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
            return subList(i, i2);
        }

        StringAsImmutableList(java.lang.String str) {
            this.string = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Character) {
                return this.string.indexOf(((java.lang.Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(java.lang.Object obj) {
            if (obj instanceof java.lang.Character) {
                return this.string.lastIndexOf(((java.lang.Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final com.google.common.collect.ImmutableList<java.lang.Character> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            return com.google.common.collect.Lists.charactersOf(this.string.substring(i, i2));
        }

        @Override // java.util.List
        public final java.lang.Character get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Character.valueOf(this.string.charAt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.string.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        final java.lang.Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: classes9.dex */
    static final class CharSequenceAsList extends java.util.AbstractList<java.lang.Character> {
        private final java.lang.CharSequence sequence;

        CharSequenceAsList(java.lang.CharSequence charSequence) {
            this.sequence = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        public final java.lang.Character get(int i) {
            com.google.common.base.Preconditions.checkElementIndex(i, size());
            return java.lang.Character.valueOf(this.sequence.charAt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.sequence.length();
        }
    }

    public static <T> java.util.List<T> reverse(java.util.List<T> list) {
        if (list instanceof com.google.common.collect.ImmutableList) {
            return ((com.google.common.collect.ImmutableList) list).reverse();
        }
        if (list instanceof com.google.common.collect.Lists.ReverseList) {
            return ((com.google.common.collect.Lists.ReverseList) list).getForwardList();
        }
        if (list instanceof java.util.RandomAccess) {
            return new com.google.common.collect.Lists.RandomAccessReverseList(list);
        }
        return new com.google.common.collect.Lists.ReverseList(list);
    }

    static class ReverseList<T> extends java.util.AbstractList<T> {
        private final java.util.List<T> forwardList;

        ReverseList(java.util.List<T> list) {
            this.forwardList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(list);
        }

        java.util.List<T> getForwardList() {
            return this.forwardList;
        }

        private int reverseIndex(int i) {
            int size = size();
            com.google.common.base.Preconditions.checkElementIndex(i, size);
            return (size - 1) - i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int reversePosition(int i) {
            int size = size();
            com.google.common.base.Preconditions.checkPositionIndex(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, T t) {
            this.forwardList.add(reversePosition(i), t);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.forwardList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.forwardList.remove(reverseIndex(i));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i, T t) {
            return this.forwardList.set(reverseIndex(i), t);
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.forwardList.get(reverseIndex(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> subList(int i, int i2) {
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2, size());
            return com.google.common.collect.Lists.reverse(this.forwardList.subList(reversePosition(i2), reversePosition(i)));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int i) {
            final java.util.ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(i));
            return new java.util.ListIterator<T>(this) { // from class: com.google.common.collect.Lists.ReverseList.1
                boolean canRemoveOrSet;
                final /* synthetic */ com.google.common.collect.Lists.ReverseList this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.util.ListIterator
                public void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public T next() {
                    if (!hasNext()) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.previous();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return this.this$0.reversePosition(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                public T previous() {
                    if (!hasPrevious()) {
                        throw new java.util.NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.next();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    com.google.common.collect.CollectPreconditions.checkRemove(this.canRemoveOrSet);
                    listIterator.remove();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator
                public void set(T t) {
                    com.google.common.base.Preconditions.checkState(this.canRemoveOrSet);
                    listIterator.set(t);
                }
            };
        }
    }

    static final class RandomAccessReverseList<T> extends com.google.common.collect.Lists.ReverseList<T> implements java.util.RandomAccess {
        RandomAccessReverseList(java.util.List<T> list) {
            super(list);
        }
    }

    static int hashCodeImpl(java.util.List<?> list) {
        java.util.Iterator<?> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = ~(~((i * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i;
    }

    static boolean equalsImpl(java.util.List<?> list, java.lang.Object obj) {
        if (obj == com.google.common.base.Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list2 = (java.util.List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof java.util.RandomAccess) || !(list2 instanceof java.util.RandomAccess)) {
            return com.google.common.collect.Iterators.elementsEqual(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!java.util.Objects.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    static <E> boolean addAllImpl(java.util.List<E> list, int i, java.lang.Iterable<? extends E> iterable) {
        java.util.ListIterator<E> listIterator = list.listIterator(i);
        java.util.Iterator<? extends E> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z = true;
        }
        return z;
    }

    static int indexOfImpl(java.util.List<?> list, java.lang.Object obj) {
        if (list instanceof java.util.RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        java.util.ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (java.util.Objects.equals(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int indexOfRandomAccess(java.util.List<?> list, java.lang.Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static int lastIndexOfImpl(java.util.List<?> list, java.lang.Object obj) {
        if (list instanceof java.util.RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        java.util.ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (java.util.Objects.equals(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(java.util.List<?> list, java.lang.Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    static <E> java.util.ListIterator<E> listIteratorImpl(java.util.List<E> list, int i) {
        return new com.google.common.collect.Lists.AbstractListWrapper(list).listIterator(i);
    }

    static <E> java.util.List<E> subListImpl(java.util.List<E> list, int i, int i2) {
        java.util.List list2;
        if (list instanceof java.util.RandomAccess) {
            list2 = new com.google.common.collect.Lists.RandomAccessListWrapper<E>(list) { // from class: com.google.common.collect.Lists.1
                private static final long serialVersionUID = 0;

                @Override // java.util.AbstractList, java.util.List
                public java.util.ListIterator<E> listIterator(int i3) {
                    return this.backingList.listIterator(i3);
                }
            };
        } else {
            list2 = new com.google.common.collect.Lists.AbstractListWrapper<E>(list) { // from class: com.google.common.collect.Lists.2
                private static final long serialVersionUID = 0;

                @Override // java.util.AbstractList, java.util.List
                public java.util.ListIterator<E> listIterator(int i3) {
                    return this.backingList.listIterator(i3);
                }
            };
        }
        return list2.subList(i, i2);
    }

    /* loaded from: classes9.dex */
    static class AbstractListWrapper<E> extends java.util.AbstractList<E> {
        final java.util.List<E> backingList;

        AbstractListWrapper(java.util.List<E> list) {
            this.backingList = (java.util.List) com.google.common.base.Preconditions.checkNotNull(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            this.backingList.add(i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, java.util.Collection<? extends E> collection) {
            return this.backingList.addAll(i, collection);
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            return this.backingList.get(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i) {
            return this.backingList.remove(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            return this.backingList.set(i, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(java.lang.Object obj) {
            return this.backingList.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.backingList.size();
        }
    }

    /* loaded from: classes9.dex */
    static class RandomAccessListWrapper<E> extends com.google.common.collect.Lists.AbstractListWrapper<E> implements java.util.RandomAccess {
        RandomAccessListWrapper(java.util.List<E> list) {
            super(list);
        }
    }
}

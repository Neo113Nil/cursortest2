package com.google.common.collect;

/* loaded from: classes9.dex */
public final class EnumMultiset<E extends java.lang.Enum<E>> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient java.lang.Class<E> type;

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ boolean contains(java.lang.Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final /* bridge */ /* synthetic */ boolean setCount(java.lang.Object obj, int i, int i2) {
        return super.setCount(obj, i, i2);
    }

    static /* synthetic */ int access$210(com.google.common.collect.EnumMultiset enumMultiset) {
        int i = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i - 1;
        return i;
    }

    static /* synthetic */ long access$322(com.google.common.collect.EnumMultiset enumMultiset, long j) {
        long j2 = enumMultiset.size - j;
        enumMultiset.size = j2;
        return j2;
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Class<E> cls) {
        return new com.google.common.collect.EnumMultiset<>(cls);
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> iterable) {
        java.util.Iterator<E> it = iterable.iterator();
        com.google.common.base.Preconditions.checkArgument(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        com.google.common.collect.EnumMultiset<E> enumMultiset = new com.google.common.collect.EnumMultiset<>(it.next().getDeclaringClass());
        com.google.common.collect.Iterables.addAll(enumMultiset, iterable);
        return enumMultiset;
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> iterable, java.lang.Class<E> cls) {
        com.google.common.collect.EnumMultiset<E> create = create(cls);
        com.google.common.collect.Iterables.addAll(create, iterable);
        return create;
    }

    private EnumMultiset(java.lang.Class<E> cls) {
        this.type = cls;
        com.google.common.base.Preconditions.checkArgument(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    private boolean isActuallyE(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum r4 = (java.lang.Enum) obj;
        int ordinal = r4.ordinal();
        E[] eArr = this.enumConstants;
        return ordinal < eArr.length && eArr[ordinal] == r4;
    }

    private void checkIsE(java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(obj);
        if (isActuallyE(obj)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected an ");
        sb.append(this.type);
        sb.append(" but got ");
        sb.append(obj);
        throw new java.lang.ClassCastException(sb.toString());
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int distinctElements() {
        return this.distinctElements;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return com.google.common.primitives.Ints.saturatedCast(this.size);
    }

    @Override // com.google.common.collect.Multiset
    public final int count(java.lang.Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((java.lang.Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(E e, int i) {
        checkIsE(e);
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        int ordinal = e.ordinal();
        int i2 = this.counts[ordinal];
        long j = i;
        long j2 = i2 + j;
        com.google.common.base.Preconditions.checkArgument(j2 <= androidx.collection.SieveCacheKt.NodeLinkMask, "too many occurrences: %s", j2);
        this.counts[ordinal] = (int) j2;
        if (i2 == 0) {
            this.distinctElements++;
        }
        this.size += j;
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int remove(java.lang.Object obj, int i) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        java.lang.Enum r1 = (java.lang.Enum) obj;
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        int ordinal = r1.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[ordinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[ordinal] = 0;
            this.distinctElements--;
            this.size -= i2;
            return i2;
        }
        iArr[ordinal] = i2 - i;
        this.size -= i;
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int setCount(E e, int i) {
        checkIsE(e);
        com.google.common.collect.CollectPreconditions.checkNonnegative(i, com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT);
        int ordinal = e.ordinal();
        int[] iArr = this.counts;
        int i2 = iArr[ordinal];
        iArr[ordinal] = i;
        this.size += i - i2;
        if (i2 == 0 && i > 0) {
            this.distinctElements++;
            return i2;
        }
        if (i2 > 0 && i == 0) {
            this.distinctElements--;
        }
        return i2;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        java.util.Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    abstract class Itr<T> implements java.util.Iterator<T> {
        int index = 0;
        int toRemove = -1;

        abstract T output(int i);

        Itr() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.index < com.google.common.collect.EnumMultiset.this.enumConstants.length) {
                int[] iArr = com.google.common.collect.EnumMultiset.this.counts;
                int i = this.index;
                if (iArr[i] > 0) {
                    return true;
                }
                this.index = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T output = output(this.index);
            int i = this.index;
            this.toRemove = i;
            this.index = i + 1;
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.toRemove >= 0);
            if (com.google.common.collect.EnumMultiset.this.counts[this.toRemove] > 0) {
                com.google.common.collect.EnumMultiset.access$210(com.google.common.collect.EnumMultiset.this);
                com.google.common.collect.EnumMultiset.access$322(com.google.common.collect.EnumMultiset.this, r0.counts[this.toRemove]);
                com.google.common.collect.EnumMultiset.this.counts[this.toRemove] = 0;
            }
            this.toRemove = -1;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<E> elementIterator() {
        return new com.google.common.collect.EnumMultiset<E>.Itr<E>() { // from class: com.google.common.collect.EnumMultiset.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            public E output(int i) {
                return (E) com.google.common.collect.EnumMultiset.this.enumConstants[i];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    final java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        return new com.google.common.collect.EnumMultiset<E>.Itr<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.EnumMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            public com.google.common.collect.Multiset.Entry<E> output(final int i) {
                return new com.google.common.collect.Multisets.AbstractEntry<E>(this) { // from class: com.google.common.collect.EnumMultiset.2.1
                    final /* synthetic */ com.google.common.collect.EnumMultiset.AnonymousClass2 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public E getElement() {
                        return (E) com.google.common.collect.EnumMultiset.this.enumConstants[i];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return com.google.common.collect.EnumMultiset.this.counts[i];
                    }
                };
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        com.google.common.collect.Serialization.writeMultiset(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        java.lang.Class<E> cls = (java.lang.Class) java.util.Objects.requireNonNull(objectInputStream.readObject());
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        com.google.common.collect.Serialization.populateMultiset(this, objectInputStream);
    }
}

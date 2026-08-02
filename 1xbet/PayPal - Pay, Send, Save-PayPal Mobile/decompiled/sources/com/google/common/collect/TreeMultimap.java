package com.google.common.collect;

/* loaded from: classes9.dex */
public class TreeMultimap<K, V> extends com.google.common.collect.AbstractSortedKeySortedSetMultimap<K, V> {
    private static final long serialVersionUID = 0;
    private transient java.util.Comparator<? super K> keyComparator;
    private transient java.util.Comparator<? super V> valueComparator;

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsKey(java.lang.Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean containsValue(java.lang.Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Collection get(java.lang.Object obj) {
        return get((com.google.common.collect.TreeMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object obj) {
        return get((com.google.common.collect.TreeMultimap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.SortedSet get(java.lang.Object obj) {
        return get((com.google.common.collect.TreeMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean put(java.lang.Object obj, java.lang.Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean putAll(java.lang.Object obj, java.lang.Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.SortedSet removeAll(java.lang.Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public /* bridge */ /* synthetic */ java.util.SortedSet replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return super.replaceValues(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public /* bridge */ /* synthetic */ java.util.Collection values() {
        return super.values();
    }

    public static <K extends java.lang.Comparable, V extends java.lang.Comparable> com.google.common.collect.TreeMultimap<K, V> create() {
        return new com.google.common.collect.TreeMultimap<>(com.google.common.collect.Ordering.natural(), com.google.common.collect.Ordering.natural());
    }

    public static <K, V> com.google.common.collect.TreeMultimap<K, V> create(java.util.Comparator<? super K> comparator, java.util.Comparator<? super V> comparator2) {
        return new com.google.common.collect.TreeMultimap<>((java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator), (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator2));
    }

    public static <K extends java.lang.Comparable, V extends java.lang.Comparable> com.google.common.collect.TreeMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return new com.google.common.collect.TreeMultimap<>(com.google.common.collect.Ordering.natural(), com.google.common.collect.Ordering.natural(), multimap);
    }

    TreeMultimap(java.util.Comparator<? super K> comparator, java.util.Comparator<? super V> comparator2) {
        super(new java.util.TreeMap(comparator));
        this.keyComparator = comparator;
        this.valueComparator = comparator2;
    }

    private TreeMultimap(java.util.Comparator<? super K> comparator, java.util.Comparator<? super V> comparator2, com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        this(comparator, comparator2);
        putAll(multimap);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    java.util.Map<K, java.util.Collection<V>> createAsMap() {
        return createMaybeNavigableAsMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public java.util.SortedSet<V> createCollection() {
        return new java.util.TreeSet(this.valueComparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    java.util.Collection<V> createCollection(K k) {
        if (k == 0) {
            keyComparator().compare(k, k);
        }
        return super.createCollection(k);
    }

    @java.lang.Deprecated
    public java.util.Comparator<? super K> keyComparator() {
        return this.keyComparator;
    }

    @Override // com.google.common.collect.SortedSetMultimap
    public java.util.Comparator<? super V> valueComparator() {
        return this.valueComparator;
    }

    @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.NavigableSet<V> get(K k) {
        return (java.util.NavigableSet) super.get((java.lang.Object) k);
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public java.util.NavigableSet<K> keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractSortedKeySortedSetMultimap, com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public java.util.NavigableMap<K, java.util.Collection<V>> asMap() {
        return (java.util.NavigableMap) super.asMap();
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(keyComparator());
        objectOutputStream.writeObject(valueComparator());
        com.google.common.collect.Serialization.writeMultimap(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyComparator = (java.util.Comparator) java.util.Objects.requireNonNull((java.util.Comparator) objectInputStream.readObject());
        this.valueComparator = (java.util.Comparator) java.util.Objects.requireNonNull((java.util.Comparator) objectInputStream.readObject());
        setMap(new java.util.TreeMap(this.keyComparator));
        com.google.common.collect.Serialization.populateMultimap(this, objectInputStream);
    }
}

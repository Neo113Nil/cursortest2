package com.google.common.collect;

/* loaded from: classes9.dex */
public final class HashMultimap<K, V> extends com.google.common.collect.AbstractSetMultimap<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 2;
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean containsEntry(java.lang.Object obj, java.lang.Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean containsKey(java.lang.Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean containsValue(java.lang.Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ java.util.Set entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Set get(java.lang.Object obj) {
        return super.get((com.google.common.collect.HashMultimap<K, V>) obj);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ com.google.common.collect.Multiset keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean put(java.lang.Object obj, java.lang.Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean putAll(com.google.common.collect.Multimap multimap) {
        return super.putAll(multimap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean putAll(java.lang.Object obj, java.lang.Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Set removeAll(java.lang.Object obj) {
        return super.removeAll(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Set replaceValues(java.lang.Object obj, java.lang.Iterable iterable) {
        return super.replaceValues((com.google.common.collect.HashMultimap<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return super.values();
    }

    public static <K, V> com.google.common.collect.HashMultimap<K, V> create() {
        return new com.google.common.collect.HashMultimap<>();
    }

    public static <K, V> com.google.common.collect.HashMultimap<K, V> create(int i, int i2) {
        return new com.google.common.collect.HashMultimap<>(i, i2);
    }

    public static <K, V> com.google.common.collect.HashMultimap<K, V> create(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        return new com.google.common.collect.HashMultimap<>(multimap);
    }

    private HashMultimap() {
        this(12, 2);
    }

    private HashMultimap(int i, int i2) {
        super(com.google.common.collect.Platform.newHashMapWithExpectedSize(i));
        this.expectedValuesPerKey = 2;
        com.google.common.base.Preconditions.checkArgument(i2 >= 0);
        this.expectedValuesPerKey = i2;
    }

    private HashMultimap(com.google.common.collect.Multimap<? extends K, ? extends V> multimap) {
        super(com.google.common.collect.Platform.newHashMapWithExpectedSize(multimap.keySet().size()));
        this.expectedValuesPerKey = 2;
        putAll(multimap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final java.util.Set<V> createCollection() {
        return com.google.common.collect.Platform.newHashSetWithExpectedSize(this.expectedValuesPerKey);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        com.google.common.collect.Serialization.writeMultimap(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        int readCount = com.google.common.collect.Serialization.readCount(objectInputStream);
        setMap(com.google.common.collect.Platform.newHashMapWithExpectedSize(12));
        com.google.common.collect.Serialization.populateMultimap(this, objectInputStream, readCount);
    }
}

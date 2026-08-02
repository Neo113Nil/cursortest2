package com.google.common.collect;

/* loaded from: classes9.dex */
final class ImmutableEnumMap<K extends java.lang.Enum<K>, V> extends com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K, V> {
    private final transient java.util.EnumMap<K, V> delegate;

    @Override // com.google.common.collect.ImmutableMap
    final boolean isPartialView() {
        return false;
    }

    static <K extends java.lang.Enum<K>, V> com.google.common.collect.ImmutableMap<K, V> asImmutable(java.util.EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return com.google.common.collect.ImmutableMap.of();
        }
        if (size == 1) {
            java.util.Map.Entry entry = (java.util.Map.Entry) com.google.common.collect.Iterables.getOnlyElement(enumMap.entrySet());
            return com.google.common.collect.ImmutableMap.of((java.lang.Enum) entry.getKey(), entry.getValue());
        }
        return new com.google.common.collect.ImmutableEnumMap(enumMap);
    }

    private ImmutableEnumMap(java.util.EnumMap<K, V> enumMap) {
        this.delegate = enumMap;
        com.google.common.base.Preconditions.checkArgument(!enumMap.isEmpty());
    }

    @Override // com.google.common.collect.ImmutableMap
    final com.google.common.collect.UnmodifiableIterator<K> keyIterator() {
        return com.google.common.collect.Iterators.unmodifiableIterator(this.delegate.keySet().iterator());
    }

    @Override // java.util.Map
    public final int size() {
        return this.delegate.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.delegate.containsKey(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(java.lang.Object obj) {
        return this.delegate.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.collect.ImmutableEnumMap) {
            obj = ((com.google.common.collect.ImmutableEnumMap) obj).delegate;
        }
        return this.delegate.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
    final com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K, V>> entryIterator() {
        return com.google.common.collect.Maps.unmodifiableEntryIterator(this.delegate.entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
    final java.lang.Object writeReplace() {
        return new com.google.common.collect.ImmutableEnumMap.EnumSerializedForm(this.delegate);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use EnumSerializedForm");
    }

    static final class EnumSerializedForm<K extends java.lang.Enum<K>, V> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.EnumMap<K, V> delegate;

        EnumSerializedForm(java.util.EnumMap<K, V> enumMap) {
            this.delegate = enumMap;
        }

        final java.lang.Object readResolve() {
            return new com.google.common.collect.ImmutableEnumMap(this.delegate);
        }
    }
}

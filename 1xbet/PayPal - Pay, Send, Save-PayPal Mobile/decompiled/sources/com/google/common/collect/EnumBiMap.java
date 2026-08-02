package com.google.common.collect;

/* loaded from: classes9.dex */
public final class EnumBiMap<K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> extends com.google.common.collect.AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    transient java.lang.Class<K> keyTypeOrObjectUnderJ2cl;
    transient java.lang.Class<V> valueTypeOrObjectUnderJ2cl;

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ boolean containsValue(java.lang.Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ java.lang.Object forcePut(java.lang.Object obj, java.lang.Object obj2) {
        return super.forcePut(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ void putAll(java.util.Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ java.util.Set values() {
        return super.values();
    }

    public static <K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> com.google.common.collect.EnumBiMap<K, V> create(java.lang.Class<K> cls, java.lang.Class<V> cls2) {
        return new com.google.common.collect.EnumBiMap<>(cls, cls2);
    }

    public static <K extends java.lang.Enum<K>, V extends java.lang.Enum<V>> com.google.common.collect.EnumBiMap<K, V> create(java.util.Map<K, V> map) {
        com.google.common.collect.EnumBiMap<K, V> create = create(inferKeyTypeOrObjectUnderJ2cl(map), inferValueTypeOrObjectUnderJ2cl(map));
        create.putAll(map);
        return create;
    }

    private EnumBiMap(java.lang.Class<K> cls, java.lang.Class<V> cls2) {
        super(new java.util.EnumMap(cls), new java.util.EnumMap(cls2));
        this.keyTypeOrObjectUnderJ2cl = cls;
        this.valueTypeOrObjectUnderJ2cl = cls2;
    }

    static <K extends java.lang.Enum<K>> java.lang.Class<K> inferKeyTypeOrObjectUnderJ2cl(java.util.Map<K, ?> map) {
        if (map instanceof com.google.common.collect.EnumBiMap) {
            return ((com.google.common.collect.EnumBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        if (map instanceof com.google.common.collect.EnumHashBiMap) {
            return ((com.google.common.collect.EnumHashBiMap) map).keyTypeOrObjectUnderJ2cl;
        }
        com.google.common.base.Preconditions.checkArgument(!map.isEmpty());
        return com.google.common.collect.Platform.getDeclaringClassOrObjectForJ2cl(map.keySet().iterator().next());
    }

    private static <V extends java.lang.Enum<V>> java.lang.Class<V> inferValueTypeOrObjectUnderJ2cl(java.util.Map<?, V> map) {
        if (map instanceof com.google.common.collect.EnumBiMap) {
            return ((com.google.common.collect.EnumBiMap) map).valueTypeOrObjectUnderJ2cl;
        }
        com.google.common.base.Preconditions.checkArgument(!map.isEmpty());
        return com.google.common.collect.Platform.getDeclaringClassOrObjectForJ2cl(map.values().iterator().next());
    }

    public final java.lang.Class<K> keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    public final java.lang.Class<V> valueType() {
        return this.valueTypeOrObjectUnderJ2cl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public final K checkKey(K k) {
        return (K) com.google.common.base.Preconditions.checkNotNull(k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public final V checkValue(V v) {
        return (V) com.google.common.base.Preconditions.checkNotNull(v);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        objectOutputStream.writeObject(this.valueTypeOrObjectUnderJ2cl);
        com.google.common.collect.Serialization.writeMap(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyTypeOrObjectUnderJ2cl = (java.lang.Class) java.util.Objects.requireNonNull(objectInputStream.readObject());
        this.valueTypeOrObjectUnderJ2cl = (java.lang.Class) java.util.Objects.requireNonNull(objectInputStream.readObject());
        setDelegates(new java.util.EnumMap(this.keyTypeOrObjectUnderJ2cl), new java.util.EnumMap(this.valueTypeOrObjectUnderJ2cl));
        com.google.common.collect.Serialization.populateMap(this, objectInputStream);
    }
}

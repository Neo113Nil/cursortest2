package com.google.common.collect;

/* loaded from: classes9.dex */
public final class EnumHashBiMap<K extends java.lang.Enum<K>, V> extends com.google.common.collect.AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    transient java.lang.Class<K> keyTypeOrObjectUnderJ2cl;

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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ java.lang.Object forcePut(java.lang.Object obj, java.lang.Object obj2) {
        return forcePut((com.google.common.collect.EnumHashBiMap<K, V>) obj, (java.lang.Enum) obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ com.google.common.collect.BiMap inverse() {
        return super.inverse();
    }

    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractBiMap, com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return put((com.google.common.collect.EnumHashBiMap<K, V>) obj, (java.lang.Enum) obj2);
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

    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.EnumHashBiMap<K, V> create(java.lang.Class<K> cls) {
        return new com.google.common.collect.EnumHashBiMap<>(cls);
    }

    public static <K extends java.lang.Enum<K>, V> com.google.common.collect.EnumHashBiMap<K, V> create(java.util.Map<K, ? extends V> map) {
        com.google.common.collect.EnumHashBiMap<K, V> create = create(com.google.common.collect.EnumBiMap.inferKeyTypeOrObjectUnderJ2cl(map));
        create.putAll(map);
        return create;
    }

    private EnumHashBiMap(java.lang.Class<K> cls) {
        super(new java.util.EnumMap(cls), new java.util.HashMap());
        this.keyTypeOrObjectUnderJ2cl = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractBiMap
    public final K checkKey(K k) {
        return (K) com.google.common.base.Preconditions.checkNotNull(k);
    }

    public final V put(K k, V v) {
        return (V) super.put((com.google.common.collect.EnumHashBiMap<K, V>) k, (K) v);
    }

    public final V forcePut(K k, V v) {
        return (V) super.forcePut((com.google.common.collect.EnumHashBiMap<K, V>) k, (K) v);
    }

    public final java.lang.Class<K> keyType() {
        return this.keyTypeOrObjectUnderJ2cl;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.keyTypeOrObjectUnderJ2cl);
        com.google.common.collect.Serialization.writeMap(this, objectOutputStream);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyTypeOrObjectUnderJ2cl = (java.lang.Class) java.util.Objects.requireNonNull(objectInputStream.readObject());
        setDelegates(new java.util.EnumMap(this.keyTypeOrObjectUnderJ2cl), new java.util.HashMap());
        com.google.common.collect.Serialization.populateMap(this, objectInputStream);
    }
}

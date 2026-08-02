package com.google.common.reflect;

/* loaded from: classes9.dex */
public final class MutableTypeToInstanceMap<B> extends com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>, B> implements com.google.common.reflect.TypeToInstanceMap<B> {
    private final java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> backingMap = new java.util.HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @java.lang.Deprecated
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return put((com.google.common.reflect.TypeToken<? extends com.google.common.reflect.TypeToken<? extends B>>) obj, (com.google.common.reflect.TypeToken<? extends B>) obj2);
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public final <T extends B> T getInstance(java.lang.Class<T> cls) {
        return (T) trustedGet(com.google.common.reflect.TypeToken.of((java.lang.Class) cls));
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public final <T extends B> T getInstance(com.google.common.reflect.TypeToken<T> typeToken) {
        return (T) trustedGet(typeToken.rejectTypeVariables());
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public final <T extends B> T putInstance(java.lang.Class<T> cls, T t) {
        return (T) trustedPut(com.google.common.reflect.TypeToken.of((java.lang.Class) cls), t);
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public final <T extends B> T putInstance(com.google.common.reflect.TypeToken<T> typeToken, T t) {
        return (T) trustedPut(typeToken.rejectTypeVariables(), t);
    }

    @java.lang.Deprecated
    public final B put(com.google.common.reflect.TypeToken<? extends B> typeToken, B b) {
        throw new java.lang.UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @java.lang.Deprecated
    public final void putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>, ? extends B> map) {
        throw new java.lang.UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<com.google.common.reflect.TypeToken<? extends B>, B>> entrySet() {
        return com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.transformEntries(super.entrySet());
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public final java.util.Map<com.google.common.reflect.TypeToken<? extends B>, B> delegate() {
        return this.backingMap;
    }

    private <T extends B> T trustedPut(com.google.common.reflect.TypeToken<T> typeToken, T t) {
        return this.backingMap.put(typeToken, t);
    }

    private <T extends B> T trustedGet(com.google.common.reflect.TypeToken<T> typeToken) {
        return this.backingMap.get(typeToken);
    }

    static final class UnmodifiableEntry<K, V> extends com.google.common.collect.ForwardingMapEntry<K, V> {
        private final java.util.Map.Entry<K, V> delegate;

        static <K, V> java.util.Set<java.util.Map.Entry<K, V>> transformEntries(final java.util.Set<java.util.Map.Entry<K, V>> set) {
            return new com.google.common.collect.ForwardingSet<java.util.Map.Entry<K, V>>() { // from class: com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.1
                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
                public java.util.Set<java.util.Map.Entry<K, V>> delegate() {
                    return set;
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                    return com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.transformEntries(super.iterator());
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public java.lang.Object[] toArray() {
                    return standardToArray();
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public <T> T[] toArray(T[] tArr) {
                    return (T[]) standardToArray(tArr);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> java.util.Iterator<java.util.Map.Entry<K, V>> transformEntries(java.util.Iterator<java.util.Map.Entry<K, V>> it) {
            return com.google.common.collect.Iterators.transform(it, new com.google.common.base.Function() { // from class: com.google.common.reflect.MutableTypeToInstanceMap$UnmodifiableEntry$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.m10341$r8$lambda$PXRRP_NYxQ7IKAyO13H8YX2pq0((java.util.Map.Entry) obj);
                }
            });
        }

        private UnmodifiableEntry(java.util.Map.Entry<K, V> entry) {
            this.delegate = (java.util.Map.Entry) com.google.common.base.Preconditions.checkNotNull(entry);
        }

        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        public final java.util.Map.Entry<K, V> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public final V setValue(V v) {
            throw new java.lang.UnsupportedOperationException();
        }

        /* renamed from: $r8$lambda$PXRRP_NYxQ7IKAyO13H8YX2p-q0, reason: not valid java name */
        public static /* synthetic */ com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry m10341$r8$lambda$PXRRP_NYxQ7IKAyO13H8YX2pq0(java.util.Map.Entry entry) {
            return new com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry(entry);
        }
    }
}

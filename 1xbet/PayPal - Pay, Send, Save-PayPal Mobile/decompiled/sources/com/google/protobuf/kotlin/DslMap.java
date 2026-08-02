package com.google.protobuf.kotlin;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\b\b\u0002\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e0\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00148\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u0016R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010("}, d2 = {"Lcom/google/protobuf/kotlin/DslMap;", "K", "V", "Lcom/google/protobuf/kotlin/DslProxy;", "P", "", "delegate", "<init>", "(Ljava/util/Map;)V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DslMap<K, V, P extends com.google.protobuf.kotlin.DslProxy> implements java.util.Map<K, V>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Map<K, V> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public DslMap(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.delegate = map;
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final java.util.Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<V> values() {
        return getValues();
    }

    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return new com.google.protobuf.kotlin.UnmodifiableMapEntries(this.delegate.entrySet());
    }

    public final java.util.Set<K> getKeys() {
        return new com.google.protobuf.kotlin.UnmodifiableSet(this.delegate.keySet());
    }

    public final java.util.Collection<V> getValues() {
        return new com.google.protobuf.kotlin.UnmodifiableCollection(this.delegate.values());
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.delegate, other);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.delegate.hashCode();
    }

    public final java.lang.String toString() {
        return this.delegate.toString();
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k, V v, V v2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k, V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k, V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V merge(K k, V v, java.util.function.BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public final int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.Map
    public final V get(java.lang.Object key) {
        return this.delegate.get(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object value) {
        return this.delegate.containsValue(value);
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object key) {
        return this.delegate.containsKey(key);
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k, java.util.function.Function<? super K, ? extends V> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k, java.util.function.BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00028\u0001H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0\u001d8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u0014\u0010+\u001a\u00020\r8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/adapters/ImmutableMapAdapter;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "", "impl", "<init>", "(Ljava/util/Map;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "key", "containsKey", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "", "entries", "getEntries", "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImmutableMapAdapter<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap<K, V>, java.util.Map<K, V>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> entries;
    private final java.util.Map<K, V> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> keys;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMapAdapter(java.util.Map<K, ? extends V> map) {
        this.getHighSpeedVideoSizes = map;
        this.keys = new androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableSetAdapter(map.keySet());
        this.values = new androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableCollectionAdapter(map.values());
        this.entries = new androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.ImmutableSetAdapter(map.entrySet());
    }

    @Override // java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> getKeys() {
        return this.keys;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> getValues() {
        return this.values;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object other) {
        return this.getHighSpeedVideoSizes.equals(other);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString();
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
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    public final int getSize() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // java.util.Map
    public final V get(java.lang.Object key) {
        return this.getHighSpeedVideoSizes.get(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object value) {
        return this.getHighSpeedVideoSizes.containsValue(value);
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object key) {
        return this.getHighSpeedVideoSizes.containsKey(key);
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

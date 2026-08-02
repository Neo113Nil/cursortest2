package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 3*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00013B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ1\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001e\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010.8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R&\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "m", "putAll", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", com.visa.cbp.getEncExpo.warmup, "getSize", "()I", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "entries", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends kotlin.collections.AbstractMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> {
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> node;
    private final int size;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap getHighSpeedVideoFpsRangesFor = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime(), 0);

    public PersistentHashMap(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode, int i) {
        this.node = trieNode;
        this.size = i;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getNode$runtime() {
        return this.node;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap put(java.lang.Object obj, java.lang.Object obj2) {
        return put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V>) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap remove(java.lang.Object obj) {
        return remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap remove(java.lang.Object obj, java.lang.Object obj2) {
        return remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V>) obj, obj2);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // kotlin.collections.AbstractMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> getKeys() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> getValues() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapValues(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> getHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object key) {
        return this.node.containsKey(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public V get(java.lang.Object key) {
        return this.node.get(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> put(K key, V value) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<K, V> put = this.node.put(key != null ? key.hashCode() : 0, key, value, 0);
        return put == null ? this : new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<>(put.getNode(), size() + put.getSizeDelta());
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> remove(K key) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> remove = this.node.remove(key != null ? key.hashCode() : 0, key, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return INSTANCE.emptyOf$runtime();
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<>(remove, size() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> remove(K key, V value) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> remove = this.node.remove(key != null ? key.hashCode() : 0, key, value, 0);
        if (this.node == remove) {
            return this;
        }
        if (remove == null) {
            return INSTANCE.emptyOf$runtime();
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<>(remove, size() - 1);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> putAll(java.util.Map<? extends K, ? extends V> m) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> persistentHashMap = this;
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentHashMap, "");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = persistentHashMap.builder2();
        builder2.putAll(m);
        return builder2.build2();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> clear() {
        return INSTANCE.emptyOf$runtime();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> builder2() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<>(this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap$Companion;", "", "<init>", "()V", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "emptyOf$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> emptyOf$runtime() {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> persistentHashMap = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(persistentHashMap, "");
            return persistentHashMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

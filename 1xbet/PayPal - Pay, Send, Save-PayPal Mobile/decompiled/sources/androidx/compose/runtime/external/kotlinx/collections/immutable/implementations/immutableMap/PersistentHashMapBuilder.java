package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001f8\u0007@EX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R.\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00018\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00104\u001a\u0002038\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010:\u001a\u0002032\u0006\u0010\u0011\u001a\u0002038\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R&\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>0=8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000=8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010D8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownership", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnership", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnership", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode$runtime", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "operationResult", "Ljava/lang/Object;", "getOperationResult$runtime", "()Ljava/lang/Object;", "setOperationResult$runtime", "(Ljava/lang/Object;)V", "", "modCount", com.visa.cbp.getEncExpo.warmup, "getModCount$runtime", "()I", "setModCount$runtime", "(I)V", io.ktor.http.ContentDisposition.Parameters.Size, "getSize", "setSize", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class PersistentHashMapBuilder<K, V> extends kotlin.collections.AbstractMutableMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> {
    public static final int $stable = 8;
    private androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> getHighSpeedVideoFpsRanges;
    private int modCount;
    private androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> node;
    private V operationResult;
    private androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership ownership = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership();
    private int size;

    public PersistentHashMapBuilder(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> persistentHashMap) {
        this.getHighSpeedVideoFpsRanges = persistentHashMap;
        this.node = this.getHighSpeedVideoFpsRanges.getNode$runtime();
        this.size = this.getHighSpeedVideoFpsRanges.size();
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership getOwnership() {
        return this.ownership;
    }

    protected final void setOwnership(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership mutabilityOwnership) {
        this.ownership = mutabilityOwnership;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> getNode$runtime() {
        return this.node;
    }

    public final void setNode$runtime(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode) {
        this.node = trieNode;
    }

    public final V getOperationResult$runtime() {
        return this.operationResult;
    }

    public final void setOperationResult$runtime(V v) {
        this.operationResult = v;
    }

    /* renamed from: getModCount$runtime, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    public final void setModCount$runtime(int i) {
        this.modCount = i;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> build() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> persistentHashMap;
        if (this.node == this.getHighSpeedVideoFpsRanges.getNode$runtime()) {
            persistentHashMap = this.getHighSpeedVideoFpsRanges;
        } else {
            this.ownership = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership();
            persistentHashMap = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<>(this.node, size());
        }
        this.getHighSpeedVideoFpsRanges = persistentHashMap;
        return persistentHashMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public java.util.Set<K> getKeys() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public java.util.Collection<V> getValues() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object key) {
        return this.node.containsKey(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object key) {
        return this.node.get(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.mutablePut(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> from) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, V> persistentHashMap = from instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap) from : null;
        if (persistentHashMap == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder persistentHashMapBuilder = from instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder ? (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder) from : null;
            persistentHashMap = persistentHashMapBuilder != null ? persistentHashMapBuilder.build() : null;
        }
        if (persistentHashMap != null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter deltaCounter = new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter(0, 1, null);
            int size = size();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode = this.node;
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> node$runtime = persistentHashMap.getNode$runtime();
            kotlin.jvm.internal.Intrinsics.checkNotNull(node$runtime, "");
            this.node = trieNode.mutablePutAll(node$runtime, 0, deltaCounter, this);
            int size2 = (persistentHashMap.size() + size) - deltaCounter.getCount();
            if (size != size2) {
                setSize(size2);
                return;
            }
            return;
        }
        super.putAll(from);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object key) {
        this.operationResult = null;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode mutableRemove = this.node.mutableRemove(key != null ? key.hashCode() : 0, key, 0, this);
        if (mutableRemove == null) {
            mutableRemove = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime();
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableRemove, "");
        }
        this.node = mutableRemove;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object key, java.lang.Object value) {
        int size = size();
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode mutableRemove = this.node.mutableRemove(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (mutableRemove == null) {
            mutableRemove = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime();
            kotlin.jvm.internal.Intrinsics.checkNotNull(mutableRemove, "");
        }
        this.node = mutableRemove;
        return size != size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> eMPTY$runtime = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime();
        kotlin.jvm.internal.Intrinsics.checkNotNull(eMPTY$runtime, "");
        this.node = eMPTY$runtime;
        setSize(0);
    }
}

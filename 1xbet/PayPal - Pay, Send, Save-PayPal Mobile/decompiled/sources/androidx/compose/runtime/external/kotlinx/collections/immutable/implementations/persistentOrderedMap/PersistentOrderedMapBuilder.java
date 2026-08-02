package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010 R,\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010&0%8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0001068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "build", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "clear", "()V", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "getHighResolutionOutputSizeshNQ4ISI", "", "p0", "firstKey", "Ljava/lang/Object;", "getFirstKey$runtime", "()Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilder<K, V> extends kotlin.collections.AbstractMutableMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Object getHighSpeedVideoFpsRangesFor;
    private java.lang.Object firstKey;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> hashMapBuilder;

    public PersistentOrderedMapBuilder(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.getHighResolutionOutputSizeshNQ4ISI = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.getFirstKey();
        this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getLastKey();
        this.hashMapBuilder = this.getHighResolutionOutputSizeshNQ4ISI.getHashMap$runtime().builder();
    }

    /* renamed from: getFirstKey$runtime, reason: from getter */
    public final java.lang.Object getFirstKey() {
        return this.firstKey;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> getHashMapBuilder$runtime() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> build() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> persistentOrderedMap;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> build = this.hashMapBuilder.build();
        if (build == this.getHighResolutionOutputSizeshNQ4ISI.getHashMap$runtime()) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(this.firstKey == this.getHighResolutionOutputSizeshNQ4ISI.getFirstKey());
            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(this.getHighSpeedVideoFpsRangesFor == this.getHighResolutionOutputSizeshNQ4ISI.getLastKey());
            persistentOrderedMap = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            persistentOrderedMap = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<>(this.firstKey, this.getHighSpeedVideoFpsRangesFor, build);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderEntries(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final java.util.Set<K> getKeys() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final java.util.Collection<V> getValues() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object key) {
        return this.hashMapBuilder.containsKey(key);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object key) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMapBuilder.get(key);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public final V put(K key, V value) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMapBuilder.get(key);
        if (linkedValue != null) {
            if (linkedValue.getValue() == value) {
                return value;
            }
            this.hashMapBuilder.put(key, linkedValue.withValue(value));
            return linkedValue.getValue();
        }
        if (isEmpty()) {
            this.firstKey = key;
            this.getHighSpeedVideoFpsRangesFor = key;
            this.hashMapBuilder.put(key, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<>(value));
            return null;
        }
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNull(linkedValue2);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(!r2.getHasNext());
        this.hashMapBuilder.put(obj, linkedValue2.withNext(key));
        this.hashMapBuilder.put(key, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<>(value, obj));
        this.getHighSpeedVideoFpsRangesFor = key;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object key) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> remove = this.hashMapBuilder.remove(key);
        if (remove == null) {
            return null;
        }
        if (remove.getHasPrevious()) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMapBuilder.get(remove.getPrevious());
            kotlin.jvm.internal.Intrinsics.checkNotNull(linkedValue);
            this.hashMapBuilder.put(remove.getPrevious(), linkedValue.withNext(remove.getNext()));
        } else {
            this.firstKey = remove.getNext();
        }
        if (remove.getHasNext()) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue2 = this.hashMapBuilder.get(remove.getNext());
            kotlin.jvm.internal.Intrinsics.checkNotNull(linkedValue2);
            this.hashMapBuilder.put(remove.getNext(), linkedValue2.withPrevious(remove.getPrevious()));
        } else {
            this.getHighSpeedVideoFpsRangesFor = remove.getPrevious();
        }
        return remove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object key, java.lang.Object value) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMapBuilder.get(key);
        if (linkedValue == null || !kotlin.jvm.internal.Intrinsics.areEqual(linkedValue.getValue(), value)) {
            return false;
        }
        remove(key);
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.hashMapBuilder.clear();
        this.firstKey = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
    }
}

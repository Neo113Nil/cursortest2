package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 9*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u00019B5\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J1\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0014\u0010\u001d\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010'R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00028\u0000008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00028\u0001048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R&\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u00102"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "K", "V", "Lkotlin/collections/AbstractMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "", "firstKey", "lastKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "", "", "getEntries", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "", "m", "putAll", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Ljava/lang/Object;", "getFirstKey$runtime", "()Ljava/lang/Object;", "getLastKey$runtime", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "getKeys", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "values", "entries", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistentOrderedMap<K, V> extends kotlin.collections.AbstractMap<K, V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> {
    private static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap getHighSpeedVideoFpsRanges;
    private final java.lang.Object firstKey;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> hashMap;
    private final java.lang.Object lastKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.Companion(null);
    public static final int $stable = 8;

    public PersistentOrderedMap(java.lang.Object obj, java.lang.Object obj2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> persistentHashMap) {
        this.firstKey = obj;
        this.lastKey = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap put(java.lang.Object obj, java.lang.Object obj2) {
        return put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V>) obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap remove(java.lang.Object obj) {
        return remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap remove(java.lang.Object obj, java.lang.Object obj2) {
        return remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V>) obj, obj2);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> values() {
        return getValues();
    }

    /* renamed from: getFirstKey$runtime, reason: from getter */
    public final java.lang.Object getFirstKey() {
        return this.firstKey;
    }

    /* renamed from: getLastKey$runtime, reason: from getter */
    public final java.lang.Object getLastKey() {
        return this.lastKey;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> getHashMap$runtime() {
        return this.hashMap;
    }

    @Override // kotlin.collections.AbstractMap
    public final int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<K> getKeys() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection<V> getValues() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapValues(this);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object key) {
        return this.hashMap.containsKey(key);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final V get(java.lang.Object key) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMap.get(key);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> put(K key, V value) {
        if (isEmpty()) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<>(key, key, this.hashMap.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>) key, (K) new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<>(value)));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMap.get(key);
        if (linkedValue != null) {
            if (linkedValue.getValue() == value) {
                return this;
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<>(this.firstKey, this.lastKey, this.hashMap.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>) key, (K) linkedValue.withValue(value)));
        }
        java.lang.Object obj = this.lastKey;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue2 = this.hashMap.get(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNull(linkedValue2);
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<>(this.firstKey, key, this.hashMap.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>) obj, (java.lang.Object) linkedValue2.withNext(key)).put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap) key, (K) new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue(value, obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // kotlin.collections.AbstractMap, java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> remove(K key) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMap.get(key);
        if (linkedValue == null) {
            return this;
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>> remove = this.hashMap.remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>) key);
        java.util.Map map = remove;
        if (linkedValue.getHasPrevious()) {
            java.lang.Object obj = remove.get(linkedValue.getPrevious());
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            map = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>) remove.put((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>) linkedValue.getPrevious(), (java.lang.Object) ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue) obj).withNext(linkedValue.getNext()));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap persistentHashMap = map;
        if (linkedValue.getHasNext()) {
            java.lang.Object obj2 = map.get(linkedValue.getNext());
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
            persistentHashMap = map.put((java.util.Map) linkedValue.getNext(), (java.lang.Object) ((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue) obj2).withPrevious(linkedValue.getPrevious()));
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<>(!linkedValue.getHasPrevious() ? linkedValue.getNext() : this.firstKey, !linkedValue.getHasNext() ? linkedValue.getPrevious() : this.lastKey, persistentHashMap);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> remove(K key, V value) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.hashMap.get(key);
        return (linkedValue == null || !kotlin.jvm.internal.Intrinsics.areEqual(linkedValue.getValue(), value)) ? this : remove((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V>) key);
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> putAll(java.util.Map<? extends K, ? extends V> m) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> persistentOrderedMap = this;
        kotlin.jvm.internal.Intrinsics.checkNotNull(persistentOrderedMap, "");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2 = persistentOrderedMap.builder2();
        builder2.putAll(m);
        return builder2.build2();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K, V> clear() {
        return INSTANCE.emptyOf$runtime();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<K, V> builder2() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap$Companion;", "", "<init>", "()V", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "emptyOf$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <K, V> androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> emptyOf$runtime() {
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap<K, V> persistentOrderedMap = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(persistentOrderedMap, "");
            return persistentOrderedMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain endOfChain = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;
        getHighSpeedVideoFpsRanges = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap(endOfChain, endOfChain, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.INSTANCE.emptyOf$runtime());
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<K, V>> getEntries() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapEntries(this);
    }
}

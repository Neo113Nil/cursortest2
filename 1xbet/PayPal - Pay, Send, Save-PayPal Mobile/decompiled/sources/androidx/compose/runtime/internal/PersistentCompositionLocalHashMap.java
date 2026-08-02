package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u001c\u001bB3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R6\u0010\u001a\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "T", "key", "get", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "putValue", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/ValueHolder;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "builder", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "entries", "Companion", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentCompositionLocalHashMap extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> implements androidx.compose.runtime.PersistentCompositionLocalMap {
    private static final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap Empty;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Companion INSTANCE = new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Companion(null);
    public static final int $stable = 8;

    public PersistentCompositionLocalHashMap(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> trieNode, int i) {
        super(trieNode, i);
    }

    public final /* bridge */ boolean containsKey(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
        return super.containsKey((java.lang.Object) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.CompositionLocal) {
            return containsKey((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
        }
        return false;
    }

    public final /* bridge */ boolean containsValue(androidx.compose.runtime.ValueHolder<java.lang.Object> valueHolder) {
        return super.containsValue((java.lang.Object) valueHolder);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.ValueHolder) {
            return containsValue((androidx.compose.runtime.ValueHolder<java.lang.Object>) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> get(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
        return (androidx.compose.runtime.ValueHolder) super.get((java.lang.Object) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> get(java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.CompositionLocal) {
            return get((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
        }
        return null;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.CompositionLocal) {
            return get((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
        }
        return null;
    }

    public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> getOrDefault(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal, androidx.compose.runtime.ValueHolder<java.lang.Object> valueHolder) {
        return (androidx.compose.runtime.ValueHolder) super.getOrDefault((java.lang.Object) compositionLocal, (java.lang.Object) valueHolder);
    }

    public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> getOrDefault(java.lang.Object obj, androidx.compose.runtime.ValueHolder<java.lang.Object> valueHolder) {
        return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? valueHolder : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, valueHolder);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? obj2 : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, (androidx.compose.runtime.ValueHolder<java.lang.Object>) obj2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>>> getEntries() {
        return super.getEntries();
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public final <T> T get(androidx.compose.runtime.CompositionLocal<T> key) {
        return (T) androidx.compose.runtime.CompositionLocalMapKt.read(this, key);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    public final androidx.compose.runtime.PersistentCompositionLocalMap putValue(androidx.compose.runtime.CompositionLocal<java.lang.Object> key, androidx.compose.runtime.ValueHolder<java.lang.Object> value) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> put = getNode$runtime().put(key.hashCode(), key, value, 0);
        return put == null ? this : new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap(put.getNode(), size() + put.getSizeDelta());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder, reason: merged with bridge method [inline-methods] */
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> builder2() {
        return new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Builder(this);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\t"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "map", "<init>", "(Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;)V", "build", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getMap$runtime", "setMap$runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> implements androidx.compose.runtime.PersistentCompositionLocalMap.Builder {
        public static final int $stable = 8;
        private androidx.compose.runtime.internal.PersistentCompositionLocalHashMap map;

        public final /* bridge */ boolean containsKey(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
            return super.containsKey((java.lang.Object) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.CompositionLocal) {
                return containsKey((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
            }
            return false;
        }

        public final /* bridge */ boolean containsValue(androidx.compose.runtime.ValueHolder<java.lang.Object> valueHolder) {
            return super.containsValue((java.lang.Object) valueHolder);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.ValueHolder) {
                return containsValue((androidx.compose.runtime.ValueHolder<java.lang.Object>) obj);
            }
            return false;
        }

        public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> get(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
            return (androidx.compose.runtime.ValueHolder) super.get((java.lang.Object) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> get(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.CompositionLocal) {
                return get((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
            }
            return null;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.CompositionLocal) {
                return get((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
            }
            return null;
        }

        /* renamed from: getMap$runtime, reason: from getter */
        public final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap getMap() {
            return this.map;
        }

        public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> getOrDefault(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal, androidx.compose.runtime.ValueHolder<java.lang.Object> valueHolder) {
            return (androidx.compose.runtime.ValueHolder) super.getOrDefault((java.lang.Object) compositionLocal, (java.lang.Object) valueHolder);
        }

        public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> getOrDefault(java.lang.Object obj, androidx.compose.runtime.ValueHolder<java.lang.Object> valueHolder) {
            return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? valueHolder : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, valueHolder);
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
            return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? obj2 : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, (androidx.compose.runtime.ValueHolder<java.lang.Object>) obj2);
        }

        public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> remove(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
            return (androidx.compose.runtime.ValueHolder) super.remove((java.lang.Object) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ androidx.compose.runtime.ValueHolder<java.lang.Object> remove(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.CompositionLocal) {
                return remove((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
            }
            return null;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.CompositionLocal) {
                return remove((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
            }
            return null;
        }

        public final void setMap$runtime(androidx.compose.runtime.internal.PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            this.map = persistentCompositionLocalHashMap;
        }

        public Builder(androidx.compose.runtime.internal.PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            super(persistentCompositionLocalHashMap);
            this.map = persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.ValueHolder<java.lang.Object>> build2() {
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap persistentCompositionLocalHashMap;
            if (getNode$runtime() == this.map.getNode$runtime()) {
                persistentCompositionLocalHashMap = this.map;
            } else {
                setOwnership(new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership());
                persistentCompositionLocalHashMap = new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap(getNode$runtime(), size());
            }
            this.map = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Empty", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getEmpty", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getEmpty$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getEmpty$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap getEmpty() {
            return androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Empty;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode eMPTY$runtime = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime();
        kotlin.jvm.internal.Intrinsics.checkNotNull(eMPTY$runtime, "");
        Empty = new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap(eMPTY$runtime, 0);
    }
}

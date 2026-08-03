package androidx.compose.runtime.internal;

/* compiled from: PersistentCompositionLocalMap.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00192\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u0018\u0019B1\u0012\"\u0010\u0006\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016R6\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "size", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "builder", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "get", "T", com.ironsource.X3.i.W, "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "putValue", "value", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistentCompositionLocalHashMap extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<? extends java.lang.Object>> implements androidx.compose.runtime.PersistentCompositionLocalMap {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Companion INSTANCE = new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Companion(null);
    private static final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap Empty;

    public /* bridge */ boolean containsKey(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
        return super.containsKey((androidx.compose.runtime.internal.PersistentCompositionLocalHashMap) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.CompositionLocal) {
            return containsKey((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(androidx.compose.runtime.State<? extends java.lang.Object> state) {
        return super.containsValue((java.lang.Object) state);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.State) {
            return containsValue((androidx.compose.runtime.State<? extends java.lang.Object>) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public /* bridge */ androidx.compose.runtime.State<java.lang.Object> get(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
        return (androidx.compose.runtime.State) super.get((androidx.compose.runtime.internal.PersistentCompositionLocalHashMap) compositionLocal);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ androidx.compose.runtime.State<java.lang.Object> get(java.lang.Object obj) {
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

    public /* bridge */ androidx.compose.runtime.State<java.lang.Object> getOrDefault(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal, androidx.compose.runtime.State<? extends java.lang.Object> state) {
        return (androidx.compose.runtime.State) super.getOrDefault((java.lang.Object) compositionLocal, (java.lang.Object) state);
    }

    public final /* bridge */ androidx.compose.runtime.State getOrDefault(java.lang.Object obj, androidx.compose.runtime.State state) {
        return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? state : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, (androidx.compose.runtime.State<? extends java.lang.Object>) state);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? obj2 : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, (androidx.compose.runtime.State<? extends java.lang.Object>) obj2);
    }

    public PersistentCompositionLocalHashMap(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<java.lang.Object>> trieNode, int i) {
        super(trieNode, i);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    public androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet<java.util.Map.Entry<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<java.lang.Object>>> getEntries() {
        return super.getEntries();
    }

    @Override // androidx.compose.runtime.CompositionLocalMap
    public <T> T get(androidx.compose.runtime.CompositionLocal<T> key) {
        return (T) androidx.compose.runtime.CompositionLocalMapKt.read(this, key);
    }

    @Override // androidx.compose.runtime.PersistentCompositionLocalMap
    public androidx.compose.runtime.PersistentCompositionLocalMap putValue(androidx.compose.runtime.CompositionLocal<java.lang.Object> key, androidx.compose.runtime.State<? extends java.lang.Object> value) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.ModificationResult<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<? extends java.lang.Object>> put = getNode$runtime_release().put(key.hashCode(), key, value, 0);
        return put == null ? this : new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap(put.getNode(), size() + put.getSizeDelta());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: builder, reason: merged with bridge method [inline-methods] */
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<? extends java.lang.Object>> builder2() {
        return new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Builder(this);
    }

    /* compiled from: PersistentCompositionLocalMap.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/PersistentCompositionLocalMap$Builder;", "map", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "(Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;)V", "getMap$runtime_release", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "setMap$runtime_release", "build", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<? extends java.lang.Object>> implements androidx.compose.runtime.PersistentCompositionLocalMap.Builder {
        public static final int $stable = 8;
        private androidx.compose.runtime.internal.PersistentCompositionLocalHashMap map;

        public /* bridge */ boolean containsKey(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
            return super.containsKey((androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Builder) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.CompositionLocal) {
                return containsKey((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(androidx.compose.runtime.State<? extends java.lang.Object> state) {
            return super.containsValue((java.lang.Object) state);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(java.lang.Object obj) {
            if (obj instanceof androidx.compose.runtime.State) {
                return containsValue((androidx.compose.runtime.State<? extends java.lang.Object>) obj);
            }
            return false;
        }

        public /* bridge */ androidx.compose.runtime.State<java.lang.Object> get(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
            return (androidx.compose.runtime.State) super.get((androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Builder) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ androidx.compose.runtime.State<java.lang.Object> get(java.lang.Object obj) {
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

        public /* bridge */ androidx.compose.runtime.State<java.lang.Object> getOrDefault(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal, androidx.compose.runtime.State<? extends java.lang.Object> state) {
            return (androidx.compose.runtime.State) super.getOrDefault((java.lang.Object) compositionLocal, (java.lang.Object) state);
        }

        public final /* bridge */ androidx.compose.runtime.State getOrDefault(java.lang.Object obj, androidx.compose.runtime.State state) {
            return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? state : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, (androidx.compose.runtime.State<? extends java.lang.Object>) state);
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
            return !(obj instanceof androidx.compose.runtime.CompositionLocal) ? obj2 : getOrDefault((androidx.compose.runtime.CompositionLocal<java.lang.Object>) obj, (androidx.compose.runtime.State<? extends java.lang.Object>) obj2);
        }

        public /* bridge */ androidx.compose.runtime.State<java.lang.Object> remove(androidx.compose.runtime.CompositionLocal<java.lang.Object> compositionLocal) {
            return (androidx.compose.runtime.State) super.remove((androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Builder) compositionLocal);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ androidx.compose.runtime.State<java.lang.Object> remove(java.lang.Object obj) {
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

        /* renamed from: getMap$runtime_release, reason: from getter */
        public final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap getMap() {
            return this.map;
        }

        public final void setMap$runtime_release(androidx.compose.runtime.internal.PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            this.map = persistentCompositionLocalHashMap;
        }

        public Builder(androidx.compose.runtime.internal.PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
            super(persistentCompositionLocalHashMap);
            this.map = persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<? extends java.lang.Object>> build2() {
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap persistentCompositionLocalHashMap;
            if (getNode$runtime_release() == this.map.getNode$runtime_release()) {
                persistentCompositionLocalHashMap = this.map;
            } else {
                setOwnership(new androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership());
                persistentCompositionLocalHashMap = new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap(getNode$runtime_release(), size());
            }
            this.map = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }
    }

    /* compiled from: PersistentCompositionLocalMap.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\u00020\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap$Companion;", "", "()V", "Empty", "Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "getEmpty$annotations", "getEmpty", "()Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEmpty$annotations() {
        }

        private Companion() {
        }

        public final androidx.compose.runtime.internal.PersistentCompositionLocalHashMap getEmpty() {
            return androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.Empty;
        }
    }

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode eMPTY$runtime_release = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime_release();
        kotlin.jvm.internal.Intrinsics.checkNotNull(eMPTY$runtime_release, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        Empty = new androidx.compose.runtime.internal.PersistentCompositionLocalHashMap(eMPTY$runtime_release, 0);
    }
}

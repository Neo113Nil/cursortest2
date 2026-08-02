package com.apollographql.apollo.cache.normalized.api.internal;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001(B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012,\b\u0002\u0010\u0006\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010\u001a\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u001c0\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0019\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010\u001f\u001a\u00020\u0016J\u0006\u0010\u0011\u001a\u00020\u0005J\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!J\b\u0010\"\u001a\u00020\u0016H\u0002J+\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0013\u001a\u00028\u00002\b\u0010\u0017\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010$J\u001c\u0010%\u001a\u00020\u00162\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0002J\u001c\u0010'\u001a\u00020\u00162\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0006\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\bX\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u000b\u001a6\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r0\fj\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache;", "Key", "Value", "", "maxSize", "", "weigher", "Lkotlin/Function2;", "Lcom/apollographql/apollo/cache/normalized/api/internal/Weigher;", "<init>", "(ILkotlin/jvm/functions/Function2;)V", com.datadog.trace.api.DDSpanTypes.CACHE, "Ljava/util/LinkedHashMap;", "Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache$Node;", "Lkotlin/collections/LinkedHashMap;", "headNode", "tailNode", io.ktor.http.ContentDisposition.Parameters.Size, "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "set", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "Lkotlin/jvm/internal/EnhancedNullability;", "removeUnsafe", "", "clear", "dump", "", "trim", "addNode", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache$Node;", "moveNodeToHead", "node", "unlinkNode", "Node", "apollo-normalized-cache-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LruCache<Key, Value> {
    private int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.LinkedHashMap<Key, com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value>> getHighSpeedVideoFpsRanges;
    private com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> getHighSpeedVideoFpsRangesFor;
    private com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function2<Key, Value, java.lang.Integer> getHighSpeedVideoSizesFor;

    public static /* synthetic */ int $r8$lambda$qSgDKNwRuclZQwEs_1WlpHVuxNI(java.lang.Object obj, java.lang.Object obj2) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LruCache(int i, kotlin.jvm.functions.Function2<? super Key, ? super Value, java.lang.Integer> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizesFor = function2;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap<>(0, 0.75f);
    }

    public /* synthetic */ LruCache(int i, kotlin.jvm.functions.Function2 function2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new kotlin.jvm.functions.Function2() { // from class: com.apollographql.apollo.cache.normalized.api.internal.LruCache$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(com.apollographql.apollo.cache.normalized.api.internal.LruCache.$r8$lambda$qSgDKNwRuclZQwEs_1WlpHVuxNI(obj, obj2));
            }
        } : function2);
    }

    public final Value get(Key key) {
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node = this.getHighSpeedVideoFpsRanges.get(key);
        if (node != null) {
            getHighSpeedVideoFpsRanges((com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node) node);
        }
        if (node != null) {
            return node.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    public final void set(Key key, Value value) {
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node = this.getHighSpeedVideoFpsRanges.get(key);
        if (node == null) {
            java.util.LinkedHashMap<Key, com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value>> linkedHashMap = this.getHighSpeedVideoFpsRanges;
            com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node2 = new com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<>(key, value, this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes = node2;
            if (node2.getHighResolutionOutputSizeshNQ4ISI == null) {
                this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes;
            } else {
                com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node3 = node2.getHighResolutionOutputSizeshNQ4ISI;
                if (node3 != null) {
                    node3.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes;
                }
            }
            this.Camera2StreamConfigurationMap += this.getHighSpeedVideoSizesFor.invoke(key, value).intValue();
            linkedHashMap.put(key, node2);
        } else {
            node.getHighSpeedVideoFpsRangesFor = value;
            getHighSpeedVideoFpsRanges((com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node) node);
        }
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node4 = this.getHighSpeedVideoFpsRangesFor;
        while (node4 != null && this.Camera2StreamConfigurationMap > this.getHighResolutionOutputSizeshNQ4ISI) {
            kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getHighSpeedVideoFpsRanges).remove(node4.getHighSpeedVideoSizes);
            Camera2StreamConfigurationMap(node4);
            node4 = this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public final Value remove(Key key) {
        return getHighSpeedVideoFpsRanges((com.apollographql.apollo.cache.normalized.api.internal.LruCache<Key, Value>) key);
    }

    public final java.util.Set<Key> keys() {
        java.util.Set<Key> keySet = this.getHighSpeedVideoFpsRanges.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
        return keySet;
    }

    private final Value getHighSpeedVideoFpsRanges(Key key) {
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> remove = this.getHighSpeedVideoFpsRanges.remove(key);
        Value value = remove != null ? remove.getHighSpeedVideoFpsRangesFor : null;
        if (remove != null) {
            Camera2StreamConfigurationMap(remove);
        }
        return value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void remove(java.util.Collection<? extends Key> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        java.util.Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges((com.apollographql.apollo.cache.normalized.api.internal.LruCache<Key, Value>) it.next());
        }
    }

    public final void clear() {
        this.getHighSpeedVideoFpsRanges.clear();
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = 0;
    }

    /* renamed from: size, reason: from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Map<Key, Value> dump() {
        java.util.LinkedHashMap<Key, com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value>> linkedHashMap = this.getHighSpeedVideoFpsRanges;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap.size()));
        java.util.Iterator<T> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap2.put(entry.getKey(), ((com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node) entry.getValue()).getHighSpeedVideoFpsRangesFor);
        }
        return linkedHashMap2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003BG\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0000\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00018\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00018\u00038\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\r\u0010\u000bR$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00008\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\f\u0010\u000fR$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00008\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache$Node;", "Key", "Value", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache$Node;)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/cache/normalized/api/internal/LruCache$Node;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Node<Key, Value> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        Value getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        Key getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> Camera2StreamConfigurationMap = null;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> getHighResolutionOutputSizeshNQ4ISI;

        public Node(Key key, Value value, com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node) {
            this.getHighSpeedVideoSizes = key;
            this.getHighSpeedVideoFpsRangesFor = value;
            this.getHighResolutionOutputSizeshNQ4ISI = node;
        }
    }

    private final void getHighSpeedVideoFpsRanges(com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node) {
        if (node.Camera2StreamConfigurationMap == null) {
            return;
        }
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node2 = node.Camera2StreamConfigurationMap;
        if (node2 != null) {
            node2.getHighResolutionOutputSizeshNQ4ISI = node.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (node.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighSpeedVideoFpsRangesFor = node.Camera2StreamConfigurationMap;
        } else {
            com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node3 = node.getHighResolutionOutputSizeshNQ4ISI;
            if (node3 != null) {
                node3.Camera2StreamConfigurationMap = node.Camera2StreamConfigurationMap;
            }
        }
        node.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
        node.Camera2StreamConfigurationMap = null;
        com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node4 = this.getHighSpeedVideoSizes;
        if (node4 != null) {
            node4.Camera2StreamConfigurationMap = node;
        }
        this.getHighSpeedVideoSizes = node;
    }

    private final void Camera2StreamConfigurationMap(com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node) {
        if (node.Camera2StreamConfigurationMap == null) {
            this.getHighSpeedVideoSizes = node.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node2 = node.Camera2StreamConfigurationMap;
            if (node2 != null) {
                node2.getHighResolutionOutputSizeshNQ4ISI = node.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        if (node.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighSpeedVideoFpsRangesFor = node.Camera2StreamConfigurationMap;
        } else {
            com.apollographql.apollo.cache.normalized.api.internal.LruCache.Node<Key, Value> node3 = node.getHighResolutionOutputSizeshNQ4ISI;
            if (node3 != null) {
                node3.Camera2StreamConfigurationMap = node.Camera2StreamConfigurationMap;
            }
        }
        int i = this.Camera2StreamConfigurationMap;
        kotlin.jvm.functions.Function2<Key, Value, java.lang.Integer> function2 = this.getHighSpeedVideoSizesFor;
        Key key = node.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(key);
        this.Camera2StreamConfigurationMap = i - function2.invoke(key, node.getHighSpeedVideoFpsRangesFor).intValue();
        node.getHighSpeedVideoSizes = null;
        node.getHighSpeedVideoFpsRangesFor = null;
        node.getHighResolutionOutputSizeshNQ4ISI = null;
        node.Camera2StreamConfigurationMap = null;
    }
}

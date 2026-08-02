package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0006\b&\u0018\u0000 /*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001/B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\tJ\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010-"}, d2 = {"Lkotlin/collections/AbstractMap;", "K", "V", "", "<init>", "()V", "key", "", "containsKey", "(Ljava/lang/Object;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "", com.paypal.oslo.feature.identity.accountswitch.domain.usecase.GenerateMerchantOnboardingUrlUseCase.PATH_ENTRY, "containsEntry$kotlin_stdlib", "(Ljava/util/Map$Entry;)Z", "", "other", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "", "getValues", "()Ljava/util/Collection;", "values", "Ljava/util/Collection;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class AbstractMap<K, V> implements java.util.Map<K, V>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.collections.AbstractMap.Companion INSTANCE = new kotlin.collections.AbstractMap.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile java.util.Collection<? extends V> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile java.util.Set<? extends K> getHighSpeedVideoFpsRangesFor;

    public abstract java.util.Set<java.util.Map.Entry<K, V>> getEntries();

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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(java.lang.Object key) {
        return Camera2StreamConfigurationMap(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object value) {
        java.util.Set<java.util.Map.Entry<K, V>> entrySet = entrySet();
        if ((entrySet instanceof java.util.Collection) && entrySet.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map.Entry) it.next()).getValue(), value)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsEntry$kotlin_stdlib(java.util.Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        java.lang.Object key = entry.getKey();
        java.lang.Object value = entry.getValue();
        kotlin.collections.AbstractMap<K, V> abstractMap = this;
        kotlin.jvm.internal.Intrinsics.checkNotNull(abstractMap, "");
        V v = abstractMap.get(key);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(value, v)) {
            return false;
        }
        if (v != null) {
            return true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(abstractMap, "");
        return abstractMap.containsKey(key);
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) other;
        if (size() != map.size()) {
            return false;
        }
        java.util.Set<java.util.Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof java.util.Collection) && entrySet.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (!containsEntry$kotlin_stdlib((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(java.lang.Object key) {
        java.util.Map.Entry<K, V> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(key);
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public int getSize() {
        return entrySet().size();
    }

    public java.util.Set<K> getKeys() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = new kotlin.collections.AbstractSet<K>(this) { // from class: kotlin.collections.AbstractMap$keys$1
                final /* synthetic */ kotlin.collections.AbstractMap<K, V> getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.getHighSpeedVideoFpsRangesFor = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(java.lang.Object element) {
                    return this.getHighSpeedVideoFpsRangesFor.containsKey(element);
                }

                @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final java.util.Iterator<K> iterator() {
                    return new kotlin.collections.AbstractMap$keys$1$iterator$1(this.getHighSpeedVideoFpsRangesFor.entrySet().iterator());
                }

                @Override // kotlin.collections.AbstractCollection
                /* renamed from: getSize */
                public final int getGetHighSpeedVideoFpsRangesFor() {
                    return this.getHighSpeedVideoFpsRangesFor.size();
                }
            };
        }
        java.util.Set<? extends K> set = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(set);
        return set;
    }

    public java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(entrySet(), ", ", "{", "}", 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.collections.AbstractMap$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.collections.AbstractMap.$r8$lambda$OmxMrod7RczKA15m1AWrs64BmJo(kotlin.collections.AbstractMap.this, (java.util.Map.Entry) obj);
            }
        }, 24, null);
    }

    public java.util.Collection<V> getValues() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new kotlin.collections.AbstractCollection<V>(this) { // from class: kotlin.collections.AbstractMap$values$1
                final /* synthetic */ kotlin.collections.AbstractMap<K, V> Camera2StreamConfigurationMap;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.Camera2StreamConfigurationMap = this;
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final boolean contains(java.lang.Object element) {
                    return this.Camera2StreamConfigurationMap.containsValue(element);
                }

                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
                public final java.util.Iterator<V> iterator() {
                    return new kotlin.collections.AbstractMap$values$1$iterator$1(this.Camera2StreamConfigurationMap.entrySet().iterator());
                }

                @Override // kotlin.collections.AbstractCollection
                /* renamed from: getSize */
                public final int getGetHighSpeedVideoFpsRangesFor() {
                    return this.Camera2StreamConfigurationMap.size();
                }
            };
        }
        java.util.Collection<? extends V> collection = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(collection);
        return collection;
    }

    private final java.util.Map.Entry<K, V> Camera2StreamConfigurationMap(K p0) {
        java.lang.Object obj;
        java.util.Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map.Entry) obj).getKey(), p0)) {
                break;
            }
        }
        return (java.util.Map.Entry) obj;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/collections/AbstractMap$Companion;", "", "<init>", "()V", "", "e", "", "entryHashCode$kotlin_stdlib", "(Ljava/util/Map$Entry;)I", "", "entryToString$kotlin_stdlib", "(Ljava/util/Map$Entry;)Ljava/lang/String;", "other", "", "entryEquals$kotlin_stdlib", "(Ljava/util/Map$Entry;Ljava/lang/Object;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int entryHashCode$kotlin_stdlib(java.util.Map.Entry<?, ?> e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            java.lang.Object key = e.getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            java.lang.Object value = e.getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        public final java.lang.String entryToString$kotlin_stdlib(java.util.Map.Entry<?, ?> e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.getKey());
            sb.append('=');
            sb.append(e.getValue());
            return sb.toString();
        }

        public final boolean entryEquals$kotlin_stdlib(java.util.Map.Entry<?, ?> e, java.lang.Object other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            if (!(other instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(e.getKey(), entry.getKey()) && kotlin.jvm.internal.Intrinsics.areEqual(e.getValue(), entry.getValue());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$OmxMrod7RczKA15m1AWrs64BmJo(kotlin.collections.AbstractMap abstractMap, java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object key = entry.getKey();
        sb.append(key == abstractMap ? "(this Map)" : java.lang.String.valueOf(key));
        sb.append('=');
        java.lang.Object value = entry.getValue();
        sb.append(value != abstractMap ? java.lang.String.valueOf(value) : "(this Map)");
        return sb.toString();
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    public V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

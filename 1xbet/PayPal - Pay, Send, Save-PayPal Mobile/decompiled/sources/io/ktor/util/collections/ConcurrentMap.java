package io.ktor.util.collections;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00162\u0014\u0010\u001c\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010\u000fJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R \u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\"R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001000/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000/8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0001068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108"}, d2 = {"Lio/ktor/util/collections/ConcurrentMap;", "Key", "Value", "", "", "initialCapacity", "<init>", "(I)V", "key", "Lkotlin/Function0;", "block", "computeIfAbsent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "containsKey", "(Ljava/lang/Object;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "clear", "()V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "()I", "", "other", "equals", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoSizes", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConcurrentMap<Key, Value> implements java.util.Map<Key, Value>, kotlin.jvm.internal.markers.KMutableMap {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<Key, Value> getHighSpeedVideoSizes;

    public ConcurrentMap(int i) {
        this.getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>(i);
    }

    public /* synthetic */ ConcurrentMap(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 32 : i);
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<Key, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final java.util.Set<Key> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<Value> values() {
        return getValues();
    }

    public final Value computeIfAbsent(Key key, final kotlin.jvm.functions.Function0<? extends Value> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        java.util.concurrent.ConcurrentHashMap<Key, Value> concurrentHashMap = this.getHighSpeedVideoSizes;
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.collections.ConcurrentMap$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function0.this.invoke();
                return invoke;
            }
        };
        return concurrentHashMap.computeIfAbsent(key, new java.util.function.Function() { // from class: io.ktor.util.collections.ConcurrentMap$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.lang.Object invoke;
                invoke = kotlin.jvm.functions.Function1.this.invoke(obj);
                return invoke;
            }
        });
    }

    public final int getSize() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object key) {
        return this.getHighSpeedVideoSizes.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object value) {
        return this.getHighSpeedVideoSizes.containsValue(value);
    }

    @Override // java.util.Map
    public final Value get(java.lang.Object key) {
        return this.getHighSpeedVideoSizes.get(key);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    public final java.util.Set<java.util.Map.Entry<Key, Value>> getEntries() {
        java.util.Set<java.util.Map.Entry<Key, Value>> entrySet = this.getHighSpeedVideoSizes.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "");
        return entrySet;
    }

    public final java.util.Set<Key> getKeys() {
        java.util.Set<Key> keySet = this.getHighSpeedVideoSizes.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
        return keySet;
    }

    public final java.util.Collection<Value> getValues() {
        java.util.Collection<Value> values = this.getHighSpeedVideoSizes.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        return values;
    }

    @Override // java.util.Map
    public final void clear() {
        this.getHighSpeedVideoSizes.clear();
    }

    @Override // java.util.Map
    public final Value put(Key key, Value value) {
        return this.getHighSpeedVideoSizes.put(key, value);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends Key, ? extends Value> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        this.getHighSpeedVideoSizes.putAll(from);
    }

    @Override // java.util.Map
    public final Value remove(java.lang.Object key) {
        return this.getHighSpeedVideoSizes.remove(key);
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object key, java.lang.Object value) {
        return this.getHighSpeedVideoSizes.remove(key, value);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object other) {
        if (other instanceof java.util.Map) {
            return kotlin.jvm.internal.Intrinsics.areEqual(other, this.getHighSpeedVideoSizes);
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConcurrentMapJvm by ");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }

    public ConcurrentMap() {
        this(0, 1, null);
    }
}

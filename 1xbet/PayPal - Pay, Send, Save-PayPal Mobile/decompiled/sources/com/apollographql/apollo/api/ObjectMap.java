package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\b&\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00130\u00128\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/apollographql/apollo/api/ObjectMap;", "", "", "", "__fields", "<init>", "(Ljava/util/Map;)V", "key", "", "containsKey", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "()Z", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ObjectMap implements java.util.Map<java.lang.String, java.lang.Object>, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    public ObjectMap(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.lang.Object> values() {
        return getValues();
    }

    @Override // java.util.Map
    public void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ boolean replace(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public java.lang.Object replace2(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object replace(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public java.lang.Object putIfAbsent2(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object putIfAbsent(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends java.lang.Object> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public java.lang.Object put2(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public java.lang.Object merge2(java.lang.String str, java.lang.Object obj, java.util.function.BiFunction<? super java.lang.Object, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object merge(java.lang.String str, java.lang.Object obj, java.util.function.BiFunction<? super java.lang.Object, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public java.util.Collection<java.lang.Object> getValues() {
        return this.getHighResolutionOutputSizeshNQ4ISI.values();
    }

    public int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    public java.util.Set<java.lang.String> getKeys() {
        return this.getHighResolutionOutputSizeshNQ4ISI.keySet();
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> getEntries() {
        return this.getHighResolutionOutputSizeshNQ4ISI.entrySet();
    }

    public java.lang.Object get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.get(key);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object value) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsValue(value);
    }

    public boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(key);
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public java.lang.Object computeIfPresent2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfPresent(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public java.lang.Object computeIfAbsent2(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends java.lang.Object> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object computeIfAbsent(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends java.lang.Object> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public java.lang.Object compute2(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object compute(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super java.lang.Object, ? extends java.lang.Object> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

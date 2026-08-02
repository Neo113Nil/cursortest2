package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B4\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u001a\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR&\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR%\u0010\u001c\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lkotlin/collections/MapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MapWithDefault;", "", "p0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p1", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "containsKey", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "()Ljava/util/Map;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class MapWithDefaultImpl<K, V> implements kotlin.collections.MapWithDefault<K, V> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<K, V> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<K, V> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public MapWithDefaultImpl(java.util.Map<K, ? extends V> map, kotlin.jvm.functions.Function1<? super K, ? extends V> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = map;
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // kotlin.collections.MapWithDefault
    public final java.util.Map<K, V> getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object p0) {
        return this.getHighSpeedVideoSizes.containsKey(p0);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object p0) {
        return this.getHighSpeedVideoSizes.containsValue(p0);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return this.getHighSpeedVideoSizes.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object p0) {
        return this.getHighSpeedVideoSizes.equals(p0);
    }

    @Override // java.util.Map
    public final V get(java.lang.Object p0) {
        return this.getHighSpeedVideoSizes.get(p0);
    }

    @Override // kotlin.collections.MapWithDefault
    public final V getHighResolutionOutputSizeshNQ4ISI(K p0) {
        java.util.Map<K, V> map = this.getHighSpeedVideoSizes;
        V v = map.get(p0);
        return (v != null || map.containsKey(p0)) ? v : this.getHighSpeedVideoFpsRanges.invoke(p0);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return this.getHighSpeedVideoSizes.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.getHighSpeedVideoSizes.size();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        return this.getHighSpeedVideoSizes.values();
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

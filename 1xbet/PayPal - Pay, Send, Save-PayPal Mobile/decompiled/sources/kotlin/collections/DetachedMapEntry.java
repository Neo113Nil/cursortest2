package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0012\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015"}, d2 = {"Lkotlin/collections/DetachedMapEntry;", "K", "V", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DetachedMapEntry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final K Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final V getHighResolutionOutputSizeshNQ4ISI;

    public DetachedMapEntry(K k, V v) {
        this.Camera2StreamConfigurationMap = k;
        this.getHighResolutionOutputSizeshNQ4ISI = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object p0) {
        return kotlin.collections.AbstractMap.INSTANCE.entryEquals$kotlin_stdlib(this, p0);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return kotlin.collections.AbstractMap.INSTANCE.entryHashCode$kotlin_stdlib(this);
    }

    public final java.lang.String toString() {
        return kotlin.collections.AbstractMap.INSTANCE.entryToString$kotlin_stdlib(this);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

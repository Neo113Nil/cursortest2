package arrow.core;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Larrow/core/Entry;", "K", "V", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "getValue", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class Entry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final V Camera2StreamConfigurationMap;
    private final K getHighSpeedVideoFpsRanges;

    public Entry(K k, V v) {
        this.getHighSpeedVideoFpsRanges = k;
        this.Camera2StreamConfigurationMap = v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), getKey()) && kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

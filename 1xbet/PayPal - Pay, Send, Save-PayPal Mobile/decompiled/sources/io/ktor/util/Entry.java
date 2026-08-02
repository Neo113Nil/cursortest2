package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\u00028\u00018\u0017@\u0017X\u0097\f¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017"}, d2 = {"Lio/ktor/util/Entry;", "Key", "Value", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getValue", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class Entry<Key, Value> implements java.util.Map.Entry<Key, Value>, kotlin.jvm.internal.markers.KMutableMap.Entry {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private Value getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final Key getHighResolutionOutputSizeshNQ4ISI;

    public Entry(Key key, Value value) {
        this.getHighResolutionOutputSizeshNQ4ISI = key;
        this.getHighSpeedVideoFpsRangesFor = value;
    }

    @Override // java.util.Map.Entry
    public final Key getKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.Map.Entry
    public final Value getValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Key key = getKey();
        kotlin.jvm.internal.Intrinsics.checkNotNull(key);
        int hashCode = key.hashCode();
        Value value = getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value);
        return hashCode + 527 + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object p0) {
        if (p0 == null || !(p0 instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), getKey()) && kotlin.jvm.internal.Intrinsics.areEqual(entry.getValue(), getValue());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public final Value setValue(Value p0) {
        this.getHighSpeedVideoFpsRangesFor = p0;
        return getValue();
    }
}

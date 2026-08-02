package androidx.arch.core.internal;

/* loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends androidx.arch.core.internal.SafeIterableMap<K, V> {
    private final java.util.HashMap<K, androidx.arch.core.internal.SafeIterableMap.Entry<K, V>> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap<>();

    @Override // androidx.arch.core.internal.SafeIterableMap
    protected androidx.arch.core.internal.SafeIterableMap.Entry<K, V> get(K k) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(k);
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V putIfAbsent(K k, V v) {
        androidx.arch.core.internal.SafeIterableMap.Entry<K, V> entry = get(k);
        if (entry != null) {
            return entry.getHighSpeedVideoFpsRangesFor;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(k, getHighSpeedVideoFpsRanges(k, v));
        return null;
    }

    @Override // androidx.arch.core.internal.SafeIterableMap
    public V remove(K k) {
        V v = (V) super.remove(k);
        this.getHighResolutionOutputSizeshNQ4ISI.remove(k);
        return v;
    }

    public boolean contains(K k) {
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(k);
    }

    public java.util.Map.Entry<K, V> ceil(K k) {
        if (contains(k)) {
            return this.getHighResolutionOutputSizeshNQ4ISI.get(k).getHighSpeedVideoSizes;
        }
        return null;
    }
}

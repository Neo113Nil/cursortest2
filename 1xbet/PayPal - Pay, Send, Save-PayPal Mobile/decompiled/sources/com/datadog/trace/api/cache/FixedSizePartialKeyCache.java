package com.datadog.trace.api.cache;

/* loaded from: classes3.dex */
final class FixedSizePartialKeyCache<K, V> implements com.datadog.trace.api.cache.DDPartialKeyCache<K, V> {
    private final com.datadog.trace.api.cache.FixedSizePartialKeyCache.HVElement<V>[] Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    FixedSizePartialKeyCache(int i) {
        int highSpeedVideoFpsRangesFor = com.datadog.trace.api.cache.FixedSizeCache.getHighSpeedVideoFpsRangesFor(i);
        this.Camera2StreamConfigurationMap = new com.datadog.trace.api.cache.FixedSizePartialKeyCache.HVElement[highSpeedVideoFpsRangesFor];
        this.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor - 1;
    }

    @Override // com.datadog.trace.api.cache.DDPartialKeyCache
    public final V computeIfAbsent(K k, int i, int i2, com.datadog.trace.api.cache.DDPartialKeyCache.Hasher<K> hasher, com.datadog.trace.api.cache.DDPartialKeyCache.Comparator<K, V> comparator, com.datadog.trace.api.cache.DDPartialKeyCache.Producer<K, ? extends V> producer) {
        if (k == null) {
            return null;
        }
        int apply = hasher.apply(k, i, i2);
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = 1;
        int i5 = apply;
        while (true) {
            int i6 = this.getHighSpeedVideoFpsRangesFor & i5;
            com.datadog.trace.api.cache.FixedSizePartialKeyCache.HVElement<V> hVElement = this.Camera2StreamConfigurationMap[i6];
            if (hVElement != null) {
                if (apply == hVElement.getHighSpeedVideoFpsRanges && comparator.test(k, i, i2, hVElement.getHighSpeedVideoFpsRangesFor)) {
                    return hVElement.getHighSpeedVideoFpsRangesFor;
                }
                if (i4 != 3) {
                    i5 = com.datadog.trace.api.cache.FixedSizeCache.getHighSpeedVideoFpsRanges(i5);
                    i4++;
                } else {
                    V apply2 = producer.apply(k, apply, i, i2);
                    this.Camera2StreamConfigurationMap[apply & i3] = new com.datadog.trace.api.cache.FixedSizePartialKeyCache.HVElement<>(apply, apply2);
                    return apply2;
                }
            } else {
                V apply3 = producer.apply(k, apply, i, i2);
                this.Camera2StreamConfigurationMap[i6] = new com.datadog.trace.api.cache.FixedSizePartialKeyCache.HVElement<>(apply, apply3);
                return apply3;
            }
        }
    }

    @Override // com.datadog.trace.api.cache.DDPartialKeyCache
    public final void clear() {
        java.util.Arrays.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null);
    }

    static final class HVElement<U> {
        final int getHighSpeedVideoFpsRanges;
        final U getHighSpeedVideoFpsRangesFor;

        HVElement(int i, U u) {
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = u;
        }
    }
}

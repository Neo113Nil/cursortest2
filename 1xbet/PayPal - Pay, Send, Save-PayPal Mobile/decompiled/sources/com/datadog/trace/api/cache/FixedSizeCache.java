package com.datadog.trace.api.cache;

/* loaded from: classes3.dex */
abstract class FixedSizeCache<K, V> implements com.datadog.trace.api.cache.DDCache<K, V> {
    private final int Camera2StreamConfigurationMap;
    private final com.datadog.trace.api.Pair<K, V>[] getHighSpeedVideoFpsRangesFor;

    abstract boolean getHighResolutionOutputSizeshNQ4ISI(K k, com.datadog.trace.api.Pair<K, V> pair);

    abstract int getHighSpeedVideoFpsRangesFor(K k);

    FixedSizeCache(int i) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i);
        this.getHighSpeedVideoFpsRangesFor = new com.datadog.trace.api.Pair[highSpeedVideoFpsRangesFor];
        this.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor - 1;
    }

    static int getHighSpeedVideoFpsRangesFor(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Cache capacity must be > 0");
        }
        if (i > 1073741824) {
            i = 1073741824;
        }
        int numberOfLeadingZeros = (-1) >>> java.lang.Integer.numberOfLeadingZeros(i - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return numberOfLeadingZeros + 1;
    }

    @Override // com.datadog.trace.api.cache.DDCache
    public final V computeIfAbsent(K k, com.datadog.android.trace.internal.compat.function.Function<K, ? extends V> function) {
        if (k == null) {
            return null;
        }
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((com.datadog.trace.api.cache.FixedSizeCache<K, V>) k);
        int i = this.Camera2StreamConfigurationMap;
        int i2 = 1;
        int i3 = highSpeedVideoFpsRangesFor;
        while (true) {
            int i4 = this.Camera2StreamConfigurationMap & i3;
            com.datadog.trace.api.Pair<K, V> pair = this.getHighSpeedVideoFpsRangesFor[i4];
            if (pair != null) {
                if (getHighResolutionOutputSizeshNQ4ISI(k, pair)) {
                    return pair.getRight();
                }
                if (i2 == 3) {
                    V apply = function.apply(k);
                    this.getHighSpeedVideoFpsRangesFor[highSpeedVideoFpsRangesFor & i] = com.datadog.trace.api.Pair.of(k, apply);
                    return apply;
                }
                i3 = java.lang.Integer.reverseBytes(i3 * (-1640532531)) * (-1640532531);
                i2++;
            } else {
                V apply2 = function.apply(k);
                this.getHighSpeedVideoFpsRangesFor[i4] = com.datadog.trace.api.Pair.of(k, apply2);
                return apply2;
            }
        }
    }

    @Override // com.datadog.trace.api.cache.DDCache
    public void clear() {
        java.util.Arrays.fill(this.getHighSpeedVideoFpsRangesFor, (java.lang.Object) null);
    }

    @Override // com.datadog.trace.api.cache.DDCache
    public void visit(com.datadog.android.trace.internal.compat.function.BiConsumer<K, V> biConsumer) {
        for (com.datadog.trace.api.Pair<K, V> pair : this.getHighSpeedVideoFpsRangesFor) {
            if (pair != null) {
                biConsumer.accept(pair.getLeft(), pair.getRight());
            }
        }
    }

    static int getHighSpeedVideoFpsRanges(int i) {
        return java.lang.Integer.reverseBytes(i * (-1640532531)) * (-1640532531);
    }

    static final class ObjectHash<K, V> extends com.datadog.trace.api.cache.FixedSizeCache<K, V> {
        ObjectHash(int i) {
            super(i);
        }

        @Override // com.datadog.trace.api.cache.FixedSizeCache
        final int getHighSpeedVideoFpsRangesFor(K k) {
            return k.hashCode();
        }

        @Override // com.datadog.trace.api.cache.FixedSizeCache
        final boolean getHighResolutionOutputSizeshNQ4ISI(K k, com.datadog.trace.api.Pair<K, V> pair) {
            return k.equals(pair.getLeft());
        }
    }

    /* loaded from: classes8.dex */
    static final class IdentityHash<K, V> extends com.datadog.trace.api.cache.FixedSizeCache<K, V> {
        @Override // com.datadog.trace.api.cache.FixedSizeCache
        final int getHighSpeedVideoFpsRangesFor(K k) {
            int identityHashCode = java.lang.System.identityHashCode(k);
            return identityHashCode - (identityHashCode << 7);
        }

        @Override // com.datadog.trace.api.cache.FixedSizeCache
        final boolean getHighResolutionOutputSizeshNQ4ISI(K k, com.datadog.trace.api.Pair<K, V> pair) {
            return k == pair.getLeft();
        }
    }

    /* loaded from: classes8.dex */
    static final class ArrayHash<K, V> extends com.datadog.trace.api.cache.FixedSizeCache<K[], V> {
        @Override // com.datadog.trace.api.cache.FixedSizeCache
        final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, com.datadog.trace.api.Pair pair) {
            return java.util.Arrays.equals((java.lang.Object[]) obj, (java.lang.Object[]) pair.getLeft());
        }

        @Override // com.datadog.trace.api.cache.FixedSizeCache
        final /* synthetic */ int getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            return java.util.Arrays.hashCode((java.lang.Object[]) obj);
        }
    }
}

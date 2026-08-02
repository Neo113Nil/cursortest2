package com.datadog.trace.api.cache;

/* loaded from: classes8.dex */
public final class RadixTreeCache<T> {
    public static final com.datadog.trace.api.cache.RadixTreeCache<com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString> HTTP_STATUSES;
    public static final com.datadog.trace.api.cache.RadixTreeCache<java.lang.Integer> PORTS;
    public static final int UNSET_PORT = 0;
    public static final int UNSET_STATUS = 0;
    private static final com.datadog.android.trace.internal.compat.function.IntFunction<com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString> getHighSpeedVideoFpsRanges;
    private final com.datadog.android.trace.internal.compat.function.IntFunction<T> Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final int getInputFormats;
    private final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object[]> getInputSizeshNQ4ISI;

    static {
        com.datadog.android.trace.internal.compat.function.IntFunction<com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString> intFunction = new com.datadog.android.trace.internal.compat.function.IntFunction() { // from class: com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticLambda1
            @Override // com.datadog.android.trace.internal.compat.function.IntFunction
            public final java.lang.Object apply(int i) {
                com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString create;
                create = com.datadog.trace.bootstrap.instrumentation.api.UTF8BytesString.create(java.lang.Integer.toString(i));
                return create;
            }
        };
        getHighSpeedVideoFpsRanges = intFunction;
        HTTP_STATUSES = new com.datadog.trace.api.cache.RadixTreeCache<>(16, 32, intFunction, 200, 201, 301, 307, 400, 401, 403, 404, 500, 502, 503);
        PORTS = new com.datadog.trace.api.cache.RadixTreeCache<>(256, 256, new com.datadog.android.trace.internal.compat.function.IntFunction() { // from class: com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticLambda2
            @Override // com.datadog.android.trace.internal.compat.function.IntFunction
            public final java.lang.Object apply(int i) {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(i);
                return valueOf;
            }
        }, 80, 443, com.datadog.trace.api.config.ProfilingConfig.PROFILING_PROXY_PORT_DEFAULT);
    }

    public RadixTreeCache(int i, int i2, com.datadog.android.trace.internal.compat.function.IntFunction<T> intFunction, int... iArr) {
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
        this.Camera2StreamConfigurationMap = intFunction;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        int i3 = i2 - 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.getInputFormats = java.lang.Integer.bitCount(i3);
        for (int i4 : iArr) {
            get(i4);
        }
    }

    public final T get(int i) {
        int i2 = i >>> this.getInputFormats;
        if (i2 >= this.getHighSpeedVideoSizes) {
            return this.Camera2StreamConfigurationMap.apply(i);
        }
        java.lang.Object[] objArr = this.getInputSizeshNQ4ISI.get(i2);
        if (objArr == null) {
            objArr = new java.lang.Object[this.getHighSpeedVideoFpsRangesFor];
            if (!com.datadog.trace.api.cache.RadixTreeCache$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, i2, null, objArr)) {
                objArr = this.getInputSizeshNQ4ISI.get(i2);
            }
        }
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI & i;
        T t = (T) objArr[i3];
        if (t != null) {
            return t;
        }
        T apply = this.Camera2StreamConfigurationMap.apply(i);
        objArr[i3] = apply;
        return apply;
    }
}

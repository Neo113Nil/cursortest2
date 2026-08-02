package com.datadog.trace.api;

/* loaded from: classes3.dex */
public class ConfigCollector {
    private volatile java.util.Map<java.lang.String, com.datadog.trace.api.ConfigSetting> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap();
    private static final com.datadog.trace.api.ConfigCollector getHighSpeedVideoFpsRangesFor = new com.datadog.trace.api.ConfigCollector();
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.datadog.trace.api.ConfigCollector, java.util.Map> Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.datadog.trace.api.ConfigCollector.class, java.util.Map.class, "getHighSpeedVideoSizes");

    public static com.datadog.trace.api.ConfigCollector get() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public void put(java.lang.String str, java.lang.Object obj, com.datadog.trace.api.ConfigOrigin configOrigin) {
        this.getHighSpeedVideoSizes.put(str, new com.datadog.trace.api.ConfigSetting(str, obj, configOrigin));
    }

    public void putAll(java.util.Map<java.lang.String, java.lang.Object> map, com.datadog.trace.api.ConfigOrigin configOrigin) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(map.size() + this.getHighSpeedVideoSizes.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            concurrentHashMap.put(entry.getKey(), new com.datadog.trace.api.ConfigSetting(entry.getKey(), entry.getValue(), configOrigin));
        }
        while (true) {
            java.util.Map<java.lang.String, com.datadog.trace.api.ConfigSetting> map2 = this.getHighSpeedVideoSizes;
            for (java.util.Map.Entry<java.lang.String, com.datadog.trace.api.ConfigSetting> entry2 : map2.entrySet()) {
                if (!map.containsKey(entry2.getKey())) {
                    concurrentHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, map2, concurrentHashMap)) {
                return;
            } else {
                concurrentHashMap.keySet().retainAll(map.keySet());
            }
        }
    }
}

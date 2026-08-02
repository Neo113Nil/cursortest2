package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"", "", "", "timingsPayload", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "extractResourceTiming", "(Ljava/util/Map;)Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExternalResourceTimingsKt {
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"firstByte", "download", "ssl", "connect", "dns"});

    public static final com.datadog.android.rum.internal.domain.event.ResourceTiming extractResourceTiming(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        com.datadog.android.rum.internal.domain.scope.Timing timing;
        if (map == null) {
            return null;
        }
        java.util.List<java.lang.String> list = getHighSpeedVideoFpsRanges;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (java.lang.Object obj : list) {
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            java.lang.Object obj2 = map.get((java.lang.String) obj);
            if (obj2 != null && (obj2 instanceof java.util.Map)) {
                java.util.Map map2 = (java.util.Map) obj2;
                java.lang.Object obj3 = map2.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME);
                java.lang.Number number = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
                java.lang.Long valueOf = number != null ? java.lang.Long.valueOf(number.longValue()) : null;
                java.lang.Object obj4 = map2.get("duration");
                java.lang.Number number2 = obj4 instanceof java.lang.Number ? (java.lang.Number) obj4 : null;
                java.lang.Long valueOf2 = number2 != null ? java.lang.Long.valueOf(number2.longValue()) : null;
                if (valueOf != null && valueOf2 != null) {
                    timing = new com.datadog.android.rum.internal.domain.scope.Timing(valueOf.longValue(), valueOf2.longValue());
                    linkedHashMap2.put(obj, timing);
                }
            }
            timing = null;
            linkedHashMap2.put(obj, timing);
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            if (((com.datadog.android.rum.internal.domain.scope.Timing) entry.getValue()) != null) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap4 = linkedHashMap3;
        if (linkedHashMap4.isEmpty()) {
            return null;
        }
        com.datadog.android.rum.internal.domain.scope.Timing timing2 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("firstByte");
        long j = timing2 != null ? timing2.Camera2StreamConfigurationMap : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing3 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("firstByte");
        long j2 = timing3 != null ? timing3.getHighResolutionOutputSizeshNQ4ISI : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing4 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("download");
        long j3 = timing4 != null ? timing4.Camera2StreamConfigurationMap : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing5 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("download");
        long j4 = timing5 != null ? timing5.getHighResolutionOutputSizeshNQ4ISI : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing6 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("dns");
        long j5 = timing6 != null ? timing6.Camera2StreamConfigurationMap : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing7 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("dns");
        long j6 = timing7 != null ? timing7.getHighResolutionOutputSizeshNQ4ISI : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing8 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("connect");
        long j7 = timing8 != null ? timing8.Camera2StreamConfigurationMap : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing9 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("connect");
        long j8 = timing9 != null ? timing9.getHighResolutionOutputSizeshNQ4ISI : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing10 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("ssl");
        long j9 = timing10 != null ? timing10.Camera2StreamConfigurationMap : 0L;
        com.datadog.android.rum.internal.domain.scope.Timing timing11 = (com.datadog.android.rum.internal.domain.scope.Timing) linkedHashMap4.get("ssl");
        return new com.datadog.android.rum.internal.domain.event.ResourceTiming(j5, j6, j7, j8, j9, timing11 != null ? timing11.getHighResolutionOutputSizeshNQ4ISI : 0L, j, j2, j3, j4);
    }
}

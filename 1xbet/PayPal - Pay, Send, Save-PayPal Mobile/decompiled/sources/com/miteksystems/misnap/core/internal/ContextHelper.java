package com.miteksystems.misnap.core.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/miteksystems/misnap/core/internal/ContextHelper;", "", "<init>", "()V", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/String;Ljava/lang/Object;)V", "", "get", "()Ljava/util/Map;", "reset", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ContextHelper {
    public static final com.miteksystems.misnap.core.internal.ContextHelper INSTANCE = new com.miteksystems.misnap.core.internal.ContextHelper();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

    public final void reset() {
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            Camera2StreamConfigurationMap.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final java.util.Map<java.lang.String, java.lang.Object> get() {
        java.util.Map<java.lang.String, java.lang.Object> map;
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            map = kotlin.collections.MapsKt.toMap(Camera2StreamConfigurationMap);
        }
        return map;
    }

    public final void add(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        synchronized (getHighResolutionOutputSizeshNQ4ISI) {
            Camera2StreamConfigurationMap.put(key, value);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private ContextHelper() {
    }
}

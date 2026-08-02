package com.datadog.android.rum.internal.monitor;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H&¢\u0006\u0004\b\u001e\u0010\u001fJ[\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H&¢\u0006\u0004\b%\u0010&JQ\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010(\u001a\u00020'2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H&¢\u0006\u0004\b%\u0010)J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010+"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/AdvancedNetworkRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "", "key", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "timing", "", "addResourceTiming", "(Ljava/lang/Object;Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;)V", "notifyInterceptorInstantiated", "()V", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;", "type", "reportNetworkingLibraryType", "(Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage$NetworkInstrumentation$LibraryType;)V", "Lcom/datadog/android/rum/resource/ResourceId;", "Lcom/datadog/android/rum/RumResourceMethod;", "method", "", "url", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "startResource", "(Lcom/datadog/android/rum/resource/ResourceId;Lcom/datadog/android/rum/RumResourceMethod;Ljava/lang/String;Ljava/util/Map;)V", "", "statusCode", "", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/datadog/android/rum/RumResourceKind;", "kind", "stopResource", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/Long;Lcom/datadog/android/rum/RumResourceKind;Ljava/util/Map;)V", "message", "Lcom/datadog/android/rum/RumErrorSource;", "source", "stackTrace", "errorType", "stopResourceWithError", "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "(Lcom/datadog/android/rum/resource/ResourceId;Ljava/lang/Integer;Ljava/lang/String;Lcom/datadog/android/rum/RumErrorSource;Ljava/lang/Throwable;Ljava/util/Map;)V", "waitForResourceTiming", "(Ljava/lang/Object;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AdvancedNetworkRumMonitor extends com.datadog.android.rum.RumMonitor {
    void addResourceTiming(java.lang.Object key, com.datadog.android.rum.internal.domain.event.ResourceTiming timing);

    void notifyInterceptorInstantiated();

    void reportNetworkingLibraryType(com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage.NetworkInstrumentation.LibraryType type);

    void startResource(com.datadog.android.rum.resource.ResourceId key, com.datadog.android.rum.RumResourceMethod method, java.lang.String url, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopResource(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.Long size, com.datadog.android.rum.RumResourceKind kind, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopResourceWithError(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.String stackTrace, java.lang.String errorType, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void stopResourceWithError(com.datadog.android.rum.resource.ResourceId key, java.lang.Integer statusCode, java.lang.String message, com.datadog.android.rum.RumErrorSource source, java.lang.Throwable throwable, java.util.Map<java.lang.String, ? extends java.lang.Object> attributes);

    void waitForResourceTiming(java.lang.Object key);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startResource$default(com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor advancedNetworkRumMonitor, com.datadog.android.rum.resource.ResourceId resourceId, com.datadog.android.rum.RumResourceMethod rumResourceMethod, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startResource");
            }
            if ((i & 8) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            advancedNetworkRumMonitor.startResource(resourceId, rumResourceMethod, str, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
        }

        public static /* synthetic */ void stopResource$default(com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor advancedNetworkRumMonitor, com.datadog.android.rum.resource.ResourceId resourceId, java.lang.Integer num, java.lang.Long l, com.datadog.android.rum.RumResourceKind rumResourceKind, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopResource");
            }
            if ((i & 16) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            advancedNetworkRumMonitor.stopResource(resourceId, num, l, rumResourceKind, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
        }

        public static /* synthetic */ void stopResourceWithError$default(com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor advancedNetworkRumMonitor, com.datadog.android.rum.resource.ResourceId resourceId, java.lang.Integer num, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.Throwable th, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopResourceWithError");
            }
            if ((i & 32) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            advancedNetworkRumMonitor.stopResourceWithError(resourceId, num, str, rumErrorSource, th, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
        }

        public static /* synthetic */ void stopResourceWithError$default(com.datadog.android.rum.internal.monitor.AdvancedNetworkRumMonitor advancedNetworkRumMonitor, com.datadog.android.rum.resource.ResourceId resourceId, java.lang.Integer num, java.lang.String str, com.datadog.android.rum.RumErrorSource rumErrorSource, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopResourceWithError");
            }
            advancedNetworkRumMonitor.stopResourceWithError(resourceId, num, str, rumErrorSource, str2, str3, (java.util.Map<java.lang.String, ? extends java.lang.Object>) ((i & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : map));
        }
    }
}

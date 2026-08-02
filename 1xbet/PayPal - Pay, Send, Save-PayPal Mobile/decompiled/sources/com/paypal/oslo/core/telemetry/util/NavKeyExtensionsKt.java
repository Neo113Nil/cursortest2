package com.paypal.oslo.core.telemetry.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0007\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n"}, d2 = {"Landroidx/navigation3/runtime/NavKey;", "", "extractScreenName", "(Landroidx/navigation3/runtime/NavKey;)Ljava/lang/String;", "extractSimpleName", "extractModuleName", "qualifiedName", "(Ljava/lang/String;)Ljava/lang/String;", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NavKeyExtensionsKt {
    private static final java.util.List<java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"com", "paypal", com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.TYPE_OSLO, com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE});
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"com", "paypal", com.paypal.oslo.feature.pushnotification.delivery.data.adapter.CommsPushNotificationClickHandler.TYPE_OSLO});

    public static final java.lang.String extractScreenName(androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        if (!(navKey instanceof com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider)) {
            return "unknown";
        }
        return ((com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider) navKey).toAnalyticsScreenDescriptor().getId();
    }

    public static final java.lang.String extractSimpleName(androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        java.lang.String simpleName = navKey.getClass().getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }

    public static final java.lang.String extractModuleName(androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        return extractModuleName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(navKey.getClass()).getGetHighResolutionOutputSizeshNQ4ISI());
    }

    public static final java.lang.String extractModuleName(java.lang.String str) {
        int i;
        java.util.List split$default = str != null ? kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null) : null;
        if (split$default == null) {
            split$default = kotlin.collections.CollectionsKt.emptyList();
        }
        if (split$default.size() >= 4) {
            java.util.List list = split$default;
            java.util.List<java.lang.String> list2 = getHighSpeedVideoFpsRangesFor;
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.take(list, list2.size()), list2)) {
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"feature", "core"});
                java.util.Iterator it = split$default.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (listOf.contains((java.lang.String) it.next())) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1 && (i = i2 + 1) < split$default.size()) {
                    java.lang.String str2 = (java.lang.String) split$default.get(i);
                    java.lang.Object obj = split$default.get(i2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(obj);
                    sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                    sb.append(str2);
                    return sb.toString();
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.take(list, 4), Camera2StreamConfigurationMap)) {
                    return com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE;
                }
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Could not extract module name from NavKey", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("nav_key", str)), null, null, 12, null);
                return null;
            }
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "Could not extract module name from NavKey", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("nav_key", str)), null, 4, null);
        return null;
    }
}

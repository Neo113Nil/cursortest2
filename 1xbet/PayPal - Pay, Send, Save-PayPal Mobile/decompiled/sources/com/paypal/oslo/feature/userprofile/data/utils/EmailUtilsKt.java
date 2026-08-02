package com.paypal.oslo.feature.userprofile.data.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timestamp", "Ljava/util/Date;", "parseTimestamp", "(Ljava/lang/Object;)Ljava/util/Date;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmailUtilsKt {
    public static final java.util.Date parseTimestamp(java.lang.Object obj) {
        java.lang.Long l = null;
        if (obj == null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Null timestamp - using current time as fallback", null, null, 6, null);
        } else {
            if (obj instanceof java.util.Date) {
                return (java.util.Date) obj;
            }
            if (obj instanceof java.lang.Number) {
                l = java.lang.Long.valueOf(((java.lang.Number) obj).longValue());
            } else if (obj instanceof java.lang.String) {
                l = kotlin.text.StringsKt.toLongOrNull((java.lang.String) obj);
            } else {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "unknown";
                }
                pairArr[0] = kotlin.TuplesKt.to("type", simpleName);
                pairArr[1] = kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, obj.toString());
                com.paypal.android.logger.Logger.w$default(logger, "Unexpected timestamp type - using current time as fallback", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            }
        }
        return l != null ? new java.util.Date(l.longValue() * 1000) : new java.util.Date();
    }
}

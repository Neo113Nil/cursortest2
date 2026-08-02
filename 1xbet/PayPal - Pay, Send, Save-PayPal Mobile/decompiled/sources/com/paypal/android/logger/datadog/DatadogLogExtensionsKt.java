package com.paypal.android.logger.datadog;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/android/logger/Log;", "", "", "firstLevelAttributes", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "scopeNonFirstLevelAttributes", "(Lcom/paypal/android/logger/Log;Ljava/util/Set;Ljava/lang/String;)V", "scopeNonFirstLevelAttributesWithLoggerName", "(Lcom/paypal/android/logger/Log;Ljava/util/Set;)V"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DatadogLogExtensionsKt {
    public static final void scopeNonFirstLevelAttributes(com.paypal.android.logger.Log log, java.util.Set<java.lang.String> set, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Set<java.lang.String> keySet = log.getAttributes().keySet();
        if ((keySet instanceof java.util.Collection) && keySet.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            if (!set.contains((java.lang.String) it.next())) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                log.getAttributes().put(str, linkedHashMap);
                java.util.Set<java.lang.String> keySet2 = log.getAttributes().keySet();
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : keySet2) {
                    java.lang.String str2 = (java.lang.String) obj;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str, str2) && !set.contains(str2)) {
                        arrayList.add(obj);
                    }
                }
                for (java.lang.String str3 : arrayList) {
                    linkedHashMap.put(str3, log.getAttributes().get(str3));
                    log.getAttributes().remove(str3);
                }
                return;
            }
        }
    }

    public static final void scopeNonFirstLevelAttributesWithLoggerName(com.paypal.android.logger.Log log, java.util.Set<java.lang.String> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.lang.Object obj = log.getAttributes().get("logger");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str != null) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (lowerCase != null) {
                scopeNonFirstLevelAttributes(log, set, lowerCase);
            }
        }
    }
}

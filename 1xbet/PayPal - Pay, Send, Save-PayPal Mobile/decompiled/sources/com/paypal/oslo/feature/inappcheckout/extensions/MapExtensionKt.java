package com.paypal.oslo.feature.inappcheckout.extensions;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aQ\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f\"&\u0010\u000f\u001a\u00020\u0007*\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Key", "Value", "", "", "toRemove", "removeAll", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/QueryKey;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "putIfNotBlank", "(Ljava/util/Map;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/QueryKey;Ljava/lang/String;)Ljava/util/Map;", "getEncodedQuery", "(Ljava/util/Map;)Ljava/lang/String;", "encodedQuery"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapExtensionKt {
    public static final java.lang.String getEncodedQuery(java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        if (map.entrySet().isEmpty()) {
            return "";
        }
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = map.entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : entrySet) {
            if (((java.util.Map.Entry) obj).getValue() != null) {
                arrayList.add(obj);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.inappcheckout.extensions.MapExtensionKt.$r8$lambda$C484_LmAqzr_5GhYpusLC0fvscs((java.util.Map.Entry) obj2);
            }
        }, 30, null);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> putIfNotBlank(java.util.Map<java.lang.String, java.lang.String> map, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryKey, "");
        java.lang.String str2 = str;
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            map.put(queryKey.getValue(), str);
        }
        return map;
    }

    public static final <Key, Value> java.util.Map<Key, Value> removeAll(java.util.Map<Key, Value> map, java.util.Map<Key, ? extends Value> map2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        java.util.Iterator<java.util.Map.Entry<Key, ? extends Value>> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            map.remove(it.next().getKey());
        }
        return map;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$C484_LmAqzr_5GhYpusLC0fvscs(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.String encode = android.net.Uri.encode((java.lang.String) entry.getKey());
        java.lang.String encode2 = android.net.Uri.encode((java.lang.String) entry.getValue());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(encode);
        sb.append("=");
        sb.append(encode2);
        return sb.toString();
    }
}

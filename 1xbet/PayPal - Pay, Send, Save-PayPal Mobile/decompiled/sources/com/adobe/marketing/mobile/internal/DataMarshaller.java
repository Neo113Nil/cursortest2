package com.adobe.marketing.mobile.internal;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0017j\b\u0012\u0004\u0012\u00020\u0007`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/internal/DataMarshaller;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "", "marshal", "(Landroid/app/Activity;)Ljava/util/Map;", "Landroid/content/Intent;", "intent", "", "marshalledData", "", "marshalIntentExtras$core_phoneRelease", "(Landroid/content/Intent;Ljava/util/Map;)V", "Landroid/net/Uri;", "getHighSpeedVideoFpsRanges", "(Landroid/net/Uri;)Landroid/net/Uri;", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "Ljava/util/ArrayList;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class DataMarshaller {
    public static final com.adobe.marketing.mobile.internal.DataMarshaller INSTANCE = new com.adobe.marketing.mobile.internal.DataMarshaller();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("adb_m_id", "pushmessageid"), kotlin.TuplesKt.to("NOTIFICATION_IDENTIFIER", "notificationid"));

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.ArrayList<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.arrayListOf("a.deeplink.id", "at_preview_token", "at_preview_endpoint");

    private DataMarshaller() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, java.lang.Object> marshal(android.app.Activity activity) {
        android.content.Intent intent;
        java.util.Set<java.lang.String> queryParameterNames;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        INSTANCE.marshalIntentExtras$core_phoneRelease(intent, linkedHashMap);
        android.net.Uri data = intent.getData();
        if (data != null) {
            java.lang.String obj = data.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            if (obj.length() != 0) {
                com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "DataMarshaller", "Receiving the Activity Uri ".concat(java.lang.String.valueOf(data)), new java.lang.Object[0]);
                java.lang.String obj2 = data.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                linkedHashMap.put("deeplink", obj2);
                if (data.isHierarchical() && (queryParameterNames = data.getQueryParameterNames()) != null) {
                    java.util.ArrayList<java.lang.String> arrayList = getHighResolutionOutputSizeshNQ4ISI;
                    if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                        java.util.Iterator<T> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (queryParameterNames.contains((java.lang.String) it.next())) {
                                intent.setData(getHighSpeedVideoFpsRanges(data));
                                break;
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public final void marshalIntentExtras$core_phoneRelease(android.content.Intent intent, java.util.Map<java.lang.String, java.lang.Object> marshalledData) {
        java.lang.Object obj;
        java.lang.String obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(marshalledData, "");
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : getHighSpeedVideoFpsRangesFor.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                try {
                    java.lang.String string = extras.getString(key);
                    if (string != null) {
                        if (string.length() <= 0) {
                            string = null;
                        }
                        if (string != null) {
                            marshalledData.put(value, string);
                        }
                    }
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to retrieve data (key = ");
                    sb.append(key);
                    sb.append(") from Activity, error is: ");
                    sb.append(e.getMessage());
                    com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "DataMarshaller", sb.toString(), new java.lang.Object[0]);
                }
                try {
                    extras.remove(key);
                } catch (java.lang.Exception e2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to remove known key (");
                    sb2.append(key);
                    sb2.append(") from bundle, error is: ");
                    sb2.append(e2.getMessage());
                    com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "DataMarshaller", sb2.toString(), new java.lang.Object[0]);
                }
            }
            try {
                java.util.Set<java.lang.String> keySet = extras.keySet();
                if (keySet != null) {
                    for (java.lang.String str : keySet) {
                        try {
                            if (!getHighSpeedVideoFpsRangesFor.containsKey(str) && (obj = extras.get(str)) != null && (obj2 = obj.toString()) != null && obj2.length() > 0) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                                marshalledData.put(str, obj);
                            }
                        } catch (java.lang.Exception e3) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            sb3.append("Failed to retrieve data (key = ");
                            sb3.append(str);
                            sb3.append(") from Activity, error is: ");
                            sb3.append(e3.getMessage());
                            com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "DataMarshaller", sb3.toString(), new java.lang.Object[0]);
                        }
                    }
                }
            } catch (java.lang.Exception e4) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Failed to retrieve data from Activity, error is: ");
                sb4.append(e4.getMessage());
                com.adobe.marketing.mobile.services.Log.error(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "DataMarshaller", sb4.toString(), new java.lang.Object[0]);
            }
        }
    }

    private static android.net.Uri getHighSpeedVideoFpsRanges(android.net.Uri uri) {
        java.util.List<java.lang.String> queryParameters;
        if (uri.isHierarchical()) {
            try {
                java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                    android.net.Uri.Builder buildUpon = uri.buildUpon();
                    buildUpon.clearQuery();
                    for (java.lang.String str : queryParameterNames) {
                        if (!getHighResolutionOutputSizeshNQ4ISI.contains(str) && (queryParameters = uri.getQueryParameters(str)) != null) {
                            java.util.Iterator<T> it = queryParameters.iterator();
                            while (it.hasNext()) {
                                buildUpon.appendQueryParameter(str, (java.lang.String) it.next());
                            }
                        }
                    }
                    android.net.Uri build = buildUpon.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
                    return build;
                }
            } catch (java.lang.UnsupportedOperationException unused) {
            }
        }
        return uri;
    }
}

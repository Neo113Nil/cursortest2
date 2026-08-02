package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
final class ImplementationDetails {
    ImplementationDetails() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0018, code lost:
    
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(r3) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.lang.String optString;
        java.lang.String str = null;
        if (com.adobe.marketing.mobile.util.MapUtils.isNullOrEmpty(map)) {
            return null;
        }
        java.lang.String str2 = "unknown";
        if (map != null) {
            optString = com.adobe.marketing.mobile.util.DataReader.optString(map, "version", null);
        }
        optString = "unknown";
        if (map != null) {
            if (!map.containsKey(com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.WRAPPER)) {
                str = com.adobe.marketing.mobile.WrapperType.NONE.getWrapperTag();
            } else {
                str = com.adobe.marketing.mobile.util.DataReader.optString(com.adobe.marketing.mobile.util.DataReader.optTypedMap(java.lang.Object.class, map, com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.WRAPPER, null), "type", null);
            }
        }
        if (com.adobe.marketing.mobile.WrapperType.NONE.getWrapperTag().equals(str)) {
            str2 = "";
        } else {
            com.adobe.marketing.mobile.WrapperType fromString = com.adobe.marketing.mobile.WrapperType.fromString(str);
            if (fromString == com.adobe.marketing.mobile.WrapperType.CORDOVA) {
                str2 = "cordova";
            } else if (fromString == com.adobe.marketing.mobile.WrapperType.FLUTTER) {
                str2 = "flutter";
            } else if (fromString == com.adobe.marketing.mobile.WrapperType.REACT_NATIVE) {
                str2 = "reactnative";
            } else if (fromString == com.adobe.marketing.mobile.WrapperType.UNITY) {
                str2 = "unity";
            } else if (fromString == com.adobe.marketing.mobile.WrapperType.XAMARIN) {
                str2 = "xamarin";
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("environment", com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(optString);
        sb.append("+3.0.2");
        hashMap.put("version", sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https://ns.adobe.com/experience/mobilesdk/android");
        sb2.append(com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2) ? "" : androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR.concat(str2));
        hashMap.put("name", sb2.toString());
        return new java.util.HashMap<java.lang.String, java.lang.Object>(hashMap) { // from class: com.adobe.marketing.mobile.ImplementationDetails.1
            final /* synthetic */ java.util.Map getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = hashMap;
                put("implementationDetails", hashMap);
            }
        };
    }
}

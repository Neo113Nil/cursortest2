package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
final class Utils {
    private Utils() {
    }

    static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoFpsRanges(org.json.JSONArray jSONArray) {
        java.lang.Object obj;
        if (jSONArray == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                obj = jSONArray.get(i);
            } catch (org.json.JSONException unused) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "Utils", "Unable to convert jsonObject to List for index %d, skipping.", java.lang.Integer.valueOf(i));
                obj = null;
            }
            if (obj != null && (obj instanceof org.json.JSONObject)) {
                try {
                    arrayList.add(com.adobe.marketing.mobile.util.JSONUtils.toMap((org.json.JSONObject) obj));
                } catch (org.json.JSONException unused2) {
                    com.adobe.marketing.mobile.services.Log.debug("Edge", "Utils", "Unable to convert jsonObject to Map for index %d, skipping.", java.lang.Integer.valueOf(i));
                }
            }
        }
        return arrayList;
    }

    static java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            return com.adobe.marketing.mobile.util.EventDataUtils.clone(map);
        } catch (com.adobe.marketing.mobile.util.CloneFailedException e) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "Utils", "Unable to deep copy map. CloneFailedException: %s", e.getLocalizedMessage());
            return null;
        }
    }

    static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoSizes(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map<java.lang.String, java.lang.Object>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getHighSpeedVideoFpsRanges(it.next()));
        }
        return arrayList;
    }
}

package com.helpshift.user;

/* loaded from: classes5.dex */
class InternalIdentityUtils {
    static final java.lang.String IDENTITY_KEY = "identifier";
    static final java.lang.String IDENTITY_META_DATA = "metadata";
    static final java.lang.String IDENTITY_VALUE = "value";
    private static final java.lang.String TAG = "InternalIdentityUtils";

    private InternalIdentityUtils() {
    }

    protected static java.util.List<com.helpshift.user.InternalIdentity> getIdentityFromJsonArrayString(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = !com.helpshift.util.Utils.isEmpty(str) ? new org.json.JSONArray(str) : new org.json.JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (!validateIdentityObject(optJSONObject)) {
                    com.helpshift.log.HSLogger.d(TAG, "identity object is invalid");
                    return arrayList;
                }
                java.lang.String str2 = (java.lang.String) optJSONObject.remove(IDENTITY_KEY);
                java.lang.String str3 = (java.lang.String) optJSONObject.remove("value");
                org.json.JSONObject jSONObject = (org.json.JSONObject) optJSONObject.remove("metadata");
                arrayList.add(new com.helpshift.user.InternalIdentity(str2, str3, com.helpshift.util.JsonUtils.jsonStringToStringMap(jSONObject != null ? jSONObject.toString() : "")));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting identity from Json Array String", e);
        }
        return arrayList;
    }

    private static boolean validateIdentityObject(org.json.JSONObject jSONObject) {
        int length;
        if (com.helpshift.util.JsonUtils.isEmpty(jSONObject) || !hasRequiredIdentityFields(jSONObject) || (length = jSONObject.length()) >= 4) {
            return false;
        }
        if ((length != 3 || jSONObject.has("metadata")) && areValidIdentityKeyValue(jSONObject)) {
            return isValidMetaData(jSONObject);
        }
        return false;
    }

    private static boolean hasRequiredIdentityFields(org.json.JSONObject jSONObject) {
        return jSONObject.has(IDENTITY_KEY) && jSONObject.has("value");
    }

    private static boolean areValidIdentityKeyValue(org.json.JSONObject jSONObject) {
        return (jSONObject.opt(IDENTITY_KEY) instanceof java.lang.String) && (jSONObject.opt("value") instanceof java.lang.String);
    }

    private static boolean isValidMetaData(org.json.JSONObject jSONObject) {
        if (!jSONObject.has("metadata")) {
            return true;
        }
        java.lang.Object opt = jSONObject.opt("metadata");
        if (opt instanceof org.json.JSONObject) {
            return isValidMetaDataEntries((org.json.JSONObject) opt);
        }
        return false;
    }

    private static boolean isValidMetaDataEntries(org.json.JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            if (!(jSONObject.opt(keys.next()) instanceof java.lang.String)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIdentifierPresent(java.util.List<com.helpshift.user.InternalIdentity> list, java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(list)) {
            return false;
        }
        java.util.Iterator<com.helpshift.user.InternalIdentity> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().identityKey)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.Map<java.lang.String, java.lang.String> getFlattenedIdentity(com.helpshift.user.InternalIdentity internalIdentity) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(internalIdentity.identityKey, internalIdentity.identityValue);
        hashMap.putAll(internalIdentity.metaData);
        return hashMap;
    }

    public static org.json.JSONArray getHashForIdentities(java.util.List<com.helpshift.user.InternalIdentity> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.helpshift.user.InternalIdentity> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.String.valueOf(getFlattenedIdentity(it.next()).hashCode()));
        }
        return com.helpshift.util.JsonUtils.jsonArrayFromList(arrayList);
    }
}

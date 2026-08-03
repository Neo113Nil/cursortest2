package com.helpshift.user;

/* loaded from: classes5.dex */
public class UserWithIdentity extends com.helpshift.user.BaseUser {
    private static final java.lang.String APP_ATTRIBUTES = "app_attributes";
    public static final java.lang.String IDENTITIES_HASH_LIST = "identities_hash_list";
    public static final java.lang.String IDENTITIES_SIGNATURE = "identitiesSignature";
    public static final java.lang.String IDENTITY_TOKEN = "identity_token";
    private static final java.lang.String TAG = "UserWithId";
    public static final java.lang.String UNSYNC_APP_ATTRIBUTES = "unsync_app_attributes";
    public static final java.lang.String UNSYNC_IDENTITIES = "unsync_identities";
    public static final java.lang.String UNSYNC_MASTER_ATTRIBUTES = "unsync_master_attributes";

    @Override // com.helpshift.user.BaseUser
    public boolean isIdentityUser() {
        return true;
    }

    @Override // com.helpshift.user.BaseUser
    protected boolean isUserDataNeededForNetworkCall() {
        return false;
    }

    @Override // com.helpshift.user.BaseUser
    boolean isUserDataValidForNetworkCall() {
        return true;
    }

    public UserWithIdentity(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        super(hSPersistentStorage);
    }

    @Override // com.helpshift.user.BaseUser
    protected boolean isUserSame(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap = com.helpshift.util.JsonUtils.jsonStringToMap(this.persistentStorage.getActiveUser());
        java.lang.Boolean bool = (java.lang.Boolean) com.helpshift.util.Utils.getOrDefault(com.helpshift.util.JsonUtils.jsonStringToMap((java.lang.String) getUserDataValue(com.helpshift.user.UserConstants.USER_LOGIN_CONFIG, "")), com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, false);
        bool.booleanValue();
        jsonStringToMap.put(com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, bool);
        return com.helpshift.user.IdentityValidationUtil.isNewIdentityUserSame(map, jsonStringToMap);
    }

    @Override // com.helpshift.user.BaseUser
    public java.util.Map<java.lang.String, java.lang.String> getUserLoginInfo() {
        return com.helpshift.util.JsonUtils.jsonStringToStringMap(this.persistentStorage.getActiveUser());
    }

    @Override // com.helpshift.user.BaseUser
    protected org.json.JSONObject getUserData() {
        java.lang.String string = this.persistentStorage.getString(com.helpshift.user.UserConstants.ACTIVE_USER_DATA);
        if (com.helpshift.util.Utils.isEmpty(string) || !com.helpshift.util.JsonUtils.isValidJsonString(string)) {
            string = "{}";
        }
        return new org.json.JSONObject(string);
    }

    @Override // com.helpshift.user.BaseUser
    protected void setUserData(org.json.JSONObject jSONObject) {
        this.persistentStorage.putString(com.helpshift.user.UserConstants.ACTIVE_USER_DATA, jSONObject.toString());
    }

    @Override // com.helpshift.user.BaseUser
    protected void cleanupUser() {
        this.persistentStorage.removeActiveUser();
        this.persistentStorage.putString(com.helpshift.user.UserConstants.ACTIVE_USER_DATA, "{}");
        this.persistentStorage.setFailedAnalyticsEvents(new org.json.JSONArray());
        clearUnSyncAttributesAndIdentities();
    }

    @Override // com.helpshift.user.BaseUser
    protected java.util.Map<java.lang.String, java.lang.String> getUserDataForNetworkCall(java.util.Map<java.lang.String, java.lang.String> map) {
        return new java.util.HashMap();
    }

    @Override // com.helpshift.user.BaseUser
    public java.util.Map<java.lang.String, java.lang.String> getDataForTokenRotation() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("access_token", getAccessToken());
        hashMap.put(com.helpshift.user.UserConstants.REFRESH_TOKEN, getRefreshToken());
        return hashMap;
    }

    protected void removeExistingAppAttributes(java.util.Map<java.lang.String, java.lang.Object> map, java.util.List<java.lang.String> list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(getExistingAppAttributes());
        hashMap.putAll(getUnsyncAppAttributes());
        java.util.Iterator<java.lang.String> it = map.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            java.lang.Object obj = map.get(next);
            if (hashMap.containsKey(next) && list.contains(next) && hashMap.get(next).equals(obj)) {
                it.remove();
            }
        }
    }

    protected void addUnSyncIdentities(java.lang.String str) {
        java.util.List<java.lang.String> unSyncIdentitiesList = getUnSyncIdentitiesList();
        if (unSyncIdentitiesList.contains(str)) {
            return;
        }
        unSyncIdentitiesList.add(str);
        this.persistentStorage.putString(UNSYNC_IDENTITIES, new org.json.JSONArray((java.util.Collection) unSyncIdentitiesList).toString());
    }

    protected java.util.List<java.lang.String> getUnSyncIdentitiesList() {
        return com.helpshift.util.JsonUtils.listFromJsonArrayString(getUnSyncIdentitiesString());
    }

    protected java.lang.String getUnSyncIdentitiesString() {
        return this.persistentStorage.getString(UNSYNC_IDENTITIES);
    }

    protected java.util.Map<java.lang.String, java.lang.Object> getUnsyncAppAttributes() {
        return com.helpshift.util.JsonUtils.jsonStringToMap(this.persistentStorage.getString(UNSYNC_APP_ATTRIBUTES));
    }

    private java.util.List<java.lang.String> mergeListAttributes(java.lang.Object obj, java.lang.Object obj2) {
        try {
            if ((obj instanceof java.util.List) && (obj2 instanceof java.util.List)) {
                java.util.List list = (java.util.List) obj2;
                list.addAll((java.util.List) obj);
                return new java.util.ArrayList(new java.util.LinkedHashSet(list));
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Unsynced attribute type changed in merge", e);
        }
        return new java.util.ArrayList();
    }

    private java.util.Map<java.lang.String, java.lang.Object> mergeMapAttributes(java.lang.Object obj, java.lang.Object obj2) {
        try {
            if ((obj instanceof java.util.Map) && (obj2 instanceof java.util.Map)) {
                java.util.Map<java.lang.String, java.lang.Object> map = (java.util.Map) obj2;
                map.putAll((java.util.Map) obj);
                return map;
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Unsynced attribute type changed in merge", e);
        }
        return new java.util.HashMap();
    }

    protected void addUnsyncedMasterAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.Object> unsyncedMasterAttributes = getUnsyncedMasterAttributes();
        mergeUnsyncedAttributes(map, unsyncedMasterAttributes);
        this.persistentStorage.putString(UNSYNC_MASTER_ATTRIBUTES, com.helpshift.util.JsonUtils.mapToJsonString(new java.util.HashMap(unsyncedMasterAttributes)));
    }

    protected java.util.Map<java.lang.String, java.lang.Object> getUnsyncedMasterAttributes() {
        return com.helpshift.util.JsonUtils.jsonStringToMap(this.persistentStorage.getString(UNSYNC_MASTER_ATTRIBUTES));
    }

    protected void addUnsyncedAppAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.Object> unsyncAppAttributes = getUnsyncAppAttributes();
        mergeUnsyncedAttributes(map, unsyncAppAttributes);
        this.persistentStorage.putString(UNSYNC_APP_ATTRIBUTES, com.helpshift.util.JsonUtils.mapToJsonString(new java.util.HashMap(unsyncAppAttributes)));
    }

    private void mergeUnsyncedAttributes(java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        java.lang.Object obj;
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (map2.containsKey(key)) {
                java.lang.Object obj2 = map2.get(key);
                if (value instanceof java.util.List) {
                    java.util.List<java.lang.String> mergeListAttributes = mergeListAttributes(value, obj2);
                    boolean isNotEmpty = com.helpshift.util.Utils.isNotEmpty(mergeListAttributes);
                    obj = mergeListAttributes;
                    if (!isNotEmpty) {
                    }
                    value = obj;
                } else if (value instanceof java.util.Map) {
                    java.util.Map<java.lang.String, java.lang.Object> mergeMapAttributes = mergeMapAttributes(value, obj2);
                    boolean isNotEmpty2 = com.helpshift.util.Utils.isNotEmpty(mergeMapAttributes);
                    obj = mergeMapAttributes;
                    if (!isNotEmpty2) {
                    }
                    value = obj;
                }
            }
            map2.put(key, value);
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> getExistingAppAttributes() {
        return com.helpshift.util.JsonUtils.jsonStringToStringMap((java.lang.String) getUserDataValue("app_attributes", "{}"));
    }

    public void clearUnSyncAttributesAndIdentities() {
        clearUnsyncIdentities();
        clearUnyncMasterAttributes();
        clearUnsyncAppAttributes();
    }

    public void clearUnyncMasterAttributes() {
        this.persistentStorage.putString(UNSYNC_MASTER_ATTRIBUTES, "");
    }

    public void clearUnsyncAppAttributes() {
        this.persistentStorage.putString(UNSYNC_APP_ATTRIBUTES, "");
    }

    public void clearUnsyncIdentities() {
        this.persistentStorage.putString(UNSYNC_IDENTITIES, "");
    }

    public void updateSyncedAppAttributes(java.lang.String str, java.util.List<java.lang.String> list) {
        java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap = com.helpshift.util.JsonUtils.jsonStringToMap((java.lang.String) getUserDataValue("app_attributes", ""));
        java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap2 = com.helpshift.util.JsonUtils.jsonStringToMap(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : list) {
            if (jsonStringToMap2.containsKey(str2)) {
                hashMap.put(str2, jsonStringToMap2.get(str2));
            }
        }
        mergeUnsyncedAttributes(hashMap, jsonStringToMap);
        setUserDataValues("app_attributes", com.helpshift.util.JsonUtils.mapToJsonString(jsonStringToMap));
    }

    public java.lang.String getSignature() {
        return getUserLoginInfo().get(IDENTITIES_SIGNATURE);
    }

    public java.lang.String getAccessToken() {
        return (java.lang.String) getUserDataValue("access_token", "");
    }

    public java.lang.String getRefreshToken() {
        return (java.lang.String) getUserDataValue(com.helpshift.user.UserConstants.REFRESH_TOKEN, "");
    }

    public void setAccessToken(java.lang.String str) {
        setUserDataValues("access_token", str);
    }

    public void setRefreshToken(java.lang.String str) {
        setUserDataValues(com.helpshift.user.UserConstants.REFRESH_TOKEN, str);
    }

    public void setRefreshTokenExpiry(long j) {
        if (j != 0) {
            setUserDataValues(com.helpshift.user.UserConstants.REFRESH_TOKEN_TTL, java.lang.Long.valueOf(j));
        }
    }
}

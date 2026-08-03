package com.helpshift.user;

/* loaded from: classes5.dex */
public class AnonymousUser extends com.helpshift.user.BaseUser {
    private static final java.lang.String ANON_USER_DATA = "anon_user_data";

    @Override // com.helpshift.user.BaseUser
    protected void cleanupUser() {
    }

    @Override // com.helpshift.user.BaseUser
    protected boolean isUserDataNeededForNetworkCall() {
        return true;
    }

    public AnonymousUser(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        super(hSPersistentStorage);
    }

    @Override // com.helpshift.user.BaseUser
    protected boolean isUserSame(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.String> jsonStringToStringMap = com.helpshift.util.JsonUtils.jsonStringToStringMap(this.persistentStorage.getAnonymousUserIdMap());
        return com.helpshift.util.Utils.isNotEmpty(jsonStringToStringMap) && jsonStringToStringMap.equals(map);
    }

    @Override // com.helpshift.user.BaseUser
    public java.util.Map<java.lang.String, java.lang.String> getUserLoginInfo() {
        return com.helpshift.util.JsonUtils.jsonStringToStringMap(this.persistentStorage.getAnonymousUserIdMap());
    }

    @Override // com.helpshift.user.BaseUser
    protected org.json.JSONObject getUserData() {
        java.lang.String string = this.persistentStorage.getString("anon_user_data");
        if (com.helpshift.util.Utils.isEmpty(string) || !com.helpshift.util.JsonUtils.isValidJsonString(string)) {
            string = "{}";
        }
        return new org.json.JSONObject(string);
    }

    @Override // com.helpshift.user.BaseUser
    protected void setUserData(org.json.JSONObject jSONObject) {
        this.persistentStorage.putString("anon_user_data", jSONObject.toString());
    }

    public void removeAnonymousUser() {
        this.persistentStorage.removeAnonymousUserIdMap();
        this.persistentStorage.putString("anon_user_data", "{}");
        this.persistentStorage.setFailedAnalyticsEvents(new org.json.JSONArray());
    }

    public boolean userDataExists() {
        return com.helpshift.util.Utils.isNotEmpty(getUserLoginInfo());
    }

    public void saveAnonUserData(org.json.JSONObject jSONObject) {
        this.persistentStorage.storeAnonymousUserIdMap(jSONObject.toString());
    }

    @Override // com.helpshift.user.BaseUser
    protected boolean isUserDataValidForNetworkCall() {
        return com.helpshift.util.Utils.validateUserIdEmailForLogin(getUserLoginInfo().get("userId"), "");
    }
}

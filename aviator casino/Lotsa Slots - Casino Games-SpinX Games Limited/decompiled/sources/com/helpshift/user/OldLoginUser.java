package com.helpshift.user;

/* loaded from: classes5.dex */
public class OldLoginUser extends com.helpshift.user.BaseUser {
    @Override // com.helpshift.user.BaseUser
    protected boolean isUserDataNeededForNetworkCall() {
        return true;
    }

    public OldLoginUser(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        super(hSPersistentStorage);
    }

    @Override // com.helpshift.user.BaseUser
    protected boolean isUserSame(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = getUserLoginInfo();
        return com.helpshift.util.Utils.isNotEmpty(userLoginInfo) && userLoginInfo.equals(map);
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
    }

    @Override // com.helpshift.user.BaseUser
    protected boolean isUserDataValidForNetworkCall() {
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = getUserLoginInfo();
        return com.helpshift.util.Utils.validateUserIdEmailForLogin(userLoginInfo.get("userId"), userLoginInfo.get("userEmail"));
    }
}

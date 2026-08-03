package com.helpshift.user;

/* loaded from: classes5.dex */
public abstract class BaseUser {
    protected final com.helpshift.storage.HSPersistentStorage persistentStorage;

    protected abstract void cleanupUser();

    protected abstract org.json.JSONObject getUserData();

    public abstract java.util.Map<java.lang.String, java.lang.String> getUserLoginInfo();

    public boolean isIdentityUser() {
        return false;
    }

    abstract boolean isUserDataNeededForNetworkCall();

    abstract boolean isUserDataValidForNetworkCall();

    protected abstract boolean isUserSame(java.util.Map<java.lang.String, java.lang.Object> map);

    protected abstract void setUserData(org.json.JSONObject jSONObject);

    protected BaseUser(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        this.persistentStorage = hSPersistentStorage;
    }

    protected java.util.Map<java.lang.String, java.lang.String> getUserDataForNetworkCall(java.util.Map<java.lang.String, java.lang.String> map) {
        if (com.helpshift.util.Utils.isEmpty(map)) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = getUserLoginInfo();
        if (com.helpshift.util.Utils.isEmpty(userLoginInfo)) {
            return new java.util.HashMap();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : userLoginInfo.keySet()) {
            java.lang.String str2 = map.get(str);
            if (com.helpshift.util.Utils.isNotEmpty(str2)) {
                hashMap.put(str2, userLoginInfo.get(str));
            }
        }
        return hashMap;
    }

    protected java.util.Map<java.lang.String, java.lang.String> getDataForTokenRotation() {
        return new java.util.HashMap();
    }

    protected <T> void setUserDataValues(java.lang.String str, T t) {
        org.json.JSONObject userData = getUserData();
        userData.put(str, t);
        setUserData(userData);
    }

    protected <T> T getUserDataValue(java.lang.String str, T t) {
        java.lang.Object obj;
        try {
            obj = getUserData().opt(str);
        } catch (java.lang.Exception unused) {
            obj = t;
        }
        return obj == null ? t : (T) obj;
    }
}

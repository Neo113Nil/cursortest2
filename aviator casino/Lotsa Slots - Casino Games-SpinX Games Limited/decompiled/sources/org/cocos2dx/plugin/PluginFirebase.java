package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class PluginFirebase implements org.cocos2dx.plugin.InterfaceAds, org.cocos2dx.plugin.PluginListener {
    private static java.lang.String TAG = "PluginFirebase";
    private static boolean initSuc = false;
    private static android.content.Context mContext;
    private static com.google.firebase.remoteconfig.FirebaseRemoteConfig mFirebaseRemoteConfig;

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public java.lang.String getPluginVersion() {
        return null;
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public java.lang.String getSDKVersion() {
        return null;
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void hideAds(java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onDestroy() {
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onPause() {
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onResume() {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void queryPoints() {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void setDebugMode(boolean z) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void showAds(java.util.Hashtable<java.lang.String, java.lang.String> hashtable, int i) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void spendPoints(int i) {
    }

    public PluginFirebase(android.content.Context context) {
        android.util.Log.i(TAG, "start init firebase plugin");
        mContext = context;
        mFirebaseRemoteConfig = com.google.firebase.remoteconfig.FirebaseRemoteConfig.getInstance();
        mFirebaseRemoteConfig.setConfigSettingsAsync(new com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(43200L).build());
    }

    public boolean isInitedSuc() {
        return initSuc;
    }

    public void initRemoteConfig() {
        com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig = mFirebaseRemoteConfig;
        if (firebaseRemoteConfig == null) {
            return;
        }
        initSuc = false;
        try {
            firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<java.lang.Boolean>() { // from class: org.cocos2dx.plugin.PluginFirebase.1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(com.google.android.gms.tasks.Task<java.lang.Boolean> task) {
                    if (task == null || !task.isSuccessful()) {
                        android.util.Log.d(org.cocos2dx.plugin.PluginFirebase.TAG, "not success");
                        return;
                    }
                    boolean unused = org.cocos2dx.plugin.PluginFirebase.initSuc = true;
                    boolean booleanValue = task.getResult().booleanValue();
                    android.util.Log.d(org.cocos2dx.plugin.PluginFirebase.TAG, "Config params updated: " + booleanValue);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public java.lang.String getRemoteConfig(org.json.JSONObject jSONObject) {
        if (mFirebaseRemoteConfig == null) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String string = jSONObject.getString(keys.next());
                if (string.length() == 0) {
                    break;
                }
                jSONObject2.put(string, mFirebaseRemoteConfig.getLong(string));
            }
            return jSONObject2.toString();
        } catch (org.json.JSONException e) {
            android.util.Log.e(TAG, "failed to get remote config");
            e.printStackTrace();
            return "";
        }
    }
}

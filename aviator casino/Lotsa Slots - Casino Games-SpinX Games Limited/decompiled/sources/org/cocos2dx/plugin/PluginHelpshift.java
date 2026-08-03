package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class PluginHelpshift implements org.cocos2dx.plugin.InterfaceAds, com.helpshift.HelpshiftEventsListener, com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector {
    static java.lang.String CustomMetadataKey = "customMetadata";
    protected static java.lang.String TAG = "Helpshift";
    private static android.app.Activity mContext;
    static int messageCount;
    private org.json.JSONObject config = null;
    java.util.Map<java.lang.String, java.lang.Object> localConfig = new java.util.HashMap();

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

    public void handlePush(org.json.JSONObject jSONObject) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void hideAds(java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
    }

    public boolean isConversationActive() {
        return false;
    }

    public void onResume() {
    }

    @Override // com.helpshift.HelpshiftEventsListener
    public void onUserAuthenticationFailure(com.helpshift.HelpshiftAuthenticationFailureReason helpshiftAuthenticationFailureReason) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void queryPoints() {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void setDebugMode(boolean z) {
    }

    public void setNameAndEmail(org.json.JSONObject jSONObject) {
    }

    public void setUserIdentifier(java.lang.String str) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void showAds(java.util.Hashtable<java.lang.String, java.lang.String> hashtable, int i) {
    }

    public void showAlertToRateApp(java.lang.String str) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAds
    public void spendPoints(int i) {
    }

    public PluginHelpshift(android.content.Context context) {
        android.util.Log.i(TAG, "creator helpshift");
        mContext = (android.app.Activity) context;
    }

    public void initHelpshift(org.json.JSONObject jSONObject) {
        try {
            this.localConfig = jsonToMap(new org.json.JSONObject(jSONObject.getString("Param4")));
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        com.helpshift.Helpshift.setHelpshiftEventsListener(this);
        com.helpshift.Helpshift.requestUnreadMessageCount(true);
        com.helpshift.Helpshift.setHelpshiftProactiveConfigCollector(this);
    }

    @Override // com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector
    public java.util.Map<java.lang.String, java.lang.Object> getAPIConfig() {
        return this.localConfig;
    }

    public void shouldPauseInAppNotification(final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.helpshift.Helpshift.shouldPauseInAppNotification(str.equals("true"));
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void showConversation(final org.json.JSONObject jSONObject) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.2
            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str = "";
                java.util.HashMap hashMap = new java.util.HashMap();
                try {
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.Object obj = jSONObject.get(next);
                        if (next.equals("hs-tags")) {
                            hashMap.put(next, obj.toString().split(","));
                        } else if (next.equals("conversationPrefillText")) {
                            str = (java.lang.String) obj;
                        } else {
                            hashMap.put(next, obj);
                        }
                    }
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(org.cocos2dx.plugin.PluginHelpshift.CustomMetadataKey, hashMap);
                if (str.length() > 0) {
                    hashMap2.put("conversationPrefillText", str);
                }
                com.helpshift.Helpshift.showConversation(org.cocos2dx.plugin.PluginHelpshift.mContext, hashMap2);
            }
        });
    }

    public void showFAQSection(final org.json.JSONObject jSONObject) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.3
            @Override // java.lang.Runnable
            public void run() {
                java.util.HashMap hashMap = new java.util.HashMap();
                try {
                    java.lang.String string = jSONObject.getString("Param1");
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Param2");
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        hashMap.put(next, jSONObject2.get(next));
                    }
                    android.util.Log.d(org.cocos2dx.plugin.PluginHelpshift.TAG, "showFAQSection - sectionPublishId : " + string);
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put(org.cocos2dx.plugin.PluginHelpshift.CustomMetadataKey, hashMap);
                    com.helpshift.Helpshift.showFAQSection(org.cocos2dx.plugin.PluginHelpshift.mContext, string, hashMap2);
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void showSingleFAQ(final org.json.JSONObject jSONObject) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.4
            @Override // java.lang.Runnable
            public void run() {
                java.util.HashMap hashMap = new java.util.HashMap();
                try {
                    java.lang.String string = jSONObject.getString("Param1");
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Param2");
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        hashMap.put(next, jSONObject2.get(next));
                    }
                    android.util.Log.d(org.cocos2dx.plugin.PluginHelpshift.TAG, "showSingleFAQ - sectionPublishId : " + string);
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put(org.cocos2dx.plugin.PluginHelpshift.CustomMetadataKey, hashMap);
                    com.helpshift.Helpshift.showSingleFAQ(org.cocos2dx.plugin.PluginHelpshift.mContext, string, hashMap2);
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void showFAQs(final org.json.JSONObject jSONObject) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.5
            @Override // java.lang.Runnable
            public void run() {
                java.util.HashMap hashMap = new java.util.HashMap();
                try {
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.Object obj = jSONObject.get(next);
                        if (!next.equals("hs-tags")) {
                            hashMap.put(next, obj);
                        } else {
                            hashMap.put(next, obj.toString().split(","));
                        }
                    }
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(org.cocos2dx.plugin.PluginHelpshift.CustomMetadataKey, hashMap);
                com.helpshift.Helpshift.showFAQs(org.cocos2dx.plugin.PluginHelpshift.mContext, hashMap2);
            }
        });
    }

    public void login(final org.json.JSONObject jSONObject) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.String string = jSONObject.getString("Param1");
                    java.lang.String string2 = jSONObject.getString("Param2");
                    java.lang.String string3 = jSONObject.getString("Param3");
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("userId", string);
                    hashMap.put("userEmail", string3);
                    hashMap.put("userName", string2);
                    com.helpshift.Helpshift.login(hashMap);
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void logout() {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.7
            @Override // java.lang.Runnable
            public void run() {
                com.helpshift.Helpshift.logout();
            }
        });
    }

    public void registerDeviceToken(final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.String str2 = str;
                    if (str2 == null || str2.length() == 0) {
                        return;
                    }
                    com.helpshift.Helpshift.registerPushToken(str);
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void leaveBreadCrumb(final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.9
            @Override // java.lang.Runnable
            public void run() {
                com.helpshift.Helpshift.leaveBreadCrumb(str);
            }
        });
    }

    public void clearBreadCrumbs() {
        com.helpshift.Helpshift.clearBreadCrumbs();
    }

    public int getNotificationCount(boolean z) {
        if (!z) {
            return messageCount;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.10
            @Override // java.lang.Runnable
            public void run() {
                com.helpshift.Helpshift.requestUnreadMessageCount(true);
            }
        });
        return 0;
    }

    public void setSDKLanguage(final java.lang.String str) {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginHelpshift.11
            @Override // java.lang.Runnable
            public void run() {
                com.helpshift.Helpshift.setLanguage(str);
            }
        });
    }

    @Override // com.helpshift.HelpshiftEventsListener
    public void onEventOccurred(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        str.hashCode();
        switch (str) {
            case "helpshiftSessionStarted":
                org.cocos2dx.plugin.AdsWrapper.onAdsResult(this, 6, "");
                break;
            case "messageAdd":
                if (map.get("type").equals(com.helpshift.HelpshiftEvent.DATA_MESSAGE_TYPE_ATTACHMENT)) {
                    org.cocos2dx.plugin.AdsWrapper.onAdsResult(this, 4, "");
                    break;
                }
                break;
            case "receivedUnreadMessageCount":
                messageCount = ((java.lang.Integer) map.get(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT)).intValue();
                org.cocos2dx.plugin.AdsWrapper.onAdsResult(this, 0, messageCount + "");
                break;
            case "conversationEnd":
                org.cocos2dx.plugin.AdsWrapper.onAdsResult(this, 2, "");
                break;
            case "helpshiftSessionEnded":
                org.cocos2dx.plugin.AdsWrapper.onAdsResult(this, 7, "");
                break;
            case "conversationStart":
                if (map.get("message") != null) {
                    org.cocos2dx.plugin.AdsWrapper.onAdsResult(this, 5, (java.lang.String) map.get("message"));
                    break;
                }
                break;
        }
    }

    private static java.util.Map<java.lang.String, java.lang.Object> jsonToMap(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, jsonToObject(jSONObject.get(next)));
        }
        return hashMap;
    }

    private static java.util.List<java.lang.Object> jsonToList(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jsonToObject(jSONArray.get(i)));
        }
        return arrayList;
    }

    private static java.lang.Object jsonToObject(java.lang.Object obj) throws org.json.JSONException {
        if (obj instanceof org.json.JSONObject) {
            return jsonToMap((org.json.JSONObject) obj);
        }
        if (obj instanceof org.json.JSONArray) {
            return jsonToList((org.json.JSONArray) obj);
        }
        if (obj == org.json.JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}

package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class PluginAdjust implements org.cocos2dx.plugin.InterfaceAnalytics, org.cocos2dx.plugin.PluginListener {
    private static java.lang.String adj_adid = "";
    private static java.lang.String gps_adid = "";
    private static android.content.Context mContext;
    java.lang.String attrStr = "wait";

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public java.lang.String getPluginVersion() {
        return null;
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public java.lang.String getSDKVersion() {
        return null;
    }

    public void initAdjust(org.json.JSONObject jSONObject) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void logError(java.lang.String str, java.lang.String str2) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void logEvent(java.lang.String str) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void logEvent(java.lang.String str, java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void logTimedEventBegin(java.lang.String str) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void logTimedEventEnd(java.lang.String str) {
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        return false;
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onDestroy() {
    }

    public void sendReferrer(java.lang.String str) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void setCaptureUncaughtException(boolean z) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void setDebugMode(boolean z) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void setSessionContinueMillis(int i) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void startSession(java.lang.String str) {
    }

    @Override // org.cocos2dx.plugin.InterfaceAnalytics
    public void stopSession() {
    }

    public PluginAdjust(android.content.Context context) {
        mContext = context;
        android.util.Log.d(com.adjust.sdk.Constants.LOGTAG, com.ironsource.X3.a.f);
        com.adjust.sdk.Adjust.getAdid(new com.adjust.sdk.OnAdidReadListener() { // from class: org.cocos2dx.plugin.PluginAdjust.1
            @Override // com.adjust.sdk.OnAdidReadListener
            public void onAdidRead(java.lang.String str) {
                java.lang.String unused = org.cocos2dx.plugin.PluginAdjust.adj_adid = str;
            }
        });
        getAttribution();
    }

    public void trackEvent(java.lang.String str) {
        com.adjust.sdk.Adjust.trackEvent(new com.adjust.sdk.AdjustEvent(str));
    }

    public void endFirstSessionDelay() {
        try {
            com.adjust.sdk.Adjust.endFirstSessionDelay();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void trackCallback(org.json.JSONObject jSONObject) {
        try {
            com.adjust.sdk.AdjustEvent adjustEvent = new com.adjust.sdk.AdjustEvent(jSONObject.getString("Param1"));
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Param2");
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                adjustEvent.addCallbackParameter(next, jSONObject2.getString(next));
            }
            com.adjust.sdk.Adjust.trackEvent(adjustEvent);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            android.util.Log.i(com.adjust.sdk.Constants.LOGTAG, "callback:" + e.toString());
        }
    }

    public void trackPartnerCallback(org.json.JSONObject jSONObject) {
        try {
            com.adjust.sdk.AdjustEvent adjustEvent = new com.adjust.sdk.AdjustEvent(jSONObject.getString("Param1"));
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Param2");
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                adjustEvent.addPartnerParameter(next, jSONObject2.getString(next));
            }
            com.adjust.sdk.Adjust.trackEvent(adjustEvent);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            android.util.Log.i(com.adjust.sdk.Constants.LOGTAG, "callback partner:" + e.toString());
        }
    }

    public void pushToken(java.lang.String str) {
        try {
            com.adjust.sdk.Adjust.setPushToken(str, mContext);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public java.lang.String getAttribution() {
        com.adjust.sdk.Adjust.getAttribution(new com.adjust.sdk.OnAttributionReadListener() { // from class: org.cocos2dx.plugin.PluginAdjust.2
            @Override // com.adjust.sdk.OnAttributionReadListener
            public void onAttributionRead(com.adjust.sdk.AdjustAttribution adjustAttribution) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("network", adjustAttribution.network);
                    jSONObject.put("campaign", adjustAttribution.campaign);
                    jSONObject.put("adgroup", adjustAttribution.adgroup);
                    jSONObject.put("adid", org.cocos2dx.plugin.PluginAdjust.adj_adid);
                    jSONObject.put("trackerToken", adjustAttribution.trackerToken);
                    jSONObject.put("trackerName", adjustAttribution.trackerName);
                    jSONObject.put("creative", adjustAttribution.creative);
                    jSONObject.put("clickLabel", adjustAttribution.clickLabel);
                    org.cocos2dx.plugin.PluginAdjust.this.attrStr = jSONObject.toString();
                } catch (org.json.JSONException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        });
        return this.attrStr;
    }

    public java.lang.String getGPSADID() {
        return gps_adid;
    }

    public void setEnabled(boolean z) {
        if (z) {
            com.adjust.sdk.Adjust.enable();
        } else {
            com.adjust.sdk.Adjust.disable();
        }
    }

    public void setOfflineMode(boolean z) {
        if (z) {
            com.adjust.sdk.Adjust.switchToOfflineMode();
        } else {
            com.adjust.sdk.Adjust.switchBackToOnlineMode();
        }
    }

    public void trackRevenue(org.json.JSONObject jSONObject) {
        try {
            java.lang.String string = jSONObject.getString("Param1");
            double d = jSONObject.getDouble("Param2");
            java.lang.String string2 = jSONObject.getString("Param3");
            com.adjust.sdk.AdjustEvent adjustEvent = new com.adjust.sdk.AdjustEvent(string);
            adjustEvent.setRevenue(d, string2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("Param4");
            if (jSONObject2 != null) {
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    adjustEvent.addCallbackParameter(next, jSONObject2.getString(next));
                }
            }
            com.adjust.sdk.Adjust.trackEvent(adjustEvent);
        } catch (java.lang.Exception e) {
            android.util.Log.i(com.adjust.sdk.Constants.LOGTAG, "revenue:" + e.toString());
        }
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onResume() {
        android.util.Log.i(com.adjust.sdk.Constants.LOGTAG, "on resume from register");
        com.adjust.sdk.Adjust.onResume();
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onPause() {
        android.util.Log.i(com.adjust.sdk.Constants.LOGTAG, "onpause");
        com.adjust.sdk.Adjust.onPause();
    }
}

package com.unity3d.services.core.broadcast;

/* loaded from: classes6.dex */
public class BroadcastEventReceiver extends android.content.BroadcastReceiver {
    private java.lang.String _name;

    public BroadcastEventReceiver(java.lang.String str) {
        this._name = str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (intent.getDataString() == null) {
            str = "";
        } else {
            str = intent.getDataString();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (intent.getExtras() != null) {
                android.os.Bundle extras = intent.getExtras();
                for (java.lang.String str2 : extras.keySet()) {
                    jSONObject.put(str2, extras.get(str2));
                }
            }
        } catch (org.json.JSONException e) {
            com.unity3d.services.core.log.DeviceLog.debug("JSONException when composing extras for broadcast action " + action + ": " + e.getMessage());
        }
        com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
        if (currentApp == null || !currentApp.isWebAppLoaded()) {
            return;
        }
        currentApp.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BROADCAST, com.unity3d.services.core.broadcast.BroadcastEvent.ACTION, this._name, action, str, jSONObject);
    }
}

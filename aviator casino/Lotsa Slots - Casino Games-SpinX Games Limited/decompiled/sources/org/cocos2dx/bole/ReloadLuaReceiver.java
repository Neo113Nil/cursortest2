package org.cocos2dx.bole;

/* loaded from: classes6.dex */
public class ReloadLuaReceiver extends android.content.BroadcastReceiver {
    java.lang.String TAG = "ReferrerReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        android.util.Log.i(this.TAG, "get action is" + action + " data is:" + intent.getDataString());
        if (action == null || !android.text.TextUtils.equals(action, "com.bolegames.test.Reload")) {
            return;
        }
        final java.lang.String dataString = intent.getDataString();
        if (org.cocos2dx.plugin.PluginWrapper.getContext() != null) {
            org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.ReloadLuaReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        org.cocos2dx.lib.Cocos2dxLuaJavaBridge.callLuaGlobalFunctionWithString("__G__ReloadLua__", dataString);
                    } catch (java.lang.Exception e) {
                        android.util.Log.i(org.cocos2dx.bole.ReloadLuaReceiver.this.TAG, e.toString());
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}

package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class SDKHelper {
    public static org.cocos2dx.lua.AppActivity activity = null;
    private static boolean isResume = false;
    private static final java.util.Map<java.lang.String, org.cocos2dx.bole.sdk.SDKBase> sSdkMap;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        sSdkMap = hashMap;
        hashMap.put("GoogleLogin", org.cocos2dx.bole.sdk.GoogleLogin.Instance());
        hashMap.put("SamsungIAP", org.cocos2dx.bole.sdk.SamsungIAP.Instance());
        hashMap.put("FirebaseSDK", org.cocos2dx.bole.sdk.firebase.FirebaseSDK.Instance());
        hashMap.put("SamsungCloud", org.cocos2dx.bole.sdk.SamsungCloud.Instance());
        hashMap.put("AmazonSDK", org.cocos2dx.bole.sdk.AmazonSDK.Instance());
        hashMap.put("HuaweiSDK", org.cocos2dx.bole.sdk.HuaweiSDK.Instance());
        hashMap.put("AdMobSDK", org.cocos2dx.bole.sdk.AdMobSDK.Instance());
        hashMap.put("GoogleUtils", org.cocos2dx.bole.sdk.GoogleUtils.Instance());
        hashMap.put("SamsungUtils", org.cocos2dx.bole.sdk.SamsungUtils.Instance());
        hashMap.put("AmazonUtils", org.cocos2dx.bole.sdk.AmazonUtils.Instance());
    }

    public static void onAppCreate(android.content.Context context) {
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onAppCreate(context);
        }
    }

    public static void onActivityCreate(org.cocos2dx.lua.AppActivity appActivity) {
        activity = appActivity;
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onActivityCreate(appActivity);
        }
    }

    public static void onResume() {
        isResume = true;
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public static void onPause() {
        isResume = false;
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public static void onDestroy() {
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    public static void onNewIntent(android.content.Intent intent) {
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onNewIntent(intent);
        }
    }

    public static void onActivityResult(int i, int i2, android.content.Intent intent) {
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onActivityResult(i, i2, intent);
        }
    }

    public static void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        java.util.Iterator<org.cocos2dx.bole.sdk.SDKBase> it = sSdkMap.values().iterator();
        while (it.hasNext()) {
            it.next().onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public static void callsdkmethod(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        sSdkMap.get(str).callMethodByName(str2, str3);
    }

    public static void runOnUiThread(java.lang.Runnable runnable) {
        activity.runOnUiThread(runnable);
    }

    public static void runOnGLThread(java.lang.Runnable runnable) {
        org.cocos2dx.lib.Cocos2dxHelper.runOnGLThread(runnable);
    }

    public static boolean isForeground() {
        return isResume;
    }
}

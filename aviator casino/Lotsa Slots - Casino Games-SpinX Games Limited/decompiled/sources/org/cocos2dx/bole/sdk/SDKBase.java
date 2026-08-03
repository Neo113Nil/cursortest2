package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class SDKBase {
    private static org.cocos2dx.bole.sdk.SDKBase instance;
    protected java.lang.String name = "";
    protected java.lang.String initError = "";

    public void onActivityCreate(android.app.Activity activity) {
    }

    public void onActivityResult(int i, int i2, android.content.Intent intent) {
    }

    public void onDestroy() {
    }

    public void onNewIntent(android.content.Intent intent) {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
    }

    public void onResume() {
    }

    public static org.cocos2dx.bole.sdk.SDKBase Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.SDKBase();
        }
        return instance;
    }

    public void onAppCreate(android.content.Context context) {
        this.name = getClass().getSimpleName();
    }

    public void callMethodByName(java.lang.String str, java.lang.Object... objArr) {
        try {
            if (!this.initError.equals("")) {
                callluaerror(str, -1, this.initError);
                return;
            }
            java.lang.Class<?>[] clsArr = new java.lang.Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            getClass().getMethod(str, clsArr).invoke(this, objArr);
        } catch (java.lang.Exception e) {
            callluaerror(str, -1, e.getMessage());
            e.printStackTrace();
        }
    }

    void calllua(java.lang.String str, org.json.JSONObject jSONObject) {
        calllua(str, jSONObject.toString());
    }

    protected void calllua(java.lang.String str, java.lang.Object... objArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (objArr.length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("参数数量必须是偶数（key/value 成对）");
        }
        for (int i = 0; i < objArr.length; i += 2) {
            try {
                jSONObject.put(java.lang.String.valueOf(objArr[i]), objArr[i + 1]);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return;
            }
        }
        calllua(str, jSONObject);
    }

    protected void calllua(java.lang.String str, java.lang.Object obj) {
        try {
            calllua(str, new org.json.JSONObject().put("blobject", obj));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    void calllua(final java.lang.String str, final java.lang.String str2) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.SDKBase.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxLuaJavaBridge.callLuaGlobalFunctionWithString("SDK_CALL_LUA", org.cocos2dx.bole.sdk.SDKBase.this.name + "," + str + "," + str2);
            }
        });
    }

    protected void callluaerror(java.lang.String str, int i, java.lang.String str2) {
        try {
            calllua(str, new org.json.JSONObject().put("error", str2).put("errorCode", i));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}

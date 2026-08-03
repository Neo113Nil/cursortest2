package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class GoogleLogin extends org.cocos2dx.bole.sdk.SDKBase {
    static java.lang.String TAG = "GoogleLogin";
    private static org.cocos2dx.bole.sdk.GoogleLogin instance;
    com.google.android.gms.auth.api.signin.GoogleSignInClient client = null;
    int RET_CODE = 8865;
    java.lang.String thisid = "";
    private final org.cocos2dx.bole.sdk.BoleInputMapProvider myInputMapProvider = new org.cocos2dx.bole.sdk.BoleInputMapProvider();

    public static org.cocos2dx.bole.sdk.GoogleLogin Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.GoogleLogin();
        }
        return instance;
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onActivityCreate(android.app.Activity activity) {
        try {
            java.lang.String packageName = activity.getPackageName();
            if (!packageName.equals(com.diamondlife.slots.vegas.free.BuildConfig.APPLICATION_ID)) {
                throw new java.lang.Exception("not open for " + packageName);
            }
            this.thisid = java.lang.String.valueOf(hashCode());
            this.client = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(activity, new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestIdToken("798752648751-ovlcuchge2h90pk8gfj5qmhg260l71al.apps.googleusercontent.com").build());
            com.google.android.libraries.play.games.inputmapping.Input.getInputMappingClient(activity).setInputMappingProvider(this.myInputMapProvider);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            this.initError = e.getMessage();
        }
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onDestroy() {
        com.google.android.libraries.play.games.inputmapping.Input.getInputMappingClient(org.cocos2dx.bole.sdk.SDKHelper.activity).clearInputMappingProvider();
    }

    public void login(java.lang.String str) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.GoogleLogin.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.bole.sdk.SDKHelper.activity.startActivityForResult(org.cocos2dx.bole.sdk.GoogleLogin.this.client.getSignInIntent(), org.cocos2dx.bole.sdk.GoogleLogin.this.RET_CODE);
            }
        });
    }

    java.lang.String getStr(java.lang.Object obj) {
        if (obj == null) {
            return "";
        }
        return java.lang.String.valueOf(obj);
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i == this.RET_CODE) {
            try {
                com.google.android.gms.auth.api.signin.GoogleSignInAccount result = com.google.android.gms.auth.api.signin.GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(com.google.android.gms.common.api.ApiException.class);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("id", getStr(result.getId()));
                jSONObject.put("email", getStr(result.getEmail()));
                jSONObject.put("givenName", getStr(result.getGivenName()));
                jSONObject.put("idToken", getStr(result.getIdToken()));
                jSONObject.put("name", getStr(result.getDisplayName()));
                jSONObject.put("familyName", getStr(result.getFamilyName()));
                jSONObject.put("profilePic", getStr(result.getPhotoUrl()));
                jSONObject.put("thisid", getStr(this.thisid));
                calllua(com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN, jSONObject);
            } catch (java.lang.Exception e) {
                android.util.Log.d(TAG, "onActivityResult: " + e);
                callluaerror(com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN, -1, e.getMessage());
            }
        }
    }

    void logout(java.lang.String str) {
        org.cocos2dx.bole.sdk.SDKHelper.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.GoogleLogin.2
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.bole.sdk.GoogleLogin.this.client.signOut();
            }
        });
    }
}

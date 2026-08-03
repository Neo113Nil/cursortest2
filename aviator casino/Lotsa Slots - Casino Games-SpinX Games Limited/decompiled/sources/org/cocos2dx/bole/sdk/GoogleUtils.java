package org.cocos2dx.bole.sdk;

/* loaded from: classes6.dex */
public class GoogleUtils extends org.cocos2dx.bole.sdk.SDKBase {
    static java.lang.String TAG = "GoogleUtils";
    private static org.cocos2dx.bole.sdk.GoogleUtils instance;

    public static org.cocos2dx.bole.sdk.GoogleUtils Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.GoogleUtils();
        }
        return instance;
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onActivityCreate(android.app.Activity activity) {
        getAageInfo("");
    }

    public void getAageInfo(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 23) {
            calllua("getAageInfo", "onFailure", "old os version");
            return;
        }
        try {
            com.google.android.play.agesignals.AgeSignalsManagerFactory.create(org.cocos2dx.bole.sdk.SDKHelper.activity).checkAgeSignals(com.google.android.play.agesignals.AgeSignalsRequest.builder().build()).addOnSuccessListener(new com.google.android.gms.tasks.OnSuccessListener<com.google.android.play.agesignals.AgeSignalsResult>() { // from class: org.cocos2dx.bole.sdk.GoogleUtils.2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(com.google.android.play.agesignals.AgeSignalsResult ageSignalsResult) {
                    org.cocos2dx.bole.sdk.GoogleUtils.this.calllua("getAageInfo", "onSuccess", ageSignalsResult.toString());
                }
            }).addOnFailureListener(new com.google.android.gms.tasks.OnFailureListener() { // from class: org.cocos2dx.bole.sdk.GoogleUtils.1
                @Override // com.google.android.gms.tasks.OnFailureListener
                public void onFailure(java.lang.Exception exc) {
                    org.cocos2dx.bole.sdk.GoogleUtils.this.calllua("getAageInfo", "onFailure", exc.getMessage());
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            calllua("getAageInfo", "onFailure", e.getMessage());
        }
    }
}

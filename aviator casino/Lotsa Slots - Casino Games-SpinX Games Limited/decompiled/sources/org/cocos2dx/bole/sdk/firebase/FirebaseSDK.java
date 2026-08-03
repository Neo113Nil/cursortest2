package org.cocos2dx.bole.sdk.firebase;

/* loaded from: classes6.dex */
public class FirebaseSDK extends org.cocos2dx.bole.sdk.SDKBase {
    static java.lang.String TAG = "FirebaseSDK";
    private static org.cocos2dx.bole.sdk.firebase.FirebaseSDK instance;
    private java.lang.String token = "";

    public static org.cocos2dx.bole.sdk.firebase.FirebaseSDK Instance() {
        if (instance == null) {
            instance = new org.cocos2dx.bole.sdk.firebase.FirebaseSDK();
        }
        return instance;
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onActivityCreate(final android.app.Activity activity) {
        super.onActivityCreate(activity);
        checkFCMData(activity);
        if (android.os.Build.VERSION.SDK_INT < 33 || android.preference.PreferenceManager.getDefaultSharedPreferences(org.cocos2dx.bole.sdk.SDKHelper.activity.getApplicationContext()).getBoolean("reject_notify", false)) {
            return;
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.firebase.FirebaseSDK.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.core.app.ActivityCompat.requestPermissions(activity, new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"}, 9965);
            }
        }, 1000L);
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 9965) {
            if (iArr.length > 0 && iArr[0] == 0) {
                android.util.Log.d(TAG, "onRequestPermissionsResult: true");
                return;
            }
            android.util.Log.d(TAG, "onRequestPermissionsResult: false");
            android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(org.cocos2dx.bole.sdk.SDKHelper.activity.getApplicationContext()).edit();
            edit.putBoolean("reject_notify", true);
            edit.commit();
            return;
        }
        if (i == 9966) {
            if (iArr.length > 0 && iArr[0] == 0) {
                calllua("requestPermissions", "grant", true);
                android.util.Log.d(TAG, "onRequestPermissionsResult: true");
            } else {
                calllua("requestPermissions", "grant", false);
                android.util.Log.d(TAG, "onRequestPermissionsResult: false");
            }
        }
    }

    @Override // org.cocos2dx.bole.sdk.SDKBase
    public void onNewIntent(android.content.Intent intent) {
        checkFCMData(org.cocos2dx.bole.sdk.SDKHelper.activity);
    }

    public void getFCMToken(java.lang.String str) {
        if (this.token.length() == 0) {
            com.google.firebase.messaging.FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<java.lang.String>() { // from class: org.cocos2dx.bole.sdk.firebase.FirebaseSDK.2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(com.google.android.gms.tasks.Task<java.lang.String> task) {
                    if (!task.isSuccessful()) {
                        android.util.Log.w(org.cocos2dx.bole.sdk.firebase.FirebaseSDK.TAG, "Fetching FCM registration token failed", task.getException());
                        org.cocos2dx.bole.sdk.firebase.FirebaseSDK.this.calllua("getFCMToken", (java.lang.Object) "");
                    } else {
                        org.cocos2dx.bole.sdk.firebase.FirebaseSDK.this.setFCMToken(task.getResult());
                        org.cocos2dx.bole.sdk.firebase.FirebaseSDK firebaseSDK = org.cocos2dx.bole.sdk.firebase.FirebaseSDK.this;
                        firebaseSDK.calllua("getFCMToken", (java.lang.Object) firebaseSDK.token);
                    }
                }
            });
        } else {
            calllua("getFCMToken", (java.lang.Object) this.token);
        }
    }

    public void setUserProperty(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                com.google.firebase.analytics.FirebaseAnalytics.getInstance(org.cocos2dx.bole.sdk.SDKHelper.activity).setUserProperty(next, jSONObject.getString(next));
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void setUserId(java.lang.String str) {
        com.google.firebase.analytics.FirebaseAnalytics.getInstance(org.cocos2dx.bole.sdk.SDKHelper.activity).setUserId(str);
    }

    public void logEvent(java.lang.String str) {
        try {
            final android.os.Bundle bundle = new android.os.Bundle();
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            final java.lang.String next = jSONObject.keys().next();
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String next2 = keys.next();
                bundle.putString(next2, jSONObject2.getString(next2));
            }
            org.cocos2dx.bole.sdk.SDKHelper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.firebase.FirebaseSDK.3
                @Override // java.lang.Runnable
                public void run() {
                    com.google.firebase.analytics.FirebaseAnalytics.getInstance(org.cocos2dx.bole.sdk.SDKHelper.activity).logEvent(next, bundle);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void addCrashCustomKey(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String next = jSONObject.keys().next();
            java.lang.String string = jSONObject.getString(next);
            com.google.firebase.crashlytics.FirebaseCrashlytics firebaseCrashlytics = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance();
            if (next.equals("user_id")) {
                firebaseCrashlytics.setUserId(string);
            } else {
                firebaseCrashlytics.setCustomKey(next, string);
            }
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static void addCrashLog(java.lang.String str) {
        try {
            com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance().log(str);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void didCrashOnPreviousExecution(java.lang.String str) {
        calllua("didCrashOnPreviousExecution", java.lang.Boolean.valueOf(com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance().didCrashOnPreviousExecution()));
    }

    public void sendNotify(java.lang.String str) {
        try {
            calllua("sendNotify", java.lang.Integer.valueOf(new org.cocos2dx.bole.sdk.firebase.NotificationSender(org.cocos2dx.bole.sdk.SDKHelper.activity).send(new org.json.JSONObject(str))));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public void removeNotify(java.lang.String str) {
        org.cocos2dx.bole.sdk.firebase.NotificationSender.cancel(java.lang.Integer.parseInt(str), org.cocos2dx.bole.sdk.SDKHelper.activity);
    }

    public void requestPermissions(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.app.ActivityCompat.requestPermissions(org.cocos2dx.bole.sdk.SDKHelper.activity, new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"}, 9966);
        } else {
            calllua("requestPermissions", "grant", false);
        }
    }

    public void saveNotifyData(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(org.cocos2dx.bole.sdk.SDKHelper.activity.getApplicationContext());
        java.lang.String string = defaultSharedPreferences.getString("fcm_type_" + str, "");
        android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        if (string.length() > 0) {
            edit.putString("fcm_type_" + str, string + "&&" + str2);
        } else {
            edit.putString("fcm_type_" + str, str2);
        }
        edit.commit();
    }

    private void checkFCMData(android.app.Activity activity) {
        try {
            android.os.Bundle extras = activity.getIntent().getExtras();
            if (extras == null || (activity.getIntent().getFlags() & 1048576) == 1048576) {
                return;
            }
            java.lang.String string = extras.getString("msgType");
            java.lang.String string2 = extras.getString("msgData");
            saveNotifyData(string, string2);
            java.lang.String string3 = extras.getString("track");
            android.util.Log.d(TAG, "txt_type: " + string);
            android.util.Log.d(TAG, "txt_json: " + string2);
            android.util.Log.d(TAG, "track: " + string3);
            if (string3 != null) {
                android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).edit();
                edit.putString("fcm_track", string3);
                edit.commit();
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "checkFCMData: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void setFCMToken(java.lang.String str) {
        this.token = str;
        android.util.Log.d(TAG, "setFCMToken: " + str);
    }
}

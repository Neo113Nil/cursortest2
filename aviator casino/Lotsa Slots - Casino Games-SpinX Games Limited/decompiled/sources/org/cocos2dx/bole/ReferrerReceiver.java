package org.cocos2dx.bole;

/* loaded from: classes6.dex */
public class ReferrerReceiver extends android.content.BroadcastReceiver {
    public static java.lang.String preferences = "bole_referrer_preferences";
    public static java.lang.String sharedKey = "bole_share_referrer_key";
    java.lang.String TAG = "ReferrerReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null || !android.text.TextUtils.equals(action, "com.android.vending.INSTALL_REFERRER")) {
            return;
        }
        try {
            java.lang.String stringExtra = intent.getStringExtra(com.adjust.sdk.Constants.REFERRER);
            if (stringExtra != null) {
                android.util.Log.i(this.TAG, stringExtra);
                context.getSharedPreferences(preferences, 0).edit().putString(sharedKey, stringExtra).commit();
            }
        } catch (java.lang.Exception e) {
            android.util.Log.i(this.TAG, e.toString());
            e.printStackTrace();
        }
    }
}

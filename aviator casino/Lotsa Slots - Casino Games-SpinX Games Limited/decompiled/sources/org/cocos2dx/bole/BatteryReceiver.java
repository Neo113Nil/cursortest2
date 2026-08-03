package org.cocos2dx.bole;

/* loaded from: classes6.dex */
public class BatteryReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getExtras() != null) {
            org.cocos2dx.bole.BoleJavaUtil.batteryPct = (r2.getInt(com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL) * 100) / r2.getInt("scale");
        }
    }
}

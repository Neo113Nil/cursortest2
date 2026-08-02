package com.google.android.gms.stats;

/* loaded from: classes8.dex */
public abstract class GCoreWakefulBroadcastReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {
    public static boolean completeWakefulIntent(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return androidx.legacy.content.WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}

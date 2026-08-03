package com.amazon.device.iap;

/* loaded from: classes2.dex */
public final class ResponseReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "ResponseReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        try {
            com.amazon.device.iap.internal.d.d().a(context, intent);
        } catch (java.lang.Exception e) {
            com.amazon.device.iap.internal.util.e.b(TAG, "Error in onReceive: " + e);
        }
    }
}

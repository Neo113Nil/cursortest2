package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class NotificationHandlerActivity extends android.app.Activity {
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            com.google.android.gms.internal.ads.zzbyu zzj = com.google.android.gms.ads.internal.client.zzay.zzb().zzj(this, new com.google.android.gms.internal.ads.zzbuy());
            if (zzj == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("OfflineUtils is null");
            } else {
                zzj.zze(getIntent());
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}

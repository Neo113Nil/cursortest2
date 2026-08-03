package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class AdService extends android.app.IntentService {
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(android.content.Intent intent) {
        try {
            com.google.android.gms.ads.internal.client.zzay.zzb().zzj(this, new com.google.android.gms.internal.ads.zzbuy()).zze(intent);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}

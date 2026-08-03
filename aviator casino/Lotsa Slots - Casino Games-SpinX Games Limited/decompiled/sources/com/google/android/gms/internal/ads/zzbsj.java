package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbsj extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbsk {
    public static com.google.android.gms.internal.ads.zzbsk zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbsk ? (com.google.android.gms.internal.ads.zzbsk) queryLocalInterface : new com.google.android.gms.internal.ads.zzbsi(iBinder);
    }
}

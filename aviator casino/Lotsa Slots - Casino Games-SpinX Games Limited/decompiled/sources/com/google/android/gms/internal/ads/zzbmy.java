package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbmy extends com.google.android.gms.internal.ads.zzbef implements com.google.android.gms.internal.ads.zzbmz {
    public static com.google.android.gms.internal.ads.zzbmz zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbmz ? (com.google.android.gms.internal.ads.zzbmz) queryLocalInterface : new com.google.android.gms.internal.ads.zzbmx(iBinder);
    }
}

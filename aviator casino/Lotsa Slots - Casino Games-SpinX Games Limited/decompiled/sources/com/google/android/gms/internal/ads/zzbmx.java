package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbmx extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbmz {
    zzbmx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zze(com.google.android.gms.internal.ads.zzbmq zzbmqVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbmqVar);
        zzda(1, zza);
    }
}

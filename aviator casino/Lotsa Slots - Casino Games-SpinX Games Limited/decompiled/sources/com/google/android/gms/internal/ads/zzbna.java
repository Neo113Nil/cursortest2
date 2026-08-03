package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbna extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbnc {
    zzbna(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final void zze(com.google.android.gms.internal.ads.zzbms zzbmsVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbmsVar);
        zzda(1, zza);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbjj extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbjl {
    zzbjj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zze(com.google.android.gms.internal.ads.zzbji zzbjiVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbjiVar);
        zzda(1, zza);
    }
}

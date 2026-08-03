package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbnk extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbnm {
    zzbnk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbuVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(1, zza);
    }
}

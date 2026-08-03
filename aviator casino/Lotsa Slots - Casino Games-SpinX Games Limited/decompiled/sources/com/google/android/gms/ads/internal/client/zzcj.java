package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzcj extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzcl {
    zzcj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final void zzb(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(1, zza);
    }
}

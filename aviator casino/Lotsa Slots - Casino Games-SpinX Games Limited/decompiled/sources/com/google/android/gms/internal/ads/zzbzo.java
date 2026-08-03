package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbzo extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbzq {
    zzbzo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zze(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }
}

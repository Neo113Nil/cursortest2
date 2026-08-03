package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqr extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbqt {
    zzbqr(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zze(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzf() throws android.os.RemoteException {
        zzda(2, zza());
    }
}

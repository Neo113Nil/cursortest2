package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzblv extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzblx {
    zzblv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final java.lang.String zzb() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        java.lang.String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final java.util.List zzc() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(3, zza());
        java.util.ArrayList zzf = com.google.android.gms.internal.ads.zzbeg.zzf(zzcZ);
        zzcZ.recycle();
        return zzf;
    }
}

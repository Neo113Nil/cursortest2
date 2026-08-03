package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbek extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbem {
    zzbek(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzf() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzg(int[] iArr) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeIntArray(null);
        zzda(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzh(byte[] bArr) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzi(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(0);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final void zzj(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyz extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbzb {
    zzbyz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzH(int i, java.lang.String[] strArr, int[] iArr) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zze() throws android.os.RemoteException {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzf() throws android.os.RemoteException {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final boolean zzg() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(11, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzh(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzi() throws android.os.RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzj() throws android.os.RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzk() throws android.os.RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzl() throws android.os.RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzm(int i, int i2, android.content.Intent intent) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, intent);
        zzda(12, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        zzda(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzo(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        android.os.Parcel zzcZ = zzcZ(6, zza);
        if (zzcZ.readInt() != 0) {
            bundle.readFromParcel(zzcZ);
        }
        zzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzp() throws android.os.RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzq() throws android.os.RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzs() throws android.os.RemoteException {
        zzda(9, zza());
    }
}

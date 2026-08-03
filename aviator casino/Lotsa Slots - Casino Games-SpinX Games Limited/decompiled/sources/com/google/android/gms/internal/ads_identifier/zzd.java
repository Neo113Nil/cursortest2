package com.google.android.gms.internal.ads_identifier;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes4.dex */
public final class zzd extends com.google.android.gms.internal.ads_identifier.zza implements com.google.android.gms.internal.ads_identifier.zzf {
    zzd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final java.lang.String zzc() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(1, zza());
        java.lang.String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() throws android.os.RemoteException {
        android.os.Parcel zzb = zzb(6, zza());
        boolean zzb2 = com.google.android.gms.internal.ads_identifier.zzc.zzb(zzb);
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads_identifier.zzc.zza(zza, true);
        android.os.Parcel zzb = zzb(2, zza);
        boolean zzb2 = com.google.android.gms.internal.ads_identifier.zzc.zzb(zzb);
        zzb.recycle();
        return zzb2;
    }
}

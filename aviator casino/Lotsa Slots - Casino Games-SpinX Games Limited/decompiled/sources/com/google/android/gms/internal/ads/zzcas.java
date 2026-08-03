package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcas extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzcau {
    zzcas(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(android.os.ParcelFileDescriptor parcelFileDescriptor) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbaVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg(android.os.ParcelFileDescriptor parcelFileDescriptor, com.google.android.gms.internal.ads.zzcbd zzcbdVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, parcelFileDescriptor);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzcbdVar);
        zzda(3, zza);
    }
}

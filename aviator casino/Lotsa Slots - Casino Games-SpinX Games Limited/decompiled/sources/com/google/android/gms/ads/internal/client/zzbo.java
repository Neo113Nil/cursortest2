package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbo extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzbq {
    zzbo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzbn zzblVar;
        android.os.Parcel zzcZ = zzcZ(1, zza());
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzblVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzbn ? (com.google.android.gms.ads.internal.client.zzbn) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzbl(readStrongBinder);
        }
        zzcZ.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbhVar);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(com.google.android.gms.internal.ads.zzbmz zzbmzVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(com.google.android.gms.internal.ads.zzbnc zzbncVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(java.lang.String str, com.google.android.gms.internal.ads.zzbni zzbniVar, com.google.android.gms.internal.ads.zzbnf zzbnfVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbniVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbnfVar);
        zzda(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(com.google.android.gms.internal.ads.zzblt zzbltVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbltVar);
        zzda(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(com.google.android.gms.internal.ads.zzbnm zzbnmVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbnmVar);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzrVar);
        zzda(8, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(com.google.android.gms.internal.ads.zzbnp zzbnpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbnpVar);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(com.google.android.gms.internal.ads.zzbsb zzbsbVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(com.google.android.gms.internal.ads.zzbsk zzbskVar) throws android.os.RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, adManagerAdViewOptions);
        zzda(15, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        throw null;
    }
}

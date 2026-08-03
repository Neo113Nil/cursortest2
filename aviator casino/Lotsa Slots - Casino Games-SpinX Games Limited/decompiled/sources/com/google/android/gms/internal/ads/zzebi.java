package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzebi extends com.google.android.gms.internal.ads.zzcck {
    final /* synthetic */ com.google.android.gms.internal.ads.zzebj zza;

    zzebi(com.google.android.gms.internal.ads.zzebj zzebjVar) {
        java.util.Objects.requireNonNull(zzebjVar);
        this.zza = zzebjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zze() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzm(zzebjVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzf() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzo(zzebjVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzg(com.google.android.gms.internal.ads.zzccf zzccfVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzp(zzebjVar.zzd(), zzccfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzh(int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzn(zzebjVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzn(zzebjVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzj() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzq(zzebjVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccl
    public final void zzk() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzr(zzebjVar.zzd());
    }
}

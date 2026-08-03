package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzebe extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeay zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzebf zzb;

    zzebe(com.google.android.gms.internal.ads.zzebf zzebfVar, com.google.android.gms.internal.ads.zzeay zzeayVar) {
        this.zza = zzeayVar;
        java.util.Objects.requireNonNull(zzebfVar);
        this.zzb = zzebfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzb() throws android.os.RemoteException {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc(int i) throws android.os.RemoteException {
        this.zza.zzf(this.zzb.zzd(), i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        this.zza.zzf(this.zzb.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf() throws android.os.RemoteException {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws android.os.RemoteException {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() throws android.os.RemoteException {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
    }
}

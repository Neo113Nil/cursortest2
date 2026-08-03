package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzebh extends com.google.android.gms.internal.ads.zzcco {
    final /* synthetic */ com.google.android.gms.internal.ads.zzebj zza;

    zzebh(com.google.android.gms.internal.ads.zzebj zzebjVar) {
        java.util.Objects.requireNonNull(zzebjVar);
        this.zza = zzebjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze() throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzk(zzebjVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzl(zzebjVar.zzd(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzebj zzebjVar = this.zza;
        zzebjVar.zze().zzl(zzebjVar.zzd(), zzeVar.zza);
    }
}

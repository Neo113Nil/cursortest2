package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzese extends com.google.android.gms.ads.internal.client.zzbm {
    private final com.google.android.gms.internal.ads.zzetn zza;

    public zzese(android.content.Context context, com.google.android.gms.internal.ads.zzcnj zzcnjVar, com.google.android.gms.internal.ads.zzfkx zzfkxVar, com.google.android.gms.internal.ads.zzdqd zzdqdVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        com.google.android.gms.internal.ads.zzetp zzetpVar = new com.google.android.gms.internal.ads.zzetp(zzdqdVar, zzcnjVar.zzD());
        zzetpVar.zza(zzbhVar);
        this.zza = new com.google.android.gms.internal.ads.zzetn(new com.google.android.gms.internal.ads.zzetz(zzcnjVar, context, zzetpVar, zzfkxVar), zzfkxVar.zzh());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        this.zza.zzb(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized java.lang.String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzg() throws android.os.RemoteException {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized java.lang.String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws android.os.RemoteException {
        this.zza.zzb(zzmVar, i);
    }
}

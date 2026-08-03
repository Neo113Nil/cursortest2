package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzje implements com.google.android.gms.internal.ads.zzabl {
    final /* synthetic */ com.google.android.gms.internal.ads.zzjg zza;
    private final java.util.HashMap zzb;
    private final com.google.android.gms.internal.ads.zzqf zzc;

    public zzje(com.google.android.gms.internal.ads.zzjg zzjgVar, com.google.android.gms.internal.ads.zzqf zzqfVar) {
        java.util.Objects.requireNonNull(zzjgVar);
        this.zza = zzjgVar;
        this.zzb = new java.util.HashMap();
        this.zzc = zzqfVar;
    }

    private final void zze(com.google.android.gms.internal.ads.zzabj zzabjVar) {
        com.google.android.gms.internal.ads.zzqf zzqfVar = (com.google.android.gms.internal.ads.zzqf) this.zzb.remove(zzabjVar);
        zzqfVar.getClass();
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) this.zza.zzl().get(zzqfVar);
        if (zzjfVar != null) {
            zzjfVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized com.google.android.gms.internal.ads.zzabj zza() {
        com.google.android.gms.internal.ads.zzabj zza;
        com.google.android.gms.internal.ads.zzjg zzjgVar = this.zza;
        com.google.android.gms.internal.ads.zzabr zzk = zzjgVar.zzk();
        java.util.HashMap hashMap = this.zzb;
        zza = zzk.zza();
        com.google.android.gms.internal.ads.zzqf zzqfVar = this.zzc;
        hashMap.put(zza, zzqfVar);
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) zzjgVar.zzl().get(zzqfVar);
        if (zzjfVar != null) {
            zzjfVar.zza();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzabj zzabjVar) {
        this.zza.zzk().zzb(zzabjVar);
        zze(zzabjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzc(com.google.android.gms.internal.ads.zzabk zzabkVar) {
        this.zza.zzk().zzc(zzabkVar);
        while (zzabkVar != null) {
            zze(zzabkVar.zzd());
            zzabkVar = zzabkVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }
}

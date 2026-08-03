package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfsc {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzhch zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final com.google.android.gms.internal.ads.zzfru zze;
    private final com.google.android.gms.internal.ads.zzfqj zzf;
    private final com.google.android.gms.internal.ads.zzcng zzg;

    zzfsc(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzhch zzhchVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.internal.ads.zzfru zzfruVar, com.google.android.gms.internal.ads.zzfqj zzfqjVar, com.google.android.gms.internal.ads.zzcng zzcngVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzhchVar;
        this.zzd = zzuVar;
        this.zze = zzfruVar;
        this.zzf = zzfqjVar;
        this.zzg = zzcngVar;
    }

    public final void zza(java.util.List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((java.lang.String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final java.lang.String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzdfg zzdfgVar) {
        com.google.common.util.concurrent.ListenableFuture zzc;
        com.google.android.gms.internal.ads.zzfpw zzfpwVar = null;
        if (com.google.android.gms.internal.ads.zzfqj.zza() && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzd.zze()).booleanValue()) {
            zzfpwVar = com.google.android.gms.internal.ads.zzfpw.CC.zzn(this.zza, 14);
            zzfpwVar.zza();
        }
        if (zzvVar != null) {
            zzc = new com.google.android.gms.internal.ads.zzfrt(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            zzc = this.zzc.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzfsb
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.internal.ads.zzfsc.this.zzc(str);
                }
            });
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(zzc, new com.google.android.gms.internal.ads.zzfsa(this, zzfpwVar, zzfqgVar, zzdfgVar), this.zzb);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzki)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzd.zzc(str, null);
        }
        java.lang.String zzb = this.zzg.zzb();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (zzb != null) {
            hashMap.put((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkj), zzb);
        }
        return this.zzd.zzc(str, hashMap);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zze() {
        return this.zzf;
    }
}

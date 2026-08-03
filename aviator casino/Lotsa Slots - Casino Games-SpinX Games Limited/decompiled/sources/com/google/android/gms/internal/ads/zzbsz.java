package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbsz implements com.google.android.gms.internal.ads.zzbpq {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsp zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtu zzd;

    zzbsz(com.google.android.gms.internal.ads.zzbtu zzbtuVar, long j, com.google.android.gms.internal.ads.zzbtt zzbttVar, com.google.android.gms.internal.ads.zzbsp zzbspVar) {
        this.zza = j;
        this.zzb = zzbttVar;
        this.zzc = zzbspVar;
        java.util.Objects.requireNonNull(zzbtuVar);
        this.zzd = zzbtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(currentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(currentTimeMillis);
        sb.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        com.google.android.gms.internal.ads.zzbtu zzbtuVar = this.zzd;
        synchronized (zzbtuVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            com.google.android.gms.internal.ads.zzbtt zzbttVar = this.zzb;
            if (zzbttVar.zzi() != -1 && zzbttVar.zzi() != 1) {
                zzbtuVar.zzl(0);
                com.google.android.gms.internal.ads.zzbsp zzbspVar = this.zzc;
                com.google.android.gms.internal.ads.zzbsp zzbspVar2 = zzbspVar;
                zzbspVar.zzm("/log", com.google.android.gms.internal.ads.zzbpp.zzg);
                zzbspVar.zzm("/result", com.google.android.gms.internal.ads.zzbpp.zzo);
                zzbttVar.zzf(zzbspVar);
                zzbtuVar.zzj(zzbttVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}

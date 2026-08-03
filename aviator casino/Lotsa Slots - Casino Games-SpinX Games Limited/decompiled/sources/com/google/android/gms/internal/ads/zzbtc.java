package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbtc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsp zzb;
    final /* synthetic */ java.util.ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtu zze;

    zzbtc(com.google.android.gms.internal.ads.zzbtu zzbtuVar, com.google.android.gms.internal.ads.zzbtt zzbttVar, com.google.android.gms.internal.ads.zzbsp zzbspVar, java.util.ArrayList arrayList, long j) {
        this.zza = zzbttVar;
        this.zzb = zzbspVar;
        this.zzc = arrayList;
        this.zzd = j;
        java.util.Objects.requireNonNull(zzbtuVar);
        this.zze = zzbtuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String sb;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        com.google.android.gms.internal.ads.zzbtu zzbtuVar = this.zze;
        synchronized (zzbtuVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            com.google.android.gms.internal.ads.zzbtt zzbttVar = this.zza;
            if (zzbttVar.zzi() != -1 && zzbttVar.zzi() != 1) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziF)).booleanValue()) {
                    zzbttVar.zzh(new java.util.concurrent.TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                } else {
                    zzbttVar.zzg();
                }
                com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
                final com.google.android.gms.internal.ads.zzbsp zzbspVar = this.zzb;
                java.util.Objects.requireNonNull(zzbspVar);
                zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbtb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzbsp.this.zzj();
                    }
                });
                java.lang.String valueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zze));
                int zzi = zzbttVar.zzi();
                int zzk = zzbtuVar.zzk();
                java.util.ArrayList arrayList = this.zzc;
                if (arrayList.isEmpty()) {
                    sb = ". Still waiting for the engine to be loaded";
                } else {
                    java.lang.String valueOf2 = java.lang.String.valueOf(arrayList.get(0));
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 88);
                    sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                    sb2.append(valueOf2);
                    sb = sb2.toString();
                }
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd;
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 107 + java.lang.String.valueOf(zzi).length() + 36 + java.lang.String.valueOf(zzk).length() + sb.length() + 39 + java.lang.String.valueOf(currentTimeMillis).length() + 26);
                sb3.append("Could not finish the full JS engine loading in ");
                sb3.append(valueOf);
                sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                sb3.append(zzi);
                sb3.append(". Update status(fullLoadTimeout) is ");
                sb3.append(zzk);
                sb3.append(sb);
                sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                sb3.append(currentTimeMillis);
                sb3.append(" ms at timeout. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}

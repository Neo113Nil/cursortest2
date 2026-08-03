package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzepk implements com.google.android.gms.internal.ads.zzhbe {
    private final com.google.android.gms.internal.ads.zzfpk zza;
    private final com.google.android.gms.internal.ads.zzdct zzb;
    private final com.google.android.gms.internal.ads.zzfry zzc;
    private final com.google.android.gms.internal.ads.zzfsc zzd;
    private final java.util.concurrent.Executor zze;
    private final java.util.concurrent.ScheduledExecutorService zzf;
    private final com.google.android.gms.internal.ads.zzcxw zzg;
    private final com.google.android.gms.internal.ads.zzepd zzh;
    private final com.google.android.gms.internal.ads.zzelx zzi;
    private final android.content.Context zzj;
    private final com.google.android.gms.internal.ads.zzfqg zzk;
    private final com.google.android.gms.internal.ads.zzeon zzl;
    private final com.google.android.gms.internal.ads.zzdzg zzm;

    zzepk(android.content.Context context, com.google.android.gms.internal.ads.zzfpk zzfpkVar, com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.internal.ads.zzdct zzdctVar, com.google.android.gms.internal.ads.zzfry zzfryVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzcxw zzcxwVar, java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzelx zzelxVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzeon zzeonVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar) {
        this.zzj = context;
        this.zza = zzfpkVar;
        this.zzh = zzepdVar;
        this.zzb = zzdctVar;
        this.zzc = zzfryVar;
        this.zzd = zzfscVar;
        this.zzg = zzcxwVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzelxVar;
        this.zzk = zzfqgVar;
        this.zzl = zzeonVar;
        this.zzm = zzdzgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgA)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        java.lang.String str = "No fill.";
        java.lang.String str2 = true != ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgB)).booleanValue() ? "No ad config." : "No fill.";
        com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkqVar.zzb.zzb;
        int i = zzfkiVar.zzf;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                if (i < 300 || i >= 400) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 35);
                    sb.append("Received error HTTP response code: ");
                    sb.append(i);
                    str = sb.toString();
                } else {
                    str = "No location header to follow redirect or too many redirects.";
                }
            }
            com.google.android.gms.internal.ads.zzfkh zzfkhVar = zzfkiVar.zzj;
            return zzfkhVar == null ? zzfkhVar.zza() : str;
        }
        str = str2;
        com.google.android.gms.internal.ads.zzfkh zzfkhVar2 = zzfkiVar.zzj;
        if (zzfkhVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) throws java.lang.Exception {
        int i;
        android.os.Bundle bundle;
        final com.google.android.gms.internal.ads.zzfkq zzfkqVar = (com.google.android.gms.internal.ads.zzfkq) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && (bundle = zzfkqVar.zzb.zzd) != null) {
            this.zzm.zzg(bundle);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcO)).booleanValue()) {
            this.zzm.zzf(com.google.android.gms.internal.ads.zzdyu.RENDERING_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        java.lang.String zzb = zzb(zzfkqVar);
        com.google.android.gms.internal.ads.zzelx zzelxVar = this.zzi;
        com.google.android.gms.internal.ads.zzfkp zzfkpVar = zzfkqVar.zzb;
        com.google.android.gms.internal.ads.zzfki zzfkiVar = zzfkpVar.zzb;
        zzelxVar.zza(zzfkiVar);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjC)).booleanValue() && (i = zzfkiVar.zzf) != 0 && (i < 200 || i >= 300)) {
            return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(3, zzb));
        }
        java.lang.String str = zzfkiVar.zzq;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzew)).booleanValue() || android.text.TextUtils.isEmpty(str)) {
            for (com.google.android.gms.internal.ads.zzfkf zzfkfVar : zzfkpVar.zza) {
                zzelxVar.zzb(zzfkfVar);
                java.util.Iterator it = zzfkfVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzelxVar.zze(zzfkfVar, 0L, com.google.android.gms.internal.ads.zzfma.zzd(1, null, null));
                        break;
                    }
                    com.google.android.gms.internal.ads.zzels zza = this.zzg.zza(zzfkfVar.zzb, (java.lang.String) it.next());
                    if (zza == null || !zza.zza(zzfkqVar, zzfkfVar)) {
                    }
                }
            }
        } else {
            zzelxVar.zzc(str, zzfkpVar.zza);
        }
        com.google.android.gms.internal.ads.zzdct zzdctVar = this.zzb;
        com.google.android.gms.internal.ads.zzctn zzctnVar = new com.google.android.gms.internal.ads.zzctn(zzfkqVar, this.zzd, this.zzc);
        java.util.concurrent.Executor executor = this.zze;
        zzdctVar.zzq(zzctnVar, executor);
        if (zzfkiVar.zzr > 1) {
            return this.zzl.zza(zzfkqVar);
        }
        java.lang.String zzb2 = zzb(zzfkqVar);
        com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zza;
        com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.RENDER_CONFIG_INIT;
        java.util.Objects.requireNonNull(zzfpkVar);
        com.google.android.gms.internal.ads.zzfor zzi = com.google.android.gms.internal.ads.zzfov.zza(com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeph(3, zzb2)), zzfpeVar, zzfpkVar).zzi();
        final com.google.android.gms.internal.ads.zzepd zzepdVar = this.zzh;
        zzepdVar.zza();
        int i2 = 0;
        for (final com.google.android.gms.internal.ads.zzfkf zzfkfVar2 : zzfkpVar.zza) {
            java.util.Iterator it2 = zzfkfVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it2.next();
                final com.google.android.gms.internal.ads.zzels zza2 = this.zzg.zza(zzfkfVar2.zzb, str2);
                if (zza2 != null && zza2.zza(zzfkqVar, zzfkfVar2)) {
                    com.google.android.gms.internal.ads.zzfpb zza3 = zzfpkVar.zza(com.google.android.gms.internal.ads.zzfpe.RENDER_CONFIG_WATERFALL, zzi);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 15 + java.lang.String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    zzi = zza3.zza(sb.toString()).zzg(java.lang.Throwable.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzepj
                        @Override // com.google.android.gms.internal.ads.zzhbe
                        public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj2) {
                            return com.google.android.gms.internal.ads.zzepk.this.zzc(zzfkfVar2, zzfkqVar, zza2, (java.lang.Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i2++;
        }
        java.util.Objects.requireNonNull(zzepdVar);
        zzi.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzepi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzepd.this.zzb();
            }
        }, executor);
        return zzi;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzels zzelsVar, java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(this.zzj, 12);
        zzn.zzi(zzfkfVar.zzE);
        zzn.zza();
        com.google.common.util.concurrent.ListenableFuture zzi = com.google.android.gms.internal.ads.zzhbw.zzi(zzelsVar.zzb(zzfkqVar, zzfkfVar), zzfkfVar.zzR, java.util.concurrent.TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfkqVar, zzfkfVar, zzi, this.zzc);
        com.google.android.gms.internal.ads.zzfqf.zzd(zzi, this.zzk, zzn);
        return zzi;
    }
}

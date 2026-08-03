package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbtu {
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.internal.ads.zzfqj zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;
    private com.google.android.gms.internal.ads.zzbtt zzh;
    private final java.lang.Object zza = new java.lang.Object();
    private int zzi = 1;

    public zzbtu(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, com.google.android.gms.internal.ads.zzfqj zzfqjVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfqjVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    protected final com.google.android.gms.internal.ads.zzbtt zza(com.google.android.gms.internal.ads.zzbap zzbapVar) {
        com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(this.zzb, 6);
        zzn.zza();
        final com.google.android.gms.internal.ads.zzbtt zzbttVar = new com.google.android.gms.internal.ads.zzbtt(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final com.google.android.gms.internal.ads.zzbap zzbapVar2 = null;
        com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable(zzbapVar2, zzbttVar) { // from class: com.google.android.gms.internal.ads.zzbtk
            private final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zzb;

            {
                this.zzb = zzbttVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzbtu.this.zzd(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbttVar.zze(new com.google.android.gms.internal.ads.zzbtd(this, zzbttVar, zzn), new com.google.android.gms.internal.ads.zzbte(this, zzbttVar, zzn));
        return zzbttVar;
    }

    public final com.google.android.gms.internal.ads.zzbto zzb(com.google.android.gms.internal.ads.zzbap zzbapVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        java.lang.Object obj = this.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (obj) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                com.google.android.gms.internal.ads.zzbtt zzbttVar = this.zzh;
                if (zzbttVar != null && this.zzi == 0) {
                    zzbttVar.zze(new com.google.android.gms.internal.ads.zzcga() { // from class: com.google.android.gms.internal.ads.zzbtg
                        @Override // com.google.android.gms.internal.ads.zzcga
                        public final /* synthetic */ void zza(java.lang.Object obj2) {
                            com.google.android.gms.internal.ads.zzbtu.this.zze((com.google.android.gms.internal.ads.zzbsp) obj2);
                        }
                    }, com.google.android.gms.internal.ads.zzbth.zza);
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        com.google.android.gms.internal.ads.zzbtt zzbttVar2 = this.zzh;
        if (zzbttVar2 != null && zzbttVar2.zzi() != -1) {
            int i = this.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        com.google.android.gms.internal.ads.zzbtt zzbttVar = this.zzh;
        if (zzbttVar != null) {
            zzbttVar.zzc();
            this.zzh = null;
        }
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzbap zzbapVar, final com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        final long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final com.google.android.gms.internal.ads.zzbsx zzbsxVar = new com.google.android.gms.internal.ads.zzbsx(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbsxVar.zzi(new com.google.android.gms.internal.ads.zzbso() { // from class: com.google.android.gms.internal.ads.zzbti
                @Override // com.google.android.gms.internal.ads.zzbso
                public final /* synthetic */ void zza() {
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = currentTimeMillis;
                    final java.util.ArrayList arrayList2 = arrayList;
                    arrayList2.add(java.lang.Long.valueOf(currentTimeMillis2 - j));
                    java.lang.String valueOf = java.lang.String.valueOf(arrayList2.get(0));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(valueOf);
                    sb.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final com.google.android.gms.internal.ads.zzbtu zzbtuVar = com.google.android.gms.internal.ads.zzbtu.this;
                    final com.google.android.gms.internal.ads.zzbtt zzbttVar2 = zzbttVar;
                    final com.google.android.gms.internal.ads.zzbsp zzbspVar = zzbsxVar;
                    zzgamVar.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbtj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzbtu.this.zzf(zzbttVar2, zzbspVar, arrayList2, j);
                        }
                    }, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzd)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbsxVar.zzm("/jsLoaded", new com.google.android.gms.internal.ads.zzbsz(this, currentTimeMillis, zzbttVar, zzbsxVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            com.google.android.gms.internal.ads.zzbta zzbtaVar = new com.google.android.gms.internal.ads.zzbta(this, null, zzbsxVar, zzbvVar);
            zzbvVar.zzb(zzbtaVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzd.zze()).booleanValue() || android.text.TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbsxVar.zzm("/requestReload", zzbtaVar);
            }
            java.lang.String str = this.zzc;
            java.lang.String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(java.lang.String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbsxVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbsxVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbsxVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new com.google.android.gms.internal.ads.zzbtc(this, zzbttVar, zzbsxVar, arrayList, currentTimeMillis), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zze)).intValue());
        } catch (java.lang.Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziF)).booleanValue()) {
                zzbttVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbttVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbttVar.zzg();
            }
        }
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbsp zzbspVar) {
        if (zzbspVar.zzk()) {
            this.zzi = 1;
        }
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzbtt zzbttVar, final com.google.android.gms.internal.ads.zzbsp zzbspVar, java.util.ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbttVar.zzi() != -1 && zzbttVar.zzi() != 1) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziF)).booleanValue()) {
                    zzbttVar.zzh(new java.util.concurrent.TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbttVar.zzg();
                }
                com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
                java.util.Objects.requireNonNull(zzbspVar);
                zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbtf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzbsp.this.zzj();
                    }
                });
                java.lang.String valueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzd));
                int zzi = zzbttVar.zzi();
                int i = this.zzi;
                java.lang.String valueOf2 = java.lang.String.valueOf(arrayList.get(0));
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 94 + java.lang.String.valueOf(zzi).length() + 39 + java.lang.String.valueOf(i).length() + 57 + java.lang.String.valueOf(valueOf2).length() + 42 + java.lang.String.valueOf(currentTimeMillis).length() + 15);
                sb.append("Could not receive /jsLoaded in ");
                sb.append(valueOf);
                sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                sb.append(zzi);
                sb.append(". Update status(onEngLoadedTimeout) is ");
                sb.append(i);
                sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                sb.append(valueOf2);
                sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                sb.append(currentTimeMillis);
                sb.append(" ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ java.lang.Object zzg() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfqj zzh() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zzi() {
        return this.zzh;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzbtt zzbttVar) {
        this.zzh = zzbttVar;
    }

    final /* synthetic */ int zzk() {
        return this.zzi;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i;
    }
}

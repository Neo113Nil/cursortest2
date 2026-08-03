package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcqr extends com.google.android.gms.ads.internal.client.zzcx {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final com.google.android.gms.internal.ads.zzdxc zzc;
    private final com.google.android.gms.internal.ads.zzelu zzd;
    private final com.google.android.gms.internal.ads.zzerw zze;
    private final com.google.android.gms.internal.ads.zzebw zzf;
    private final com.google.android.gms.internal.ads.zzcdz zzg;
    private final com.google.android.gms.internal.ads.zzdxh zzh;
    private final com.google.android.gms.internal.ads.zzecr zzi;
    private final com.google.android.gms.internal.ads.zzblk zzj;
    private final com.google.android.gms.internal.ads.zzfqj zzk;
    private final com.google.android.gms.internal.ads.zzflu zzl;
    private final com.google.android.gms.internal.ads.zzdae zzm;
    private final com.google.android.gms.internal.ads.zzdzl zzn;
    private final com.google.android.gms.internal.ads.zzedy zzo;
    private boolean zzp = false;
    private final java.lang.Long zzq = java.lang.Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    zzcqr(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdxc zzdxcVar, com.google.android.gms.internal.ads.zzelu zzeluVar, com.google.android.gms.internal.ads.zzerw zzerwVar, com.google.android.gms.internal.ads.zzebw zzebwVar, com.google.android.gms.internal.ads.zzcdz zzcdzVar, com.google.android.gms.internal.ads.zzdxh zzdxhVar, com.google.android.gms.internal.ads.zzecr zzecrVar, com.google.android.gms.internal.ads.zzblk zzblkVar, com.google.android.gms.internal.ads.zzfqj zzfqjVar, com.google.android.gms.internal.ads.zzflu zzfluVar, com.google.android.gms.internal.ads.zzdae zzdaeVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzedy zzedyVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdxcVar;
        this.zzd = zzeluVar;
        this.zze = zzerwVar;
        this.zzf = zzebwVar;
        this.zzg = zzcdzVar;
        this.zzh = zzdxhVar;
        this.zzi = zzecrVar;
        this.zzj = zzblkVar;
        this.zzk = zzfqjVar;
        this.zzl = zzfluVar;
        this.zzm = zzdaeVar;
        this.zzn = zzdzlVar;
        this.zzo = zzedyVar;
    }

    final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
            java.lang.String zzL = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzL();
            if (com.google.android.gms.ads.internal.zzt.zzo().zze(this.zza, zzL, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(false);
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzM("");
        }
    }

    final /* synthetic */ void zzc() {
        com.google.android.gms.internal.ads.zzfmd.zza(this.zza, true);
    }

    final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzt.zzn().zza(this.zza, this.zzn);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zze() {
        if (this.zzp) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzay.zzc();
        }
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        com.google.android.gms.ads.internal.zzt.zzh().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        this.zzp = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeV)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcqr.this.zzb();
                }
            });
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmr)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcqr.this.zzx();
                }
            });
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdT)).booleanValue()) {
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcql
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcqr.this.zzc();
                }
            });
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfA)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfB)).booleanValue()) {
                com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzcqr.this.zzd();
                    }
                });
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfO)).booleanValue()) {
            final com.google.android.gms.internal.ads.zzedy zzedyVar = this.zzo;
            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
            java.util.Objects.requireNonNull(zzedyVar);
            zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzedy.this.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzf(float f) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzg(java.lang.String str) {
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (!android.text.TextUtils.isEmpty(str)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzh(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.zzb.afmaVersion);
            zzatVar.zzb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.google.android.gms.ads.internal.client.zzcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        java.lang.String zzr;
        java.lang.String str2;
        java.lang.Runnable runnable;
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfa)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzr = com.google.android.gms.ads.internal.util.zzs.zzr(context);
            } catch (android.os.RemoteException | java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "NonagonMobileAdsSettingManager_AppId");
            }
            boolean z = true;
            str2 = true != android.text.TextUtils.isEmpty(zzr) ? str : zzr;
            if (android.text.TextUtils.isEmpty(str2)) {
                boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeT)).booleanValue();
                com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzbD;
                boolean booleanValue2 = booleanValue | ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue();
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                    final java.lang.Runnable runnable2 = (java.lang.Runnable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
                    runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
                            final com.google.android.gms.internal.ads.zzcqr zzcqrVar = com.google.android.gms.internal.ads.zzcqr.this;
                            final java.lang.Runnable runnable3 = runnable2;
                            zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcqp
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    com.google.android.gms.internal.ads.zzcqr.this.zzy(runnable3);
                                }
                            });
                        }
                    };
                } else {
                    runnable = null;
                    z = booleanValue2;
                }
                java.lang.Runnable runnable3 = runnable;
                if (z) {
                    com.google.android.gms.ads.internal.zzt.zzl().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzq, this.zzi.zzs());
                    return;
                }
                return;
            }
            return;
        }
        zzr = "";
        boolean z2 = true;
        if (true != android.text.TextUtils.isEmpty(zzr)) {
        }
        if (android.text.TextUtils.isEmpty(str2)) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final java.lang.String zzm() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(java.lang.String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(com.google.android.gms.internal.ads.zzbvc zzbvcVar) throws android.os.RemoteException {
        this.zzl.zzc(zzbvcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(com.google.android.gms.internal.ads.zzbrw zzbrwVar) throws android.os.RemoteException {
        this.zzf.zzb(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final java.util.List zzq() throws android.os.RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(com.google.android.gms.ads.internal.client.zzfr zzfrVar) throws android.os.RemoteException {
        this.zzg.zzb(this.zza, zzfrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(com.google.android.gms.ads.internal.client.zzdk zzdkVar) throws android.os.RemoteException {
        this.zzi.zzo(zzdkVar, com.google.android.gms.internal.ads.zzecq.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzt(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final synchronized void zzw() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdh)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzr().zzc();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdi)).booleanValue()) {
                com.google.android.gms.ads.internal.client.zzay.zzd();
            }
        }
    }

    final /* synthetic */ void zzx() {
        this.zzj.zza(new com.google.android.gms.internal.ads.zzcac());
    }

    final /* synthetic */ void zzy(java.lang.Runnable runnable) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        java.util.Map zzf = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzf();
        if (zzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (java.lang.Throwable th) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = zzf.values().iterator();
            while (it.hasNext()) {
                for (com.google.android.gms.internal.ads.zzbuv zzbuvVar : ((com.google.android.gms.internal.ads.zzbuw) it.next()).zza) {
                    java.lang.String str = zzbuvVar.zzb;
                    for (java.lang.String str2 : zzbuvVar.zza) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new java.util.ArrayList());
                        }
                        if (str != null) {
                            ((java.util.List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                try {
                    com.google.android.gms.internal.ads.zzelv zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) zza.zzb;
                        if (!zzflwVar.zzn() && zzflwVar.zzq()) {
                            zzflwVar.zzr(this.zza, (com.google.android.gms.internal.ads.zzeni) zza.zzc, (java.util.List) entry.getValue());
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 45);
                            sb.append("Initialized rewarded video mediation adapter ");
                            sb.append(str3);
                            java.lang.String sb2 = sb.toString();
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
                        }
                    }
                } catch (com.google.android.gms.internal.ads.zzflf e) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 56);
                    sb3.append("Failed to initialize rewarded video mediation adapter \"");
                    sb3.append(str3);
                    sb3.append("\"");
                    java.lang.String sb4 = sb3.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(sb4, e);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws android.os.RemoteException {
        try {
            com.google.android.gms.internal.ads.zzgch.zza(this.zza).zzb(z);
        } catch (java.io.IOException e) {
            throw new android.os.RemoteException(e.getMessage());
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdyq implements com.google.android.gms.internal.ads.zzdht, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzddl, com.google.android.gms.internal.ads.zzdcv, com.google.android.gms.internal.ads.zzdfm {
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzflr zzd;
    private final com.google.android.gms.internal.ads.zzdzl zze;
    private final com.google.android.gms.internal.ads.zzfkq zzf;
    private final com.google.android.gms.internal.ads.zzfkf zzg;
    private final com.google.android.gms.internal.ads.zzekg zzh;
    private final java.lang.String zzi;
    private java.lang.Boolean zzk;
    private long zzj = -1;
    final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final boolean zzl = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhM)).booleanValue();

    public zzdyq(android.content.Context context, com.google.android.gms.internal.ads.zzflr zzflrVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzekg zzekgVar, java.lang.String str) {
        this.zzc = context;
        this.zzd = zzflrVar;
        this.zze = zzdzlVar;
        this.zzf = zzfkqVar;
        this.zzg = zzfkfVar;
        this.zzh = zzekgVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        java.lang.String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    java.lang.String str2 = (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzce);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzr(this.zzc);
                    } catch (android.os.RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = java.util.regex.Pattern.matches(str2, str);
                        } catch (java.lang.RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = java.lang.Boolean.valueOf(z);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final com.google.android.gms.internal.ads.zzdzk zzg(java.lang.String str) {
        com.google.android.gms.internal.ads.zzfkq zzfkqVar = this.zzf;
        com.google.android.gms.internal.ads.zzfkp zzfkpVar = zzfkqVar.zzb;
        com.google.android.gms.internal.ads.zzdzk zza = this.zze.zza();
        zza.zza(zzfkpVar.zzb);
        com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzg;
        zza.zzb(zzfkfVar);
        zza.zzc("action", str);
        zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, this.zzi.toUpperCase(java.util.Locale.ROOT));
        java.util.List list = zzfkfVar.zzt;
        if (!list.isEmpty()) {
            zza.zzc("ancn", (java.lang.String) list.get(0));
        }
        if (zzfkfVar.zzb()) {
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : androidx.browser.customtabs.CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zza.zzc("event_timestamp", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhT)).booleanValue()) {
            boolean zza2 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzfkqVar);
            zza.zzc("scar", java.lang.String.valueOf(zza2));
            if (zza2) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkqVar.zza.zza.zzd;
                zza.zzc("ragent", zzmVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zzi(com.google.android.gms.internal.ads.zzdzk zzdzkVar) {
        if (!this.zzg.zzb()) {
            zzdzkVar.zzd();
            return;
        }
        this.zzh.zze(new com.google.android.gms.internal.ads.zzeki(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdzkVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg(com.ironsource.Y3.d));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            com.google.android.gms.internal.ads.zzdzk zzg = zzg("ifts");
            zzg.zzc("reason", com.ironsource.M6.I1);
            int i = zzeVar.zza;
            java.lang.String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzg.zzc("arec", java.lang.String.valueOf(i));
            }
            java.lang.String zza = this.zzd.zza(str);
            if (zza != null) {
                zzg.zzc("areec", zza);
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zzd(com.google.android.gms.internal.ads.zzdnn zzdnnVar) {
        if (this.zzl) {
            com.google.android.gms.internal.ads.zzdzk zzg = zzg("ifts");
            zzg.zzc("reason", "exception");
            if (!android.text.TextUtils.isEmpty(zzdnnVar.getMessage())) {
                zzg.zzc(androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, zzdnnVar.getMessage());
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final void zzdH() {
        if (zzf()) {
            com.google.android.gms.internal.ads.zzdzk zzg = zzg("adapter_impression");
            zzg.zzc("imp_type", java.lang.String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzg.zzc("po", "1");
                zzg.zzc("pil", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzg.zzc("po", "0");
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpa)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpb)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdht
    public final void zzdI() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            com.google.android.gms.internal.ads.zzdzk zzg = zzg("impression");
            zzg.zzc("imp_type", java.lang.String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzg.zzc("p_imp_l", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpa)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            zzi(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcv
    public final void zze() {
        if (this.zzl) {
            com.google.android.gms.internal.ads.zzdzk zzg = zzg("ifts");
            zzg.zzc("reason", "blocked");
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfm
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            com.google.android.gms.internal.ads.zzdzk zzg = zzg("presentation");
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpa)).booleanValue() && zzj()) {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc));
                zzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpb)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzg.zzd();
        }
    }
}

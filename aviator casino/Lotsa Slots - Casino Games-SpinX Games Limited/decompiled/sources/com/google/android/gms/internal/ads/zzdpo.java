package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdpo extends com.google.android.gms.internal.ads.zzcxt {
    public static final com.google.android.gms.internal.ads.zzgwm zzc = com.google.android.gms.internal.ads.zzgwm.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final java.util.List zzA;
    private final java.util.concurrent.Executor zzd;
    private final com.google.android.gms.internal.ads.zzdpt zze;
    private final com.google.android.gms.internal.ads.zzdqb zzf;
    private final com.google.android.gms.internal.ads.zzdqs zzg;
    private final com.google.android.gms.internal.ads.zzdpy zzh;
    private final com.google.android.gms.internal.ads.zzdqd zzi;
    private final com.google.android.gms.internal.ads.zzimo zzj;
    private final com.google.android.gms.internal.ads.zzimo zzk;
    private final com.google.android.gms.internal.ads.zzimo zzl;
    private final com.google.android.gms.internal.ads.zzimo zzm;
    private final com.google.android.gms.internal.ads.zzimo zzn;
    private com.google.android.gms.internal.ads.zzdrq zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final com.google.android.gms.internal.ads.zzcdw zzt;
    private final com.google.android.gms.internal.ads.zzbap zzu;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzv;
    private final android.content.Context zzw;
    private final com.google.android.gms.internal.ads.zzdpq zzx;
    private final com.google.android.gms.internal.ads.zzetf zzy;
    private final java.util.Map zzz;

    public zzdpo(com.google.android.gms.internal.ads.zzcxs zzcxsVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdpt zzdptVar, com.google.android.gms.internal.ads.zzdqb zzdqbVar, com.google.android.gms.internal.ads.zzdqs zzdqsVar, com.google.android.gms.internal.ads.zzdpy zzdpyVar, com.google.android.gms.internal.ads.zzdqd zzdqdVar, com.google.android.gms.internal.ads.zzimo zzimoVar, com.google.android.gms.internal.ads.zzimo zzimoVar2, com.google.android.gms.internal.ads.zzimo zzimoVar3, com.google.android.gms.internal.ads.zzimo zzimoVar4, com.google.android.gms.internal.ads.zzimo zzimoVar5, com.google.android.gms.internal.ads.zzcdw zzcdwVar, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.Context context, com.google.android.gms.internal.ads.zzdpq zzdpqVar, com.google.android.gms.internal.ads.zzetf zzetfVar, com.google.android.gms.internal.ads.zzbet zzbetVar) {
        super(zzcxsVar);
        this.zzd = executor;
        this.zze = zzdptVar;
        this.zzf = zzdqbVar;
        this.zzg = zzdqsVar;
        this.zzh = zzdpyVar;
        this.zzi = zzdqdVar;
        this.zzj = zzimoVar;
        this.zzk = zzimoVar2;
        this.zzl = zzimoVar3;
        this.zzm = zzimoVar4;
        this.zzn = zzimoVar5;
        this.zzt = zzcdwVar;
        this.zzu = zzbapVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdpqVar;
        this.zzy = zzetfVar;
        this.zzz = new java.util.HashMap();
        this.zzA = new java.util.ArrayList();
    }

    public static boolean zzI(android.view.View view) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlZ)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new android.graphics.Rect(), new android.graphics.Point());
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzy = com.google.android.gms.ads.internal.util.zzs.zzy(view);
        if (view.isShown() && view.getGlobalVisibleRect(new android.graphics.Rect(), new android.graphics.Point())) {
            if (zzy >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzma)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        java.util.Iterator<java.lang.String> keys;
        android.view.View view;
        com.google.android.gms.internal.ads.zzbak zzb;
        if (!this.zzp) {
            this.zzo = zzdrqVar;
            this.zzg.zza(zzdrqVar);
            this.zzf.zza(zzdrqVar.zzdF(), zzdrqVar.zzj(), zzdrqVar.zzk(), zzdrqVar, zzdrqVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdz)).booleanValue() && (zzb = this.zzu.zzb()) != null) {
                zzb.zzh(zzdrqVar.zzdF());
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcv)).booleanValue()) {
                com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzb;
                if (zzfkfVar.zzak && (keys = zzfkfVar.zzaj.keys()) != null) {
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        com.google.android.gms.internal.ads.zzdrq zzdrqVar2 = this.zzo;
                        java.lang.ref.WeakReference weakReference = zzdrqVar2 == null ? null : (java.lang.ref.WeakReference) zzdrqVar2.zzi().get(next);
                        this.zzz.put(next, false);
                        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null) {
                            com.google.android.gms.internal.ads.zzbes zzbesVar = new com.google.android.gms.internal.ads.zzbes(this.zzw, view);
                            this.zzA.add(zzbesVar);
                            zzbesVar.zza(new com.google.android.gms.internal.ads.zzdpd(this, next));
                        }
                    }
                }
            }
            if (zzdrqVar.zzg() != null) {
                zzdrqVar.zzg().zza(this.zzt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        this.zzf.zzb(zzdrqVar.zzdF(), zzdrqVar.zzi());
        if (zzdrqVar.zzdA() != null) {
            zzdrqVar.zzdA().setClickable(false);
            zzdrqVar.zzdA().removeAllViews();
        }
        if (zzdrqVar.zzg() != null) {
            zzdrqVar.zzg().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(android.view.View view, java.util.Map map, java.util.Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(android.view.View view, java.util.Map map, java.util.Map map2) {
        android.view.View zzag;
        if (!this.zzr && (zzag = zzag(map)) != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpd)).booleanValue()) {
                android.graphics.Rect rect = new android.graphics.Rect();
                if (zzag.getGlobalVisibleRect(rect, new android.graphics.Point()) && zzag.getHeight() == rect.height() && zzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpe)).booleanValue()) {
                com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzpf;
                if (((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).floatValue() > 0.0d) {
                    double floatValue = ((java.lang.Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).floatValue();
                    if (zzag.getGlobalVisibleRect(new android.graphics.Rect(), new android.graphics.Point())) {
                        if (r1.height() * r1.width() >= zzag.getHeight() * zzag.getWidth() * (floatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(zzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized android.view.View zzag(java.util.Map map) {
        if (map != null) {
            com.google.android.gms.internal.ads.zzgwm zzgwmVar = zzc;
            int size = zzgwmVar.size();
            int i = 0;
            while (i < size) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) map.get((java.lang.String) zzgwmVar.get(i));
                i++;
                if (weakReference != null) {
                    return (android.view.View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized android.widget.ImageView.ScaleType zzah() {
        com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzo;
        if (zzdrqVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        com.google.android.gms.dynamic.IObjectWrapper zzn = zzdrqVar.zzn();
        if (zzn != null) {
            return (android.widget.ImageView.ScaleType) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzn);
        }
        return com.google.android.gms.internal.ads.zzdqs.zza;
    }

    private final void zzai(java.lang.String str, boolean z) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgr)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        com.google.common.util.concurrent.ListenableFuture zzX = this.zze.zzX();
        if (zzX == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(zzX, new com.google.android.gms.internal.ads.zzdpe(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(android.view.View view, com.google.android.gms.internal.ads.zzeln zzelnVar) {
        com.google.android.gms.internal.ads.zzcku zzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzelnVar == null || zzW == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzelnVar.zza(), view);
    }

    public final synchronized void zzA(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzf.zzr(zzdgVar);
    }

    public final synchronized void zzB(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzf.zzs(zzdcVar);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzo;
        if (zzdrqVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdrqVar instanceof com.google.android.gms.internal.ads.zzdqm;
            this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzdpo.this.zzW(z);
                }
            });
        }
    }

    public final synchronized void zzE(final android.view.View view, final int i) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmY)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzo;
            if (zzdrqVar == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = zzdrqVar instanceof com.google.android.gms.internal.ads.zzdqm;
                this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzdpo.this.zzX(view, z, i);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final java.lang.String zzK() {
        return this.zzh.zzf();
    }

    public final com.google.android.gms.internal.ads.zzeln zzL(java.lang.String str, boolean z) {
        boolean z2;
        java.lang.String str2;
        com.google.android.gms.internal.ads.zzelj zzeljVar;
        com.google.android.gms.internal.ads.zzelk zzelkVar;
        com.google.android.gms.internal.ads.zzdpy zzdpyVar = this.zzh;
        if (zzdpyVar.zzd() && !android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
            com.google.android.gms.internal.ads.zzcku zzW = zzdptVar.zzW();
            com.google.android.gms.internal.ads.zzcku zzT = zzdptVar.zzT();
            if (zzW == null && zzT == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdpyVar.zzg();
            int zzc2 = zzdpyVar.zzg().zzc();
            int i2 = zzc2 - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    java.lang.String str3 = zzc2 != 1 ? zzc2 != 2 ? "UNKNOWN" : "DISPLAY" : com.facebook.share.internal.ShareConstants.VIDEO_URL;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(str3.length() + 49);
                    sb.append("Unknown omid media type: ");
                    sb.append(str3);
                    sb.append(". Not initializing Omid.");
                    java.lang.String sb2 = sb.toString();
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                    return null;
                }
                if (zzW == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was display but there was no display webview.");
                    return null;
                }
                z2 = false;
                z3 = true;
            } else if (zzT != null) {
                z2 = true;
            } else {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else if (z2) {
                str2 = "javascript";
                zzW = zzT;
            } else {
                zzW = null;
                str2 = null;
            }
            if (zzW == null) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzw)) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzv;
            int i8 = versionInfoParcel.buddyApkVersion;
            int i9 = versionInfoParcel.clientJarVersion;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(i8).length() + 1 + java.lang.String.valueOf(i9).length());
            sb3.append(i8);
            sb3.append(".");
            sb3.append(i9);
            java.lang.String sb4 = sb3.toString();
            if (z2) {
                zzeljVar = com.google.android.gms.internal.ads.zzelj.VIDEO;
                zzelkVar = com.google.android.gms.internal.ads.zzelk.DEFINED_BY_JAVASCRIPT;
            } else {
                zzeljVar = com.google.android.gms.internal.ads.zzelj.NATIVE_DISPLAY;
                zzelkVar = zzdptVar.zzx() == 3 ? com.google.android.gms.internal.ads.zzelk.UNSPECIFIED : com.google.android.gms.internal.ads.zzelk.ONE_PIXEL;
            }
            com.google.android.gms.internal.ads.zzeln zzd = com.google.android.gms.ads.internal.zzt.zzu().zzd(sb4, zzW.zzD(), "", "javascript", str2, str, zzelkVar, zzeljVar, this.zzb.zzal);
            if (zzd == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdptVar.zzq(zzd);
            zzW.zzak(zzd);
            if (z2) {
                com.google.android.gms.internal.ads.zzfuk zza = zzd.zza();
                if (zzT != null) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zza, zzT.zzE());
                }
                this.zzs = true;
            }
            if (z) {
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzd.zza());
                zzW.zze("onSdkLoaded", new androidx.collection.ArrayMap());
            }
            return zzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(android.view.View view) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgr)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
            if (zzdptVar.zzx() != 3) {
                com.google.android.gms.internal.ads.zzcfw zzY = zzdptVar.zzY();
                if (zzY == null) {
                    return;
                }
                com.google.android.gms.internal.ads.zzhbw.zzr(zzY, new com.google.android.gms.internal.ads.zzdpf(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(android.view.View view) {
        com.google.android.gms.internal.ads.zzeln zzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzZ == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzZ.zza(), view);
    }

    public final com.google.android.gms.internal.ads.zzdpq zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzy.zza(zzdqVar);
    }

    public final void zzR(android.os.Bundle bundle) {
        final com.google.android.gms.internal.ads.zzcku zzT = this.zze.zzT();
        if (zzT == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Video webview is null");
            return;
        }
        try {
            final org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzgwm zzgwmVar = com.google.android.gms.internal.ads.zzdpo.zzc;
                    com.google.android.gms.internal.ads.zzcku.this.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (org.json.JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error reading event signals", e);
        }
    }

    final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    final /* synthetic */ void zzW(boolean z) {
        com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzo;
        if (zzdrqVar != null) {
            this.zzf.zzf(null, zzdrqVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    final /* synthetic */ void zzX(android.view.View view, boolean z, int i) {
        com.google.android.gms.internal.ads.zzdrq zzdrqVar = this.zzo;
        if (zzdrqVar != null) {
            this.zzf.zzf(view, zzdrqVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z, zzah(), i);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdpt zzZ() {
        return this.zze;
    }

    public final synchronized void zza(java.lang.String str) {
        this.zzf.zzd(str);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdrq zzaa() {
        return this.zzo;
    }

    final /* synthetic */ java.util.Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(android.os.Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdpo.this.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(android.os.Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzz = this.zzf.zzz(bundle);
        this.zzq = zzz;
        return zzz;
    }

    public final synchronized void zzf(android.os.Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzct)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdph
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzdpo.this.zzU(zzdrqVar);
                }
            });
        } else {
            zzU(zzdrqVar);
        }
    }

    public final synchronized void zzh(final com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzct)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzdpo.this.zzV(zzdrqVar);
                }
            });
        } else {
            zzV(zzdrqVar);
        }
    }

    public final synchronized void zzi(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z) {
        com.google.android.gms.internal.ads.zzcku zzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z, zzah());
        if (this.zzs) {
            com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
            if (zzdptVar.zzT() != null && (zzT = zzdptVar.zzT()) != null) {
                zzT.zze("onSdkAdUserInteractionClick", new androidx.collection.ArrayMap());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final void zzj() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdpo.this.zzS();
            }
        };
        java.util.concurrent.Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final com.google.android.gms.internal.ads.zzdqb zzdqbVar = this.zzf;
            java.util.Objects.requireNonNull(zzdqbVar);
            executor.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdpn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzdqb.this.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    public final synchronized void zzu(android.view.View view, java.util.Map map, java.util.Map map2, boolean z) {
        if (this.zzq) {
            zzaf(view, map, map2);
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcv)).booleanValue() && this.zzb.zzak) {
            java.util.Map map3 = this.zzz;
            java.util.Iterator it = map3.keySet().iterator();
            while (it.hasNext()) {
                if (!((java.lang.Boolean) map3.get((java.lang.String) it.next())).booleanValue()) {
                    break;
                }
            }
        }
        if (z) {
            zzae(view, map, map2);
            zzaf(view, map, map2);
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeM)).booleanValue() && map != null) {
            java.util.Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it2.next()).getValue()).get();
                if (view2 != null && zzI(view2)) {
                    zzae(view, map, map2);
                    return;
                }
            }
        }
    }

    public final synchronized org.json.JSONObject zzv(android.view.View view, java.util.Map map, java.util.Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized org.json.JSONObject zzw(android.view.View view, java.util.Map map, java.util.Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(android.view.View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(com.google.android.gms.internal.ads.zzbns zzbnsVar) {
        this.zzf.zzp(zzbnsVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }

    final /* synthetic */ void zzS() {
        try {
            com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
            int zzx = zzdptVar.zzx();
            if (zzx == 1) {
                com.google.android.gms.internal.ads.zzbnc zza = this.zzi.zza();
                if (zza != null) {
                    zzai("Google", true);
                    zza.zze((com.google.android.gms.internal.ads.zzbms) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (zzx == 2) {
                com.google.android.gms.internal.ads.zzbmz zzb = this.zzi.zzb();
                if (zzb != null) {
                    zzai("Google", true);
                    zzb.zze((com.google.android.gms.internal.ads.zzbmq) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (zzx == 3) {
                com.google.android.gms.internal.ads.zzbni zzf = this.zzi.zzf(zzdptVar.zzS());
                if (zzf != null) {
                    if (zzdptVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzf.zze((com.google.android.gms.internal.ads.zzbmv) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (zzx == 6) {
                com.google.android.gms.internal.ads.zzbnp zzc2 = this.zzi.zzc();
                if (zzc2 != null) {
                    zzai("Google", true);
                    zzc2.zze((com.google.android.gms.internal.ads.zzbnv) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (zzx != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrong native template id!");
            } else {
                com.google.android.gms.internal.ads.zzbsk zze = this.zzi.zze();
                if (zze != null) {
                    zze.zze((com.google.android.gms.internal.ads.zzbse) this.zzm.zzb());
                }
            }
        } catch (android.os.RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}

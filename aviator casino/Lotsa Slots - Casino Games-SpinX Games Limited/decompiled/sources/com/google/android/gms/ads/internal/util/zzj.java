package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzj implements com.google.android.gms.ads.internal.util.zzg {
    private boolean zzb;
    private com.google.common.util.concurrent.ListenableFuture zzd;
    private android.content.SharedPreferences zzf;
    private android.content.SharedPreferences.Editor zzg;
    private java.lang.String zzi;
    private java.lang.String zzj;
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.List zzc = new java.util.ArrayList();
    private com.google.android.gms.internal.ads.zzbfq zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private java.lang.String zzl = com.ironsource.C2945a2.f;
    private int zzm = -1;
    private com.google.android.gms.internal.ads.zzcey zzn = new com.google.android.gms.internal.ads.zzcey("", 0);
    private long zzo = 0;
    private long zzp = 0;
    private int zzq = -1;
    private int zzr = 0;
    private java.util.Set zzs = java.util.Collections.emptySet();
    private org.json.JSONObject zzt = new org.json.JSONObject();
    private boolean zzu = true;
    private boolean zzv = true;
    private java.lang.String zzw = null;
    private java.lang.String zzx = "";
    private boolean zzy = false;
    private java.lang.String zzz = "";
    private java.lang.String zzA = "{}";
    private int zzB = -1;
    private int zzC = -1;
    private long zzD = 0;
    private boolean zzE = false;
    private int zzF = 0;
    private int zzG = 0;

    private final void zzX() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zzd;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException e) {
            java.lang.Thread.currentThread().interrupt();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted while waiting for preferences loaded.", e);
        } catch (java.util.concurrent.CancellationException e2) {
            e = e2;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (java.util.concurrent.ExecutionException e3) {
            e = e3;
            int i22 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (java.util.concurrent.TimeoutException e4) {
            e = e4;
            int i222 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzY() {
        com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zzj.this.zzV();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(java.lang.String str) {
        zzX();
        synchronized (this.zza) {
            this.zzl = str;
            if (this.zzg != null) {
                if (str.equals(com.ironsource.C2945a2.f)) {
                    this.zzg.remove("IABTCF_TCString");
                } else {
                    this.zzg.putString("IABTCF_TCString", str);
                }
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzB() {
        zzX();
        return this.zzl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(int i) {
        zzX();
        synchronized (this.zza) {
            this.zzm = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzD() {
        zzX();
        return this.zzm;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzC == i) {
                return;
            }
            this.zzC = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzF() {
        long j;
        zzX();
        synchronized (this.zza) {
            j = this.zzD;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(long j) {
        zzX();
        synchronized (this.zza) {
            if (this.zzD == j) {
                return;
            }
            this.zzD = j;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzH() {
        java.lang.String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzx.equals(str)) {
                    return;
                }
                this.zzx = str;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzJ() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzy;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzy == z) {
                    return;
                }
                this.zzy = z;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzL() {
        java.lang.String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzN() {
        java.lang.String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzO(java.lang.String str) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkR)).booleanValue()) {
            zzX();
            synchronized (this.zza) {
                if (this.zzA.equals(str)) {
                    return;
                }
                this.zzA = str;
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_ui_storage", str);
                    this.zzg.apply();
                }
                zzY();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzE;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzQ(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (this.zzE) {
                return;
            }
            this.zzE = true;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_install_referrer_reported", true);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzR() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzF;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzS(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzF == i) {
                return;
            }
            this.zzF = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("total_inflight_ad_limit", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzT() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzG;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzU(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzG == i) {
                return;
            }
            this.zzG = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("default_queue_capacity", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    public final com.google.android.gms.internal.ads.zzbfq zzV() {
        if (!this.zzb) {
            return null;
        }
        if ((zzc() && zze()) || !((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkh.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (android.os.Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new com.google.android.gms.internal.ads.zzbfq();
            }
            this.zze.zza();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("start fetching content...");
            return this.zze;
        }
    }

    final /* synthetic */ void zzW(android.content.Context context, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB, 0);
        android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (this.zza) {
                this.zzf = sharedPreferences;
                this.zzg = edit;
                android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                this.zzu = this.zzf.getBoolean("content_url_opted_out", this.zzu);
                this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                this.zzv = this.zzf.getBoolean("content_vertical_opted_out", this.zzv);
                this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                this.zzr = this.zzf.getInt("version_code", this.zzr);
                if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzba.zzc().zzc()) {
                    this.zzn = new com.google.android.gms.internal.ads.zzcey("", 0L);
                } else {
                    this.zzn = new com.google.android.gms.internal.ads.zzcey(this.zzf.getString("app_settings_json", this.zzn.zzd()), this.zzf.getLong("app_settings_last_update_ms", this.zzn.zzb()));
                }
                this.zzo = this.zzf.getLong("app_last_background_time_ms", this.zzo);
                this.zzq = this.zzf.getInt("request_in_session_count", this.zzq);
                this.zzp = this.zzf.getLong("first_ad_req_time_ms", this.zzp);
                this.zzs = this.zzf.getStringSet("never_pool_slots", this.zzs);
                this.zzw = this.zzf.getString("display_cutout", this.zzw);
                this.zzB = this.zzf.getInt("app_measurement_npa", this.zzB);
                this.zzC = this.zzf.getInt("sd_app_measure_npa", this.zzC);
                this.zzD = this.zzf.getLong("sd_app_measure_npa_ts", this.zzD);
                this.zzx = this.zzf.getString("inspector_info", this.zzx);
                this.zzy = this.zzf.getBoolean("linked_device", this.zzy);
                this.zzz = this.zzf.getString("linked_ad_unit", this.zzz);
                this.zzA = this.zzf.getString("inspector_ui_storage", this.zzA);
                this.zzl = this.zzf.getString("IABTCF_TCString", this.zzl);
                this.zzm = this.zzf.getInt("gad_has_consent_for_cookies", this.zzm);
                this.zzE = this.zzf.getBoolean("is_install_referrer_reported", this.zzE);
                this.zzF = this.zzf.getInt("total_inflight_ad_limit", this.zzF);
                this.zzG = this.zzf.getInt("default_queue_capacity", this.zzG);
                try {
                    this.zzt = new org.json.JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
                } catch (org.json.JSONException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not convert native advanced settings to json object", e);
                }
                zzY();
            }
        } catch (java.lang.Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            com.google.android.gms.ads.internal.util.zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zza(final android.content.Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zza;
            final java.lang.String str = com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB;
            this.zzd = zzhcgVar.zza(new java.lang.Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                private final /* synthetic */ android.content.Context zzb;
                private final /* synthetic */ java.lang.String zzc = com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB;

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.util.zzj.this.zzW(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzb(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (this.zzu == z) {
                return;
            }
            this.zzu = z;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzc() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzd(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (this.zzv == z) {
                return;
            }
            this.zzv = z;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zze() {
        boolean z;
        zzX();
        synchronized (this.zza) {
            z = this.zzv;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzf(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzr == i) {
                return;
            }
            this.zzr = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzg() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzr;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzh(java.lang.String str) {
        zzX();
        synchronized (this.zza) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (str != null && !str.equals(this.zzn.zzd())) {
                this.zzn = new com.google.android.gms.internal.ads.zzcey(str, currentTimeMillis);
                android.content.SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzg.apply();
                }
                zzY();
                java.util.Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
                return;
            }
            this.zzn.zza(currentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final com.google.android.gms.internal.ads.zzcey zzi() {
        com.google.android.gms.internal.ads.zzcey zzceyVar;
        zzX();
        synchronized (this.zza) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznf)).booleanValue() && this.zzn.zzj()) {
                java.util.Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((java.lang.Runnable) it.next()).run();
                }
            }
            zzceyVar = this.zzn;
        }
        return zzceyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final com.google.android.gms.internal.ads.zzcey zzj() {
        com.google.android.gms.internal.ads.zzcey zzceyVar;
        synchronized (this.zza) {
            zzceyVar = this.zzn;
        }
        return zzceyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzk(java.lang.Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzl(long j) {
        zzX();
        synchronized (this.zza) {
            if (this.zzo == j) {
                return;
            }
            this.zzo = j;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzm() {
        long j;
        zzX();
        synchronized (this.zza) {
            j = this.zzo;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzn(int i) {
        zzX();
        synchronized (this.zza) {
            if (this.zzq == i) {
                return;
            }
            this.zzq = i;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzo() {
        int i;
        zzX();
        synchronized (this.zza) {
            i = this.zzq;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(long j) {
        zzX();
        synchronized (this.zza) {
            if (this.zzp == j) {
                return;
            }
            this.zzp = j;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzq() {
        long j;
        zzX();
        synchronized (this.zza) {
            j = this.zzp;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(java.lang.String str, java.lang.String str2, boolean z) {
        zzX();
        synchronized (this.zza) {
            org.json.JSONArray optJSONArray = this.zzt.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i;
                    }
                }
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzt.put(str, optJSONArray);
            } catch (org.json.JSONException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not update native advanced settings", e);
            }
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzt.toString());
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final org.json.JSONObject zzs() {
        org.json.JSONObject jSONObject;
        zzX();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() {
        zzX();
        synchronized (this.zza) {
            this.zzt = new org.json.JSONObject();
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final java.lang.String zzu() {
        java.lang.String str;
        zzX();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(java.lang.String str) {
        zzX();
        synchronized (this.zza) {
            if (android.text.TextUtils.equals(this.zzw, str)) {
                return;
            }
            this.zzw = str;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(boolean z) {
        zzX();
        synchronized (this.zza) {
            if (z == this.zzk) {
                return;
            }
            this.zzk = z;
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzx() {
        boolean z;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzbh)).booleanValue()) {
            return false;
        }
        zzX();
        synchronized (this.zza) {
            z = this.zzk;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(boolean z) {
        zzX();
        synchronized (this.zza) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() + ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlS)).longValue();
            android.content.SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z);
                this.zzg.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.zzg.apply();
            }
            zzY();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzz() {
        zzX();
        synchronized (this.zza) {
            android.content.SharedPreferences sharedPreferences = this.zzf;
            boolean z = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < java.lang.System.currentTimeMillis()) {
                return false;
            }
            if (this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                z = true;
            }
            return z;
        }
    }
}

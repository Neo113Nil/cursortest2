package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzecr implements com.google.android.gms.internal.ads.zzedt, com.google.android.gms.internal.ads.zzecc {
    private final com.google.android.gms.internal.ads.zzedc zza;
    private final com.google.android.gms.internal.ads.zzedu zzb;
    private final com.google.android.gms.internal.ads.zzecd zzc;
    private final com.google.android.gms.internal.ads.zzecm zzd;
    private final com.google.android.gms.internal.ads.zzecb zze;
    private final com.google.android.gms.internal.ads.zzedo zzf;
    private final com.google.android.gms.internal.ads.zzecy zzg;
    private final com.google.android.gms.internal.ads.zzecy zzh;
    private final java.lang.String zzi;
    private final android.content.Context zzj;

    @javax.annotation.Nullable
    private final java.lang.String zzk;
    private org.json.JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final java.util.Map zzl = new java.util.HashMap();
    private final java.util.Map zzm = new java.util.HashMap();
    private final java.util.Map zzn = new java.util.HashMap();
    private java.lang.String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private com.google.android.gms.internal.ads.zzecn zzr = com.google.android.gms.internal.ads.zzecn.NONE;
    private com.google.android.gms.internal.ads.zzecq zzv = com.google.android.gms.internal.ads.zzecq.UNKNOWN;
    private long zzw = 0;
    private java.lang.String zzx = "";

    zzecr(com.google.android.gms.internal.ads.zzedc zzedcVar, com.google.android.gms.internal.ads.zzedu zzeduVar, com.google.android.gms.internal.ads.zzecd zzecdVar, android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzecm zzecmVar, com.google.android.gms.internal.ads.zzedo zzedoVar, com.google.android.gms.internal.ads.zzecy zzecyVar, com.google.android.gms.internal.ads.zzecy zzecyVar2, @javax.annotation.Nullable java.lang.String str) {
        this.zza = zzedcVar;
        this.zzb = zzeduVar;
        this.zzc = zzecdVar;
        this.zze = new com.google.android.gms.internal.ads.zzecb(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzecmVar;
        this.zzf = zzedoVar;
        this.zzg = zzecyVar;
        this.zzh = zzecyVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzt.zzo().zza(this);
    }

    private final synchronized void zzA(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            zzt(jSONObject.optBoolean("isTestMode", false), false);
            zzu((com.google.android.gms.internal.ads.zzecn) java.lang.Enum.valueOf(com.google.android.gms.internal.ads.zzecn.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (org.json.JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:15:0x0026, B:17:0x0035, B:21:0x002a, B:23:0x0030), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzt(boolean z, boolean z2) {
        if (this.zzs != z) {
            this.zzs = z;
            if (z) {
                if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzo().zzk()) {
                    zzx();
                    if (z2) {
                        zzz();
                        return;
                    }
                }
            }
            if (!zzs()) {
                zzy();
            }
            if (z2) {
            }
        }
    }

    private final synchronized void zzu(com.google.android.gms.internal.ads.zzecn zzecnVar, boolean z) {
        if (this.zzr != zzecnVar) {
            if (zzs()) {
                zzy();
            }
            this.zzr = zzecnVar;
            if (zzs()) {
                zzx();
            }
            if (z) {
                zzz();
            }
        }
    }

    private final synchronized org.json.JSONObject zzv() throws org.json.JSONException {
        org.json.JSONObject jSONObject;
        jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry entry : this.zzl.entrySet()) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (com.google.android.gms.internal.ads.zzecf zzecfVar : (java.util.List) entry.getValue()) {
                if (zzecfVar.zzc()) {
                    jSONArray.put(zzecfVar.zzg());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((java.lang.String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzw() {
        this.zzu = true;
        this.zzd.zza();
        this.zza.zzl(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        this.zzf.zzb(this);
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzkS;
        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar))) {
            this.zzg.zza(android.preference.PreferenceManager.getDefaultSharedPreferences(this.zzj), java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).split(",")));
        }
        com.google.android.gms.internal.ads.zzbih zzbihVar2 = com.google.android.gms.internal.ads.zzbiq.zzkT;
        if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2))) {
            this.zzh.zza(this.zzj.getSharedPreferences(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB, 0), java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzH());
        this.zzx = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzN();
    }

    private final synchronized void zzx() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final void zzz() {
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzI(zzh());
    }

    public final void zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
                zzw();
                return;
            }
            java.lang.String zzH = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzH();
            if (android.text.TextUtils.isEmpty(zzH)) {
                return;
            }
            try {
                if (new org.json.JSONObject(zzH).optBoolean("isTestMode", false)) {
                    zzw();
                }
            } catch (org.json.JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(boolean z) {
        if (!this.zzu) {
            if (z) {
                zzw();
                if (!this.zzs) {
                    zzx();
                    return;
                }
            }
            if (zzs()) {
                return;
            }
            zzy();
        }
    }

    public final void zzc(boolean z) {
        if (!this.zzu && z) {
            zzw();
        }
        zzt(z, true);
    }

    public final synchronized boolean zzd() {
        return this.zzs;
    }

    public final void zze(com.google.android.gms.internal.ads.zzecn zzecnVar) {
        zzu(zzecnVar, true);
    }

    public final com.google.android.gms.internal.ads.zzecn zzf() {
        return this.zzr;
    }

    public final synchronized java.lang.String zzg() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && zzs()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized java.lang.String zzh() {
        org.json.JSONObject jSONObject;
        jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(java.lang.String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzz();
    }

    public final synchronized void zzj(java.lang.String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzO(this.zzx);
    }

    public final synchronized void zzk(java.lang.String str, com.google.android.gms.internal.ads.zzecf zzecfVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue() && zzs()) {
            if (this.zzt >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkq)).intValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            java.util.Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new java.util.ArrayList());
            }
            this.zzt++;
            ((java.util.List) map.get(str)).add(zzecfVar);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkM)).booleanValue()) {
                java.lang.String zzd = zzecfVar.zzd();
                this.zzm.put(zzd, zzecfVar);
                java.util.Map map2 = this.zzn;
                if (map2.containsKey(zzd)) {
                    java.util.List list = (java.util.List) map2.get(zzd);
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.zzcfw) it.next()).zzc(zzecfVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void zzl(long j) {
        this.zzw += j;
    }

    public final boolean zzm() {
        return this.zzw < ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkJ)).longValue();
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzn(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar;
        zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        java.util.Map map = this.zzm;
        if (map.containsKey(str)) {
            zzcfwVar.zzc((com.google.android.gms.internal.ads.zzecf) map.get(str));
        } else {
            java.util.Map map2 = this.zzn;
            if (!map2.containsKey(str)) {
                map2.put(str, new java.util.ArrayList());
            }
            ((java.util.List) map2.get(str)).add(zzcfwVar);
        }
        return zzcfwVar;
    }

    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzdk zzdkVar, com.google.android.gms.internal.ads.zzecq zzecqVar) {
        if (!zzs()) {
            try {
                zzdkVar.zze(com.google.android.gms.internal.ads.zzfma.zzd(18, null, null));
                return;
            } catch (android.os.RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzko)).booleanValue()) {
            this.zzv = zzecqVar;
            this.zza.zzm(zzdkVar, new com.google.android.gms.internal.ads.zzbql(this), new com.google.android.gms.internal.ads.zzbqe(this.zzf), new com.google.android.gms.internal.ads.zzbpr(this));
            return;
        } else {
            try {
                zzdkVar.zze(com.google.android.gms.internal.ads.zzfma.zzd(1, null, null));
                return;
            } catch (android.os.RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzp(org.json.JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final boolean zzq() {
        return this.zzp != null;
    }

    public final synchronized org.json.JSONObject zzr() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.ironsource.M6.H, com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
            java.lang.String str = this.zzk;
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12);
                sb.append("afma-sdk-a-v");
                sb.append(str);
                jSONObject.put("sdkVersion", sb.toString());
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", android.os.Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zzb());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkP)).booleanValue()) {
                java.lang.String zzu = com.google.android.gms.ads.internal.zzt.zzh().zzu();
                if (!android.text.TextUtils.isEmpty(zzu)) {
                    jSONObject.put(com.ironsource.M6.L, zzu);
                }
            }
            if (this.zzq < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                this.zzo = "{}";
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzv());
            jSONObject.put("appInfo", this.zze.zza());
            java.lang.String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
            if (!android.text.TextUtils.isEmpty(zzd)) {
                jSONObject.put("cld", new org.json.JSONObject(zzd));
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkE)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                java.lang.String obj = jSONObject2.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(obj.length() + 13);
                sb2.append("Server data: ");
                sb2.append(obj);
                java.lang.String sb3 = sb2.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb3);
                jSONObject.put(com.ironsource.C3232q2.s, this.zzp);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzt.zzo().zzk());
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.client.zzay.zza();
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzy());
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkR)).booleanValue()) {
                jSONObject.put("uiStorage", new org.json.JSONObject(this.zzx));
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkT))) {
                jSONObject.put("gmaDisk", this.zzh.zzb());
            }
            if (!android.text.TextUtils.isEmpty((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkS))) {
                jSONObject.put("userDisk", this.zzg.zzb());
            }
        } catch (org.json.JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "Inspector.toJson");
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized boolean zzs() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzt.zzo().zzk();
        }
        return this.zzs;
    }
}

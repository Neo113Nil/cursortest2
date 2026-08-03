package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbjv {
    private final java.util.concurrent.ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzc;
    private final com.google.android.gms.internal.ads.zzdzq zzd;
    private java.lang.Runnable zze;
    private com.google.android.gms.internal.ads.zzbjs zzf;
    private androidx.browser.customtabs.CustomTabsSession zzg;
    private java.lang.String zzh;
    private long zzi = 0;
    private long zzj;
    private org.json.JSONArray zzk;
    private android.content.Context zzl;

    public zzbjv(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, com.google.android.gms.internal.ads.zzdzq zzdzqVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzjVar;
        this.zzc = zzaVar;
        this.zzd = zzdzqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlm)).booleanValue() != false) goto L23;
     */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        com.google.android.gms.internal.ads.zzbjs zzbjsVar = this.zzf;
        if (zzbjsVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (zzbjsVar.zza().booleanValue()) {
            return;
        }
        if (this.zzh != null && this.zzg != null && (scheduledExecutorService = this.zza) != null) {
            if (this.zzi == 0 || com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() > this.zzi) {
            }
            this.zzg.requestPostMessageChannel(android.net.Uri.parse(this.zzh));
            scheduledExecutorService.schedule(this.zze, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzln)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("PACT max retry connection duration timed out");
    }

    private final void zzk(org.json.JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new org.json.JSONArray((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlp));
            }
            jSONObject.put("eids", this.zzk);
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @javax.annotation.Nullable
    public final androidx.browser.customtabs.CustomTabsSession zzb() {
        return this.zzg;
    }

    final void zzc() {
        this.zzi = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzll)).intValue();
        if (this.zze == null) {
            this.zze = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbju
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzbjv.this.zzh();
                }
            };
        }
        zzh();
    }

    final void zzd(java.lang.String str) {
        try {
            androidx.browser.customtabs.CustomTabsSession customTabsSession = this.zzg;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new java.util.Date(this.zzj).toString());
            zzk(jSONObject);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zzb());
            }
            customTabsSession.postMessage(jSONObject.toString(), null);
            com.google.android.gms.internal.ads.zzbjt zzbjtVar = new com.google.android.gms.internal.ads.zzbjt(this, str);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue()) {
                this.zzb.zzb(this.zzg, zzbjtVar);
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            com.google.android.gms.ads.query.QueryInfo.generate(this.zzl, com.google.android.gms.ads.AdFormat.BANNER, new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build(), zzbjtVar);
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating JSON: ", e);
        }
    }

    final org.json.JSONObject zze(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    final org.json.JSONObject zzf(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zzb());
        }
        return jSONObject;
    }

    public final void zzg(long j) {
        this.zzj = j;
    }

    final /* synthetic */ androidx.browser.customtabs.CustomTabsSession zzi() {
        return this.zzg;
    }

    public final void zza(@javax.annotation.Nonnull android.content.Context context, @javax.annotation.Nonnull androidx.browser.customtabs.CustomTabsClient customTabsClient, @javax.annotation.Nonnull java.lang.String str, @javax.annotation.Nullable androidx.browser.customtabs.CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("App Context parameter is null");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new java.lang.IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        com.google.android.gms.internal.ads.zzdzq zzdzqVar = this.zzd;
        com.google.android.gms.internal.ads.zzbjs zzbjsVar = new com.google.android.gms.internal.ads.zzbjs(this, customTabsCallback, zzdzqVar);
        this.zzf = zzbjsVar;
        androidx.browser.customtabs.CustomTabsSession newSession = customTabsClient.newSession(zzbjsVar);
        this.zzg = newSession;
        if (newSession == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(zzdzqVar, null, "pact_action", new android.util.Pair("pe", "pact_init"));
    }
}

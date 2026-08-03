package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzdon implements com.google.android.gms.internal.ads.zzdqb {
    private com.google.android.gms.ads.internal.client.zzdc zzC;
    private final com.google.android.gms.internal.ads.zzdfg zzD;
    private final com.google.android.gms.internal.ads.zzdqu zzE;
    private final com.google.android.gms.ads.internal.zzb zzF;
    private final com.google.android.gms.internal.ads.zzdbn zzG;
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdqd zzb;
    private final org.json.JSONObject zzc;
    private final com.google.android.gms.internal.ads.zzdux zzd;
    private final com.google.android.gms.internal.ads.zzdpt zze;
    private final com.google.android.gms.internal.ads.zzbap zzf;
    private final com.google.android.gms.internal.ads.zzddj zzg;
    private final com.google.android.gms.internal.ads.zzdcp zzh;
    private final com.google.android.gms.internal.ads.zzdkw zzi;
    private final com.google.android.gms.internal.ads.zzfkf zzj;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzk;
    private final com.google.android.gms.internal.ads.zzfky zzl;
    private final com.google.android.gms.internal.ads.zzcug zzm;
    private final com.google.android.gms.internal.ads.zzdqy zzn;
    private final com.google.android.gms.common.util.Clock zzo;
    private final com.google.android.gms.internal.ads.zzdks zzp;
    private final com.google.android.gms.internal.ads.zzfsc zzq;
    private final com.google.android.gms.internal.ads.zzdwn zzr;
    private final com.google.android.gms.internal.ads.zzfqg zzs;
    private final com.google.android.gms.internal.ads.zzekr zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private android.graphics.Point zzy = new android.graphics.Point();
    private android.graphics.Point zzz = new android.graphics.Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdon(android.content.Context context, com.google.android.gms.internal.ads.zzdqd zzdqdVar, org.json.JSONObject jSONObject, com.google.android.gms.internal.ads.zzdux zzduxVar, com.google.android.gms.internal.ads.zzdpt zzdptVar, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzddj zzddjVar, com.google.android.gms.internal.ads.zzdcp zzdcpVar, com.google.android.gms.internal.ads.zzdkw zzdkwVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzcug zzcugVar, com.google.android.gms.internal.ads.zzdqy zzdqyVar, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzdks zzdksVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzekr zzekrVar, com.google.android.gms.internal.ads.zzdwn zzdwnVar, com.google.android.gms.internal.ads.zzdqu zzdquVar, com.google.android.gms.internal.ads.zzdfg zzdfgVar, com.google.android.gms.ads.internal.zzb zzbVar, com.google.android.gms.internal.ads.zzcdn zzcdnVar, com.google.android.gms.internal.ads.zzdbn zzdbnVar) {
        this.zza = context;
        this.zzb = zzdqdVar;
        this.zzc = jSONObject;
        this.zzd = zzduxVar;
        this.zze = zzdptVar;
        this.zzf = zzbapVar;
        this.zzg = zzddjVar;
        this.zzh = zzdcpVar;
        this.zzi = zzdkwVar;
        this.zzj = zzfkfVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfkyVar;
        this.zzm = zzcugVar;
        this.zzn = zzdqyVar;
        this.zzo = clock;
        this.zzp = zzdksVar;
        this.zzq = zzfscVar;
        this.zzs = zzfqgVar;
        this.zzt = zzekrVar;
        this.zzr = zzdwnVar;
        this.zzE = zzdquVar;
        this.zzD = zzdfgVar;
        this.zzF = zzbVar;
        this.zzG = zzdbnVar;
    }

    private final boolean zzG(java.lang.String str) {
        org.json.JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final java.lang.String zzH(android.view.View view, java.util.Map map) {
        if (map != null && view != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (view.equals((android.view.View) ((java.lang.ref.WeakReference) entry.getValue()).get())) {
                    return (java.lang.String) entry.getKey();
                }
            }
        }
        int zzx = this.zze.zzx();
        if (zzx == 1) {
            return "1099";
        }
        if (zzx == 2) {
            return "2099";
        }
        if (zzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpg)).booleanValue() || (zzbVar = this.zzF) == null) {
            return;
        }
        zzbVar.zza();
    }

    private final boolean zzK(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, java.lang.String str, org.json.JSONObject jSONObject5, boolean z, android.view.View view) {
        com.google.android.gms.internal.ads.zzdbn zzdbnVar;
        try {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzet)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(this.zza));
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpi)).booleanValue() && (zzdbnVar = this.zzG) != null && zzdbnVar.zza() > 0) {
                jSONObject6.put(com.google.ads.mediation.facebook.FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, zzdbnVar.zza());
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjS)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new com.google.android.gms.internal.ads.zzdok(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new com.google.android.gms.internal.ads.zzdoj(this, null));
            }
            com.google.android.gms.internal.ads.zzdux zzduxVar = this.zzd;
            zzduxVar.zzd("/nativeImpression", new com.google.android.gms.internal.ads.zzdol(this, view, null));
            zzduxVar.zzd("/nativeImpressionFlowControl", new com.google.android.gms.internal.ads.zzdom(this, this.zzq, this.zzj.zzax, this.zzs, null));
            com.google.android.gms.internal.ads.zzcfu.zza(zzduxVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", com.google.android.gms.internal.ads.zzcfr.zzh);
            if (this.zzu) {
                return true;
            }
            this.zzu = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zza, this.zzk.afmaVersion, this.zzj.zzC.toString(), this.zzl.zzg);
            return true;
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final java.lang.String zzL(android.view.View view) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzet)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (java.lang.Exception unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzA() {
        this.zzd.zzb();
    }

    final /* synthetic */ void zzB(android.view.View view) {
        this.zzE.zza(view, this.zzj);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzddj zzC() {
        return this.zzg;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdcp zzD() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdkw zzE() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdfg zzF() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zza(android.view.View view, java.util.Map map, java.util.Map map2, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener) {
        this.zzy = new android.graphics.Point();
        this.zzz = new android.graphics.Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean zza = com.google.android.gms.ads.internal.util.zzbs.zza(this.zzk.clientJarVersion);
        if (map != null) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            java.util.Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                android.view.View view3 = (android.view.View) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzb(android.view.View view, java.util.Map map) {
        this.zzy = new android.graphics.Point();
        this.zzz = new android.graphics.Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzc(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.zza;
        org.json.JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        org.json.JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        org.json.JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        org.json.JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        java.lang.String zzH = zzH(view, map);
        zzi(true == ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeA)).booleanValue() ? view2 : view, zzb, zze, zzc, zzd, zzH, com.google.android.gms.ads.internal.util.zzbs.zzf(zzH, context, this.zzz, this.zzy), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzd(java.lang.String str) {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zze(android.os.Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Click data is null. No click is reported.");
        } else if (zzG("click_reporting")) {
            android.os.Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, false);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzf(android.view.View view, android.view.View view2, java.util.Map map, java.util.Map map2, boolean z, android.widget.ImageView.ScaleType scaleType, int i) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2 = this.zzc;
        boolean z2 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmY)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        android.content.Context context = this.zza;
        org.json.JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        org.json.JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        org.json.JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        org.json.JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        java.lang.String zzH = zzH(view, map);
        org.json.JSONObject zzf = com.google.android.gms.ads.internal.util.zzbs.zzf(zzH, context, this.zzz, this.zzy);
        if (z2) {
            try {
                android.graphics.Point point = this.zzz;
                android.graphics.Point point2 = this.zzy;
                try {
                    jSONObject = new org.json.JSONObject();
                } catch (java.lang.Exception e) {
                    e = e;
                    jSONObject = null;
                }
                try {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i);
                } catch (java.lang.Exception e2) {
                    e = e2;
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzi(view2, zzb, zze, zzc, zzd, zzH, zzf, null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (org.json.JSONException e3) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, zzb, zze, zzc, zzd, zzH, zzf, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final boolean zzh() {
        return zzI();
    }

    protected final void zzi(android.view.View view, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, org.json.JSONObject jSONObject4, java.lang.String str, org.json.JSONObject jSONObject5, org.json.JSONObject jSONObject6, boolean z, boolean z2) {
        java.lang.String str2;
        try {
            zzJ();
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            org.json.JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            com.google.android.gms.internal.ads.zzdqd zzdqdVar = this.zzb;
            com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdqdVar.zzg(zzdptVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            org.json.JSONObject jSONObject9 = new org.json.JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdptVar.zzx());
            jSONObject9.put("view_aware_api_used", z);
            com.google.android.gms.internal.ads.zzblt zzbltVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbltVar != null && zzbltVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdptVar.zzE().isEmpty() || zzdptVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put(com.ironsource.C4.a.d, this.zzo.currentTimeMillis());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdqdVar.zzg(zzdptVar.zzS()) != null);
            try {
                org.json.JSONObject optJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
                str2 = this.zzf.zzb().zzg(this.zza, optJSONObject.optString("click_string"), view);
            } catch (java.lang.Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjW)).booleanValue() && com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjX)).booleanValue() && com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(com.ironsource.Y3.d, jSONObject9);
            org.json.JSONObject jSONObject10 = new org.json.JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", currentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                org.json.JSONObject jSONObject11 = (org.json.JSONObject) this.zzc.get("tracking_urls_and_actions");
                java.lang.String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzc(string, this.zze);
                }
            }
            com.google.android.gms.internal.ads.zzcfu.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick", com.google.android.gms.internal.ads.zzcfr.zzh);
        } catch (org.json.JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzj(android.view.View view, android.view.MotionEvent motionEvent, android.view.View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = currentTimeMillis;
            this.zzz = this.zzy;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
        obtain.setLocation(this.zzy.x, this.zzy.y);
        this.zzf.zzc(obtain);
        obtain.recycle();
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzk(android.os.Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final org.json.JSONObject zzl(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.zza;
        org.json.JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        org.json.JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        org.json.JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        org.json.JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("asset_view_signal", zze);
            jSONObject.put("ad_view_signal", zzb);
            jSONObject.put("scroll_view_signal", zzc);
            jSONObject.put("lock_screen_signal", zzd);
            return jSONObject;
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final org.json.JSONObject zzm(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        org.json.JSONObject zzl = zzl(view, map, map2, scaleType);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zzl != null) {
                jSONObject.put("nas", zzl);
            }
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzn() {
        zzK(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzo(android.view.View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        com.google.android.gms.internal.ads.zzdqy zzdqyVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdqyVar);
        view.setClickable(true);
        zzdqyVar.zzc = new java.lang.ref.WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzp(com.google.android.gms.internal.ads.zzbns zzbnsVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzbnsVar);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzr(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdgVar == null) {
                com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
                if (zzdptVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdptVar.zzF().zzf(), this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(zzdgVar.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzs(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzC = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzt() {
        try {
            com.google.android.gms.ads.internal.client.zzdc zzdcVar = this.zzC;
            if (zzdcVar != null) {
                zzdcVar.zze();
            }
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final int zzu() {
        com.google.android.gms.internal.ads.zzblt zzbltVar = this.zzl.zzj;
        if (zzbltVar == null) {
            return 0;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmY)).booleanValue()) {
            return zzbltVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmY)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzw(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.zza;
        zzK(com.google.android.gms.ads.internal.util.zzbs.zzb(context, view), com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.zzc(view), com.google.android.gms.ads.internal.util.zzbs.zzd(context, view), zzL(view), null, com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzx(android.view.View view, java.util.Map map, java.util.Map map2, android.widget.ImageView.ScaleType scaleType) {
        android.content.Context context = this.zza;
        org.json.JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        org.json.JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        org.json.JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        org.json.JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", zze);
            jSONObject.put("ad_view_signal", zzb);
            jSONObject.put("scroll_view_signal", zzc);
            jSONObject.put("lock_screen_signal", zzd);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzet)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", zzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            com.google.android.gms.internal.ads.zzcfu.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", com.google.android.gms.internal.ads.zzcfr.zzh);
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad signals logging JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final void zzy() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ad", this.zzc);
            com.google.android.gms.internal.ads.zzcfu.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", com.google.android.gms.internal.ads.zzcfr.zzh);
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqb
    public final boolean zzz(android.os.Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzK(null, null, null, null, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmR)).booleanValue() ? zzL(null) : null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }
}

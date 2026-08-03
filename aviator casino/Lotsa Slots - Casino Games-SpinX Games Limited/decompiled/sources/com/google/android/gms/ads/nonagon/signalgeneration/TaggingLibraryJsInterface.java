package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class TaggingLibraryJsInterface {
    private final android.content.Context zza;
    private final android.webkit.WebView zzb;
    private final com.google.android.gms.internal.ads.zzbap zzc;
    private final com.google.android.gms.internal.ads.zzflc zzd;
    private final int zze;
    private final com.google.android.gms.internal.ads.zzdzq zzf;
    private final boolean zzg;
    private final com.google.android.gms.internal.ads.zzhcg zzh = com.google.android.gms.internal.ads.zzcfr.zzf;
    private final com.google.android.gms.internal.ads.zzfsc zzi;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zzj;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zza zzk;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zze zzl;

    TaggingLibraryJsInterface(android.webkit.WebView webView, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.internal.ads.zzdzq zzdzqVar, com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzflc zzflcVar, com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, com.google.android.gms.ads.nonagon.signalgeneration.zza zzaVar, com.google.android.gms.ads.nonagon.signalgeneration.zze zzeVar) {
        this.zzb = webView;
        android.content.Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzbapVar;
        this.zzf = zzdzqVar;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        this.zze = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkY)).intValue();
        this.zzg = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkZ)).booleanValue();
        this.zzi = zzfscVar;
        this.zzd = zzflcVar;
        this.zzj = zzjVar;
        this.zzk = zzaVar;
        this.zzl = zzeVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignals(java.lang.String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            java.lang.String zzg = this.zzc.zzb().zzg(this.zza, str, this.zzb);
            if (this.zzg) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.zzf, null, "csg", new android.util.Pair("clat", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - currentTimeMillis)));
            }
            return zzg;
        } catch (java.lang.RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    public java.lang.String getClickSignalsWithTimeout(final java.lang.String str, int i) {
        if (i <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 51);
            sb.append("Invalid timeout for getting click signals. Timeout=");
            sb.append(i);
            java.lang.String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
            return "";
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.zzcfr.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(java.lang.Math.min(i, this.zze), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof java.util.concurrent.TimeoutException ? "17" : "";
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        final android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final com.google.android.gms.ads.nonagon.signalgeneration.zzbf zzbfVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzbf(this, uuid);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue()) {
            this.zzj.zzb(this.zzb, zzbfVar);
        } else {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlb)).booleanValue()) {
                this.zzh.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.this.zza(bundle, zzbfVar);
                    }
                });
            } else {
                com.google.android.gms.ads.query.QueryInfo.generate(this.zza, com.google.android.gms.ads.AdFormat.BANNER, new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build(), zzbfVar);
            }
        }
        return uuid;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            java.lang.String zzj = this.zzc.zzb().zzj(this.zza, this.zzb, null);
            if (this.zzg) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.zzf, null, "vsg", new android.util.Pair("vlat", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - currentTimeMillis)));
            }
            return zzj;
        } catch (java.lang.RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    public java.lang.String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 50);
            sb.append("Invalid timeout for getting view signals. Timeout=");
            sb.append(i);
            java.lang.String sb2 = sb.toString();
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
            return "";
        }
        try {
            return (java.lang.String) com.google.android.gms.internal.ads.zzcfr.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(java.lang.Math.min(i, this.zze), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof java.util.concurrent.TimeoutException ? "17" : "";
        }
    }

    @android.webkit.JavascriptInterface
    public void recordClick(final java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzld)).booleanValue() || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface.this.zzb(str);
            }
        });
    }

    @android.webkit.JavascriptInterface
    public void reportTouchEvent(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt("type");
            try {
                this.zzc.zzc(android.view.MotionEvent.obtain(0L, i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (java.lang.RuntimeException e) {
                e = e;
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (org.json.JSONException e2) {
                e = e2;
                int i52 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (java.lang.RuntimeException | org.json.JSONException e3) {
            e = e3;
        }
    }

    final /* synthetic */ void zza(android.os.Bundle bundle, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzz zzf = com.google.android.gms.ads.internal.zzt.zzf();
        android.content.Context context = this.zza;
        android.webkit.CookieManager zza = zzf.zza(context);
        bundle.putBoolean("accept_3p_cookie", zza != null ? zza.acceptThirdPartyCookies(this.zzb) : false);
        com.google.android.gms.ads.query.QueryInfo.generate(context, com.google.android.gms.ads.AdFormat.BANNER, new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        com.google.android.gms.internal.ads.zzflc zzflcVar;
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            parse = (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zznw)).booleanValue() || (zzflcVar = this.zzd) == null) ? this.zzc.zzd(parse, this.zza, this.zzb, null) : zzflcVar.zza(parse, this.zza, this.zzb, null);
        } catch (com.google.android.gms.internal.ads.zzbaq e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzb(parse.toString(), null, null, null);
    }

    final /* synthetic */ android.webkit.WebView zzc() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzhcg zzd() {
        return this.zzh;
    }

    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zza zze() {
        return this.zzk;
    }

    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zze zzf() {
        return this.zzl;
    }
}

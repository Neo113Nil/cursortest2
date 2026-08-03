package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzbf extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface zzb;

    zzbf(com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface taggingLibraryJsInterface, java.lang.String str) {
        this.zza = str;
        java.util.Objects.requireNonNull(taggingLibraryJsInterface);
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String str) {
        java.lang.String.valueOf(str);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for the tagging library, error: ".concat(java.lang.String.valueOf(str)));
        java.lang.String concat = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
        java.lang.String str2 = this.zza;
        java.util.Locale locale = java.util.Locale.getDefault();
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str2;
        objArr[1] = str;
        com.google.android.gms.internal.ads.zzbka zzbkaVar = com.google.android.gms.internal.ads.zzbkv.zze;
        objArr[2] = java.lang.Long.valueOf(((java.lang.Boolean) zzbkaVar.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzh.zze()).longValue() : 0L);
        objArr[3] = concat;
        final java.lang.String format = java.lang.String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((java.lang.Boolean) zzbkaVar.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.nonagon.signalgeneration.zzbf.this.zzb.zzc().evaluateJavascript(format, null);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(format, null);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo queryInfo) {
        final java.lang.String format;
        java.lang.String query = queryInfo.getQuery();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("paw_id", this.zza);
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zze().zzb());
            }
            jSONObject.put("sdk_ttl_ms", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzh.zze()).longValue() : 0L);
            jSONObject.put("signal", query);
            format = java.lang.String.format(java.util.Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (org.json.JSONException unused) {
            java.lang.String concat = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
            java.lang.String str = this.zza;
            java.util.Locale locale = java.util.Locale.getDefault();
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str;
            objArr[1] = queryInfo.getQuery();
            objArr[2] = java.lang.Long.valueOf(((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue() ? ((java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzh.zze()).longValue() : 0L);
            objArr[3] = concat;
            format = java.lang.String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zze.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.nonagon.signalgeneration.zzbf.this.zzb.zzc().evaluateJavascript(format, null);
                    }
                });
            } catch (java.lang.RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(format, null);
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzc.zze()).booleanValue() && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkv.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zzb();
        }
    }
}

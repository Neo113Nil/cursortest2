package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcaz extends com.google.android.gms.internal.ads.zzcaw {
    private final android.content.Context zzb;
    private android.content.SharedPreferences zzc;
    private final com.google.android.gms.internal.ads.zzbty zzd;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze;
    private final java.util.concurrent.Executor zzg;
    private final java.lang.Object zza = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean zzf = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzcaz(android.content.Context context, com.google.android.gms.internal.ads.zzbty zzbtyVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.util.concurrent.Executor executor) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbtyVar;
        this.zzg = executor;
    }

    public static org.json.JSONObject zzc(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzf.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", com.google.android.gms.internal.ads.zzbkq.zzg.zze());
            jSONObject.put("cl", "885195211");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", com.google.android.gms.dynamite.DynamiteModule.getRemoteVersion(context, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        android.content.SharedPreferences sharedPreferences = this.zzc;
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - (sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L) < ((java.lang.Long) com.google.android.gms.internal.ads.zzbkq.zzh.zze()).longValue()) {
            return com.google.android.gms.internal.ads.zzhbw.zza(null);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzk(this.zzd.zzb(zzc(this.zzb, this.zze)), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzcax
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzcaz.this.zze((org.json.JSONObject) obj);
                return null;
            }
        }, ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzm.zze()).booleanValue() ? this.zzg : com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zza.zze()).booleanValue()) {
            return zza();
        }
        if (!this.zzf.compareAndSet(false, true)) {
            return com.google.android.gms.internal.ads.zzhbw.zzb();
        }
        com.google.common.util.concurrent.ListenableFuture zza = zza();
        zza.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcay
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcaz.this.zzd();
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
        return zza;
    }

    final /* synthetic */ void zzd() {
        this.zzf.set(false);
    }

    final /* synthetic */ java.lang.Void zze(org.json.JSONObject jSONObject) {
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zza;
        com.google.android.gms.ads.internal.client.zzba.zza();
        android.content.Context context = this.zzb;
        android.content.SharedPreferences zzb = com.google.android.gms.internal.ads.zzbij.zzb(context);
        if (zzb == null) {
            return null;
        }
        android.content.SharedPreferences.Editor edit = zzb.edit();
        java.util.Objects.requireNonNull(com.google.android.gms.ads.internal.client.zzba.zzb());
        int i = com.google.android.gms.internal.ads.zzbkg.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb().zzd(edit, 1, jSONObject);
        if ((((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzo.zze()).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzp.zze()).booleanValue()) && !com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            edit.apply();
        } else {
            com.google.android.gms.ads.internal.client.zzba.zza();
            edit.commit();
        }
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zze.zze()).booleanValue() && !android.text.TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
            com.google.android.gms.ads.internal.client.zzba.zza();
            android.content.SharedPreferences zza = com.google.android.gms.internal.ads.zzbij.zza(context);
            if (zza != null) {
                android.content.SharedPreferences.Editor edit2 = zza.edit();
                com.google.android.gms.ads.internal.client.zzba.zzb();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    if (next.startsWith("adapter:")) {
                        try {
                            jSONObject2.put(next, jSONObject.get(next));
                        } catch (org.json.JSONException unused) {
                        }
                    }
                }
                edit2.putString("flag_configuration", jSONObject2.toString());
                edit2.apply();
            }
        }
        android.content.SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()).apply();
        return null;
    }
}

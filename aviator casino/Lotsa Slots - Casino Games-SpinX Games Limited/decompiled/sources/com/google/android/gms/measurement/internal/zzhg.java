package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzhg extends com.google.android.gms.measurement.internal.zzje {
    static final android.util.Pair zza = new android.util.Pair("", 0L);
    public com.google.android.gms.measurement.internal.zzhe zzb;
    public final com.google.android.gms.measurement.internal.zzhd zzc;
    public final com.google.android.gms.measurement.internal.zzhd zzd;
    public final com.google.android.gms.measurement.internal.zzhf zze;
    public final com.google.android.gms.measurement.internal.zzhd zzf;
    public final com.google.android.gms.measurement.internal.zzhb zzg;
    public final com.google.android.gms.measurement.internal.zzhf zzh;
    public final com.google.android.gms.measurement.internal.zzhc zzi;
    public final com.google.android.gms.measurement.internal.zzhb zzj;
    public final com.google.android.gms.measurement.internal.zzhd zzk;
    public final com.google.android.gms.measurement.internal.zzhd zzl;
    public boolean zzm;
    public final com.google.android.gms.measurement.internal.zzhb zzn;
    public final com.google.android.gms.measurement.internal.zzhb zzo;
    public final com.google.android.gms.measurement.internal.zzhd zzp;
    public final com.google.android.gms.measurement.internal.zzhf zzq;
    public final com.google.android.gms.measurement.internal.zzhf zzr;
    public final com.google.android.gms.measurement.internal.zzhd zzs;
    public final com.google.android.gms.measurement.internal.zzhc zzt;
    private android.content.SharedPreferences zzv;
    private android.content.SharedPreferences zzw;
    private java.lang.String zzx;
    private boolean zzy;
    private long zzz;

    zzhg(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzf = new com.google.android.gms.measurement.internal.zzhd(this, "session_timeout", 1800000L);
        this.zzg = new com.google.android.gms.measurement.internal.zzhb(this, "start_new_session", true);
        this.zzk = new com.google.android.gms.measurement.internal.zzhd(this, "last_pause_time", 0L);
        this.zzl = new com.google.android.gms.measurement.internal.zzhd(this, "session_id", 0L);
        this.zzh = new com.google.android.gms.measurement.internal.zzhf(this, "non_personalized_ads", null);
        this.zzi = new com.google.android.gms.measurement.internal.zzhc(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new com.google.android.gms.measurement.internal.zzhb(this, "allow_remote_dynamite", false);
        this.zzc = new com.google.android.gms.measurement.internal.zzhd(this, "first_open_time", 0L);
        this.zzd = new com.google.android.gms.measurement.internal.zzhd(this, "app_install_time", 0L);
        this.zze = new com.google.android.gms.measurement.internal.zzhf(this, "app_instance_id", null);
        this.zzn = new com.google.android.gms.measurement.internal.zzhb(this, "app_backgrounded", false);
        this.zzo = new com.google.android.gms.measurement.internal.zzhb(this, "deep_link_retrieval_complete", false);
        this.zzp = new com.google.android.gms.measurement.internal.zzhd(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new com.google.android.gms.measurement.internal.zzhf(this, "firebase_feature_rollouts", null);
        this.zzr = new com.google.android.gms.measurement.internal.zzhf(this, "deferred_attribution_cache", null);
        this.zzs = new com.google.android.gms.measurement.internal.zzhd(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new com.google.android.gms.measurement.internal.zzhc(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    protected final boolean zza() {
        return true;
    }

    final android.util.Pair zzb(java.lang.String str) {
        zzg();
        if (!zzl().zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE)) {
            return new android.util.Pair("", false);
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        long elapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
        java.lang.String str2 = this.zzx;
        if (str2 != null && elapsedRealtime < this.zzz) {
            return new android.util.Pair(str2, java.lang.Boolean.valueOf(this.zzy));
        }
        this.zzz = elapsedRealtime + zzibVar.zzc().zzl(str, com.google.android.gms.measurement.internal.zzfx.zza);
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(zzibVar.zzaY());
            this.zzx = "";
            java.lang.String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzx = id;
            }
            this.zzy = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (java.lang.Exception e) {
            this.zzu.zzaV().zzj().zzb("Unable to get advertising id", e);
            this.zzx = "";
        }
        com.google.android.gms.ads.identifier.AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new android.util.Pair(this.zzx, java.lang.Boolean.valueOf(this.zzy));
    }

    @Override // com.google.android.gms.measurement.internal.zzje
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull.List({@org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.preferences"}), @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.monitoringSample"})})
    protected final void zzba() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        android.content.SharedPreferences sharedPreferences = zzibVar.zzaY().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            android.content.SharedPreferences.Editor edit = this.zzv.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        zzibVar.zzc();
        this.zzb = new com.google.android.gms.measurement.internal.zzhe(this, "health_monitor", java.lang.Math.max(0L, ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzc.zzb(null)).longValue()), null);
    }

    protected final android.content.SharedPreferences zzd() {
        zzg();
        zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    protected final android.content.SharedPreferences zze() {
        zzg();
        zzw();
        if (this.zzw == null) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            java.lang.String packageName = zzibVar.zzaY().getPackageName();
            java.lang.String.valueOf(packageName);
            java.lang.String valueOf = java.lang.String.valueOf(packageName);
            com.google.android.gms.measurement.internal.zzgr zzk = zzibVar.zzaV().zzk();
            java.lang.String concat = valueOf.concat("_preferences");
            zzk.zzb("Default prefs file", concat);
            this.zzw = zzibVar.zzaY().getSharedPreferences(concat, 0);
        }
        return this.zzw;
    }

    final android.util.SparseArray zzf() {
        android.os.Bundle zza2 = this.zzi.zza();
        int[] intArray = zza2.getIntArray("uriSources");
        long[] longArray = zza2.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new android.util.SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.zzu.zzaV().zzb().zza("Trigger URI source and timestamp array lengths do not match");
            return new android.util.SparseArray();
        }
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], java.lang.Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    final void zzh(java.lang.Boolean bool) {
        zzg();
        android.content.SharedPreferences.Editor edit = zzd().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    final java.lang.Boolean zzi() {
        zzg();
        if (zzd().contains("measurement_enabled")) {
            return java.lang.Boolean.valueOf(zzd().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final com.google.android.gms.measurement.internal.zzaz zzj() {
        zzg();
        return com.google.android.gms.measurement.internal.zzaz.zzg(zzd().getString("dma_consent_settings", null));
    }

    final boolean zzk(int i) {
        return com.google.android.gms.measurement.internal.zzjk.zzu(i, zzd().getInt("consent_source", 100));
    }

    final com.google.android.gms.measurement.internal.zzjk zzl() {
        zzg();
        return com.google.android.gms.measurement.internal.zzjk.zzf(zzd().getString("consent_settings", "G1"), zzd().getInt("consent_source", 100));
    }

    protected final boolean zzm(com.google.android.gms.measurement.internal.zzoc zzocVar) {
        zzg();
        java.lang.String string = zzd().getString("stored_tcf_param", "");
        java.lang.String zza2 = zzocVar.zza();
        if (zza2.equals(string)) {
            return false;
        }
        android.content.SharedPreferences.Editor edit = zzd().edit();
        edit.putString("stored_tcf_param", zza2);
        edit.apply();
        return true;
    }

    final void zzn(boolean z) {
        zzg();
        this.zzu.zzaV().zzk().zzb("App measurement setting deferred collection", java.lang.Boolean.valueOf(z));
        android.content.SharedPreferences.Editor edit = zzd().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    final boolean zzo() {
        android.content.SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean zzp(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }
}

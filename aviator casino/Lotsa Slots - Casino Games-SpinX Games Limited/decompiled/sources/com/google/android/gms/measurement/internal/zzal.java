package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzal extends com.google.android.gms.measurement.internal.zzjd {
    private java.lang.Boolean zza;
    private java.lang.String zzb;
    private com.google.android.gms.measurement.internal.zzak zzc;
    private java.lang.Boolean zzd;

    zzal(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zzc = com.google.android.gms.measurement.internal.zzaj.zza;
    }

    public static final long zzF() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzd.zzb(null)).longValue();
    }

    public static final int zzG() {
        return java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzi.zzb(null)).intValue());
    }

    public static final long zzH() {
        return ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzk.zzb(null)).intValue();
    }

    public static final long zzI() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzR.zzb(null)).longValue();
    }

    public static final long zzJ() {
        return ((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzM.zzb(null)).longValue();
    }

    private final java.lang.String zzK(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String str3 = (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class).invoke(null, str, "");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str3);
            return str3;
        } catch (java.lang.ClassNotFoundException e) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties class", e);
            return "";
        } catch (java.lang.IllegalAccessException e2) {
            this.zzu.zzaV().zzb().zzb("Could not access SystemProperties.get()", e2);
            return "";
        } catch (java.lang.NoSuchMethodException e3) {
            this.zzu.zzaV().zzb().zzb("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (java.lang.reflect.InvocationTargetException e4) {
            this.zzu.zzaV().zzb().zzb("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final java.lang.String zzA() {
        return zzK("debug.firebase.analytics.app", "");
    }

    public final java.lang.String zzB() {
        return zzK("debug.deferred.deeplink", "");
    }

    public final boolean zzC(java.lang.String str) {
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzD(java.lang.String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    final boolean zzE() {
        if (this.zza == null) {
            java.lang.Boolean zzr = zzr("app_measurement_lite");
            this.zza = zzr;
            if (zzr == null) {
                this.zza = false;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzp();
    }

    final void zza(com.google.android.gms.measurement.internal.zzak zzakVar) {
        this.zzc = zzakVar;
    }

    final java.lang.String zzb() {
        this.zzu.zzaU();
        return "FA";
    }

    public final int zzc() {
        return this.zzu.zzk().zzag(201500000, true) ? 100 : 25;
    }

    public final int zzd(java.lang.String str) {
        return zzn(str, com.google.android.gms.measurement.internal.zzfx.zzX, 25, 100);
    }

    final int zze(java.lang.String str, boolean z) {
        if (z) {
            return zzn(str, com.google.android.gms.measurement.internal.zzfx.zzah, 100, 500);
        }
        return 500;
    }

    final int zzf(java.lang.String str, boolean z) {
        return java.lang.Math.max(zze(str, z), 256);
    }

    final int zzh(java.lang.String str) {
        return zzn(str, com.google.android.gms.measurement.internal.zzfx.zzW, 500, 2000);
    }

    public final long zzi() {
        this.zzu.zzaU();
        return 130000L;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzj() {
        if (this.zzd == null) {
            synchronized (this) {
                if (this.zzd == null) {
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    android.content.pm.ApplicationInfo applicationInfo = zzibVar.zzaY().getApplicationInfo();
                    java.lang.String myProcessName = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        java.lang.String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.zzd = java.lang.Boolean.valueOf(z);
                    }
                    if (this.zzd == null) {
                        this.zzd = java.lang.Boolean.TRUE;
                        zzibVar.zzaV().zzb().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzd.booleanValue();
    }

    public final java.lang.String zzk(java.lang.String str, com.google.android.gms.measurement.internal.zzfw zzfwVar) {
        return android.text.TextUtils.isEmpty(str) ? (java.lang.String) zzfwVar.zzb(null) : (java.lang.String) zzfwVar.zzb(this.zzc.zza(str, zzfwVar.zza()));
    }

    public final long zzl(java.lang.String str, com.google.android.gms.measurement.internal.zzfw zzfwVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Long) zzfwVar.zzb(null)).longValue();
        }
        java.lang.String zza = this.zzc.zza(str, zzfwVar.zza());
        if (android.text.TextUtils.isEmpty(zza)) {
            return ((java.lang.Long) zzfwVar.zzb(null)).longValue();
        }
        try {
            return ((java.lang.Long) zzfwVar.zzb(java.lang.Long.valueOf(java.lang.Long.parseLong(zza)))).longValue();
        } catch (java.lang.NumberFormatException unused) {
            return ((java.lang.Long) zzfwVar.zzb(null)).longValue();
        }
    }

    public final int zzm(java.lang.String str, com.google.android.gms.measurement.internal.zzfw zzfwVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Integer) zzfwVar.zzb(null)).intValue();
        }
        java.lang.String zza = this.zzc.zza(str, zzfwVar.zza());
        if (android.text.TextUtils.isEmpty(zza)) {
            return ((java.lang.Integer) zzfwVar.zzb(null)).intValue();
        }
        try {
            return ((java.lang.Integer) zzfwVar.zzb(java.lang.Integer.valueOf(java.lang.Integer.parseInt(zza)))).intValue();
        } catch (java.lang.NumberFormatException unused) {
            return ((java.lang.Integer) zzfwVar.zzb(null)).intValue();
        }
    }

    public final int zzn(java.lang.String str, com.google.android.gms.measurement.internal.zzfw zzfwVar, int i, int i2) {
        return java.lang.Math.max(java.lang.Math.min(zzm(str, zzfwVar), i2), i);
    }

    public final double zzo(java.lang.String str, com.google.android.gms.measurement.internal.zzfw zzfwVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Double) zzfwVar.zzb(null)).doubleValue();
        }
        java.lang.String zza = this.zzc.zza(str, zzfwVar.zza());
        if (android.text.TextUtils.isEmpty(zza)) {
            return ((java.lang.Double) zzfwVar.zzb(null)).doubleValue();
        }
        try {
            return ((java.lang.Double) zzfwVar.zzb(java.lang.Double.valueOf(java.lang.Double.parseDouble(zza)))).doubleValue();
        } catch (java.lang.NumberFormatException unused) {
            return ((java.lang.Double) zzfwVar.zzb(null)).doubleValue();
        }
    }

    public final boolean zzp(java.lang.String str, com.google.android.gms.measurement.internal.zzfw zzfwVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            return ((java.lang.Boolean) zzfwVar.zzb(null)).booleanValue();
        }
        java.lang.String zza = this.zzc.zza(str, zzfwVar.zza());
        return android.text.TextUtils.isEmpty(zza) ? ((java.lang.Boolean) zzfwVar.zzb(null)).booleanValue() : ((java.lang.Boolean) zzfwVar.zzb(java.lang.Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    final android.os.Bundle zzq() {
        try {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            if (zzibVar.zzaY().getPackageManager() == null) {
                zzibVar.zzaV().zzb().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            android.content.pm.ApplicationInfo applicationInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(zzibVar.zzaY()).getApplicationInfo(zzibVar.zzaY().getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzibVar.zzaV().zzb().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            this.zzu.zzaV().zzb().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    final java.lang.Boolean zzr(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.os.Bundle zzq = zzq();
        if (zzq == null) {
            this.zzu.zzaV().zzb().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (zzq.containsKey(str)) {
            return java.lang.Boolean.valueOf(zzq.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final java.util.List zzs(java.lang.String str) {
        java.lang.Integer valueOf;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty("analytics.safelisted_events");
        android.os.Bundle zzq = zzq();
        if (zzq == null) {
            this.zzu.zzaV().zzb().zza("Failed to load metadata: Metadata bundle is null");
        } else if (zzq.containsKey("analytics.safelisted_events")) {
            valueOf = java.lang.Integer.valueOf(zzq.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    java.lang.String[] stringArray = this.zzu.zzaY().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return java.util.Arrays.asList(stringArray);
                } catch (android.content.res.Resources.NotFoundException e) {
                    this.zzu.zzaV().zzb().zzb("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    public final boolean zzt() {
        this.zzu.zzaU();
        java.lang.Boolean zzr = zzr("firebase_analytics_collection_deactivated");
        return zzr != null && zzr.booleanValue();
    }

    public final boolean zzu() {
        java.lang.Boolean zzr = zzr("google_analytics_adid_collection_enabled");
        return zzr == null || zzr.booleanValue();
    }

    public final boolean zzv() {
        java.lang.Boolean zzr = zzr("google_analytics_automatic_screen_reporting_enabled");
        return zzr == null || zzr.booleanValue();
    }

    public final com.google.android.gms.measurement.internal.zzjh zzw(java.lang.String str, boolean z) {
        java.lang.Object obj;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        android.os.Bundle zzq = zzq();
        if (zzq == null) {
            zzibVar.zzaV().zzb().zza("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = zzq.get(str);
        }
        if (obj == null) {
            return com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
        }
        if (java.lang.Boolean.TRUE.equals(obj)) {
            return com.google.android.gms.measurement.internal.zzjh.GRANTED;
        }
        if (java.lang.Boolean.FALSE.equals(obj)) {
            return com.google.android.gms.measurement.internal.zzjh.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return com.google.android.gms.measurement.internal.zzjh.POLICY;
        }
        zzibVar.zzaV().zze().zzb("Invalid manifest metadata for", str);
        return com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
    }

    public final boolean zzx() {
        java.lang.Boolean zzr = zzr("google_analytics_sgtm_upload_enabled");
        if (zzr == null) {
            return false;
        }
        return zzr.booleanValue();
    }

    public final void zzy(java.lang.String str) {
        this.zzb = str;
    }

    public final java.lang.String zzz() {
        return this.zzb;
    }
}

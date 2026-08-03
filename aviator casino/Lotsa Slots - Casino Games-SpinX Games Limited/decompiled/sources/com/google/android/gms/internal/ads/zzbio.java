package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbio implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private android.content.Context zzg;
    private final java.lang.Object zzb = new java.lang.Object();
    private final android.os.ConditionVariable zzc = new android.os.ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private android.content.SharedPreferences zze = null;
    private android.os.Bundle zzf = new android.os.Bundle();
    private org.json.JSONObject zzh = new org.json.JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final android.content.SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbis.zza(new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzbil
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ java.lang.Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (org.json.JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbis.zza(new com.google.android.gms.internal.ads.zzbim(r3))).optBoolean("local_flags_enabled") != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122 A[Catch: all -> 0x017d, DONT_GENERATE, TRY_ENTER, TryCatch #3 {, blocks: (B:8:0x0008, B:10:0x000c, B:12:0x000e, B:14:0x0013, B:15:0x0015, B:17:0x0027, B:18:0x002b, B:20:0x002d, B:38:0x009e, B:39:0x00a5, B:48:0x00d4, B:49:0x00db, B:56:0x0122, B:57:0x0129, B:70:0x016b, B:71:0x0172, B:93:0x0175, B:94:0x017c, B:23:0x0042, B:28:0x005e, B:30:0x0067, B:31:0x006f, B:33:0x0075, B:35:0x0085, B:37:0x009a, B:41:0x00a7, B:43:0x00ab, B:45:0x00bb, B:47:0x00d0, B:51:0x00dd, B:54:0x011c, B:59:0x012b, B:61:0x0138, B:63:0x0146, B:64:0x014f, B:66:0x015d, B:68:0x0161, B:69:0x0164, B:73:0x00ee, B:75:0x00fc, B:77:0x0104, B:79:0x010f, B:84:0x0049, B:86:0x0054), top: B:7:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b A[Catch: all -> 0x0174, TRY_ENTER, TryCatch #0 {all -> 0x0174, blocks: (B:23:0x0042, B:28:0x005e, B:30:0x0067, B:31:0x006f, B:33:0x0075, B:35:0x0085, B:37:0x009a, B:41:0x00a7, B:43:0x00ab, B:45:0x00bb, B:47:0x00d0, B:51:0x00dd, B:54:0x011c, B:59:0x012b, B:61:0x0138, B:63:0x0146, B:64:0x014f, B:66:0x015d, B:68:0x0161, B:69:0x0164, B:73:0x00ee, B:75:0x00fc, B:77:0x0104, B:79:0x010f, B:84:0x0049, B:86:0x0054), top: B:22:0x0042, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(android.content.Context context) {
        android.content.Context context2;
        android.content.SharedPreferences sharedPreferences;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            this.zzi = android.text.TextUtils.equals(context.getPackageName(), "com.google.android.gms");
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzg = context;
            try {
                this.zzf = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            }
            try {
                android.content.Context context3 = this.zzg;
                android.content.SharedPreferences sharedPreferences2 = null;
                if (context3 == null) {
                    context3 = null;
                } else {
                    try {
                        context2 = context3.createPackageContext("com.google.android.gms", 0);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                        context2 = null;
                    }
                    if (context2 != null || (context2 = context3.getApplicationContext()) != null) {
                        context3 = context2;
                    }
                }
                if (context3 != null) {
                    com.google.android.gms.ads.internal.client.zzba.zza();
                    sharedPreferences2 = com.google.android.gms.internal.ads.zzbij.zzb(context3);
                }
                if (sharedPreferences2 != null) {
                    com.google.android.gms.internal.ads.zzbli.zzc(new com.google.android.gms.internal.ads.zzbik(this, sharedPreferences2));
                }
                if (!this.zzi) {
                    com.google.android.gms.internal.ads.zzbka zzbkaVar = com.google.android.gms.internal.ads.zzbki.zzd;
                    if (((java.lang.Long) zzbkaVar.zze()).longValue() > 0 && com.google.android.gms.internal.ads.zzbib.zzd(this.zzg) >= ((java.lang.Long) zzbkaVar.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        return;
                    }
                }
                if (!this.zzi) {
                    com.google.android.gms.internal.ads.zzbka zzbkaVar2 = com.google.android.gms.internal.ads.zzbki.zzf;
                    if (((java.lang.Long) zzbkaVar2.zze()).longValue() > 0 && com.google.android.gms.internal.ads.zzbib.zzc(this.zzg) >= ((java.lang.Long) zzbkaVar2.zze()).longValue()) {
                        this.zzj = true;
                        this.zzd = true;
                        return;
                    }
                }
                android.content.Context context4 = this.zzg;
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzk.zze()).booleanValue()) {
                    if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzl.zze()).booleanValue() && (r3 = context4.getSharedPreferences(com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.ADMOB, 0)) != null) {
                    }
                    if (context3 != null) {
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzba.zza();
                    this.zze = com.google.android.gms.internal.ads.zzbij.zzb(context3);
                    if (!this.zzi && ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zze.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.client.zzba.zzd().zza(this.zzg);
                    }
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzc.zze()).booleanValue() && (sharedPreferences = this.zze) != null) {
                        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    return;
                }
                context3 = this.zzg;
                if (context3 != null) {
                }
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }

    final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final java.lang.Object zzd(final com.google.android.gms.internal.ads.zzbih zzbihVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new java.lang.IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbihVar.zzf();
            }
        }
        if (zzbihVar.zzm() != 2) {
            return (zzbihVar.zzm() == 1 && this.zzh.has(zzbihVar.zze())) ? zzbihVar.zzc(this.zzh) : com.google.android.gms.internal.ads.zzbis.zza(new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzbin
                @Override // com.google.android.gms.internal.ads.zzgub
                public final /* synthetic */ java.lang.Object zza() {
                    return com.google.android.gms.internal.ads.zzbio.this.zzf(zzbihVar);
                }
            });
        }
        android.os.Bundle bundle = this.zzf;
        return bundle == null ? zzbihVar.zzf() : zzbihVar.zza(bundle);
    }

    public final java.lang.Object zze(com.google.android.gms.internal.ads.zzbih zzbihVar) {
        return (this.zzd || this.zza) ? zzd(zzbihVar) : zzbihVar.zzf();
    }

    final /* synthetic */ java.lang.Object zzf(com.google.android.gms.internal.ads.zzbih zzbihVar) {
        return zzbihVar.zzd(this.zze);
    }
}

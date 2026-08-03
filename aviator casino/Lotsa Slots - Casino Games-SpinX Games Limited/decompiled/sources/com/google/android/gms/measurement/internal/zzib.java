package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzib implements com.google.android.gms.measurement.internal.zzjf {
    private static volatile com.google.android.gms.measurement.internal.zzib zzb;
    private volatile java.lang.Boolean zzA;
    private volatile boolean zzB;
    private int zzC;
    private int zzD;
    final long zza;
    private final android.content.Context zzc;
    private final boolean zzd;
    private final com.google.android.gms.measurement.internal.zzae zze;
    private final com.google.android.gms.measurement.internal.zzal zzf;
    private final com.google.android.gms.measurement.internal.zzhg zzg;
    private final com.google.android.gms.measurement.internal.zzgt zzh;
    private final com.google.android.gms.measurement.internal.zzhy zzi;
    private final com.google.android.gms.measurement.internal.zzob zzj;
    private final com.google.android.gms.measurement.internal.zzpo zzk;
    private final com.google.android.gms.measurement.internal.zzgm zzl;
    private final com.google.android.gms.common.util.Clock zzm;
    private final com.google.android.gms.measurement.internal.zzma zzn;
    private final com.google.android.gms.measurement.internal.zzli zzo;
    private final com.google.android.gms.measurement.internal.zzd zzp;
    private final com.google.android.gms.measurement.internal.zzln zzq;
    private final java.lang.String zzr;
    private com.google.android.gms.measurement.internal.zzgk zzs;
    private com.google.android.gms.measurement.internal.zznk zzt;
    private com.google.android.gms.measurement.internal.zzba zzu;
    private com.google.android.gms.measurement.internal.zzgh zzv;
    private com.google.android.gms.measurement.internal.zzlp zzw;
    private java.lang.Boolean zzy;
    private long zzz;
    private boolean zzx = false;
    private final java.util.concurrent.atomic.AtomicInteger zzE = new java.util.concurrent.atomic.AtomicInteger(0);

    zzib(com.google.android.gms.measurement.internal.zzjr zzjrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjrVar);
        android.content.Context context = zzjrVar.zza;
        com.google.android.gms.measurement.internal.zzae zzaeVar = new com.google.android.gms.measurement.internal.zzae(context);
        this.zze = zzaeVar;
        com.google.android.gms.measurement.internal.zzfr.zza = zzaeVar;
        this.zzc = context;
        this.zzd = zzjrVar.zze;
        this.zzA = zzjrVar.zzb;
        this.zzr = zzjrVar.zzg;
        this.zzB = true;
        com.google.android.gms.internal.measurement.zzkl.zzb(context);
        com.google.android.gms.common.util.Clock defaultClock = com.google.android.gms.common.util.DefaultClock.getInstance();
        this.zzm = defaultClock;
        java.lang.Long l = zzjrVar.zzf;
        this.zza = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.zzf = new com.google.android.gms.measurement.internal.zzal(this);
        com.google.android.gms.measurement.internal.zzhg zzhgVar = new com.google.android.gms.measurement.internal.zzhg(this);
        zzhgVar.zzx();
        this.zzg = zzhgVar;
        com.google.android.gms.measurement.internal.zzgt zzgtVar = new com.google.android.gms.measurement.internal.zzgt(this);
        zzgtVar.zzx();
        this.zzh = zzgtVar;
        com.google.android.gms.measurement.internal.zzpo zzpoVar = new com.google.android.gms.measurement.internal.zzpo(this);
        zzpoVar.zzx();
        this.zzk = zzpoVar;
        this.zzl = new com.google.android.gms.measurement.internal.zzgm(new com.google.android.gms.measurement.internal.zzjq(zzjrVar, this));
        this.zzp = new com.google.android.gms.measurement.internal.zzd(this);
        com.google.android.gms.measurement.internal.zzma zzmaVar = new com.google.android.gms.measurement.internal.zzma(this);
        zzmaVar.zzc();
        this.zzn = zzmaVar;
        com.google.android.gms.measurement.internal.zzli zzliVar = new com.google.android.gms.measurement.internal.zzli(this);
        zzliVar.zzc();
        this.zzo = zzliVar;
        com.google.android.gms.measurement.internal.zzob zzobVar = new com.google.android.gms.measurement.internal.zzob(this);
        zzobVar.zzc();
        this.zzj = zzobVar;
        com.google.android.gms.measurement.internal.zzln zzlnVar = new com.google.android.gms.measurement.internal.zzln(this);
        zzlnVar.zzx();
        this.zzq = zzlnVar;
        com.google.android.gms.measurement.internal.zzhy zzhyVar = new com.google.android.gms.measurement.internal.zzhy(this);
        zzhyVar.zzx();
        this.zzi = zzhyVar;
        com.google.android.gms.internal.measurement.zzdd zzddVar = zzjrVar.zzd;
        boolean z = zzddVar == null || zzddVar.zzb == 0;
        if (context.getApplicationContext() instanceof android.app.Application) {
            zzO(zzliVar);
            if (zzliVar.zzu.zzc.getApplicationContext() instanceof android.app.Application) {
                android.app.Application application = (android.app.Application) zzliVar.zzu.zzc.getApplicationContext();
                if (zzliVar.zza == null) {
                    zzliVar.zza = new com.google.android.gms.measurement.internal.zzkx(zzliVar);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzliVar.zza);
                    application.registerActivityLifecycleCallbacks(zzliVar.zza);
                    com.google.android.gms.measurement.internal.zzgt zzgtVar2 = zzliVar.zzu.zzh;
                    zzP(zzgtVar2);
                    zzgtVar2.zzk().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzP(zzgtVar);
            zzgtVar.zze().zza("Application context is not an Application");
        }
        zzhyVar.zzj(new com.google.android.gms.measurement.internal.zzhz(this, zzjrVar));
    }

    static final void zzL() {
        throw new java.lang.IllegalStateException("Unexpected call on client side");
    }

    private static final void zzM(com.google.android.gms.measurement.internal.zzf zzfVar) {
        if (zzfVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
    }

    private static final void zzN(com.google.android.gms.measurement.internal.zzjd zzjdVar) {
        if (zzjdVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
    }

    private static final void zzO(com.google.android.gms.measurement.internal.zzg zzgVar) {
        if (zzgVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (zzgVar.zza()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzgVar.getClass());
        java.lang.String.valueOf(valueOf);
        throw new java.lang.IllegalStateException("Component not initialized: ".concat(java.lang.String.valueOf(valueOf)));
    }

    private static final void zzP(com.google.android.gms.measurement.internal.zzje zzjeVar) {
        if (zzjeVar == null) {
            throw new java.lang.IllegalStateException("Component not created");
        }
        if (zzjeVar.zzv()) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(zzjeVar.getClass());
        java.lang.String.valueOf(valueOf);
        throw new java.lang.IllegalStateException("Component not initialized: ".concat(java.lang.String.valueOf(valueOf)));
    }

    public static com.google.android.gms.measurement.internal.zzib zzy(android.content.Context context, com.google.android.gms.internal.measurement.zzdd zzddVar, java.lang.Long l) {
        android.os.Bundle bundle;
        if (zzddVar != null) {
            android.os.Bundle bundle2 = zzddVar.zzd;
            zzddVar = new com.google.android.gms.internal.measurement.zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (com.google.android.gms.measurement.internal.zzib.class) {
                if (zzb == null) {
                    zzb = new com.google.android.gms.measurement.internal.zzib(new com.google.android.gms.measurement.internal.zzjr(context, zzddVar, l));
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb);
            zzb.zzA = java.lang.Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzb);
        return zzb;
    }

    public final boolean zzA() {
        return this.zzA != null && this.zzA.booleanValue();
    }

    public final boolean zzB() {
        return zzC() == 0;
    }

    public final int zzC() {
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        zzhyVar.zzg();
        com.google.android.gms.measurement.internal.zzal zzalVar = this.zzf;
        if (zzalVar.zzt()) {
            return 1;
        }
        zzP(zzhyVar);
        zzhyVar.zzg();
        if (!this.zzB) {
            return 8;
        }
        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzg;
        zzN(zzhgVar);
        java.lang.Boolean zzi = zzhgVar.zzi();
        if (zzi != null) {
            return zzi.booleanValue() ? 0 : 3;
        }
        com.google.android.gms.measurement.internal.zzae zzaeVar = zzalVar.zzu.zze;
        java.lang.Boolean zzr = zzalVar.zzr("firebase_analytics_collection_enabled");
        return zzr != null ? zzr.booleanValue() ? 0 : 4 : (this.zzA == null || this.zzA.booleanValue()) ? 0 : 7;
    }

    public final void zzD(boolean z) {
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        zzhyVar.zzg();
        this.zzB = z;
    }

    public final boolean zzE() {
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        zzhyVar.zzg();
        return this.zzB;
    }

    final void zzF() {
        this.zzC++;
    }

    final void zzG() {
        this.zzE.incrementAndGet();
    }

    protected final boolean zzH() {
        if (!this.zzx) {
            throw new java.lang.IllegalStateException("AppMeasurement is not initialized");
        }
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        zzhyVar.zzg();
        java.lang.Boolean bool = this.zzy;
        if (bool == null || this.zzz == 0 || (!bool.booleanValue() && java.lang.Math.abs(this.zzm.elapsedRealtime() - this.zzz) > 1000)) {
            this.zzz = this.zzm.elapsedRealtime();
            com.google.android.gms.measurement.internal.zzpo zzpoVar = this.zzk;
            zzN(zzpoVar);
            boolean z = false;
            if (zzpoVar.zzY("android.permission.INTERNET")) {
                zzN(zzpoVar);
                if (zzpoVar.zzY("android.permission.ACCESS_NETWORK_STATE")) {
                    android.content.Context context = this.zzc;
                    if (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).isCallerInstantApp() || this.zzf.zzE() || (com.google.android.gms.measurement.internal.zzpo.zzau(context) && com.google.android.gms.measurement.internal.zzpo.zzQ(context, false))) {
                        z = true;
                    }
                }
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            this.zzy = valueOf;
            if (valueOf.booleanValue()) {
                zzN(zzpoVar);
                this.zzy = java.lang.Boolean.valueOf(zzpoVar.zzA(zzv().zzk()));
            }
        }
        return this.zzy.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
    
        if (r4.zzah() >= 234200) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzI() {
        android.net.NetworkInfo activeNetworkInfo;
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        zzhyVar.zzg();
        com.google.android.gms.measurement.internal.zzln zzlnVar = this.zzq;
        zzP(zzlnVar);
        zzP(zzlnVar);
        java.lang.String zzj = zzv().zzj();
        if (!this.zzf.zzu()) {
            com.google.android.gms.measurement.internal.zzgt zzgtVar = this.zzh;
            zzP(zzgtVar);
            zzgtVar.zzk().zza("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzg;
        zzN(zzhgVar);
        android.util.Pair zzb2 = zzhgVar.zzb(zzj);
        if (((java.lang.Boolean) zzb2.second).booleanValue() || android.text.TextUtils.isEmpty((java.lang.CharSequence) zzb2.first)) {
            com.google.android.gms.measurement.internal.zzgt zzgtVar2 = this.zzh;
            zzP(zzgtVar2);
            zzgtVar2.zzk().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        zzP(zzlnVar);
        zzlnVar.zzw();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) zzlnVar.zzu.zzc.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
            }
            if (activeNetworkInfo != null || !activeNetworkInfo.isConnected()) {
                com.google.android.gms.measurement.internal.zzgt zzgtVar3 = this.zzh;
                zzP(zzgtVar3);
                zzgtVar3.zze().zza("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.android.gms.measurement.internal.zznk zzt = zzt();
            zzt.zzg();
            zzt.zzb();
            if (zzt.zzK()) {
                com.google.android.gms.measurement.internal.zzpo zzpoVar = zzt.zzu.zzk;
                zzN(zzpoVar);
            }
            com.google.android.gms.measurement.internal.zzli zzliVar = this.zzo;
            zzO(zzliVar);
            com.google.android.gms.measurement.internal.zzib zzibVar = zzliVar.zzu;
            zzliVar.zzg();
            com.google.android.gms.measurement.internal.zzao zzz = zzibVar.zzt().zzz();
            android.os.Bundle bundle = zzz != null ? zzz.zza : null;
            if (bundle == null) {
                int i = this.zzD;
                this.zzD = i + 1;
                boolean z = i < 10;
                com.google.android.gms.measurement.internal.zzgt zzgtVar4 = this.zzh;
                zzP(zzgtVar4);
                java.lang.String str = i < 10 ? "Retrying." : "Skipping.";
                com.google.android.gms.measurement.internal.zzgr zzj2 = zzgtVar4.zzj();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(str.length() + 60);
                sb2.append("Failed to retrieve DMA consent from the service, ");
                sb2.append(str);
                sb2.append(" retryCount");
                zzj2.zzb(sb2.toString(), java.lang.Integer.valueOf(this.zzD));
                return z;
            }
            com.google.android.gms.measurement.internal.zzjk zze = com.google.android.gms.measurement.internal.zzjk.zze(bundle, 100);
            sb.append("&gcs=");
            sb.append(zze.zzk());
            com.google.android.gms.measurement.internal.zzaz zzh = com.google.android.gms.measurement.internal.zzaz.zzh(bundle, 100);
            sb.append("&dma=");
            sb.append(!java.util.Objects.equals(zzh.zzj(), false) ? 1 : 0);
            if (!android.text.TextUtils.isEmpty(zzh.zzk())) {
                sb.append("&dma_cps=");
                sb.append(zzh.zzk());
            }
            int i2 = !java.util.Objects.equals(com.google.android.gms.measurement.internal.zzaz.zzi(bundle), true) ? 1 : 0;
            sb.append("&npa=");
            sb.append(i2);
            com.google.android.gms.measurement.internal.zzgt zzgtVar5 = this.zzh;
            zzP(zzgtVar5);
            zzgtVar5.zzk().zzb("Consent query parameters to Bow", sb);
            com.google.android.gms.measurement.internal.zzpo zzpoVar2 = this.zzk;
            zzN(zzpoVar2);
            zzv().zzu.zzf.zzi();
            java.lang.String str2 = (java.lang.String) zzb2.first;
            com.google.android.gms.measurement.internal.zzhg zzhgVar2 = this.zzg;
            zzN(zzhgVar2);
            java.net.URL zzat = zzpoVar2.zzat(130000L, zzj, str2, (-1) + zzhgVar2.zzp.zza(), sb.toString());
            if (zzat != null) {
                com.google.android.gms.measurement.internal.zzln zzlnVar2 = this.zzq;
                zzP(zzlnVar2);
                com.google.android.gms.measurement.internal.zzlk zzlkVar = new com.google.android.gms.measurement.internal.zzlk() { // from class: com.google.android.gms.measurement.internal.zzia
                    @Override // com.google.android.gms.measurement.internal.zzlk
                    public final /* synthetic */ void zza(java.lang.String str3, int i3, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
                        com.google.android.gms.measurement.internal.zzib.this.zzJ(str3, i3, th, bArr, map);
                    }
                };
                zzlnVar2.zzw();
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzat);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlkVar);
                com.google.android.gms.measurement.internal.zzhy zzhyVar2 = zzlnVar2.zzu.zzi;
                zzP(zzhyVar2);
                zzhyVar2.zzm(new com.google.android.gms.measurement.internal.zzlm(zzlnVar2, zzj, zzat, null, null, zzlkVar));
            }
            return false;
        }
        activeNetworkInfo = null;
        if (activeNetworkInfo != null) {
        }
        com.google.android.gms.measurement.internal.zzgt zzgtVar32 = this.zzh;
        zzP(zzgtVar32);
        zzgtVar32.zze().zza("Network is not available for Deferred Deep Link request. Skipping");
        return false;
    }

    final /* synthetic */ void zzJ(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        int i2;
        if (i == 200 || i == 204) {
            i2 = i;
        } else {
            i2 = 304;
            if (i != 304) {
                i2 = i;
                com.google.android.gms.measurement.internal.zzgt zzgtVar = this.zzh;
                zzP(zzgtVar);
                zzgtVar.zze().zzc("Network Request for Deferred Deep Link failed. response, exception", java.lang.Integer.valueOf(i2), th);
            }
        }
        if (th == null) {
            com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzg;
            zzN(zzhgVar);
            zzhgVar.zzo.zzb(true);
            if (bArr == null || bArr.length == 0) {
                com.google.android.gms.measurement.internal.zzgt zzgtVar2 = this.zzh;
                zzP(zzgtVar2);
                zzgtVar2.zzj().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr));
                java.lang.String optString = jSONObject.optString(com.adjust.sdk.Constants.DEEPLINK, "");
                if (android.text.TextUtils.isEmpty(optString)) {
                    com.google.android.gms.measurement.internal.zzgt zzgtVar3 = this.zzh;
                    zzP(zzgtVar3);
                    zzgtVar3.zzj().zza("Deferred Deep Link is empty.");
                    return;
                }
                java.lang.String optString2 = jSONObject.optString("gclid", "");
                java.lang.String optString3 = jSONObject.optString("gbraid", "");
                java.lang.String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble(com.ironsource.C4.a.d, 0.0d);
                android.os.Bundle bundle = new android.os.Bundle();
                com.google.android.gms.measurement.internal.zzpo zzpoVar = this.zzk;
                zzN(zzpoVar);
                com.google.android.gms.measurement.internal.zzib zzibVar = zzpoVar.zzu;
                if (!android.text.TextUtils.isEmpty(optString)) {
                    android.content.Context context = zzibVar.zzc;
                    java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (!android.text.TextUtils.isEmpty(optString3)) {
                            bundle.putString("gbraid", optString3);
                        }
                        if (!android.text.TextUtils.isEmpty(optString4)) {
                            bundle.putString("gad_source", optString4);
                        }
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.zzo.zzF("auto", com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                        zzN(zzpoVar);
                        if (android.text.TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            android.content.SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString(com.adjust.sdk.Constants.DEEPLINK, optString);
                            edit.putLong(com.ironsource.C4.a.d, java.lang.Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                android.content.Intent intent = new android.content.Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                android.content.Context context2 = zzpoVar.zzu.zzc;
                                if (android.os.Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, android.app.BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (java.lang.RuntimeException e) {
                            com.google.android.gms.measurement.internal.zzgt zzgtVar4 = zzpoVar.zzu.zzh;
                            zzP(zzgtVar4);
                            zzgtVar4.zzb().zzb("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                }
                com.google.android.gms.measurement.internal.zzgt zzgtVar5 = this.zzh;
                zzP(zzgtVar5);
                zzgtVar5.zze().zzd("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (org.json.JSONException e2) {
                com.google.android.gms.measurement.internal.zzgt zzgtVar6 = this.zzh;
                zzP(zzgtVar6);
                zzgtVar6.zzb().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzgt zzgtVar7 = this.zzh;
        zzP(zzgtVar7);
        zzgtVar7.zze().zzc("Network Request for Deferred Deep Link failed. response, exception", java.lang.Integer.valueOf(i2), th);
    }

    final /* synthetic */ void zzK(com.google.android.gms.measurement.internal.zzjr zzjrVar) {
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        zzhyVar.zzg();
        com.google.android.gms.measurement.internal.zzal zzalVar = this.zzf;
        zzalVar.zzb();
        com.google.android.gms.measurement.internal.zzba zzbaVar = new com.google.android.gms.measurement.internal.zzba(this);
        zzbaVar.zzx();
        this.zzu = zzbaVar;
        com.google.android.gms.internal.measurement.zzdd zzddVar = zzjrVar.zzd;
        com.google.android.gms.measurement.internal.zzgh zzghVar = new com.google.android.gms.measurement.internal.zzgh(this, zzjrVar.zzc, zzddVar == null ? 0L : zzddVar.zza);
        zzghVar.zzc();
        this.zzv = zzghVar;
        com.google.android.gms.measurement.internal.zzgk zzgkVar = new com.google.android.gms.measurement.internal.zzgk(this);
        zzgkVar.zzc();
        this.zzs = zzgkVar;
        com.google.android.gms.measurement.internal.zznk zznkVar = new com.google.android.gms.measurement.internal.zznk(this);
        zznkVar.zzc();
        this.zzt = zznkVar;
        com.google.android.gms.measurement.internal.zzpo zzpoVar = this.zzk;
        zzpoVar.zzy();
        this.zzg.zzy();
        this.zzv.zzd();
        com.google.android.gms.measurement.internal.zzlp zzlpVar = new com.google.android.gms.measurement.internal.zzlp(this);
        zzlpVar.zzc();
        this.zzw = zzlpVar;
        zzlpVar.zzd();
        com.google.android.gms.measurement.internal.zzgt zzgtVar = this.zzh;
        zzP(zzgtVar);
        com.google.android.gms.measurement.internal.zzgr zzi = zzgtVar.zzi();
        zzalVar.zzi();
        zzi.zzb("App measurement initialized, version", 130000L);
        zzP(zzgtVar);
        zzgtVar.zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        java.lang.String zzj = zzghVar.zzj();
        zzN(zzpoVar);
        if (zzpoVar.zzaa(zzj, zzalVar.zzz())) {
            zzP(zzgtVar);
            zzgtVar.zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            zzP(zzgtVar);
            com.google.android.gms.measurement.internal.zzgr zzi2 = zzgtVar.zzi();
            java.lang.String.valueOf(zzj);
            zzi2.zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(java.lang.String.valueOf(zzj)));
        }
        zzP(zzgtVar);
        zzgtVar.zzj().zza("Debug-level message logging enabled");
        int i = this.zzC;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzE;
        if (i != atomicInteger.get()) {
            zzP(zzgtVar);
            zzgtVar.zzb().zzc("Not all components initialized", java.lang.Integer.valueOf(this.zzC), java.lang.Integer.valueOf(atomicInteger.get()));
        }
        this.zzx = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (r1.zzS() == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zza(com.google.android.gms.internal.measurement.zzdd zzddVar) {
        com.google.android.gms.measurement.internal.zzjk zza;
        com.google.android.gms.measurement.internal.zzli zzliVar;
        com.google.android.gms.measurement.internal.zzjh zzw;
        com.google.android.gms.measurement.internal.zzjh zzw2;
        android.os.Bundle bundle;
        com.google.android.gms.measurement.internal.zzaz zzh;
        java.lang.Boolean zzr;
        com.google.android.gms.measurement.internal.zzhd zzhdVar;
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        zzhyVar.zzg();
        com.google.android.gms.internal.measurement.zzin zzj = zzx().zzj();
        com.google.android.gms.internal.measurement.zzin zzinVar = com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
        com.google.android.gms.internal.measurement.zzql.zza();
        com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzaQ;
        com.google.android.gms.measurement.internal.zzal zzalVar = this.zzf;
        boolean zzp = zzalVar.zzp(null, zzfwVar);
        boolean z = zzj == zzinVar;
        if (zzp) {
            com.google.android.gms.measurement.internal.zzpo zzpoVar = this.zzk;
            zzN(zzpoVar);
        }
        if (z) {
            z = true;
            com.google.android.gms.measurement.internal.zzpo zzpoVar2 = this.zzk;
            zzN(zzpoVar2);
            zzpoVar2.zzg();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            com.google.android.gms.measurement.internal.zzw zzwVar = new com.google.android.gms.measurement.internal.zzw(zzpoVar2.zzu);
            com.google.android.gms.measurement.internal.zzib zzibVar = zzpoVar2.zzu;
            androidx.core.content.ContextCompat.registerReceiver(zzibVar.zzc, zzwVar, intentFilter, 2);
            com.google.android.gms.measurement.internal.zzgt zzgtVar = zzibVar.zzh;
            zzP(zzgtVar);
            zzgtVar.zzj().zza("Registered app receiver");
            if (z) {
                zzx().zzh(((java.lang.Long) com.google.android.gms.measurement.internal.zzfx.zzB.zzb(null)).longValue());
            }
        }
        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzg;
        zzN(zzhgVar);
        com.google.android.gms.measurement.internal.zzjk zzl = zzhgVar.zzl();
        int zzb2 = zzl.zzb();
        com.google.android.gms.measurement.internal.zzjh zzw3 = zzalVar.zzw("google_analytics_default_allow_ad_storage", false);
        com.google.android.gms.measurement.internal.zzjh zzw4 = zzalVar.zzw("google_analytics_default_allow_analytics_storage", false);
        com.google.android.gms.measurement.internal.zzjh zzjhVar = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
        if (zzw3 != zzjhVar || zzw4 != zzjhVar) {
            zzN(zzhgVar);
            if (zzhgVar.zzk(-10)) {
                zza = com.google.android.gms.measurement.internal.zzjk.zza(zzw3, zzw4, -10);
                if (zza != null) {
                    com.google.android.gms.measurement.internal.zzli zzliVar2 = this.zzo;
                    zzO(zzliVar2);
                    zzliVar2.zzs(zza, true);
                    zzl = zza;
                }
                zzliVar = this.zzo;
                zzO(zzliVar);
                zzliVar.zzA(zzl);
                zzN(zzhgVar);
                int zzb3 = zzhgVar.zzj().zzb();
                zzw = zzalVar.zzw("google_analytics_default_allow_ad_personalization_signals", true);
                if (zzw != zzjhVar) {
                    com.google.android.gms.measurement.internal.zzgt zzgtVar2 = this.zzh;
                    zzP(zzgtVar2);
                    zzgtVar2.zzk().zzb("Default ad personalization consent from Manifest", zzw);
                }
                zzw2 = zzalVar.zzw("google_analytics_default_allow_ad_user_data", true);
                if (zzw2 == zzjhVar && com.google.android.gms.measurement.internal.zzjk.zzu(-10, zzb3)) {
                    zzO(zzliVar);
                    zzliVar.zzq(com.google.android.gms.measurement.internal.zzaz.zza(zzw2, -10), true);
                } else if (android.text.TextUtils.isEmpty(zzv().zzk()) && (zzb3 == 0 || zzb3 == 30)) {
                    zzO(zzliVar);
                    zzliVar.zzq(new com.google.android.gms.measurement.internal.zzaz((java.lang.Boolean) null, -10, (java.lang.Boolean) null, (java.lang.String) null), true);
                } else if (android.text.TextUtils.isEmpty(zzv().zzk()) && zzddVar != null && (bundle = zzddVar.zzd) != null && com.google.android.gms.measurement.internal.zzjk.zzu(30, zzb3)) {
                    zzh = com.google.android.gms.measurement.internal.zzaz.zzh(bundle, 30);
                    if (zzh.zzd()) {
                        zzO(zzliVar);
                        zzliVar.zzq(zzh, true);
                    }
                }
                com.google.android.gms.measurement.internal.zzib zzibVar2 = zzalVar.zzu;
                zzr = zzalVar.zzr("google_analytics_tcf_data_enabled");
                if (zzr != null || zzr.booleanValue()) {
                    com.google.android.gms.measurement.internal.zzgt zzgtVar3 = this.zzh;
                    zzP(zzgtVar3);
                    zzgtVar3.zzj().zza("TCF client enabled.");
                    zzO(zzliVar);
                    zzliVar.zzE();
                    zzO(zzliVar);
                    zzliVar.zzD();
                }
                zzN(zzhgVar);
                zzhdVar = zzhgVar.zzc;
                if (zzhdVar.zza() == 0) {
                    com.google.android.gms.measurement.internal.zzgt zzgtVar4 = this.zzh;
                    zzP(zzgtVar4);
                    long j = this.zza;
                    zzgtVar4.zzk().zzb("Persisting first open", java.lang.Long.valueOf(j));
                    zzN(zzhgVar);
                    zzhdVar.zzb(j);
                }
                zzO(zzliVar);
                zzliVar.zzb.zzc();
                if (!zzH()) {
                    if (!android.text.TextUtils.isEmpty(zzv().zzk())) {
                        com.google.android.gms.measurement.internal.zzpo zzpoVar3 = this.zzk;
                        zzN(zzpoVar3);
                        java.lang.String zzk = zzv().zzk();
                        zzN(zzhgVar);
                        zzhgVar.zzg();
                        if (zzpoVar3.zzB(zzk, zzhgVar.zzd().getString("gmp_app_id", null))) {
                            com.google.android.gms.measurement.internal.zzgt zzgtVar5 = this.zzh;
                            zzP(zzgtVar5);
                            zzgtVar5.zzi().zza("Rechecking which service to use due to a GMP App Id change");
                            zzN(zzhgVar);
                            zzhgVar.zzg();
                            java.lang.Boolean zzi = zzhgVar.zzi();
                            android.content.SharedPreferences.Editor edit = zzhgVar.zzd().edit();
                            edit.clear();
                            edit.apply();
                            if (zzi != null) {
                                zzhgVar.zzh(zzi);
                            }
                            zzm().zzh();
                            this.zzt.zzM();
                            this.zzt.zzI();
                            zzN(zzhgVar);
                            zzhdVar.zzb(this.zza);
                            zzN(zzhgVar);
                            zzhgVar.zze.zzb(null);
                        }
                        zzN(zzhgVar);
                        java.lang.String zzk2 = zzv().zzk();
                        zzhgVar.zzg();
                        android.content.SharedPreferences.Editor edit2 = zzhgVar.zzd().edit();
                        edit2.putString("gmp_app_id", zzk2);
                        edit2.apply();
                    }
                    zzN(zzhgVar);
                    if (!zzhgVar.zzl().zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE)) {
                        zzN(zzhgVar);
                        zzhgVar.zze.zzb(null);
                    }
                    zzO(zzliVar);
                    zzN(zzhgVar);
                    zzliVar.zzR(zzhgVar.zze.zza());
                    com.google.android.gms.measurement.internal.zzpo zzpoVar4 = this.zzk;
                    zzN(zzpoVar4);
                    try {
                        zzpoVar4.zzu.zzc.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    } catch (java.lang.ClassNotFoundException unused) {
                        com.google.android.gms.measurement.internal.zzhg zzhgVar2 = this.zzg;
                        zzN(zzhgVar2);
                        com.google.android.gms.measurement.internal.zzhf zzhfVar = zzhgVar2.zzq;
                        if (!android.text.TextUtils.isEmpty(zzhfVar.zza())) {
                            com.google.android.gms.measurement.internal.zzgt zzgtVar6 = this.zzh;
                            zzP(zzgtVar6);
                            zzgtVar6.zze().zza("Remote config removed with active feature rollouts");
                            zzN(zzhgVar2);
                            zzhfVar.zzb(null);
                        }
                    }
                    if (!android.text.TextUtils.isEmpty(zzv().zzk())) {
                        boolean zzB = zzB();
                        com.google.android.gms.measurement.internal.zzhg zzhgVar3 = this.zzg;
                        zzN(zzhgVar3);
                        if (!zzhgVar3.zzo() && !this.zzf.zzt()) {
                            zzN(zzhgVar3);
                            zzhgVar3.zzn(!zzB);
                        }
                        if (zzB) {
                            com.google.android.gms.measurement.internal.zzli zzliVar3 = this.zzo;
                            zzO(zzliVar3);
                            zzliVar3.zzU();
                        }
                        com.google.android.gms.measurement.internal.zzob zzobVar = this.zzj;
                        zzO(zzobVar);
                        zzobVar.zza.zza();
                        zzt().zzC(new java.util.concurrent.atomic.AtomicReference());
                        com.google.android.gms.measurement.internal.zznk zzt = zzt();
                        zzN(zzhgVar3);
                        zzt.zzH(zzhgVar3.zzt.zza());
                    }
                } else if (zzB()) {
                    com.google.android.gms.measurement.internal.zzpo zzpoVar5 = this.zzk;
                    zzN(zzpoVar5);
                    if (!zzpoVar5.zzY("android.permission.INTERNET")) {
                        com.google.android.gms.measurement.internal.zzgt zzgtVar7 = this.zzh;
                        zzP(zzgtVar7);
                        zzgtVar7.zzb().zza("App is missing INTERNET permission");
                    }
                    zzN(zzpoVar5);
                    if (!zzpoVar5.zzY("android.permission.ACCESS_NETWORK_STATE")) {
                        com.google.android.gms.measurement.internal.zzgt zzgtVar8 = this.zzh;
                        zzP(zzgtVar8);
                        zzgtVar8.zzb().zza("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    android.content.Context context = this.zzc;
                    if (!com.google.android.gms.common.wrappers.Wrappers.packageManager(context).isCallerInstantApp() && !this.zzf.zzE()) {
                        if (!com.google.android.gms.measurement.internal.zzpo.zzau(context)) {
                            com.google.android.gms.measurement.internal.zzgt zzgtVar9 = this.zzh;
                            zzP(zzgtVar9);
                            zzgtVar9.zzb().zza("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!com.google.android.gms.measurement.internal.zzpo.zzQ(context, false)) {
                            com.google.android.gms.measurement.internal.zzgt zzgtVar10 = this.zzh;
                            zzP(zzgtVar10);
                            zzgtVar10.zzb().zza("AppMeasurementService not registered/enabled");
                        }
                    }
                    com.google.android.gms.measurement.internal.zzgt zzgtVar11 = this.zzh;
                    zzP(zzgtVar11);
                    zzgtVar11.zzb().zza("Uploading is not possible. App measurement disabled");
                }
                com.google.android.gms.internal.measurement.zzql.zza();
                if (this.zzf.zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaQ)) {
                    com.google.android.gms.measurement.internal.zzpo zzpoVar6 = this.zzk;
                    zzN(zzpoVar6);
                    if (zzpoVar6.zzS()) {
                        long max = java.lang.Math.max(500L, ((((java.lang.Integer) com.google.android.gms.measurement.internal.zzfx.zzax.zzb(null)).intValue() * 1000) + new java.util.Random().nextInt(5000)) - this.zzm.elapsedRealtime());
                        if (max > 500) {
                            com.google.android.gms.measurement.internal.zzgt zzgtVar12 = this.zzh;
                            zzP(zzgtVar12);
                            zzgtVar12.zzk().zzb("Waiting to fetch trigger URIs until some time after boot. Delay in millis", java.lang.Long.valueOf(max));
                        }
                        com.google.android.gms.measurement.internal.zzli zzliVar4 = this.zzo;
                        zzO(zzliVar4);
                        zzliVar4.zzu(max);
                    }
                }
                com.google.android.gms.measurement.internal.zzhg zzhgVar4 = this.zzg;
                zzN(zzhgVar4);
                zzhgVar4.zzj.zzb(true);
            }
        }
        if (!android.text.TextUtils.isEmpty(zzv().zzk()) && (zzb2 == 0 || zzb2 == 30 || zzb2 == 10 || zzb2 == 40)) {
            com.google.android.gms.measurement.internal.zzli zzliVar5 = this.zzo;
            zzO(zzliVar5);
            zzliVar5.zzs(new com.google.android.gms.measurement.internal.zzjk(null, null, -10), false);
        }
        zza = null;
        if (zza != null) {
        }
        zzliVar = this.zzo;
        zzO(zzliVar);
        zzliVar.zzA(zzl);
        zzN(zzhgVar);
        int zzb32 = zzhgVar.zzj().zzb();
        zzw = zzalVar.zzw("google_analytics_default_allow_ad_personalization_signals", true);
        if (zzw != zzjhVar) {
        }
        zzw2 = zzalVar.zzw("google_analytics_default_allow_ad_user_data", true);
        if (zzw2 == zzjhVar) {
        }
        if (android.text.TextUtils.isEmpty(zzv().zzk())) {
        }
        if (android.text.TextUtils.isEmpty(zzv().zzk())) {
            zzh = com.google.android.gms.measurement.internal.zzaz.zzh(bundle, 30);
            if (zzh.zzd()) {
            }
        }
        com.google.android.gms.measurement.internal.zzib zzibVar22 = zzalVar.zzu;
        zzr = zzalVar.zzr("google_analytics_tcf_data_enabled");
        if (zzr != null) {
        }
        com.google.android.gms.measurement.internal.zzgt zzgtVar32 = this.zzh;
        zzP(zzgtVar32);
        zzgtVar32.zzj().zza("TCF client enabled.");
        zzO(zzliVar);
        zzliVar.zzE();
        zzO(zzliVar);
        zzliVar.zzD();
        zzN(zzhgVar);
        zzhdVar = zzhgVar.zzc;
        if (zzhdVar.zza() == 0) {
        }
        zzO(zzliVar);
        zzliVar.zzb.zzc();
        if (!zzH()) {
        }
        com.google.android.gms.internal.measurement.zzql.zza();
        if (this.zzf.zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaQ)) {
        }
        com.google.android.gms.measurement.internal.zzhg zzhgVar42 = this.zzg;
        zzN(zzhgVar42);
        zzhgVar42.zzj.zzb(true);
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzae zzaU() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzgt zzaV() {
        com.google.android.gms.measurement.internal.zzgt zzgtVar = this.zzh;
        zzP(zzgtVar);
        return zzgtVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzhy zzaW() {
        com.google.android.gms.measurement.internal.zzhy zzhyVar = this.zzi;
        zzP(zzhyVar);
        return zzhyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @org.checkerframework.dataflow.qual.Pure
    public final android.content.Context zzaY() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.common.util.Clock zzaZ() {
        return this.zzm;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzal zzc() {
        return this.zzf;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzhg zzd() {
        com.google.android.gms.measurement.internal.zzhg zzhgVar = this.zzg;
        zzN(zzhgVar);
        return zzhgVar;
    }

    public final com.google.android.gms.measurement.internal.zzgt zzf() {
        com.google.android.gms.measurement.internal.zzgt zzgtVar = this.zzh;
        if (zzgtVar == null || !zzgtVar.zzv()) {
            return null;
        }
        return zzgtVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzob zzh() {
        com.google.android.gms.measurement.internal.zzob zzobVar = this.zzj;
        zzO(zzobVar);
        return zzobVar;
    }

    @org.checkerframework.dataflow.qual.SideEffectFree
    final com.google.android.gms.measurement.internal.zzhy zzi() {
        return this.zzi;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzli zzj() {
        com.google.android.gms.measurement.internal.zzli zzliVar = this.zzo;
        zzO(zzliVar);
        return zzliVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzpo zzk() {
        com.google.android.gms.measurement.internal.zzpo zzpoVar = this.zzk;
        zzN(zzpoVar);
        return zzpoVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzgm zzl() {
        return this.zzl;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzgk zzm() {
        zzO(this.zzs);
        return this.zzs;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzln zzn() {
        com.google.android.gms.measurement.internal.zzln zzlnVar = this.zzq;
        zzP(zzlnVar);
        return zzlnVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean zzp() {
        return this.zzd;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.String zzq() {
        return this.zzr;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzma zzs() {
        com.google.android.gms.measurement.internal.zzma zzmaVar = this.zzn;
        zzO(zzmaVar);
        return zzmaVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zznk zzt() {
        zzO(this.zzt);
        return this.zzt;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzba zzu() {
        zzP(this.zzu);
        return this.zzu;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzgh zzv() {
        zzO(this.zzv);
        return this.zzv;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzd zzw() {
        com.google.android.gms.measurement.internal.zzd zzdVar = this.zzp;
        zzM(zzdVar);
        return zzdVar;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final com.google.android.gms.measurement.internal.zzlp zzx() {
        zzM(this.zzw);
        return this.zzw;
    }

    final void zzz(boolean z) {
        this.zzA = java.lang.Boolean.valueOf(z);
    }
}

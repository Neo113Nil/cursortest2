package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzli extends com.google.android.gms.measurement.internal.zzg {
    protected com.google.android.gms.measurement.internal.zzkx zza;
    final com.google.android.gms.measurement.internal.zzx zzb;
    protected boolean zzc;
    private com.google.android.gms.measurement.internal.zzjo zzd;
    private final java.util.Set zze;
    private boolean zzf;
    private final java.util.concurrent.atomic.AtomicReference zzg;
    private final java.lang.Object zzh;
    private boolean zzi;
    private int zzj;
    private com.google.android.gms.measurement.internal.zzay zzk;
    private com.google.android.gms.measurement.internal.zzay zzl;
    private java.util.PriorityQueue zzm;
    private boolean zzn;
    private com.google.android.gms.measurement.internal.zzjk zzo;
    private final java.util.concurrent.atomic.AtomicLong zzp;
    private long zzq;
    private com.google.android.gms.measurement.internal.zzay zzr;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private com.google.android.gms.measurement.internal.zzay zzt;
    private final com.google.android.gms.measurement.internal.zzpn zzv;

    protected zzli(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zze = new java.util.concurrent.CopyOnWriteArraySet();
        this.zzh = new java.lang.Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new com.google.android.gms.measurement.internal.zzkm(this);
        this.zzg = new java.util.concurrent.atomic.AtomicReference();
        this.zzo = com.google.android.gms.measurement.internal.zzjk.zza;
        this.zzq = -1L;
        this.zzp = new java.util.concurrent.atomic.AtomicLong(0L);
        this.zzb = new com.google.android.gms.measurement.internal.zzx(zzibVar);
    }

    private final com.google.android.gms.measurement.internal.zzlq zzaq(final com.google.android.gms.measurement.internal.zzol zzolVar) {
        try {
            java.net.URL url = new java.net.URI(zzolVar.zzc).toURL();
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            java.lang.String zzl = this.zzu.zzv().zzl();
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            com.google.android.gms.measurement.internal.zzgr zzk = zzibVar.zzaV().zzk();
            java.lang.Long valueOf = java.lang.Long.valueOf(zzolVar.zza);
            zzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzolVar.zzc, java.lang.Integer.valueOf(zzolVar.zzb.length));
            if (!android.text.TextUtils.isEmpty(zzolVar.zzg)) {
                zzibVar.zzaV().zzk().zzc("[sgtm] Uploading data from app. row_id", valueOf, zzolVar.zzg);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            android.os.Bundle bundle = zzolVar.zzd;
            for (java.lang.String str : bundle.keySet()) {
                java.lang.String string = bundle.getString(str);
                if (!android.text.TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            com.google.android.gms.measurement.internal.zzln zzn = zzibVar.zzn();
            byte[] bArr = zzolVar.zzb;
            com.google.android.gms.measurement.internal.zzlk zzlkVar = new com.google.android.gms.measurement.internal.zzlk() { // from class: com.google.android.gms.measurement.internal.zzky
                /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
                @Override // com.google.android.gms.measurement.internal.zzlk
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ void zza(java.lang.String str2, int i, java.lang.Throwable th, byte[] bArr2, java.util.Map map) {
                    com.google.android.gms.measurement.internal.zzlq zzlqVar;
                    java.util.concurrent.atomic.AtomicReference atomicReference2;
                    com.google.android.gms.measurement.internal.zzli zzliVar = com.google.android.gms.measurement.internal.zzli.this;
                    zzliVar.zzg();
                    com.google.android.gms.measurement.internal.zzol zzolVar2 = zzolVar;
                    if (i != 200 && i != 204) {
                        if (i == 304) {
                            i = 304;
                        }
                        zzliVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", java.lang.Long.valueOf(zzolVar2.zza), java.lang.Integer.valueOf(i), th);
                        zzlqVar = !java.util.Arrays.asList(((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzt.zzb(null)).split(",")).contains(java.lang.String.valueOf(i)) ? com.google.android.gms.measurement.internal.zzlq.BACKOFF : com.google.android.gms.measurement.internal.zzlq.FAILURE;
                        atomicReference2 = atomicReference;
                        com.google.android.gms.measurement.internal.zznk zzt = zzliVar.zzu.zzt();
                        long j = zzolVar2.zza;
                        zzt.zzy(new com.google.android.gms.measurement.internal.zzaf(j, zzlqVar.zza(), zzolVar2.zzf));
                        zzliVar.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", java.lang.Long.valueOf(j), zzlqVar);
                        synchronized (atomicReference2) {
                            atomicReference2.set(zzlqVar);
                            atomicReference2.notifyAll();
                        }
                        return;
                    }
                    if (th == null) {
                        zzliVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", java.lang.Long.valueOf(zzolVar2.zza));
                        zzlqVar = com.google.android.gms.measurement.internal.zzlq.SUCCESS;
                        atomicReference2 = atomicReference;
                        com.google.android.gms.measurement.internal.zznk zzt2 = zzliVar.zzu.zzt();
                        long j2 = zzolVar2.zza;
                        zzt2.zzy(new com.google.android.gms.measurement.internal.zzaf(j2, zzlqVar.zza(), zzolVar2.zzf));
                        zzliVar.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", java.lang.Long.valueOf(j2), zzlqVar);
                        synchronized (atomicReference2) {
                        }
                    }
                    zzliVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", java.lang.Long.valueOf(zzolVar2.zza), java.lang.Integer.valueOf(i), th);
                    if (!java.util.Arrays.asList(((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzt.zzb(null)).split(",")).contains(java.lang.String.valueOf(i))) {
                    }
                    atomicReference2 = atomicReference;
                    com.google.android.gms.measurement.internal.zznk zzt22 = zzliVar.zzu.zzt();
                    long j22 = zzolVar2.zza;
                    zzt22.zzy(new com.google.android.gms.measurement.internal.zzaf(j22, zzlqVar.zza(), zzolVar2.zzf));
                    zzliVar.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", java.lang.Long.valueOf(j22), zzlqVar);
                    synchronized (atomicReference2) {
                    }
                }
            };
            zzn.zzw();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(url);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzlkVar);
            zzn.zzu.zzaW().zzm(new com.google.android.gms.measurement.internal.zzlm(zzn, zzl, url, bArr, hashMap, zzlkVar));
            try {
                com.google.android.gms.measurement.internal.zzib zzibVar2 = zzibVar.zzk().zzu;
                long currentTimeMillis = zzibVar2.zzaZ().currentTimeMillis() + 60000;
                synchronized (atomicReference) {
                    for (long j = 60000; atomicReference.get() == null && j > 0; j = currentTimeMillis - zzibVar2.zzaZ().currentTimeMillis()) {
                        atomicReference.wait(j);
                    }
                }
            } catch (java.lang.InterruptedException unused) {
                this.zzu.zzaV().zze().zza("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? com.google.android.gms.measurement.internal.zzlq.UNKNOWN : (com.google.android.gms.measurement.internal.zzlq) atomicReference.get();
        } catch (java.net.MalformedURLException | java.net.URISyntaxException e) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", zzolVar.zzc, java.lang.Long.valueOf(zzolVar.zza), e);
            return com.google.android.gms.measurement.internal.zzlq.FAILURE;
        }
    }

    private final void zzar(java.lang.Boolean bool, boolean z) {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzibVar.zzd().zzh(bool);
        if (z) {
            com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
            com.google.android.gms.measurement.internal.zzib zzibVar2 = zzd.zzu;
            zzd.zzg();
            android.content.SharedPreferences.Editor edit = zzd.zzd().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzas, reason: merged with bridge method [inline-methods] */
    public final void zzak() {
        zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        java.lang.String zza = zzibVar.zzd().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzN("app", "_npa", null, zzibVar.zzaZ().currentTimeMillis());
            } else {
                zzN("app", "_npa", java.lang.Long.valueOf(true != "true".equals(zza) ? 0L : 1L), zzibVar.zzaZ().currentTimeMillis());
            }
        }
        if (!this.zzu.zzB() || !this.zzc) {
            zzibVar.zzaV().zzj().zza("Updating Scion state (FE)");
            this.zzu.zzt().zzi();
        } else {
            zzibVar.zzaV().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzU();
            this.zzu.zzh().zza.zza();
            zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzjy(this));
        }
    }

    final void zzA(com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        zzg();
        boolean z = (zzjkVar.zzo(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE) && zzjkVar.zzo(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE)) || this.zzu.zzt().zzO();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (z != zzibVar.zzE()) {
            zzibVar.zzD(z);
            com.google.android.gms.measurement.internal.zzhg zzd = this.zzu.zzd();
            com.google.android.gms.measurement.internal.zzib zzibVar2 = zzd.zzu;
            zzd.zzg();
            java.lang.Boolean valueOf = zzd.zzd().contains("measurement_enabled_from_api") ? java.lang.Boolean.valueOf(zzd.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzar(java.lang.Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzB(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzC(str, str2, bundle, true, true, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzC(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) {
        android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : bundle;
        if (java.util.Objects.equals(str2, com.google.firebase.analytics.FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzu.zzs().zzj(bundle2, j);
        } else {
            zzJ(str == null ? "app" : str, str2, j, bundle2, z2, !z2 || this.zzd == null || com.google.android.gms.measurement.internal.zzpo.zzZ(str2), z, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD() {
        com.google.android.gms.measurement.internal.zzib zzibVar;
        com.google.android.gms.measurement.internal.zzfw zzfwVar;
        com.google.android.gms.measurement.internal.zzoc zzocVar;
        com.google.android.gms.measurement.internal.zzoc zzocVar2;
        com.google.android.gms.measurement.internal.zzli zzliVar;
        com.google.android.gms.internal.measurement.zzkp zzkpVar;
        zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        zzibVar2.zzaV().zzj().zza("Handle tcf update.");
        android.content.SharedPreferences zze = zzibVar2.zzd().zze();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.google.android.gms.measurement.internal.zzfw zzfwVar2 = com.google.android.gms.measurement.internal.zzfx.zzaZ;
        if (((java.lang.Boolean) zzfwVar2.zzb(null)).booleanValue()) {
            int i = com.google.android.gms.measurement.internal.zzoe.zzb;
            com.google.android.gms.internal.measurement.zzko zzkoVar = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            com.google.android.gms.measurement.internal.zzod zzodVar = com.google.android.gms.measurement.internal.zzod.CONSENT;
            java.util.Map.Entry m = kotlin.UByte$$ExternalSyntheticBackport0.m(zzkoVar, zzodVar);
            com.google.android.gms.internal.measurement.zzko zzkoVar2 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            com.google.android.gms.measurement.internal.zzod zzodVar2 = com.google.android.gms.measurement.internal.zzod.FLEXIBLE_LEGITIMATE_INTEREST;
            zzfwVar = zzfwVar2;
            zzibVar = zzibVar2;
            com.google.common.collect.ImmutableMap ofEntries = com.google.common.collect.ImmutableMap.ofEntries(m, kotlin.UByte$$ExternalSyntheticBackport0.m(zzkoVar2, zzodVar2), kotlin.UByte$$ExternalSyntheticBackport0.m(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, zzodVar), kotlin.UByte$$ExternalSyntheticBackport0.m(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, zzodVar), kotlin.UByte$$ExternalSyntheticBackport0.m(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, zzodVar2), kotlin.UByte$$ExternalSyntheticBackport0.m(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, zzodVar2), kotlin.UByte$$ExternalSyntheticBackport0.m(com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, zzodVar2));
            com.google.common.collect.ImmutableSet of = com.google.common.collect.ImmutableSet.of("CH");
            char[] cArr = new char[5];
            boolean contains = zze.contains("IABTCF_TCString");
            int zzb = com.google.android.gms.measurement.internal.zzoe.zzb(zze, "IABTCF_CmpSdkID");
            int zzb2 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, "IABTCF_PolicyVersion");
            int zzb3 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES);
            int zzb4 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, "IABTCF_PurposeOneTreatment");
            int zzb5 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, "IABTCF_EnableAdvertiserConsentMode");
            java.lang.String zza = com.google.android.gms.measurement.internal.zzoe.zza(zze, "IABTCF_PublisherCC");
            com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
            com.google.common.collect.UnmodifiableIterator it = ofEntries.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzko zzkoVar3 = (com.google.android.gms.internal.measurement.zzko) it.next();
                int zza2 = zzkoVar3.zza();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza2).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(zza2);
                java.lang.String zza3 = com.google.android.gms.measurement.internal.zzoe.zza(zze, sb.toString());
                if (android.text.TextUtils.isEmpty(zza3) || zza3.length() < 755) {
                    zzkpVar = com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = java.lang.Character.digit(zza3.charAt(754), 10);
                    zzkpVar = (digit < 0 || digit > com.google.android.gms.internal.measurement.zzkp.values().length || digit == 0) ? com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED : digit != 1 ? digit != 2 ? com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                builder.put(zzkoVar3, zzkpVar);
            }
            com.google.common.collect.ImmutableMap buildOrThrow = builder.buildOrThrow();
            java.lang.String zza4 = com.google.android.gms.measurement.internal.zzoe.zza(zze, "IABTCF_PurposeConsents");
            java.lang.String zza5 = com.google.android.gms.measurement.internal.zzoe.zza(zze, "IABTCF_VendorConsents");
            boolean z = !android.text.TextUtils.isEmpty(zza5) && zza5.length() >= 755 && zza5.charAt(754) == '1';
            java.lang.String zza6 = com.google.android.gms.measurement.internal.zzoe.zza(zze, "IABTCF_PurposeLegitimateInterests");
            java.lang.String zza7 = com.google.android.gms.measurement.internal.zzoe.zza(zze, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !android.text.TextUtils.isEmpty(zza7) && zza7.length() >= 755 && zza7.charAt(754) == '1';
            cArr[0] = '2';
            zzocVar = new com.google.android.gms.measurement.internal.zzoc(com.google.android.gms.measurement.internal.zzoe.zzd(ofEntries, buildOrThrow, of, cArr, zzb, zzb5, zzb3, zzb2, zzb4, zza, zza4, zza6, z, z2, contains));
        } else {
            zzibVar = zzibVar2;
            zzfwVar = zzfwVar2;
            java.lang.String zza8 = com.google.android.gms.measurement.internal.zzoe.zza(zze, "IABTCF_VendorConsents");
            if (!"".equals(zza8) && zza8.length() > 754) {
                hashMap.put("GoogleConsent", java.lang.String.valueOf(zza8.charAt(754)));
            }
            int zzb6 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES);
            if (zzb6 != -1) {
                hashMap.put("gdprApplies", java.lang.String.valueOf(zzb6));
            }
            int zzb7 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, "IABTCF_EnableAdvertiserConsentMode");
            if (zzb7 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", java.lang.String.valueOf(zzb7));
            }
            int zzb8 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, "IABTCF_PolicyVersion");
            if (zzb8 != -1) {
                hashMap.put("PolicyVersion", java.lang.String.valueOf(zzb8));
            }
            java.lang.String zza9 = com.google.android.gms.measurement.internal.zzoe.zza(zze, "IABTCF_PurposeConsents");
            if (!"".equals(zza9)) {
                hashMap.put("PurposeConsents", zza9);
            }
            int zzb9 = com.google.android.gms.measurement.internal.zzoe.zzb(zze, "IABTCF_CmpSdkID");
            if (zzb9 != -1) {
                hashMap.put("CmpSdkID", java.lang.String.valueOf(zzb9));
            }
            zzocVar = new com.google.android.gms.measurement.internal.zzoc(hashMap);
        }
        zzibVar.zzaV().zzk().zzb("Tcf preferences read", zzocVar);
        if (!zzibVar.zzc().zzp(null, zzfwVar)) {
            if (zzibVar.zzd().zzm(zzocVar)) {
                android.os.Bundle zzb10 = zzocVar.zzb();
                zzibVar.zzaV().zzk().zzb("Consent generated from Tcf", zzb10);
                if (zzb10 != android.os.Bundle.EMPTY) {
                    zzp(zzb10, -30, zzibVar.zzaZ().currentTimeMillis());
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("_tcfd", zzocVar.zze());
                zzF("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
        zzd.zzg();
        java.lang.String string = zzd.zzd().getString("stored_tcf_param", "");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (android.text.TextUtils.isEmpty(string)) {
            zzocVar2 = new com.google.android.gms.measurement.internal.zzoc(hashMap2);
        } else {
            for (java.lang.String str : string.split(";")) {
                java.lang.String[] split = str.split(com.ironsource.X3.j.b);
                if (split.length >= 2 && com.google.android.gms.measurement.internal.zzoe.zza.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            zzocVar2 = new com.google.android.gms.measurement.internal.zzoc(hashMap2);
        }
        if (zzibVar.zzd().zzm(zzocVar)) {
            android.os.Bundle zzb11 = zzocVar.zzb();
            zzibVar.zzaV().zzk().zzb("Consent generated from Tcf", zzb11);
            if (zzb11 != android.os.Bundle.EMPTY) {
                zzliVar = this;
                zzliVar.zzp(zzb11, -30, zzibVar.zzaZ().currentTimeMillis());
            } else {
                zzliVar = this;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("_tcfm", zzocVar.zzd(zzocVar2));
            bundle2.putString("_tcfd2", zzocVar.zzc());
            bundle2.putString("_tcfd", zzocVar.zze());
            zzliVar.zzF("auto", "_tcf", bundle2);
        }
    }

    public final void zzE() {
        zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new com.google.android.gms.measurement.internal.zzka(this, this.zzu);
            this.zzs = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzld
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
                    com.google.android.gms.measurement.internal.zzli.this.zzaf(sharedPreferences, str);
                }
            };
        }
        zzibVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    final void zzF(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        zzg();
        zzG(str, str2, this.zzu.zzaZ().currentTimeMillis(), bundle);
    }

    final void zzG(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle) {
        zzg();
        zzH(str, str2, j, bundle, true, this.zzd == null || com.google.android.gms.measurement.internal.zzpo.zzZ(str2), true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzH(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        boolean z4;
        android.os.Bundle bundle2;
        java.lang.String str4;
        java.util.ArrayList arrayList;
        long j2;
        android.os.Bundle[] bundleArr;
        int i;
        java.lang.String str5 = str;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (!zzibVar.zzB()) {
            this.zzu.zzaV().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        java.util.List zzp = this.zzu.zzv().zzp();
        if (zzp != null && !zzp.contains(str2)) {
            this.zzu.zzaV().zzj().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzibVar.zzp() ? java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaY().getClassLoader()) : java.lang.Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, android.content.Context.class).invoke(null, this.zzu.zzaY());
                } catch (java.lang.Exception e) {
                    this.zzu.zzaV().zze().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                this.zzu.zzaV().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        if (!zzibVar2.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbg) && com.google.firebase.messaging.Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
            zzibVar2.zzaU();
            zzN("auto", "_lgclid", bundle.getString("gclid"), zzibVar2.zzaZ().currentTimeMillis());
        }
        zzibVar2.zzaU();
        if (z && com.google.android.gms.measurement.internal.zzpo.zzaf(str2)) {
            zzibVar2.zzk().zzI(bundle, zzibVar2.zzd().zzt.zza());
        }
        if (!z3) {
            zzibVar2.zzaU();
            if (!"_iap".equals(str2)) {
                com.google.android.gms.measurement.internal.zzib zzibVar3 = this.zzu;
                com.google.android.gms.measurement.internal.zzpo zzk = zzibVar3.zzk();
                if (zzk.zzj(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (zzk.zzl(androidx.core.app.NotificationCompat.CATEGORY_EVENT, com.google.android.gms.measurement.internal.zzjl.zza, com.google.android.gms.measurement.internal.zzjl.zzb, str2)) {
                        zzk.zzu.zzc();
                        if (zzk.zzm(androidx.core.app.NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                    if (i != 0) {
                        zzibVar2.zzaV().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzibVar2.zzl().zza(str2));
                        com.google.android.gms.measurement.internal.zzpo zzk2 = zzibVar3.zzk();
                        zzibVar3.zzc();
                        zzibVar3.zzk().zzN(this.zzv, null, i, "_ev", zzk2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
                i = 2;
                if (i != 0) {
                }
            }
        }
        zzibVar2.zzaU();
        com.google.android.gms.measurement.internal.zzib zzibVar4 = this.zzu;
        com.google.android.gms.measurement.internal.zzlt zzh = zzibVar4.zzs().zzh(false);
        if (zzh != null && !bundle.containsKey("_sc")) {
            zzh.zzd = true;
        }
        com.google.android.gms.measurement.internal.zzpo.zzav(zzh, bundle, z && !z3);
        boolean equals = "am".equals(str5);
        boolean zzZ = com.google.android.gms.measurement.internal.zzpo.zzZ(str2);
        if (!z || this.zzd == null || zzZ) {
            z4 = equals;
        } else {
            if (!equals) {
                zzibVar2.zzaV().zzj().zzc("Passing event to registered event handler (FE)", zzibVar2.zzl().zza(str2), zzibVar2.zzl().zze(bundle));
                com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar5 = this.zzu;
        if (zzibVar5.zzH()) {
            int zzn = zzibVar2.zzk().zzn(str2);
            if (zzn != 0) {
                zzibVar2.zzaV().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzibVar2.zzl().zza(str2));
                com.google.android.gms.measurement.internal.zzpo zzk3 = zzibVar2.zzk();
                zzibVar2.zzc();
                zzibVar5.zzk().zzN(this.zzv, str3, zzn, "_ev", zzk3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            java.lang.String str6 = "_o";
            android.os.Bundle zzF = zzibVar2.zzk().zzF(str3, str2, bundle, com.google.android.gms.common.util.CollectionUtils.listOf((java.lang.Object[]) new java.lang.String[]{"_o", "_sn", "_sc", "_si"}), z3);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzF);
            zzibVar2.zzaU();
            if (zzibVar4.zzs().zzh(false) != null && "_ae".equals(str2)) {
                com.google.android.gms.measurement.internal.zznz zznzVar = zzibVar4.zzh().zzb;
                long elapsedRealtime = zznzVar.zzc.zzu.zzaZ().elapsedRealtime();
                long j3 = elapsedRealtime - zznzVar.zzb;
                zznzVar.zzb = elapsedRealtime;
                if (j3 > 0) {
                    zzibVar2.zzk().zzak(zzF, j3);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                com.google.android.gms.measurement.internal.zzpo zzk4 = zzibVar2.zzk();
                java.lang.String string = zzF.getString("_ffr");
                if (com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                com.google.android.gms.measurement.internal.zzib zzibVar6 = zzk4.zzu;
                if (java.util.Objects.equals(string, zzibVar6.zzd().zzq.zza())) {
                    zzibVar6.zzaV().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzibVar6.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                java.lang.String zza = zzibVar2.zzk().zzu.zzd().zzq.zza();
                if (!android.text.TextUtils.isEmpty(zza)) {
                    zzF.putString("_ffr", zza);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(zzF);
            boolean zzi = zzibVar2.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaU) ? zzibVar4.zzh().zzi() : zzibVar2.zzd().zzn.zza();
            if (zzibVar2.zzd().zzk.zza() > 0 && zzibVar2.zzd().zzp(j) && zzi) {
                zzibVar2.zzaV().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j2 = 0;
                bundle2 = zzF;
                str4 = "_ae";
                zzN("auto", "_sid", null, zzibVar2.zzaZ().currentTimeMillis());
                zzN("auto", "_sno", null, zzibVar2.zzaZ().currentTimeMillis());
                zzN("auto", "_se", null, zzibVar2.zzaZ().currentTimeMillis());
                zzibVar2.zzd().zzl.zzb(0L);
            } else {
                bundle2 = zzF;
                str4 = "_ae";
                arrayList = arrayList2;
                j2 = 0;
            }
            if (bundle2.getLong(com.google.firebase.analytics.FirebaseAnalytics.Param.EXTEND_SESSION, j2) == 1) {
                zzibVar2.zzaV().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                zzibVar5.zzh().zza.zzb(j, true);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(bundle2.keySet());
            java.util.Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                java.lang.String str7 = (java.lang.String) arrayList3.get(i2);
                if (str7 != null) {
                    zzibVar2.zzk();
                    java.lang.Object obj = bundle2.get(str7);
                    if (obj instanceof android.os.Bundle) {
                        bundleArr = new android.os.Bundle[]{(android.os.Bundle) obj};
                    } else if (obj instanceof android.os.Parcelable[]) {
                        android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                        bundleArr = (android.os.Bundle[]) java.util.Arrays.copyOf(parcelableArr, parcelableArr.length, android.os.Bundle[].class);
                    } else if (obj instanceof java.util.ArrayList) {
                        java.util.ArrayList arrayList4 = (java.util.ArrayList) obj;
                        bundleArr = (android.os.Bundle[]) arrayList4.toArray(new android.os.Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundle2.putParcelableArray(str7, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                java.util.ArrayList arrayList5 = arrayList;
                android.os.Bundle bundle3 = (android.os.Bundle) arrayList5.get(i3);
                java.lang.String str8 = i3 != 0 ? "_ep" : str2;
                java.lang.String str9 = str6;
                bundle3.putString(str9, str5);
                if (z2) {
                    bundle3 = zzibVar2.zzk().zzab(bundle3, null);
                }
                android.os.Bundle bundle4 = bundle3;
                zzibVar4.zzt().zzn(new com.google.android.gms.measurement.internal.zzbg(str8, new com.google.android.gms.measurement.internal.zzbe(bundle4), str, j), str3);
                if (!z4) {
                    java.util.Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.measurement.internal.zzjp) it.next()).onEvent(str, str2, new android.os.Bundle(bundle4), j);
                    }
                }
                i3++;
                str5 = str;
                arrayList = arrayList5;
                str6 = str9;
            }
            zzibVar2.zzaU();
            if (zzibVar4.zzs().zzh(false) == null || !str4.equals(str2)) {
                return;
            }
            zzibVar4.zzh().zzb.zzd(true, true, zzibVar2.zzaZ().elapsedRealtime());
        }
    }

    public final void zzI(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, java.lang.String str3) {
        com.google.android.gms.measurement.internal.zzib.zzL();
        zzJ("auto", str2, this.zzu.zzaZ().currentTimeMillis(), bundle, false, true, true, str3);
    }

    protected final void zzJ(java.lang.String str, java.lang.String str2, long j, android.os.Bundle bundle, boolean z, boolean z2, boolean z3, java.lang.String str3) {
        int i = com.google.android.gms.measurement.internal.zzpo.zza;
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        for (java.lang.String str4 : bundle2.keySet()) {
            java.lang.Object obj = bundle2.get(str4);
            if (obj instanceof android.os.Bundle) {
                bundle2.putBundle(str4, new android.os.Bundle((android.os.Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof android.os.Parcelable[]) {
                    android.os.Parcelable[] parcelableArr = (android.os.Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        android.os.Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof android.os.Bundle) {
                            parcelableArr[i2] = new android.os.Bundle((android.os.Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof java.util.List) {
                    java.util.List list = (java.util.List) obj;
                    while (i2 < list.size()) {
                        java.lang.Object obj2 = list.get(i2);
                        if (obj2 instanceof android.os.Bundle) {
                            list.set(i2, new android.os.Bundle((android.os.Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkb(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void zzK(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z) {
        zzL("auto", "_ldl", obj, true, this.zzu.zzaZ().currentTimeMillis());
    }

    final void zzM(java.lang.String str, java.lang.String str2, long j, java.lang.Object obj) {
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkc(this, str, str2, obj, j));
    }

    final void zzN(java.lang.String str, java.lang.String str2, java.lang.Object obj, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        if (com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof java.lang.String) {
                java.lang.String str3 = (java.lang.String) obj;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    long j2 = true != "false".equals(str3.toLowerCase(java.util.Locale.ENGLISH)) ? 0L : 1L;
                    com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
                    java.lang.Long valueOf = java.lang.Long.valueOf(j2);
                    zzibVar.zzd().zzh.zzb(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    this.zzu.zzaV().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                }
            }
            if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                str2 = "_npa";
            }
            this.zzu.zzaV().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        java.lang.String str4 = str2;
        java.lang.Object obj2 = obj;
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        if (!zzibVar2.zzB()) {
            this.zzu.zzaV().zzk().zza("User property not set since app measurement is disabled");
        } else if (zzibVar2.zzH()) {
            this.zzu.zzt().zzA(new com.google.android.gms.measurement.internal.zzpk(str4, j, obj2, str));
        }
    }

    public final java.util.List zzO(boolean z) {
        zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zza("Getting user properties (FE)");
        if (zzibVar.zzaW().zze()) {
            zzibVar.zzaV().zzb().zza("Cannot get all user properties from analytics worker thread");
            return java.util.Collections.emptyList();
        }
        zzibVar.zzaU();
        if (com.google.android.gms.measurement.internal.zzae.zza()) {
            zzibVar.zzaV().zzb().zza("Cannot get all user properties from main thread");
            return java.util.Collections.emptyList();
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new com.google.android.gms.measurement.internal.zzke(this, atomicReference, z));
        java.util.List list = (java.util.List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzibVar.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", java.lang.Boolean.valueOf(z));
        return java.util.Collections.emptyList();
    }

    public final java.util.Map zzP(java.lang.String str, java.lang.String str2, boolean z) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzaW().zze()) {
            zzibVar.zzaV().zzb().zza("Cannot get user properties from analytics worker thread");
            return java.util.Collections.emptyMap();
        }
        zzibVar.zzaU();
        if (com.google.android.gms.measurement.internal.zzae.zza()) {
            zzibVar.zzaV().zzb().zza("Cannot get user properties from main thread");
            return java.util.Collections.emptyMap();
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new com.google.android.gms.measurement.internal.zzkk(this, atomicReference, null, str, str2, z));
        java.util.List<com.google.android.gms.measurement.internal.zzpk> list = (java.util.List) atomicReference.get();
        if (list == null) {
            zzibVar.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", java.lang.Boolean.valueOf(z));
            return java.util.Collections.emptyMap();
        }
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(list.size());
        for (com.google.android.gms.measurement.internal.zzpk zzpkVar : list) {
            java.lang.Object zza = zzpkVar.zza();
            if (zza != null) {
                arrayMap.put(zzpkVar.zzb, zza);
            }
        }
        return arrayMap;
    }

    public final java.lang.String zzQ() {
        return (java.lang.String) this.zzg.get();
    }

    final void zzR(java.lang.String str) {
        this.zzg.set(str);
    }

    public final void zzS() {
        zzg();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzd().zzo.zza()) {
            zzibVar.zzaV().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long zza = zzibVar.zzd().zzp.zza();
        zzibVar.zzd().zzp.zzb(1 + zza);
        zzibVar.zzc();
        if (zza >= 5) {
            zzibVar.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzibVar.zzd().zzo.zzb(true);
        } else {
            if (this.zzr == null) {
                this.zzr = new com.google.android.gms.measurement.internal.zzkf(this, this.zzu);
            }
            this.zzr.zzb(0L);
        }
    }

    public final void zzT(long j) {
        this.zzg.set(null);
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkg(this, j));
    }

    public final void zzU() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            com.google.android.gms.measurement.internal.zzal zzc = zzibVar.zzc();
            zzc.zzu.zzaU();
            java.lang.Boolean zzr = zzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (zzr != null && zzr.booleanValue()) {
                zzibVar.zzaV().zzj().zza("Deferred Deep Link feature enabled.");
                zzibVar.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzlg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.measurement.internal.zzli.this.zzS();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
            zzd.zzg();
            java.lang.String string = zzd.zzd().getString("previous_os_version", null);
            zzd.zzu.zzu().zzw();
            java.lang.String str = android.os.Build.VERSION.RELEASE;
            if (!android.text.TextUtils.isEmpty(str) && !str.equals(string)) {
                android.content.SharedPreferences.Editor edit = zzd.zzd().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (android.text.TextUtils.isEmpty(string)) {
                return;
            }
            zzibVar.zzu().zzw();
            if (string.equals(android.os.Build.VERSION.RELEASE)) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("_po", string);
            zzF("auto", "_ou", bundle);
        }
    }

    public final void zzV(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        com.google.android.gms.measurement.internal.zzjo zzjoVar2;
        zzg();
        zzb();
        if (zzjoVar != null && zzjoVar != (zzjoVar2 = this.zzd)) {
            com.google.android.gms.common.internal.Preconditions.checkState(zzjoVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzjoVar;
    }

    public final void zzW(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjpVar);
        if (this.zze.add(zzjpVar)) {
            return;
        }
        this.zzu.zzaV().zze().zza("OnEventListener already registered");
    }

    public final void zzX(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzjpVar);
        if (this.zze.remove(zzjpVar)) {
            return;
        }
        this.zzu.zzaV().zze().zza("OnEventListener had not been registered");
    }

    public final int zzY(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzZ(android.os.Bundle bundle) {
        zzaa(bundle, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzaa(android.os.Bundle bundle, long j) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        if (!android.text.TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzu.zzaV().zze().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle2);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, "app_id", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, "origin", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, "name", java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, "value", java.lang.Object.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, java.lang.Long.class, 0L);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, java.lang.Long.class, 0L);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, java.lang.String.class, null);
        com.google.android.gms.measurement.internal.zzjg.zzb(bundle2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, android.os.Bundle.class, null);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle2.getString("name"));
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(bundle2.getString("origin"));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        java.lang.String string = bundle2.getString("name");
        java.lang.Object obj = bundle2.get("value");
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzk().zzp(string) != 0) {
            zzibVar.zzaV().zzb().zzb("Invalid conditional user property name", zzibVar.zzl().zzc(string));
            return;
        }
        if (zzibVar.zzk().zzK(string, obj) != 0) {
            zzibVar.zzaV().zzb().zzc("Invalid conditional user property value", zzibVar.zzl().zzc(string), obj);
            return;
        }
        java.lang.Object zzL = zzibVar.zzk().zzL(string, obj);
        if (zzL == null) {
            zzibVar.zzaV().zzb().zzc("Unable to normalize conditional user property value", zzibVar.zzl().zzc(string), obj);
            return;
        }
        com.google.android.gms.measurement.internal.zzjg.zza(bundle2, zzL);
        long j2 = bundle2.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!android.text.TextUtils.isEmpty(bundle2.getString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzibVar.zzc();
            if (j2 > 15552000000L || j2 < 1) {
                zzibVar.zzaV().zzb().zzc("Invalid conditional user property timeout", zzibVar.zzl().zzc(string), java.lang.Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzibVar.zzc();
        if (j3 > 15552000000L || j3 < 1) {
            zzibVar.zzaV().zzb().zzc("Invalid conditional user property time to live", zzibVar.zzl().zzc(string), java.lang.Long.valueOf(j3));
        } else {
            zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkh(this, bundle2));
        }
    }

    public final void zzab(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        long currentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzibVar.zzaW().zzj(new com.google.android.gms.measurement.internal.zzki(this, bundle2));
    }

    public final java.util.ArrayList zzac(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzaW().zze()) {
            zzibVar.zzaV().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new java.util.ArrayList(0);
        }
        zzibVar.zzaU();
        if (com.google.android.gms.measurement.internal.zzae.zza()) {
            zzibVar.zzaV().zzb().zza("Cannot get conditional user properties from main thread");
            return new java.util.ArrayList(0);
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get conditional user properties", new com.google.android.gms.measurement.internal.zzkj(this, atomicReference, null, str, str2));
        java.util.List list = (java.util.List) atomicReference.get();
        if (list != null) {
            return com.google.android.gms.measurement.internal.zzpo.zzas(list);
        }
        zzibVar.zzaV().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new java.util.ArrayList();
    }

    public final java.lang.String zzad() {
        com.google.android.gms.measurement.internal.zzlt zzl = this.zzu.zzs().zzl();
        if (zzl != null) {
            return zzl.zza;
        }
        return null;
    }

    public final java.lang.String zzae() {
        com.google.android.gms.measurement.internal.zzlt zzl = this.zzu.zzs().zzl();
        if (zzl != null) {
            return zzl.zzb;
        }
        return null;
    }

    final /* synthetic */ void zzaf(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (!zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaZ)) {
            if (java.util.Objects.equals(str, "IABTCF_TCString")) {
                zzibVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
                ((com.google.android.gms.measurement.internal.zzay) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzt)).zzb(500L);
                return;
            }
            return;
        }
        if (java.util.Objects.equals(str, "IABTCF_TCString") || java.util.Objects.equals(str, com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES) || java.util.Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzibVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((com.google.android.gms.measurement.internal.zzay) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzt)).zzb(500L);
        }
    }

    final /* synthetic */ void zzag(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        int i;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            bundle2 = new android.os.Bundle(zzibVar.zzd().zzt.zza());
            java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String next = it.next();
                java.lang.Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof java.lang.String) && !(obj instanceof java.lang.Long) && !(obj instanceof java.lang.Double)) {
                    if (zzibVar.zzk().zzt(obj)) {
                        zzibVar.zzk().zzN(this.zzv, null, 27, null, null, 0);
                    }
                    zzibVar.zzaV().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (com.google.android.gms.measurement.internal.zzpo.zzZ(next)) {
                    zzibVar.zzaV().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzibVar.zzk().zzu("param", next, zzibVar.zzc().zze(null, false), obj)) {
                    zzibVar.zzk().zzM(bundle2, next, obj);
                }
            }
            zzibVar.zzk();
            int zzc = zzibVar.zzc().zzc();
            if (bundle2.size() > zzc) {
                for (java.lang.String str : new java.util.TreeSet(bundle2.keySet())) {
                    i++;
                    if (i > zzc) {
                        bundle2.remove(str);
                    }
                }
                zzibVar.zzk().zzN(this.zzv, null, 26, null, null, 0);
                zzibVar.zzaV().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        zzibVar2.zzd().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzibVar2.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaW)) {
            this.zzu.zzt().zzH(bundle2);
        }
    }

    final /* synthetic */ void zzah(int i) {
        if (this.zzk == null) {
            this.zzk = new com.google.android.gms.measurement.internal.zzjw(this, this.zzu);
        }
        this.zzk.zzb(i * 1000);
    }

    final /* synthetic */ void zzai(java.lang.Boolean bool, boolean z) {
        zzar(bool, true);
    }

    final /* synthetic */ void zzaj(com.google.android.gms.measurement.internal.zzjk zzjkVar, long j, boolean z, boolean z2) {
        zzg();
        zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        com.google.android.gms.measurement.internal.zzjk zzl = zzibVar.zzd().zzl();
        if (j <= this.zzq && com.google.android.gms.measurement.internal.zzjk.zzu(zzl.zzb(), zzjkVar.zzb())) {
            zzibVar.zzaV().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjkVar);
            return;
        }
        com.google.android.gms.measurement.internal.zzhg zzd = zzibVar.zzd();
        com.google.android.gms.measurement.internal.zzib zzibVar2 = zzd.zzu;
        zzd.zzg();
        int zzb = zzjkVar.zzb();
        if (!zzd.zzk(zzb)) {
            zzibVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", java.lang.Integer.valueOf(zzjkVar.zzb()));
            return;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar3 = this.zzu;
        android.content.SharedPreferences.Editor edit = zzd.zzd().edit();
        edit.putString("consent_settings", zzjkVar.zzl());
        edit.putInt("consent_source", zzb);
        edit.apply();
        zzibVar.zzaV().zzk().zzb("Setting storage consent(FE)", zzjkVar);
        this.zzq = j;
        if (zzibVar3.zzt().zzP()) {
            zzibVar3.zzt().zzk(z);
        } else {
            zzibVar3.zzt().zzj(z);
        }
        if (z2) {
            zzibVar3.zzt().zzC(new java.util.concurrent.atomic.AtomicReference());
        }
    }

    final /* synthetic */ void zzal(boolean z) {
        this.zzi = false;
    }

    final /* synthetic */ int zzam() {
        return this.zzj;
    }

    final /* synthetic */ void zzan(int i) {
        this.zzj = i;
    }

    final /* synthetic */ com.google.android.gms.measurement.internal.zzay zzao() {
        return this.zzr;
    }

    final /* synthetic */ int zzap(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        this.zzn = false;
        int i = 2;
        if (message != null) {
            if ((th instanceof java.lang.IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                i = 1;
                if (message.contains("Background")) {
                    this.zzn = true;
                    return 1;
                }
            } else if ((th instanceof java.lang.SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                return 3;
            }
        }
        return i;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    public final void zzh() {
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (!(zzibVar.zzaY().getApplicationContext() instanceof android.app.Application) || this.zza == null) {
            return;
        }
        ((android.app.Application) zzibVar.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final java.lang.Boolean zzi() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Boolean) this.zzu.zzaW().zzk(atomicReference, 15000L, "boolean test flag value", new com.google.android.gms.measurement.internal.zzkd(this, atomicReference));
    }

    public final java.lang.String zzj() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.String) this.zzu.zzaW().zzk(atomicReference, 15000L, "String test flag value", new com.google.android.gms.measurement.internal.zzkn(this, atomicReference));
    }

    public final java.lang.Long zzk() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Long) this.zzu.zzaW().zzk(atomicReference, 15000L, "long test flag value", new com.google.android.gms.measurement.internal.zzko(this, atomicReference));
    }

    public final java.lang.Integer zzl() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Integer) this.zzu.zzaW().zzk(atomicReference, 15000L, "int test flag value", new com.google.android.gms.measurement.internal.zzkp(this, atomicReference));
    }

    public final java.lang.Double zzm() {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return (java.lang.Double) this.zzu.zzaW().zzk(atomicReference, 15000L, "double test flag value", new com.google.android.gms.measurement.internal.zzkq(this, atomicReference));
    }

    public final void zzn(java.lang.Boolean bool) {
        zzb();
        this.zzu.zzaW().zzj(new com.google.android.gms.measurement.internal.zzkr(this, bool));
    }

    final void zzp(android.os.Bundle bundle, int i, long j) {
        java.lang.Object obj;
        java.lang.String string;
        zzb();
        com.google.android.gms.measurement.internal.zzjk zzjkVar = com.google.android.gms.measurement.internal.zzjk.zza;
        com.google.android.gms.measurement.internal.zzjj[] zzb = com.google.android.gms.measurement.internal.zzji.STORAGE.zzb();
        int length = zzb.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            java.lang.String str = zzb[i2].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = true;
                } else if (string.equals("denied")) {
                    obj = false;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzh().zzb("Ignoring invalid consent setting", obj);
            zzibVar.zzaV().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zze = this.zzu.zzaW().zze();
        com.google.android.gms.measurement.internal.zzjk zze2 = com.google.android.gms.measurement.internal.zzjk.zze(bundle, i);
        if (zze2.zzc()) {
            zzs(zze2, zze);
        }
        com.google.android.gms.measurement.internal.zzaz zzh = com.google.android.gms.measurement.internal.zzaz.zzh(bundle, i);
        if (zzh.zzd()) {
            zzq(zzh, zze);
        }
        java.lang.Boolean zzi = com.google.android.gms.measurement.internal.zzaz.zzi(bundle);
        if (zzi != null) {
            java.lang.String str2 = i == -30 ? "tcf" : "app";
            if (zze) {
                zzN(str2, com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, zzi.toString(), j);
            } else {
                zzL(str2, com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, zzi.toString(), false, j);
            }
        }
    }

    final void zzq(com.google.android.gms.measurement.internal.zzaz zzazVar, boolean z) {
        com.google.android.gms.measurement.internal.zzks zzksVar = new com.google.android.gms.measurement.internal.zzks(this, zzazVar);
        if (!z) {
            this.zzu.zzaW().zzj(zzksVar);
        } else {
            zzg();
            zzksVar.run();
        }
    }

    public final void zzs(com.google.android.gms.measurement.internal.zzjk zzjkVar, boolean z) {
        boolean z2;
        com.google.android.gms.measurement.internal.zzjk zzjkVar2;
        boolean z3;
        boolean z4;
        zzb();
        int zzb = zzjkVar.zzb();
        if (zzb != -10) {
            com.google.android.gms.measurement.internal.zzjh zzp = zzjkVar.zzp();
            com.google.android.gms.measurement.internal.zzjh zzjhVar = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
            if (zzp == zzjhVar && zzjkVar.zzq() == zzjhVar) {
                this.zzu.zzaV().zzh().zza("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.zzh) {
            z2 = false;
            if (com.google.android.gms.measurement.internal.zzjk.zzu(zzb, this.zzo.zzb())) {
                z3 = zzjkVar.zzr(this.zzo);
                com.google.android.gms.measurement.internal.zzjj zzjjVar = com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE;
                if (zzjkVar.zzo(zzjjVar) && !this.zzo.zzo(zzjjVar)) {
                    z2 = true;
                }
                com.google.android.gms.measurement.internal.zzjk zzt = zzjkVar.zzt(this.zzo);
                this.zzo = zzt;
                zzjkVar2 = zzt;
                z4 = z2;
                z2 = true;
            } else {
                zzjkVar2 = zzjkVar;
                z3 = false;
                z4 = false;
            }
        }
        if (!z2) {
            this.zzu.zzaV().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzjkVar2);
            return;
        }
        long andIncrement = this.zzp.getAndIncrement();
        if (z3) {
            this.zzg.set(null);
            com.google.android.gms.measurement.internal.zzkt zzktVar = new com.google.android.gms.measurement.internal.zzkt(this, zzjkVar2, andIncrement, z4);
            if (!z) {
                this.zzu.zzaW().zzl(zzktVar);
                return;
            } else {
                zzg();
                zzktVar.run();
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzku zzkuVar = new com.google.android.gms.measurement.internal.zzku(this, zzjkVar2, andIncrement, z4);
        if (z) {
            zzg();
            zzkuVar.run();
        } else if (zzb == 30 || zzb == -10) {
            this.zzu.zzaW().zzl(zzkuVar);
        } else {
            this.zzu.zzaW().zzj(zzkuVar);
        }
    }

    final void zzt(java.lang.Runnable runnable) {
        zzb();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzaW().zze()) {
            zzibVar.zzaV().zzb().zza("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (zzibVar.zzaW().zzf()) {
            zzibVar.zzaV().zzb().zza("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzibVar.zzaU();
        if (com.google.android.gms.measurement.internal.zzae.zza()) {
            zzibVar.zzaV().zzb().zza("Cannot retrieve and upload batches from main thread");
            return;
        }
        zzibVar.zzaV().zzk().zza("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (!z) {
            zzibVar.zzaV().zzk().zza("[sgtm] Getting upload batches from service (FE)");
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            zzibVar.zzaW().zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.measurement.internal.zzli.this.zzu.zzt().zzx(atomicReference, com.google.android.gms.measurement.internal.zzon.zza(com.google.android.gms.measurement.internal.zzlr.SGTM_CLIENT));
                }
            });
            com.google.android.gms.measurement.internal.zzop zzopVar = (com.google.android.gms.measurement.internal.zzop) atomicReference.get();
            if (zzopVar == null) {
                break;
            }
            java.util.List list = zzopVar.zza;
            if (!list.isEmpty()) {
                zzibVar.zzaV().zzk().zzb("[sgtm] Retrieved upload batches. count", java.lang.Integer.valueOf(list.size()));
                i += list.size();
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    com.google.android.gms.measurement.internal.zzlq zzaq = zzaq((com.google.android.gms.measurement.internal.zzol) it.next());
                    if (zzaq == com.google.android.gms.measurement.internal.zzlq.SUCCESS) {
                        i2++;
                    } else if (zzaq == com.google.android.gms.measurement.internal.zzlq.BACKOFF) {
                        z = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        zzibVar.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        runnable.run();
    }

    final void zzu(long j) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new com.google.android.gms.measurement.internal.zzjt(this, this.zzu);
        }
        this.zzl.zzb(j);
    }

    final void zzv() {
        zzg();
        com.google.android.gms.measurement.internal.zzay zzayVar = this.zzl;
        if (zzayVar != null) {
            zzayVar.zzd();
        }
    }

    final void zzw() {
        com.google.android.gms.internal.measurement.zzql.zza();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaQ)) {
            if (zzibVar.zzaW().zze()) {
                zzibVar.zzaV().zzb().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzibVar.zzaU();
            if (com.google.android.gms.measurement.internal.zzae.zza()) {
                zzibVar.zzaV().zzb().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzibVar.zzaV().zzk().zza("Getting trigger URIs (FE)");
            final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
            zzibVar.zzaW().zzk(atomicReference, 10000L, "get trigger URIs", new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzkz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.measurement.internal.zzli zzliVar = com.google.android.gms.measurement.internal.zzli.this;
                    zzliVar.zzu.zzt().zzw(atomicReference, zzliVar.zzu.zzd().zzi.zza());
                }
            });
            final java.util.List list = (java.util.List) atomicReference.get();
            if (list == null) {
                zzibVar.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzibVar.zzaW().zzj(new java.lang.Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.measurement.internal.zzli zzliVar = com.google.android.gms.measurement.internal.zzli.this;
                        zzliVar.zzg();
                        if (android.os.Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        java.util.List<com.google.android.gms.measurement.internal.zzog> list2 = list;
                        android.util.SparseArray zzf = zzliVar.zzu.zzd().zzf();
                        for (com.google.android.gms.measurement.internal.zzog zzogVar : list2) {
                            int i = zzogVar.zzc;
                            if (!zzf.contains(i) || ((java.lang.Long) zzf.get(i)).longValue() < zzogVar.zzb) {
                                zzliVar.zzy().add(zzogVar);
                            }
                        }
                        zzliVar.zzz();
                    }
                });
            }
        }
    }

    final boolean zzx() {
        return this.zzn;
    }

    final java.util.PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new java.util.PriorityQueue(java.util.Comparator.comparing(com.google.android.gms.measurement.internal.zzlb.zza, com.google.android.gms.measurement.internal.zzlc.zza));
        }
        return this.zzm;
    }

    final void zzz() {
        com.google.android.gms.measurement.internal.zzog zzogVar;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty() || this.zzi || (zzogVar = (com.google.android.gms.measurement.internal.zzog) zzy().poll()) == null) {
            return;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzT = zzibVar.zzk().zzT();
        if (zzT != null) {
            this.zzi = true;
            com.google.android.gms.measurement.internal.zzgr zzk = zzibVar.zzaV().zzk();
            java.lang.String str = zzogVar.zza;
            zzk.zzb("Registering trigger URI", str);
            com.google.common.util.concurrent.ListenableFuture<kotlin.Unit> registerTriggerAsync = zzT.registerTriggerAsync(android.net.Uri.parse(str));
            if (registerTriggerAsync != null) {
                com.google.common.util.concurrent.Futures.addCallback(registerTriggerAsync, new com.google.android.gms.measurement.internal.zzjv(this, zzogVar), new com.google.android.gms.measurement.internal.zzju(this));
            } else {
                this.zzi = false;
                zzy().add(zzogVar);
            }
        }
    }

    public final void zzL(java.lang.String str, java.lang.String str2, java.lang.Object obj, boolean z, long j) {
        int i;
        if (z) {
            i = this.zzu.zzk().zzp(str2);
        } else {
            com.google.android.gms.measurement.internal.zzpo zzk = this.zzu.zzk();
            if (zzk.zzj("user property", str2)) {
                if (zzk.zzl("user property", com.google.android.gms.measurement.internal.zzjn.zza, null, str2)) {
                    zzk.zzu.zzc();
                    if (zzk.zzm("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        if (i != 0) {
            com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
            com.google.android.gms.measurement.internal.zzpo zzk2 = zzibVar.zzk();
            zzibVar.zzc();
            java.lang.String zzC = zzk2.zzC(str2, 24, true);
            int length = str2 != null ? str2.length() : 0;
            this.zzu.zzk().zzN(this.zzv, null, i, "_ev", zzC, length);
            return;
        }
        java.lang.String str3 = str == null ? "app" : str;
        if (obj == null) {
            zzM(str3, str2, j, null);
            return;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar2 = this.zzu;
        int zzK = zzibVar2.zzk().zzK(str2, obj);
        if (zzK == 0) {
            java.lang.Object zzL = zzibVar2.zzk().zzL(str2, obj);
            if (zzL != null) {
                zzM(str3, str2, j, zzL);
                return;
            }
            return;
        }
        com.google.android.gms.measurement.internal.zzpo zzk3 = zzibVar2.zzk();
        zzibVar2.zzc();
        java.lang.String zzC2 = zzk3.zzC(str2, 24, true);
        int length2 = ((obj instanceof java.lang.String) || (obj instanceof java.lang.CharSequence)) ? obj.toString().length() : 0;
        this.zzu.zzk().zzN(this.zzv, null, zzK, "_ev", zzC2, length2);
    }
}

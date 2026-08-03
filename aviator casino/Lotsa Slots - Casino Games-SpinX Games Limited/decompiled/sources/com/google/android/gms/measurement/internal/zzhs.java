package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzhs extends com.google.android.gms.measurement.internal.zzor implements com.google.android.gms.measurement.internal.zzak {
    final java.util.Map zza;
    final java.util.Map zzb;
    final java.util.Map zzc;
    final androidx.collection.LruCache zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final java.util.Map zzf;
    private final java.util.Map zzh;
    private final java.util.Map zzi;
    private final java.util.Map zzj;
    private final java.util.Map zzk;
    private final java.util.Map zzl;

    zzhs(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
        this.zzf = new androidx.collection.ArrayMap();
        this.zza = new androidx.collection.ArrayMap();
        this.zzb = new androidx.collection.ArrayMap();
        this.zzc = new androidx.collection.ArrayMap();
        this.zzh = new androidx.collection.ArrayMap();
        this.zzj = new androidx.collection.ArrayMap();
        this.zzk = new androidx.collection.ArrayMap();
        this.zzl = new androidx.collection.ArrayMap();
        this.zzi = new androidx.collection.ArrayMap();
        this.zzd = new com.google.android.gms.measurement.internal.zzhl(this, 20);
        this.zze = new com.google.android.gms.measurement.internal.zzhm(this);
    }

    private final void zzE(java.lang.String str) {
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        java.util.Map map = this.zzh;
        if (map.get(str) == null) {
            com.google.android.gms.measurement.internal.zzaq zzy = this.zzg.zzj().zzy(str);
            if (zzy != null) {
                com.google.android.gms.internal.measurement.zzgk zzgkVar = (com.google.android.gms.internal.measurement.zzgk) zzH(str, zzy.zza).zzcl();
                zzF(str, zzgkVar);
                this.zzf.put(str, zzI((com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc()));
                map.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc());
                zzG(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc());
                this.zzj.put(str, zzgkVar.zzh());
                this.zzk.put(str, zzy.zzb);
                this.zzl.put(str, zzy.zzc);
                return;
            }
            this.zzf.put(str, null);
            this.zzb.put(str, null);
            this.zza.put(str, null);
            this.zzc.put(str, null);
            map.put(str, null);
            this.zzj.put(str, null);
            this.zzk.put(str, null);
            this.zzl.put(str, null);
            this.zzi.put(str, null);
        }
    }

    private final void zzF(java.lang.String str, com.google.android.gms.internal.measurement.zzgk zzgkVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
        androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
        java.util.Iterator it = zzgkVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzgh) it.next()).zza());
        }
        for (int i = 0; i < zzgkVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) zzgkVar.zzb(i).zzcl();
            if (zzgiVar.zza().isEmpty()) {
                this.zzu.zzaV().zze().zza("EventConfig contained null event name");
            } else {
                java.lang.String zza = zzgiVar.zza();
                java.lang.String zzb = com.google.android.gms.measurement.internal.zzjl.zzb(zzgiVar.zza());
                if (!android.text.TextUtils.isEmpty(zzb)) {
                    zzgiVar.zzb(zzb);
                    zzgkVar.zzc(i, zzgiVar);
                }
                if (zzgiVar.zzc() && zzgiVar.zzd()) {
                    arrayMap.put(zza, true);
                }
                if (zzgiVar.zze() && zzgiVar.zzf()) {
                    arrayMap2.put(zzgiVar.zza(), true);
                }
                if (zzgiVar.zzg()) {
                    if (zzgiVar.zzh() < 2 || zzgiVar.zzh() > 65535) {
                        this.zzu.zzaV().zze().zzc("Invalid sampling rate. Event name, sample rate", zzgiVar.zza(), java.lang.Integer.valueOf(zzgiVar.zzh()));
                    } else {
                        arrayMap3.put(zzgiVar.zza(), java.lang.Integer.valueOf(zzgiVar.zzh()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, arrayMap);
        this.zzc.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    private final void zzG(final java.lang.String str, com.google.android.gms.internal.measurement.zzgl zzglVar) {
        if (zzglVar.zzj() == 0) {
            this.zzd.remove(str);
            return;
        }
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("EES programs found", java.lang.Integer.valueOf(zzglVar.zzj()));
        com.google.android.gms.internal.measurement.zzja zzjaVar = (com.google.android.gms.internal.measurement.zzja) zzglVar.zzi().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zza("internal.remoteConfig", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzhr
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new com.google.android.gms.measurement.internal.zzhn(com.google.android.gms.measurement.internal.zzhs.this, str));
                }
            });
            zzcVar.zza("internal.appMetadata", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzho
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    final com.google.android.gms.measurement.internal.zzhs zzhsVar = com.google.android.gms.measurement.internal.zzhs.this;
                    final java.lang.String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzhq
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ java.lang.Object call() {
                            com.google.android.gms.measurement.internal.zzhs zzhsVar2 = com.google.android.gms.measurement.internal.zzhs.this;
                            com.google.android.gms.measurement.internal.zzav zzj = zzhsVar2.zzg.zzj();
                            java.lang.String str3 = str2;
                            com.google.android.gms.measurement.internal.zzh zzu = zzj.zzu(str3);
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(com.ironsource.M6.H, "android");
                            hashMap.put("package_name", str3);
                            zzhsVar2.zzu.zzc().zzi();
                            hashMap.put("gmp_version", 130000L);
                            if (zzu != null) {
                                java.lang.String zzr = zzu.zzr();
                                if (zzr != null) {
                                    hashMap.put("app_version", zzr);
                                }
                                hashMap.put("app_version_int", java.lang.Long.valueOf(zzu.zzt()));
                                hashMap.put("dynamite_version", java.lang.Long.valueOf(zzu.zzB()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zza("internal.logger", new java.util.concurrent.Callable() { // from class: com.google.android.gms.measurement.internal.zzhp
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(com.google.android.gms.measurement.internal.zzhs.this.zze);
                }
            });
            zzcVar.zzf(zzjaVar);
            this.zzd.put(str, zzcVar);
            zzibVar.zzaV().zzk().zzc("EES program loaded for appId, activities", str, java.lang.Integer.valueOf(zzjaVar.zzb().zzb()));
            java.util.Iterator it = zzjaVar.zzb().zza().iterator();
            while (it.hasNext()) {
                zzibVar.zzaV().zzk().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zziy) it.next()).zza());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzu.zzaV().zzb().zzb("Failed to load EES program. appId", str);
        }
    }

    private final com.google.android.gms.internal.measurement.zzgl zzH(java.lang.String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzgl.zzs();
        }
        try {
            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) ((com.google.android.gms.internal.measurement.zzgk) com.google.android.gms.measurement.internal.zzpj.zzw(com.google.android.gms.internal.measurement.zzgl.zzr(), bArr)).zzbc();
            this.zzu.zzaV().zzk().zzc("Parsed config. version, gmp_app_id", zzglVar.zza() ? java.lang.Long.valueOf(zzglVar.zzb()) : null, zzglVar.zzc() ? zzglVar.zzd() : null);
            return zzglVar;
        } catch (com.google.android.gms.internal.measurement.zzmq e) {
            this.zzu.zzaV().zze().zzc("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
            return com.google.android.gms.internal.measurement.zzgl.zzs();
        } catch (java.lang.RuntimeException e2) {
            this.zzu.zzaV().zze().zzc("Unable to merge remote config. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e2);
            return com.google.android.gms.internal.measurement.zzgl.zzs();
        }
    }

    private static final java.util.Map zzI(com.google.android.gms.internal.measurement.zzgl zzglVar) {
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        if (zzglVar != null) {
            for (com.google.android.gms.internal.measurement.zzgt zzgtVar : zzglVar.zze()) {
                arrayMap.put(zzgtVar.zza(), zzgtVar.zzb());
            }
        }
        return arrayMap;
    }

    private static final com.google.android.gms.measurement.internal.zzjj zzJ(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return com.google.android.gms.measurement.internal.zzjj.AD_STORAGE;
        }
        if (i2 == 2) {
            return com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return com.google.android.gms.measurement.internal.zzjj.AD_PERSONALIZATION;
    }

    final com.google.android.gms.measurement.internal.zzjh zzA(java.lang.String str, com.google.android.gms.measurement.internal.zzjj zzjjVar) {
        zzg();
        zzE(str);
        com.google.android.gms.internal.measurement.zzgf zzx = zzx(str);
        if (zzx == null) {
            return com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzx.zzf()) {
            if (zzJ(zzfuVar.zzb()) == zzjjVar) {
                int zzc = zzfuVar.zzc() - 1;
                return zzc != 1 ? zzc != 2 ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : com.google.android.gms.measurement.internal.zzjh.DENIED : com.google.android.gms.measurement.internal.zzjh.GRANTED;
            }
        }
        return com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
    }

    final boolean zzB(java.lang.String str) {
        zzg();
        zzE(str);
        com.google.android.gms.internal.measurement.zzgf zzx = zzx(str);
        if (zzx == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzx.zza()) {
            if (zzfuVar.zzb() == 3 && zzfuVar.zzd() == 3) {
                return true;
            }
        }
        return false;
    }

    final /* synthetic */ com.google.android.gms.internal.measurement.zzc zzC(java.lang.String str) {
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.measurement.internal.zzaq zzy = this.zzg.zzj().zzy(str);
        if (zzy == null) {
            return null;
        }
        this.zzu.zzaV().zzk().zzb("Populate EES config from database on cache miss. appId", str);
        zzG(str, zzH(str, zzy.zza));
        return (com.google.android.gms.internal.measurement.zzc) this.zzd.snapshot().get(str);
    }

    final /* synthetic */ java.util.Map zzD() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzak
    public final java.lang.String zza(java.lang.String str, java.lang.String str2) {
        zzg();
        zzE(str);
        java.util.Map map = (java.util.Map) this.zzf.get(str);
        if (map != null) {
            return (java.lang.String) map.get(str2);
        }
        return null;
    }

    protected final com.google.android.gms.internal.measurement.zzgl zzb(java.lang.String str) {
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzE(str);
        return (com.google.android.gms.internal.measurement.zzgl) this.zzh.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        return false;
    }

    final java.lang.String zzc(java.lang.String str) {
        zzg();
        zzE(str);
        return (java.lang.String) this.zzj.get(str);
    }

    protected final java.lang.String zzd(java.lang.String str) {
        zzg();
        return (java.lang.String) this.zzk.get(str);
    }

    protected final java.lang.String zze(java.lang.String str) {
        zzg();
        return (java.lang.String) this.zzl.get(str);
    }

    protected final void zzf(java.lang.String str) {
        zzg();
        this.zzk.put(str, null);
    }

    final void zzh(java.lang.String str) {
        zzg();
        this.zzh.remove(str);
    }

    protected final boolean zzi(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3) {
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzgk zzgkVar = (com.google.android.gms.internal.measurement.zzgk) zzH(str, bArr).zzcl();
        zzF(str, zzgkVar);
        zzG(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc());
        this.zzj.put(str, zzgkVar.zzh());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzf.put(str, zzI((com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc()));
        this.zzg.zzj().zzag(str, new java.util.ArrayList(zzgkVar.zzd()));
        try {
            zzgkVar.zze();
            bArr = ((com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc()).zzcc();
        } catch (java.lang.RuntimeException e) {
            this.zzu.zzaV().zze().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e);
        }
        com.google.android.gms.measurement.internal.zzav zzj = this.zzg.zzj();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        zzj.zzg();
        zzj.zzay();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzj.zze().update("apps", contentValues, "app_id = ?", new java.lang.String[]{str}) == 0) {
                zzj.zzu.zzaV().zzb().zzb("Failed to update remote config (got 0). appId", com.google.android.gms.measurement.internal.zzgt.zzl(str));
            }
        } catch (android.database.sqlite.SQLiteException e2) {
            zzj.zzu.zzaV().zzb().zzc("Error storing remote config. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), e2);
        }
        zzgkVar.zzf();
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzgl) zzgkVar.zzbc());
        return true;
    }

    final boolean zzj(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        zzg();
        zzE(str);
        if (zzn(str) && com.google.android.gms.measurement.internal.zzpo.zzZ(str2)) {
            return true;
        }
        if (zzo(str) && com.google.android.gms.measurement.internal.zzpo.zzh(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.zzb.get(str);
        if (map == null || (bool = (java.lang.Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzk(java.lang.String str, java.lang.String str2) {
        java.lang.Boolean bool;
        zzg();
        zzE(str);
        if ("ecommerce_purchase".equals(str2) || com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE.equals(str2) || com.google.firebase.analytics.FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        java.util.Map map = (java.util.Map) this.zzc.get(str);
        if (map == null || (bool = (java.lang.Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final java.util.Set zzl(java.lang.String str) {
        zzg();
        zzE(str);
        return (java.util.Set) this.zza.get(str);
    }

    final int zzm(java.lang.String str, java.lang.String str2) {
        java.lang.Integer num;
        zzg();
        zzE(str);
        java.util.Map map = (java.util.Map) this.zzi.get(str);
        if (map == null || (num = (java.lang.Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    final boolean zzn(java.lang.String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzo(java.lang.String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    final boolean zzp(java.lang.String str) {
        zzg();
        zzE(str);
        java.util.Map map = this.zza;
        if (map.get(str) != null) {
            return ((java.util.Set) map.get(str)).contains("device_model") || ((java.util.Set) map.get(str)).contains(com.facebook.devicerequests.internal.DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    final boolean zzq(java.lang.String str) {
        zzg();
        zzE(str);
        java.util.Map map = this.zza;
        if (map.get(str) != null) {
            return ((java.util.Set) map.get(str)).contains("os_version") || ((java.util.Set) map.get(str)).contains(com.facebook.devicerequests.internal.DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    final boolean zzr(java.lang.String str) {
        zzg();
        zzE(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("user_id");
    }

    final boolean zzs(java.lang.String str) {
        zzg();
        zzE(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("google_signals");
    }

    final boolean zzt(java.lang.String str) {
        zzg();
        zzE(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("app_instance_id");
    }

    final boolean zzu(java.lang.String str) {
        zzg();
        zzE(str);
        java.util.Map map = this.zza;
        return map.get(str) != null && ((java.util.Set) map.get(str)).contains("enhanced_user_id");
    }

    final boolean zzv(java.lang.String str, com.google.android.gms.measurement.internal.zzjj zzjjVar) {
        zzg();
        zzE(str);
        com.google.android.gms.internal.measurement.zzgf zzx = zzx(str);
        if (zzx == null) {
            return false;
        }
        java.util.Iterator it = zzx.zza().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.zzfu zzfuVar = (com.google.android.gms.internal.measurement.zzfu) it.next();
            if (zzjjVar == zzJ(zzfuVar.zzb())) {
                if (zzfuVar.zzc() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    final com.google.android.gms.measurement.internal.zzjj zzw(java.lang.String str, com.google.android.gms.measurement.internal.zzjj zzjjVar) {
        zzg();
        zzE(str);
        com.google.android.gms.internal.measurement.zzgf zzx = zzx(str);
        if (zzx == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : zzx.zzb()) {
            if (zzjjVar == zzJ(zzfwVar.zzb())) {
                return zzJ(zzfwVar.zzc());
            }
        }
        return null;
    }

    final com.google.android.gms.internal.measurement.zzgf zzx(java.lang.String str) {
        zzg();
        zzE(str);
        com.google.android.gms.internal.measurement.zzgl zzb = zzb(str);
        if (zzb == null || !zzb.zzn()) {
            return null;
        }
        return zzb.zzo();
    }

    final boolean zzy(java.lang.String str) {
        zzg();
        zzE(str);
        com.google.android.gms.internal.measurement.zzgf zzx = zzx(str);
        return zzx == null || !zzx.zzd() || zzx.zze();
    }

    final java.util.SortedSet zzz(java.lang.String str) {
        zzg();
        zzE(str);
        java.util.TreeSet treeSet = new java.util.TreeSet();
        com.google.android.gms.internal.measurement.zzgf zzx = zzx(str);
        if (zzx != null) {
            java.util.Iterator it = zzx.zzc().iterator();
            while (it.hasNext()) {
                treeSet.add(((com.google.android.gms.internal.measurement.zzgc) it.next()).zza());
            }
        }
        return treeSet;
    }
}

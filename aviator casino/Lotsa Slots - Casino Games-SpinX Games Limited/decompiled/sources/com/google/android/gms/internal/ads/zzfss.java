package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfss {
    private final java.util.Map zza;
    private final com.google.android.gms.internal.ads.zzfuc zzb;
    private final com.google.android.gms.internal.ads.zzftd zzc;
    private final android.content.Context zzd;
    private volatile android.net.ConnectivityManager zze;
    private final java.util.concurrent.atomic.AtomicBoolean zzf = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.android.gms.common.util.Clock zzg;
    private java.util.concurrent.atomic.AtomicInteger zzh;
    private final com.google.android.gms.internal.ads.zzfsn zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;

    zzfss(com.google.android.gms.internal.ads.zzfuc zzfucVar, com.google.android.gms.internal.ads.zzftd zzftdVar, android.content.Context context, com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzfsn zzfsnVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.zza = hashMap;
        hashMap.put(com.google.android.gms.ads.AdFormat.APP_OPEN_AD, new java.util.HashMap());
        hashMap.put(com.google.android.gms.ads.AdFormat.INTERSTITIAL, new java.util.HashMap());
        hashMap.put(com.google.android.gms.ads.AdFormat.REWARDED, new java.util.HashMap());
        this.zzb = zzfucVar;
        this.zzc = zzftdVar;
        this.zzd = context;
        this.zzg = clock;
        this.zzi = zzfsnVar;
        this.zzj = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzl(boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = this.zza;
        synchronized (map) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(((java.util.Map) it.next()).values());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) arrayList.get(i);
            if (z) {
                zzfubVar.zzj();
            } else {
                zzfubVar.zzi();
            }
        }
    }

    private final java.lang.Object zzn(java.lang.Class cls, com.google.android.gms.ads.AdFormat adFormat, java.lang.String str) {
        com.google.android.gms.internal.ads.zzftd zzftdVar = this.zzc;
        com.google.android.gms.common.util.Clock clock = this.zzg;
        zzftdVar.zze(clock.currentTimeMillis(), "2");
        java.util.Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return null;
            }
            com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) ((java.util.Map) map.get(adFormat)).get(str);
            if (zzfubVar != null && adFormat.equals(zzfubVar.zzq())) {
                com.google.android.gms.internal.ads.zzftj zzftjVar = new com.google.android.gms.internal.ads.zzftj(zzfubVar.zzr(), zzfubVar.zzq());
                zzftjVar.zza(str);
                com.google.android.gms.internal.ads.zzftk zzftkVar = new com.google.android.gms.internal.ads.zzftk(zzftjVar, null);
                zzftdVar.zzf(clock.currentTimeMillis(), zzftkVar, zzfubVar.zzs(), zzfubVar.zzt(), "2");
                try {
                    java.lang.String zzl = zzfubVar.zzl();
                    java.lang.Object zzg = zzfubVar.zzg();
                    java.lang.Object cast = zzg == null ? null : cls.cast(zzg);
                    if (cast != null) {
                        zzftdVar.zzh(clock.currentTimeMillis(), zzfubVar.zzs(), zzfubVar.zzt(), zzl, zzftkVar, "2");
                    }
                    return cast;
                } catch (java.lang.ClassCastException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
                    java.lang.String name = cls.getName();
                    java.lang.String.valueOf(name);
                    com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(java.lang.String.valueOf(name)), e);
                }
            }
            return null;
        }
    }

    private final boolean zzo(com.google.android.gms.ads.AdFormat adFormat) {
        java.util.Map map = this.zza;
        int size = map.containsKey(adFormat) ? ((java.util.Map) map.get(adFormat)).size() : 0;
        int ordinal = adFormat.ordinal();
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : java.lang.Math.max(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfv)).intValue(), 1) : java.lang.Math.max(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfu)).intValue(), 1) : java.lang.Math.max(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzft)).intValue(), 1));
    }

    public final boolean zza(java.lang.String str, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        int zzT;
        if (!this.zzf.getAndSet(true)) {
            if (this.zze == null) {
                synchronized (this) {
                    if (this.zze == null) {
                        try {
                            this.zze = (android.net.ConnectivityManager) this.zzd.getSystemService("connectivity");
                        } catch (java.lang.ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || this.zze == null) {
                this.zzh = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzH)).intValue());
            } else {
                try {
                    this.zze.registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.zzfsq(this));
                } catch (java.lang.RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzh = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzH)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new com.google.android.gms.internal.ads.zzfsr(this));
        }
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzfpVar.zzb);
        if (adFormat == null) {
            return false;
        }
        java.util.Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                if (!((java.util.Map) map.get(adFormat)).containsKey(str)) {
                    if (zzo(adFormat)) {
                        if (zzfpVar.zze) {
                            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzO)).booleanValue() && (zzT = this.zzj.zzT()) > 0) {
                                zzfpVar = zzfpVar.zza(zzT);
                            }
                        }
                        com.google.android.gms.internal.ads.zzfub zzb = this.zzb.zzb(str, zzfpVar, zzceVar);
                        if (zzb != null) {
                            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzh;
                            if (atomicInteger != null) {
                                zzb.zzn(atomicInteger.get());
                            }
                            com.google.android.gms.internal.ads.zzftd zzftdVar = this.zzc;
                            zzb.zzm(zzftdVar);
                            synchronized (map) {
                                if (!((java.util.Map) map.get(adFormat)).containsKey(str) && zzo(adFormat)) {
                                    ((java.util.Map) map.get(adFormat)).put(str, zzb);
                                    com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzi;
                                    if (zzfsnVar != null) {
                                        zzfsnVar.zze(str, adFormat, zzb);
                                    } else {
                                        zzb.zzd();
                                    }
                                    com.google.android.gms.internal.ads.zzftj zzftjVar = new com.google.android.gms.internal.ads.zzftj(zzfpVar.zza, adFormat);
                                    zzftjVar.zza(str);
                                    zzftdVar.zza(zzfpVar.zzd, this.zzg.currentTimeMillis(), new com.google.android.gms.internal.ads.zzftk(zzftjVar, null), "2");
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb(com.google.android.gms.ads.AdFormat adFormat, java.lang.String str) {
        com.google.android.gms.internal.ads.zzftk zzftkVar;
        com.google.android.gms.common.util.Clock clock = this.zzg;
        long currentTimeMillis = clock.currentTimeMillis();
        java.util.Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) ((java.util.Map) map.get(adFormat)).get(str);
            java.lang.String zzl = zzfubVar == null ? null : zzfubVar.zzl();
            boolean z = zzl != null && adFormat.equals(zzfubVar.zzq());
            java.lang.Long valueOf = z ? java.lang.Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzfubVar == null) {
                zzftkVar = null;
            } else {
                com.google.android.gms.internal.ads.zzftj zzftjVar = new com.google.android.gms.internal.ads.zzftj(zzfubVar.zzr(), adFormat);
                zzftjVar.zza(str);
                zzftkVar = new com.google.android.gms.internal.ads.zzftk(zzftjVar, null);
            }
            this.zzc.zzd(zzfubVar == null ? 0 : zzfubVar.zzs(), zzfubVar != null ? zzfubVar.zzt() : 0, currentTimeMillis, valueOf, zzl, zzftkVar, "2");
            return z;
        }
    }

    public final com.google.android.gms.internal.ads.zzcci zzc(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzcci) zzn(com.google.android.gms.internal.ads.zzcci.class, com.google.android.gms.ads.AdFormat.REWARDED, str);
    }

    public final com.google.android.gms.internal.ads.zzbgj zzd(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbgj) zzn(com.google.android.gms.internal.ads.zzbgj.class, com.google.android.gms.ads.AdFormat.APP_OPEN_AD, str);
    }

    public final com.google.android.gms.ads.internal.client.zzbu zze(java.lang.String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzn(com.google.android.gms.ads.internal.client.zzbu.class, com.google.android.gms.ads.AdFormat.INTERSTITIAL, str);
    }

    public final com.google.android.gms.ads.internal.client.zzfp zzf(com.google.android.gms.ads.AdFormat adFormat, java.lang.String str) {
        java.util.Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) ((java.util.Map) map.get(adFormat)).get(str);
                this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfubVar == null ? null : zzfubVar.zzr(), adFormat, zzfubVar == null ? -1 : zzfubVar.zzs(), zzfubVar == null ? -1 : zzfubVar.zzt());
                if (zzfubVar != null) {
                    return zzfubVar.zzo();
                }
            }
        }
        return null;
    }

    public final int zzg(com.google.android.gms.ads.AdFormat adFormat, java.lang.String str) {
        java.util.Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return 0;
            }
            com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) ((java.util.Map) map.get(adFormat)).get(str);
            int zzt = zzfubVar != null ? zzfubVar.zzt() : 0;
            this.zzc.zzp(zzt, this.zzg.currentTimeMillis(), str, zzfubVar == null ? null : zzfubVar.zzr(), adFormat, zzfubVar == null ? -1 : zzfubVar.zzs());
            return zzt;
        }
    }

    public final java.util.Map zzh(int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map map = this.zza;
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(i);
        synchronized (map) {
            if (adFormat != null) {
                if (map.containsKey(adFormat)) {
                    for (com.google.android.gms.internal.ads.zzfub zzfubVar : ((java.util.Map) map.get(adFormat)).values()) {
                        hashMap.put(zzfubVar.zzp(), zzfubVar.zzo());
                    }
                    this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), hashMap.size());
                    return hashMap;
                }
            }
            return hashMap;
        }
    }

    public final boolean zzi(com.google.android.gms.ads.AdFormat adFormat, java.lang.String str) {
        java.util.Map map = this.zza;
        synchronized (map) {
            if (!map.containsKey(adFormat)) {
                return false;
            }
            com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) ((java.util.Map) map.get(adFormat)).remove(str);
            if (zzfubVar == null) {
                return false;
            }
            zzfubVar.zzh();
            com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzi;
            if (zzfsnVar != null) {
                zzfsnVar.zzf(zzfubVar);
            }
            int zzt = zzfubVar.zzt();
            zzfubVar.zzv();
            this.zzc.zzm(this.zzg.currentTimeMillis(), str, zzfubVar.zzr(), adFormat, zzfubVar.zzs(), zzt);
            return true;
        }
    }

    public final void zzj(int i) {
        com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return;
        }
        java.util.Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(adFormat)) {
                java.util.Map map2 = (java.util.Map) map.get(adFormat);
                int size = map2.size();
                if (size == 0) {
                    return;
                }
                com.google.android.gms.internal.ads.zzgwm zzq = com.google.android.gms.internal.ads.zzgwm.zzq(map2.values());
                map2.clear();
                int size2 = zzq.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) zzq.get(i2);
                    if (zzfubVar != null) {
                        zzfubVar.zzh();
                        com.google.android.gms.internal.ads.zzfsn zzfsnVar = this.zzi;
                        if (zzfsnVar != null) {
                            zzfsnVar.zzf(zzfubVar);
                        }
                        zzfubVar.zzv();
                        java.lang.String zzp = zzfubVar.zzp();
                        java.lang.String.valueOf(zzp);
                        java.lang.String valueOf = java.lang.String.valueOf(zzp);
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(valueOf));
                    }
                }
                java.lang.String concat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh(concat);
                this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
            }
        }
    }

    final /* synthetic */ void zzk(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzy)).booleanValue()) {
            zzl(z);
        }
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfth {
    private final com.google.android.gms.internal.ads.zzfuc zzc;
    private final com.google.android.gms.internal.ads.zzftd zzd;
    private final android.content.Context zze;
    private volatile android.net.ConnectivityManager zzf;
    private final com.google.android.gms.common.util.Clock zzh;
    private java.util.concurrent.atomic.AtomicInteger zzi;
    private final java.util.concurrent.atomic.AtomicBoolean zzg = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.ConcurrentMap zza = new java.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.ConcurrentMap zzb = new java.util.concurrent.ConcurrentHashMap();

    zzfth(com.google.android.gms.internal.ads.zzfuc zzfucVar, com.google.android.gms.internal.ads.zzftd zzftdVar, android.content.Context context, com.google.android.gms.common.util.Clock clock) {
        this.zzc = zzfucVar;
        this.zzd = zzftdVar;
        this.zze = context;
        this.zzh = clock;
    }

    static java.lang.String zzh(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        java.lang.String name = adFormat == null ? "NULL" : adFormat.name();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(name).length());
        sb.append(str);
        sb.append("#");
        sb.append(name);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzy)).booleanValue()) {
            zzj(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z) {
        if (z) {
            java.util.Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.ads.zzfub) it.next()).zzj();
            }
        } else {
            java.util.Iterator it2 = this.zza.values().iterator();
            while (it2.hasNext()) {
                ((com.google.android.gms.internal.ads.zzfub) it2.next()).zzi();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzB)).booleanValue() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized java.util.List zzm(java.util.List list) {
        java.util.ArrayList arrayList;
        java.util.HashSet hashSet = new java.util.HashSet();
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) it.next();
            java.lang.String zzh = zzh(zzfpVar.zza, com.google.android.gms.ads.AdFormat.getAdFormat(zzfpVar.zzb));
            hashSet.add(zzh);
            java.util.concurrent.ConcurrentMap concurrentMap = this.zza;
            com.google.android.gms.internal.ads.zzfub zzfubVar = (com.google.android.gms.internal.ads.zzfub) concurrentMap.get(zzh);
            if (zzfubVar == null) {
                java.util.concurrent.ConcurrentMap concurrentMap2 = this.zzb;
                if (concurrentMap2.containsKey(zzh)) {
                    com.google.android.gms.internal.ads.zzfub zzfubVar2 = (com.google.android.gms.internal.ads.zzfub) concurrentMap2.get(zzh);
                    if (zzfubVar2.zzk(zzfpVar)) {
                        zzfubVar2.zzA(zzfpVar.zzd);
                        zzfubVar2.zzj();
                        concurrentMap.put(zzh, zzfubVar2);
                        concurrentMap2.remove(zzh);
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else {
                    arrayList.add(zzfpVar);
                }
            } else if (zzfubVar.zzk(zzfpVar)) {
                zzfubVar.zzA(zzfpVar.zzd);
            } else {
                this.zzb.put(zzh, zzfubVar);
                concurrentMap.remove(zzh);
                arrayList.add(zzfpVar);
            }
        }
        java.util.Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
            if (!hashSet.contains((java.lang.String) entry.getKey())) {
                this.zzb.put((java.lang.String) entry.getKey(), (com.google.android.gms.internal.ads.zzfub) entry.getValue());
                it2.remove();
            }
        }
        java.util.Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            com.google.android.gms.internal.ads.zzfub zzfubVar3 = (com.google.android.gms.internal.ads.zzfub) ((java.util.Map.Entry) it3.next()).getValue();
            zzfubVar3.zzh();
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzA)).booleanValue()) {
            }
            zzfubVar3.zzv();
            if (!zzfubVar3.zzf()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized void zzn(java.lang.String str, com.google.android.gms.internal.ads.zzfub zzfubVar) {
        zzfubVar.zzd();
        this.zza.put(str, zzfubVar);
    }

    private final synchronized boolean zzo(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        boolean z;
        com.google.android.gms.common.util.Clock clock = this.zzh;
        long currentTimeMillis = clock.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfub zzq = zzq(str, adFormat);
        z = zzq != null && zzq.zzf();
        this.zzd.zzd(zzq == null ? 0 : zzq.zzs(), zzq == null ? 0 : zzq.zzt(), currentTimeMillis, z ? java.lang.Long.valueOf(clock.currentTimeMillis()) : null, zzq == null ? null : zzq.zzl(), new com.google.android.gms.internal.ads.zzftk(new com.google.android.gms.internal.ads.zzftj(str, adFormat), null), "1");
        return z;
    }

    private final synchronized java.lang.Object zzp(java.lang.Class cls, java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        com.google.android.gms.internal.ads.zzftk zzftkVar = new com.google.android.gms.internal.ads.zzftk(new com.google.android.gms.internal.ads.zzftj(str, adFormat), null);
        com.google.android.gms.internal.ads.zzftd zzftdVar = this.zzd;
        com.google.android.gms.common.util.Clock clock = this.zzh;
        zzftdVar.zzf(clock.currentTimeMillis(), zzftkVar, -1, -1, "1");
        com.google.android.gms.internal.ads.zzfub zzq = zzq(str, adFormat);
        if (zzq == null) {
            return null;
        }
        try {
            java.lang.String zzl = zzq.zzl();
            java.lang.Object zzg = zzq.zzg();
            java.lang.Object cast = zzg == null ? null : cls.cast(zzg);
            if (cast != null) {
                zzftdVar.zzh(clock.currentTimeMillis(), zzq.zzs(), zzq.zzt(), zzl, zzftkVar, "1");
            }
            return cast;
        } catch (java.lang.ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
            java.lang.String name = cls.getName();
            java.lang.String.valueOf(name);
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(java.lang.String.valueOf(name)), e);
            return null;
        }
    }

    private final synchronized com.google.android.gms.internal.ads.zzfub zzq(java.lang.String str, com.google.android.gms.ads.AdFormat adFormat) {
        return (com.google.android.gms.internal.ads.zzfub) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(java.util.List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        if (!this.zzg.getAndSet(true)) {
            if (this.zzf == null) {
                synchronized (this) {
                    if (this.zzf == null) {
                        try {
                            this.zzf = (android.net.ConnectivityManager) this.zze.getSystemService("connectivity");
                        } catch (java.lang.ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO() || this.zzf == null) {
                this.zzi = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzH)).intValue());
            } else {
                try {
                    this.zzf.registerDefaultNetworkCallback(new com.google.android.gms.internal.ads.zzftg(this));
                } catch (java.lang.RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzi = new java.util.concurrent.atomic.AtomicInteger(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzH)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new com.google.android.gms.internal.ads.zzftf(this));
        }
        java.util.List<com.google.android.gms.ads.internal.client.zzfp> zzm = zzm(list);
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.ads.AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzfp zzfpVar : zzm) {
            java.lang.String str = zzfpVar.zza;
            com.google.android.gms.ads.AdFormat adFormat = com.google.android.gms.ads.AdFormat.getAdFormat(zzfpVar.zzb);
            com.google.android.gms.internal.ads.zzfub zza = this.zzc.zza(zzfpVar, zzcbVar);
            if (adFormat != null && zza != null) {
                java.util.concurrent.atomic.AtomicInteger atomicInteger = this.zzi;
                if (atomicInteger != null) {
                    zza.zzn(atomicInteger.get());
                }
                com.google.android.gms.internal.ads.zzftd zzftdVar = this.zzd;
                zza.zzm(zzftdVar);
                zzn(zzh(str, adFormat), zza);
                enumMap.put((java.util.EnumMap) adFormat, (com.google.android.gms.ads.AdFormat) java.lang.Integer.valueOf(((java.lang.Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                zzftdVar.zza(zzfpVar.zzd, this.zzh.currentTimeMillis(), new com.google.android.gms.internal.ads.zzftk(new com.google.android.gms.internal.ads.zzftj(str, adFormat), null), "1");
            }
        }
        this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
    }

    public final synchronized boolean zzb(java.lang.String str) {
        return zzo(str, com.google.android.gms.ads.AdFormat.REWARDED);
    }

    public final synchronized com.google.android.gms.internal.ads.zzcci zzc(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzcci) zzp(com.google.android.gms.internal.ads.zzcci.class, str, com.google.android.gms.ads.AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(java.lang.String str) {
        return zzo(str, com.google.android.gms.ads.AdFormat.APP_OPEN_AD);
    }

    public final synchronized com.google.android.gms.internal.ads.zzbgj zze(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbgj) zzp(com.google.android.gms.internal.ads.zzbgj.class, str, com.google.android.gms.ads.AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(java.lang.String str) {
        return zzo(str, com.google.android.gms.ads.AdFormat.INTERSTITIAL);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbu zzg(java.lang.String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzp(com.google.android.gms.ads.internal.client.zzbu.class, str, com.google.android.gms.ads.AdFormat.INTERSTITIAL);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzjg implements com.google.android.gms.internal.ads.zzly {
    public static final com.google.android.gms.internal.ads.zzgwm zza = com.google.android.gms.internal.ads.zzgwm.zzn("file", "content", "data", "android.resource", "rawresource", "asset");
    private final com.google.android.gms.internal.ads.zzbe zzb;
    private final com.google.android.gms.internal.ads.zzbd zzc;
    private final com.google.android.gms.internal.ads.zzabr zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final com.google.android.gms.internal.ads.zzgwp zzn;
    private final java.util.concurrent.ConcurrentHashMap zzo;
    private long zzp;

    public zzjg() {
        com.google.android.gms.internal.ads.zzabr zzabrVar = new com.google.android.gms.internal.ads.zzabr(true, 65536);
        com.google.android.gms.internal.ads.zzgwp zza2 = com.google.android.gms.internal.ads.zzgwp.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new com.google.android.gms.internal.ads.zzbe();
        this.zzc = new com.google.android.gms.internal.ads.zzbd();
        this.zzd = zzabrVar;
        this.zze = com.google.android.gms.internal.ads.zzfl.zzs(com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzf = com.google.android.gms.internal.ads.zzfl.zzs(1000L);
        this.zzg = com.google.android.gms.internal.ads.zzfl.zzs(com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzh = com.google.android.gms.internal.ads.zzfl.zzs(com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzi = com.google.android.gms.internal.ads.zzfl.zzs(1000L);
        this.zzj = com.google.android.gms.internal.ads.zzfl.zzs(1000L);
        this.zzk = com.google.android.gms.internal.ads.zzfl.zzs(2000L);
        this.zzl = com.google.android.gms.internal.ads.zzfl.zzs(1000L);
        this.zzm = com.google.android.gms.internal.ads.zzfl.zzs(0L);
        this.zzo = new java.util.concurrent.ConcurrentHashMap();
        this.zzn = com.google.android.gms.internal.ads.zzgwp.zzc(zza2);
        this.zzp = -1L;
    }

    private final int zzm(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        java.lang.Integer num = (java.lang.Integer) this.zzn.get(zzqfVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzo;
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) concurrentHashMap.get(zzqfVar);
        if (zzjfVar != null) {
            int i = zzjfVar.zza - 1;
            zzjfVar.zza = i;
            if (i == 0) {
                concurrentHashMap.remove(zzqfVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        com.google.android.gms.internal.ads.zzabr zzabrVar = this.zzd;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((com.google.android.gms.internal.ads.zzjf) it.next()).zzc;
        }
        zzabrVar.zzf(i);
    }

    private final boolean zzp(com.google.android.gms.internal.ads.zzlx zzlxVar) {
        com.google.android.gms.internal.ads.zzbf zzbfVar = zzlxVar.zzb;
        com.google.android.gms.internal.ads.zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzlxVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        java.lang.String scheme = zzagVar.zza.getScheme();
        return android.text.TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i, int i2, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzgtj.zzh(i >= i2, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) this.zzo.get(zzqfVar);
        zzjfVar.getClass();
        return zzjfVar.zzc() * 65536;
    }

    private final int zzs(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) this.zzo.get(zzqfVar);
        zzjfVar.getClass();
        return zzjfVar.zzc;
    }

    private static final boolean zzt(boolean z) {
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zza(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        long id = java.lang.Thread.currentThread().getId();
        long j = this.zzp;
        com.google.android.gms.internal.ads.zzgtj.zzj(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzo;
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) concurrentHashMap.get(zzqfVar);
        if (zzjfVar == null) {
            concurrentHashMap.put(zzqfVar, new com.google.android.gms.internal.ads.zzjf());
        } else {
            zzjfVar.zza++;
        }
        com.google.android.gms.internal.ads.zzjf zzjfVar2 = (com.google.android.gms.internal.ads.zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar2.getClass();
        int zzm = zzm(zzqfVar);
        if (zzm == -1) {
            zzm = 13107200;
        }
        zzjfVar2.zzc = zzm;
        zzjfVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzb(com.google.android.gms.internal.ads.zzlx zzlxVar, com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzaba[] zzabaVarArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzo;
        com.google.android.gms.internal.ads.zzqf zzqfVar = zzlxVar.zza;
        int zzm = zzm(zzqfVar);
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar.getClass();
        if (zzm == -1) {
            boolean zzp = zzp(zzlxVar);
            int length = zzabaVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    com.google.android.gms.internal.ads.zzaba zzabaVar = zzabaVarArr[i];
                    if (zzabaVar != null) {
                        switch (zzabaVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i3 = 144310272;
                                break;
                            case 2:
                                if (!zzp) {
                                    i3 = 131072000;
                                    break;
                                } else {
                                    i3 = 19660800;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                i3 = 131072;
                                break;
                            case 4:
                                i3 = 26214400;
                                break;
                        }
                        i2 += i3;
                    }
                    i++;
                } else {
                    java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                    zzm = java.lang.Math.max(13107200, java.lang.Math.min(i2, 210239488));
                }
            }
        }
        zzjfVar.zzc = zzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzc(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        zzn(zzqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzd(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        zzn(zzqfVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final com.google.android.gms.internal.ads.zzabl zze(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        return new com.google.android.gms.internal.ads.zzje(this, zzqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final long zzf(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzg(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzh(com.google.android.gms.internal.ads.zzlx zzlxVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zzo;
        com.google.android.gms.internal.ads.zzqf zzqfVar = zzlxVar.zza;
        com.google.android.gms.internal.ads.zzjf zzjfVar = (com.google.android.gms.internal.ads.zzjf) concurrentHashMap.get(zzqfVar);
        zzjfVar.getClass();
        int zzr = zzr(zzqfVar);
        int zzs = zzs(zzqfVar);
        if (zzqfVar.equals(com.google.android.gms.internal.ads.zzqf.zza)) {
            return zzr < zzs;
        }
        boolean zzp = zzp(zzlxVar);
        long j = zzp ? this.zzf : this.zze;
        long j2 = zzp ? this.zzh : this.zzg;
        float f = zzlxVar.zzf;
        if (f > 1.0f) {
            j = java.lang.Math.min(com.google.android.gms.internal.ads.zzfl.zzx(j, f), j2);
        }
        long j3 = zzlxVar.zze;
        if (j3 < java.lang.Math.max(j, 500000L)) {
            boolean zzt = zzt(zzp);
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            boolean z = runtime.totalMemory() < maxMemory || runtime.freeMemory() + ((long) this.zzd.zzh()) >= maxMemory / 25;
            boolean z2 = !zzt ? zzr >= zzs : !z && zzr >= zzs;
            zzjfVar.zzb = z2;
            if (!z2 && zzt && !z) {
                com.google.android.gms.internal.ads.zzeg.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!zzjfVar.zzb && j3 < 500000) {
                com.google.android.gms.internal.ads.zzeg.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j2 || zzr >= zzs) {
            zzjfVar.zzb = false;
        }
        return zzjfVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzi(com.google.android.gms.internal.ads.zzlx zzlxVar) {
        long j;
        boolean z;
        boolean z2 = zzlxVar.zzg;
        long j2 = zzlxVar.zze;
        float f = zzlxVar.zzf;
        boolean zzp = zzp(zzlxVar);
        long zzy = com.google.android.gms.internal.ads.zzfl.zzy(j2, f);
        if (z2) {
            if (zzp) {
                j = this.zzl;
                z = true;
            } else {
                j = this.zzk;
                z = false;
            }
        } else if (zzp) {
            j = this.zzj;
            z = true;
        } else {
            j = this.zzi;
            z = false;
        }
        long j3 = zzlxVar.zzh;
        if (j3 != -9223372036854775807L) {
            j = java.lang.Math.min(j3 / 2, j);
        }
        if (j > 0 && zzy < j) {
            if (zzt(z)) {
                return false;
            }
            com.google.android.gms.internal.ads.zzqf zzqfVar = zzlxVar.zza;
            if (zzr(zzqfVar) < zzs(zzqfVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzj(com.google.android.gms.internal.ads.zzqf zzqfVar, com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, long j) {
        java.util.Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.internal.ads.zzjf) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzabr zzk() {
        return this.zzd;
    }

    final /* synthetic */ java.util.concurrent.ConcurrentHashMap zzl() {
        return this.zzo;
    }
}

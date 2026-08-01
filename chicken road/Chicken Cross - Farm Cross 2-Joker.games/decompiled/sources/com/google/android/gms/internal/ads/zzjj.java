package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzjj implements zzmc {
    public static final zzgxm zza = zzgxm.zzn("file", "content", "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzabv zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgxp zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzjj() {
        zzabv zzabvVar = new zzabv(true, 65536);
        zzgxp zza2 = zzgxp.zza();
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
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzabvVar;
        this.zze = zzfm.zzt(50000L);
        this.zzf = zzfm.zzt(1000L);
        this.zzg = zzfm.zzt(50000L);
        this.zzh = zzfm.zzt(50000L);
        this.zzi = zzfm.zzt(1000L);
        this.zzj = zzfm.zzt(1000L);
        this.zzk = zzfm.zzt(2000L);
        this.zzl = zzfm.zzt(1000L);
        this.zzm = zzfm.zzt(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgxp.zzc(zza2);
        this.zzp = -1L;
    }

    private final int zzm(zzqj zzqjVar) {
        Integer num = (Integer) this.zzn.get(zzqjVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzqj zzqjVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        if (zzjiVar != null) {
            int i = zzjiVar.zza - 1;
            zzjiVar.zza = i;
            if (i == 0) {
                concurrentHashMap.remove(zzqjVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzabv zzabvVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzji) it.next()).zzc;
        }
        zzabvVar.zzf(i);
    }

    private final boolean zzp(zzmb zzmbVar) {
        zzbf zzbfVar = zzmbVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzmbVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i, int i2, String str, String str2) {
        zzguk.zzh(i >= i2, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzqj zzqjVar) {
        zzji zzjiVar = (zzji) this.zzo.get(zzqjVar);
        zzjiVar.getClass();
        return zzjiVar.zzc() * 65536;
    }

    private final int zzs(zzqj zzqjVar) {
        zzji zzjiVar = (zzji) this.zzo.get(zzqjVar);
        zzjiVar.getClass();
        return zzjiVar.zzc;
    }

    private static final boolean zzt(boolean z) {
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zza(zzqj zzqjVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzp;
        zzguk.zzj(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        if (zzjiVar == null) {
            concurrentHashMap.put(zzqjVar, new zzji());
        } else {
            zzjiVar.zza++;
        }
        zzji zzjiVar2 = (zzji) concurrentHashMap.get(zzqjVar);
        zzjiVar2.getClass();
        int zzm = zzm(zzqjVar);
        if (zzm == -1) {
            zzm = 13107200;
        }
        zzjiVar2.zzc = zzm;
        zzjiVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzb(zzmb zzmbVar, zzzr zzzrVar, zzabe[] zzabeVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqj zzqjVar = zzmbVar.zza;
        int zzm = zzm(zzqjVar);
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        zzjiVar.getClass();
        if (zzm == -1) {
            boolean zzp = zzp(zzmbVar);
            int length = zzabeVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    zzabe zzabeVar = zzabeVarArr[i];
                    if (zzabeVar != null) {
                        switch (zzabeVar.zza().zzc) {
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
                    String str = zzfm.zza;
                    zzm = Math.max(13107200, Math.min(i2, 210239488));
                }
            }
        }
        zzjiVar.zzc = zzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzc(zzqj zzqjVar) {
        zzn(zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zzd(zzqj zzqjVar) {
        zzn(zzqjVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final zzabp zze(zzqj zzqjVar) {
        return new zzjh(this, zzqjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final long zzf(zzqj zzqjVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzg(zzqj zzqjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzh(zzmb zzmbVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzqj zzqjVar = zzmbVar.zza;
        zzji zzjiVar = (zzji) concurrentHashMap.get(zzqjVar);
        zzjiVar.getClass();
        int zzr = zzr(zzqjVar);
        int zzs = zzs(zzqjVar);
        if (zzqjVar.equals(zzqj.zza)) {
            return zzr < zzs;
        }
        boolean zzp = zzp(zzmbVar);
        long j = zzp ? this.zzf : this.zze;
        long j2 = zzp ? this.zzh : this.zzg;
        float f = zzmbVar.zzf;
        if (f > 1.0f) {
            j = Math.min(zzfm.zzy(j, f), j2);
        }
        long j3 = zzmbVar.zze;
        if (j3 < Math.max(j, 500000L)) {
            boolean zzt = zzt(zzp);
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            boolean z = runtime.totalMemory() < maxMemory || runtime.freeMemory() + ((long) this.zzd.zzh()) >= maxMemory / 25;
            boolean z2 = !zzt ? zzr >= zzs : !z && zzr >= zzs;
            zzjiVar.zzb = z2;
            if (!z2 && zzt && !z) {
                zzeh.zzb("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!zzjiVar.zzb && j3 < 500000) {
                zzeh.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j2 || zzr >= zzs) {
            zzjiVar.zzb = false;
        }
        return zzjiVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzi(zzmb zzmbVar) {
        long j;
        boolean z;
        boolean z2 = zzmbVar.zzg;
        long j2 = zzmbVar.zze;
        float f = zzmbVar.zzf;
        boolean zzp = zzp(zzmbVar);
        long zzz = zzfm.zzz(j2, f);
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
        long j3 = zzmbVar.zzh;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j3 / 2, j);
        }
        if (j > 0 && zzz < j) {
            if (zzt(z)) {
                return false;
            }
            zzqj zzqjVar = zzmbVar.zza;
            if (zzr(zzqjVar) < zzs(zzqjVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final boolean zzj(zzqj zzqjVar, zzbf zzbfVar, zzxo zzxoVar, long j) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzji) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    final /* synthetic */ zzabv zzk() {
        return this.zzd;
    }

    final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}

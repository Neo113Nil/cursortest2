package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbd;
import e1.k;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzhw implements zzkj {
    private final zzyw zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzhw() {
        zzyw zzywVar = new zzyw(true, 65536);
        zzl(zzbbd.zzq.zzf, 0, "bufferForPlaybackMs", "0");
        zzl(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzl(50000, zzbbd.zzq.zzf, "minBufferMs", "bufferForPlaybackMs");
        zzl(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzl(50000, 50000, "maxBufferMs", "minBufferMs");
        zzl(0, 0, "backBufferDurationMs", "0");
        this.zza = zzywVar;
        this.zzb = zzen.zzs(50000L);
        this.zzc = zzen.zzs(50000L);
        this.zzd = zzen.zzs(1000L);
        this.zze = zzen.zzs(2000L);
        this.zzf = zzen.zzs(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzl(int i7, int i8, String str, String str2) {
        zzcv.zze(i7 >= i8, k.f(str, " cannot be less than ", str2));
    }

    private final void zzm(zzor zzorVar) {
        if (this.zzg.remove(zzorVar) != null) {
            zzn();
        }
    }

    private final void zzn() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    public final int zza() {
        Iterator it = this.zzg.values().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((zzhu) it.next()).zzb;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final long zzb(zzor zzorVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzc(zzor zzorVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzh;
        boolean z4 = true;
        if (j != -1 && j != id) {
            z4 = false;
        }
        zzcv.zzg(z4, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        if (!this.zzg.containsKey(zzorVar)) {
            this.zzg.put(zzorVar, new zzhu(null));
        }
        zzhu zzhuVar = (zzhu) this.zzg.get(zzorVar);
        zzhuVar.getClass();
        zzhuVar.zzb = 13107200;
        zzhuVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzd(zzor zzorVar) {
        zzm(zzorVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zze(zzor zzorVar) {
        zzm(zzorVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zzf(zzki zzkiVar, zzwv zzwvVar, zzyh[] zzyhVarArr) {
        zzhu zzhuVar = (zzhu) this.zzg.get(zzkiVar.zza);
        zzhuVar.getClass();
        int length = zzyhVarArr.length;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = 13107200;
            if (i7 >= length) {
                zzhuVar.zzb = Math.max(13107200, i8);
                zzn();
                return;
            }
            zzyh zzyhVar = zzyhVarArr[i7];
            if (zzyhVar != null) {
                switch (zzyhVar.zzg().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i9 = 144310272;
                        break;
                    case 2:
                        i9 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i9 = 131072;
                        break;
                }
                i8 += i9;
            }
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzg(zzor zzorVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzh(zzki zzkiVar) {
        zzhu zzhuVar = (zzhu) this.zzg.get(zzkiVar.zza);
        zzhuVar.getClass();
        int zza = this.zza.zza();
        int zza2 = zza();
        long j = this.zzb;
        float f7 = zzkiVar.zzc;
        if (f7 > 1.0f) {
            j = Math.min(zzen.zzq(j, f7), this.zzc);
        }
        long j3 = zzkiVar.zzb;
        if (j3 < Math.max(j, 500000L)) {
            boolean z4 = zza < zza2;
            zzhuVar.zza = z4;
            if (!z4 && j3 < 500000) {
                zzdq.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.zzc || zza >= zza2) {
            zzhuVar.zza = false;
        }
        return zzhuVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzi(zzbn zzbnVar, zzuq zzuqVar, long j) {
        Iterator it = this.zzg.values().iterator();
        while (it.hasNext()) {
            if (((zzhu) it.next()).zza) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzj(zzki zzkiVar) {
        boolean z4 = zzkiVar.zzd;
        long zzr = zzen.zzr(zzkiVar.zzb, zzkiVar.zzc);
        long j = z4 ? this.zze : this.zzd;
        long j3 = zzkiVar.zze;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j3 / 2, j);
        }
        return j <= 0 || zzr >= j || this.zza.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final zzyw zzk() {
        return this.zza;
    }
}

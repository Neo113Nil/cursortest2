package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn {
    public static final zzbn zza = new zzbk();

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbn)) {
            return false;
        }
        zzbn zzbnVar = (zzbn) obj;
        if (zzbnVar.zzc() == zzc() && zzbnVar.zzb() == zzb()) {
            zzbm zzbmVar = new zzbm();
            zzbl zzblVar = new zzbl();
            zzbm zzbmVar2 = new zzbm();
            zzbl zzblVar2 = new zzbl();
            for (int i7 = 0; i7 < zzc(); i7++) {
                if (!zze(i7, zzbmVar, 0L).equals(zzbnVar.zze(i7, zzbmVar2, 0L))) {
                    return false;
                }
            }
            for (int i8 = 0; i8 < zzb(); i8++) {
                if (!zzd(i8, zzblVar, true).equals(zzbnVar.zzd(i8, zzblVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzbnVar.zzg(true) && (iZzh = zzh(true)) == zzbnVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzbnVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        zzbm zzbmVar = new zzbm();
        zzbl zzblVar = new zzbl();
        int iZzc = zzc() + 217;
        int i8 = 0;
        while (true) {
            i7 = iZzc * 31;
            if (i8 >= zzc()) {
                break;
            }
            iZzc = i7 + zze(i8, zzbmVar, 0L).hashCode();
            i8++;
        }
        int iZzb = zzb() + i7;
        for (int i9 = 0; i9 < zzb(); i9++) {
            iZzb = (iZzb * 31) + zzd(i9, zzblVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbl zzd(int i7, zzbl zzblVar, boolean z4);

    public abstract zzbm zze(int i7, zzbm zzbmVar, long j);

    public abstract Object zzf(int i7);

    public int zzg(boolean z4) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z4) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i7, zzbl zzblVar, zzbm zzbmVar, int i8, boolean z4) {
        int i9 = zzd(i7, zzblVar, false).zzc;
        if (zze(i9, zzbmVar, 0L).zzo != i7) {
            return i7 + 1;
        }
        int iZzj = zzj(i9, i8, z4);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzbmVar, 0L).zzn;
    }

    public int zzj(int i7, int i8, boolean z4) {
        if (i8 == 0) {
            if (i7 == zzh(z4)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == zzh(z4) ? zzg(z4) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i7, int i8, boolean z4) {
        if (i7 == zzg(false)) {
            return -1;
        }
        return i7 - 1;
    }

    public final Pair zzl(zzbm zzbmVar, zzbl zzblVar, int i7, long j) {
        Pair pairZzm = zzm(zzbmVar, zzblVar, i7, j, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(zzbm zzbmVar, zzbl zzblVar, int i7, long j, long j3) {
        zzcv.zza(i7, 0, zzc());
        zze(i7, zzbmVar, j3);
        if (j == -9223372036854775807L) {
            long j7 = zzbmVar.zzl;
            j = 0;
        }
        int i8 = zzbmVar.zzn;
        zzd(i8, zzblVar, false);
        while (i8 < zzbmVar.zzo) {
            long j8 = zzblVar.zze;
            if (j == 0) {
                break;
            }
            int i9 = i8 + 1;
            long j9 = zzd(i9, zzblVar, false).zze;
            if (j < 0) {
                break;
            }
            i8 = i9;
        }
        zzd(i8, zzblVar, true);
        long j10 = zzblVar.zze;
        long j11 = zzblVar.zzd;
        if (j11 != -9223372036854775807L) {
            j = Math.min(j, j11 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzblVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzbl zzn(Object obj, zzbl zzblVar) {
        return zzd(zza(obj), zzblVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}

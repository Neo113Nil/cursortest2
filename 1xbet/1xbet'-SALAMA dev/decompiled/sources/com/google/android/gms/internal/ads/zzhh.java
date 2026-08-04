package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzhh extends zzbn {
    private final int zzb;
    private final zzwn zzc;

    public zzhh(boolean z4, zzwn zzwnVar) {
        this.zzc = zzwnVar;
        this.zzb = zzwnVar.zzc();
    }

    private final int zzw(int i7, boolean z4) {
        if (z4) {
            return this.zzc.zzd(i7);
        }
        if (i7 >= this.zzb - 1) {
            return -1;
        }
        return i7 + 1;
    }

    private final int zzx(int i7, boolean z4) {
        if (z4) {
            return this.zzc.zze(i7);
        }
        if (i7 <= 0) {
            return -1;
        }
        return i7 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zza(Object obj) {
        int iZza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iZzp = zzp(obj2);
            if (iZzp != -1 && (iZza = zzu(iZzp).zza(obj3)) != -1) {
                return zzs(iZzp) + iZza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i7, zzbl zzblVar, boolean z4) {
        int iZzq = zzq(i7);
        int iZzt = zzt(iZzq);
        zzu(iZzq).zzd(i7 - zzs(iZzq), zzblVar, z4);
        zzblVar.zzc += iZzt;
        if (z4) {
            Object objZzv = zzv(iZzq);
            Object obj = zzblVar.zzb;
            obj.getClass();
            zzblVar.zzb = Pair.create(objZzv, obj);
        }
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i7, zzbm zzbmVar, long j) {
        int iZzr = zzr(i7);
        int iZzt = zzt(iZzr);
        int iZzs = zzs(iZzr);
        zzu(iZzr).zze(i7 - iZzt, zzbmVar, j);
        Object objZzv = zzv(iZzr);
        if (!zzbm.zza.equals(zzbmVar.zzb)) {
            objZzv = Pair.create(objZzv, zzbmVar.zzb);
        }
        zzbmVar.zzb = objZzv;
        zzbmVar.zzn += iZzs;
        zzbmVar.zzo += iZzs;
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i7) {
        int iZzq = zzq(i7);
        return Pair.create(zzv(iZzq), zzu(iZzq).zzf(i7 - zzs(iZzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzg(boolean z4) {
        if (this.zzb != 0) {
            int iZza = z4 ? this.zzc.zza() : 0;
            while (zzu(iZza).zzo()) {
                iZza = zzw(iZza, z4);
                if (iZza == -1) {
                }
            }
            return zzu(iZza).zzg(z4) + zzt(iZza);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzh(boolean z4) {
        int i7 = this.zzb;
        if (i7 != 0) {
            int iZzb = z4 ? this.zzc.zzb() : i7 - 1;
            while (zzu(iZzb).zzo()) {
                iZzb = zzx(iZzb, z4);
                if (iZzb == -1) {
                }
            }
            return zzu(iZzb).zzh(z4) + zzt(iZzb);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzj(int i7, int i8, boolean z4) {
        int iZzr = zzr(i7);
        int iZzt = zzt(iZzr);
        int iZzj = zzu(iZzr).zzj(i7 - iZzt, i8 == 2 ? 0 : i8, z4);
        if (iZzj != -1) {
            return iZzt + iZzj;
        }
        int iZzw = zzw(iZzr, z4);
        while (iZzw != -1 && zzu(iZzw).zzo()) {
            iZzw = zzw(iZzw, z4);
        }
        if (iZzw != -1) {
            return zzu(iZzw).zzg(z4) + zzt(iZzw);
        }
        if (i8 == 2) {
            return zzg(z4);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzk(int i7, int i8, boolean z4) {
        int iZzr = zzr(i7);
        int iZzt = zzt(iZzr);
        int iZzk = zzu(iZzr).zzk(i7 - iZzt, 0, false);
        if (iZzk != -1) {
            return iZzt + iZzk;
        }
        int iZzx = zzx(iZzr, false);
        while (iZzx != -1 && zzu(iZzx).zzo()) {
            iZzx = zzx(iZzx, false);
        }
        if (iZzx == -1) {
            return -1;
        }
        return zzu(iZzx).zzh(false) + zzt(iZzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzn(Object obj, zzbl zzblVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iZzp = zzp(obj2);
        int iZzt = zzt(iZzp);
        zzu(iZzp).zzn(obj3, zzblVar);
        zzblVar.zzc += iZzt;
        zzblVar.zzb = obj;
        return zzblVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i7);

    public abstract int zzr(int i7);

    public abstract int zzs(int i7);

    public abstract int zzt(int i7);

    public abstract zzbn zzu(int i7);

    public abstract Object zzv(int i7);
}

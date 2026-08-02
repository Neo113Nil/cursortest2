package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
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
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp != -1 && (zza = zzu(zzp).zza(obj3)) != -1) {
                return zzs(zzp) + zza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzd(int i7, zzbl zzblVar, boolean z4) {
        int zzq = zzq(i7);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i7 - zzs(zzq), zzblVar, z4);
        zzblVar.zzc += zzt;
        if (z4) {
            Object zzv = zzv(zzq);
            Object obj = zzblVar.zzb;
            obj.getClass();
            zzblVar.zzb = Pair.create(zzv, obj);
        }
        return zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbm zze(int i7, zzbm zzbmVar, long j) {
        int zzr = zzr(i7);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i7 - zzt, zzbmVar, j);
        Object zzv = zzv(zzr);
        if (!zzbm.zza.equals(zzbmVar.zzb)) {
            zzv = Pair.create(zzv, zzbmVar.zzb);
        }
        zzbmVar.zzb = zzv;
        zzbmVar.zzn += zzs;
        zzbmVar.zzo += zzs;
        return zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final Object zzf(int i7) {
        int zzq = zzq(i7);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i7 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzg(boolean z4) {
        if (this.zzb != 0) {
            int zza = z4 ? this.zzc.zza() : 0;
            while (zzu(zza).zzo()) {
                zza = zzw(zza, z4);
                if (zza == -1) {
                }
            }
            return zzu(zza).zzg(z4) + zzt(zza);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzh(boolean z4) {
        int i7 = this.zzb;
        if (i7 != 0) {
            int zzb = z4 ? this.zzc.zzb() : i7 - 1;
            while (zzu(zzb).zzo()) {
                zzb = zzx(zzb, z4);
                if (zzb == -1) {
                }
            }
            return zzu(zzb).zzh(z4) + zzt(zzb);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzj(int i7, int i8, boolean z4) {
        int zzr = zzr(i7);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i7 - zzt, i8 == 2 ? 0 : i8, z4);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z4);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z4);
        }
        if (zzw != -1) {
            return zzu(zzw).zzg(z4) + zzt(zzw);
        }
        if (i8 == 2) {
            return zzg(z4);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final int zzk(int i7, int i8, boolean z4) {
        int zzr = zzr(i7);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i7 - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx == -1) {
            return -1;
        }
        return zzu(zzx).zzh(false) + zzt(zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzbn
    public final zzbl zzn(Object obj, zzbl zzblVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzblVar);
        zzblVar.zzc += zzt;
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

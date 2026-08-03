package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zziw extends com.google.android.gms.internal.ads.zzbf {
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzzf zzc;

    public zziw(boolean z, com.google.android.gms.internal.ads.zzzf zzzfVar) {
        this.zzc = zzzfVar;
        this.zzb = zzzfVar.zza();
    }

    private final int zzw(int i, boolean z) {
        if (z) {
            return this.zzc.zzb(i);
        }
        if (i >= this.zzb - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int zzx(int i, boolean z) {
        if (z) {
            return this.zzc.zzc(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbe zzb(int i, com.google.android.gms.internal.ads.zzbe zzbeVar, long j) {
        int zzq = zzq(i);
        int zzu = zzu(zzq);
        int zzt = zzt(zzq);
        zzs(zzq).zzb(i - zzu, zzbeVar, j);
        java.lang.Object zzv = zzv(zzq);
        if (!com.google.android.gms.internal.ads.zzbe.zza.equals(zzbeVar.zzb)) {
            zzv = android.util.Pair.create(zzv, zzbeVar.zzb);
        }
        zzbeVar.zzb = zzv;
        zzbeVar.zzn += zzt;
        zzbeVar.zzo += zzt;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbd zzd(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, boolean z) {
        int zzp = zzp(i);
        int zzu = zzu(zzp);
        zzs(zzp).zzd(i - zzt(zzp), zzbdVar, z);
        zzbdVar.zzc += zzu;
        if (z) {
            java.lang.Object zzv = zzv(zzp);
            java.lang.Object obj = zzbdVar.zzb;
            obj.getClass();
            zzbdVar.zzb = android.util.Pair.create(zzv, obj);
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zze(java.lang.Object obj) {
        int zze;
        if (obj instanceof android.util.Pair) {
            android.util.Pair pair = (android.util.Pair) obj;
            java.lang.Object obj2 = pair.first;
            java.lang.Object obj3 = pair.second;
            int zzr = zzr(obj2);
            if (zzr != -1 && (zze = zzs(zzr).zze(obj3)) != -1) {
                return zzt(zzr) + zze;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final java.lang.Object zzf(int i) {
        int zzp = zzp(i);
        return android.util.Pair.create(zzv(zzp), zzs(zzp).zzf(i - zzt(zzp)));
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzh(int i, int i2, boolean z) {
        int zzq = zzq(i);
        int zzu = zzu(zzq);
        int zzh = zzs(zzq).zzh(i - zzu, i2 == 2 ? 0 : i2, z);
        if (zzh != -1) {
            return zzu + zzh;
        }
        int zzw = zzw(zzq, z);
        while (zzw != -1 && zzs(zzw).zzg()) {
            zzw = zzw(zzw, z);
        }
        if (zzw != -1) {
            return zzu(zzw) + zzs(zzw).zzk(z);
        }
        if (i2 == 2) {
            return zzk(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzi(int i, int i2, boolean z) {
        int zzq = zzq(i);
        int zzu = zzu(zzq);
        int zzi = zzs(zzq).zzi(i - zzu, 0, false);
        if (zzi != -1) {
            return zzu + zzi;
        }
        int zzx = zzx(zzq, false);
        while (zzx != -1 && zzs(zzx).zzg()) {
            zzx = zzx(zzx, false);
        }
        if (zzx != -1) {
            return zzu(zzx) + zzs(zzx).zzj(false);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzj(boolean z) {
        int i = this.zzb;
        if (i != 0) {
            int zzd = z ? this.zzc.zzd() : i - 1;
            while (zzs(zzd).zzg()) {
                zzd = zzx(zzd, z);
                if (zzd == -1) {
                }
            }
            return zzu(zzd) + zzs(zzd).zzj(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzk(boolean z) {
        if (this.zzb != 0) {
            int zze = z ? this.zzc.zze() : 0;
            while (zzs(zze).zzg()) {
                zze = zzw(zze, z);
                if (zze == -1) {
                }
            }
            return zzu(zze) + zzs(zze).zzk(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbd zzo(java.lang.Object obj, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        android.util.Pair pair = (android.util.Pair) obj;
        java.lang.Object obj2 = pair.first;
        java.lang.Object obj3 = pair.second;
        int zzr = zzr(obj2);
        int zzu = zzu(zzr);
        zzs(zzr).zzo(obj3, zzbdVar);
        zzbdVar.zzc += zzu;
        zzbdVar.zzb = obj;
        return zzbdVar;
    }

    protected abstract int zzp(int i);

    protected abstract int zzq(int i);

    protected abstract int zzr(java.lang.Object obj);

    protected abstract com.google.android.gms.internal.ads.zzbf zzs(int i);

    protected abstract int zzt(int i);

    protected abstract int zzu(int i);

    protected abstract java.lang.Object zzv(int i);
}

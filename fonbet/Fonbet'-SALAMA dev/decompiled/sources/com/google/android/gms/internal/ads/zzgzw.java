package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class zzgzw {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i7, int i8);

    public abstract void zze(Object obj, int i7, long j);

    public abstract void zzf(Object obj, int i7, Object obj2);

    public abstract void zzg(Object obj, int i7, zzgvy zzgvyVar);

    public abstract void zzh(Object obj, int i7, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzgze zzgzeVar, int i7) {
        int zzd = zzgzeVar.zzd();
        int i8 = zzd >>> 3;
        int i9 = zzd & 7;
        if (i9 == 0) {
            zzh(obj, i8, zzgzeVar.zzl());
            return true;
        }
        if (i9 == 1) {
            zze(obj, i8, zzgzeVar.zzk());
            return true;
        }
        if (i9 == 2) {
            zzg(obj, i8, zzgzeVar.zzp());
            return true;
        }
        if (i9 != 3) {
            if (i9 == 4) {
                if (i7 != 0) {
                    return false;
                }
                throw new zzgxv("Protocol message end-group tag did not match expected tag.");
            }
            if (i9 != 5) {
                throw new zzgxu("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i8, zzgzeVar.zzf());
            return true;
        }
        Object zzb = zzb();
        int i10 = i8 << 3;
        int i11 = i7 + 1;
        if (i11 >= zza) {
            throw new zzgxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzgzeVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzgzeVar, i11)) {
        }
        if ((i10 | 4) != zzgzeVar.zzd()) {
            throw new zzgxv("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i8, zzc(zzb));
        return true;
    }
}

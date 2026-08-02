package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
abstract class zznb {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i7, int i8);

    public abstract void zzi(Object obj, int i7, long j);

    public abstract void zzj(Object obj, int i7, Object obj2);

    public abstract void zzk(Object obj, int i7, zziv zzivVar);

    public abstract void zzl(Object obj, int i7, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzno zznoVar);

    public abstract void zzq(Object obj, zzno zznoVar);

    public final boolean zzr(Object obj, zzmj zzmjVar) {
        int zzd = zzmjVar.zzd();
        int i7 = zzd >>> 3;
        int i8 = zzd & 7;
        if (i8 == 0) {
            zzl(obj, i7, zzmjVar.zzl());
            return true;
        }
        if (i8 == 1) {
            zzi(obj, i7, zzmjVar.zzk());
            return true;
        }
        if (i8 == 2) {
            zzk(obj, i7, zzmjVar.zzp());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw zzlc.zza();
            }
            zzh(obj, i7, zzmjVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i9 = i7 << 3;
        while (zzmjVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzmjVar)) {
        }
        if ((4 | i9) != zzmjVar.zzd()) {
            throw zzlc.zzb();
        }
        zzg(zzf);
        zzj(obj, i7, zzf);
        return true;
    }

    public abstract boolean zzs(zzmj zzmjVar);
}

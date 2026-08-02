package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzer implements zzfe {
    public static final zzer zza = new zzer();

    private zzer() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length == 0) {
            throw new zzby(4, 3, null);
        }
        zzrj zzf = zzrm.zzf();
        for (zzrr zzrrVar : zzrrVarArr) {
            Object zza2 = zzekVar.zzc().zza(zzrrVar);
            if (zza2 == null) {
                throw new zzby(4, 4, null);
            }
            zzrk zzf2 = zzrl.zzf();
            if (zza2 instanceof Integer) {
                zzf2.zzt(((Number) zza2).intValue());
            } else if (zza2 instanceof Short) {
                zzf2.zzs(((Number) zza2).shortValue());
            } else if (zza2 instanceof Byte) {
                zzf2.zze(zziv.zzk(new byte[]{((Number) zza2).byteValue()}, 0, 1));
            } else if (zza2 instanceof Long) {
                zzf2.zzu(((Number) zza2).longValue());
            } else if (zza2 instanceof Double) {
                zzf2.zzq(((Number) zza2).doubleValue());
            } else if (zza2 instanceof Float) {
                zzf2.zzr(((Number) zza2).floatValue());
            } else if (zza2 instanceof Boolean) {
                zzf2.zzd(((Boolean) zza2).booleanValue());
            } else if (zza2 instanceof Character) {
                zzf2.zzp(zza2.toString());
            } else if (zza2 instanceof String) {
                zzf2.zzv((String) zza2);
            } else {
                zzf2.zzv(zza2.toString());
            }
            zzf.zze((zzrl) zzf2.zzj());
        }
        zzel zzc = zzekVar.zzc();
        byte[] zzd = ((zzrm) zzf.zzj()).zzd();
        zzc.zze(i7, zzhz.zzh().zzi(zzd, 0, zzd.length));
    }
}

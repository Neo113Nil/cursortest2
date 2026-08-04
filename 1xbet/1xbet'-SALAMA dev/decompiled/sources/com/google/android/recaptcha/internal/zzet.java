package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzet implements zzfe {
    public static final zzet zza = new zzet();

    private zzet() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        boolean z4 = true;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        try {
            try {
                if (objZza instanceof String) {
                    objZza = zzekVar.zzh().zza((String) objZza);
                }
                zzel zzelVarZzc = zzekVar.zzc();
                try {
                    zzej.zza(objZza);
                } catch (zzby e7) {
                    if (e7.zzb() == 8 || e7.zzb() == 6) {
                        z4 = false;
                    } else if (e7.zzb() != 47) {
                        throw e7;
                    }
                }
                zzelVarZzc.zze(i7, Boolean.valueOf(z4));
            } catch (Exception e8) {
                throw new zzby(6, 8, e8);
            }
        } catch (zzby e9) {
            throw e9;
        }
    }
}

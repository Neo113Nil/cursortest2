package com.google.android.recaptcha.internal;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzet implements zzfe {
    public static final zzet zza = new zzet();

    private zzet() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        boolean z4 = true;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzekVar.zzh().zza((String) zza2);
                }
                zzel zzc = zzekVar.zzc();
                try {
                    zzej.zza(zza2);
                } catch (zzby e7) {
                    if (e7.zzb() == 8 || e7.zzb() == 6) {
                        z4 = false;
                    } else if (e7.zzb() != 47) {
                        throw e7;
                    }
                }
                zzc.zze(i7, Boolean.valueOf(z4));
            } catch (Exception e8) {
                throw new zzby(6, 8, e8);
            }
        } catch (zzby e9) {
            throw e9;
        }
    }
}

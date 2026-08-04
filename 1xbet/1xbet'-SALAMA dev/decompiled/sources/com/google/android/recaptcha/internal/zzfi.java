package com.google.android.recaptcha.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzfi implements zzfe {
    public static final zzfi zza = new zzfi();

    private zzfi() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Class<?> clsZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            throw new zzby(4, 5, null);
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        try {
            zzekVar.zzc().zze(i7, cls.getField(zzekVar.zzh().zza(str)));
        } catch (Exception e7) {
            throw new zzby(6, 10, e7);
        }
    }
}

package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class zzfl implements zzfe {
    public static final zzfl zza = new zzfl();

    private zzfl() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            throw new zzby(4, 5, null);
        }
        try {
            zzekVar.zzc().zze(i7, field.get(null));
        } catch (Exception e7) {
            throw new zzby(6, 16, e7);
        }
    }
}

package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class zzfu implements zzfe {
    public static final zzfu zza = new zzfu();

    private zzfu() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 3) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Field)) {
            zza2 = null;
        }
        Field field = (Field) zza2;
        if (field == null) {
            throw new zzby(4, 5, null);
        }
        try {
            field.set(zzekVar.zzc().zza(zzrrVarArr[1]), zzekVar.zzc().zza(zzrrVarArr[2]));
        } catch (Exception e7) {
            throw new zzby(6, 11, e7);
        }
    }
}

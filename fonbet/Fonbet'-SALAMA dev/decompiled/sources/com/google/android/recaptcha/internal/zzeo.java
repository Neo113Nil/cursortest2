package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzeo implements zzfe {
    public static final zzeo zza = new zzeo();

    private zzeo() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int intValue = num.intValue();
        try {
            zzekVar.zzc().zze(i7, zza2 instanceof String ? String.valueOf(((String) zza2).charAt(intValue)) : zza2 instanceof List ? ((List) zza2).get(intValue) : Array.get(zza2, intValue));
        } catch (Exception e7) {
            if (!(e7 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzby(4, 23, e7);
            }
            throw new zzby(4, 22, e7);
        }
    }
}

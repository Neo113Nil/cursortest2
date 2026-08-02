package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfb implements zzfe {
    public static final zzfb zza = new zzfb();

    private zzfb() {
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
            if (zza2 instanceof String) {
                zza2 = zzekVar.zzh().zza((String) zza2);
            }
            zzekVar.zzc().zze(i7, Array.newInstance((Class<?>) zzej.zza(zza2), intValue));
        } catch (Exception e7) {
            throw new zzby(6, 21, e7);
        }
    }
}

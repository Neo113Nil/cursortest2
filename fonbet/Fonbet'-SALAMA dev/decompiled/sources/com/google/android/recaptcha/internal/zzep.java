package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzep implements zzfe {
    public static final zzep zza = new zzep();

    private zzep() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 3) {
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
        Object zza4 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != Objects.nonNull(zza4)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            Array.set(zza2, intValue, zza4);
        } catch (Exception e7) {
            if (!(e7 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzby(4, 25, e7);
            }
            throw new zzby(4, 22, e7);
        }
    }
}

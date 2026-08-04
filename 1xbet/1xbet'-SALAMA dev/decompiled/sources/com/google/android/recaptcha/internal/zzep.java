package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzep implements zzfe {
    public static final zzep zza = new zzep();

    private zzep() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 3) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int iIntValue = num.intValue();
        Object objZza3 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != Objects.nonNull(objZza3)) {
            objZza3 = null;
        }
        if (objZza3 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            Array.set(objZza, iIntValue, objZza3);
        } catch (Exception e7) {
            if (!(e7 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzby(4, 25, e7);
            }
            throw new zzby(4, 22, e7);
        }
    }
}

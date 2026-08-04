package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzeo implements zzfe {
    public static final zzeo zza = new zzeo();

    private zzeo() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        Object objValueOf;
        if (zzrrVarArr.length != 2) {
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
        try {
            if (objZza instanceof String) {
                objValueOf = String.valueOf(((String) objZza).charAt(iIntValue));
            } else {
                objValueOf = objZza instanceof List ? ((List) objZza).get(iIntValue) : Array.get(objZza, iIntValue);
            }
            zzekVar.zzc().zze(i7, objValueOf);
        } catch (Exception e7) {
            if (!(e7 instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzby(4, 23, e7);
            }
            throw new zzby(4, 22, e7);
        }
    }
}

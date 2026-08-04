package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzfc implements zzfe {
    public static final zzfc zza = new zzfc();

    private zzfc() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        Object array;
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
            if (objZza instanceof Integer) {
                array = Integer.valueOf(((Number) objZza).intValue() / iIntValue);
            } else {
                if (!(objZza instanceof int[])) {
                    throw new zzby(4, 5, null);
                }
                int[] iArr = (int[]) objZza;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i8 : iArr) {
                    arrayList.add(Integer.valueOf(i8 / iIntValue));
                }
                array = arrayList.toArray(new Integer[0]);
            }
            zzekVar.zzc().zze(i7, array);
        } catch (ArithmeticException e7) {
            throw new zzby(4, 6, e7);
        }
    }
}

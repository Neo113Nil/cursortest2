package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzen implements zzfe {
    public static final zzen zza = new zzen();

    private zzen() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        Object array;
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
        if (zza2 instanceof Integer) {
            array = Integer.valueOf(((Number) zza2).intValue() + intValue);
        } else {
            if (!(zza2 instanceof int[])) {
                throw new zzby(4, 5, null);
            }
            int[] iArr = (int[]) zza2;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i8 : iArr) {
                arrayList.add(Integer.valueOf(i8 + intValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzekVar.zzc().zze(i7, array);
    }
}

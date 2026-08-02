package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public final class zzfa implements zzfe {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        int length = zzrrVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int intValue = num.intValue();
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num2 = (Integer) zza3;
        if (num2 == null) {
            throw new zzby(4, 5, null);
        }
        int intValue2 = num2.intValue();
        Object zza4 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str = (String) zza4;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        String zza5 = zzekVar.zzh().zza(str);
        Object zza6 = zzekVar.zzc().zza(zzrrVarArr[3]);
        if (true != (zza6 instanceof String)) {
            zza6 = null;
        }
        String str2 = (String) zza6;
        if (str2 == null) {
            throw new zzby(4, 5, null);
        }
        String zza7 = zzekVar.zzh().zza(str2);
        Object zza8 = length == 5 ? zzekVar.zzc().zza(zzrrVarArr[4]) : null;
        zzeg zzegVar = new zzeg(intValue2);
        try {
            Class zza9 = zzej.zza(zza5);
            zzekVar.zzc().zze(intValue, Proxy.newProxyInstance(zza9.getClassLoader(), new Class[]{zza9}, new zzeh(zzegVar, zza7, zza8)));
            zzekVar.zzc().zze(i7, zzegVar);
        } catch (Exception e7) {
            throw new zzby(6, 20, e7);
        }
    }
}

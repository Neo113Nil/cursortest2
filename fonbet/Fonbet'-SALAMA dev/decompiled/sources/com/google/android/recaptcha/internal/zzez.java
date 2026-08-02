package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzez implements zzfe {
    public static final zzez zza = new zzez();

    private zzez() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        int i8;
        int length = zzrrVarArr.length;
        if (length != 4 && length != 5) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != Objects.nonNull(zza3)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzby(4, 5, null);
        }
        Object zza4 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (zza4 instanceof String)) {
            zza4 = null;
        }
        String str2 = (String) zza4;
        if (str2 == null) {
            throw new zzby(4, 5, null);
        }
        String zza5 = zzekVar.zzh().zza(str2);
        Object zza6 = zzekVar.zzc().zza(zzrrVarArr[3]);
        if (length == 5) {
            Object zza7 = zzekVar.zzc().zza(zzrrVarArr[4]);
            if (true != (zza7 instanceof Integer)) {
                zza7 = null;
            }
            Integer num = (Integer) zza7;
            if (num == null) {
                throw new zzby(4, 5, null);
            }
            i8 = num.intValue();
        } else {
            i8 = -1;
        }
        try {
            if (zza3 instanceof String) {
                zza3 = zzekVar.zzh().zza((String) zza3);
            }
            Class zza8 = zzej.zza(zza3);
            zzekVar.zzc().zze(i7, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zzef(new zzey(zzekVar, str, i8), zza5, zza6)));
        } catch (Exception e7) {
            throw new zzby(6, 20, e7);
        }
    }
}

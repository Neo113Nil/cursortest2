package com.google.android.recaptcha.internal;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfi implements zzfe {
    public static final zzfi zza = new zzfi();

    private zzfi() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Class<?> zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        try {
            zzekVar.zzc().zze(i7, cls.getField(zzekVar.zzh().zza(str)));
        } catch (Exception e7) {
            throw new zzby(6, 10, e7);
        }
    }
}

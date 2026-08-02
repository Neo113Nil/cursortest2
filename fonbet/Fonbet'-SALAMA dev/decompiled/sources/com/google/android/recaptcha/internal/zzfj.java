package com.google.android.recaptcha.internal;

import g6.AbstractC1158g;
import java.util.Arrays;
import java.util.Objects;
import t6.h;

/* loaded from: classes.dex */
public final class zzfj implements zzfe {
    public static final zzfj zza = new zzfj();

    private zzfj() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        int length = zzrrVarArr.length;
        if (length < 2) {
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
        String zza4 = zzekVar.zzh().zza(str);
        if (h.a(zza4, "forName")) {
            throw new zzby(6, 48, null);
        }
        Class[] zzf = zzekVar.zzc().zzf(AbstractC1158g.w0(zzrrVarArr).subList(2, length));
        try {
            zzekVar.zzc().zze(i7, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e7) {
            throw new zzby(6, 13, e7);
        }
    }
}

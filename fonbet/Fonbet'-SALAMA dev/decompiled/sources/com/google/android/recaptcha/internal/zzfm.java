package com.google.android.recaptcha.internal;

import g6.AbstractC1158g;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfm implements zzfe {
    public static final zzfm zza = new zzfm();

    private zzfm() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        int length = zzrrVarArr.length;
        if (length < 2) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            throw new zzby(4, 5, null);
        }
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        Object[] zzg = zzekVar.zzc().zzg(AbstractC1158g.w0(zzrrVarArr).subList(2, length));
        try {
            zzekVar.zzc().zze(i7, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e7) {
            throw new zzby(6, 15, e7);
        }
    }
}

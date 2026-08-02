package com.google.android.recaptcha.internal;

import g6.AbstractC1158g;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfq implements zzfe {
    public static final zzfq zza = new zzfq();

    private zzfq() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        int length = zzrrVarArr.length;
        if (length == 0) {
            throw new zzby(4, 3, null);
        }
        Constructor<?> zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        Constructor<?> constructor = zza2 instanceof Constructor ? zza2 : zza2.getClass().getConstructor(null);
        Object[] zzg = zzekVar.zzc().zzg(AbstractC1158g.w0(zzrrVarArr).subList(1, length));
        try {
            zzekVar.zzc().zze(i7, constructor.newInstance(Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e7) {
            throw new zzby(6, 14, e7);
        }
    }
}

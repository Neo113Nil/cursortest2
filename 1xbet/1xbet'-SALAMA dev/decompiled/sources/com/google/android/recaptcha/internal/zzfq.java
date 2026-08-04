package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;
import p050g6.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzfq implements zzfe {
    public static final zzfq zza = new zzfq();

    private zzfq() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length == 0) {
            throw new zzby(4, 3, null);
        }
        Constructor<?> constructorZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(constructorZza)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            throw new zzby(4, 5, null);
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(null);
        Object[] objArrZzg = zzekVar.zzc().zzg(g.w0(zzrrVarArr).subList(1, length));
        try {
            zzekVar.zzc().zze(i7, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e7) {
            throw new zzby(6, 14, e7);
        }
    }
}

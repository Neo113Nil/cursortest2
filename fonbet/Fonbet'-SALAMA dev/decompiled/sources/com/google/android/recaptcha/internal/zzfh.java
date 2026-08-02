package com.google.android.recaptcha.internal;

import g6.AbstractC1158g;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfh implements zzfe {
    public static final zzfh zza = new zzfh();

    private zzfh() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        int length = zzrrVarArr.length;
        if (length == 0) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Class)) {
            zza2 = null;
        }
        Class cls = (Class) zza2;
        if (cls == null) {
            throw new zzby(4, 5, null);
        }
        Class[] zzf = zzekVar.zzc().zzf(AbstractC1158g.w0(zzrrVarArr).subList(1, length));
        try {
            zzekVar.zzc().zze(i7, cls.getConstructor((Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e7) {
            throw new zzby(6, 9, e7);
        }
    }
}

package com.google.android.recaptcha.internal;

import java.util.Arrays;
import p050g6.g;

/* JADX INFO: loaded from: classes.dex */
public final class zzfh implements zzfe {
    public static final zzfh zza = new zzfh();

    private zzfh() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length == 0) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof Class)) {
            objZza = null;
        }
        Class cls = (Class) objZza;
        if (cls == null) {
            throw new zzby(4, 5, null);
        }
        Class[] clsArrZzf = zzekVar.zzc().zzf(g.w0(zzrrVarArr).subList(1, length));
        try {
            zzekVar.zzc().zze(i7, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e7) {
            throw new zzby(6, 9, e7);
        }
    }
}

package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Objects;
import p050g6.g;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj implements zzfe {
    public static final zzfj zza = new zzfj();

    private zzfj() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length < 2) {
            throw new zzby(4, 3, null);
        }
        Class<?> clsZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(clsZza)) {
            clsZza = null;
        }
        if (clsZza == null) {
            throw new zzby(4, 5, null);
        }
        Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        String strZza = zzekVar.zzh().zza(str);
        if (h.a(strZza, "forName")) {
            throw new zzby(6, 48, null);
        }
        Class[] clsArrZzf = zzekVar.zzc().zzf(g.w0(zzrrVarArr).subList(2, length));
        try {
            zzekVar.zzc().zze(i7, cls.getMethod(strZza, (Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
        } catch (Exception e7) {
            throw new zzby(6, 13, e7);
        }
    }
}

package com.google.android.recaptcha.internal;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfg implements zzfe {
    public static final zzfg zza = new zzfg();

    private zzfg() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            if (zza2 instanceof String) {
                zza2 = zzekVar.zzh().zza((String) zza2);
            }
            zzekVar.zzc().zze(i7, zzej.zza(zza2));
        } catch (zzby e7) {
            throw e7;
        } catch (Exception e8) {
            throw new zzby(6, 8, e8);
        }
    }
}

package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzev implements zzfe {
    public static final zzev zza = new zzev();

    private zzev() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 2) {
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
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str2 = (String) zza3;
        if (str2 == null) {
            throw new zzby(4, 5, null);
        }
        zzekVar.zzc().zze(i7, str.concat(str2));
    }
}

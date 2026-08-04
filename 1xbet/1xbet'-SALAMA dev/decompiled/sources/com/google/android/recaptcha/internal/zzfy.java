package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzfy implements zzfe {
    public static final zzfy zza = new zzfy();

    private zzfy() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (objZza instanceof int[])) {
            objZza = null;
        }
        int[] iArr = (int[]) objZza;
        if (iArr == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (objZza2 instanceof String)) {
            objZza2 = null;
        }
        String str = (String) objZza2;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        zzel zzelVarZzc = zzekVar.zzc();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i8 : iArr) {
                sb.append(str.charAt(i8));
            }
            zzelVarZzc.zze(i7, sb.toString());
        } catch (Exception e7) {
            throw new zzby(4, 22, e7);
        }
    }
}

package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzfy implements zzfe {
    public static final zzfy zza = new zzfy();

    private zzfy() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof int[])) {
            zza2 = null;
        }
        int[] iArr = (int[]) zza2;
        if (iArr == null) {
            throw new zzby(4, 5, null);
        }
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzby(4, 5, null);
        }
        zzel zzc = zzekVar.zzc();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i8 : iArr) {
                sb.append(str.charAt(i8));
            }
            zzc.zze(i7, sb.toString());
        } catch (Exception e7) {
            throw new zzby(4, 22, e7);
        }
    }
}

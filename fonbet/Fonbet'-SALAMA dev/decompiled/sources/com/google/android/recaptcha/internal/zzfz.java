package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzfz implements zzfe {
    public static final zzfz zza = new zzfz();

    private zzfz() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        int length = zzrrVarArr.length;
        if (length != 2) {
            if (length != 0) {
                throw new zzby(4, 3, null);
            }
            zzekVar.zzc().zze(i7, new zzbt());
            return;
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
        if (true != (zza3 instanceof zzbt)) {
            zza3 = null;
        }
        zzbt zzbtVar = (zzbt) zza3;
        if (zzbtVar == null) {
            throw new zzby(4, 5, null);
        }
        byte[] zzd = zzdn.zza(zzekVar.zzb(), zzbtVar).zzd();
        zzekVar.zzi().zzb(str, zzhz.zzh().zzi(zzd, 0, zzd.length));
    }
}

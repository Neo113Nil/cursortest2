package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzrm extends zzks implements zzly {
    private static final zzrm zzb;
    private zzkz zzd = zzks.zzz();
    private int zze;

    static {
        zzrm zzrmVar = new zzrm();
        zzb = zzrmVar;
        zzks.zzF(zzrm.class, zzrmVar);
    }

    private zzrm() {
    }

    private final void zzJ() {
        zzkz zzkzVar = this.zzd;
        if (zzkzVar.zzc()) {
            return;
        }
        this.zzd = zzks.zzA(zzkzVar);
    }

    public static zzrj zzf() {
        return (zzrj) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzrm zzrmVar, zzrl zzrlVar) {
        zzrlVar.getClass();
        zzrmVar.zzJ();
        zzrmVar.zzd.add(zzrlVar);
    }

    public static /* synthetic */ void zzj(zzrm zzrmVar, Iterable iterable) {
        zzrmVar.zzJ();
        zzig.zzc(iterable, zzrmVar.zzd);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zzd", zzrl.class, "zze"});
        }
        if (i8 == 3) {
            return new zzrm();
        }
        zzqr zzqrVar = null;
        if (i8 == 4) {
            return new zzrj(zzqrVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

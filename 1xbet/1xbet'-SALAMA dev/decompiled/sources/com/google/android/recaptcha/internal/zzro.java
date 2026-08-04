package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzro extends zzks implements zzly {
    private static final zzro zzb;
    private int zzd;
    private String zze = "";
    private zzkx zzf = zzks.zzw();
    private zzky zzg = zzks.zzy();
    private zzqq zzh;

    static {
        zzro zzroVar = new zzro();
        zzb = zzroVar;
        zzks.zzF(zzro.class, zzroVar);
    }

    private zzro() {
    }

    public static zzro zzi(byte[] bArr) {
        return (zzro) zzks.zzv(zzb, bArr);
    }

    public final zzqq zzf() {
        zzqq zzqqVar = this.zzh;
        return zzqqVar == null ? zzqq.zzg() : zzqqVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new zzro();
        }
        zzqr zzqrVar = null;
        if (i8 == 4) {
            return new zzrn(zzqrVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzj() {
        return this.zze;
    }

    public final List zzk() {
        return this.zzg;
    }
}

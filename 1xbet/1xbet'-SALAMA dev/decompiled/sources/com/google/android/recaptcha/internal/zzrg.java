package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzrg extends zzks implements zzly {
    private static final zzrg zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzrg zzrgVar = new zzrg();
        zzb = zzrgVar;
        zzks.zzF(zzrg.class, zzrgVar);
    }

    private zzrg() {
    }

    public static zzrg zzg(byte[] bArr) {
        return (zzrg) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzrs.class});
        }
        if (i8 == 3) {
            return new zzrg();
        }
        zzqr zzqrVar = null;
        if (i8 == 4) {
            return new zzrf(zzqrVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}

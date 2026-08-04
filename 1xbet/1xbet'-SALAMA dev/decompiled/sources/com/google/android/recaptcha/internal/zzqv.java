package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzqv extends zzks implements zzly {
    private static final zzqv zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzqv zzqvVar = new zzqv();
        zzb = zzqvVar;
        zzks.zzF(zzqv.class, zzqvVar);
    }

    private zzqv() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzqv();
        }
        zzqr zzqrVar = null;
        if (i8 == 4) {
            return new zzqu(zzqrVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

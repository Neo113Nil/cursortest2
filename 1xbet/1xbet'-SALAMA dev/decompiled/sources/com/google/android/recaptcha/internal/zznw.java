package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zznw extends zzks implements zzly {
    private static final zznw zzb;
    private int zzd;
    private zzka zze;
    private int zzf;

    static {
        zznw zznwVar = new zznw();
        zzb = zznwVar;
        zzks.zzF(zznw.class, zznwVar);
    }

    private zznw() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zznw();
        }
        zznu zznuVar = null;
        if (i8 == 4) {
            return new zznv(zznuVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

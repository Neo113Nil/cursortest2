package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzjv extends zzks implements zzly {
    private static final zzjv zzb;
    private int zzd;
    private boolean zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzjv zzjvVar = new zzjv();
        zzb = zzjvVar;
        zzks.zzF(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i8 == 2) {
            return new zzmi(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzjv();
        }
        zzji zzjiVar = null;
        if (i8 == 4) {
            return new zzju(zzjiVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzka extends zzks implements zzly {
    private static final zzka zzb;
    private long zzd;
    private int zze;

    static {
        zzka zzkaVar = new zzka();
        zzb = zzkaVar;
        zzks.zzF(zzka.class, zzkaVar);
    }

    private zzka() {
    }

    public static zzjz zzi() {
        return (zzjz) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return new zzmi(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i8 == 3) {
            return new zzka();
        }
        zzjy zzjyVar = null;
        if (i8 == 4) {
            return new zzjz(zzjyVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

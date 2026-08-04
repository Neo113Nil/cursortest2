package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzmz extends zzks implements zzly {
    private static final zzmz zzb;
    private long zzd;
    private int zze;

    static {
        zzmz zzmzVar = new zzmz();
        zzb = zzmzVar;
        zzks.zzF(zzmz.class, zzmzVar);
    }

    private zzmz() {
    }

    public static zzmy zzi() {
        return (zzmy) zzb.zzp();
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
            return new zzmz();
        }
        zzmx zzmxVar = null;
        if (i8 == 4) {
            return new zzmy(zzmxVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

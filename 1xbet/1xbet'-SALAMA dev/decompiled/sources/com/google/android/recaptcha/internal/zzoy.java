package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzoy extends zzks implements zzly {
    private static final zzoy zzb;
    private int zzd;
    private zzka zze;
    private zzmz zzf;
    private zzka zzg;
    private zzmz zzh;

    static {
        zzoy zzoyVar = new zzoy();
        zzb = zzoyVar;
        zzks.zzF(zzoy.class, zzoyVar);
    }

    private zzoy() {
    }

    public static /* synthetic */ void zzJ(zzoy zzoyVar, zzka zzkaVar) {
        zzkaVar.getClass();
        zzoyVar.zzg = zzkaVar;
        zzoyVar.zzd |= 4;
    }

    public static zzox zzf() {
        return (zzox) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzoy zzoyVar, zzka zzkaVar) {
        zzkaVar.getClass();
        zzoyVar.zze = zzkaVar;
        zzoyVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzoy zzoyVar, zzmz zzmzVar) {
        zzmzVar.getClass();
        zzoyVar.zzh = zzmzVar;
        zzoyVar.zzd |= 8;
    }

    public static /* synthetic */ void zzk(zzoy zzoyVar, zzmz zzmzVar) {
        zzmzVar.getClass();
        zzoyVar.zzf = zzmzVar;
        zzoyVar.zzd |= 2;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new zzoy();
        }
        zzow zzowVar = null;
        if (i8 == 4) {
            return new zzox(zzowVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzod extends zzks implements zzly {
    private static final zzod zzb;
    private int zzf;
    private int zzi;
    private int zzj;
    private String zzd = "";
    private String zze = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzod zzodVar = new zzod();
        zzb = zzodVar;
        zzks.zzF(zzod.class, zzodVar);
    }

    private zzod() {
    }

    public static /* synthetic */ void zzJ(zzod zzodVar, String str) {
        str.getClass();
        zzodVar.zzd = str;
    }

    public static zzoc zzg() {
        return (zzoc) zzb.zzp();
    }

    public static zzod zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zzd", "zzf", "zzh", "zzi", "zze", "zzg", "zzj"});
        }
        if (i8 == 3) {
            return new zzod();
        }
        zzob zzobVar = null;
        if (i8 == 4) {
            return new zzoc(zzobVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzk() {
        return this.zzd;
    }
}

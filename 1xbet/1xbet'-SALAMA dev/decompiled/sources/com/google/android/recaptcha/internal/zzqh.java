package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzqh extends zzks implements zzly {
    private static final zzqh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqh zzqhVar = new zzqh();
        zzb = zzqhVar;
        zzks.zzF(zzqh.class, zzqhVar);
    }

    private zzqh() {
    }

    public final String zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzqh();
        }
        zzqb zzqbVar = null;
        if (i8 == 4) {
            return new zzqg(zzqbVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzf;
    }
}

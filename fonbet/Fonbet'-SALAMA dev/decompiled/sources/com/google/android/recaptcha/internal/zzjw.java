package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzjw extends zzks implements zzly {
    private static final zzjw zzb;
    private int zzd;
    private long zzg;
    private long zzh;
    private double zzi;
    private byte zzl = 2;
    private zzkz zze = zzmh.zze();
    private String zzf = "";
    private zziv zzj = zziv.zzb;
    private String zzk = "";

    static {
        zzjw zzjwVar = new zzjw();
        zzb = zzjwVar;
        zzks.zzF(zzjw.class, zzjwVar);
    }

    private zzjw() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i8 == 2) {
            return new zzmi(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzjv.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new zzjw();
        }
        zzji zzjiVar = null;
        if (i8 == 4) {
            return new zzjt(zzjiVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}

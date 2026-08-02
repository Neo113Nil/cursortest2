package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzqx extends zzks implements zzly {
    private static final zzqx zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzqx zzqxVar = new zzqx();
        zzb = zzqxVar;
        zzks.zzF(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw zzf() {
        return (zzqw) zzb.zzp();
    }

    public static /* synthetic */ void zzi(zzqx zzqxVar, String str) {
        str.getClass();
        zzqxVar.zzd = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i8 == 3) {
            return new zzqx();
        }
        zzqr zzqrVar = null;
        if (i8 == 4) {
            return new zzqw(zzqrVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

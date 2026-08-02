package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzpm extends zzks implements zzly {
    private static final zzpm zzb;
    private int zzd;
    private String zze = "";

    static {
        zzpm zzpmVar = new zzpm();
        zzb = zzpmVar;
        zzks.zzF(zzpm.class, zzpmVar);
    }

    private zzpm() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i8 == 3) {
            return new zzpm();
        }
        zzpk zzpkVar = null;
        if (i8 == 4) {
            return new zzpl(zzpkVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzpo extends zzks implements zzly {
    private static final zzpo zzb;
    private zziv zzd = zziv.zzb;

    static {
        zzpo zzpoVar = new zzpo();
        zzb = zzpoVar;
        zzks.zzF(zzpo.class, zzpoVar);
    }

    private zzpo() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zzd"});
        }
        if (i8 == 3) {
            return new zzpo();
        }
        zzpk zzpkVar = null;
        if (i8 == 4) {
            return new zzpn(zzpkVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

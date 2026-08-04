package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzoj extends zzks implements zzly {
    private static final zzoj zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzoj zzojVar = new zzoj();
        zzb = zzojVar;
        zzks.zzF(zzoj.class, zzojVar);
    }

    private zzoj() {
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
            return new zzoj();
        }
        zzoh zzohVar = null;
        if (i8 == 4) {
            return new zzoi(zzohVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }
}

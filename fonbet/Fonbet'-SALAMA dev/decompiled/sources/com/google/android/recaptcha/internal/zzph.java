package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes.dex */
public final class zzph extends zzks implements zzly {
    private static final zzph zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzph zzphVar = new zzph();
        zzb = zzphVar;
        zzks.zzF(zzph.class, zzphVar);
    }

    private zzph() {
    }

    public static zzph zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        if (i8 == 3) {
            return new zzph();
        }
        zzpf zzpfVar = null;
        if (i8 == 4) {
            return new zzpg(zzpfVar);
        }
        if (i8 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}
